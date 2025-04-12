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
import com.ril.ajio.services.data.Payment.OfferDetails;
import kotlin.jvm.internal.Intrinsics;

public final class PesdkLoyaltyCardInfoView$BankOfferClickableSpan
extends ClickableSpan {
    final /* synthetic */ PesdkLoyaltyCardInfoView this$0;

    public PesdkLoyaltyCardInfoView$BankOfferClickableSpan(PesdkLoyaltyCardInfoView pesdkLoyaltyCardInfoView) {
        this.this$0 = pesdkLoyaltyCardInfoView;
    }

    public void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "widget");
        Object object2 = object.getTag();
        boolean bl2 = object2 instanceof OfferDetails;
        if (bl2) {
            object = object.getTag();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Payment.OfferDetails");
            object = (OfferDetails)object;
            object2 = PesdkLoyaltyCardInfoView.access$getCardClickListener$p(this.this$0);
            if (object2 != null) {
                object2.onOfferClicked((OfferDetails)object);
            }
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

