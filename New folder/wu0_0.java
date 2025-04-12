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
 */
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/*
 * Renamed from wu0
 */
public class wu0_0
extends Drawable
implements Drawable.Callback {
    private Drawable mDrawable;

    public wu0_0(Drawable drawable2) {
        this.setDrawable(drawable2);
    }

    public void draw(Canvas canvas) {
        this.mDrawable.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.mDrawable.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.mDrawable.getCurrent();
    }

    public Drawable getDrawable() {
        return this.mDrawable;
    }

    public int getIntrinsicHeight() {
        return this.mDrawable.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.mDrawable.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.mDrawable.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.mDrawable.getMinimumWidth();
    }

    public int getOpacity() {
        return this.mDrawable.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.mDrawable.getPadding(rect);
    }

    public int[] getState() {
        return this.mDrawable.getState();
    }

    public Region getTransparentRegion() {
        return this.mDrawable.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable2) {
        this.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.mDrawable.isAutoMirrored();
    }

    public boolean isStateful() {
        return this.mDrawable.isStateful();
    }

    public void jumpToCurrentState() {
        this.mDrawable.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.mDrawable.setBounds(rect);
    }

    public boolean onLevelChange(int n3) {
        return this.mDrawable.setLevel(n3);
    }

    public void scheduleDrawable(Drawable drawable2, Runnable runnable2, long l2) {
        this.scheduleSelf(runnable2, l2);
    }

    public void setAlpha(int n3) {
        this.mDrawable.setAlpha(n3);
    }

    public void setAutoMirrored(boolean bl2) {
        this.mDrawable.setAutoMirrored(bl2);
    }

    public void setChangingConfigurations(int n3) {
        this.mDrawable.setChangingConfigurations(n3);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mDrawable.setColorFilter(colorFilter);
    }

    public void setDither(boolean bl2) {
        this.mDrawable.setDither(bl2);
    }

    public void setDrawable(Drawable drawable2) {
        Drawable drawable3 = this.mDrawable;
        if (drawable3 != null) {
            drawable3.setCallback(null);
        }
        this.mDrawable = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback)this);
        }
    }

    public void setFilterBitmap(boolean bl2) {
        this.mDrawable.setFilterBitmap(bl2);
    }

    public void setHotspot(float f5, float f6) {
        this.mDrawable.setHotspot(f5, f6);
    }

    public void setHotspotBounds(int n3, int n4, int n7, int n8) {
        this.mDrawable.setHotspotBounds(n3, n4, n7, n8);
    }

    public boolean setState(int[] nArray) {
        return this.mDrawable.setState(nArray);
    }

    public void setTint(int n3) {
        this.mDrawable.setTint(n3);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.mDrawable.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.mDrawable.setTintMode(mode);
    }

    public boolean setVisible(boolean bl2, boolean bl3) {
        Drawable drawable2;
        boolean bl4 = super.setVisible(bl2, bl3);
        bl2 = bl4 || (bl2 = (drawable2 = this.mDrawable).setVisible(bl2, bl3));
        return bl2;
    }

    public void unscheduleDrawable(Drawable drawable2, Runnable runnable2) {
        this.unscheduleSelf(runnable2);
    }
}

