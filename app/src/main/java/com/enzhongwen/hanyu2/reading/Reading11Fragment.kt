package com.enzhongwen.hanyu2.reading

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import com.enzhongwen.hanyu2.R
import com.enzhongwen.hanyu2.databinding.FragmentReading11Binding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class Reading11Fragment: Fragment() {

    lateinit var binding: FragmentReading11Binding

    var mInterstitialAd: InterstitialAd? = null

    private var a = 0

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
        binding = FragmentReading11Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.listen.setOnClickListener {
            val a = MediaPlayer.create(requireContext(), R.raw.l11_s)
            a.start()
            a.setOnCompletionListener {
                a.release()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.reading_menu,menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.pinyin_on_off ->{
                if(a == 0){
                    item.setIcon(R.drawable.white_a_crossed)
                    binding.pinyinS1.text = "G??g?? ch??ng d?? l??nqi??."
                    binding.pinyinS2.text = "L??osh?? ch??ng bi??oy??ng w??men."
                    binding.pinyinS3.text = "Y??ye ch??ngchang h?? ch??."
                    binding.pinyinS4.text = "N??inai ch??ngchang shu?? h??ny??."
                    binding.pinyinS5.text = "B??ba b?? ch??ng h??ji??."
                    binding.pinyinS6.text = "M??m?? b?? ch??ng zu?? d??ti??."
                    binding.pinyinHeading.text = "Xi??ohu?? Ch??ng Q?? T??sh??gu??n"
                    binding.pinyinPassage.text = "Xu??xi??o y??u y?? g?? t??sh??gu??n, n??\'er y??u h??ndu?? sh??. Zh??ngw??, Xi??ohu?? ch??ngchang q?? t??sh??gu??n. T?? ch??ng k??n m??nhu??, b?? ch??ng k??n b??ozh??."
                    a = 1
                }else{
                    a = 0
                    binding.pinyinS1.text = null
                    binding.pinyinS2.text = null
                    binding.pinyinS3.text = null
                    binding.pinyinS4.text = null
                    binding.pinyinS5.text = null
                    binding.pinyinS6.text = null
                    binding.pinyinHeading.text = null
                    binding.pinyinPassage.text = null
                    item.setIcon(R.drawable.white_a)
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }

}