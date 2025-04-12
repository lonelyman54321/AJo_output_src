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

public final class Fq0
implements BP1 {
    public final Context a;
    public final Fq0$e b;

    public Fq0(Context context, Fq0$e fq0$e) {
        this.a = context = context.getApplicationContext();
        this.b = fq0$e;
    }

    public final BP1$a a(Object object, int n3, int n4, Z92 object2) {
        object = (Integer)object;
        U92 u92 = dk2_1.b;
        Resources resources = (u92 = (Resources.Theme)((Z92)object2).c(u92)) != null ? u92.getResources() : this.a.getResources();
        k62 k622 = new k62(object);
        Fq0$e fq0$e = this.b;
        int n7 = (Integer)object;
        Fq0$d fq0$d = new Fq0$d((Resources.Theme)u92, resources, fq0$e, n7);
        object2 = new BP1$a(k622, fq0$d);
        return object2;
    }
}

