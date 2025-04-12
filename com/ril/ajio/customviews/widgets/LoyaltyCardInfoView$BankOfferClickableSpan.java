/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.text.TextPaint
 *  android.text.style.ClickableSpan
 *  android.view.View
 */
package com.ril.ajio.customviews.widgets;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ril.ajio.customviews.widgets.LoyaltyCardInfoView;
import com.ril.ajio.services.data.Payment.OfferDetails;
import kotlin.jvm.internal.Intrinsics;

public final class LoyaltyCardInfoView$BankOfferClickableSpan
extends ClickableSpan {
    final /* synthetic */ LoyaltyCardInfoView this$0;

    public LoyaltyCardInfoView$BankOfferClickableSpan(LoyaltyCardInfoView loyaltyCardInfoView) {
        this.this$0 = loyaltyCardInfoView;
    }

    public void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "widget");
        Object object2 = object.getTag();
        boolean bl2 = object2 instanceof OfferDetails;
        if (bl2) {
            object = object.getTag();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Payment.OfferDetails");
            object = (OfferDetails)object;
            object2 = LoyaltyCardInfoView.access$getCardClickListener$p(this.this$0);
            if (object2 != null) {
                object2.onOfferClicked((OfferDetails)object);
            }
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        textPaint.setUnderlineText(false);
        int n3 = Color.parseColor((String)"#176d93");
        textPaint.setColor(n3);
    }
}

