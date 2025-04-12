/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.skydoves.balloon.vectortext;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.skydoves.balloon.R$styleable;
import kotlin.jvm.internal.Intrinsics;

public final class VectorTextView
extends AppCompatTextView {
    public ia3_2 a;

    public VectorTextView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, null);
    }

    public VectorTextView(Context context, AttributeSet attributeSet) {
        Context context2 = context;
        Object object = attributeSet;
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(context, (String)object2);
        super(context, attributeSet);
        if (attributeSet != null) {
            object2 = R$styleable.VectorTextView;
            context2 = context.obtainStyledAttributes(attributeSet, (int[])object2);
            Intrinsics.checkNotNullExpressionValue(context2, "context.obtainStyledAttr\u2026styleable.VectorTextView)");
            int n3 = R$styleable.VectorTextView_balloon_drawableStart;
            int n4 = -1 << -1;
            Integer n7 = zn0_2.e(context2.getResourceId(n3, n4));
            n3 = R$styleable.VectorTextView_balloon_drawableEnd;
            Integer n8 = zn0_2.e(context2.getResourceId(n3, n4));
            n3 = R$styleable.VectorTextView_balloon_drawableBottom;
            Integer n10 = zn0_2.e(context2.getResourceId(n3, n4));
            n3 = R$styleable.VectorTextView_balloon_drawableTop;
            Integer n14 = zn0_2.e(context2.getResourceId(n3, n4));
            n3 = R$styleable.VectorTextView_balloon_drawablePadding;
            Integer n15 = zn0_2.e(context2.getResourceId(n3, n4));
            n3 = R$styleable.VectorTextView_balloon_drawableTintColor;
            Integer n16 = zn0_2.e(context2.getColor(n3, n4));
            n3 = R$styleable.VectorTextView_balloon_drawableWidth;
            Integer n17 = zn0_2.e(context2.getResourceId(n3, n4));
            n3 = R$styleable.VectorTextView_balloon_drawableHeight;
            Integer n18 = zn0_2.e(context2.getResourceId(n3, n4));
            n3 = R$styleable.VectorTextView_balloon_drawableSquareSize;
            n3 = context2.getResourceId(n3, n4);
            Integer n19 = zn0_2.e(n3);
            int n20 = 8176;
            object2 = object;
            Integer n21 = n7;
            n7 = n8;
            n8 = n10;
            n10 = n14;
            n14 = null;
            super(n21, n7, n8, n10, null, null, null, null, n15, n16, n17, n18, n19, n20);
            object2 = this;
            this.setDrawableTextViewParams((ia3_2)object);
            context2.recycle();
        } else {
            object2 = this;
        }
    }

    public final ia3_2 getDrawableTextViewParams() {
        return this.a;
    }

    public final void setDrawableTextViewParams(ia3_2 ia3_22) {
        if (ia3_22 != null) {
            jm3_0.a(this, ia3_22);
        } else {
            ia3_22 = null;
        }
        this.a = ia3_22;
    }
}

