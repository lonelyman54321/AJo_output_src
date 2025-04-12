/*
 * Decompiled with CFR 0.152.
 */
package com.ajio.ril.core.network;

import com.ajio.ril.core.network.SSLProvider;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

class SSLProvider$1
implements X509TrustManager {
    final /* synthetic */ SSLProvider this$0;

    public SSLProvider$1(SSLProvider sSLProvider) {
        this.this$0 = sSLProvider;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string2) {
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArray, String string2) {
    }

    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}

