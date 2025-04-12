/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 *  android.text.style.ClickableSpan
 *  android.view.View
 */
package com.ril.ajio.customviews.widgets;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ril.ajio.R$color;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import kotlin.jvm.internal.Intrinsics;

public final class PesdkLoyaltyCardInfoView$RegisterClickableSpan
extends ClickableSpan {
    final /* synthetic */ PesdkLoyaltyCardInfoView this$0;

    public PesdkLoyaltyCardInfoView$RegisterClickableSpan(PesdkLoyaltyCardInfoView pesdkLoyaltyCardInfoView) {
        this.this$0 = pesdkLoyaltyCardInfoView;
    }

    public void onClick(View object) {
        Object object2 = "widget";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = PesdkLoyaltyCardInfoView.access$getLpStoredCardBalance$p(this.this$0);
        if (object != null && (object = PesdkLoyaltyCardInfoView.access$getCardClickListener$p(this.this$0)) != null) {
            object2 = PesdkLoyaltyCardInfoView.access$getLpStoredCardBalance$p(this.this$0);
            Intrinsics.checkNotNull(object2);
            object.onRegisterMobileClicked((LpStoredCardBalance)object2);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        String string2 = "ds";
        Intrinsics.checkNotNullParameter(textPaint, string2);
        int n3 = og1_1.b();
        if (n3 != 0) {
            textPaint.setUnderlineText(true);
            n3 = hv3_0.m(R$color.pesdk_lux_color_3);
            textPaint.setColor(n3);
        } else {
            string2 = null;
            textPaint.setUnderlineText(false);
            n3 = hv3_0.m(R$color.pesdk_color_3);
            textPaint.setColor(n3);
        }
    }
}

