/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapShader
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.Rect
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.Drawable
 *  android.view.View
 */
package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.CircularRevealHelper$Delegate;
import com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo;
import com.google.android.material.math.MathUtils;

public class CircularRevealHelper {
    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    private static final boolean DEBUG = false;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY = 2;
    private boolean buildingCircularRevealCache;
    private Paint debugPaint;
    private final CircularRevealHelper$Delegate delegate;
    private boolean hasCircularRevealCache;
    private Drawable overlayDrawable;
    private CircularRevealWidget$RevealInfo revealInfo;
    private final Paint revealPaint;
    private final Path revealPath;
    private final Paint scrimPaint;
    private final View view;

    public CircularRevealHelper(CircularRevealHelper$Delegate circularRevealHelper$Delegate) {
        this.delegate = circularRevealHelper$Delegate;
        circularRevealHelper$Delegate = (View)circularRevealHelper$Delegate;
        this.view = circularRevealHelper$Delegate;
        circularRevealHelper$Delegate.setWillNotDraw(false);
        this.revealPath = circularRevealHelper$Delegate;
        super(7);
        this.revealPaint = circularRevealHelper$Delegate;
        super(1);
        this.scrimPaint = circularRevealHelper$Delegate;
        circularRevealHelper$Delegate.setColor(0);
    }

    private void drawDebugCircle(Canvas canvas, int n3, float f5) {
        this.debugPaint.setColor(n3);
        this.debugPaint.setStrokeWidth(f5);
        CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo = this.revealInfo;
        float f6 = circularRevealWidget$RevealInfo.centerX;
        float f7 = circularRevealWidget$RevealInfo.centerY;
        float f8 = circularRevealWidget$RevealInfo.radius;
        Paint paint = this.debugPaint;
        canvas.drawCircle(f6, f7, f8 -= (f5 /= 2.0f), paint);
    }

    private void drawDebugMode(Canvas canvas) {
        float f5;
        float f6;
        Object object = this.delegate;
        object.actualDraw(canvas);
        int n3 = this.shouldDrawScrim();
        if (n3 != 0) {
            object = this.revealInfo;
            f6 = ((CircularRevealWidget$RevealInfo)object).centerX;
            float f7 = ((CircularRevealWidget$RevealInfo)object).centerY;
            f5 = ((CircularRevealWidget$RevealInfo)object).radius;
            Paint paint = this.scrimPaint;
            canvas.drawCircle(f6, f7, f5, paint);
        }
        if ((n3 = this.shouldDrawCircularReveal()) != 0) {
            this.drawDebugCircle(canvas, -16777216, 10.0f);
            n3 = -65536;
            f5 = 0.0f / 0.0f;
            f6 = 5.0f;
            this.drawDebugCircle(canvas, n3, f6);
        }
        this.drawOverlayDrawable(canvas);
    }

    private void drawOverlayDrawable(Canvas canvas) {
        int n3 = this.shouldDrawOverlayDrawable();
        if (n3 != 0) {
            Rect rect = this.overlayDrawable.getBounds();
            CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo = this.revealInfo;
            float f5 = circularRevealWidget$RevealInfo.centerX;
            int n4 = rect.width();
            float f6 = n4;
            float f7 = 2.0f;
            CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo2 = this.revealInfo;
            f6 = circularRevealWidget$RevealInfo2.centerY;
            n3 = rect.height();
            float f8 = (float)n3 / f7;
            canvas.translate(f5 -= (f6 /= f7), f6 -= f8);
            rect = this.overlayDrawable;
            rect.draw(canvas);
            f8 = -f5;
            f5 = -f6;
            canvas.translate(f8, f5);
        }
    }

    private float getDistanceToFurthestCorner(CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo) {
        float f5 = circularRevealWidget$RevealInfo.centerX;
        float f6 = circularRevealWidget$RevealInfo.centerY;
        float f7 = this.view.getWidth();
        float f8 = this.view.getHeight();
        return MathUtils.distanceToFurthestCorner(f5, f6, 0.0f, 0.0f, f7, f8);
    }

    private void invalidateRevealInfo() {
        int n3 = STRATEGY;
        int n4 = 1;
        if (n3 == n4) {
            this.revealPath.rewind();
            CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo = this.revealInfo;
            if (circularRevealWidget$RevealInfo != null) {
                Path path = this.revealPath;
                float f5 = circularRevealWidget$RevealInfo.centerX;
                float f6 = circularRevealWidget$RevealInfo.centerY;
                float f7 = circularRevealWidget$RevealInfo.radius;
                Path.Direction direction = Path.Direction.CW;
                path.addCircle(f5, f6, f7, direction);
            }
        }
        this.view.invalidate();
    }

