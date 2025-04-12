/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.ClipDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.willy.ratingbar;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.willy.ratingbar.BaseRatingBar$a;
import com.willy.ratingbar.PartialView;
import com.willy.ratingbar.R$drawable;
import com.willy.ratingbar.R$styleable;
import com.willy.ratingbar.SavedState;
import com.willy.ratingbar.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class BaseRatingBar
extends LinearLayout {
    public int a;
    public int b = 20;
    public int c;
    public int d;
    public float e;
    public float f;
    public float g;
    public float h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public float m;
    public float n;
    public Drawable o;
    public Drawable p;
    public BaseRatingBar$a q;
    public ArrayList r;

    public BaseRatingBar(Context context) {
        this(context, null);
    }

    public BaseRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseRatingBar(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        float f5;
        float f6;
        float f7;
        float f8;
        int n4;
        float f11;
        Drawable drawable2;
        int n7;
        int n8;
        int n10;
        float f12;
        int n14;
        int n74;
        float f14;
        n3 = 0;
        this.e = 0.0f;
        this.f = -1.0f;
        this.g = f14 = 1.0f;
        this.h = 0.0f;
        int n84 = 0;
        this.i = false;
        this.j = n74 = 1;
        this.k = n74;
        this.l = n74;
        int[] nArray = R$styleable.BaseRatingBar;
        attributeSet = context.obtainStyledAttributes(attributeSet, nArray);
        n74 = R$styleable.BaseRatingBar_srb_rating;
        float f15 = attributeSet.getFloat(n74, 0.0f);
        int bl2 = R$styleable.BaseRatingBar_srb_numStars;
        int n15 = this.a;
        this.a = n14 = attributeSet.getInt(bl2, n15);
        int n16 = R$styleable.BaseRatingBar_srb_stepSize;
        float f16 = this.g;
        this.g = f12 = attributeSet.getFloat(n16, f16);
        int n17 = R$styleable.BaseRatingBar_srb_minimumStars;
        f16 = this.e;
        this.e = f12 = attributeSet.getFloat(n17, f16);
        int n18 = R$styleable.BaseRatingBar_srb_starPadding;
        n15 = this.b;
        this.b = n10 = attributeSet.getDimensionPixelSize(n18, n15);
        int n19 = R$styleable.BaseRatingBar_srb_starWidth;
        this.c = n8 = attributeSet.getDimensionPixelSize(n19, 0);
        int n20 = R$styleable.BaseRatingBar_srb_starHeight;
        this.d = n7 = attributeSet.getDimensionPixelSize(n20, 0);
        int n21 = R$styleable.BaseRatingBar_srb_drawableEmpty;
        boolean bl3 = attributeSet.hasValue(n21);
        n15 = 0;
        f16 = 0.0f;
        Drawable drawable3 = null;
        int n22 = -1;
        if (bl3) {
            int n25 = R$styleable.BaseRatingBar_srb_drawableEmpty;
            n25 = attributeSet.getResourceId(n25, n22);
            drawable2 = t70.getDrawable(context, n25);
        } else {
            boolean bl4 = false;
            drawable2 = null;
            f12 = 0.0f;
        }
        this.o = drawable2;
        int n26 = R$styleable.BaseRatingBar_srb_drawableFilled;
        boolean bl5 = attributeSet.hasValue(n26);
        if (bl5) {
            int n28 = R$styleable.BaseRatingBar_srb_drawableFilled;
            n28 = attributeSet.getResourceId(n28, n22);
            drawable3 = t70.getDrawable(context, n28);
        }
        this.p = drawable3;
        int n29 = R$styleable.BaseRatingBar_srb_isIndicator;
        boolean bl6 = this.i;
        n29 = (int)(attributeSet.getBoolean(n29, bl6) ? 1 : 0);
        this.i = n29;
        n29 = R$styleable.BaseRatingBar_srb_scrollable;
        boolean bl7 = this.j;
        n29 = (int)(attributeSet.getBoolean(n29, bl7) ? 1 : 0);
        this.j = n29;
        n29 = R$styleable.BaseRatingBar_srb_clickable;
        boolean bl8 = this.k;
        n29 = (int)(attributeSet.getBoolean(n29, bl8) ? 1 : 0);
        this.k = n29;
        n29 = R$styleable.BaseRatingBar_srb_clearRatingEnabled;
        boolean bl9 = this.l;
        n29 = (int)(attributeSet.getBoolean(n29, bl9) ? 1 : 0);
        this.l = n29;
        attributeSet.recycle();
        n29 = this.a;
        if (n29 <= 0) {
            n29 = 5;
            f11 = 7.0E-45f;
            this.a = n29;
        }
        if ((n29 = this.b) < 0) {
            this.b = 0;
        }
        if ((context = this.o) == null) {
            context = this.getContext();
            n4 = R$drawable.empty;
            context = t70.getDrawable(context, n4);
            this.o = context;
        }
        if ((context = this.p) == null) {
            context = this.getContext();
            n4 = R$drawable.filled;
            context = t70.getDrawable(context, n4);
            this.p = context;
        }
        if ((n4 = (int)((f8 = (f11 = this.g) - f14) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1))) > 0) {
            this.g = f14;
        } else {
            n4 = 0x3DCCCCCD;
            f7 = 0.1f;
            float f17 = f11 - f7;
            n29 = (int)(f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1));
            if (n29 < 0) {
                this.g = f7;
            }
        }
        f11 = this.e;
        n4 = this.a;
        f14 = this.g;
        float f18 = f11 - 0.0f;
        n84 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
        if (n84 < 0) {
            n29 = 0;
            f11 = 0.0f;
            context = null;
        }
        if ((n84 = (int)((f6 = f11 - (f7 = (float)n4)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) > 0) {
            f11 = f7;
        }
        if ((n4 = (int)((f5 = (f7 = f11 % f14) - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) == 0) {
            f14 = f11;
        }
        this.e = f14;
        this.b();
        this.setRating(f15);
    }

    public void a(float f5) {
        boolean bl2;
        Iterator iterator = this.r.iterator();
        while (bl2 = iterator.hasNext()) {
            PartialView partialView = (PartialView)((Object)iterator.next());
            Integer n3 = (Integer)partialView.getTag();
            int n4 = n3;
            double d2 = n4;
            double d5 = Math.ceil(f5);
            double d7 = d2 - d5;
            if ((n4 = (int)(d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1))) > 0) {
                partialView.b();
                continue;
            }
            if (n4 == 0) {
                partialView.c(f5);
                continue;
            }
            n3 = partialView.a;
            int n7 = 10000;
            n3.setImageLevel(n7);
            partialView = partialView.b;
            n4 = 0;
            n3 = null;
            partialView.setImageLevel(0);
        }
    }

    public final void b() {
        int n3;
        ArrayList arrayList;
        this.r = arrayList = new ArrayList();
        int n4 = 1;
        for (int i3 = 1; i3 <= (n3 = this.a); ++i3) {
            Drawable drawable2;
            n3 = this.c;
            int n7 = this.d;
            int n8 = this.b;
            Drawable drawable3 = this.p;
            Drawable drawable4 = this.o;
            Context context = this.getContext();
            PartialView partialView = new RelativeLayout(context);
            partialView.c = n3;
            partialView.d = n7;
            Serializable serializable = Integer.valueOf(i3);
            partialView.setTag(serializable);
            partialView.setPadding(n8, n8, n8, n8);
            partialView.a();
            serializable = drawable3.getConstantState();
            if (serializable != null) {
                drawable2 = drawable3.getConstantState().newDrawable();
                n8 = 0x800003;
                serializable = new ClipDrawable(drawable2, n8, n4);
                drawable2 = partialView.a;
                drawable2.setImageDrawable((Drawable)serializable);
            }
            serializable = drawable4.getConstantState();
            if (serializable != null) {
                drawable2 = drawable4.getConstantState().newDrawable();
                n8 = 0x800005;
                serializable = new ClipDrawable(drawable2, n8, n4);
                drawable2 = partialView.b;
                drawable2.setImageDrawable((Drawable)serializable);
            }
            this.addView((View)partialView);
            serializable = this.r;
            ((ArrayList)serializable).add(partialView);
        }
    }

    public final void c(float f5, boolean bl2) {
        float f6;
        float f7;
        int n3 = this.a;
        float f8 = n3;
        float f11 = f5 - f8;
        Object object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object > 0) {
            f5 = f8;
        }
        if ((object = (f7 = f5 - (f8 = this.e)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) < 0) {
            f5 = f8;
        }
        if ((n3 = (int)((f6 = (f8 = this.f) - f5) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) == 0) {
            return;
        }
        f8 = this.g;
        double d2 = Math.floor(f5 / f8);
        Double d5 = d2;
        f5 = d5.floatValue();
        f8 = this.g;
        this.f = f5 *= f8;
        BaseRatingBar$a baseRatingBar$a = this.q;
        if (baseRatingBar$a != null) {
            baseRatingBar$a.a(f5, bl2);
        }
        f5 = this.f;
        this.a(f5);
    }

    public int getNumStars() {
        return this.a;
    }

    public float getRating() {
        return this.f;
    }

    public int getStarHeight() {
        return this.d;
    }

    public int getStarPadding() {
        return this.b;
    }

    public int getStarWidth() {
        return this.c;
    }

    public float getStepSize() {
        return this.g;
    }

    public final boolean isClickable() {
        return this.k;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void onRestoreInstanceState(Parcelable object) {
        object = (SavedState)((Object)object);
        Parcelable parcelable = object.getSuperState();
        super.onRestoreInstanceState(parcelable);
        float f5 = object.a;
        this.setRating(f5);
    }

    public final Parcelable onSaveInstanceState() {
        float f5;
        Parcelable parcelable = super.onSaveInstanceState();
        SavedState savedState = new View.BaseSavedState(parcelable);
        savedState.a = f5 = this.f;
        return savedState;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean onTouchEvent(MotionEvent object) {
        boolean bl2 = this.i;
        boolean bl3 = false;
        float f5 = 0.0f;
        PartialView partialView = null;
        if (bl2) {
            return false;
        }
        float f6 = object.getX();
        float f7 = object.getY();
        boolean bl4 = object.getAction();
        boolean bl5 = true;
        if (bl4) {
            if (bl4 != bl5) {
                boolean bl6 = 2 != 0;
                float f8 = 2.8E-45f;
                if (bl4 == bl6) {
                    boolean bl7 = this.j;
                    if (!bl7) {
                        return false;
                    }
                    object = this.r.iterator();
                    while (bl3 = object.hasNext()) {
                        float f11;
                        partialView = (PartialView)((Object)object.next());
                        f7 = partialView.getWidth();
                        int n3 = 1092616192;
                        float f12 = this.e;
                        int n4 = partialView.getWidth();
                        float f14 = n4;
                        float f15 = f6 - (f12 = f12 * f14 + (f7 /= 10.0f));
                        Object object2 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                        if (object2 < 0) {
                            f8 = this.e;
                            this.c(f8, bl5);
                            break;
                        }
                        f7 = partialView.getLeft();
                        float f16 = f6 - f7;
                        object2 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                        if (object2 <= 0 || (object2 = (f11 = f6 - (f7 = (float)partialView.getRight())) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) >= 0) continue;
                        f7 = this.g;
                        f7 = this.f;
                        f5 = com.willy.ratingbar.a.a(partialView, f7, f6);
                        float f17 = f7 - f5;
                        object2 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                        if (object2 == false) continue;
                        this.c(f5, bl5);
                    }
                }
            } else {
                boolean bl8;
                float f18;
                f7 = this.m;
                float f19 = this.n;
                long l2 = object.getEventTime();
                long l3 = object.getDownTime();
                float f20 = l2 -= l3;
                float f22 = f20 - (f18 = 200.0f);
                Object object3 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                if (object3 > 0) return false;
                f20 = object.getX();
                f7 = Math.abs(f7 - f20);
                float f23 = object.getY();
                f23 = Math.abs(f19 - f23);
                int n7 = 0x40A00000;
                f19 = 5.0f;
                float f24 = f7 - f19;
                Object object4 = f24 == 0.0f ? 0 : (f24 > 0.0f ? 1 : -1);
                if (object4 > 0) return false;
                Object object5 = f23 == f19 ? 0 : (f23 > f19 ? 1 : -1);
                if (object5 > 0 || !(bl8 = this.k)) return false;
                object = this.r.iterator();
                while (bl3 = object.hasNext()) {
                    float f25;
                    partialView = (PartialView)((Object)object.next());
                    f7 = partialView.getLeft();
                    float f26 = f6 - f7;
                    Object object6 = f26 == 0.0f ? 0 : (f26 > 0.0f ? 1 : -1);
                    if (object6 <= 0 || (object6 = (f25 = f6 - (f7 = (float)partialView.getRight())) == 0.0f ? 0 : (f25 < 0.0f ? -1 : 1)) >= 0) continue;
                    f23 = this.g;
                    f7 = 1.0f;
                    float f27 = f23 - f7;
                    Object object7 = f27 == 0.0f ? 0 : (f27 > 0.0f ? 1 : -1);
                    if (object7 == false) {
                        object = (Integer)partialView.getTag();
                        int n8 = (Integer)object;
                        f23 = n8;
                    } else {
                        f23 = com.willy.ratingbar.a.a(partialView, f23, f6);
                    }
                    f6 = this.h;
                    bl2 = f6 == f23 ? 0 : (f6 > f23 ? 1 : -1);
                    if (!bl2 && (bl2 = this.l)) {
                        f23 = this.e;
                        this.c(f23, bl5);
                    } else {
                        this.c(f23, bl5);
                    }
                    break;
                }
            }
        } else {
            float f28;
            this.m = f6;
            this.n = f7;
            this.h = f28 = this.f;
        }
        this.getParent().requestDisallowInterceptTouchEvent(bl5);
        return bl5;
    }

    public void setClearRatingEnabled(boolean bl2) {
        this.l = bl2;
    }

    public void setClickable(boolean bl2) {
        this.k = bl2;
    }

    public void setEmptyDrawable(Drawable drawable2) {
        boolean bl2;
        this.o = drawable2;
        Iterator iterator = this.r.iterator();
        while (bl2 = iterator.hasNext()) {
            PartialView partialView = (PartialView)((Object)iterator.next());
            ((Object)((Object)partialView)).getClass();
            Drawable.ConstantState constantState = drawable2.getConstantState();
            if (constantState == null) continue;
            Drawable drawable3 = drawable2.getConstantState().newDrawable();
            int n3 = 0x800005;
            int n4 = 1;
            constantState = new ClipDrawable(drawable3, n3, n4);
            partialView = partialView.b;
            partialView.setImageDrawable((Drawable)constantState);
        }
    }

    public void setEmptyDrawableRes(int n3) {
        Context context = this.getContext();
        Drawable drawable2 = t70.getDrawable(context, n3);
        if (drawable2 != null) {
            this.setEmptyDrawable(drawable2);
        }
    }

    public void setFilledDrawable(Drawable drawable2) {
        boolean bl2;
        this.p = drawable2;
        Iterator iterator = this.r.iterator();
        while (bl2 = iterator.hasNext()) {
            PartialView partialView = (PartialView)((Object)iterator.next());
            ((Object)((Object)partialView)).getClass();
            Drawable.ConstantState constantState = drawable2.getConstantState();
            if (constantState == null) continue;
            Drawable drawable3 = drawable2.getConstantState().newDrawable();
            int n3 = 0x800003;
            int n4 = 1;
            constantState = new ClipDrawable(drawable3, n3, n4);
            partialView = partialView.a;
            partialView.setImageDrawable((Drawable)constantState);
        }
    }

    public void setFilledDrawableRes(int n3) {
        Context context = this.getContext();
        Drawable drawable2 = t70.getDrawable(context, n3);
        if (drawable2 != null) {
            this.setFilledDrawable(drawable2);
        }
    }

    public void setIsIndicator(boolean bl2) {
        this.i = bl2;
    }

    public void setMinimumStars(float f5) {
        float f6;
        float f7;
        float f8;
        int n3 = this.a;
        float f11 = this.g;
        float f12 = f5 - 0.0f;
        Object object = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object < 0) {
            f5 = 0.0f;
        }
        if ((object = (f8 = f5 - (f7 = (float)n3)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) > 0) {
            f5 = f7;
        }
        if ((n3 = (int)((f6 = (f7 = f5 % f11) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) == 0) {
            f11 = f5;
        }
        this.e = f11;
    }

    public void setNumStars(int n3) {
        if (n3 <= 0) {
            return;
        }
        this.r.clear();
        this.removeAllViews();
        this.a = n3;
        this.b();
    }

    public void setOnRatingChangeListener(BaseRatingBar$a baseRatingBar$a) {
        this.q = baseRatingBar$a;
    }

    public void setRating(float f5) {
        this.c(f5, false);
    }

    public void setScrollable(boolean bl2) {
        this.j = bl2;
    }

    public void setStarHeight(int n3) {
        boolean bl2;
        this.d = n3;
        Iterator iterator = this.r.iterator();
        while (bl2 = iterator.hasNext()) {
            int n4;
            PartialView partialView = (PartialView)((Object)iterator.next());
            partialView.d = n3;
            ViewGroup.LayoutParams layoutParams = partialView.a.getLayoutParams();
            layoutParams.height = n4 = partialView.d;
            ImageView imageView = partialView.a;
            imageView.setLayoutParams(layoutParams);
            partialView = partialView.b;
            partialView.setLayoutParams(layoutParams);
        }
    }

    public void setStarPadding(int n3) {
        boolean bl2;
        if (n3 < 0) {
            return;
        }
        this.b = n3;
        Iterator iterator = this.r.iterator();
        while (bl2 = iterator.hasNext()) {
            PartialView partialView = (PartialView)((Object)iterator.next());
            int n4 = this.b;
            partialView.setPadding(n4, n4, n4, n4);
        }
    }

    public void setStarWidth(int n3) {
        boolean bl2;
        this.c = n3;
        Iterator iterator = this.r.iterator();
        while (bl2 = iterator.hasNext()) {
            int n4;
            PartialView partialView = (PartialView)((Object)iterator.next());
            partialView.c = n3;
            ViewGroup.LayoutParams layoutParams = partialView.a.getLayoutParams();
            layoutParams.width = n4 = partialView.c;
            ImageView imageView = partialView.a;
            imageView.setLayoutParams(layoutParams);
            partialView = partialView.b;
            partialView.setLayoutParams(layoutParams);
        }
    }

    public void setStepSize(float f5) {
        this.g = f5;
    }
}

