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
import com.ril.ajio.customviews.widgets.PesdkAddCardLoyaltyView;
import kotlin.jvm.internal.Intrinsics;

public final class PesdkAddCardLoyaltyView$CustomClickableSpan
extends ClickableSpan {
    final /* synthetic */ PesdkAddCardLoyaltyView this$0;

    public PesdkAddCardLoyaltyView$CustomClickableSpan(PesdkAddCardLoyaltyView pesdkAddCardLoyaltyView) {
        this.this$0 = pesdkAddCardLoyaltyView;
    }

    public void onClick(View object) {
        String string2 = "widget";
        Intrinsics.checkNotNullParameter(object, string2);
        object = PesdkAddCardLoyaltyView.access$getCardClickListener$p(this.this$0);
        if (object != null && (object = PesdkAddCardLoyaltyView.access$getCardClickListener$p(this.this$0)) != null) {
            object.showLoyaltyInfoFragment();
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

