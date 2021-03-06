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
                    binding.pinyinS1.text = "W?? de y??nj??ng sh?? h??i de, t??uf?? y??sh?? h??i de."
                    binding.pinyinS2.text = "Xi??ohu?? ch?? m??ntou, xi??om??ng y?? ch?? m??ntou."
                    binding.pinyinS3.text = "W?? y??u h??ndu?? qi??nb??, t?? y??y??u h??ndu?? qi??nb??."
                    binding.pinyinS4.text = "D??d?? x??hu??n xi??ngji??o, y?? x??hu??n ch??ngzi."
                    binding.pinyinS5.text = "W?? ??i b??ba, y?? ??i m??m??."
                    binding.pinyinS6.text = "G??g?? ch??ng d?? l??nqi??, y?? ch??ng d?? w??ngqi??."
                    binding.pinyinHeading.text = "Xi??oh??ng Y?? Xu?? Zh??ngw??n"
                    binding.pinyinPassage.text = "          Xi??oh??ng sh?? Xi??ohu?? de t??ngxu??, y??sh?? Xi??ohu?? de h??o p??ngy??u. Xi??ohu?? xu?? zh??ngw??n, Xi??oh??ng y?? xu?? zh??ngw??n. T??men de ??ih??o y?? y??y??ng, Xi??ohu?? x??hu??n d??nghu?? pi??n, Xi??oh??ng y?? x??hu??n. Zh??um?? t??men ch??ngchang k??n d??nghu?? pi??n."
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