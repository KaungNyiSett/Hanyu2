package com.enzhongwen.hanyu2.reading

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import com.enzhongwen.hanyu2.R
import com.enzhongwen.hanyu2.databinding.FragmentReading8Binding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class Reading8Fragment: Fragment() {

    lateinit var binding: FragmentReading8Binding

    private var a = 0

    var mInterstitialAd: InterstitialAd? = null

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
        binding = FragmentReading8Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.reading_menu,menu)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.listen.setOnClickListener {
            val a = MediaPlayer.create(requireContext(), R.raw.l8_s)
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
                    binding.pinyinS1.text = "Sh??b??o li y??us??n b??n sh??."
                    binding.pinyinS2.text = "Ji??osh?? li y??u y??ku??i h??ib??n."
                    binding.pinyinS3.text = "B??ng??ngsh?? li y??uy?? b?? di??nhu??."
                    binding.pinyinS4.text = "Y??gu?? li y??u h??ndu?? y??f??."
                    binding.pinyinS5.text = "B??ngxi??ng li y??u h??ndu?? y??nli??o."
                    binding.pinyinS6.text = "H??zi li y??u h??ndu?? b??ngg??n."
                    binding.pinyinHeading.text = "Sh??b??o Li Y??u Sh?? Me"
                    binding.pinyinPassage.text = "          L??osh?? w??n Xi??ohu??: ???N?? de sh??b??o li y??u sh??n me???? Xi??ohu?? shu??: ???W?? de sh??b??o li y??u s??n b??n sh??, li??ng g?? b??nzi, w?? zh?? b??, y?? b?? ch??zi h?? y?? ku??i xi??ngp??.???"
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