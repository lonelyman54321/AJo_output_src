/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
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
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.viewpager.widget.ViewPager$h;
import androidx.viewpager2.widget.ViewPager2;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$bool;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$integer;
import com.ril.ajio.R$styleable;
import com.ril.ajio.customviews.widgets.CirclePageIndicator2$SavedState;

public class CirclePageIndicator2
extends View
implements ViewPager$h {
    private static final int FILL_RADIUS = 1;
    private static final int INVALID_POINTER = 255;
    private static final int SELECTED_STROKE_RADIUS = 3;
    private boolean isDeselectFillRequired;
    private boolean isStroke;
    private int mActivePointerId;
    private boolean mCentered;
    private int mCurrentPage;
    private float mExtraRadius;
    private boolean mIsDragging;
    private float mLastMotionX;
    private int mOrientation;
    private final Paint mPaintDeselectFill;
    private final Paint mPaintFill;
    private final Paint mPaintPageFill;
    private final Paint mPaintStroke;
    private float mRadius;
    private int mScrollState;
    private boolean mSnap;
    private int mSnapPage;
    private int mTouchSlop;
    private ViewPager2 mViewPager;
    private float marginWidth;
    private float midDistance;

    public CirclePageIndicator2(Context context) {
        this(context, null);
    }

    public CirclePageIndicator2(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.vpiCirclePageIndicatorStyle;
        this(context, attributeSet, n3);
    }

    public CirclePageIndicator2(Context context, AttributeSet attributeSet, int n3) {
        float f5;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        CirclePageIndicator2 circlePageIndicator2 = this;
        super(context, attributeSet, n3);
        int n4 = 1;
        this.mPaintPageFill = paint4 = new Paint(n4);
        this.mPaintStroke = paint3 = new Paint(n4);
        this.mPaintFill = paint2 = new Paint(n4);
        this.mPaintDeselectFill = paint = new Paint(n4);
        this.mLastMotionX = f5 = -1.0f;
        this.mActivePointerId = -1;
        this.marginWidth = f5;
        f5 = 0.0f;
        TypedArray typedArray = null;
        this.isDeselectFillRequired = false;
        int n7 = this.isInEditMode();
        if (n7 != 0) {
            return;
        }
        n7 = hv3_0.m(R$color.default_circle_indicator_page_color);
        int n8 = hv3_0.m(R$color.default_circle_indicator_fill_color);
        int n10 = hv3_0.w(R$integer.default_circle_indicator_orientation);
        int n14 = hv3_0.m(R$color.default_circle_indicator_stroke_color);
        Resources resources = hv3_0.C();
        int n15 = R$dimen.default_circle_indicator_stroke_width;
        float f6 = resources.getDimension(n15);
        Resources resources2 = hv3_0.C();
        int bl2 = R$dimen.default_circle_indicator_radius;
        float f7 = resources2.getDimension(bl2);
        Resources resources3 = hv3_0.B();
        int n16 = R$bool.default_circle_indicator_centered;
        boolean bl3 = resources3.getBoolean(n16);
        Resources resources4 = hv3_0.B();
        int n17 = R$bool.default_circle_indicator_snap;
        boolean bl4 = resources4.getBoolean(n17);
        int[] nArray = R$styleable.CirclePageIndicator;
        resources4 = attributeSet;
        n15 = n3;
        typedArray = context.obtainStyledAttributes(attributeSet, nArray, n3, 0);
        n15 = R$styleable.CirclePageIndicator_centered;
        n15 = (int)(typedArray.getBoolean(n15, bl3) ? 1 : 0);
        this.mCentered = n15;
        n15 = R$styleable.CirclePageIndicator_android_orientation;
        this.mOrientation = n10 = typedArray.getInt(n15, n10);
        Paint.Style style2 = Paint.Style.FILL;
        paint4.setStyle(style2);
        n15 = R$styleable.CirclePageIndicator_pageColor;
        n15 = typedArray.getColor(n15, n7);
        paint4.setColor(n15);
        paint4 = Paint.Style.STROKE;
        paint3.setStyle((Paint.Style)paint4);
        int n18 = R$styleable.CirclePageIndicator_strokeColor;
        n18 = typedArray.getColor(n18, n14);
        paint3.setColor(n18);
        n18 = R$styleable.CirclePageIndicator_strokeWidth;
        float f8 = typedArray.getDimension(n18, f6);
        paint3.setStrokeWidth(f8);
        paint.setStyle(style2);
        n18 = R$styleable.CirclePageIndicator_pageColor;
        n18 = typedArray.getColor(n18, n7);
        paint.setColor(n18);
        paint.setAlpha(71);
        paint2.setStyle(style2);
        n18 = R$styleable.CirclePageIndicator_fillColor;
        n18 = typedArray.getColor(n18, n8);
        paint2.setColor(n18);
        n18 = R$styleable.CirclePageIndicator_vpiradius;
        this.mRadius = f8 = typedArray.getDimension(n18, f7);
        n18 = R$styleable.CirclePageIndicator_extraRadius;
        paint2 = null;
        this.mExtraRadius = f8 = typedArray.getDimension(n18, 0.0f);
        n18 = R$styleable.CirclePageIndicator_midDistance;
        this.midDistance = f8 = typedArray.getDimension(n18, f7);
        n18 = R$styleable.CirclePageIndicator_snap;
        boolean bl5 = bl4;
        n18 = (int)(typedArray.getBoolean(n18, bl4) ? 1 : 0);
        this.mSnap = n18;
        n18 = R$styleable.CirclePageIndicator_isStroke;
        bl5 = true;
        n18 = (int)(typedArray.getBoolean(n18, bl5) ? 1 : 0);
        this.isStroke = n18;
        n18 = R$styleable.CirclePageIndicator_android_background;
        paint4 = typedArray.getDrawable(n18);
        if (paint4 != null) {
            this.setBackgroundDrawable((Drawable)paint4);
        }
        typedArray.recycle();
        paint4 = ViewConfiguration.get((Context)context);
        circlePageIndicator2.mTouchSlop = n18 = paint4.getScaledPagingTouchSlop();
    }

    private int measureLong(int n3) {
        Object object;
        int n4 = View.MeasureSpec.getMode((int)n3);
        n3 = View.MeasureSpec.getSize((int)n3);
        int n7 = 0x40000000;
        float f5 = 2.0f;
        if (n4 != n7 && (object = this.mViewPager) != null) {
            if ((object = ((ViewPager2)((Object)object)).getAdapter()) != null) {
                object = this.mViewPager.getAdapter();
                n7 = ((RecyclerView$f)object).getItemCount();
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
            } else {
                n3 = 0;
            }
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
        int n8;
        super.onDraw(canvas);
        ViewPager2 viewPager2 = this.mViewPager;
        if (viewPager2 == null) {
            return;
        }
        int n10 = viewPager2.getCurrentItem();
        RecyclerView$f recyclerView$f = this.mViewPager.getAdapter();
        int n14 = 0;
        if (recyclerView$f != null) {
            recyclerView$f = this.mViewPager.getAdapter();
            n8 = recyclerView$f.getItemCount();
        } else {
            n8 = 0;
            recyclerView$f = null;
        }
        if (n8 == 0) {
            return;
        }
        int n15 = this.mCurrentPage;
        if (n15 >= n8) {
            this.setCurrentItem(n8 += -1);
            return;
        }
        n15 = this.mOrientation;
        if (n15 == 0) {
            n15 = this.getWidth();
            n7 = this.getPaddingLeft();
            n4 = this.getPaddingRight();
            n3 = this.getPaddingTop();
        } else {
            n15 = this.getHeight();
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
        float f16 = n8;
        f6 = f6 * f16 * f7;
        f8 += f7;
        float f17 = 2.0f;
        f8 = f8 * f17 * f16;
        f6 -= f8;
        f8 = f6 / f17;
        boolean bl2 = this.mCentered;
        if (bl2) {
            n15 = n15 - n7 - n4;
            f5 = (float)n15 / f17 - f8;
            f11 = 0.0f + f5;
        }
        n15 = n8 + -1;
        f5 = n15;
        f6 /= f5;
        while (n14 < n8) {
            Paint paint;
            float f18;
            f5 = (float)n14 * f6 + f11;
            n7 = this.mOrientation;
            if (n7 == 0) {
                f18 = f15;
            } else {
                f18 = f5;
                f5 = f15;
            }
            n4 = 1065353216;
            float f19 = 1.0f;
            if (n14 == n10) {
                f5 = f5 + f7 + f19;
                f18 = f18 + f7 + f19;
                f8 = this.mExtraRadius;
                f16 = this.mRadius;
                f8 = f8 + f16 + f7 + f19;
                paint = this.mPaintFill;
                canvas.drawCircle(f5, f18, f8, paint);
            } else {
                Paint paint2;
                f14 = (float)this.isStroke;
                if (f14 != false) {
                    f14 = (float)this.isDeselectFillRequired;
                    if (f14 != false) {
                        f5 = f5 + f7 + f19;
                        f18 = f18 + f7 + f19;
                        f8 = this.mExtraRadius;
                        f16 = this.mRadius;
                        f8 = f8 + f16 + f7 + f19;
                        paint = this.mPaintDeselectFill;
                        canvas.drawCircle(f5, f18, f8, paint);
                    } else {
                        f19 = this.mRadius + f7;
                        paint2 = this.mPaintStroke;
                        canvas.drawCircle(f5 += f7, f18 += f7, f19, paint2);
                    }
                } else {
                    f19 = this.mRadius + f7;
                    paint2 = this.mPaintPageFill;
                    canvas.drawCircle(f5 += f7, f18 += f7, f19, paint2);
                }
            }
            ++n14;
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
    }

    public void onPageScrolled(int n3, float f5, int n4) {
        this.mCurrentPage = n3;
        this.invalidate();
    }

    public void onPageSelected(int n3) {
        int n4 = this.mSnap;
        if (n4 != 0 || (n4 = this.mScrollState) == 0) {
            this.mCurrentPage = n3;
            this.mSnapPage = n3;
            this.invalidate();
        }
    }

    public void onRestoreInstanceState(Parcelable object) {
        int n3;
        object = (CirclePageIndicator2$SavedState)((Object)object);
        Parcelable parcelable = object.getSuperState();
        super.onRestoreInstanceState(parcelable);
        this.mCurrentPage = n3 = object.currentPage;
        this.mSnapPage = n3;
        this.requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        int n3;
        Parcelable parcelable = super.onSaveInstanceState();
        CirclePageIndicator2$SavedState circlePageIndicator2$SavedState = new CirclePageIndicator2$SavedState(parcelable);
        circlePageIndicator2$SavedState.currentPage = n3 = this.mCurrentPage;
        return circlePageIndicator2$SavedState;
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
        ViewPager2 viewPager2 = this.mViewPager;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(n3);
            this.mCurrentPage = n3;
            this.invalidate();
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("ViewPager has not been bound.");
        throw illegalStateException;
    }

    public void setDeselectFillRequired(boolean bl2) {
        this.isDeselectFillRequired = bl2;
    }

    public void setFillColor(int n3) {
        this.mPaintFill.setColor(n3);
        this.invalidate();
    }

    public void setMarginWidth(float f5) {
        this.marginWidth = f5;
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

    public void setViewPager(ViewPager2 viewPager2) {
        ViewPager2 viewPager22 = this.mViewPager;
        if (viewPager22 == viewPager2) {
            return;
        }
        this.mViewPager = viewPager2;
        this.invalidate();
    }

    public void setViewPager(ViewPager2 viewPager2, int n3) {
        this.setViewPager(viewPager2);
        this.setCurrentItem(n3);
    }
}

