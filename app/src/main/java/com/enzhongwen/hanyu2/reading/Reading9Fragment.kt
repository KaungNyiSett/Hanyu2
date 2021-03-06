package com.enzhongwen.hanyu2.reading

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import com.enzhongwen.hanyu2.R
import com.enzhongwen.hanyu2.databinding.FragmentReading9Binding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class Reading9Fragment: Fragment() {

    var a = 0

    lateinit var binding: FragmentReading9Binding

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
        binding = FragmentReading9Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.reading_menu,menu)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.listen.setOnClickListener {
            val a = MediaPlayer.create(requireContext(), R.raw.l9_s)
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
                    binding.pinyinS1.text = "Xi??ohu?? de zu??bi??n sh?? m??m??."
                    binding.pinyinS2.text = "Xi??ohu?? de y??ubi??n sh?? b??ba."
                    binding.pinyinS3.text = "Xu??xi??o du??mi??n sh?? y??nh??ng."
                    binding.pinyinS4.text = "Y??nh??ng du??mi??n sh?? xu??xi??o."
                    binding.pinyinS5.text = "M??l?? z??i xi??o hu?? ji?? qi??nmi??n."
                    binding.pinyinS6.text = "D??ngw??yu??n z??i xi??o hu?? ji?? h??umi??n."
                    binding.pinyinHeading.text = "Xu??xi??o Qi??nmi??n Sh?? M??l??"
                    binding.pinyinPassage.text = "          Zh?? sh?? Xi??ohu?? de xu??xi??o. Xu??xi??o qi??nmi??n sh?? m??l??, h??umi??n sh?? g??ngyu??n. Ch??osh?? z??i xu??xi??o de zu??bi??n, y??nh??ng h?? y??uj?? z??i xu??xi??o de y??ubi??n, xu?? ji??o du??mi??n sh?? sh??nme d??f??ng? Sh?? y??ul?? ch??ng. Y??ul?? ch??ng de m??nk??u y??u y?? g?? ch??zh??n."
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