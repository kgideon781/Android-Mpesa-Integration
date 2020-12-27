package com.giddy.mpesa_.interfaces;

import com.giddy.mpesa_.Mpesa;
import com.giddy.mpesa_.utils.Pair;

/**
 * Created by miles on 18/11/2017.
 */

public interface AuthListener {
    public void onAuthError(Pair<Integer, String> result);
    public void onAuthSuccess();
}
