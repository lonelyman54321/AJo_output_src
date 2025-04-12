/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class Fq0$b
implements CP1,
Fq0$e {
    public final Context a;

    public Fq0$b(Context context) {
        this.a = context;
    }

    public final Class a() {
        return Drawable.class;
    }

    public final BP1 c(OQ1 object) {
        Context context = this.a;
        object = new Fq0(context, this);
        return object;
    }

    public final Object d(int n3, Resources.Theme theme, Resources resources) {
        resources = this.a;
        return xt0_0.a((Context)resources, (Context)resources, n3, theme);
    }
}

