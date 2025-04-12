/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealCall;

/*
 * Renamed from TE2
 */
public final class te2_2
implements nj1$a {
    public final RealCall a;
    public final List b;
    public final int c;
    public final zc0_2 d;
    public final kj2_2 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public te2_2(RealCall realCall, List list, int n3, zc0_2 zc0_22, kj2_2 kj2_22, int n4, int n7, int n8) {
        Intrinsics.checkNotNullParameter(realCall, "call");
        Intrinsics.checkNotNullParameter(list, "interceptors");
        Intrinsics.checkNotNullParameter(kj2_22, "request");
        this.a = realCall;
        this.b = list;
        this.c = n3;
        this.d = zc0_22;
        this.e = kj2_22;
        this.f = n4;
        this.g = n7;
        this.h = n8;
    }

    public static te2_2 c(te2_2 te2_22, int n3, zc0_2 zc0_22, kj2_2 kj2_22, int n4, int n7, int n8, int n10) {
        zc0_2 zc0_23;
        Object object;
        te2_2 te2_23 = te2_22;
        int n14 = n10 & 1;
        int n15 = n14 != 0 ? (n14 = te2_22.c) : n3;
        n14 = n10 & 2;
        if (n14 != 0) {
            object = te2_23.d;
            zc0_23 = object;
        } else {
            zc0_23 = zc0_22;
        }
        n14 = n10 & 4;
        Object object2 = n14 != 0 ? (object = te2_23.e) : kj2_22;
        n14 = n10 & 8;
        int n16 = n14 != 0 ? (n14 = te2_23.f) : n4;
        n14 = n10 & 0x10;
        int n17 = n14 != 0 ? (n14 = te2_23.g) : n7;
        n14 = n10 & 0x20;
        int n18 = n14 != 0 ? (n14 = te2_23.h) : n8;
        te2_22.getClass();
        Intrinsics.checkNotNullParameter(object2, "request");
        RealCall realCall = te2_23.a;
        List list = te2_23.b;
        object = new te2_2(realCall, list, n15, zc0_23, (kj2_2)object2, n16, n17, n18);
        return object;
    }

    public final cl2_2 a(kj2_2 kj2_22) {
        Object object = kj2_22;
        Object object2 = "request";
        Intrinsics.checkNotNullParameter(kj2_22, (String)object2);
        List list = this.b;
        int n3 = list.size();
        int n4 = this.c;
        if (n4 < n3) {
            Object object3;
            n3 = this.i;
            int n7 = 1;
            this.i = n3 += n7;
            String string2 = " must call proceed() exactly once";
            zc0_2 zc0_22 = this.d;
            String string3 = "network interceptor ";
            if (zc0_22 != null) {
                object3 = zc0_22.c;
                object2 = kj2_22.a;
                n3 = (int)(((jc0_2)object3).b((ob1_1)object2) ? 1 : 0);
                if (n3 != 0) {
                    n3 = this.i;
                    if (n3 != n7) {
                        object2 = new StringBuilder(string3);
                        object3 = list.get(n4 -= n7);
                        ((StringBuilder)object2).append(object3);
                        ((StringBuilder)object2).append(string2);
                        object2 = ((StringBuilder)object2).toString();
                        object2 = object2.toString();
                        object3 = new IllegalStateException((String)object2);
                        throw object3;
                    }
                } else {
                    object2 = new StringBuilder(string3);
                    object3 = list.get(n4 -= n7);
                    ((StringBuilder)object2).append(object3);
                    ((StringBuilder)object2).append(" must retain the same host and port");
                    object2 = ((StringBuilder)object2).toString();
                    object2 = object2.toString();
                    object3 = new IllegalStateException((String)object2);
                    throw object3;
                }
            }
            int n8 = n4 + 1;
            int n10 = 0;
            int n14 = 58;
            object2 = this;
            object = kj2_22;
            object2 = te2_2.c(this, n8, null, kj2_22, 0, 0, 0, n14);
            object3 = (nj1_2)list.get(n4);
            Object object4 = object3.intercept((nj1$a)object2);
            object = "interceptor ";
            if (object4 != null) {
                if (zc0_22 != null && n8 < (n10 = list.size()) && (n3 = ((te2_2)object2).i) != n7) {
                    object2 = new StringBuilder(string3);
                    ((StringBuilder)object2).append(object3);
                    ((StringBuilder)object2).append(string2);
                    object2 = ((StringBuilder)object2).toString();
                    object2 = object2.toString();
                    object3 = new IllegalStateException((String)object2);
                    throw object3;
                }
                object2 = ((cl2_2)object4).g;
                if (object2 != null) {
                    return object4;
                }
                object2 = new StringBuilder((String)object);
                ((StringBuilder)object2).append(object3);
                ((StringBuilder)object2).append(" returned a response with no body");
                object2 = ((StringBuilder)object2).toString();
                object2 = object2.toString();
                object3 = new IllegalStateException((String)object2);
                throw object3;
            }
            object4 = new StringBuilder((String)object);
            ((StringBuilder)object4).append(object3);
            ((StringBuilder)object4).append(" returned null");
            object3 = ((StringBuilder)object4).toString();
            object2 = new NullPointerException((String)object3);
            throw object2;
        }
        String string4 = "Check failed.".toString();
        object2 = new IllegalStateException(string4);
        throw object2;
    }

    public final te2_2 b(int n3, TimeUnit object) {
        Intrinsics.checkNotNullParameter(object, "unit");
        zc0_2 zc0_22 = this.d;
        if (zc0_22 == null) {
            long l2 = n3;
            int n4 = ez3.b("readTimeout", l2, object);
            return te2_2.c(this, 0, null, null, 0, n4, 0, 47);
        }
        object = "Timeouts can't be adjusted in a network interceptor".toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public final te2_2 d(int n3, TimeUnit object) {
        Intrinsics.checkNotNullParameter(object, "unit");
        zc0_2 zc0_22 = this.d;
        if (zc0_22 == null) {
            long l2 = n3;
            int n4 = ez3.b("connectTimeout", l2, object);
            return te2_2.c(this, 0, null, null, n4, 0, 0, 55);
        }
        object = "Timeouts can't be adjusted in a network interceptor".toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public final te2_2 e(int n3, TimeUnit object) {
        Intrinsics.checkNotNullParameter(object, "unit");
        zc0_2 zc0_22 = this.d;
        if (zc0_22 == null) {
            long l2 = n3;
            int n4 = ez3.b("writeTimeout", l2, object);
            return te2_2.c(this, 0, null, null, 0, 0, n4, 31);
        }
        object = "Timeouts can't be adjusted in a network interceptor".toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public final kj2_2 request() {
        return this.e;
    }
}

