/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from ti0
 */
public final class ti0_1 {
    public static final /* synthetic */ int k;
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final Object j;

    static {
        im1_0.a("media3.datasource");
    }

    public ti0_1(Uri uri, long l2, int n3, byte[] byArray, Map map2, long l3, long l4, String string2, int n4, Object object) {
        Object object2;
        long l7;
        long l8;
        ti0_1 ti0_12 = this;
        long l12 = l2;
        byte[] byArray2 = byArray;
        long l14 = l3;
        long l15 = l4;
        long l16 = l2 + l3;
        boolean bl2 = false;
        long l17 = 0L;
        long l18 = l16 == l17 ? 0 : (l16 < l17 ? -1 : 1);
        int n7 = l18 >= 0 ? 1 : 0;
        ct3.a(n7 != 0);
        n7 = l14 == l17 ? 0 : (l14 < l17 ? -1 : 1);
        n7 = n7 >= 0 ? 1 : 0;
        ct3.a(n7 != 0);
        n7 = l15 == l17 ? 0 : (l15 < l17 ? -1 : 1);
        if (n7 > 0 || (l8 = (l7 = l15 - (l16 = (long)-1)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) {
            bl2 = true;
        }
        ct3.a(bl2);
        uri.getClass();
        ti0_12.a = uri;
        ti0_12.b = l12;
        int n8 = n3;
        ti0_12.c = n3;
        if (byArray2 == null || (n8 = byArray2.length) == 0) {
            n8 = 0;
            object2 = null;
            byArray2 = null;
        }
        ti0_12.d = byArray2;
        object2 = new HashMap(map2);
        object2 = Collections.unmodifiableMap(object2);
        ti0_12.e = object2;
        ti0_12.f = l14;
        ti0_12.g = l15;
        object2 = string2;
        ti0_12.h = string2;
        n8 = n4;
        ti0_12.i = n4;
        object2 = object;
        ti0_12.j = object;
    }

    public final ti0$a a() {
        int n3;
        long l2;
        Object object;
        ti0$a ti0$a = new Object();
        ti0$a.a = object = this.a;
        ti0$a.b = l2 = this.b;
        ti0$a.c = n3 = this.c;
        object = this.d;
        ti0$a.d = (byte[])object;
        object = this.e;
        ti0$a.e = object;
        ti0$a.f = l2 = this.f;
        ti0$a.g = l2 = this.g;
        object = this.h;
        ti0$a.h = object;
        ti0$a.i = n3 = this.i;
        object = this.j;
        ti0$a.j = object;
        return ti0$a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        String string2 = "DataSpec[";
        Serializable serializable = new StringBuilder(string2);
        int n3 = this.c;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    serializable = new IllegalStateException();
                    throw serializable;
                }
                string2 = "HEAD";
            } else {
                string2 = "POST";
            }
        } else {
            string2 = "GET";
        }
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(" ");
        string2 = this.a;
        ((StringBuilder)serializable).append((Object)string2);
        string2 = ", ";
        ((StringBuilder)serializable).append(string2);
        long l2 = this.f;
        ((StringBuilder)serializable).append(l2);
        ((StringBuilder)serializable).append(string2);
        l2 = this.g;
        ((StringBuilder)serializable).append(l2);
        ((StringBuilder)serializable).append(string2);
        String string3 = this.h;
        ((StringBuilder)serializable).append(string3);
        ((StringBuilder)serializable).append(string2);
        return g30.a(this.i, "]", (StringBuilder)serializable);
    }
}

