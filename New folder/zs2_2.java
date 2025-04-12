/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zs2
 */
public class zs2_2 {
    public static volatile zs2_2 a;
    public static final Logger b;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        void var4_19;
        block28: {
            void var3_6;
            block29: {
                void var3_5;
                void var4_12;
                Iterator iterator;
                boolean bl2;
                int n3;
                block22: {
                    void var3_8;
                    block20: {
                        Object object;
                        Object object2;
                        Object object3;
                        String string2;
                        block19: {
                            block27: {
                                block24: {
                                    block26: {
                                        block25: {
                                            block23: {
                                                block21: {
                                                    n3 = 1;
                                                    string2 = null;
                                                    bl2 = Zs2$a.c();
                                                    Object var3_3 = null;
                                                    if (!bl2) break block21;
                                                    iterator = ai_2.b.entrySet().iterator();
                                                    break block22;
                                                }
                                                object3 = "Conscrypt";
                                                object2 = Security.getProviders()[0].getName();
                                                bl2 = Intrinsics.areEqual(object3, object2);
                                                if (!bl2) break block23;
                                                bl2 = k50_0.d;
                                                if (bl2) {
                                                    object2 = new Object();
                                                } else {
                                                    bl2 = false;
                                                    object2 = null;
                                                }
                                                if (object2 != null) break block24;
                                            }
                                            if (!(bl2 = Intrinsics.areEqual(object3 = "BC", object2 = Security.getProviders()[0].getName()))) break block25;
                                            bl2 = ba_1.d;
                                            if (bl2) {
                                                object2 = new Object();
                                            } else {
                                                bl2 = false;
                                                object2 = null;
                                            }
                                            if (object2 != null) break block24;
                                        }
                                        if (!(bl2 = Intrinsics.areEqual(object3 = "OpenJSSE", object2 = Security.getProviders()[0].getName()))) break block26;
                                        bl2 = H92.d;
                                        if (bl2) {
                                            object2 = new Object();
                                        } else {
                                            bl2 = false;
                                            object2 = null;
                                        }
                                        if (object2 != null) break block24;
                                    }
                                    if (bl2 = wk1_2.c) {
                                        object2 = new Object();
                                    } else {
                                        bl2 = false;
                                        object2 = null;
                                    }
                                    if (object2 == null) break block27;
                                }
                                Class<SSLSocket> clazz = object2;
                                break block28;
                            }
                            object2 = SSLSocket.class;
                            object3 = System.getProperty("java.specification.version", "unknown");
                            object = "jvmVersion";
                            try {
                                Intrinsics.checkNotNullExpressionValue(object3, (String)object);
                                int n4 = Integer.parseInt((String)object3);
                                int n7 = 9;
                                if (n4 < n7) break block19;
                                break block20;
                            }
                            catch (NumberFormatException numberFormatException) {}
                        }
                        object3 = "org.eclipse.jetty.alpn.ALPN";
                        try {
                            uk1_2 uk1_22;
                            object3 = Class.forName((String)object3, n3 != 0, null);
                            object = "org.eclipse.jetty.alpn.ALPN$Provider";
                            object = Class.forName((String)object, n3 != 0, null);
                            Class[] classArray = "org.eclipse.jetty.alpn.ALPN$ClientProvider";
                            Class<?> clazz = Class.forName((String)classArray, n3 != 0, null);
                            classArray = "org.eclipse.jetty.alpn.ALPN$ServerProvider";
                            Class<?> clazz2 = Class.forName((String)classArray, n3 != 0, null);
                            classArray = "put";
                            int n8 = 2;
                            Object object4 = new Class[n8];
                            object4[0] = object2;
                            object4[n3] = object;
                            Method method = ((Class)object3).getMethod((String)classArray, (Class<?>)object4);
                            object = "get";
                            classArray = new Class[n3];
                            classArray[0] = object2;
                            Method method2 = ((Class)object3).getMethod((String)object, classArray);
                            object = "remove";
                            Class[] classArray2 = new Class[n3];
                            classArray2[0] = object2;
                            Method method3 = ((Class)object3).getMethod((String)object, classArray2);
                            string2 = "putMethod";
                            Intrinsics.checkNotNullExpressionValue(method, string2);
                            string2 = "getMethod";
                            Intrinsics.checkNotNullExpressionValue(method2, string2);
                            string2 = "removeMethod";
                            Intrinsics.checkNotNullExpressionValue(method3, string2);
                            string2 = "clientProviderClass";
                            Intrinsics.checkNotNullExpressionValue(clazz, string2);
                            string2 = "serverProviderClass";
                            Intrinsics.checkNotNullExpressionValue(clazz2, string2);
                            object4 = uk1_22;
                            uk1_2 uk1_23 = uk1_22 = new uk1_2(method, method2, method3, clazz, clazz2);
                        }
                        catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {}
                    }
                    if (var3_8 != null) break block29;
                    zs2_2 zs2_22 = new zs2_2();
                    break block28;
                }
                while (bl2 = iterator.hasNext()) {
                    Object object = iterator.next();
                    Object object5 = (String)object.getKey();
                    object = (String)object.getValue();
                    CopyOnWriteArraySet copyOnWriteArraySet = ai_2.a;
                    int n10 = copyOnWriteArraySet.add(object5 = Logger.getLogger((String)object5));
                    if (n10 == 0) continue;
                    ((Logger)object5).setUseParentHandlers(false);
                    n10 = Log.isLoggable((String)object, (int)3);
                    object = n10 != 0 ? Level.FINE : ((bl2 = Log.isLoggable((String)object, (int)(n10 = 4))) ? Level.INFO : Level.WARNING);
                    ((Logger)object5).setLevel((Level)object);
                    object = bi_2.a;
                    ((Logger)object5).addHandler((Handler)object);
                }
                n3 = ue_2.d;
                if (n3 != 0) {
                    ue_2 ue_22 = new ue_2();
                } else {
                    n3 = 0;
                    Object var4_11 = null;
                }
                if (var4_12 != null) break block28;
                n3 = oi_2.e;
                if (n3 != 0) {
                    oi_2 oi_22 = new oi_2();
                }
                Intrinsics.checkNotNull(var3_5);
            }
            void var4_14 = var3_6;
        }
        a = var4_19;
        b = Logger.getLogger(x72_0.class.getName());
    }

    public static void i(int n3, String string2, Throwable throwable) {
        String string3 = "message";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n4 = 5;
        Level level = n3 == n4 ? Level.WARNING : Level.INFO;
        b.log(level, string2, throwable);
    }

    public void a(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
    }

    public i0_0 b(X509TrustManager object) {
        Intrinsics.checkNotNullParameter(object, "trustManager");
        object = this.c((X509TrustManager)object);
        tw_2 tw_22 = new tw_2((bs3_0)object);
        return tw_22;
    }

    public bs3_0 c(X509TrustManager x509CertificateArray) {
        Intrinsics.checkNotNullParameter(x509CertificateArray, "trustManager");
        x509CertificateArray = x509CertificateArray.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(x509CertificateArray, "trustManager.acceptedIssuers");
        int n3 = x509CertificateArray.length;
        x509CertificateArray = Arrays.copyOf(x509CertificateArray, n3);
        ox_2 ox_22 = new ox_2(x509CertificateArray);
        return ox_22;
    }

    public void d(SSLSocket sSLSocket, String string2, List list) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int n3) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, n3);
    }

    public String f(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        return null;
    }

    public Object g() {
        String string2 = "response.body().close()";
        Intrinsics.checkNotNullParameter(string2, "closer");
        Object object = b;
        Level level = Level.FINE;
        boolean bl2 = ((Logger)object).isLoggable(level);
        if (bl2) {
            object = new Throwable(string2);
        } else {
            bl2 = false;
            object = null;
        }
        return object;
    }

    public boolean h(String string2) {
        Intrinsics.checkNotNullParameter(string2, "hostname");
        return true;
    }

    public void j(Object object, String string2) {
        String string3 = "message";
        Intrinsics.checkNotNullParameter(string2, string3);
        if (object == null) {
            string3 = " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
            string2 = Ft2.a(string2, string3);
        }
        object = (Throwable)object;
        zs2_2.i(5, string2, (Throwable)object);
    }

    public SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager object) {
        TrustManager[] trustManagerArray;
        int n3;
        Object object2 = "trustManager";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        try {
            object2 = this.k();
            n3 = 1;
        }
        catch (GeneralSecurityException generalSecurityException) {
            trustManagerArray = new StringBuilder("No System TLS: ");
            trustManagerArray.append(generalSecurityException);
            trustManagerArray = trustManagerArray.toString();
            object2 = new AssertionError((String)trustManagerArray, generalSecurityException);
            throw object2;
        }
        trustManagerArray = new TrustManager[n3];
        trustManagerArray[0] = object;
        object = null;
        ((SSLContext)object2).init(null, trustManagerArray, null);
        object = ((SSLContext)object2).getSocketFactory();
        object2 = "newSSLContext().apply {\n\u2026ll)\n      }.socketFactory";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        return object;
    }

    public X509TrustManager m() {
        Object object = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        Object object2 = null;
        ((TrustManagerFactory)object).init((KeyStore)null);
        object = ((TrustManagerFactory)object).getTrustManagers();
        Intrinsics.checkNotNull(object);
        int n3 = ((TrustManager[])object).length;
        int n4 = 1;
        if (n3 == n4) {
            n3 = 0;
            object2 = object[0];
            n4 = object2 instanceof X509TrustManager;
            if (n4 != 0) {
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager)object2;
            }
        }
        object2 = new StringBuilder("Unexpected default trust managers: ");
        object = Arrays.toString((Object[])object);
        Intrinsics.checkNotNullExpressionValue(object, "toString(this)");
        ((StringBuilder)object2).append((String)object);
        object = ((StringBuilder)object2).toString();
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public final String toString() {
        String string2 = this.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(string2, "javaClass.simpleName");
        return string2;
    }
}

