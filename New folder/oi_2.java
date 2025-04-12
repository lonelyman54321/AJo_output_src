/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.http.X509TrustManagerExtensions
 *  android.os.Build$VERSION
 *  android.security.NetworkSecurityPolicy
 */
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oi
 */
public final class oi_2
extends zs2_2 {
    public static final boolean e;
    public final ArrayList c;
    public final wv_2 d;

    static {
        int n3;
        int n4 = Zs2$a.c();
        boolean bl2 = false;
        if (n4 != 0 && (n4 = Build.VERSION.SDK_INT) < (n3 = 30)) {
            bl2 = true;
        }
        e = bl2;
    }

    public oi_2() {
        boolean bl2;
        int n3;
        Object object;
        int n4 = 1;
        Object object2 = null;
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", "packageName");
        Object object3 = null;
        Object object4 = "com.android.org.conscrypt.OpenSSLSocketImpl";
        object4 = Class.forName((String)object4);
        Object object5 = "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>";
        Intrinsics.checkNotNull(object4, (String)object5);
        object5 = "com.android.org.conscrypt.OpenSSLSocketFactoryImpl";
        object5 = Class.forName((String)object5);
        Object object6 = "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>";
        Intrinsics.checkNotNull(object5, (String)object6);
        object6 = "com.android.org.conscrypt.SSLParametersImpl";
        object6 = Class.forName((String)object6);
        Object[] objectArray = "paramsClass";
        Intrinsics.checkNotNullExpressionValue(object6, (String)objectArray);
        objectArray = "sslSocketClass";
        Intrinsics.checkNotNullParameter(object4, (String)objectArray);
        objectArray = "sslSocketFactoryClass";
        Intrinsics.checkNotNullParameter(object5, (String)objectArray);
        object5 = "paramClass";
        Intrinsics.checkNotNullParameter(object6, (String)object5);
        try {
            super((Class)object4);
        }
        catch (Exception exception) {
            zs2_2.a.getClass();
            object5 = "unable to load android socket classes";
            n3 = 5;
            zs2_2.i(n3, (String)object5, exception);
            bl2 = false;
            object = null;
        }
        object5 = hj_2.f;
        object4 = new xn0_2((Xn0$a)object5);
        object6 = l50_0.a;
        object5 = new xn0_2((Xn0$a)object6);
        objectArray = ca_1.a;
        object6 = new xn0_2((Xn0$a)objectArray);
        int n7 = 4;
        objectArray = new y83_0[n7];
        objectArray[0] = object;
        objectArray[n4] = object4;
        objectArray[2] = object5;
        int n8 = 3;
        objectArray[n8] = object6;
        Intrinsics.checkNotNullParameter(objectArray, "elements");
        object4 = tp_2.y(objectArray);
        object5 = new ArrayList();
        object4 = ((ArrayList)object4).iterator();
        while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
            object6 = object4.next();
            object = object6;
            object = (y83_0)object6;
            bl2 = object.isSupported();
            if (!bl2) continue;
            ((ArrayList)object5).add(object6);
        }
        this.c = object5;
        object4 = "dalvik.system.CloseGuard";
        object4 = Class.forName((String)object4);
        object5 = "get";
        object5 = ((Class)object4).getMethod((String)object5, null);
        object6 = "open";
        Object object7 = new Class[n4];
        object = String.class;
        object7[0] = object;
        object7 = ((Class)object4).getMethod((String)object6, (Class<?>)object7);
        object2 = "warnIfOpen";
        try {
            object2 = ((Class)object4).getMethod((String)object2, null);
            object3 = object5;
        }
        catch (Exception exception) {
            n4 = 0;
            object7 = null;
            object2 = null;
        }
        this.d = object4 = new wv_2((Method)object3, (Method)object7, (Method)object2);
    }

    public final i0_0 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Object object = "trustManager";
        Intrinsics.checkNotNullParameter(x509TrustManager, (String)object);
        Intrinsics.checkNotNullParameter(x509TrustManager, (String)object);
        object = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            object = new of_1(x509TrustManager, x509TrustManagerExtensions);
        }
        if (object == null) {
            object = super.b(x509TrustManager);
        }
        return object;
    }

    public final bs3_0 c(X509TrustManager x509TrustManager) {
        bs3_0 bs3_02;
        boolean bl2 = true;
        Object object = "trustManager";
        Intrinsics.checkNotNullParameter(x509TrustManager, (String)object);
        object = x509TrustManager.getClass();
        String string2 = "findTrustAnchorByIssuerAndSignature";
        Class[] classArray = new Class[bl2];
        Class<X509Certificate> clazz = X509Certificate.class;
        classArray[0] = clazz;
        object = ((Class)object).getDeclaredMethod(string2, classArray);
        ((AccessibleObject)object).setAccessible(bl2);
        string2 = "method";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        try {
            bs3_02 = new oi$a_0(x509TrustManager, (Method)object);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            bs3_02 = super.c(x509TrustManager);
        }
        return bs3_02;
    }

    public final void d(SSLSocket sSLSocket, String string2, List list) {
        Object object;
        block2: {
            boolean bl2;
            Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
            Intrinsics.checkNotNullParameter(list, "protocols");
            Iterator iterator = this.c.iterator();
            while (bl2 = iterator.hasNext()) {
                Object object2 = object = iterator.next();
                object2 = (y83_0)object;
                boolean bl3 = object2.a(sSLSocket);
                if (!bl3) continue;
                break block2;
            }
            bl2 = false;
            object = null;
        }
        object = (y83_0)object;
        if (object != null) {
            object.c(sSLSocket, string2, list);
        }
    }

    public final void e(Socket socket, InetSocketAddress serializable, int n3) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        String string2 = "address";
        Intrinsics.checkNotNullParameter(serializable, string2);
        try {
            socket.connect((SocketAddress)serializable, n3);
            return;
        }
        catch (ClassCastException classCastException) {
            int n4 = Build.VERSION.SDK_INT;
            n3 = 26;
            if (n4 == n3) {
                serializable = new IOException("Exception in connect", classCastException);
                throw serializable;
            }
            throw classCastException;
        }
    }

    public final String f(SSLSocket sSLSocket) {
        String string2;
        Object object;
        block3: {
            boolean bl2;
            block2: {
                Object object2;
                boolean bl3;
                Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
                Iterator iterator = this.c.iterator();
                do {
                    bl2 = iterator.hasNext();
                    string2 = null;
                    if (!bl2) break block2;
                    object2 = object = iterator.next();
                } while (!(bl3 = (object2 = (y83_0)object).a(sSLSocket)));
                break block3;
            }
            bl2 = false;
            object = null;
        }
        object = (y83_0)object;
        if (object != null) {
            string2 = object.b(sSLSocket);
        }
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object g() {
        String string2 = "response.body().close()";
        Object object = "closer";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Object object2 = this.d;
        object2.getClass();
        Intrinsics.checkNotNullParameter(string2, (String)object);
        object = null;
        Object object3 = ((wv_2)object2).a;
        if (object3 == null) return object;
        try {
            object3 = ((Method)object3).invoke(null, null);
        }
        catch (Exception exception) {
            return object;
        }
        object2 = ((wv_2)object2).b;
        Intrinsics.checkNotNull(object2);
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        ((Method)object2).invoke(object3, objectArray);
        return object3;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean h(String string2) {
        void var5_9;
        String string3 = "hostname";
        Intrinsics.checkNotNullParameter(string2, string3);
        int bl3 = Build.VERSION.SDK_INT;
        int bl4 = 24;
        if (bl3 >= bl4) {
            string3 = sk3_1.a();
            boolean bl2 = te_2.a((NetworkSecurityPolicy)string3, string2);
        } else {
            int n3 = 23;
            if (bl3 >= n3) {
                string2 = sk3_1.a();
                boolean bl2 = F20.b((NetworkSecurityPolicy)string2);
            } else {
                boolean bl5 = true;
            }
        }
        return (boolean)var5_9;
    }

    public final void j(Object object, String string2) {
        block5: {
            Intrinsics.checkNotNullParameter(string2, "message");
            Object object2 = this.d;
            object2.getClass();
            if (object != null) {
                try {
                    object2 = ((wv_2)object2).c;
                }
                catch (Exception exception) {}
                Intrinsics.checkNotNull(object2);
                ((Method)object2).invoke(object, null);
                break block5;
            }
            int n3 = 5;
            zs2_2.i(n3, string2, null);
        }
    }
}

