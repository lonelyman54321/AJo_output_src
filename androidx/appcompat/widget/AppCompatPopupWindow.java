/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.widget.PopupWindow
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import androidx.appcompat.R$styleable;

class AppCompatPopupWindow
extends PopupWindow {
    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.a(context, attributeSet, n3, 0);
    }

    public final void a(Context object, AttributeSet attributeSet, int n3, int n4) {
        int[] nArray = R$styleable.PopupWindow;
        object = Tn3.f((Context)object, attributeSet, nArray, n3, n4);
        TypedArray typedArray = ((Tn3)object).b;
        int bl2 = R$styleable.PopupWindow_overlapAnchor;
        boolean bl3 = typedArray.hasValue(bl2);
        if (bl3) {
            int n7 = R$styleable.PopupWindow_overlapAnchor;
            n4 = 0;
            boolean bl4 = typedArray.getBoolean(n7, false);
            Nw2.a(this, bl4);
        }
        int n8 = R$styleable.PopupWindow_android_popupBackground;
        attributeSet = ((Tn3)object).b(n8);
        this.setBackgroundDrawable((Drawable)attributeSet);
        ((Tn3)object).g();
    }
}

