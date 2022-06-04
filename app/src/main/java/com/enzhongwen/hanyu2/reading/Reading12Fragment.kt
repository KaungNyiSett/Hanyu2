package com.enzhongwen.hanyu2.reading

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import com.enzhongwen.hanyu2.R
import com.enzhongwen.hanyu2.databinding.FragmentReading12Binding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class Reading12Fragment: Fragment() {

    private var a = 0

    var mInterstitialAd: InterstitialAd? = null

    lateinit var binding: FragmentReading12Binding

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
        binding = FragmentReading12Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.listen.setOnClickListener {
            val a = MediaPlayer.create(requireContext(), R.raw.l12_s)
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
                    binding.pinyinS1.text = "Wǒ de yǎnjīng shì hēi de, tóufǎ yěshì hēi de."
                    binding.pinyinS2.text = "Xiǎohuá chī mántou, xiǎomíng yě chī mántou."
                    binding.pinyinS3.text = "Wǒ yǒu hěnduō qiānbǐ, tā yěyǒu hěnduō qiānbǐ."
                    binding.pinyinS4.text = "Dìdì xǐhuān xiāngjiāo, yě xǐhuān chéngzi."
                    binding.pinyinS5.text = "Wǒ ài bàba, yě ài māmā."
                    binding.pinyinS6.text = "Gēgē cháng dǎ lánqiú, yě cháng dǎ wǎngqiú."
                    binding.pinyinHeading.text = "Xiǎohóng Yě Xué Zhōngwén"
                    binding.pinyinPassage.text = "          Xiǎohóng shì Xiǎohuá de tóngxué, yěshì Xiǎohuá de hǎo péngyǒu. Xiǎohuá xué zhōngwén, Xiǎohóng yě xué zhōngwén. Tāmen de àihào yě yīyàng, Xiǎohuá xǐhuān dònghuà piàn, Xiǎohóng yě xǐhuān. Zhōumò tāmen chángchang kàn dònghuà piàn."
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