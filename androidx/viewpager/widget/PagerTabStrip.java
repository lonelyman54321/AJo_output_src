/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View$OnClickListener
 *  android.view.ViewConfiguration
 *  android.widget.TextView
 */
package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.viewpager.widget.PagerTitleStrip;
import androidx.viewpager.widget.ViewPager;

public class PagerTabStrip
extends PagerTitleStrip {
    public boolean A;
    public final int B;
    public boolean C;
    public float D;
    public float E;
    public final int F;
    public int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final Paint w;
    public final Rect x;
    public int y;
    public boolean z;

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        int bl2;
        int n4;
        Object object;
        super();
        this.w = attributeSet;
        this.x = object = new Rect();
        this.y = 255;
        this.z = false;
        this.A = false;
        this.q = n4 = this.n;
        attributeSet.setColor(n4);
        attributeSet = context.getResources().getDisplayMetrics();
        float f5 = attributeSet.density;
        float f6 = 3.0f * f5;
        float f7 = 0.5f;
        this.r = n4 = (int)(f6 + f7);
        this.s = n4 = (int)(6.0f * f5 + f7);
        this.t = n4 = (int)(64.0f * f5);
        this.v = n4 = (int)(16.0f * f5 + f7);
        this.B = n4 = (int)(1.0f * f5 + f7);
        f6 = 32.0f;
        this.u = bl2 = (int)(f5 * f6 + f7);
        this.F = n3 = ViewConfiguration.get((Context)context).getScaledTouchSlop();
        n3 = this.getPaddingLeft();
        int n7 = this.getPaddingTop();
        n4 = this.getPaddingRight();
        int n8 = this.getPaddingBottom();
        this.setPadding(n3, n7, n4, n8);
        n3 = this.getTextSpacing();
        this.setTextSpacing(n3);
        this.setWillNotDraw(false);
        context = this.b;
        boolean bl3 = true;
        f5 = Float.MIN_VALUE;
        context.setFocusable(bl3);
        context = this.b;
        super(this);
        context.setOnClickListener((View.OnClickListener)object);
        this.d.setFocusable(bl3);
        context = this.d;
        super(this);
        context.setOnClickListener((View.OnClickListener)object);
        context = this.getBackground();
        if (context == null) {
            this.z = bl3;
        }
    }

    public final void c(int n3, float f5, boolean bl2) {
        int n4 = this.getHeight();
        TextView textView = this.c;
        int n7 = textView.getLeft();
        int n8 = this.v;
        int n10 = textView.getRight() + n8;
        int n14 = this.r;
        n14 = n4 - n14;
        Rect rect = this.x;
        rect.set(n7 -= n8, n14, n10, n4);
        super.c(n3, f5, bl2);
        this.y = n3 = (int)(Math.abs(f5 - 0.5f) * 2.0f * 255.0f);
        n3 = textView.getLeft() - n8;
        int n15 = textView.getRight() + n8;
        rect.union(n3, n14, n15, n4);
        this.invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.z;
    }

    public int getMinHeight() {
        int n3 = super.getMinHeight();
        int n4 = this.u;
        return Math.max(n3, n4);
    }

    public int getTabIndicatorColor() {
        return this.q;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int n3 = this.getHeight();
        TextView textView = this.c;
        int n4 = textView.getLeft();
        int n7 = this.v;
        n4 -= n7;
        int n8 = textView.getRight() + n7;
        n7 = this.r;
        n7 = n3 - n7;
        Paint paint = this.w;
        int n10 = this.y << 24;
        int n14 = this.q;
        int n15 = 0xFFFFFF;
        paint.setColor(n10 |= (n14 &= n15));
        float f5 = n4;
        float f6 = n7;
        float f7 = n8;
        float f8 = n3;
        canvas.drawRect(f5, f6, f7, f8, paint);
        n4 = (int)(this.z ? 1 : 0);
        if (n4 != 0) {
            n4 = this.q & n15;
            n7 = -16777216;
            paint.setColor(n4 |= n7);
            f5 = this.getPaddingLeft();
            n4 = this.B;
            f6 = n3 - n4;
            n3 = this.getWidth();
            n4 = this.getPaddingRight();
            f7 = n3 -= n4;
            canvas.drawRect(f5, f6, f7, f8, paint);
        }
    }

    public final boolean onTouchEvent(MotionEvent object) {
        int n3;
        block8: {
            float f5;
            float f6;
            block6: {
                int n4;
                int n7;
                block7: {
                    block9: {
                        boolean bl2;
                        n7 = object.getAction();
                        n4 = 0;
                        if (n7 != 0 && (bl2 = this.C)) {
                            return false;
                        }
                        f6 = object.getX();
                        f5 = object.getY();
                        n3 = 1;
                        if (n7 == 0) break block6;
                        if (n7 == n3) break block7;
                        n4 = 2;
                        if (n7 != n4) break block8;
                        float f7 = this.D;
                        float f8 = (f7 = Math.abs(f6 - f7)) - (f6 = (float)(n4 = this.F));
                        n7 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
                        if (n7 > 0) break block9;
                        f7 = this.E;
                        float f11 = (f5 = Math.abs(f5 - f7)) - (f7 = (float)n4);
                        Object object2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                        if (object2 <= 0) break block8;
                    }
                    this.C = n3;
                    break block8;
                }
                object = this.c;
                n7 = object.getLeft();
                n4 = this.v;
                float f12 = n7 - n4;
                float f14 = f6 - f12;
                if ((n7 = (int)(f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1))) < 0) {
                    object = this.a;
                    n7 = ((ViewPager)((Object)object)).getCurrentItem() - n3;
                    ((ViewPager)((Object)object)).setCurrentItem(n7);
                } else {
                    f5 = object.getRight() + n4;
                    float f15 = f6 - f5;
                    Object object3 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                    if (object3 > 0) {
                        object = this.a;
                        n7 = ((ViewPager)((Object)object)).getCurrentItem() + n3;
                        ((ViewPager)((Object)object)).setCurrentItem(n7);
                    }
                }
                break block8;
            }
            this.D = f6;
            this.E = f5;
            this.C = false;
        }
        return n3 != 0;
    }

    public void setBackgroundColor(int n3) {
        super.setBackgroundColor(n3);
        int n4 = this.A;
        if (n4 == 0) {
            n4 = -16777216;
            n3 = (n3 &= n4) == 0 ? 1 : 0;
            this.z = n3;
        }
    }

    public void setBackgroundDrawable(Drawable drawable2) {
        super.setBackgroundDrawable(drawable2);
        boolean bl2 = this.A;
        if (!bl2) {
            boolean bl3;
            if (drawable2 == null) {
                bl3 = true;
            } else {
                bl3 = false;
                drawable2 = null;
            }
            this.z = bl3;
        }
    }

    public void setBackgroundResource(int n3) {
        super.setBackgroundResource(n3);
        boolean bl2 = this.A;
        if (!bl2) {
            n3 = n3 == 0 ? 1 : 0;
            this.z = n3;
        }
    }

    public void setDrawFullUnderline(boolean bl2) {
        this.z = bl2;
        this.A = true;
        this.invalidate();
    }

    public void setPadding(int n3, int n4, int n7, int n8) {
        int n10 = this.s;
        if (n8 < n10) {
            n8 = n10;
        }
        super.setPadding(n3, n4, n7, n8);
    }

    public void setTabIndicatorColor(int n3) {
        this.q = n3;
        this.w.setColor(n3);
        this.invalidate();
    }

    public void setTabIndicatorColorResource(int n3) {
        n3 = t70.getColor(this.getContext(), n3);
        this.setTabIndicatorColor(n3);
    }

    public void setTextSpacing(int n3) {
        int n4 = this.t;
        if (n3 < n4) {
            n3 = n4;
        }
        super.setTextSpacing(n3);
    }
}

