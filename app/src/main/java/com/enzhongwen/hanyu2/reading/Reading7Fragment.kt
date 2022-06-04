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
                    binding.pinyinS1.text = "Bàba de píxié shì hēi de."
                    binding.pinyinS2.text = "Bàba de yīfú shì hóng de."
                    binding.pinyinS3.text = "Bàba de kùzi shì lán de."
                    binding.pinyinS4.text = "Zhè tiáo bái qúnzi shì mèimei de."
                    binding.pinyinS5.text = "Zhè tiáo huáng kùzi shì xiǎoqiáng de."
                    binding.pinyinS6.text = "Zhè shuāng hēi píxié shì bàba de."
                    binding.pinyinS7.text = "Nǐ de qúnzi shì shénme yánsè de?"
                    binding.pinyinS8.text = "Bàba de píxié shì shénme yánsè shì de?"
                    binding.pinyinS9.text = "Xiǎoqiáng de màozi shì shénme yánsè de?"
                    binding.pinyinHeading.text = "Xiǎohuá De Yīfú Shì Hóng De"
                    binding.pinyinPassage.text = "          Mèimei wèn Xiǎohuá: “Gēgē, zhè jiàn bái yīfú shì nǐ de ma?” Xiǎohuá shuō: “Bùshì wǒ de, shì Xiǎomíng de. Nà jiàn shì wǒ de, wǒ de yīfú shì hóng de.”"
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