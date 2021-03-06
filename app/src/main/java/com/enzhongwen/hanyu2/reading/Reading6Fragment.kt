package com.enzhongwen.hanyu2.reading

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import com.enzhongwen.hanyu2.R
import com.enzhongwen.hanyu2.databinding.FragmentReading6Binding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class Reading6Fragment: Fragment() {

    lateinit var binding: FragmentReading6Binding

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
        binding = FragmentReading6Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.reading_menu,menu)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.listen.setOnClickListener {
            val a = MediaPlayer.create(requireContext(), R.raw.l6_s)
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
        binding.pinyinS1.text = "N??g?? b??izi sh?? m??imei de."
        binding.pinyinS2.text = "Zh?? shu??ng ku??izi sh?? w?? de."
        binding.pinyinS3.text = "N?? t??i di??nn??o sh?? sh??i de?"
        binding.pinyinS4.text = "Zh?? b?? y??shu?? sh?? sh??i de?"
        binding.pinyinS5.text = "N??ge w??n sh?? n?? de?"
        binding.pinyinS6.text = "N??ge p??nzi sh?? ji??ji?? de?"
        binding.pinyinHeading.text = "Zh?? Shu??ng Ku??izi Sh?? W?? De"
        binding.pinyinPassage.text = "          Ch??f??n la! Zh?? shu??ng ku??izi sh?? w?? de, n?? shu??ng sh?? d??d?? de, n?? shu??ng sh?? m??imei de? M??imei b??y??ng ku??izi, t?? y??ng sh??ozi."
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