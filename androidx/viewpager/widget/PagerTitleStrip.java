/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils$TruncateAt
 *  android.text.method.SingleLineTransformationMethod
 *  android.text.method.TransformationMethod
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerTitleStrip$a;
import androidx.viewpager.widget.PagerTitleStrip$b;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class PagerTitleStrip
extends ViewGroup {
    public static final int[] o = new int[]{16842804, 16842901, 16842904, 16842927};
    public static final int[] p = new int[]{16843660};
    public ViewPager a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public int e = -1;
    public float f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public final PagerTitleStrip$a k;
    public WeakReference l;
    public int m;
    public int n;

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    public PagerTitleStrip(Context context, AttributeSet object) {
        super(context, object);
        int n3;
        int n4;
        TextView textView;
        TextView textView2;
        PagerTitleStrip$a pagerTitleStrip$a;
        float f5;
        this.f = f5 = -1.0f;
        this.k = pagerTitleStrip$a = new PagerTitleStrip$a(this);
        super(context);
        this.b = pagerTitleStrip$a;
        this.addView((View)pagerTitleStrip$a);
        this.c = textView2 = new TextView(context);
        this.addView((View)textView2);
        this.d = textView = new TextView(context);
        this.addView((View)textView);
        int[] nArray = o;
        object = context.obtainStyledAttributes(object, nArray);
        boolean bl2 = false;
        nArray = null;
        int n7 = object.getResourceId(0, 0);
        if (n7 != 0) {
            Hm3.f((TextView)pagerTitleStrip$a, n7);
            Hm3.f(textView2, n7);
            Hm3.f(textView, n7);
        }
        float f6 = Float.MIN_VALUE;
        int n8 = object.getDimensionPixelSize(1, 0);
        if (n8 != 0) {
            f6 = n8;
            this.setTextSize(0, f6);
        }
        n8 = 2;
        f6 = 2.8E-45f;
        int n10 = object.hasValue(n8);
        if (n10 != 0) {
            n8 = object.getColor(n8, 0);
            pagerTitleStrip$a.setTextColor(n8);
            textView2.setTextColor(n8);
            textView.setTextColor(n8);
        }
        f6 = 4.2E-45f;
        n10 = 80;
        this.h = n8 = object.getInteger(3, n10);
        object.recycle();
        this.n = n4 = textView2.getTextColors().getDefaultColor();
        n4 = 1058642330;
        float f7 = 0.6f;
        this.setNonPrimaryAlpha(f7);
        object = TextUtils.TruncateAt.END;
        pagerTitleStrip$a.setEllipsize((TextUtils.TruncateAt)object);
        textView2.setEllipsize((TextUtils.TruncateAt)object);
        textView.setEllipsize((TextUtils.TruncateAt)object);
        if (n7 != 0) {
            object = p;
            object = context.obtainStyledAttributes(n7, (int[])object);
            bl2 = object.getBoolean(0, false);
            object.recycle();
        }
        if (bl2) {
            PagerTitleStrip.setSingleLineAllCaps((TextView)pagerTitleStrip$a);
            PagerTitleStrip.setSingleLineAllCaps(textView2);
            PagerTitleStrip.setSingleLineAllCaps(textView);
        } else {
            pagerTitleStrip$a.setSingleLine();
            textView2.setSingleLine();
            textView.setSingleLine();
        }
        this.g = n3 = (int)(context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        Object object = textView.getContext();
        PagerTitleStrip$b pagerTitleStrip$b = new SingleLineTransformationMethod();
        object = object.getResources().getConfiguration().locale;
        pagerTitleStrip$b.a = object;
        textView.setTransformationMethod((TransformationMethod)pagerTitleStrip$b);
    }

    public final void a(Uk2 object, Uk2 uk2) {
        int n3;
        PagerTitleStrip$a pagerTitleStrip$a = this.k;
        if (object != null) {
            ((Uk2)object).a.unregisterObserver((Object)pagerTitleStrip$a);
            n3 = 0;
            object = null;
            this.l = null;
        }
        if (uk2 != null) {
            uk2.a.registerObserver((Object)pagerTitleStrip$a);
            object = new WeakReference(uk2);
            this.l = object;
        }
        if ((object = this.a) != null) {
            float f5;
            this.e = -1;
            this.f = f5 = -1.0f;
            n3 = ((ViewPager)((Object)object)).getCurrentItem();
            this.b(n3, uk2);
            this.requestLayout();
        }
    }

    public final void b(int n3, Uk2 uk2) {
        int n4;
        CharSequence charSequence;
        CharSequence charSequence2;
        int n7;
        float f5;
        int n8;
        if (uk2 != null) {
            n8 = uk2.c();
        } else {
            n8 = 0;
            f5 = 0.0f;
        }
        this.i = n7 = 1;
        int n10 = 0;
        CharSequence charSequence3 = null;
        if (n3 >= n7 && uk2 != null) {
            n7 = n3 + -1;
            charSequence2 = uk2.e(n7);
        } else {
            n7 = 0;
            charSequence2 = null;
        }
        TextView textView = this.b;
        textView.setText(charSequence2);
        charSequence2 = this.c;
        if (uk2 != null && n3 < n8) {
            charSequence = uk2.e(n3);
        } else {
            n4 = 0;
            charSequence = null;
        }
        charSequence2.setText(charSequence);
        n4 = n3 + 1;
        if (n4 < n8 && uk2 != null) {
            charSequence3 = uk2.e(n4);
        }
        uk2 = this.d;
        uk2.setText(charSequence3);
        n8 = this.getWidth();
        n10 = this.getPaddingLeft();
        n8 -= n10;
        n10 = this.getPaddingRight();
        f5 = (float)(n8 - n10) * 0.8f;
        n8 = (int)f5;
        n8 = Math.max(0, n8);
        n10 = -1 << -1;
        n8 = View.MeasureSpec.makeMeasureSpec((int)n8, (int)n10);
        n4 = this.getHeight();
        int n14 = this.getPaddingTop();
        n4 -= n14;
        n14 = this.getPaddingBottom();
        n4 -= n14;
        n4 = Math.max(0, n4);
        n10 = View.MeasureSpec.makeMeasureSpec((int)n4, (int)n10);
        textView.measure(n8, n10);
        charSequence2.measure(n8, n10);
        uk2.measure(n8, n10);
        this.e = n3;
        boolean bl2 = this.j;
        if (!bl2) {
            float f6 = this.f;
            this.c(n3, f6, false);
        }
        this.i = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void c(int n3, float f5, boolean bl2) {
        int n4;
        TextView textView;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        int n20;
        TextView textView2;
        TextView textView3;
        float f6;
        Uk2 uk2;
        int n21;
        int n22;
        PagerTitleStrip pagerTitleStrip;
        block6: {
            int n24;
            block7: {
                int n25;
                block4: {
                    block5: {
                        float f7;
                        pagerTitleStrip = this;
                        n22 = n3;
                        float f8 = f5;
                        n21 = this.e;
                        if (n3 != n21) {
                            uk2 = this.a.getAdapter();
                            this.b(n3, uk2);
                        } else if (!bl2 && (n22 = (int)((f7 = f5 - (f6 = this.f)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) == 0) {
                            return;
                        }
                        n22 = 1;
                        f6 = Float.MIN_VALUE;
                        pagerTitleStrip.j = n22;
                        textView3 = pagerTitleStrip.b;
                        n21 = textView3.getMeasuredWidth();
                        textView2 = pagerTitleStrip.c;
                        n20 = textView2.getMeasuredWidth();
                        TextView textView4 = pagerTitleStrip.d;
                        n19 = textView4.getMeasuredWidth();
                        n18 = n20 / 2;
                        n17 = this.getWidth();
                        n24 = this.getHeight();
                        n16 = this.getPaddingLeft();
                        int n26 = this.getPaddingRight();
                        n15 = this.getPaddingTop();
                        n25 = this.getPaddingBottom();
                        n14 = n16 + n18;
                        int n27 = n26 + n18;
                        n14 = n17 - n14 - n27;
                        n10 = 0x3F000000;
                        float f11 = f8 + 0.5f;
                        float f12 = 1.0f;
                        float f14 = f11 == f12 ? 0 : (f11 > f12 ? 1 : -1);
                        if (f14 > 0) {
                            f11 -= f12;
                        }
                        n27 = n17 - n27;
                        float f15 = (float)n14 * f11;
                        n14 = (int)f15;
                        n18 = n27 - n14 - n18;
                        n20 += n18;
                        n14 = textView3.getBaseline();
                        n8 = textView2.getBaseline();
                        n3 = n19;
                        n19 = textView4.getBaseline();
                        n7 = n17;
                        n17 = Math.max(Math.max(n14, n8), n19);
                        n14 = n17 - n14;
                        n8 = n17 - n8;
                        n17 -= n19;
                        n19 = textView3.getMeasuredHeight() + n14;
                        n27 = textView2.getMeasuredHeight();
                        n10 = n26;
                        n26 = n27 + n8;
                        n27 = textView4.getMeasuredHeight();
                        textView = textView4;
                        n4 = n27 + n17;
                        n4 = Math.max(Math.max(n19, n26), n4);
                        n19 = pagerTitleStrip.h & 0x70;
                        n26 = 16;
                        if (n19 == n26) break block4;
                        n26 = 80;
                        if (n19 == n26) break block5;
                        n14 += n15;
                        n8 += n15;
                        n15 += n17;
                        break block6;
                    }
                    n24 = n24 - n25 - n4;
                    break block7;
                }
                n24 = (n24 - n15 - n25 - n4) / 2;
            }
            n14 += n24;
            n8 += n24;
            n15 = n24 + n17;
        }
        n4 = textView2.getMeasuredHeight() + n8;
        textView2.layout(n18, n8, n20, n4);
        n8 = pagerTitleStrip.g;
        n18 = n18 - n8 - n21;
        n8 = Math.min(n16, n18);
        int n28 = textView3.getMeasuredHeight() + n14;
        textView3.layout(n8, n14, n21 += n8, n28);
        n17 = n7 - n10 - n3;
        n22 = pagerTitleStrip.g;
        n20 += n22;
        n22 = Math.max(n17, n20);
        n19 = n22 + n3;
        n8 = textView.getMeasuredHeight() + n15;
        uk2 = textView;
        textView.layout(n22, n15, n19, n8);
        f6 = f5;
        pagerTitleStrip.f = f5;
        pagerTitleStrip.j = false;
    }

    public int getMinHeight() {
        int n3;
        Drawable drawable2 = this.getBackground();
        if (drawable2 != null) {
            n3 = drawable2.getIntrinsicHeight();
        } else {
            n3 = 0;
            drawable2 = null;
        }
        return n3;
    }

    public int getTextSpacing() {
        return this.g;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object object = this.getParent();
        boolean bl2 = object instanceof ViewPager;
        if (bl2) {
            object = (ViewPager)((Object)object);
            Uk2 uk2 = ((ViewPager)((Object)object)).getAdapter();
            PagerTitleStrip$a pagerTitleStrip$a = this.k;
            ((ViewPager)((Object)object)).setInternalPageChangeListener(pagerTitleStrip$a);
            ((ViewPager)((Object)object)).addOnAdapterChangeListener(pagerTitleStrip$a);
            this.a = object;
            object = this.l;
            object = object != null ? (Uk2)((Reference)object).get() : null;
            this.a((Uk2)object, uk2);
            return;
        }
        object = new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        throw object;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Object object = this.a;
        if (object != null) {
            object = ((ViewPager)((Object)object)).getAdapter();
            this.a((Uk2)object, null);
            this.a.setInternalPageChangeListener(null);
            object = this.a;
            PagerTitleStrip$a pagerTitleStrip$a = this.k;
            ((ViewPager)((Object)object)).removeOnAdapterChangeListener(pagerTitleStrip$a);
            this.a = null;
        }
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        ViewPager viewPager = this.a;
        if (viewPager != null) {
            float f5 = this.f;
            n3 = 0;
            float f6 = f5 - 0.0f;
            n4 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
            if (n4 < 0) {
                f5 = 0.0f;
                viewPager = null;
            }
            n3 = this.e;
            n4 = 1;
            this.c(n3, f5, n4 != 0);
        }
    }

    public final void onMeasure(int n3, int n4) {
        int n7;
        int n8 = View.MeasureSpec.getMode((int)n3);
        if (n8 == (n7 = 0x40000000)) {
            n8 = this.getPaddingTop();
            int n10 = this.getPaddingBottom() + n8;
            n8 = -2;
            int n14 = ViewGroup.getChildMeasureSpec((int)n4, (int)n10, (int)n8);
            int n15 = View.MeasureSpec.getSize((int)n3);
            float f5 = n15;
            float f6 = 0.2f;
            int n16 = (int)(f5 *= f6);
            n3 = ViewGroup.getChildMeasureSpec((int)n3, (int)n16, (int)n8);
            this.b.measure(n3, n14);
            TextView textView = this.c;
            textView.measure(n3, n14);
            TextView textView2 = this.d;
            textView2.measure(n3, n14);
            n3 = View.MeasureSpec.getMode((int)n4);
            if (n3 == n7) {
                n3 = View.MeasureSpec.getSize((int)n4);
            } else {
                n3 = textView.getMeasuredHeight();
                n7 = this.getMinHeight();
                n3 += n10;
                n3 = Math.max(n7, n3);
            }
            n8 = textView.getMeasuredState() << 16;
            n3 = View.resolveSizeAndState((int)n3, (int)n4, (int)n8);
            this.setMeasuredDimension(n15, n3);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Must measure with an exact width");
        throw illegalStateException;
    }

    public final void requestLayout() {
        boolean bl2 = this.i;
        if (!bl2) {
            super.requestLayout();
        }
    }

    public void setGravity(int n3) {
        this.h = n3;
        this.requestLayout();
    }

    public void setNonPrimaryAlpha(float f5) {
        int n3;
        this.m = n3 = (int)(f5 * 255.0f) & 0xFF;
        n3 <<= 24;
        int n4 = this.n & 0xFFFFFF;
        this.b.setTextColor(n3 |= n4);
        this.d.setTextColor(n3);
    }

    public void setTextColor(int n3) {
        this.n = n3;
        this.c.setTextColor(n3);
        n3 = this.m << 24;
        int n4 = this.n & 0xFFFFFF;
        this.b.setTextColor(n3 |= n4);
        this.d.setTextColor(n3);
    }

    public void setTextSize(int n3, float f5) {
        this.b.setTextSize(n3, f5);
        this.c.setTextSize(n3, f5);
        this.d.setTextSize(n3, f5);
    }

    public void setTextSpacing(int n3) {
        this.g = n3;
        this.requestLayout();
    }
}

