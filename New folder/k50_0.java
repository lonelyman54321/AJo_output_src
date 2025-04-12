/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.conscrypt.Conscrypt
 *  org.conscrypt.ConscryptHostnameVerifier
 */
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/*
 * Renamed from k50
 */
public final class k50_0
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
        String string2 = "org.conscrypt.Conscrypt$Version";
        Object object = k50$a_0.class;
        try {
            object = ((Class)object).getClassLoader();
            Class.forName(string2, false, (ClassLoader)object);
            boolean bl3 = Conscrypt.isAvailable();
            if (bl3 && (bl3 = k50$a_0.a())) {
                bl2 = true;
            }
        }
        catch (ClassNotFoundException | NoClassDefFoundError throwable) {}
        d = bl2;
    }

    public k50_0() {
        Provider provider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(provider, "newProvider()");
        this.c = provider;
    }

    public final void d(SSLSocket sSLSocket, String stringArray, List stringArray2) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        String string2 = "protocols";
        Intrinsics.checkNotNullParameter(stringArray2, string2);
        boolean bl2 = Conscrypt.isConscrypt((SSLSocket)sSLSocket);
        if (bl2) {
            boolean bl3 = true;
            Conscrypt.setUseSessionTickets((SSLSocket)sSLSocket, (boolean)bl3);
            stringArray = Zs2$a.a((List)stringArray2);
            stringArray2 = new String[]{};
            stringArray = stringArray.toArray(stringArray2);
            Conscrypt.setApplicationProtocols((SSLSocket)sSLSocket, (String[])stringArray);
        } else {
            super.d(sSLSocket, (String)stringArray, (List)stringArray2);
        }
    }

    public final String f(SSLSocket object) {
        String string2 = "sslSocket";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = Conscrypt.isConscrypt((SSLSocket)object);
        if (bl2) {
            object = Conscrypt.getApplicationProtocol((SSLSocket)object);
        } else {
            super.f((SSLSocket)object);
            object = null;
        }
        return object;
    }

    public final SSLContext k() {
        Provider provider = this.c;
        SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    public final SSLSocketFactory l(X509TrustManager object) {
        Intrinsics.checkNotNullParameter(object, "trustManager");
        SSLContext sSLContext = this.k();
        TrustManager[] trustManagerArray = new TrustManager[]{object};
        sSLContext.init(null, trustManagerArray, null);
        object = sSLContext.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(object, "newSSLContext().apply {\n\u2026null)\n    }.socketFactory");
        return object;
    }

    public final X509TrustManager m() {
        Object object = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        Object object2 = null;
        object.init((KeyStore)null);
        object = object.getTrustManagers();
        Intrinsics.checkNotNull(object);
        int n3 = ((TrustManager[])object).length;
        int n4 = 1;
        if (n3 == n4) {
            n3 = 0;
            object2 = object[0];
            n4 = object2 instanceof X509TrustManager;
            if (n4 != 0) {
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                object2 = (X509TrustManager)object2;
                object = k50$b_0.a;
                Conscrypt.setHostnameVerifier((TrustManager)object2, (ConscryptHostnameVerifier)object);
                return object2;
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

