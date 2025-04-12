/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.http.X509TrustManagerExtensions
 */
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Of
 */
public final class of_1
extends i0_0 {
    public final X509TrustManager a;
    public final X509TrustManagerExtensions b;

    public of_1(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.a = x509TrustManager;
        this.b = x509TrustManagerExtensions;
    }

    public final List E(String object, List object2) {
        String string2;
        Intrinsics.checkNotNullParameter(object2, "chain");
        Intrinsics.checkNotNullParameter(object, "hostname");
        object2 = (Collection)object2;
        Object object3 = new X509TrustManagerExtensions[]{};
        object2 = object2.toArray((T[])object3);
        try {
            object3 = this.b;
            string2 = "RSA";
        }
        catch (CertificateException certificateException) {
            object3 = certificateException.getMessage();
            object2 = new SSLPeerUnverifiedException((String)object3);
            ((Throwable)object2).initCause(certificateException);
            throw object2;
        }
        object = object3.checkServerTrusted((X509Certificate[])object2, string2, (String)object);
        object2 = "x509TrustManagerExtensio\u2026ficates, \"RSA\", hostname)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        return object;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        X509TrustManager x509TrustManager;
        boolean bl3 = object instanceof of_1;
        if (bl3 && (object = ((of_1)object).a) == (x509TrustManager = this.a)) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }
}

