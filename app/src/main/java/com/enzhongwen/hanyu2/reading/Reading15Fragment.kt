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
                    binding.pinyinS1.text = "Xi??ohu??: N?? ch??ng q?? d??ngw??yu??n ma?"
                    binding.pinyinS2.text = "Xi??oh??ng: W?? ch??ng q??, w?? ch??ng h?? b??ba m??m?? y??q?? q??."
                    binding.pinyinS3.text = "Xi??ohu??: N?? x??hu??n sh??nme d??ngw???"
                    binding.pinyinS4.text = "Xi??oh??ng: W?? x??hu??n h??uzi."
                    binding.pinyinS5.text = "Xi??ohu??: W?? y?? x??hu??n h??uzi, h??uzi h??n k??\'??i, y?? h??n c??ngm??ng."
                    binding.pinyinS6.text = "Xi??oh??ng: N?? y?? ch??ng q?? d??ngw??yu??n ma?"
                    binding.pinyinS7.text = "Xi??ohu??: W?? b?? ch??ng q??, w?? b??ba m??m?? t??i m??ngle."
                    binding.pinyinS8.text = "Xi??oh??ng: N?? m??ngti??n w??men y??q?? q?? ba?"
                    binding.pinyinS9.text = "Xi??ohu??: H??o a, m??ngti??n ji??n!"
                    binding.pinyinS10.text = "Xi??oh??ng: M??ngti??n ji??n!"
                    binding.pinyinHeading.text = "Xi??k?? La"
                    binding.pinyinPassage.text = "          Xi??k?? la, xi??k?? la, c??och??ng sh??ng, zh??n r??n??o! Y??u de p??o, y??u de ti??o, ti??nti??n du??nli??n sh??nt?? h??o!"
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