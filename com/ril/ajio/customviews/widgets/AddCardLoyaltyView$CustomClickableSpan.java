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
import com.ril.ajio.customviews.widgets.AddCardLoyaltyView;
import kotlin.jvm.internal.Intrinsics;

public final class AddCardLoyaltyView$CustomClickableSpan
extends ClickableSpan {
    final /* synthetic */ AddCardLoyaltyView this$0;

    public AddCardLoyaltyView$CustomClickableSpan(AddCardLoyaltyView addCardLoyaltyView) {
        this.this$0 = addCardLoyaltyView;
    }

    public void onClick(View object) {
        String string2 = "widget";
        Intrinsics.checkNotNullParameter(object, string2);
        object = AddCardLoyaltyView.access$getCardClickListener$p(this.this$0);
        if (object != null && (object = AddCardLoyaltyView.access$getCardClickListener$p(this.this$0)) != null) {
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

