/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View$MeasureSpec
 *  android.widget.ImageView
 */
package androidx.preference.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.preference.R$styleable;

public class PreferenceImageView
extends ImageView {
    public int a;
    public int b;

    public PreferenceImageView(Context context) {
        this(context, null);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int n4;
        this.a = n4 = -1 >>> 1;
        this.b = n4;
        int[] nArray = R$styleable.PreferenceImageView;
        context = context.obtainStyledAttributes(attributeSet, nArray, n3, 0);
        int n7 = R$styleable.PreferenceImageView_maxWidth;
        n7 = context.getDimensionPixelSize(n7, n4);
        this.setMaxWidth(n7);
        n7 = R$styleable.PreferenceImageView_maxHeight;
        n7 = context.getDimensionPixelSize(n7, n4);
        this.setMaxHeight(n7);
        context.recycle();
    }

    public int getMaxHeight() {
        return this.b;
    }

    public int getMaxWidth() {
        return this.a;
    }

    public final void onMeasure(int n3, int n4) {
        int n7;
        int n8;
        int n10 = View.MeasureSpec.getMode((int)n3);
        int n14 = -1 >>> 1;
        int n15 = -1 << -1;
        if (n10 == n15 || n10 == 0) {
            n8 = View.MeasureSpec.getSize((int)n3);
            n7 = this.getMaxWidth();
            if (n7 != n14 && (n7 < n8 || n10 == 0)) {
                n3 = View.MeasureSpec.makeMeasureSpec((int)n7, (int)n15);
            }
        }
        if ((n10 = View.MeasureSpec.getMode((int)n4)) == n15 || n10 == 0) {
            n8 = View.MeasureSpec.getSize((int)n4);
            n7 = this.getMaxHeight();
            if (n7 != n14 && (n7 < n8 || n10 == 0)) {
                n4 = View.MeasureSpec.makeMeasureSpec((int)n7, (int)n15);
            }
        }
        super.onMeasure(n3, n4);
    }

    public void setMaxHeight(int n3) {
        this.b = n3;
        super.setMaxHeight(n3);
    }

    public void setMaxWidth(int n3) {
        this.a = n3;
        super.setMaxWidth(n3);
    }
}

