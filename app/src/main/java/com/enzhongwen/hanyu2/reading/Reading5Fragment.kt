package com.enzhongwen.hanyu2.reading

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import com.enzhongwen.hanyu2.R
import com.enzhongwen.hanyu2.databinding.FragmentReading5Binding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class Reading5Fragment: Fragment() {

    lateinit var binding: FragmentReading5Binding

    var a = 0

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
        binding = FragmentReading5Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.reading_menu,menu)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.listen.setOnClickListener {
            val a = MediaPlayer.create(requireContext(), R.raw.l5_s)
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
        binding.pinyinS1.text = "Xiǎoqiáng: Zǎoshang nǐ qù nǎ'erle?"
        binding.pinyinS2.text = "Xiǎo huá: Wǒ qù gōngyuánle."
        binding.pinyinS3.text = "Xiǎoqiáng: Nàgè gōngyuán dà ma?"
        binding.pinyinS4.text = "Xiǎo huá: Gōngyuán hěn dà, hěn piàoliang."
        binding.pinyinS5.text = "Xiǎoqiáng: Nà'er yǒu shé me?"
        binding.pinyinS6.text = "Xiǎo huá: Yǒu shù, yǒu huā, yǒu yīgè hěn dà de hú, húshàng yǒu yīzuò báisè de qiáo."
        binding.pinyinS7.text = "Xiǎoqiáng: Rén duō ma?"
        binding.pinyinS8.text = "Xiǎo huá: Fēicháng duō, gōngyuán hěn rènào."
        binding.pinyinHeading.text = "Zhège Gōngyuán Zhēn Rènào"
        binding.pinyinPassage.text = "Jīntiān tiānqì fēicháng hǎo,\n tiān hěn lán, fēng hěn xiǎo, \n cǎo hěn lǜ, shù hěn gāo.\n Xiǎo gǒu tiào, xiǎo niǎo jiào, \n xiǎopéngyǒu a, zhēn bù shǎo, \n zhège gōngyuán zhēn rènào!"
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