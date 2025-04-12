/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.LinearGradient
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.RadialGradient
 *  android.graphics.Rect
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.Xfermode
 *  android.graphics.drawable.Drawable
 */
package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import com.facebook.shimmer.Shimmer;
import com.facebook.shimmer.ShimmerDrawable$1;

public final class ShimmerDrawable
extends Drawable {
    private final Rect mDrawRect;
    private final Matrix mShaderMatrix;
    private Shimmer mShimmer;
    private final Paint mShimmerPaint;
    private final ValueAnimator.AnimatorUpdateListener mUpdateListener;
    private ValueAnimator mValueAnimator;

    public ShimmerDrawable() {
        Rect rect;
        ShimmerDrawable$1 shimmerDrawable$1 = new ShimmerDrawable$1(this);
        this.mUpdateListener = shimmerDrawable$1;
        this.mShimmerPaint = shimmerDrawable$1;
        this.mDrawRect = rect = new Rect();
        super();
        this.mShaderMatrix = rect;
        shimmerDrawable$1.setAntiAlias(true);
    }

    private float offset(float f5, float f6, float f7) {
        return xu0_1.a(f6, f5, f7, f5);
    }

    private void updateShader() {
        Shimmer shimmer;
        ShimmerDrawable shimmerDrawable = this;
        Object object = this.getBounds();
        int n3 = object.width();
        int n4 = object.height();
        if (n3 != 0 && n4 != 0 && (shimmer = this.mShimmer) != null) {
            RadialGradient radialGradient;
            n3 = shimmer.width(n3);
            n4 = this.mShimmer.height(n4);
            shimmer = this.mShimmer;
            int n7 = shimmer.shape;
            int n8 = 1;
            if (n7 != n8) {
                float f5;
                int n10 = shimmer.direction;
                n7 = 0;
                float f6 = 0.0f;
                if (n10 != n8) {
                    int n14 = 3;
                    f5 = 4.2E-45f;
                    if (n10 != n14) {
                        n8 = 0;
                    }
                }
                if (n8 != 0) {
                    n3 = 0;
                    Object var12_13 = null;
                }
                if (n8 == 0) {
                    n4 = 0;
                    object = null;
                }
                f5 = n3;
                float f7 = n4;
                object = shimmerDrawable.mShimmer;
                int[] nArray = object.colors;
                float[] fArray = object.positions;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                n7 = 0;
                f6 = 0.0f;
                n8 = 0;
                shimmer = radialGradient;
                radialGradient = new LinearGradient(0.0f, 0.0f, f5, f7, nArray, fArray, tileMode);
            } else {
                float f8 = n3;
                n7 = 0x40000000;
                float f11 = 2.0f;
                float f12 = f8 / f11;
                f8 = n4;
                float f14 = f8 / f11;
                n4 = Math.max(n3, n4);
                double d2 = n4;
                double d5 = Math.sqrt(2.0);
                float f15 = (float)(d2 /= d5);
                object = this.mShimmer;
                int[] nArray = object.colors;
                object = object.positions;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                radialGradient = new RadialGradient(f12, f14, f15, nArray, (float[])object, tileMode);
            }
            object = shimmerDrawable.mShimmerPaint;
            object.setShader((Shader)radialGradient);
        }
    }

    private void updateValueAnimator() {
        Shimmer shimmer;
        boolean bl2;
        int n3 = 0;
        ValueAnimator valueAnimator = null;
        Shimmer shimmer2 = this.mShimmer;
        if (shimmer2 == null) {
            return;
        }
        shimmer2 = this.mValueAnimator;
        if (shimmer2 != null) {
            bl2 = shimmer2.isStarted();
            this.mValueAnimator.cancel();
            shimmer = this.mValueAnimator;
            shimmer.removeAllUpdateListeners();
        } else {
            bl2 = false;
            shimmer2 = null;
        }
        shimmer = this.mShimmer;
        long l2 = shimmer.repeatDelay;
        long l3 = shimmer.animationDuration;
        float f5 = (float)(l2 / l3) + 1.0f;
        int n4 = 2;
        float[] fArray = new float[n4];
        fArray[0] = 0.0f;
        n3 = 1;
        fArray[n3] = f5;
        this.mValueAnimator = valueAnimator = ValueAnimator.ofFloat((float[])fArray);
        int n7 = this.mShimmer.repeatMode;
        valueAnimator.setRepeatMode(n7);
        valueAnimator = this.mValueAnimator;
        n7 = this.mShimmer.repeatCount;
        valueAnimator.setRepeatCount(n7);
        valueAnimator = this.mValueAnimator;
        shimmer = this.mShimmer;
        l2 = shimmer.animationDuration;
        l3 = shimmer.repeatDelay;
        valueAnimator.setDuration(l2 += l3);
        valueAnimator = this.mValueAnimator;
        shimmer = this.mUpdateListener;
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)shimmer);
        if (bl2) {
            valueAnimator = this.mValueAnimator;
            valueAnimator.start();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void draw(Canvas canvas) {
        float f5;
        int n3;
        int n4;
        Shimmer shimmer;
        ValueAnimator valueAnimator;
        float f6;
        float f7;
        float f8;
        Shimmer shimmer2;
        block7: {
            float f11;
            block3: {
                block6: {
                    block4: {
                        block5: {
                            shimmer2 = this.mShimmer;
                            if (shimmer2 == null) return;
                            shimmer2 = this.mShimmerPaint.getShader();
                            if (shimmer2 == null) {
                                return;
                            }
                            shimmer2 = this.mShimmer;
                            double d2 = Math.tan(Math.toRadians(shimmer2.tilt));
                            f8 = (float)d2;
                            f11 = this.mDrawRect.height();
                            Rect rect = this.mDrawRect;
                            int n7 = rect.width();
                            f7 = (float)n7 * f8 + f11;
                            int n8 = this.mDrawRect.width();
                            f11 = n8;
                            f6 = this.mDrawRect.height();
                            f8 = f8 * f6 + f11;
                            valueAnimator = this.mValueAnimator;
                            f6 = 0.0f;
                            if (valueAnimator != null) {
                                f11 = valueAnimator.getAnimatedFraction();
                            } else {
                                n8 = 0;
                                f11 = 0.0f;
                                valueAnimator = null;
                            }
                            shimmer = this.mShimmer;
                            n4 = shimmer.direction;
                            n3 = 1;
                            f5 = Float.MIN_VALUE;
                            if (n4 == n3) break block3;
                            n3 = 2;
                            f5 = 2.8E-45f;
                            if (n4 == n3) break block4;
                            n3 = 3;
                            f5 = 4.2E-45f;
                            if (n4 == n3) break block5;
                            f7 = -f8;
                            f8 = this.offset(f7, f8, f11);
                            break block6;
                        }
                        f8 = -f7;
                        f8 = this.offset(f7, f8, f11);
                        break block7;
                    }
                    f7 = -f8;
                    f8 = this.offset(f8, f7, f11);
                }
                f6 = f8;
                f8 = 0.0f;
                shimmer2 = null;
                break block7;
            }
            f8 = -f7;
            f8 = this.offset(f8, f7, f11);
        }
        this.mShaderMatrix.reset();
        valueAnimator = this.mShaderMatrix;
        Shimmer shimmer3 = this.mShimmer;
        f7 = shimmer3.tilt;
        shimmer = this.mDrawRect;
        n4 = shimmer.width();
        float f12 = n4;
        n3 = 0x40000000;
        f5 = 2.0f;
        Rect rect = this.mDrawRect;
        int n10 = rect.height();
        float f14 = (float)n10 / f5;
        valueAnimator.setRotate(f7, f12 /= f5, f14);
        this.mShaderMatrix.postTranslate(f6, f8);
        shimmer2 = this.mShimmerPaint.getShader();
        valueAnimator = this.mShaderMatrix;
        shimmer2.setLocalMatrix((Matrix)valueAnimator);
        shimmer2 = this.mDrawRect;
        valueAnimator = this.mShimmerPaint;
        canvas.drawRect((Rect)shimmer2, (Paint)valueAnimator);
    }

    public int getOpacity() {
        int n3;
        boolean bl2;
        Shimmer shimmer = this.mShimmer;
        n3 = shimmer != null && ((bl2 = shimmer.clipToChildren) || (n3 = (int)(shimmer.alphaShimmer ? 1 : 0)) != 0) ? -3 : -1;
        return n3;
    }

    public boolean isShimmerStarted() {
        boolean bl2;
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null && (bl2 = valueAnimator.isStarted())) {
            bl2 = true;
        } else {
            bl2 = false;
            valueAnimator = null;
        }
        return bl2;
    }

    public void maybeStartShimmer() {
        boolean bl2;
        Object object = this.mValueAnimator;
        if (object != null && !(bl2 = object.isStarted()) && (object = this.mShimmer) != null && (bl2 = object.autoStart) && (object = this.getCallback()) != null) {
            object = this.mValueAnimator;
            object.start();
        }
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int n3 = rect.width();
        int n4 = rect.height();
        this.mDrawRect.set(0, 0, n3, n4);
        this.updateShader();
        this.maybeStartShimmer();
    }

    public void setAlpha(int n3) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setShimmer(Shimmer shimmer) {
        this.mShimmer = shimmer;
        if (shimmer != null) {
            shimmer = this.mShimmerPaint;
            Shimmer shimmer2 = this.mShimmer;
            boolean bl2 = shimmer2.alphaShimmer;
            shimmer2 = bl2 ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN;
            PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode((PorterDuff.Mode)shimmer2);
            shimmer.setXfermode((Xfermode)porterDuffXfermode);
        }
        this.updateShader();
        this.updateValueAnimator();
        this.invalidateSelf();
    }

    public void startShimmer() {
        boolean bl2;
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null && !(bl2 = this.isShimmerStarted()) && (valueAnimator = this.getCallback()) != null) {
            valueAnimator = this.mValueAnimator;
            valueAnimator.start();
        }
    }

    public void stopShimmer() {
        boolean bl2;
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null && (bl2 = this.isShimmerStarted())) {
            valueAnimator = this.mValueAnimator;
            valueAnimator.cancel();
        }
    }
}

