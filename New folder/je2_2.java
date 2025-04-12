/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.b;
import okhttp3.internal.concurrent.c;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.a;

/*
 * Renamed from JE2
 */
public final class je2_2
extends G91$b {
    public final wp2_2 b;
    public Socket c;
    public Socket d;
    public k21_0 e;
    public ib2_2 f;
    public g91_0 g;
    public ie2_2 h;
    public he2_2 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public je2_2(a arrayList, wp2_2 wp2_22) {
        Intrinsics.checkNotNullParameter(arrayList, "connectionPool");
        Intrinsics.checkNotNullParameter(wp2_22, "route");
        this.b = wp2_22;
        this.o = 1;
        this.p = arrayList = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(x72_0 object, wp2_2 wp2_22, IOException object2) {
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(wp2_22, "failedRoute");
        Intrinsics.checkNotNullParameter(object2, "failure");
        Object object3 = wp2_22.b.type();
        Object object4 = Proxy.Type.DIRECT;
        if (object3 != object4) {
            object3 = wp2_22.a;
            object4 = ((h4_0)object3).h;
            object3 = ((h4_0)object3).i.j();
            SocketAddress socketAddress = wp2_22.b.address();
            ((ProxySelector)object4).connectFailed((URI)object3, socketAddress, (IOException)object2);
        }
        object = ((x72_0)object).D;
        synchronized (object) {
            object2 = "failedRoute";
            Intrinsics.checkNotNullParameter(wp2_22, (String)object2);
            object2 = ((yp2_2)object).a;
            object2.add(wp2_22);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(g91_0 object, R03 r03) {
        synchronized (this) {
            String string2 = "connection";
            Intrinsics.checkNotNullParameter(object, string2);
            object = "settings";
            Intrinsics.checkNotNullParameter(r03, (String)object);
            Object object2 = r03.a & 0x10;
            if (object2 != 0) {
                object = r03.b;
                int n3 = 4;
                object2 = object[n3];
            } else {
                object2 = -1 >>> 1;
            }
            this.o = object2;
            return;
        }
    }

    public final void b(S91 s91) {
        Intrinsics.checkNotNullParameter(s91, "stream");
        ta0_2 ta0_22 = ta0_2.REFUSED_STREAM;
        s91.c(ta0_22, null);
    }

    /*
     * Loose catch block
     */
    public final void c(int n3, int n4, int n7, int n8, boolean bl2, ij_2 ij_22, ib0_2 ib0_22) {
        Object object;
        block29: {
            Object object2;
            block33: {
                Object object3;
                int n10;
                int n14;
                boolean bl3;
                f50_0 f50_02;
                String string2;
                String string3;
                String string4;
                ib0_2 ib0_23;
                ij_2 ij_23;
                je2_2 je2_22;
                block32: {
                    block30: {
                        block31: {
                            je2_22 = this;
                            ij_23 = ij_22;
                            ib0_23 = ib0_22;
                            string4 = "proxy";
                            string3 = "inetSocketAddress";
                            string2 = "call";
                            Intrinsics.checkNotNullParameter(ij_22, string2);
                            Intrinsics.checkNotNullParameter(ib0_22, "eventListener");
                            object = this.f;
                            if (object != null) break block29;
                            object = this.b.a.k;
                            f50_02 = new f50_0((List)object);
                            object2 = this.b.a;
                            Object object4 = ((h4_0)object2).c;
                            if (object4 != null) break block30;
                            object2 = e50_0.f;
                            bl3 = object.contains(object2);
                            if (!bl3) break block31;
                            object = this.b.a.i.d;
                            object2 = zs2_2.a;
                            object2 = zs2_2.a;
                            n14 = (int)(((zs2_2)object2).h((String)object) ? 1 : 0);
                            if (n14 == 0) {
                                object = cP.a("CLEARTEXT communication to ", (String)object, " not permitted by network security policy");
                                object4 = new UnknownServiceException((String)object);
                                object2 = new RouteException((IOException)object4);
                                throw object2;
                            }
                            break block32;
                        }
                        object2 = new UnknownServiceException("CLEARTEXT communication not enabled for client");
                        object = new RouteException((IOException)object2);
                        throw object;
                    }
                    object = ((h4_0)object2).j;
                    object2 = ib2_2.H2_PRIOR_KNOWLEDGE;
                    bl3 = object.contains(object2);
                    if (bl3) break block33;
                }
                RouteException routeException = null;
                do {
                    Object object5;
                    Object object6;
                    block35: {
                        long l2;
                        block27: {
                            block28: {
                                block34: {
                                    block26: {
                                        block25: {
                                            object = je2_22.b;
                                            object2 = ((wp2_2)object).a;
                                            object2 = ((h4_0)object2).c;
                                            if (object2 == null) break block25;
                                            object = ((wp2_2)object).b;
                                            object = ((Proxy)object).type();
                                            object2 = Proxy.Type.HTTP;
                                            if (object != object2) break block25;
                                            bl3 = true;
                                            break block26;
                                        }
                                        bl3 = false;
                                        object = null;
                                    }
                                    if (!bl3) break block34;
                                    object2 = this;
                                    n10 = n7;
                                    object6 = ij_22;
                                    object5 = ib0_22;
                                    try {
                                        this.f(n3, n4, n7, ij_22, ib0_22);
                                        object = je2_22.c;
                                        if (object == null) break block27;
                                        n14 = n3;
                                        break block28;
                                    }
                                    catch (IOException iOException) {
                                        n14 = n3;
                                    }
                                    break block35;
                                }
                                n14 = n3;
                                je2_22.e(n3, n4, ij_23, ib0_23);
                            }
                            try {
                                je2_22.g(f50_02, n8, ij_23, ib0_23);
                                object = je2_22.b;
                            }
                            catch (IOException iOException) {}
                            object3 = ((wp2_2)object).c;
                            object = ((wp2_2)object).b;
                            ib0_22.getClass();
                            object6 = ib0_2.a;
                            Intrinsics.checkNotNullParameter(ij_23, string2);
                            Intrinsics.checkNotNullParameter(object3, string3);
                            Intrinsics.checkNotNullParameter(object, string4);
                        }
                        object = je2_22.b;
                        object2 = ((wp2_2)object).a.c;
                        if (object2 != null && (object = ((wp2_2)object).b.type()) == (object2 = Proxy.Type.HTTP) && (object = je2_22.c) == null) {
                            object2 = new ProtocolException("Too many tunnel connections attempted: 21");
                            object = new RouteException((IOException)object2);
                            throw object;
                        }
                        je2_22.q = l2 = System.nanoTime();
                        return;
                        break block35;
                        catch (IOException iOException) {}
                    }
                    object3 = je2_22.d;
                    if (object3 != null) {
                        ez3.d((Socket)object3);
                    }
                    if ((object3 = je2_22.c) != null) {
                        ez3.d((Socket)object3);
                    }
                    je2_22.d = null;
                    je2_22.c = null;
                    je2_22.h = null;
                    je2_22.i = null;
                    je2_22.e = null;
                    je2_22.f = null;
                    je2_22.g = null;
                    je2_22.o = n10 = 1;
                    object6 = je2_22.b;
                    object5 = ((wp2_2)object6).c;
                    object6 = ((wp2_2)object6).b;
                    ib0_22.getClass();
                    Intrinsics.checkNotNullParameter(ij_23, string2);
                    Intrinsics.checkNotNullParameter(object5, string3);
                    Intrinsics.checkNotNullParameter(object6, string4);
                    Intrinsics.checkNotNullParameter(object, "ioe");
                    object6 = "e";
                    if (routeException == null) {
                        routeException = new RouteException((IOException)object);
                    } else {
                        Intrinsics.checkNotNullParameter(object, (String)object6);
                        object5 = routeException.a;
                        yc0_2.a((Throwable)object5, (Throwable)object);
                        routeException.b = object;
                    }
                    if (!bl2) break;
                    Intrinsics.checkNotNullParameter(object, (String)object6);
                    f50_02.d = n10;
                    n10 = (int)(f50_02.c ? 1 : 0);
                } while (n10 != 0 && (n10 = object instanceof ProtocolException) == 0 && (n10 = object instanceof InterruptedIOException) == 0 && ((n10 = object instanceof SSLHandshakeException) == 0 || (n10 = (object3 = ((Throwable)object).getCause()) instanceof CertificateException) == 0) && (n10 = object instanceof SSLPeerUnverifiedException) == 0 && (bl3 = object instanceof SSLException));
                throw routeException;
            }
            object2 = new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
            object = new RouteException((IOException)object2);
            throw object;
        }
        String string5 = "already connected".toString();
        object = new IllegalStateException(string5);
        throw object;
    }

    public final void e(int n3, int n4, ij_2 object, ib0_2 object2) {
        NullPointerException nullPointerException2;
        Object object3;
        block16: {
            int n7;
            Object object4 = this.b;
            Proxy proxy = ((wp2_2)object4).b;
            object4 = ((wp2_2)object4).a;
            Object object5 = proxy.type();
            if (object5 == null) {
                n7 = -1;
            } else {
                int[] nArray = je2$a_0.$EnumSwitchMapping$0;
                n7 = object5.ordinal();
                n7 = nArray[n7];
            }
            int n8 = 1;
            if (n7 != n8 && n7 != (n8 = 2)) {
                object4 = new Socket(proxy);
            } else {
                object4 = ((h4_0)object4).b.createSocket();
                Intrinsics.checkNotNull(object4);
            }
            this.c = object4;
            object5 = this.b.c;
            object2.getClass();
            object2 = "call";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Intrinsics.checkNotNullParameter(object5, "inetSocketAddress");
            object = "proxy";
            Intrinsics.checkNotNullParameter(proxy, (String)object);
            ((Socket)object4).setSoTimeout(n4);
            try {
                object3 = zs2_2.a;
            }
            catch (ConnectException connectException) {
                object = new StringBuilder("Failed to connect to ");
                object2 = this.b.c;
                ((StringBuilder)object).append(object2);
                object = ((StringBuilder)object).toString();
                object3 = new ConnectException((String)object);
                ((Throwable)object3).initCause(connectException);
                throw object3;
            }
            object3 = zs2_2.a;
            object = this.b;
            object = ((wp2_2)object).c;
            ((zs2_2)object3).e((Socket)object4, (InetSocketAddress)object, n3);
            Closeable closeable = o72_0.f((Socket)object4);
            closeable = o72_0.b(closeable);
            this.h = closeable;
            closeable = o72_0.d((Socket)object4);
            closeable = o72_0.a((y63_0)closeable);
            try {
                this.i = closeable;
            }
            catch (NullPointerException nullPointerException2) {
                object3 = ((Throwable)nullPointerException2).getMessage();
                object = "throw with null exception";
                n4 = (int)(Intrinsics.areEqual(object3, object) ? 1 : 0);
                if (n4 != 0) break block16;
            }
            return;
        }
        object3 = new IOException(nullPointerException2);
        throw object3;
    }

    public final void f(int n3, int n4, int n7, ij_2 ij_22, ib0_2 ib0_22) {
        long l2;
        int n8;
        int n10 = n4;
        Object object = new KJ2$a();
        wp2_2 wp2_22 = this.b;
        Object object2 = wp2_22.a.i;
        Intrinsics.checkNotNullParameter(object2, "url");
        ((KJ2$a)object).a = object2;
        ((KJ2$a)object).e("CONNECT", null);
        object2 = wp2_22.a;
        Object object3 = ((h4_0)object2).i;
        boolean bl2 = true;
        object3 = ez3.w((ob1_1)object3, bl2);
        ((KJ2$a)object).d("Host", (String)object3);
        ((KJ2$a)object).d("Proxy-Connection", "Keep-Alive");
        ((KJ2$a)object).d("User-Agent", "okhttp/4.12.0");
        object = ((KJ2$a)object).b();
        object3 = new cl2$a_0();
        String string2 = "request";
        Intrinsics.checkNotNullParameter(object, string2);
        ((cl2$a_0)object3).a = object;
        ib2_2 ib2_22 = ib2_2.HTTP_1_1;
        ((cl2$a_0)object3).d(ib2_22);
        ((cl2$a_0)object3).c = n8 = 407;
        String string3 = "Preemptive Authenticate";
        Intrinsics.checkNotNullParameter(string3, "message");
        ((cl2$a_0)object3).d = string3;
        jl2_2 jl2_22 = ez3.c;
        ((cl2$a_0)object3).g = jl2_22;
        ((cl2$a_0)object3).k = l2 = (long)-1;
        ((cl2$a_0)object3).l = l2;
        Object object4 = "Proxy-Authenticate";
        Intrinsics.checkNotNullParameter(object4, "name");
        String string4 = "OkHttp-Preemptive";
        Intrinsics.checkNotNullParameter(string4, "value");
        ((cl2$a_0)object3).f.h((String)object4, string4);
        object3 = ((cl2$a_0)object3).a();
        ((h4_0)object2).f.a(wp2_22, (cl2_2)object3);
        int n14 = n3;
        Object object5 = ij_22;
        object4 = ib0_22;
        this.e(n3, n4, ij_22, ib0_22);
        object3 = new StringBuilder("CONNECT ");
        Object object6 = ez3.w(((kj2_2)object).a, bl2);
        ((StringBuilder)object3).append((String)object6);
        ((StringBuilder)object3).append(" HTTP/1.1");
        object3 = ((StringBuilder)object3).toString();
        object6 = this.h;
        Intrinsics.checkNotNull(object6);
        object5 = this.i;
        Intrinsics.checkNotNull(object5);
        object4 = new e91_0(null, this, (se_1)object6, (re_2)object5);
        Object object7 = ((ie2_2)object6).a.timeout();
        long l3 = n4;
        Object object8 = TimeUnit.MILLISECONDS;
        ((okio.a)object7).g(l3, (TimeUnit)((Object)object8));
        object7 = ((he2_2)object5).a.timeout();
        l3 = n7;
        ((okio.a)object7).g(l3, (TimeUnit)((Object)object8));
        object7 = ((kj2_2)object).c;
        ((e91_0)object4).k((m41_0)object7, (String)object3);
        ((e91_0)object4).b();
        int n15 = 0;
        object7 = ((e91_0)object4).g(false);
        Intrinsics.checkNotNull(object7);
        object7.getClass();
        Intrinsics.checkNotNullParameter(object, string2);
        ((cl2$a_0)object7).a = object;
        object = ((cl2$a_0)object7).a();
        object7 = "response";
        Intrinsics.checkNotNullParameter(object, (String)object7);
        long l4 = ez3.k((cl2_2)object);
        long l7 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
        if (l7 != false) {
            object7 = ((e91_0)object4).j(l4);
            n14 = -1 >>> 1;
            ez3.u((a93_0)object7, n14, (TimeUnit)((Object)object8));
            ((E91$d)object7).close();
        }
        n10 = 200;
        n15 = ((cl2_2)object).d;
        if (n15 != n10) {
            if (n15 == n8) {
                ((h4_0)object2).f.a(wp2_22, (cl2_2)object);
                object8 = new IOException("Failed to authenticate with proxy");
                throw object8;
            }
            object = hj0_0.a(n15, "Unexpected response code for CONNECT: ");
            object8 = new IOException((String)object);
            throw object8;
        }
        object8 = ((ie2_2)object6).b;
        n10 = (int)(((ce_2)object8).g() ? 1 : 0);
        if (n10 != 0 && (n10 = (int)(((ce_2)(object8 = ((he2_2)object5).b)).g() ? 1 : 0)) != 0) {
            return;
        }
        object8 = new IOException("TLS tunnel buffered too many bytes!");
        throw object8;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(f50_0 f50_02, int n3, ij_2 ij_22, ib0_2 ib0_22) {
        void var14_19;
        Object object;
        Object object2;
        block19: {
            boolean bl2;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            h4_0 h4_02;
            Object object7;
            Object object8;
            Object object9;
            Object object10;
            Object object11;
            boolean bl3;
            int n4;
            je2_2 je2_22;
            block16: {
                Object object12;
                block17: {
                    block18: {
                        Object object13;
                        je2_22 = this;
                        n4 = n3;
                        object2 = ij_22;
                        bl3 = false;
                        object11 = null;
                        object10 = "certificate";
                        object9 = this.b.a;
                        object8 = ((h4_0)object9).c;
                        if (object8 == null) {
                            Object object14;
                            object2 = ((h4_0)object9).j;
                            object11 = ib2_2.H2_PRIOR_KNOWLEDGE;
                            boolean bl4 = object2.contains(object11);
                            if (bl4) {
                                this.d = object2 = this.c;
                                this.f = object11;
                                this.m(n3);
                                return;
                            }
                            this.d = object14 = this.c;
                            object14 = ib2_2.HTTP_1_1;
                            this.f = object14;
                            return;
                        }
                        ib0_22.getClass();
                        object9 = "call";
                        Intrinsics.checkNotNullParameter(ij_22, (String)object9);
                        object8 = "Hostname ";
                        object7 = "\n              |Hostname ";
                        h4_02 = this.b.a;
                        object6 = h4_02.c;
                        Intrinsics.checkNotNull(object6);
                        object5 = this.c;
                        object4 = h4_02.i;
                        object3 = ((ob1_1)object4).d;
                        int n7 = ((ob1_1)object4).e;
                        boolean bl5 = true;
                        object6 = ((SSLSocketFactory)object6).createSocket((Socket)object5, (String)object3, n7, bl5);
                        object5 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket";
                        Intrinsics.checkNotNull(object6, (String)object5);
                        object6 = (SSLSocket)object6;
                        object5 = f50_02;
                        object5 = f50_02.a((SSLSocket)object6);
                        n7 = (int)(((e50_0)object5).b ? 1 : 0);
                        if (n7 != 0) {
                            object4 = zs2_2.a;
                            object4 = zs2_2.a;
                            object3 = h4_02.i;
                            object3 = ((ob1_1)object3).d;
                            object13 = h4_02.j;
                            ((zs2_2)object4).d((SSLSocket)object6, (String)object3, (List)object13);
                        }
                        ((SSLSocket)object6).startHandshake();
                        object4 = ((SSLSocket)object6).getSession();
                        object3 = "sslSocketSession";
                        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                        object3 = K21$a.a((SSLSession)object4);
                        object13 = h4_02.d;
                        Intrinsics.checkNotNull(object13);
                        object = h4_02.i;
                        object = ((ob1_1)object).d;
                        bl2 = object13.verify((String)object, (SSLSession)object4);
                        if (bl2) break block16;
                        object2 = object12 = ((k21_0)object3).a();
                        object2 = (Collection)object12;
                        boolean bl6 = object2.isEmpty() ^ bl5;
                        if (!bl6) break block17;
                        object12 = object12.get(0);
                        object2 = "null cannot be cast to non-null type java.security.cert.X509Certificate";
                        Intrinsics.checkNotNull(object12, (String)object2);
                        object12 = (X509Certificate)object12;
                        object11 = new StringBuilder((String)object7);
                        object9 = h4_02.i;
                        object9 = ((ob1_1)object9).d;
                        ((StringBuilder)object11).append((String)object9);
                        object9 = " not verified:\n              |    certificate: ";
                        ((StringBuilder)object11).append((String)object9);
                        object9 = mr_2.c;
                        Intrinsics.checkNotNullParameter(object12, (String)object10);
                        int n8 = object12 instanceof X509Certificate;
                        if (n8 == 0) break block18;
                        try {
                            object8 = "sha256/";
                            object9 = new StringBuilder((String)object8);
                            object8 = "<this>";
                            Intrinsics.checkNotNullParameter(object12, (String)object8);
                            object8 = ff_2.d;
                            object8 = ((Certificate)object12).getPublicKey();
                            object8 = object8.getEncoded();
                            object7 = "publicKey.encoded";
                            Intrinsics.checkNotNullExpressionValue(object8, object7);
                            object8 = ff$a_0.d((byte[])object8);
                            object7 = "SHA-256";
                            object8 = ((ff_2)object8).c((String)object7);
                            object8 = ((ff_2)object8).a();
                            ((StringBuilder)object9).append((String)object8);
                            object9 = ((StringBuilder)object9).toString();
                            ((StringBuilder)object11).append((String)object9);
                            object9 = "\n              |    DN: ";
                            ((StringBuilder)object11).append((String)object9);
                            object9 = ((X509Certificate)object12).getSubjectDN();
                            object9 = object9.getName();
                            ((StringBuilder)object11).append((String)object9);
                            object9 = "\n              |    subjectAltNames: ";
                            ((StringBuilder)object11).append((String)object9);
                            Intrinsics.checkNotNullParameter(object12, (String)object10);
                            int n10 = 7;
                            object10 = t72_0.a((X509Certificate)object12, n10);
                            n8 = 2;
                            object12 = t72_0.a((X509Certificate)object12, n8);
                            object10 = (Collection)object10;
                            object12 = (Iterable)object12;
                            object12 = CollectionsKt.W((Iterable)object12, (Collection)object10);
                            ((StringBuilder)object11).append(object12);
                            object12 = "\n              ";
                            ((StringBuilder)object11).append((String)object12);
                            object12 = ((StringBuilder)object11).toString();
                            object12 = ee3_2.c((String)object12);
                            object2 = new SSLPeerUnverifiedException((String)object12);
                            throw object2;
                        }
                        catch (Throwable throwable) {
                            object = object6;
                        }
                        break block19;
                    }
                    object2 = "Certificate pinning requires X509 certificates";
                    object2 = object2.toString();
                    object12 = new IllegalArgumentException((String)object2);
                    throw object12;
                }
                object2 = new StringBuilder((String)object8);
                object11 = h4_02.i;
                object11 = ((ob1_1)object11).d;
                ((StringBuilder)object2).append((String)object11);
                object11 = " not verified (no certificates)";
                ((StringBuilder)object2).append((String)object11);
                object2 = ((StringBuilder)object2).toString();
                object12 = new SSLPeerUnverifiedException((String)object2);
                throw object12;
            }
            object10 = h4_02.e;
            Intrinsics.checkNotNull(object10);
            object7 = ((k21_0)object3).a;
            object = ((k21_0)object3).b;
            object4 = ((k21_0)object3).c;
            ke2_2 ke2_22 = new ke2_2((mr_2)object10, (k21_0)object3, h4_02);
            je2_22.e = object8 = new k21_0((wn3_0)((Object)object7), (iu_1)object, (List)object4, ke2_22);
            object8 = h4_02.i;
            object8 = ((ob1_1)object8).d;
            object7 = new le2_2(je2_22, 0);
            ((mr_2)object10).a((String)object8, (Function0)object7);
            bl3 = ((e50_0)object5).b;
            if (bl3) {
                object11 = zs2_2.a;
                object11 = zs2_2.a;
                object = ((zs2_2)object11).f((SSLSocket)object6);
            } else {
                bl2 = false;
                object = null;
            }
            je2_22.d = object6;
            object11 = o72_0.f((Socket)object6);
            je2_22.h = object11 = o72_0.b((a93_0)object11);
            object11 = o72_0.d((Socket)object6);
            je2_22.i = object11 = o72_0.a((y63_0)object11);
            if (object != null) {
                object11 = ib2_2.Companion;
                ((Object)object11).getClass();
                object11 = IB2$a.a((String)object);
            } else {
                object11 = ib2_2.HTTP_1_1;
            }
            je2_22.f = object11;
            object11 = zs2_2.a;
            zs2_2.a.a((SSLSocket)object6);
            Intrinsics.checkNotNullParameter(object2, (String)object9);
            object2 = je2_22.f;
            object11 = ib2_2.HTTP_2;
            if (object2 == object11) {
                je2_22.m(n4);
            }
            return;
            catch (Throwable throwable) {
                boolean bl7 = false;
                object = null;
            }
        }
        if (object != null) {
            object2 = zs2_2.a;
            object2 = zs2_2.a;
            ((zs2_2)object2).a((SSLSocket)object);
        }
        if (object != null) {
            ez3.d(object);
        }
        throw var14_19;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h() {
        synchronized (this) {
            int n3;
            this.m = n3 = this.m + 1;
            return;
        }
    }

    public final boolean i(h4_0 object, List object2) {
        block19: {
            int n3;
            int n4;
            h4_0 h4_02;
            Object object3;
            Object object4;
            int n7;
            int n8;
            Object object5;
            block20: {
                Intrinsics.checkNotNullParameter(object, "address");
                object5 = ez3.a;
                object5 = this.p;
                n8 = ((ArrayList)object5).size();
                n7 = this.o;
                if (n8 >= n7 || (n8 = (int)(this.j ? 1 : 0)) != 0) break block19;
                object5 = this.b;
                object4 = ((wp2_2)object5).a;
                n7 = (int)(((h4_0)object4).a((h4_0)object) ? 1 : 0);
                if (n7 == 0) {
                    return false;
                }
                object4 = ((h4_0)object).i;
                object3 = ((ob1_1)object4).d;
                h4_02 = ((wp2_2)object5).a;
                String string2 = h4_02.i.d;
                n4 = Intrinsics.areEqual(object3, string2);
                n3 = 1;
                if (n4 != 0) {
                    return n3 != 0;
                }
                object3 = this.g;
                if (object3 == null) {
                    return false;
                }
                if (object2 == null) break block19;
                n4 = (object2 = (Iterable)object2) instanceof Collection;
                if (n4 == 0) break block20;
                object3 = object2;
                object3 = (Collection)object2;
                n4 = object3.isEmpty();
                if (n4 != 0) break block19;
            }
            object2 = ((Iterable)object2).iterator();
            while ((n4 = object2.hasNext()) != 0) {
                Proxy.Type type2;
                object3 = (wp2_2)object2.next();
                Object object6 = ((wp2_2)object3).b.type();
                if (object6 != (type2 = Proxy.Type.DIRECT) || (object6 = ((wp2_2)object5).b.type()) != type2 || (n4 = Intrinsics.areEqual(object6 = ((wp2_2)object5).c, object3 = ((wp2_2)object3).c)) == 0) continue;
                object5 = ((h4_0)object).d;
                object2 = t72_0.a;
                if (object5 != object2) {
                    return false;
                }
                object2 = ez3.a;
                object2 = h4_02.i;
                n4 = ((ob1_1)object4).e;
                n8 = ((ob1_1)object2).e;
                if (n4 != n8) break;
                object5 = ((ob1_1)object4).d;
                object2 = ((ob1_1)object2).d;
                boolean bl2 = Intrinsics.areEqual(object5, object2);
                if (!bl2) {
                    bl2 = this.k;
                    if (bl2 || (object2 = this.e) == null) break;
                    Intrinsics.checkNotNull(object2);
                    object4 = object2 = ((k21_0)object2).a();
                    object4 = (Collection)object2;
                    n7 = object4.isEmpty() ^ n3;
                    if (n7 == 0) break;
                    object2 = object2.get(0);
                    object4 = "null cannot be cast to non-null type java.security.cert.X509Certificate";
                    Intrinsics.checkNotNull(object2, (String)object4);
                    object2 = (X509Certificate)object2;
                    bl2 = t72_0.c((String)object5, (X509Certificate)object2);
                    if (!bl2) break;
                }
                try {
                    object = ((h4_0)object).e;
                }
                catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {}
                Intrinsics.checkNotNull(object);
                object2 = this.e;
                Intrinsics.checkNotNull(object2);
                object2 = ((k21_0)object2).a();
                object.getClass();
                object4 = "hostname";
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                object4 = "peerCertificates";
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                object4 = new nr_1((mr_2)object, (List)object2, (String)object5);
                ((mr_2)object).a((String)object5, (Function0)object4);
                return n3 != 0;
                break;
            }
        }
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean j(boolean bl2) {
        int n7;
        long l2;
        byte[] byArray = ez3.a;
        long l3 = System.nanoTime();
        Closeable closeable = this.c;
        Intrinsics.checkNotNull(closeable);
        Socket socket = this.d;
        Intrinsics.checkNotNull(socket);
        ie2_2 ie2_22 = this.h;
        Intrinsics.checkNotNull(ie2_22);
        boolean bl3 = ((Socket)closeable).isClosed();
        int n3 = 0;
        if (bl3) return false;
        boolean bl4 = socket.isClosed();
        if (bl4) return false;
        boolean bl5 = socket.isInputShutdown();
        if (bl5) return false;
        boolean bl6 = socket.isOutputShutdown();
        if (bl6) {
            return false;
        }
        closeable = this.g;
        if (closeable != null) {
            return ((g91_0)closeable).d(l3);
        }
        synchronized (this) {
            l2 = this.q;
            l3 -= l2;
        }
        l2 = 10000000000L;
        int n4 = 1;
        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (l4 < 0) return n4 != 0;
        if (!bl2) return n4 != 0;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        String string2 = "source";
        Intrinsics.checkNotNullParameter(ie2_22, string2);
        try {
            n7 = socket.getSoTimeout();
        }
        catch (SocketTimeoutException socketTimeoutException) {
            return 1 != 0;
        }
        catch (IOException iOException) {
            return n3 != 0;
        }
        try {
            socket.setSoTimeout(n4);
            int n8 = ie2_22.g() ^ n4;
            return n8 != 0;
        }
        finally {
            socket.setSoTimeout(n7);
        }
    }

    public final ac0_2 k(x72_0 x72_02, te2_2 te2_22) {
        Intrinsics.checkNotNullParameter(x72_02, "client");
        Intrinsics.checkNotNullParameter(te2_22, "chain");
        Object object = this.d;
        Intrinsics.checkNotNull(object);
        ie2_2 ie2_22 = this.h;
        Intrinsics.checkNotNull(ie2_22);
        he2_2 he2_22 = this.i;
        Intrinsics.checkNotNull(he2_22);
        g91_0 g91_02 = this.g;
        if (g91_02 != null) {
            object = new q91_0(x72_02, this, te2_22, g91_02);
        } else {
            int n3 = te2_22.g;
            ((Socket)object).setSoTimeout(n3);
            object = ie2_22.a.timeout();
            long l2 = n3;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ((okio.a)object).g(l2, timeUnit);
            object = he2_22.a.timeout();
            int n4 = te2_22.h;
            l2 = n4;
            ((okio.a)object).g(l2, timeUnit);
            object = new e91_0(x72_02, this, ie2_22, he2_22);
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l() {
        synchronized (this) {
            boolean bl2;
            this.j = bl2 = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void m(int n3) {
        Object object;
        Object object2;
        block9: {
            Object object3;
            int n4;
            c c2;
            Object object4;
            Object object5;
            block11: {
                Object[] objectArray;
                block10: {
                    object5 = this.d;
                    Intrinsics.checkNotNull(object5);
                    object2 = this.h;
                    Intrinsics.checkNotNull(object2);
                    object4 = this.i;
                    Intrinsics.checkNotNull(object4);
                    ((Socket)object5).setSoTimeout(0);
                    c2 = okhttp3.internal.concurrent.c.h;
                    objectArray = new G91$a(c2);
                    String string2 = this.b.a.i.d;
                    Intrinsics.checkNotNullParameter(object5, "socket");
                    Intrinsics.checkNotNullParameter(string2, "peerName");
                    Intrinsics.checkNotNullParameter(object2, "source");
                    Intrinsics.checkNotNullParameter(object4, "sink");
                    String string3 = "<set-?>";
                    Intrinsics.checkNotNullParameter(object5, string3);
                    objectArray.c = object5;
                    object5 = new StringBuilder();
                    String string4 = ez3.g;
                    ((StringBuilder)object5).append(string4);
                    char c3 = ' ';
                    ((StringBuilder)object5).append(c3);
                    ((StringBuilder)object5).append(string2);
                    object5 = ((StringBuilder)object5).toString();
                    Intrinsics.checkNotNullParameter(object5, string3);
                    objectArray.d = object5;
                    Intrinsics.checkNotNullParameter(object2, string3);
                    objectArray.e = object2;
                    Intrinsics.checkNotNullParameter(object4, string3);
                    objectArray.f = object4;
                    Intrinsics.checkNotNullParameter(this, "listener");
                    objectArray.g = this;
                    objectArray.i = n3;
                    object = new g91_0((G91$a)objectArray);
                    this.g = object;
                    object5 = g91_0.B;
                    n4 = ((R03)object5).a & 0x10;
                    if (n4 != 0) {
                        object5 = ((R03)object5).b;
                        n4 = 4;
                        object3 = object5[n4];
                    } else {
                        object3 = -1 >>> 1;
                    }
                    this.o = object3;
                    Intrinsics.checkNotNullParameter(c2, "taskRunner");
                    object5 = ((g91_0)object).y;
                    object2 = ">> CONNECTION ";
                    // MONITORENTER : object5
                    boolean bl2 = ((t91_0)object5).e;
                    if (bl2) break block9;
                    bl2 = ((t91_0)object5).b;
                    if (bl2) break block10;
                    break block11;
                }
                object4 = t91_0.g;
                objectArray = Level.FINE;
                boolean bl3 = ((Logger)object4).isLoggable((Level)objectArray);
                if (bl3) {
                    objectArray = new StringBuilder((String)object2);
                    object2 = f91_0.b;
                    object2 = ((ff_2)object2).e();
                    objectArray.append((String)object2);
                    object2 = objectArray.toString();
                    objectArray = new Object[]{};
                    object2 = ez3.i((String)object2, objectArray);
                    ((Logger)object4).fine((String)object2);
                }
                object2 = ((t91_0)object5).a;
                object4 = f91_0.b;
                object2.V((ff_2)object4);
                object2 = ((t91_0)object5).a;
                object2.flush();
                // MONITOREXIT : object5
            }
            object5 = ((g91_0)object).y;
            object2 = ((g91_0)object).r;
            ((t91_0)object5).p((R03)object2);
            object5 = ((g91_0)object).r;
            object3 = ((R03)object5).a();
            n4 = (char)-1;
            if (object3 != n4) {
                object4 = ((g91_0)object).y;
                long l2 = object3 -= n4;
                ((t91_0)object4).u(0, l2);
            }
            object5 = c2.f();
            object2 = ((g91_0)object).d;
            object = ((g91_0)object).z;
            object4 = new ti3_2((String)object2, (Function0)object);
            ((b)object5).c((ri3_1)object4, 0L);
            return;
        }
        object2 = "closed";
        object = new IOException((String)object2);
        throw object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Connection{");
        Object object = this.b;
        Object object2 = ((wp2_2)object).a.i.d;
        stringBuilder.append((String)object2);
        stringBuilder.append(':');
        int n3 = ((wp2_2)object).a.i.e;
        stringBuilder.append(n3);
        stringBuilder.append(", proxy=");
        object2 = ((wp2_2)object).b;
        stringBuilder.append(object2);
        object2 = " hostAddress=";
        stringBuilder.append((String)object2);
        object = ((wp2_2)object).c;
        stringBuilder.append(object);
        stringBuilder.append(" cipherSuite=");
        object = this.e;
        if (object == null || (object = ((k21_0)object).b) == null) {
            object = "none";
        }
        stringBuilder.append(object);
        stringBuilder.append(" protocol=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

