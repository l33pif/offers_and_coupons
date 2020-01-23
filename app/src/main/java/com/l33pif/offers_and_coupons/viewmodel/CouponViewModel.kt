package com.l33pif.offers_and_coupons.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.l33pif.offers_and_coupons.R
import com.l33pif.offers_and_coupons.model.Coupon
import com.l33pif.offers_and_coupons.model.CouponObservable
import com.l33pif.offers_and_coupons.view.RecyclerCouponsAdapter

class CouponViewModel: ViewModel() {

    private var couponObservable: CouponObservable = CouponObservable()
    private var recyclerCouponsAdapter: RecyclerCouponsAdapter? = null

    fun callCoupons(){
        couponObservable.callCoupons()
    }

    fun getCoupons() : MutableLiveData<List<Coupon>> {
        return couponObservable.getCoupons()
    }

    fun setCouponsInRecyclerAdapter(coupons: List<Coupon>){
        recyclerCouponsAdapter?.setCounponsList(coupons)
        recyclerCouponsAdapter?.notifyDataSetChanged()
    }

    fun getRecyclerCouponsAdapter(): RecyclerCouponsAdapter?{
        recyclerCouponsAdapter = RecyclerCouponsAdapter(this, R.layout.card_coupon)
        return recyclerCouponsAdapter
    }

    fun getCoupunAt(position: Int): Coupon?{
        var coupons: List<Coupon>? = couponObservable.getCoupons().value
        return coupons?.get(position)
    }

}