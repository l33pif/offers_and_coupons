package com.l33pif.offers_and_coupons.model

import androidx.databinding.BaseObservable
import androidx.lifecycle.MutableLiveData

class CouponObservable: BaseObservable() {

    private var couponRepository: CouponRepository = CouponRepositoryImpl()
    //Repositorio
    fun callCoupons(){
        couponRepository.callCoupunsAPI()
    }

    //ViewModel
    fun getCoupons() : MutableLiveData<List<Coupon>> {
        return couponRepository.getCoupuns()
    }
}