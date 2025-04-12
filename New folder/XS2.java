/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.BlendMode
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 */
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

public final class XS2
extends Drawable
implements Drawable.Callback,
Animatable {
    public final Drawable a;
    public final WS2 b;
    public float c;
    public float d;
    public float e;

    public XS2(Drawable drawable2, WS2 wS2) {
        this.a = drawable2;
        this.b = wS2;
        this.e = 1.0f;
        drawable2.setCallback((Drawable.Callback)this);
    }

    public final void draw(Canvas canvas) {
        int n3 = canvas.save();
        try {
            float f5 = this.c;
            float f6 = this.d;
            canvas.translate(f5, f6);
            f5 = this.e;
            canvas.scale(f5, f5);
            Drawable drawable2 = this.a;
            drawable2.draw(canvas);
            return;
        }
        finally {
            canvas.restoreToCount(n3);
        }
    }

    public final int getAlpha() {
        return this.a.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return this.a.getOpacity();
    }

    public final void invalidateDrawable(Drawable drawable2) {
        this.invalidateSelf();
    }

    public final boolean isRunning() {
        boolean bl2;
        Drawable drawable2 = this.a;
        boolean bl3 = drawable2 instanceof Animatable;
        if (bl3 && (bl2 = (drawable2 = (Animatable)drawable2).isRunning())) {
            bl2 = true;
        } else {
            bl2 = false;
            drawable2 = null;
        }
        return bl2;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable2 = this.a;
        int n3 = drawable2.getIntrinsicWidth();
        int n4 = drawable2.getIntrinsicHeight();
        if (n3 > 0 && n4 > 0) {
            float f5;
            float f6;
            int n7 = rect.width();
            int n8 = rect.height();
            WS2 wS2 = this.b;
            double d2 = cj0_0.a(n3, n4, n7, n8, wS2);
            double d5 = n7;
            double d7 = (double)n3 * d2;
            d5 -= d7;
            d7 = 2;
            n7 = ok1_1.a(d5 / d7);
            d5 = n8;
            double d9 = (double)n4 * d2;
            n8 = ok1_1.a((d5 - d9) / d7);
            drawable2.setBounds(n7, n8, n3 += n7, n4 += n8);
            this.c = f6 = (float)rect.left;
            this.d = f5 = (float)rect.top;
            this.e = f5 = (float)d2;
            return;
        }
        drawable2.setBounds(rect);
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 1.0f;
    }

    public final boolean onLevelChange(int n3) {
        return this.a.setLevel(n3);
    }

    public final boolean onStateChange(int[] nArray) {
        return this.a.setState(nArray);
    }

    public final void scheduleDrawable(Drawable drawable2, Runnable runnable2, long l2) {
        this.scheduleSelf(runnable2, l2);
    }

    public final void setAlpha(int n3) {
        this.a.setAlpha(n3);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public final void setTint(int n3) {
        this.a.setTint(n3);
    }

    public final void setTintBlendMode(BlendMode blendMode) {
        me0.a(this.a, blendMode);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.a.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.a.setTintMode(mode);
    }

    public final void start() {
        Drawable drawable2 = this.a;
        boolean bl2 = drawable2 instanceof Animatable;
        if (bl2) {
            drawable2 = (Animatable)drawable2;
            drawable2.start();
        }
    }

    public final void stop() {
        Drawable drawable2 = this.a;
        boolean bl2 = drawable2 instanceof Animatable;
        if (bl2) {
            drawable2 = (Animatable)drawable2;
            drawable2.stop();
        }
    }

    public final void unscheduleDrawable(Drawable drawable2, Runnable runnable2) {
        this.unscheduleSelf(runnable2);
    }
}

