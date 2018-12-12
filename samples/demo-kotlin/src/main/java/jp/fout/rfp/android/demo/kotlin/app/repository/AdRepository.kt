package jp.fout.rfp.android.demo.kotlin.app.repository

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import jp.fout.rfp.android.sdk.instream.RFPInstreamAdPlacer
import jp.fout.rfp.android.sdk.instream.RFPInstreamAdPlacerListener
import jp.fout.rfp.android.sdk.model.RFPInstreamInfoModel
import timber.log.Timber

class AdRepository(private val placer: RFPInstreamAdPlacer) {
    fun getAds(): LiveData<List<RFPInstreamInfoModel>> {
        val data = MutableLiveData<List<RFPInstreamInfoModel>>()

        placer.setAdListener(object : RFPInstreamAdPlacerListener {
            override fun onAdsLoaded(items: MutableList<out RFPInstreamInfoModel>?) {
                Timber.d("item.size = %d", items?.size)
                data.postValue(items)
            }

            override fun onAdsLoadedFail(errorString: String?) {
            }

            override fun onAdMainImageLoaded(imageUrl: String?) {
            }

            override fun onAdImageLoadedFail(imageUrl: String?, errorString: String?) {
            }

            override fun onAdClicked(redirectUrl: String?) {
            }
        })
        placer.loadAd()

        return data
    }
}
