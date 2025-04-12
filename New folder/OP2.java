/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Outline
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 */
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class OP2
extends Drawable {
    public float a;
    public final Paint b;
    public final RectF c;
    public final Rect d;
    public float e;
    public boolean f;
    public boolean g;
    public ColorStateList h;
    public PorterDuffColorFilter i;
    public ColorStateList j;
    public PorterDuff.Mode k;

    public OP2(float f5, ColorStateList colorStateList) {
        Paint paint;
        PorterDuff.Mode mode;
        int[] nArray = null;
        this.f = false;
        this.g = true;
        this.k = mode = PorterDuff.Mode.SRC_IN;
        this.a = f5;
        int n3 = 5;
        this.b = paint = new Paint(n3);
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf((int)0);
        }
        this.h = colorStateList;
        nArray = this.getState();
        n3 = this.h.getDefaultColor();
        int n4 = colorStateList.getColorForState(nArray, n3);
        paint.setColor(n4);
        this.c = paint;
        super();
        this.d = paint;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            Object object = this.getState();
            int n3 = colorStateList.getColorForState(object, 0);
            object = new PorterDuffColorFilter;
            object(n3, mode);
            return object;
        }
        return null;
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = this.getBounds();
        }
        RectF rectF = this.c;
        int n3 = rect.left;
        float f5 = n3;
        int n4 = rect.top;
        float f6 = n4;
        int bl2 = rect.right;
        float f7 = bl2;
        int n7 = rect.bottom;
        float f8 = n7;
        rectF.set(f5, f6, f7, f8);
        Rect rect2 = this.d;
        rect2.set(rect);
        int n8 = this.f;
        if (n8 != 0) {
            float f11 = this.e;
            f6 = this.a;
            boolean bl3 = this.g;
            f11 = PP2.b(f11, f6, bl3);
            f6 = this.e;
            f7 = this.a;
            boolean bl4 = this.g;
            f6 = PP2.a(f6, f7, bl4);
            double d2 = Math.ceil(f6);
            n4 = (int)d2;
            double d5 = Math.ceil(f11);
            n8 = (int)d5;
            rect2.inset(n4, n8);
            rectF.set(rect2);
        }
    }

    public final void draw(Canvas canvas) {
        boolean bl2;
        Paint paint = this.b;
        PorterDuffColorFilter porterDuffColorFilter = this.i;
        if (porterDuffColorFilter != null && (porterDuffColorFilter = paint.getColorFilter()) == null) {
            porterDuffColorFilter = this.i;
            paint.setColorFilter((ColorFilter)porterDuffColorFilter);
            bl2 = true;
        } else {
            bl2 = false;
            porterDuffColorFilter = null;
        }
        RectF rectF = this.c;
        float f5 = this.a;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        if (bl2) {
            canvas = null;
            paint.setColorFilter(null);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        Rect rect = this.d;
        float f5 = this.a;
        outline.setRoundRect(rect, f5);
    }

    public final boolean isStateful() {
        boolean bl2;
        ColorStateList colorStateList = this.j;
        if (colorStateList != null && (bl2 = colorStateList.isStateful()) || (colorStateList = this.h) != null && (bl2 = colorStateList.isStateful()) || (bl2 = super.isStateful())) {
            bl2 = true;
        } else {
            bl2 = false;
            colorStateList = null;
        }
        return bl2;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.b(rect);
    }

    public final boolean onStateChange(int[] object) {
        ColorStateList colorStateList = this.h;
        int n3 = colorStateList.getDefaultColor();
        int n4 = colorStateList.getColorForState(object, n3);
        colorStateList = this.b;
        n3 = colorStateList.getColor();
        boolean bl2 = true;
        if ((n3 = n4 != n3 ? 1 : 0) != 0) {
            colorStateList.setColor(n4);
        }
        if ((object = (Object)this.j) != null && (colorStateList = this.k) != null) {
            object = this.a((ColorStateList)object, (PorterDuff.Mode)colorStateList);
            this.i = (PorterDuffColorFilter)object;
            return bl2;
        }
        return n3 != 0;
    }

    public final void setAlpha(int n3) {
        this.b.setAlpha(n3);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        PorterDuff.Mode mode = this.k;
        colorStateList = this.a(colorStateList, mode);
        this.i = colorStateList;
        this.invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        ColorStateList colorStateList = this.j;
        mode = this.a(colorStateList, mode);
        this.i = mode;
        this.invalidateSelf();
    }
}

