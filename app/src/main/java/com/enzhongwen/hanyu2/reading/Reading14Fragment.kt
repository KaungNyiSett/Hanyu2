package com.enzhongwen.hanyu2.reading

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import com.enzhongwen.hanyu2.R
import com.enzhongwen.hanyu2.databinding.FragmentReading14Binding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class Reading14Fragment: Fragment() {

    lateinit var binding: FragmentReading14Binding

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
                Log.d("TAG", "Ad failed to load")
                mInterstitialAd = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {
                Log.d("TAG", "Ad was loaded.")
                mInterstitialAd = interstitialAd
                    mInterstitialAd?.show(requireActivity())
            }
        })
        binding = FragmentReading14Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.listen.setOnClickListener {
            val a = MediaPlayer.create(requireContext(), R.raw.l14_s)
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
                    binding.pinyinS1.text = "Zǎoshang tāmen yīqǐ shàngxué."
                    binding.pinyinS2.text = "Xiàwǔ tāmen yīqǐ huí jiā."
                    binding.pinyinS3.text = "Míngtiān tāmen yīqǐ qù shūdiàn."
                    binding.pinyinS4.text = "Zhè jiàn yīfú tài dàle!"
                    binding.pinyinS5.text = "Zhè shuāng xié tài guìle!"
                    binding.pinyinS6.text = "Zhè dào tí tài nánle!"
                    binding.pinyinHeading.text = "Tāmen Yīqǐ Shàngxué"
                    binding.pinyinPassage.text = "Xiǎohuá hé Xiǎohóng shì línjū. Tāmen chángcháng yīqǐ xuéxí, yīqǐ zuò yóuxì. Míngtiān shì zhōumò, Xiǎohuá duì Xiǎohóng shuō: “Míngtiān wǒmen yīqǐ qù yóulè chǎng ba!” Xiǎohóng shuō: “Tài hǎole!”"
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