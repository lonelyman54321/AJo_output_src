/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 */
import android.content.Context;
import android.content.res.Resources;
import java.io.InputStream;

public final class Fq0$c
implements CP1,
Fq0$e {
    public final Context a;

    public Fq0$c(Context context) {
        this.a = context;
    }

    public final Class a() {
        return InputStream.class;
    }

    public final void b(Object object) {
        ((InputStream)object).close();
    }

    public final BP1 c(OQ1 object) {
        Context context = this.a;
        object = new Fq0(context, this);
        return object;
    }

    public final Object d(int n3, Resources.Theme theme, Resources resources) {
        return resources.openRawResource(n3);
    }
}

