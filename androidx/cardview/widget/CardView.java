/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.Color
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.View$MeasureSpec
 *  android.widget.FrameLayout
 */
package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.R$attr;
import androidx.cardview.R$color;
import androidx.cardview.R$style;
import androidx.cardview.R$styleable;
import androidx.cardview.widget.CardView$a;

public class CardView
extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = new int[]{0x1010031};
    private static final NL IMPL;
    private final ML mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    static {
        ll_0 ll_02 = new Object();
        IMPL = ll_02;
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.cardViewStyle;
        this(context, attributeSet, n3);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public CardView(Context context, AttributeSet attributeSet, int object) {
        super(context, attributeSet, object);
        int n3;
        int n4;
        void var8_26;
        float f5;
        float f6;
        int[] nArray;
        Rect rect;
        Rect rect2;
        this.mContentPadding = rect2 = new Rect();
        this.mShadowBounds = rect = new Rect();
        CardView$a cardView$a = new CardView$a(this);
        this.mCardViewDelegate = cardView$a;
        int[] nArray2 = R$styleable.CardView;
        int n7 = R$style.CardView;
        attributeSet = context.obtainStyledAttributes(attributeSet, nArray2, object, n7);
        int n8 = R$styleable.CardView_cardBackgroundColor;
        boolean bl2 = attributeSet.hasValue(n8);
        Object var5_22 = null;
        if (bl2) {
            int n10 = R$styleable.CardView_cardBackgroundColor;
            ColorStateList colorStateList = attributeSet.getColorStateList(n10);
        } else {
            void var3_11;
            Context context2 = this.getContext();
            nArray = COLOR_BACKGROUND_ATTR;
            TypedArray typedArray = context2.obtainStyledAttributes(nArray);
            n7 = typedArray.getColor(0, 0);
            typedArray.recycle();
            float[] fArray = new float[3];
            Color.colorToHSV((int)n7, (float[])fArray);
            f6 = fArray[2];
            n7 = 0x3F000000;
            f5 = 0.5f;
            float f7 = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
            if (f7 > 0) {
                Resources resources = this.getResources();
                n7 = R$color.cardview_light_background;
                int n14 = resources.getColor(n7);
            } else {
                Resources resources = this.getResources();
                n7 = R$color.cardview_dark_background;
                int n15 = resources.getColor(n7);
            }
            ColorStateList colorStateList = ColorStateList.valueOf((int)var3_11);
        }
        void var9_37 = var8_26;
        int n16 = R$styleable.CardView_cardCornerRadius;
        f5 = 0.0f;
        nArray = null;
        float f8 = attributeSet.getDimension(n16, 0.0f);
        int n17 = R$styleable.CardView_cardElevation;
        float f11 = attributeSet.getDimension(n17, 0.0f);
        int n18 = R$styleable.CardView_cardMaxElevation;
        f6 = attributeSet.getDimension(n18, 0.0f);
        n7 = R$styleable.CardView_cardUseCompatPadding;
        n7 = (int)(attributeSet.getBoolean(n7, false) ? 1 : 0);
        this.mCompatPadding = n7;
        n7 = R$styleable.CardView_cardPreventCornerOverlap;
        n7 = (int)(attributeSet.getBoolean(n7, true) ? 1 : 0);
        this.mPreventCornerOverlap = n7;
        n7 = R$styleable.CardView_contentPadding;
        n7 = attributeSet.getDimensionPixelSize(n7, 0);
        int n19 = R$styleable.CardView_contentPaddingLeft;
        rect2.left = n19 = attributeSet.getDimensionPixelSize(n19, n7);
        n19 = R$styleable.CardView_contentPaddingTop;
        rect2.top = n19 = attributeSet.getDimensionPixelSize(n19, n7);
        n19 = R$styleable.CardView_contentPaddingRight;
        rect2.right = n19 = attributeSet.getDimensionPixelSize(n19, n7);
        n19 = R$styleable.CardView_contentPaddingBottom;
        rect2.bottom = n7 = attributeSet.getDimensionPixelSize(n19, n7);
        float f12 = f11 == f6 ? 0 : (f11 > f6 ? 1 : -1);
        float f14 = f12 > 0 ? f11 : f6;
        int n20 = R$styleable.CardView_android_minWidth;
        this.mUserSetMinWidth = n4 = attributeSet.getDimensionPixelSize(n20, 0);
        int n21 = R$styleable.CardView_android_minHeight;
        this.mUserSetMinHeight = n3 = attributeSet.getDimensionPixelSize(n21, 0);
        attributeSet.recycle();
        IMPL.g(cardView$a, context, (ColorStateList)var9_37, f8, f11, f14);
    }

    public static /* synthetic */ void access$001(CardView cardView, int n3, int n4, int n7, int n8) {
        super.setPadding(n3, n4, n7, n8);
    }

    public static /* synthetic */ void access$101(CardView cardView, int n3) {
        super.setMinimumWidth(n3);
    }

    public static /* synthetic */ void access$201(CardView cardView, int n3) {
        super.setMinimumHeight(n3);
    }

    public ColorStateList getCardBackgroundColor() {
        NL nL = IMPL;
        ML mL = this.mCardViewDelegate;
        return nL.l(mL);
    }

    public float getCardElevation() {
        NL nL = IMPL;
        ML mL = this.mCardViewDelegate;
        return nL.e(mL);
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        NL nL = IMPL;
        ML mL = this.mCardViewDelegate;
        return nL.n(mL);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        NL nL = IMPL;
        ML mL = this.mCardViewDelegate;
        return nL.k(mL);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    public void onMeasure(int n3, int n4) {
        NL nL = IMPL;
        int n7 = nL instanceof ll_0;
        if (n7 == 0) {
            n7 = View.MeasureSpec.getMode((int)n3);
            int n8 = 0x40000000;
            int n10 = -1 << -1;
            if (n7 == n10 || n7 == n8) {
                ML mL = this.mCardViewDelegate;
                float f5 = nL.j(mL);
                double d2 = Math.ceil(f5);
                int n14 = (int)d2;
                n3 = View.MeasureSpec.getSize((int)n3);
                n3 = View.MeasureSpec.makeMeasureSpec((int)Math.max(n14, n3), (int)n7);
            }
            n7 = View.MeasureSpec.getMode((int)n4);
            if (n7 == n10 || n7 == n8) {
                ML mL = this.mCardViewDelegate;
                float f6 = nL.c(mL);
                double d5 = Math.ceil(f6);
                int n15 = (int)d5;
                n4 = View.MeasureSpec.getSize((int)n4);
                n4 = View.MeasureSpec.makeMeasureSpec((int)Math.max(n15, n4), (int)n7);
            }
            super.onMeasure(n3, n4);
        } else {
            super.onMeasure(n3, n4);
        }
    }

    public void setCardBackgroundColor(int n3) {
        NL nL = IMPL;
        ML mL = this.mCardViewDelegate;
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        nL.f(mL, colorStateList);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        NL nL = IMPL;
        ML mL = this.mCardViewDelegate;
        nL.f(mL, colorStateList);
    }

    public void setCardElevation(float f5) {
        NL nL = IMPL;
        ML mL = this.mCardViewDelegate;
        nL.m(mL, f5);
    }

    public void setContentPadding(int n3, int n4, int n7, int n8) {
        this.mContentPadding.set(n3, n4, n7, n8);
        NL nL = IMPL;
        ML mL = this.mCardViewDelegate;
        nL.b(mL);
    }

    public void setMaxCardElevation(float f5) {
        NL nL = IMPL;
        ML mL = this.mCardViewDelegate;
        nL.h(mL, f5);
    }

    public void setMinimumHeight(int n3) {
        this.mUserSetMinHeight = n3;
        super.setMinimumHeight(n3);
    }

    public void setMinimumWidth(int n3) {
        this.mUserSetMinWidth = n3;
        super.setMinimumWidth(n3);
    }

    public void setPadding(int n3, int n4, int n7, int n8) {
    }

    public void setPaddingRelative(int n3, int n4, int n7, int n8) {
    }

    public void setPreventCornerOverlap(boolean bl2) {
        boolean bl3 = this.mPreventCornerOverlap;
        if (bl2 != bl3) {
            this.mPreventCornerOverlap = bl2;
            NL nL = IMPL;
            ML mL = this.mCardViewDelegate;
            nL.d(mL);
        }
    }

    public void setRadius(float f5) {
        NL nL = IMPL;
        ML mL = this.mCardViewDelegate;
        nL.i(mL, f5);
    }

    public void setUseCompatPadding(boolean bl2) {
        boolean bl3 = this.mCompatPadding;
        if (bl3 != bl2) {
            this.mCompatPadding = bl2;
            NL nL = IMPL;
            ML mL = this.mCardViewDelegate;
            nL.a(mL);
        }
    }
}

