/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 */
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/*
 * Renamed from gJ3
 */
public class gj3_0
extends Drawable
implements Drawable.Callback,
fj3_0,
Pn3 {
    public static final PorterDuff.Mode g = PorterDuff.Mode.SRC_IN;
    public int a;
    public PorterDuff.Mode b;
    public boolean c;
    public ij3_0 d;
    public boolean e;
    public Drawable f;

    public final Drawable a() {
        return this.f;
    }

    public final void b(Drawable drawable2) {
        boolean bl2;
        Object object = this.f;
        if (object != null) {
            bl2 = false;
            object.setCallback(null);
        }
        this.f = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback)this);
            int n3 = drawable2.isVisible();
            bl2 = true;
            this.setVisible(n3 != 0, bl2);
            object = drawable2.getState();
            this.setState((int[])object);
            n3 = drawable2.getLevel();
            this.setLevel(n3);
            object = drawable2.getBounds();
            this.setBounds((Rect)object);
            object = this.d;
            if (object != null) {
                drawable2 = drawable2.getConstantState();
                object.b = drawable2;
            }
        }
        this.invalidateSelf();
    }

    public boolean c() {
        throw null;
    }

    public final ij3_0 d() {
        PorterDuff.Mode mode;
        ij3_0 ij3_02 = this.d;
        ij3_0 ij3_03 = new Drawable.ConstantState();
        int n3 = 0;
        ij3_03.c = null;
        ij3_03.d = mode = g;
        if (ij3_02 != null) {
            ij3_03.a = n3 = ij3_02.a;
            mode = ij3_02.b;
            ij3_03.b = mode;
            mode = ij3_02.c;
            ij3_03.c = mode;
            ij3_02 = ij3_02.d;
            ij3_03.d = ij3_02;
        }
        return ij3_03;
    }

    public final void draw(Canvas canvas) {
        this.f.draw(canvas);
    }

    public final boolean e(int[] nArray) {
        boolean bl2 = this.c();
        if (!bl2) {
            return false;
        }
        ij3_0 ij3_02 = this.d;
        ColorStateList colorStateList = ij3_02.c;
        ij3_02 = ij3_02.d;
        if (colorStateList != null && ij3_02 != null) {
            int n3 = colorStateList.getDefaultColor();
            int n4 = colorStateList.getColorForState(nArray, n3);
            int n7 = this.c;
            if (n7 == 0 || n4 != (n7 = this.a) || ij3_02 != (colorStateList = this.b)) {
                this.setColorFilter(n4, (PorterDuff.Mode)ij3_02);
                this.a = n4;
                this.b = ij3_02;
                this.c = n4 = 1;
                return n4 != 0;
            }
        } else {
            this.c = false;
            this.clearColorFilter();
        }
        return false;
    }

    public final int getChangingConfigurations() {
        int n3;
        int n4 = super.getChangingConfigurations();
        ij3_0 ij3_02 = this.d;
        if (ij3_02 != null) {
            n3 = ij3_02.getChangingConfigurations();
        } else {
            n3 = 0;
            ij3_02 = null;
        }
        n4 |= n3;
        n3 = this.f.getChangingConfigurations();
        return n4 | n3;
    }

    public final Drawable.ConstantState getConstantState() {
        Drawable.ConstantState constantState;
        ij3_0 ij3_02 = this.d;
        if (ij3_02 != null && (constantState = ij3_02.b) != null) {
            int n3;
            ij3_02.a = n3 = this.getChangingConfigurations();
            return this.d;
        }
        return null;
    }

    public final Drawable getCurrent() {
        return this.f.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.f.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f.getIntrinsicWidth();
    }

    public final int getLayoutDirection() {
        return ut0_0.b(this.f);
    }

    public final int getMinimumHeight() {
        return this.f.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f.getPadding(rect);
    }

    public final int[] getState() {
        return this.f.getState();
    }

    public final Region getTransparentRegion() {
        return this.f.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable2) {
        this.invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return this.f.isAutoMirrored();
    }

    public final boolean isStateful() {
        ij3_0 ij3_02;
        boolean bl2 = this.c();
        if (bl2 && (ij3_02 = this.d) != null) {
            ij3_02 = ij3_02.c;
        } else {
            bl2 = false;
            ij3_02 = null;
        }
        if (ij3_02 != null && (bl2 = ij3_02.isStateful()) || (bl2 = (ij3_02 = this.f).isStateful())) {
            bl2 = true;
        } else {
            bl2 = false;
            ij3_02 = null;
        }
        return bl2;
    }

    public final void jumpToCurrentState() {
        this.f.jumpToCurrentState();
    }

    public final Drawable mutate() {
        Object object;
        boolean bl2 = this.e;
        if (!bl2 && (object = super.mutate()) == this) {
            object = this.d();
            this.d = object;
            object = this.f;
            if (object != null) {
                object.mutate();
            }
            if ((object = this.d) != null) {
                Object object2 = this.f;
                object2 = object2 != null ? object2.getConstantState() : null;
                object.b = object2;
            }
            this.e = bl2 = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public final boolean onLayoutDirectionChanged(int n3) {
        return ut0_0.c(this.f, n3);
    }

    public final boolean onLevelChange(int n3) {
        return this.f.setLevel(n3);
    }

    public final void scheduleDrawable(Drawable drawable2, Runnable runnable2, long l2) {
        this.scheduleSelf(runnable2, l2);
    }

    public final void setAlpha(int n3) {
        this.f.setAlpha(n3);
    }

    public final void setAutoMirrored(boolean bl2) {
        this.f.setAutoMirrored(bl2);
    }

    public final void setChangingConfigurations(int n3) {
        this.f.setChangingConfigurations(n3);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }

    public final void setDither(boolean bl2) {
        this.f.setDither(bl2);
    }

    public final void setFilterBitmap(boolean bl2) {
        this.f.setFilterBitmap(bl2);
    }

    public boolean setState(int[] nArray) {
        Drawable drawable2 = this.f;
        boolean bl2 = drawable2.setState(nArray);
        boolean bl3 = this.e(nArray);
        if (!bl3 && !bl2) {
            bl3 = false;
            nArray = null;
        } else {
            bl3 = true;
        }
        return bl3;
    }

    public void setTint(int n3) {
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        this.setTintList(colorStateList);
    }

    public void setTintList(ColorStateList object) {
        this.d.c = object;
        object = this.f.getState();
        this.e((int[])object);
    }

    public void setTintMode(PorterDuff.Mode object) {
        this.d.d = object;
        object = this.f.getState();
        this.e((int[])object);
    }

    public final boolean setVisible(boolean bl2, boolean bl3) {
        Drawable drawable2;
        boolean bl4 = super.setVisible(bl2, bl3);
        bl2 = bl4 || (bl2 = (drawable2 = this.f).setVisible(bl2, bl3));
        return bl2;
    }

    public final void unscheduleDrawable(Drawable drawable2, Runnable runnable2) {
        this.unscheduleSelf(runnable2);
    }
}

