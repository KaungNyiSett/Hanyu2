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
                    binding.pinyinS1.text = "Xiǎohuá: Zhège shūbāo shì shéi de?"
                    binding.pinyinS2.text = "Xiǎoqiáng: Shì xiǎo hóng de."
                    binding.pinyinS3.text = "Xiǎohuá: Bùshì, tā de shūbāo shì huáng de."
                    binding.pinyinS4.text = "Xiǎoqiáng: Shūbāo li yǒu shénme?"
                    binding.pinyinS5.text = "Xiǎohuá: Shūbāo li yǒu yī běn shū hé sān gè běnzi."
                    binding.pinyinS6.text = "Xiǎoqiáng: Shū shàng yǒu míngzì ma?"
                    binding.pinyinS7.text = "Xiǎohuá: Yǒu. A, zhège shūbāo shì Lǐ Xiǎolóng de."
                    binding.pinyinHeading.text = "Wǒmen De Jiàoshì"
                    binding.pinyinPassage.text = "          Wǒ shì yī niánjí èr bān de xuéshēng. Zhè shì wǒmen de jiàoshì. Jiàoshì li yǒu shíliù zhāng zhuōzi, shíliù bǎ yǐzi hé yīgè shūjià. Jiàoshì qiánmiàn shì hēibǎn, jiàoshì hòumiàn de qiáng shàng shì yī zhāng zhōngguó dìtú. Wǒmen de jiàoshì hěn gānjìng."
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