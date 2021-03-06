package com.enzhongwen.hanyu2.reading

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import com.enzhongwen.hanyu2.R
import com.enzhongwen.hanyu2.databinding.FragmentReading2Binding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class Reading2Fragment: Fragment() {

    lateinit var binding: FragmentReading2Binding

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

        binding = FragmentReading2Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.reading_menu,menu)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.listen.setOnClickListener {
            val a = MediaPlayer.create(requireContext(), R.raw.l2_s)
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
            binding.pinyinS1.text = "Hu?? h??n pi??oliang."
            binding.pinyinS2.text = "F??ng h??n xi??o."
            binding.pinyinS3.text = "W??men h??n g??ox??ng."
            binding.pinyinS4.text = "J??nti??n de ti??nq?? h??n h??o."
            binding.pinyinS5.text = "B??ba de ji??o h??n d??."
            binding.pinyinS6.text = "W?? de z??di??n h??n x??n."
            binding.pinyinS7.text = "T?? de z??di??n h??n ji??."
            binding.pinyinHeading.text = "J??nti??n De Ti??nq?? H??n H??o"
            binding.pinyinPassage.text = "          J??nti??n de ti??nq?? h??n h??o, ti??n h??n l??n, y??n h??n b??i. Z??oshang w??men q?? xu??xi??o, xu??xi??o h??n d??. W??men de ji??osh?? h??nx??n, h??n pi??oliang."
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