/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.a$a;
import com.clevertap.android.sdk.b;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class ix3$c
extends Lambda
implements Function0 {
    public final /* synthetic */ ix3 c;

    public ix3$c(ix3 ix32) {
        this.c = ix32;
        super(0);
    }

    public final Object invoke() {
        Object object;
        Object object2;
        Object object3;
        TrustManager[] trustManagerArray;
        Object object4;
        Object object5;
        block18: {
            block17: {
                this.c.getClass();
                object5 = null;
                object4 = "TLS";
                object4 = SSLContext.getInstance((String)object4);
                trustManagerArray = "X.509";
                trustManagerArray = CertificateFactory.getInstance((String)trustManagerArray);
                object3 = TrustManagerFactory.getDefaultAlgorithm();
                object3 = TrustManagerFactory.getInstance((String)object3);
                object2 = KeyStore.getDefaultType();
                object2 = KeyStore.getInstance((String)object2);
                ((KeyStore)object2).load(null, null);
                object = object2.getClass();
                object = ((Class)object).getClassLoader();
                if (object == null) break block17;
                String string2 = "com/clevertap/android/sdk/certificates/AmazonRootCA1.cer";
                object = ((ClassLoader)object).getResourceAsStream(string2);
                break block18;
            }
            object = null;
        }
        Object object6 = new BufferedInputStream((InputStream)object);
        trustManagerArray = trustManagerArray.generateCertificate((InputStream)object6);
        object6 = "null cannot be cast to non-null type java.security.cert.X509Certificate";
        Intrinsics.checkNotNull(trustManagerArray, (String)object6);
        trustManagerArray = (X509Certificate)trustManagerArray;
        object6 = "AmazonRootCA1";
        ((KeyStore)object2).setCertificateEntry((String)object6, (Certificate)trustManagerArray);
        ((TrustManagerFactory)object3).init((KeyStore)object2);
        trustManagerArray = ((TrustManagerFactory)object3).getTrustManagers();
        try {
            ((SSLContext)object4).init(null, trustManagerArray, null);
            b.c();
            object5 = object4;
        }
        catch (Exception exception) {
            object4 = a$a.INFO;
            ((a$a)((Object)object4)).intValue();
        }
        return object5;
    }
}

