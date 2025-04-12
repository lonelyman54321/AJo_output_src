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
import com.ril.ajio.services.data.Payment.OfferDetails;
import kotlin.jvm.internal.Intrinsics;

public final class AddCardLoyaltyView$BankOfferClickableSpan
extends ClickableSpan {
    final /* synthetic */ AddCardLoyaltyView this$0;

    public AddCardLoyaltyView$BankOfferClickableSpan(AddCardLoyaltyView addCardLoyaltyView) {
        this.this$0 = addCardLoyaltyView;
    }

    public void onClick(View object) {
        Object object2 = "widget";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = AddCardLoyaltyView.access$getCardClickListener$p(this.this$0);
        if (object != null) {
            object2 = AddCardLoyaltyView.access$getOfferDetail$p(this.this$0);
            object.onOfferClicked((OfferDetails)object2);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        textPaint.setUnderlineText(false);
        int n3 = Color.parseColor((String)"#176d93");
        textPaint.setColor(n3);
    }
}

