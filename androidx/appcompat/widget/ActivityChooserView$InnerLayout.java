/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.widget.LinearLayout
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ActivityChooserView$InnerLayout
extends LinearLayout {
    public static final int[] a = new int[]{16842964};

    public ActivityChooserView$InnerLayout(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        int[] nArray = a;
        object = Tn3.e((Context)object, attributeSet, nArray);
        attributeSet = ((Tn3)object).b(0);
        this.setBackgroundDrawable((Drawable)attributeSet);
        ((Tn3)object).g();
    }
}

