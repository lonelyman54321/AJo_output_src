/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.customviews.widgets;

import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.OfferDetails;

public interface LoyaltyCardInfoView$LoyaltyCardInfoViewClickListener {
    public void onLoyaltyDeSelected(LpStoredCardBalance var1);

    public void onLoyaltySelected(LpStoredCardBalance var1);

    public void onOfferClicked(OfferDetails var1);

    public void onRegisterMobileClicked(LpStoredCardBalance var1);

    public void showLoyaltyInfoFragment();
}

