/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.payment.fragment;

import android.os.Bundle;
import com.ril.ajio.payment.fragment.d;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import kotlin.jvm.internal.Intrinsics;

public final class d$a {
    public static d a(vp1_2 vp1_22, int n3, String string2, String string3, String string4, boolean bl2, LpStoredCardBalance lpStoredCardBalance) {
        Intrinsics.checkNotNullParameter(vp1_22, "clickListener");
        d d2 = new d();
        d2.q = vp1_22;
        vp1_22 = new Bundle();
        String string5 = "viewType";
        vp1_22.putInt(string5, n3);
        vp1_22.putString("cardNumber", string4);
        vp1_22.putString("mobileNumber", string2);
        vp1_22.putString("transactionId", string3);
        String string6 = "isFromAddCard";
        vp1_22.putBoolean(string6, bl2);
        if (lpStoredCardBalance != null) {
            string6 = "LpStoredCardBalance";
            vp1_22.putSerializable(string6, lpStoredCardBalance);
        }
        d2.setArguments((Bundle)vp1_22);
        return d2;
    }
}

