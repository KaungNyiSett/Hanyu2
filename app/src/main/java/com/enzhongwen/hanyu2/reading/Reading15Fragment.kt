package com.enzhongwen.hanyu2.reading

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import com.enzhongwen.hanyu2.R
import com.enzhongwen.hanyu2.databinding.FragmentReading15Binding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class Reading15Fragment: Fragment() {

    lateinit var binding: FragmentReading15Binding

    var a = 0

    var mInterstitialAd: InterstitialAd? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
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
        binding = FragmentReading15Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.listen.setOnClickListener {
            val a = MediaPlayer.create(requireContext(), R.raw.l15_s)
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
                    binding.pinyinS1.text = "Xiǎohuá: Nǐ cháng qù dòngwùyuán ma?"
                    binding.pinyinS2.text = "Xiǎohóng: Wǒ cháng qù, wǒ cháng hé bàba māmā yīqǐ qù."
                    binding.pinyinS3.text = "Xiǎohuá: Nǐ xǐhuān shénme dòngwù?"
                    binding.pinyinS4.text = "Xiǎohóng: Wǒ xǐhuān hóuzi."
                    binding.pinyinS5.text = "Xiǎohuá: Wǒ yě xǐhuān hóuzi, hóuzi hěn kě\'ài, yě hěn cōngmíng."
                    binding.pinyinS6.text = "Xiǎohóng: Nǐ yě cháng qù dòngwùyuán ma?"
                    binding.pinyinS7.text = "Xiǎohuá: Wǒ bù cháng qù, wǒ bàba māmā tài mángle."
                    binding.pinyinS8.text = "Xiǎohóng: Nà míngtiān wǒmen yīqǐ qù ba?"
                    binding.pinyinS9.text = "Xiǎohuá: Hǎo a, míngtiān jiàn!"
                    binding.pinyinS10.text = "Xiǎohóng: Míngtiān jiàn!"
                    binding.pinyinHeading.text = "Xiàkè La"
                    binding.pinyinPassage.text = "          Xiàkè la, xiàkè la, cāochǎng shàng, zhēn rènào! Yǒu de pǎo, yǒu de tiào, tiāntiān duànliàn shēntǐ hǎo!"
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
                    binding.pinyinS10.text = null
                    binding.pinyinHeading.text = null
                    binding.pinyinPassage.text = null
                    item.setIcon(R.drawable.white_a)
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }

}