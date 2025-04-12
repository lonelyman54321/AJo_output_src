/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;
import java.io.File;

public abstract class lC2$a
implements CP1 {
    public final Context a;
    public final Class b;

    public lC2$a(Context context, Class clazz) {
        this.a = context;
        this.b = clazz;
    }

    public final BP1 c(OQ1 object) {
        Class clazz = this.b;
        BP1 bP1 = ((OQ1)object).c(File.class, clazz);
        object = ((OQ1)object).c(Uri.class, clazz);
        Context context = this.a;
        lc2_0 lc2_02 = new lc2_0(context, bP1, (BP1)object, clazz);
        return lc2_02;
    }
}

