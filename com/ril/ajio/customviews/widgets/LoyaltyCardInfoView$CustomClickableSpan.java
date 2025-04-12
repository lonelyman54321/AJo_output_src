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
import kotlin.jvm.internal.Intrinsics;

public final class LoyaltyCardInfoView$CustomClickableSpan
extends ClickableSpan {
    final /* synthetic */ LoyaltyCardInfoView this$0;

    public LoyaltyCardInfoView$CustomClickableSpan(LoyaltyCardInfoView loyaltyCardInfoView) {
        this.this$0 = loyaltyCardInfoView;
    }

    public void onClick(View object) {
        String string2 = "widget";
        Intrinsics.checkNotNullParameter(object, string2);
        object = LoyaltyCardInfoView.access$getCardClickListener$p(this.this$0);
        if (object != null && (object = LoyaltyCardInfoView.access$getCardClickListener$p(this.this$0)) != null) {
            object.showLoyaltyInfoFragment();
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        textPaint.setUnderlineText(false);
        int n3 = Color.parseColor((String)"#176d93");
        textPaint.setColor(n3);
    }
}

