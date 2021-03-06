package com.enzhongwen.hanyu2.reading

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import com.enzhongwen.hanyu2.R
import com.enzhongwen.hanyu2.databinding.FragmentReading7Binding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class Reading7Fragment: Fragment() {

    var a = 0

    var mInterstitialAd: InterstitialAd? = null

    lateinit var binding: FragmentReading7Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        var adRequest = AdRequest.Builder().build()
        InterstitialAd.load(requireContext(),"ca-app-pub-5467193675789833/1436189844", adRequest, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                Log.d("TAG", adError?.message)
                mInterstitialAd = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {
                Log.d("TAG", "Ad was loaded.")
                mInterstitialAd = interstitialAd
                if (mInterstitialAd != null) {
                    mInterstitialAd?.show(requireActivity())
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.")
                }
            }
        })
        binding = FragmentReading7Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.reading_menu,menu)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.listen.setOnClickListener {
            val a = MediaPlayer.create(requireContext(), R.raw.l7_s)
            a.start()
            a.setOnCompletionListener {
                a.release()
            }
        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.pinyin_on_off ->{
                if(a == 0){

                    item.setIcon(R.drawable.white_a_crossed)
                    binding.pinyinS1.text = "B??ba de p??xi?? sh?? h??i de."
                    binding.pinyinS2.text = "B??ba de y??f?? sh?? h??ng de."
                    binding.pinyinS3.text = "B??ba de k??zi sh?? l??n de."
                    binding.pinyinS4.text = "Zh?? ti??o b??i q??nzi sh?? m??imei de."
                    binding.pinyinS5.text = "Zh?? ti??o hu??ng k??zi sh?? xi??oqi??ng de."
                    binding.pinyinS6.text = "Zh?? shu??ng h??i p??xi?? sh?? b??ba de."
                    binding.pinyinS7.text = "N?? de q??nzi sh?? sh??nme y??ns?? de?"
                    binding.pinyinS8.text = "B??ba de p??xi?? sh?? sh??nme y??ns?? sh?? de?"
                    binding.pinyinS9.text = "Xi??oqi??ng de m??ozi sh?? sh??nme y??ns?? de?"
                    binding.pinyinHeading.text = "Xi??ohu?? De Y??f?? Sh?? H??ng De"
                    binding.pinyinPassage.text = "          M??imei w??n Xi??ohu??: ???G??g??, zh?? ji??n b??i y??f?? sh?? n?? de ma???? Xi??ohu?? shu??: ???B??sh?? w?? de, sh?? Xi??om??ng de. N?? ji??n sh?? w?? de, w?? de y??f?? sh?? h??ng de.???"
                    a = 1
                }else{
                    a = 0
                    binding.pinyinS1.text = null
                    binding.pinyinS2.text = null
                    binding.pinyinS3.text = null
                    binding.pinyinS4.text = null
                    binding.pinyinS5.text = null
                    binding.pinyinS6.text = null
                    binding.pinyinS7.text = null
                    binding.pinyinS8.text = null
                    binding.pinyinS9.text = null
                    binding.pinyinHeading.text = null
                    binding.pinyinPassage.text = null
                    item.setIcon(R.drawable.white_a)
                }
            }
        }


        return super.onOptionsItemSelected(item)
    }


}