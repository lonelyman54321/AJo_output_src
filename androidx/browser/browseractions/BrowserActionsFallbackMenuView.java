/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View$MeasureSpec
 *  android.widget.LinearLayout
 */
package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.browser.R$dimen;

public class BrowserActionsFallbackMenuView
extends LinearLayout {
    public final int a;
    public final int b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        context = this.getResources();
        int n4 = R$dimen.browser_actions_context_menu_min_padding;
        this.a = n3 = context.getDimensionPixelOffset(n4);
        context = this.getResources();
        n4 = R$dimen.browser_actions_context_menu_max_width;
        this.b = n3 = context.getDimensionPixelOffset(n4);
    }

    public final void onMeasure(int n3, int n4) {
        n3 = this.getResources().getDisplayMetrics().widthPixels;
        int n7 = this.a * 2;
        n3 -= n7;
        n7 = this.b;
        n3 = View.MeasureSpec.makeMeasureSpec((int)Math.min(n3, n7), (int)0x40000000);
        super.onMeasure(n3, n4);
    }
}

