/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.drawable.Drawable
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$h;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$bool;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$integer;
import com.ril.ajio.R$styleable;
import com.ril.ajio.customviews.widgets.CirclePageIndicator$SavedState;
import com.ril.ajio.customviews.widgets.PageIndicator;

public class CirclePageIndicator
extends View
implements PageIndicator {
    private static final int FILL_RADIUS = 1;
    private static final int INVALID_POINTER = 255;
    private static final int SELECTED_STROKE_RADIUS = 3;
    private boolean isStroke;
    private int mActivePointerId;
    private boolean mCentered;
    private int mCurrentPage;
    private float mExtraRadius;
    private boolean mIsDragging;
    private float mLastMotionX;
    private ViewPager$h mListener;
    private int mOrientation;
    private final Paint mPaintFill;
    private final Paint mPaintPageFill;
    private final Paint mPaintStroke;
    private float mRadius;
    private int mScrollState;
    private boolean mSnap;
    private int mSnapPage;
    private int mTouchSlop;
    private ViewPager mViewPager;
    private float marginWidth;
    private float midDistance;

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.vpiCirclePageIndicatorStyle;
        this(context, attributeSet, n3);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int bl2) {
        int n3;
        float f5;
        Paint paint;
        Paint paint2;
        Paint paint3;
        CirclePageIndicator circlePageIndicator = this;
        super(context, attributeSet, (int)(bl2 ? 1 : 0));
        int n4 = 1;
        this.mPaintPageFill = paint3 = new Paint(n4);
        this.mPaintStroke = paint2 = new Paint(n4);
        this.mPaintFill = paint = new Paint(n4);
        this.mLastMotionX = f5 = -1.0f;
        this.mActivePointerId = n3 = -1;
        this.marginWidth = f5;
        int n7 = this.isInEditMode();
        if (n7 != 0) {
            return;
        }
        n7 = hv3_0.m(R$color.default_circle_indicator_page_color);
        n3 = hv3_0.m(R$color.default_circle_indicator_fill_color);
        int n8 = hv3_0.w(R$integer.default_circle_indicator_orientation);
        int n10 = hv3_0.m(R$color.default_circle_indicator_stroke_color);
        Resources resources = hv3_0.C();
        int n14 = R$dimen.default_circle_indicator_stroke_width;
        float f6 = resources.getDimension(n14);
        Resources resources2 = hv3_0.C();
        int n15 = R$dimen.default_circle_indicator_radius;
        float f7 = resources2.getDimension(n15);
        Resources resources3 = hv3_0.B();
        int bl3 = R$bool.default_circle_indicator_centered;
        n15 = (int)(resources3.getBoolean(bl3) ? 1 : 0);
        Resources resources4 = hv3_0.B();
        int n16 = R$bool.default_circle_indicator_snap;
        boolean bl4 = resources4.getBoolean(n16);
        int[] nArray = R$styleable.CirclePageIndicator;
        Object object = attributeSet;
        boolean bl5 = bl4;
        boolean bl6 = bl2;
        object = context.obtainStyledAttributes(attributeSet, nArray, (int)(bl2 ? 1 : 0), 0);
        int n17 = R$styleable.CirclePageIndicator_centered;
        this.mCentered = n15 = object.getBoolean(n17, n15 != 0);
        n15 = R$styleable.CirclePageIndicator_android_orientation;
        this.mOrientation = n8 = object.getInt(n15, n8);
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        n15 = R$styleable.CirclePageIndicator_pageColor;
        n7 = object.getColor(n15, n7);
        paint3.setColor(n7);
        paint3 = Paint.Style.STROKE;
        paint2.setStyle((Paint.Style)paint3);
        int n18 = R$styleable.CirclePageIndicator_strokeColor;
        n18 = object.getColor(n18, n10);
        paint2.setColor(n18);
        n18 = R$styleable.CirclePageIndicator_strokeWidth;
        float f8 = object.getDimension(n18, f6);
        paint2.setStrokeWidth(f8);
        paint.setStyle(style2);
        n18 = R$styleable.CirclePageIndicator_fillColor;
        n18 = object.getColor(n18, n3);
        paint.setColor(n18);
        n18 = R$styleable.CirclePageIndicator_vpiradius;
        this.mRadius = f8 = object.getDimension(n18, f7);
        n18 = R$styleable.CirclePageIndicator_extraRadius;
        paint2 = null;
        this.mExtraRadius = f8 = object.getDimension(n18, 0.0f);
        n18 = R$styleable.CirclePageIndicator_midDistance;
        this.midDistance = f8 = object.getDimension(n18, f7);
        n18 = R$styleable.CirclePageIndicator_snap;
        boolean bl7 = bl5;
        n18 = (int)(object.getBoolean(n18, bl5) ? 1 : 0);
        this.mSnap = n18;
        n18 = R$styleable.CirclePageIndicator_isStroke;
        bl7 = true;
        n18 = (int)(object.getBoolean(n18, bl7) ? 1 : 0);
        this.isStroke = n18;
        n18 = R$styleable.CirclePageIndicator_android_background;
        paint3 = object.getDrawable(n18);
        if (paint3 != null) {
            this.setBackgroundDrawable((Drawable)paint3);
        }
        object.recycle();
        paint3 = ViewConfiguration.get((Context)context);
        object = OC3.a;
        circlePageIndicator.mTouchSlop = n18 = paint3.getScaledPagingTouchSlop();
    }

    private int measureLong(int n3) {
        Object object;
        int n4 = View.MeasureSpec.getMode((int)n3);
        n3 = View.MeasureSpec.getSize((int)n3);
        int n7 = 0x40000000;
        float f5 = 2.0f;
        if (n4 != n7 && (object = this.mViewPager) != null) {
            object = ((ViewPager)((Object)object)).getAdapter();
            n7 = ((Uk2)object).c();
            int n8 = this.getPaddingLeft();
            float f6 = this.getPaddingRight() + n8;
            int n10 = n7 * 2;
            float f7 = n10;
            float f8 = this.mRadius;
            f7 = f7 * f8 + f6;
            f5 = (float)(n7 + -1) * f8 + f7 + 1.0f;
            n7 = (int)f5;
            n8 = -1 << -1;
            f6 = -0.0f;
            n3 = n4 == n8 ? Math.min(n7, n3) : n7;
        }
        return n3;
    }

    private int measureShort(int n3) {
        int n4 = View.MeasureSpec.getMode((int)n3);
        n3 = View.MeasureSpec.getSize((int)n3);
        int n7 = 0x40000000;
        float f5 = 2.0f;
        if (n4 != n7) {
            float f6 = this.mRadius * 2.0f;
            f5 = this.getPaddingTop();
            f6 += f5;
            f5 = this.getPaddingBottom();
            f6 += f5;
            f5 = 1.0f;
            n7 = (int)(f6 + f5);
            int n8 = -1 << -1;
            f6 = -0.0f;
            n3 = n4 == n8 ? Math.min(n7, n3) : n7;
        }
        return n3;
    }

    public int getFillColor() {
        return this.mPaintFill.getColor();
    }

    public float getMarginWidth() {
        return this.marginWidth;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getPageColor() {
        return this.mPaintPageFill.getColor();
    }

    public float getRadius() {
        return this.mRadius;
    }

    public int getStrokeColor() {
        return this.mPaintStroke.getColor();
    }

    public float getStrokeWidth() {
        return this.mPaintStroke.getStrokeWidth();
    }

    public boolean isCentered() {
        return this.mCentered;
    }

    public boolean isSnap() {
        return this.mSnap;
    }

    public void notifyDataSetChanged() {
        this.invalidate();
    }

    public void onDraw(Canvas canvas) {
        float f5;
        int n3;
        int n4;
        int n7;
        super.onDraw(canvas);
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null) {
            return;
        }
        int n8 = viewPager.getCurrentItem();
        Uk2 uk2 = this.mViewPager.getAdapter();
        int n10 = uk2.c();
        if (n10 == 0) {
            return;
        }
        int n14 = this.mCurrentPage;
        if (n14 >= n10) {
            this.setCurrentItem(n10 += -1);
            return;
        }
        n14 = this.mOrientation;
        if (n14 == 0) {
            n14 = this.getWidth();
            n7 = this.getPaddingLeft();
            n4 = this.getPaddingRight();
            n3 = this.getPaddingTop();
        } else {
            n14 = this.getHeight();
            n7 = this.getPaddingTop();
            n4 = this.getPaddingBottom();
            n3 = this.getPaddingLeft();
        }
        float f6 = this.midDistance;
        float f7 = 3.0f;
        f6 *= f7;
        float f8 = this.getMarginWidth();
        float f11 = 0.0f;
        float f12 = f8 - 0.0f;
        float f14 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (f14 > 0) {
            f6 = this.getMarginWidth();
        }
        float f15 = n3;
        f8 = this.mRadius;
        f15 += f8;
        float f16 = n10;
        f6 = f6 * f16 * f7;
        f8 += f7;
        float f17 = 2.0f;
        f8 = f8 * f17 * f16;
        f6 -= f8;
        f8 = f6 / f17;
        boolean bl2 = this.mCentered;
        if (bl2) {
            n14 = n14 - n7 - n4;
            f5 = (float)n14 / f17 - f8;
            f11 = 0.0f + f5;
        }
        f5 = n10 + -1;
        f6 /= f5;
        f5 = 0.0f;
        for (n14 = 0; n14 < n10; ++n14) {
            Paint paint;
            float f18;
            float f19 = (float)n14 * f6 + f11;
            n4 = this.mOrientation;
            if (n4 == 0) {
                f18 = f15;
            } else {
                f18 = f19;
                f19 = f15;
            }
            if (n14 == n8) {
                f19 += f7;
                f14 = 1065353216;
                f8 = 1.0f;
                f19 += f8;
                f18 = f18 + f7 + f8;
                f16 = this.mExtraRadius;
                f17 = this.mRadius;
                f16 = f16 + f17 + f7 + f8;
                Paint paint2 = this.mPaintFill;
                canvas.drawCircle(f19, f18, f16, paint2);
                continue;
            }
            f14 = (float)this.isStroke;
            if (f14 != false) {
                f8 = this.mRadius + f7;
                paint = this.mPaintStroke;
                canvas.drawCircle(f19 += f7, f18 += f7, f8, paint);
                continue;
            }
            f8 = this.mRadius + f7;
            paint = this.mPaintPageFill;
            canvas.drawCircle(f19 += f7, f18 += f7, f8, paint);
        }
    }

    public void onMeasure(int n3, int n4) {
        int n7 = this.mOrientation;
        if (n7 == 0) {
            n3 = this.measureLong(n3);
            n4 = this.measureShort(n4);
            this.setMeasuredDimension(n3, n4);
        } else {
            n3 = this.measureShort(n3);
            n4 = this.measureLong(n4);
            this.setMeasuredDimension(n3, n4);
        }
    }

    public void onPageScrollStateChanged(int n3) {
        this.mScrollState = n3;
        ViewPager$h viewPager$h = this.mListener;
        if (viewPager$h != null) {
            viewPager$h.onPageScrollStateChanged(n3);
        }
    }

    public void onPageScrolled(int n3, float f5, int n4) {
        this.mCurrentPage = n3;
        this.invalidate();
        ViewPager$h viewPager$h = this.mListener;
        if (viewPager$h != null) {
            viewPager$h.onPageScrolled(n3, f5, n4);
        }
    }

    public void onPageSelected(int n3) {
        ViewPager$h viewPager$h;
        int n4 = this.mSnap;
        if (n4 != 0 || (n4 = this.mScrollState) == 0) {
            this.mCurrentPage = n3;
            this.mSnapPage = n3;
            this.invalidate();
        }
        if ((viewPager$h = this.mListener) != null) {
            viewPager$h.onPageSelected(n3);
        }
    }

    public void onRestoreInstanceState(Parcelable object) {
        int n3;
        object = (CirclePageIndicator$SavedState)((Object)object);
        Parcelable parcelable = object.getSuperState();
        super.onRestoreInstanceState(parcelable);
        this.mCurrentPage = n3 = object.currentPage;
        this.mSnapPage = n3;
        this.requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        int n3;
        Parcelable parcelable = super.onSaveInstanceState();
        CirclePageIndicator$SavedState circlePageIndicator$SavedState = new CirclePageIndicator$SavedState(parcelable);
        circlePageIndicator$SavedState.currentPage = n3 = this.mCurrentPage;
        return circlePageIndicator$SavedState;
    }

    /*
     * Exception decompiling
     */
    public boolean onTouchEvent(MotionEvent var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [6 : 179->183)] java.lang.NullPointerException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void setCentered(boolean bl2) {
        this.mCentered = bl2;
        this.invalidate();
    }

    public void setCurrentItem(int n3) {
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            viewPager.setCurrentItem(n3);
            this.mCurrentPage = n3;
            this.invalidate();
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("ViewPager has not been bound.");
        throw illegalStateException;
    }

    public void setFillColor(int n3) {
        this.mPaintFill.setColor(n3);
        this.invalidate();
    }

    public void setMarginWidth(float f5) {
        this.marginWidth = f5;
    }

    public void setOnPageChangeListener(ViewPager$h viewPager$h) {
        this.mListener = viewPager$h;
    }

    public void setOrientation(int n3) {
        int n4;
        if (n3 != 0 && n3 != (n4 = 1)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
            throw illegalArgumentException;
        }
        this.mOrientation = n3;
        this.requestLayout();
    }

    public void setPageColor(int n3) {
        this.mPaintPageFill.setColor(n3);
        this.invalidate();
    }

    public void setRadius(float f5) {
        this.mRadius = f5;
        this.invalidate();
    }

    public void setSnap(boolean bl2) {
        this.mSnap = bl2;
        this.invalidate();
    }

    public void setStrokeColor(int n3) {
        this.mPaintStroke.setColor(n3);
        this.invalidate();
    }

    public void setStrokeWidth(float f5) {
        this.mPaintStroke.setStrokeWidth(f5);
        this.invalidate();
    }

    public void setViewPager(ViewPager object) {
        Object object2 = this.mViewPager;
        if (object2 == object) {
            return;
        }
        if (object2 != null) {
            object2.setOnPageChangeListener(null);
        }
        if ((object2 = ((ViewPager)((Object)object)).getAdapter()) != null) {
            this.mViewPager = object;
            ((ViewPager)((Object)object)).setOnPageChangeListener(this);
            this.invalidate();
            return;
        }
        object = new IllegalStateException("ViewPager does not have adapter instance.");
        throw object;
    }

    public void setViewPager(ViewPager viewPager, int n3) {
        this.setViewPager(viewPager);
        this.setCurrentItem(n3);
    }
}

