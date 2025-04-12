/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 */
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class Tk$c
extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public Tk$c(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        Drawable drawable2;
        tk_0 tk_02 = new tk_0();
        tk_02.a = drawable2 = this.a.newDrawable();
        Tk$a tk$a = tk_02.f;
        drawable2.setCallback((Drawable.Callback)tk$a);
        return tk_02;
    }

    public final Drawable newDrawable(Resources resources) {
        tk_0 tk_02 = new tk_0();
        resources = this.a.newDrawable(resources);
        tk_02.a = resources;
        Tk$a tk$a = tk_02.f;
        resources.setCallback((Drawable.Callback)tk$a);
        return tk_02;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme object) {
        tk_0 tk_02 = new tk_0();
        resources = this.a.newDrawable(resources, object);
        tk_02.a = resources;
        object = tk_02.f;
        resources.setCallback((Drawable.Callback)object);
        return tk_02;
    }
}

