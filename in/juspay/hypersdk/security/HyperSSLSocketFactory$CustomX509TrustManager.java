/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.http.X509TrustManagerExtensions
 */
package in.juspay.hypersdk.security;

import android.net.http.X509TrustManagerExtensions;
import in.juspay.hypersdk.core.PaymentUtils;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Set;
import javax.net.ssl.X509TrustManager;

class HyperSSLSocketFactory$CustomX509TrustManager
implements X509TrustManager {
    private final Set acceptedCerts;
    private final X509TrustManager defaultTrust;
    private final X509TrustManagerExtensions defaultTrustExtension;

    public HyperSSLSocketFactory$CustomX509TrustManager(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions, Set set) {
        this.defaultTrust = x509TrustManager;
        this.acceptedCerts = set;
        this.defaultTrustExtension = x509TrustManagerExtensions;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string2) {
        this.defaultTrust.checkClientTrusted(x509CertificateArray, string2);
    }

    public void checkServerTrusted(X509Certificate[] object, String object2) {
        X509TrustManager x509TrustManager = this.defaultTrust;
        x509TrustManager.checkServerTrusted((X509Certificate[])object, (String)object2);
        object2 = this.acceptedCerts;
        boolean bl2 = PaymentUtils.validatePinning(object, (Set)object2);
        if (!bl2) {
            return;
        }
        object = new CertificateException("SSL Pinning failed");
        throw object;
    }

    public void checkServerTrusted(X509Certificate[] object, String object2, String string2) {
        X509TrustManagerExtensions x509TrustManagerExtensions = this.defaultTrustExtension;
        x509TrustManagerExtensions.checkServerTrusted(object, (String)object2, string2);
        object2 = this.acceptedCerts;
        boolean bl2 = PaymentUtils.validatePinning(object, (Set)object2);
        if (!bl2) {
            return;
        }
        object = new CertificateException("SSL Pinning failed");
        throw object;
    }

    public X509Certificate[] getAcceptedIssuers() {
        return this.defaultTrust.getAcceptedIssuers();
    }
}

