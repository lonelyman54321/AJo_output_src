/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.openjsse.net.ssl.OpenJSSE
 */
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.openjsse.net.ssl.OpenJSSE;

public final class H92
extends zs2_2 {
    public static final boolean d;
    public final Provider c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl2 = false;
        String string2 = "org.openjsse.net.ssl.OpenJSSE";
        Object object = H92$a.class;
        try {
            object = ((Class)object).getClassLoader();
            Class.forName(string2, false, (ClassLoader)object);
            bl2 = true;
        }
        catch (ClassNotFoundException classNotFoundException) {}
        d = bl2;
    }

    public H92() {
        Object object = new OpenJSSE();
        object = (Provider)object;
        this.c = object;
    }

    public final void d(SSLSocket sSLSocket, String string2, List list) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(list, "protocols");
        super.d(sSLSocket, string2, list);
    }

    public final String f(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        super.f(sSLSocket);
        return null;
    }

    public final SSLContext k() {
        Provider provider = this.c;
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", provider);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    public final X509TrustManager m() {
        Object object = TrustManagerFactory.getDefaultAlgorithm();
        Object object2 = this.c;
        object = TrustManagerFactory.getInstance((String)object, (Provider)object2);
        object2 = null;
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
}

