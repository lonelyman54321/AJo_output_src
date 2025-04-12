/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources$Theme
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 */
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/*
 * Renamed from zA3
 */
public abstract class za3_0
extends Drawable
implements Pn3 {
    public Drawable a;

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.applyTheme(theme);
        }
    }

    public final void clearColorFilter() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.clearColorFilter();
            return;
        }
        super.clearColorFilter();
    }

    public final Drawable getCurrent() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getCurrent();
        }
        return super.getCurrent();
    }

    public final int getMinimumHeight() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public final boolean getPadding(Rect rect) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public final int[] getState() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getState();
        }
        return super.getState();
    }

    public final Region getTransparentRegion() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public final void jumpToCurrentState() {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
    }

    public boolean onLevelChange(int n3) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.setLevel(n3);
        }
        return super.onLevelChange(n3);
    }

    public final void setChangingConfigurations(int n3) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setChangingConfigurations(n3);
            return;
        }
        super.setChangingConfigurations(n3);
    }

    public final void setColorFilter(int n3, PorterDuff.Mode mode) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setColorFilter(n3, mode);
            return;
        }
        super.setColorFilter(n3, mode);
    }

    public final void setFilterBitmap(boolean bl2) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setFilterBitmap(bl2);
        }
    }

    public final void setHotspot(float f5, float f6) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setHotspot(f5, f6);
        }
    }

    public final void setHotspotBounds(int n3, int n4, int n7, int n8) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setHotspotBounds(n3, n4, n7, n8);
        }
    }

    public final boolean setState(int[] nArray) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            return drawable2.setState(nArray);
        }
        return super.setState(nArray);
    }
}

