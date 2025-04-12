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
import com.ril.ajio.customviews.widgets.AjioTextView;

class AjioTextView$1
extends ClickableSpan {
    final /* synthetic */ AjioTextView this$0;
    final /* synthetic */ ClickableSpan val$clickableSpan;
    final /* synthetic */ int val$color;
    final /* synthetic */ boolean val$underline;

    public AjioTextView$1(AjioTextView ajioTextView, ClickableSpan clickableSpan, int n3, boolean bl2) {
        this.this$0 = ajioTextView;
        this.val$clickableSpan = clickableSpan;
        this.val$color = n3;
        this.val$underline = bl2;
    }

    public void onClick(View view) {
        ClickableSpan clickableSpan = this.val$clickableSpan;
        if (clickableSpan != null) {
            clickableSpan.onClick(view);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        int bl2 = this.val$color;
        textPaint.setColor(bl2);
        boolean bl3 = this.val$underline;
        textPaint.setUnderlineText(bl3);
    }
}

