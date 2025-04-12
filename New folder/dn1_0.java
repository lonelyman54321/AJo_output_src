/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;

/*
 * Renamed from DN1
 */
public final class dn1_0
implements BP1 {
    public final Context a;

    public dn1_0(Context context) {
        this.a = context;
    }

    public final BP1$a a(Object object, int n3, int n4, Z92 object2) {
        object = (Uri)object;
        k62 k622 = new k62(object);
        Context context = this.a;
        object2 = new DN1$b(context, (Uri)object);
        BP1$a bP1$a = new BP1$a(k622, (ei0_0)object2);
        return bP1$a;
    }

    public final boolean b(Object object) {
        return FN1.a((Uri)object);
    }
}

