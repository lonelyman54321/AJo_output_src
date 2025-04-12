/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.ril.ajio.home.eosspromotion.view;

import android.view.View;
import com.ril.ajio.home.eosspromotion.view.CouponsPointsComponentView;

public final class CouponsPointsComponentView$a
implements View.OnClickListener {
    public final /* synthetic */ CouponsPointsComponentView a;

    public CouponsPointsComponentView$a(CouponsPointsComponentView couponsPointsComponentView) {
        this.a = couponsPointsComponentView;
    }

    public final void onClick(View view) {
        this.a.a.p2("COUPON_DISCOUNT_LOGIN_REQUEST");
    }
}

