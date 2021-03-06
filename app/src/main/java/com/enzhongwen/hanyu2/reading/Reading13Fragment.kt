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
                    binding.pinyinS1.text = "Zh??xi?? sh?? d??u sh?? x??n de."
                    binding.pinyinS2.text = "T??ngxu??men d??u xi?? h??nz??."
                    binding.pinyinS3.text = "W??men d??u x??hu??n l??y??u."
                    binding.pinyinS4.text = "Ch??n l??osh?? h?? w??ng l??osh?? d??u ji??o zh??ngw??n."
                    binding.pinyinS5.text = "W?? h?? m??imei d??u ch?? j??d??n."
                    binding.pinyinS6.text = "B??ba h?? m??m?? d??u k??n di??nsh??."
                    binding.pinyinS7.text = "N?? j?? su??le?"
                    binding.pinyinS8.text = "W?? q?? su??le."
                    binding.pinyinHeading.text = "W??men D??u Sh?? Xu??sh??ng"
                    binding.pinyinPassage.text = "          W?? h?? Xi??oh??ng, Xi??oqi??ng d??u sh?? y?? ni??nj?? ??r b??n de xu??sh??ng. J??nni??n w??men d??u q?? su??le. W?? h?? Xi??oh??ng x??hu??n d??nghu?? pi??n, Xi??oqi??ng x??hu??n z??qi??, zh??um?? t?? h?? g??g?? ch??ngchang t?? z??qi??."
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