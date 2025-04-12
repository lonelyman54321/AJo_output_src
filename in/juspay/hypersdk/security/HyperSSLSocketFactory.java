/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.http.X509TrustManagerExtensions
 */
package in.juspay.hypersdk.security;

import android.net.http.X509TrustManagerExtensions;
import in.juspay.hypersdk.security.HyperSSLSocketFactory$CustomX509TrustManager;
import in.juspay.hypersdk.utils.network.JuspaySSLSocketFactory;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Set;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class HyperSSLSocketFactory
extends JuspaySSLSocketFactory {
    public static final X509TrustManager DEFAULT_TRUST_MANAGER = HyperSSLSocketFactory.getDefaultTrustManager();
    private final SSLSocketFactory sslSocketFactory;

    public HyperSSLSocketFactory(Set object) {
        SSLContext sSLContext = SSLContext.getInstance("SSL");
        X509TrustManager x509TrustManager = DEFAULT_TRUST_MANAGER;
        Object object2 = new X509TrustManagerExtensions(x509TrustManager);
        HyperSSLSocketFactory$CustomX509TrustManager hyperSSLSocketFactory$CustomX509TrustManager = new HyperSSLSocketFactory$CustomX509TrustManager(x509TrustManager, (X509TrustManagerExtensions)object2, (Set)object);
        object = new TrustManager[]{hyperSSLSocketFactory$CustomX509TrustManager};
        sSLContext.init(null, (TrustManager[])object, (SecureRandom)object2);
        this.sslSocketFactory = object = sSLContext.getSocketFactory();
    }

    private static X509TrustManager getDefaultTrustManager() {
        Object object;
        try {
            object = TrustManagerFactory.getDefaultAlgorithm();
        }
        catch (Exception exception) {
            return null;
        }
        object = TrustManagerFactory.getInstance((String)object);
        object.init((KeyStore)null);
        object = object.getTrustManagers();
        object = object[0];
        return (X509TrustManager)object;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }
}

