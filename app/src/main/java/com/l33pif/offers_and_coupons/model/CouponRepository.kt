package com.l33pif.offers_and_coupons.model

import androidx.lifecycle.MutableLiveData

interface CouponRepository {
    fun getCoupuns(): MutableLiveData<List<Coupon>>
    fun callCoupunsAPI()

}