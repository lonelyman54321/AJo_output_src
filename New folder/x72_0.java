/*
 * Decompiled with CFR 0.152.
 */
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealCall;

/*
 * Renamed from x72
 */
public final class x72_0
implements Cloneable,
IJ$a {
    public static final List E;
    public static final List F;
    public final int A;
    public final int B;
    public final long C;
    public final yp2_2 D;
    public final fr0_2 a;
    public final d50_0 b;
    public final List c;
    public final List d;
    public final IB0$b e;
    public final boolean f;
    public final ur_2 g;
    public final boolean h;
    public final boolean i;
    public final z80_0 j;
    public final ri_2 k;
    public final tr0_2 l;
    public final Proxy m;
    public final ProxySelector n;
    public final ur_2 o;
    public final SocketFactory p;
    public final SSLSocketFactory q;
    public final X509TrustManager r;
    public final List s;
    public final List t;
    public final HostnameVerifier u;
    public final mr_2 v;
    public final i0_0 w;
    public final int x;
    public final int y;
    public final int z;

    static {
        e50_0 e50_02;
        ib2_2 ib2_22;
        int n3 = 1;
        int n4 = 2;
        Object object = new ib2_2[n4];
        object[0] = ib2_22 = ib2_2.HTTP_2;
        object[n3] = ib2_22 = ib2_2.HTTP_1_1;
        E = ez3.l((Object[])object);
        Object[] objectArray = new e50_0[n4];
        objectArray[0] = object = e50_0.e;
        objectArray[n3] = e50_02 = e50_0.f;
        F = ez3.l(objectArray);
    }

    public x72_0() {
        x72$a x72$a = new x72$a();
        this(x72$a);
    }

    /*
     * Enabled aggressive block sorting
     */
    public x72_0(x72$a object) {
        Object object2;
        i0_0 i0_02;
        Object object3;
        boolean bl2;
        Object object4;
        block28: {
            block27: {
                int n3;
                block24: {
                    block26: {
                        block25: {
                            long l2;
                            Intrinsics.checkNotNullParameter(object, "builder");
                            object4 = ((x72$a)object).a;
                            this.a = object4;
                            this.b = object4 = ((x72$a)object).b;
                            this.c = object4 = ez3.x(((x72$a)object).c);
                            this.d = object4 = ez3.x(((x72$a)object).d);
                            this.e = object4 = ((x72$a)object).e;
                            this.f = bl2 = ((x72$a)object).f;
                            this.g = object4 = ((x72$a)object).g;
                            this.h = bl2 = ((x72$a)object).h;
                            this.i = bl2 = ((x72$a)object).i;
                            this.j = object4 = ((x72$a)object).j;
                            this.k = object4 = ((x72$a)object).k;
                            this.l = object4 = ((x72$a)object).l;
                            this.m = object4 = ((x72$a)object).m;
                            if (object4 != null) {
                                object4 = j52_0.a;
                            } else {
                                object4 = ((x72$a)object).n;
                                if (object4 == null) {
                                    object4 = ProxySelector.getDefault();
                                }
                                if (object4 == null) {
                                    object4 = j52_0.a;
                                }
                            }
                            this.n = object4;
                            this.o = object4 = ((x72$a)object).o;
                            this.p = object4 = ((x72$a)object).p;
                            this.s = object4 = ((x72$a)object).s;
                            object3 = ((x72$a)object).t;
                            this.t = object3;
                            this.u = object3 = ((x72$a)object).u;
                            this.x = n3 = ((x72$a)object).x;
                            this.y = n3 = ((x72$a)object).y;
                            this.z = n3 = ((x72$a)object).z;
                            this.A = n3 = ((x72$a)object).A;
                            this.B = n3 = ((x72$a)object).B;
                            this.C = l2 = ((x72$a)object).C;
                            object3 = ((x72$a)object).D;
                            if (object3 == null) {
                                object3 = new yp2_2();
                            }
                            this.D = object3;
                            object4 = (Iterable)object4;
                            n3 = object4 instanceof Collection;
                            i0_02 = null;
                            if (n3 == 0) break block25;
                            object3 = object4;
                            object3 = (Collection)object4;
                            n3 = (int)(object3.isEmpty() ? 1 : 0);
                            if (n3 != 0) break block26;
                        }
                        object4 = object4.iterator();
                        while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                            object3 = (e50_0)object4.next();
                            n3 = (int)(((e50_0)object3).a ? 1 : 0);
                            if (n3 == 0) continue;
                            object4 = ((x72$a)object).q;
                            object3 = "certificateChainCleaner";
                            if (object4 != null) {
                                this.q = object4;
                                object4 = ((x72$a)object).w;
                                Intrinsics.checkNotNull(object4);
                                this.w = object4;
                                object2 = ((x72$a)object).r;
                                Intrinsics.checkNotNull(object2);
                                this.r = object2;
                                object = ((x72$a)object).v;
                                Intrinsics.checkNotNull(object4);
                                object.getClass();
                                Intrinsics.checkNotNullParameter(object4, (String)object3);
                                object3 = ((mr_2)object).b;
                                n3 = (int)(Intrinsics.areEqual(object3, object4) ? 1 : 0);
                                if (n3 == 0) {
                                    object = ((mr_2)object).a;
                                    object = object3 = new mr_2((Set)object, (i0_0)object4);
                                }
                                this.v = object;
                                break block24;
                            } else {
                                object4 = zs2_2.a;
                                this.r = object4 = zs2_2.a.m();
                                object2 = zs2_2.a;
                                Intrinsics.checkNotNull(object4);
                                this.q = object2 = ((zs2_2)object2).l((X509TrustManager)object4);
                                Intrinsics.checkNotNull(object4);
                                Intrinsics.checkNotNullParameter(object4, "trustManager");
                                object2 = zs2_2.a;
                                this.w = object4 = ((zs2_2)object2).b((X509TrustManager)object4);
                                object = ((x72$a)object).v;
                                Intrinsics.checkNotNull(object4);
                                object.getClass();
                                Intrinsics.checkNotNullParameter(object4, (String)object3);
                                object3 = ((mr_2)object).b;
                                n3 = (int)(Intrinsics.areEqual(object3, object4) ? 1 : 0);
                                if (n3 == 0) {
                                    object = ((mr_2)object).a;
                                    object = object3 = new mr_2((Set)object, (i0_0)object4);
                                }
                                this.v = object;
                            }
                            break block24;
                        }
                    }
                    this.q = null;
                    this.w = null;
                    this.r = null;
                    this.v = object = mr_2.c;
                }
                object = this.c;
                object4 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>";
                Intrinsics.checkNotNull(object, (String)object4);
                n3 = object.contains(null) ^ 1;
                if (n3 == 0) {
                    object4 = new StringBuilder("Null interceptor: ");
                    ((StringBuilder)object4).append(object);
                    object = ((StringBuilder)object4).toString();
                    object = object.toString();
                    object4 = new IllegalStateException((String)object);
                    throw object4;
                }
                object = this.d;
                Intrinsics.checkNotNull(object, (String)object4);
                bl2 = object.contains(null) ^ true;
                if (!bl2) {
                    object4 = new StringBuilder("Null network interceptor: ");
                    ((StringBuilder)object4).append(object);
                    object = ((StringBuilder)object4).toString();
                    object = object.toString();
                    object4 = new IllegalStateException((String)object);
                    throw object4;
                }
                object = this.s;
                bl2 = object instanceof Collection;
                object3 = this.r;
                i0_02 = this.w;
                object2 = this.q;
                if (!bl2) break block27;
                object4 = object;
                object4 = (Collection)object;
                bl2 = object4.isEmpty();
                if (bl2) break block28;
            }
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                object4 = (e50_0)object.next();
                bl2 = ((e50_0)object4).a;
                if (!bl2) continue;
                if (object2 == null) {
                    object4 = "sslSocketFactory == null".toString();
                    object = new IllegalStateException((String)object4);
                    throw object;
                }
                if (i0_02 == null) {
                    object4 = "certificateChainCleaner == null".toString();
                    object = new IllegalStateException((String)object4);
                    throw object;
                }
                if (object3 != null) {
                    return;
                }
                object4 = "x509TrustManager == null".toString();
                object = new IllegalStateException((String)object4);
                throw object;
            }
        }
        object = "Check failed.";
        if (object2 != null) {
            object = object.toString();
            object4 = new IllegalStateException((String)object);
            throw object4;
        }
        if (i0_02 != null) {
            object = object.toString();
            object4 = new IllegalStateException((String)object);
            throw object4;
        }
        if (object3 != null) {
            object = object.toString();
            object4 = new IllegalStateException((String)object);
            throw object4;
        }
        object4 = this.v;
        object3 = mr_2.c;
        bl2 = Intrinsics.areEqual(object4, object3);
        if (bl2) {
            return;
        }
        object = object.toString();
        object4 = new IllegalStateException((String)object);
        throw object4;
    }

    public final RealCall b(kj2_2 kj2_22) {
        Intrinsics.checkNotNullParameter(kj2_22, "request");
        RealCall realCall = new RealCall(this, kj2_22, false);
        return realCall;
    }

    public final Object clone() {
        return super.clone();
    }

    public final x72$a d() {
        long l2;
        int n3;
        Intrinsics.checkNotNullParameter(this, "okHttpClient");
        x72$a x72$a = new x72$a();
        Object object = this.a;
        x72$a.a = object;
        x72$a.b = object = this.b;
        object = x72$a.c;
        cx_2.r(this.c, (Collection)object);
        object = x72$a.d;
        cx_2.r(this.d, (Collection)object);
        x72$a.e = object = this.e;
        x72$a.f = n3 = this.f;
        x72$a.g = object = this.g;
        x72$a.h = n3 = this.h;
        x72$a.i = n3 = this.i;
        x72$a.j = object = this.j;
        x72$a.k = object = this.k;
        x72$a.l = object = this.l;
        x72$a.m = object = this.m;
        x72$a.n = object = this.n;
        x72$a.o = object = this.o;
        x72$a.p = object = this.p;
        x72$a.q = object = this.q;
        x72$a.r = object = this.r;
        x72$a.s = object = this.s;
        x72$a.t = object = this.t;
        x72$a.u = object = this.u;
        x72$a.v = object = this.v;
        x72$a.w = object = this.w;
        x72$a.x = n3 = this.x;
        x72$a.y = n3 = this.y;
        x72$a.z = n3 = this.z;
        x72$a.A = n3 = this.A;
        x72$a.B = n3 = this.B;
        x72$a.C = l2 = this.C;
        x72$a.D = object = this.D;
        return x72$a;
    }
}

