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
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import kotlin.jvm.internal.Intrinsics;

public final class LoyaltyCardInfoView$RegisterClickableSpan
extends ClickableSpan {
    final /* synthetic */ LoyaltyCardInfoView this$0;

    public LoyaltyCardInfoView$RegisterClickableSpan(LoyaltyCardInfoView loyaltyCardInfoView) {
        this.this$0 = loyaltyCardInfoView;
    }

    public void onClick(View object) {
        Object object2 = "widget";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = LoyaltyCardInfoView.access$getLpStoredCardBalance$p(this.this$0);
        if (object != null && (object = LoyaltyCardInfoView.access$getCardClickListener$p(this.this$0)) != null) {
            object2 = LoyaltyCardInfoView.access$getLpStoredCardBalance$p(this.this$0);
            Intrinsics.checkNotNull(object2);
            object.onRegisterMobileClicked((LpStoredCardBalance)object2);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        textPaint.setUnderlineText(false);
        int n3 = Color.parseColor((String)"#176d93");
        textPaint.setColor(n3);
    }
}

