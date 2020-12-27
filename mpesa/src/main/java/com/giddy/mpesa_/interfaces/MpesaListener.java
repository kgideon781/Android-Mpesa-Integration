package com.giddy.mpesa_.interfaces;

import com.giddy.mpesa_.utils.Pair;

/**
 * Created by miles on 19/11/2017.
 */

public interface MpesaListener {
    public void onMpesaError(Pair<Integer, String> result);
    public void onMpesaSuccess(String MerchantRequestID, String CheckoutRequestID, String CustomerMessage);
}
