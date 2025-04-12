/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetFileDescriptor
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 */
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;

public final class Fq0$a
implements CP1,
Fq0$e {
    public final Context a;

    public Fq0$a(Context context) {
        this.a = context;
    }

    public final Class a() {
        return AssetFileDescriptor.class;
    }

    public final void b(Object object) {
        ((AssetFileDescriptor)object).close();
    }

    public final BP1 c(OQ1 object) {
        Context context = this.a;
        object = new Fq0(context, this);
        return object;
    }

    public final Object d(int n3, Resources.Theme theme, Resources resources) {
        return resources.openRawResourceFd(n3);
    }
}

