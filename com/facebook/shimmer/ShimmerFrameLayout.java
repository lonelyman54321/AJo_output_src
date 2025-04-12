/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.util.AttributeSet
 *  android.widget.FrameLayout
 */
package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.shimmer.R$styleable;
import com.facebook.shimmer.Shimmer;
import com.facebook.shimmer.Shimmer$AlphaHighlightBuilder;
import com.facebook.shimmer.Shimmer$Builder;
import com.facebook.shimmer.Shimmer$ColorHighlightBuilder;
import com.facebook.shimmer.ShimmerDrawable;

public class ShimmerFrameLayout
extends FrameLayout {
    public static final /* synthetic */ int a;
    private final Paint mContentPaint;
    private final ShimmerDrawable mShimmerDrawable;
    private boolean mShowShimmer;

    public ShimmerFrameLayout(Context context) {
        super(context);
        Object object;
        this.mContentPaint = object = new Paint();
        super();
        this.mShimmerDrawable = object;
        this.mShowShimmer = true;
        this.init(context, null);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object object;
        this.mContentPaint = object = new Paint();
        super();
        this.mShimmerDrawable = object;
        this.mShowShimmer = true;
        this.init(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        Object object;
        this.mContentPaint = object = new Paint();
        super();
        this.mShimmerDrawable = object;
        this.mShowShimmer = true;
        this.init(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int n3, int n4) {
        super(context, attributeSet, n3, n4);
        Object object;
        this.mContentPaint = object = new Paint();
        super();
        this.mShimmerDrawable = object;
        this.mShowShimmer = true;
        this.init(context, attributeSet);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void init(Context object, AttributeSet object2) {
        Throwable throwable2;
        block5: {
            block4: {
                block3: {
                    this.setWillNotDraw(false);
                    Object object3 = this.mShimmerDrawable;
                    object3.setCallback((Drawable.Callback)this);
                    if (object2 == null) {
                        object = new Shimmer$AlphaHighlightBuilder();
                        object = ((Shimmer$Builder)object).build();
                        this.setShimmer((Shimmer)object);
                        return;
                    }
                    object3 = R$styleable.ShimmerFrameLayout;
                    object = object.obtainStyledAttributes((AttributeSet)object2, (int[])object3, 0, 0);
                    try {
                        int n3 = R$styleable.ShimmerFrameLayout_shimmer_colored;
                        n3 = (int)(object.hasValue(n3) ? 1 : 0);
                        if (n3 == 0) break block3;
                        n3 = R$styleable.ShimmerFrameLayout_shimmer_colored;
                        if ((n3 = (int)(object.getBoolean(n3, false) ? 1 : 0)) == 0) break block3;
                        object2 = new Shimmer$ColorHighlightBuilder();
                        break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object2 = new Shimmer$AlphaHighlightBuilder();
            }
            object2 = ((Shimmer$Builder)object2).consumeAttributes((TypedArray)object);
            object2 = ((Shimmer$Builder)object2).build();
            this.setShimmer((Shimmer)object2);
            object.recycle();
            return;
        }
        object.recycle();
        throw throwable2;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean bl2 = this.mShowShimmer;
        if (bl2) {
            ShimmerDrawable shimmerDrawable = this.mShimmerDrawable;
            shimmerDrawable.draw(canvas);
        }
    }

    public void hideShimmer() {
        boolean bl2 = this.mShowShimmer;
        if (!bl2) {
            return;
        }
        this.stopShimmer();
        this.mShowShimmer = false;
        this.invalidate();
    }

    public boolean isShimmerStarted() {
        return this.mShimmerDrawable.isShimmerStarted();
    }

    public boolean isShimmerVisible() {
        return this.mShowShimmer;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mShimmerDrawable.maybeStartShimmer();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.stopShimmer();
    }

    /*
     * WARNING - void declaration
     */
    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        void var5_6;
        void var4_5;
        void var3_4;
        int n10;
        super.onLayout(bl2, n10, (int)var3_4, (int)var4_5, (int)var5_6);
        int n14 = this.getWidth();
        n10 = this.getHeight();
        this.mShimmerDrawable.setBounds(0, 0, n14, n10);
    }

    public ShimmerFrameLayout setShimmer(Shimmer shimmer) {
        int n3;
        ShimmerDrawable shimmerDrawable = this.mShimmerDrawable;
        shimmerDrawable.setShimmer(shimmer);
        if (shimmer != null && (n3 = shimmer.clipToChildren) != 0) {
            n3 = 2;
            shimmerDrawable = this.mContentPaint;
            this.setLayerType(n3, (Paint)shimmerDrawable);
        } else {
            n3 = 0;
            shimmer = null;
            shimmerDrawable = null;
            this.setLayerType(0, null);
        }
        return this;
    }

    public void showShimmer(boolean bl2) {
        boolean bl3 = this.mShowShimmer;
        if (bl3) {
            return;
        }
        this.mShowShimmer = bl3 = true;
        if (bl2) {
            this.startShimmer();
        }
    }

    public void startShimmer() {
        this.mShimmerDrawable.startShimmer();
    }

    public void stopShimmer() {
        this.mShimmerDrawable.stopShimmer();
    }

    public boolean verifyDrawable(Drawable drawable2) {
        boolean bl2;
        ShimmerDrawable shimmerDrawable;
        boolean bl3 = super.verifyDrawable(drawable2);
        if (!bl3 && drawable2 != (shimmerDrawable = this.mShimmerDrawable)) {
            bl2 = false;
            drawable2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

