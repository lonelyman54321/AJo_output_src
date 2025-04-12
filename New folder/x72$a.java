/*
 * Decompiled with CFR 0.152.
 */
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

public final class x72$a {
    public int A;
    public int B;
    public long C;
    public yp2_2 D;
    public fr0_2 a;
    public d50_0 b;
    public final ArrayList c;
    public final ArrayList d;
    public IB0$b e;
    public boolean f;
    public ur_2 g;
    public boolean h;
    public boolean i;
    public z80_0 j;
    public ri_2 k;
    public tr0_2 l;
    public Proxy m;
    public ProxySelector n;
    public ur_2 o;
    public SocketFactory p;
    public SSLSocketFactory q;
    public X509TrustManager r;
    public List s;
    public List t;
    public HostnameVerifier u;
    public mr_2 v;
    public i0_0 w;
    public int x;
    public int y;
    public int z;

    public x72$a() {
        int n3;
        Object object = new fr0_2();
        this.a = object;
        this.b = object = new d50_0();
        object = new ArrayList();
        this.c = object;
        object = new ArrayList();
        this.d = object;
        object = ib0_2.a;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object object2 = new q40_0(object);
        this.e = object2;
        this.f = n3 = 1;
        this.g = object2 = ur_2.a;
        this.h = n3;
        this.i = n3;
        this.j = object = z80_0.a;
        this.l = object = tr0_2.a;
        this.o = object2;
        object = SocketFactory.getDefault();
        Intrinsics.checkNotNullExpressionValue(object, "getDefault()");
        this.p = object;
        this.s = object = x72_0.F;
        this.t = object = x72_0.E;
        this.u = object = t72_0.a;
        this.v = object = mr_2.c;
        this.y = n3 = 10000;
        this.z = n3;
        this.A = n3;
        this.C = 1024L;
    }

    public final void a(nj1_2 nj1_22) {
        Intrinsics.checkNotNullParameter(nj1_22, "interceptor");
        this.c.add(nj1_22);
    }

    public final void b(long l2, TimeUnit timeUnit) {
        int n3;
        Intrinsics.checkNotNullParameter((Object)timeUnit, "unit");
        this.y = n3 = ez3.b("timeout", l2, timeUnit);
    }

    public final void c(long l2, TimeUnit timeUnit) {
        int n3;
        Intrinsics.checkNotNullParameter((Object)timeUnit, "unit");
        this.z = n3 = ez3.b("timeout", l2, timeUnit);
    }

    public final void d(SSLSocketFactory object, X509TrustManager x509TrustManager) {
        Intrinsics.checkNotNullParameter(object, "sslSocketFactory");
        String string2 = "trustManager";
        Intrinsics.checkNotNullParameter(x509TrustManager, string2);
        Object object2 = this.q;
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (!bl2 || !(bl2 = Intrinsics.areEqual(x509TrustManager, object2 = this.r))) {
            bl2 = false;
            object2 = null;
            this.D = null;
        }
        this.q = object;
        Intrinsics.checkNotNullParameter(x509TrustManager, string2);
        object = zs2_2.a;
        this.w = object = zs2_2.a.b(x509TrustManager);
        this.r = x509TrustManager;
    }

    public final void e(long l2, TimeUnit timeUnit) {
        int n3;
        Intrinsics.checkNotNullParameter((Object)timeUnit, "unit");
        this.A = n3 = ez3.b("timeout", l2, timeUnit);
    }
}

