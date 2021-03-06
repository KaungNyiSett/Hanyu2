package com.enzhongwen.hanyu2.reading

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import com.enzhongwen.hanyu2.R
import com.enzhongwen.hanyu2.databinding.FragmentReading10Binding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class Reading10Fragment: Fragment() {

    lateinit var binding: FragmentReading10Binding

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
        binding = FragmentReading10Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.reading_menu,menu)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.listen.setOnClickListener {
            val a = MediaPlayer.create(requireContext(), R.raw.l10_s)
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
                    binding.pinyinS1.text = "Xi??ohu??: Zh??ge sh??b??o sh?? sh??i de?"
                    binding.pinyinS2.text = "Xi??oqi??ng: Sh?? xi??o h??ng de."
                    binding.pinyinS3.text = "Xi??ohu??: B??sh??, t?? de sh??b??o sh?? hu??ng de."
                    binding.pinyinS4.text = "Xi??oqi??ng: Sh??b??o li y??u sh??nme?"
                    binding.pinyinS5.text = "Xi??ohu??: Sh??b??o li y??u y?? b??n sh?? h?? s??n g?? b??nzi."
                    binding.pinyinS6.text = "Xi??oqi??ng: Sh?? sh??ng y??u m??ngz?? ma?"
                    binding.pinyinS7.text = "Xi??ohu??: Y??u. A, zh??ge sh??b??o sh?? L?? Xi??ol??ng de."
                    binding.pinyinHeading.text = "W??men De Ji??osh??"
                    binding.pinyinPassage.text = "          W?? sh?? y?? ni??nj?? ??r b??n de xu??sh??ng. Zh?? sh?? w??men de ji??osh??. Ji??osh?? li y??u sh??li?? zh??ng zhu??zi, sh??li?? b?? y??zi h?? y??g?? sh??ji??. Ji??osh?? qi??nmi??n sh?? h??ib??n, ji??osh?? h??umi??n de qi??ng sh??ng sh?? y?? zh??ng zh??nggu?? d??t??. W??men de ji??osh?? h??n g??nj??ng."
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
                    binding.pinyinHeading.text = null
                    binding.pinyinPassage.text = null
                    item.setIcon(R.drawable.white_a)
                }
            }
        }


        return super.onOptionsItemSelected(item)
    }

}