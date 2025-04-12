/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 */
import android.content.res.Resources;
import java.io.IOException;

public final class Fq0$d
implements ei0_0 {
    public final Resources.Theme a;
    public final Resources b;
    public final Fq0$e c;
    public final int d;
    public Object e;

    public Fq0$d(Resources.Theme theme, Resources resources, Fq0$e fq0$e, int n3) {
        this.a = theme;
        this.b = resources;
        this.c = fq0$e;
        this.d = n3;
    }

    public final Class a() {
        return this.c.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        Object object = this.e;
        if (object == null) return;
        try {
            Fq0$e fq0$e = this.c;
            fq0$e.b(object);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final void cancel() {
    }

    public final void d(Az2 object, ei0$a ei0$a) {
        object = this.c;
        Resources.Theme theme = this.a;
        Resources resources = this.b;
        int n3 = this.d;
        object = object.d(n3, theme, resources);
        this.e = object;
        try {
            ei0$a.f(object);
        }
        catch (Resources.NotFoundException notFoundException) {
            ei0$a.c((Exception)((Object)notFoundException));
        }
    }

    public final pi0_0 e() {
        return pi0_0.LOCAL;
    }
}

