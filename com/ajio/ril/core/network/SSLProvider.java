/*
 * Decompiled with CFR 0.152.
 */
package com.ajio.ril.core.network;

import com.ajio.ril.core.network.SSLProvider$1;
import com.ajio.ril.core.network.Tls12SocketFactory;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class SSLProvider {
    private static SSLProvider sslProvider;
    private String[] SSL_FALLBACK_KEYS;

    private SSLProvider() {
        String[] stringArray = new String[]{"Si1L0+d+jtLMiZJI1OnV1IGfknP020mGWLsUIyXjWOY=", "/rF3UVf47NA51kxHZkCEjOh0dqx1sIwyXCViFVQuAhs=", "/sCLZu7f94gUNT9PZh8GFNnrfx+BM5ZG1IUQ/sWcMPs=", "rP5kxTRjjzi3DE9DjQ483gbzl9lqjMDMATEwUrN7OSo=", "AtyGqfb4at88TtUafwFOCifCMyr6x783o2XkZn+aSrQ=", "q65pG5Wme8HN4q9m1TRuqGsX09BtlPMTfcSgrDHQetQ=", "nMIQPG87MsvpvAQ7/BAYCXxVKVpzlN1iyUdGDNaMeps=", "2HWyJmwKoCQAfVYllSV0AVuS65k1x2obYTvhQ6riRQM=", "Agk1GHMeamyXKu66T2wicx/4n8NDY/lguYj7amPFwAM=", "shaLkqEVTBG4DJYnIyFdVXrONRZVgoVc8O6tuVlnze8=", "TN0ycqVuDhbvhAyqEH4EH2kPvfIbzcqTLn63iSDBi2o=", "uf5LaADQFggqOhwpx40otn2mk5KSt1W74g73ta8M2KU="};
        this.SSL_FALLBACK_KEYS = stringArray;
    }

    public static SSLProvider getInstance() {
        SSLProvider sSLProvider = sslProvider;
        if (sSLProvider == null) {
            sslProvider = sSLProvider = new SSLProvider();
        }
        return sslProvider;
    }

    private TrustManager[] getTrsutManagers() {
        X509TrustManager x509TrustManager = this.getX509TrustManager();
        TrustManager[] trustManagerArray = new TrustManager[]{x509TrustManager};
        return trustManagerArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public SSLSocketFactory getSSLSocketFactory() {
        void var2_5;
        Object object;
        block4: {
            object = null;
            Object object2 = "TLSv1.2";
            try {
                object2 = SSLContext.getInstance((String)object2);
                if (object2 != null) {
                    Object object3 = this.getTrsutManagers();
                    SecureRandom secureRandom = new SecureRandom();
                    ((SSLContext)object2).init(null, (TrustManager[])object3, secureRandom);
                    object2 = ((SSLContext)object2).getSocketFactory();
                    object3 = new Tls12SocketFactory((SSLSocketFactory)object2);
                    return object3;
                }
            }
            catch (KeyManagementException keyManagementException) {
                break block4;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                break block4;
            }
            object2 = "SSLContext is null";
            Object[] objectArray = null;
            objectArray = new Object[]{};
            yn3$a yn3$a = yn3_0.a;
            yn3$a.d((String)object2, objectArray);
            return object;
        }
        yn3_0.a((Exception)var2_5);
        return object;
    }

    public String[] getValidSSLFallbackPins() {
        return this.SSL_FALLBACK_KEYS;
    }

    public X509TrustManager getX509TrustManager() {
        SSLProvider$1 sSLProvider$1 = new SSLProvider$1(this);
        return sSLProvider$1;
    }
}