    private boolean shouldDrawCircularReveal() {
        boolean bl2;
        CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo = this.revealInfo;
        boolean bl3 = false;
        boolean bl4 = true;
        if (circularRevealWidget$RevealInfo != null && !(bl2 = circularRevealWidget$RevealInfo.isInvalid())) {
            bl2 = false;
            circularRevealWidget$RevealInfo = null;
        } else {
            bl2 = true;
        }
        int n3 = STRATEGY;
        if (n3 == 0) {
            if (!bl2 && (bl2 = this.hasCircularRevealCache)) {
                bl3 = true;
            }
            return bl3;
        }
        return bl2 ^ bl4;
    }

    private boolean shouldDrawOverlayDrawable() {
        Object object;
        boolean bl2 = this.buildingCircularRevealCache;
        if (!bl2 && (object = this.overlayDrawable) != null && (object = this.revealInfo) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private boolean shouldDrawScrim() {
        Paint paint;
        int n3 = this.buildingCircularRevealCache;
        if (n3 == 0 && (n3 = Color.alpha((int)(paint = this.scrimPaint).getColor())) != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            paint = null;
        }
        return n3 != 0;
    }

    public void buildCircularRevealCache() {
        int n3 = STRATEGY;
        if (n3 == 0) {
            BitmapShader bitmapShader;
            View view;
            int n4;
            n3 = 1;
            this.buildingCircularRevealCache = n3;
            this.hasCircularRevealCache = false;
            this.view.buildDrawingCache();
            Bitmap bitmap = this.view.getDrawingCache();
            if (bitmap == null && (n4 = (view = this.view).getWidth()) != 0 && (n4 = (view = this.view).getHeight()) != 0) {
                int n7 = this.view.getWidth();
                n4 = this.view.getHeight();
                bitmapShader = Bitmap.Config.ARGB_8888;
                bitmap = Bitmap.createBitmap((int)n7, (int)n4, (Bitmap.Config)bitmapShader);
                view = new Canvas(bitmap);
                bitmapShader = this.view;
                bitmapShader.draw((Canvas)view);
            }
            if (bitmap != null) {
                view = this.revealPaint;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                view.setShader((Shader)bitmapShader);
            }
            this.buildingCircularRevealCache = false;
            this.hasCircularRevealCache = n3;
        }
    }

    public void destroyCircularRevealCache() {
        int n3 = STRATEGY;
        if (n3 == 0) {
            n3 = 0;
            this.hasCircularRevealCache = false;
            this.view.destroyDrawingCache();
            this.revealPaint.setShader(null);
            View view = this.view;
            view.invalidate();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void draw(Canvas object) {
        block9: {
            int n3;
            block7: {
                block8: {
                    n3 = this.shouldDrawCircularReveal();
                    if (n3 == 0) break block7;
                    n3 = STRATEGY;
                    if (n3 == 0) break block8;
                    int n4 = 1;
                    float f5 = Float.MIN_VALUE;
                    if (n3 != n4) {
                        n4 = 2;
                        f5 = 2.8E-45f;
                        if (n3 != n4) {
                            String string2 = hj0_0.a(n3, "Unsupported strategy ");
                            IllegalStateException illegalStateException = new IllegalStateException(string2);
                            throw illegalStateException;
                        }
                        CircularRevealHelper$Delegate circularRevealHelper$Delegate = this.delegate;
                        circularRevealHelper$Delegate.actualDraw((Canvas)object);
                        n3 = (int)(this.shouldDrawScrim() ? 1 : 0);
                        if (n3 != 0) {
                            float f6 = this.view.getWidth();
                            circularRevealHelper$Delegate = this.view;
                            n3 = circularRevealHelper$Delegate.getHeight();
                            float f7 = n3;
                            Paint paint = this.scrimPaint;
                            float f8 = 0.0f;
                            Object var10_22 = null;
                            Object object2 = object;
                            object.drawRect(0.0f, 0.0f, f6, f7, paint);
                        }
                        break block9;
                    } else {
                        n3 = object.save();
                        Path path = this.revealPath;
                        object.clipPath(path);
                        CircularRevealHelper$Delegate circularRevealHelper$Delegate = this.delegate;
                        circularRevealHelper$Delegate.actualDraw((Canvas)object);
                        n4 = (int)(this.shouldDrawScrim() ? 1 : 0);
                        if (n4 != 0) {
                            float f11 = this.view.getWidth();
                            View view = this.view;
                            n4 = view.getHeight();
                            float f12 = n4;
                            Paint paint = this.scrimPaint;
                            Object var10_23 = null;
                            float f14 = 0.0f;
                            object.drawRect(0.0f, 0.0f, f11, f12, paint);
                        }
                        object.restoreToCount(n3);
                    }
                    break block9;
                }
                CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo = this.revealInfo;
                float f15 = circularRevealWidget$RevealInfo.centerX;
                float f16 = circularRevealWidget$RevealInfo.centerY;
                float f17 = circularRevealWidget$RevealInfo.radius;
                Paint paint = this.revealPaint;
                object.drawCircle(f15, f16, f17, paint);
                n3 = (int)(this.shouldDrawScrim() ? 1 : 0);
                if (n3 != 0) {
                    circularRevealWidget$RevealInfo = this.revealInfo;
                    f15 = circularRevealWidget$RevealInfo.centerX;
                    f16 = circularRevealWidget$RevealInfo.centerY;
                    f17 = circularRevealWidget$RevealInfo.radius;
                    paint = this.scrimPaint;
                    object.drawCircle(f15, f16, f17, paint);
                }
                break block9;
            }
            CircularRevealHelper$Delegate circularRevealHelper$Delegate = this.delegate;
            circularRevealHelper$Delegate.actualDraw((Canvas)object);
            n3 = (int)(this.shouldDrawScrim() ? 1 : 0);
            if (n3 != 0) {
                float f18 = this.view.getWidth();
                circularRevealHelper$Delegate = this.view;
                n3 = circularRevealHelper$Delegate.getHeight();
                float f19 = n3;
                Paint paint = this.scrimPaint;
                float f20 = 0.0f;
                Object var10_25 = null;
                Object object3 = object;
                object.drawRect(0.0f, 0.0f, f18, f19, paint);
            }
        }
        this.drawOverlayDrawable((Canvas)object);
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.overlayDrawable;
    }

    public int getCircularRevealScrimColor() {
        return this.scrimPaint.getColor();
    }

    public CircularRevealWidget$RevealInfo getRevealInfo() {
        CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo = this.revealInfo;
        if (circularRevealWidget$RevealInfo == null) {
            return null;
        }
        CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo2 = new CircularRevealWidget$RevealInfo(circularRevealWidget$RevealInfo);
        boolean bl2 = circularRevealWidget$RevealInfo2.isInvalid();
        if (bl2) {
            float f5;
            circularRevealWidget$RevealInfo2.radius = f5 = this.getDistanceToFurthestCorner(circularRevealWidget$RevealInfo2);
        }
        return circularRevealWidget$RevealInfo2;
    }

    public boolean isOpaque() {
        CircularRevealHelper$Delegate circularRevealHelper$Delegate = this.delegate;
        boolean bl2 = circularRevealHelper$Delegate.actualIsOpaque();
        if (bl2 && !(bl2 = this.shouldDrawCircularReveal())) {
            bl2 = true;
        } else {
            bl2 = false;
            circularRevealHelper$Delegate = null;
        }
        return bl2;
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable2) {
        this.overlayDrawable = drawable2;
        this.view.invalidate();
    }

    public void setCircularRevealScrimColor(int n3) {
        this.scrimPaint.setColor(n3);
        this.view.invalidate();
    }

    public void setRevealInfo(CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo) {
        if (circularRevealWidget$RevealInfo == null) {
            boolean bl2 = false;
            float f5 = 0.0f;
            circularRevealWidget$RevealInfo = null;
            this.revealInfo = null;
        } else {
            CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo2 = this.revealInfo;
            if (circularRevealWidget$RevealInfo2 == null) {
                this.revealInfo = circularRevealWidget$RevealInfo2 = new CircularRevealWidget$RevealInfo(circularRevealWidget$RevealInfo);
            } else {
                circularRevealWidget$RevealInfo2.set(circularRevealWidget$RevealInfo);
            }
            float f6 = circularRevealWidget$RevealInfo.radius;
            float f7 = this.getDistanceToFurthestCorner(circularRevealWidget$RevealInfo);
            float f8 = 1.0E-4f;
            boolean bl3 = MathUtils.geq(f6, f7, f8);
            if (bl3) {
                circularRevealWidget$RevealInfo = this.revealInfo;
                circularRevealWidget$RevealInfo.radius = f6 = Float.MAX_VALUE;
            }
        }
        this.invalidateRevealInfo();
    }
}

