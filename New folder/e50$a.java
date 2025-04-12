/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class e50$a {
    public boolean a = true;
    public String[] b;
    public String[] c;
    public boolean d;

    public final e50_0 a() {
        boolean bl2 = this.d;
        String[] stringArray = this.b;
        String[] stringArray2 = this.c;
        boolean bl3 = this.a;
        e50_0 e50_02 = new e50_0(bl3, bl2, stringArray, stringArray2);
        return e50_02;
    }

    public final void b(iu_1 ... object) {
        ArrayList<String> arrayList = "cipherSuites";
        Intrinsics.checkNotNullParameter(object, (String)((Object)arrayList));
        int n3 = this.a;
        if (n3 != 0) {
            int n4 = ((iu_1[])object).length;
            arrayList = new ArrayList<String>(n4);
            n4 = ((iu_1[])object).length;
            for (int i3 = 0; i3 < n4; ++i3) {
                String string2 = object[i3].a;
                arrayList.add(string2);
            }
            object = new String[]{};
            object = (String[])arrayList.toArray((T[])object);
            n3 = ((iu_1[])object).length;
            object = (String[])Arrays.copyOf(object, n3);
            this.c((String[])object);
            return;
        }
        arrayList = "no cipher suites for cleartext connections".toString();
        object = new IllegalArgumentException((String)((Object)arrayList));
        throw object;
    }

    public final void c(String ... object) {
        String string2 = "cipherSuites";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = this.a;
        if (n3 != 0) {
            n3 = ((String[])object).length;
            int n4 = 1;
            if (n3 == 0) {
                n3 = 1;
            } else {
                n3 = 0;
                string2 = null;
            }
            if ((n3 ^= n4) != 0) {
                object = (String[])object.clone();
                this.b = object;
                return;
            }
            string2 = "At least one cipher suite is required".toString();
            object = new IllegalArgumentException(string2);
            throw object;
        }
        string2 = "no cipher suites for cleartext connections".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final void d() {
        boolean bl2 = this.a;
        if (bl2) {
            this.d = true;
            return;
        }
        String string2 = "no TLS extensions for cleartext connections".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final void e(wn3_0 ... object) {
        ArrayList<String> arrayList = "tlsVersions";
        Intrinsics.checkNotNullParameter(object, (String)((Object)arrayList));
        int n3 = this.a;
        if (n3 != 0) {
            int n4 = ((wn3_0[])object).length;
            arrayList = new ArrayList<String>(n4);
            n4 = ((wn3_0[])object).length;
            for (int i3 = 0; i3 < n4; ++i3) {
                String string2 = object[i3].javaName();
                arrayList.add(string2);
            }
            object = new String[]{};
            object = (String[])arrayList.toArray((T[])object);
            n3 = ((wn3_0[])object).length;
            object = (String[])Arrays.copyOf(object, n3);
            this.f((String[])object);
            return;
        }
        arrayList = "no TLS versions for cleartext connections".toString();
        object = new IllegalArgumentException((String)((Object)arrayList));
        throw object;
    }

    public final void f(String ... object) {
        String string2 = "tlsVersions";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = this.a;
        if (n3 != 0) {
            n3 = ((String[])object).length;
            int n4 = 1;
            if (n3 == 0) {
                n3 = 1;
            } else {
                n3 = 0;
                string2 = null;
            }
            if ((n3 ^= n4) != 0) {
                object = (String[])object.clone();
                this.c = object;
                return;
            }
            string2 = "At least one TLS version is required".toString();
            object = new IllegalArgumentException(string2);
            throw object;
        }
        string2 = "no TLS versions for cleartext connections".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }
}

