/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Outline
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.DrawableContainer
 *  android.graphics.drawable.GradientDrawable
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build$VERSION
 */
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

public final class hJ3
extends gj3_0 {
    public static Method h;

    public final boolean c() {
        Drawable drawable2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 21;
        boolean bl2 = false;
        if (n3 == n4 && ((n4 = (drawable2 = this.f) instanceof GradientDrawable) != 0 || (n4 = drawable2 instanceof DrawableContainer) != 0 || (n4 = drawable2 instanceof InsetDrawable) != 0 || (n3 = drawable2 instanceof RippleDrawable) != 0)) {
            bl2 = true;
        }
        return bl2;
    }

    public final Rect getDirtyBounds() {
        return this.f.getDirtyBounds();
    }

    public final void getOutline(Outline outline) {
        this.f.getOutline(outline);
    }

    public final boolean isProjected() {
        Method method;
        Object object = this.f;
        if (object != null && (method = h) != null) {
            try {
                object = method.invoke(object, null);
            }
            catch (Exception exception) {}
            object = (Boolean)object;
            return (Boolean)object;
        }
        return false;
    }

    public final void setHotspot(float f5, float f6) {
        this.f.setHotspot(f5, f6);
    }

    public final void setHotspotBounds(int n3, int n4, int n7, int n8) {
        this.f.setHotspotBounds(n3, n4, n7, n8);
    }

    public final boolean setState(int[] nArray) {
        boolean bl2 = super.setState(nArray);
        if (bl2) {
            this.invalidateSelf();
            return true;
        }
        return false;
    }

    public final void setTint(int n3) {
        boolean bl2 = this.c();
        if (bl2) {
            super.setTint(n3);
        } else {
            Drawable drawable2 = this.f;
            drawable2.setTint(n3);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        boolean bl2 = this.c();
        if (bl2) {
            super.setTintList(colorStateList);
        } else {
            Drawable drawable2 = this.f;
            drawable2.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        boolean bl2 = this.c();
        if (bl2) {
            super.setTintMode(mode);
        } else {
            Drawable drawable2 = this.f;
            drawable2.setTintMode(mode);
        }
    }
}

