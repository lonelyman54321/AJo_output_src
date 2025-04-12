/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.graphics.drawable.VectorDrawable
 */
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

public final class AA3$h
extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public AA3$h(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        aa3_1 aa3_12 = new aa3_1();
        VectorDrawable vectorDrawable = (VectorDrawable)this.a.newDrawable();
        aa3_12.a = vectorDrawable;
        return aa3_12;
    }

    public final Drawable newDrawable(Resources resources) {
        aa3_1 aa3_12 = new aa3_1();
        resources = (VectorDrawable)this.a.newDrawable(resources);
        aa3_12.a = resources;
        return aa3_12;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        aa3_1 aa3_12 = new aa3_1();
        resources = (VectorDrawable)this.a.newDrawable(resources, theme);
        aa3_12.a = resources;
        return aa3_12;
    }
}

