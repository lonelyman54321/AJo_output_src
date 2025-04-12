/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.net.Uri;
import android.os.Build;

/*
 * Renamed from lC2
 */
public final class lc2_0
implements BP1 {
    public final Context a;
    public final BP1 b;
    public final BP1 c;
    public final Class d;

    public lc2_0(Context context, BP1 bP1, BP1 bP12, Class clazz) {
        this.a = context = context.getApplicationContext();
        this.b = bP1;
        this.c = bP12;
        this.d = clazz;
    }

    public final BP1$a a(Object object, int n3, int n4, Z92 z92) {
        Object object2 = object;
        object2 = (Uri)object;
        k62 k622 = new k62(object2);
        Context context = this.a;
        BP1 bP1 = this.b;
        BP1 bP12 = this.c;
        Class clazz = this.d;
        lC2$d lC2$d = new lC2$d(context, bP1, bP12, (Uri)object2, n3, n4, z92, clazz);
        object = new BP1$a(k622, lC2$d);
        return object;
    }

    public final boolean b(Object object) {
        boolean bl2;
        object = (Uri)object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4 && (bl2 = FN1.a((Uri)object))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

