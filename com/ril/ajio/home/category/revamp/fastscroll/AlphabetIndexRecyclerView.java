/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.util.AttributeSet
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.widget.SectionIndexer
 */
package com.ril.ajio.home.category.revamp.fastscroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.SectionIndexer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.home.category.revamp.fastscroll.AlphabetIndexRecyclerView$a;

public class AlphabetIndexRecyclerView
extends RecyclerView {
    public de_1 a = null;
    public GestureDetector b = null;
    public final int c;
    public final float d;
    public final float e;
    public final Context f;

    public AlphabetIndexRecyclerView(Context context) {
        super(context);
        this.c = 12;
        this.d = 20.0f;
        this.e = 5.0f;
        this.f = context;
    }

    public AlphabetIndexRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 12;
        this.d = 20.0f;
        this.e = 5.0f;
        this.f = context;
    }

    public AlphabetIndexRecyclerView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.c = 12;
        this.d = 20.0f;
        this.e = 5.0f;
        this.f = context;
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.draw(canvas);
        de_1 de_12 = this.a;
        if (de_12 != null) {
            int n3;
            de_12.getClass();
            Paint paint = new Paint();
            int n4 = de_12.m;
            paint.setColor(n4);
            n4 = 1;
            float f5 = Float.MIN_VALUE;
            paint.setAntiAlias(n4 != 0);
            paint = de_12.h;
            if (paint != null && (n3 = ((String[])paint).length) > 0) {
                Object object;
                int n7;
                paint = new Paint();
                String string2 = "#929292";
                int n8 = Color.parseColor((String)string2);
                paint.setColor(n8);
                paint.setAntiAlias(n4 != 0);
                n8 = de_12.j;
                float f6 = n8;
                float f7 = de_12.c;
                paint.setTextSize(f6 *= f7);
                Typeface typeface = de_12.k;
                paint.setTypeface(typeface);
                typeface = de_12.i;
                float f8 = typeface.height();
                float f11 = de_12.b;
                float f12 = 2.0f;
                float f14 = f11 * f12;
                f8 -= f14;
                String[] stringArray = de_12.h;
                int n10 = stringArray.length;
                f14 = n10;
                f8 /= f14;
                f14 = paint.descent();
                float f15 = paint.ascent();
                f14 -= f15;
                f14 = (f8 - f14) / f12;
                f15 = 0.0f;
                for (int i3 = 0; i3 < (n7 = ((String[])(object = de_12.h)).length); ++i3) {
                    float f16;
                    float f17;
                    object = de_12.l;
                    n7 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
                    float f18 = de_12.a;
                    if (n7 != 0) {
                        n7 = de_12.d;
                        int n14 = -1;
                        f17 = 0.0f / 0.0f;
                        if (n7 > n14 && i3 == n7) {
                            object = Typeface.create((Typeface)de_12.k, (int)n4);
                            paint.setTypeface((Typeface)object);
                            f16 = (float)(n8 + 3) * f7;
                            paint.setTextSize(f16);
                            n7 = de_12.o;
                            paint.setColor(n7);
                        } else {
                            object = de_12.k;
                            paint.setTypeface((Typeface)object);
                            paint.setTextSize(f6);
                            n7 = de_12.n;
                            paint.setColor(n7);
                        }
                        object = de_12.h[i3];
                        f16 = paint.measureText((String)object);
                        f18 = (f18 - f16) / f12;
                        object = de_12.h[i3];
                        RectF rectF = de_12.i;
                        f5 = rectF.left + f18;
                        f18 = rectF.top + f11;
                        f17 = (float)i3 * f8 + f18 + f14;
                        f18 = paint.ascent();
                        canvas2.drawText((String)object, f5, f17 -= f18, paint);
                    } else {
                        String string3 = de_12.h[i3];
                        f5 = paint.measureText(string3);
                        f18 = (f18 - f5) / f12;
                        string3 = de_12.h[i3];
                        object = de_12.i;
                        f17 = ((RectF)object).left + f18;
                        f16 = ((RectF)object).top + f11;
                        f18 = (float)i3 * f8 + f16 + f14;
                        f16 = paint.ascent();
                        canvas2.drawText(string3, f17, f18 -= f16, paint);
                    }
                    n4 = 1;
                    f5 = Float.MIN_VALUE;
                }
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f5;
        float f6;
        boolean bl2;
        de_1 de_12 = this.a;
        if (de_12 != null && (bl2 = de_12.a(f6 = motionEvent.getX(), f5 = motionEvent.getY()))) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onSizeChanged(int n3, int n4, int n7, int n8) {
        super.onSizeChanged(n3, n4, n7, n8);
        de_1 de_12 = this.a;
        if (de_12 != null) {
            RectF rectF;
            de_12.getClass();
            float f5 = n3;
            float f6 = de_12.b;
            float f7 = de_12.a;
            f7 = (f5 -= f6) - f7;
            float f8 = (float)n4 - f6;
            de_12.i = rectF = new RectF(f7, f6, f5, f8);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Context context;
        de_1 de_12;
        block7: {
            boolean bl2;
            block10: {
                int n3;
                float f5;
                block8: {
                    block9: {
                        boolean bl3;
                        de_12 = this.a;
                        if (de_12 == null) break block7;
                        de_12.getClass();
                        boolean bl32 = motionEvent.getAction();
                        bl2 = true;
                        if (!bl32) break block8;
                        if (bl32 == bl2) break block9;
                        boolean bl4 = 2 != 0;
                        float f6 = 2.8E-45f;
                        if (bl32 != bl4 || !(bl3 = de_12.e)) break block7;
                        float f7 = motionEvent.getX();
                        boolean bl5 = de_12.a(f7, f6 = motionEvent.getY());
                        if (bl5) {
                            int n4;
                            float f8 = motionEvent.getY();
                            de_12.d = n4 = de_12.b(f8);
                            de_12.c();
                        }
                        break block10;
                    }
                    boolean bl6 = de_12.e;
                    if (bl6) {
                        context = null;
                        de_12.e = false;
                        int n7 = -1;
                        float f11 = 0.0f / 0.0f;
                        de_12.d = n7;
                    }
                    break block7;
                }
                float f12 = motionEvent.getX();
                boolean bl7 = de_12.a(f12, f5 = motionEvent.getY());
                if (!bl7) break block7;
                de_12.e = bl2;
                float f14 = motionEvent.getY();
                de_12.d = n3 = de_12.b(f14);
                de_12.c();
            }
            return bl2;
        }
        if ((de_12 = this.b) == null) {
            context = this.getContext();
            AlphabetIndexRecyclerView$a alphabetIndexRecyclerView$a = new GestureDetector.SimpleOnGestureListener();
            de_12 = new GestureDetector(context, (GestureDetector.OnGestureListener)alphabetIndexRecyclerView$a);
            this.b = de_12;
        }
        this.b.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdapter(RecyclerView$f stringArray) {
        boolean bl2;
        super.setAdapter((RecyclerView$f)stringArray);
        de_1 de_12 = this.a;
        if (de_12 != null && (bl2 = stringArray instanceof SectionIndexer)) {
            stringArray.registerAdapterDataObserver(de_12);
            stringArray = (SectionIndexer)stringArray;
            de_12.g = stringArray;
            stringArray = (String[])stringArray.getSections();
            de_12.h = stringArray;
        }
    }

    public void setTypeface(Typeface typeface) {
        de_1 de_12 = this.a;
        if (de_12 != null) {
            de_12.k = typeface;
        }
    }
}

