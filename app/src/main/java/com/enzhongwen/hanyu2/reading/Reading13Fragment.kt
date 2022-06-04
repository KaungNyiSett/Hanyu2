package com.enzhongwen.hanyu2.reading

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import com.enzhongwen.hanyu2.R
import com.enzhongwen.hanyu2.databinding.FragmentReading13Binding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class Reading13Fragment: Fragment() {

    lateinit var binding: FragmentReading13Binding

    var mInterstitialAd: InterstitialAd? = null

    var a = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {setHasOptionsMenu(true)

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
        binding = FragmentReading13Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.listen.setOnClickListener {
            val a = MediaPlayer.create(requireContext(), R.raw.l13_s)
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
                    binding.pinyinS1.text = "Zhèxiē shū dōu shì xīn de."
                    binding.pinyinS2.text = "Tóngxuémen dōu xiě hànzì."
                    binding.pinyinS3.text = "Wǒmen dōu xǐhuān lǚyóu."
                    binding.pinyinS4.text = "Chén lǎoshī hé wáng lǎoshī dōu jiào zhōngwén."
                    binding.pinyinS5.text = "Wǒ hé mèimei dōu chī jīdàn."
                    binding.pinyinS6.text = "Bàba hé māmā dōu kàn diànshì."
                    binding.pinyinS7.text = "Nǐ jǐ suìle?"
                    binding.pinyinS8.text = "Wǒ qī suìle."
                    binding.pinyinHeading.text = "Wǒmen Dōu Shì Xuéshēng"
                    binding.pinyinPassage.text = "          Wǒ hé Xiǎohóng, Xiǎoqiáng dōu shì yī niánjí èr bān de xuéshēng. Jīnnián wǒmen dōu qī suìle. Wǒ hé Xiǎohóng xǐhuān dònghuà piàn, Xiǎoqiáng xǐhuān zúqiú, zhōumò tā hé gēgē chángchang tī zúqiú."
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
                    binding.pinyinHeading.text = null
                    binding.pinyinPassage.text = null
                    item.setIcon(R.drawable.white_a)
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }


}