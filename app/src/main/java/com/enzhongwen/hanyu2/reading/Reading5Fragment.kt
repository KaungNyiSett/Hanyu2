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
        binding.pinyinS1.text = "Xi??oqi??ng: Z??oshang n?? q?? n??'erle?"
        binding.pinyinS2.text = "Xi??o hu??: W?? q?? g??ngyu??nle."
        binding.pinyinS3.text = "Xi??oqi??ng: N??g?? g??ngyu??n d?? ma?"
        binding.pinyinS4.text = "Xi??o hu??: G??ngyu??n h??n d??, h??n pi??oliang."
        binding.pinyinS5.text = "Xi??oqi??ng: N??'er y??u sh?? me?"
        binding.pinyinS6.text = "Xi??o hu??: Y??u sh??, y??u hu??, y??u y??g?? h??n d?? de h??, h??sh??ng y??u y??zu?? b??is?? de qi??o."
        binding.pinyinS7.text = "Xi??oqi??ng: R??n du?? ma?"
        binding.pinyinS8.text = "Xi??o hu??: F??ich??ng du??, g??ngyu??n h??n r??n??o."
        binding.pinyinHeading.text = "Zh??ge G??ngyu??n Zh??n R??n??o"
        binding.pinyinPassage.text = "J??nti??n ti??nq?? f??ich??ng h??o,\n ti??n h??n l??n, f??ng h??n xi??o, \n c??o h??n l??, sh?? h??n g??o.\n Xi??o g??u ti??o, xi??o ni??o ji??o, \n xi??op??ngy??u a, zh??n b?? sh??o, \n zh??ge g??ngyu??n zh??n r??n??o!"
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