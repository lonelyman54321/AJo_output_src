/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.Intrinsics;

public final class K21$a {
    public static k21_0 a(SSLSession object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object object2 = object.getCipherSuite();
        if (object2 != null) {
            Object object3 = "TLS_NULL_WITH_NULL_NULL";
            boolean bl2 = Intrinsics.areEqual(object2, object3);
            if (bl2) {
                bl2 = true;
            } else {
                object3 = "SSL_NULL_WITH_NULL_NULL";
                bl2 = Intrinsics.areEqual(object2, object3);
            }
            if (!bl2) {
                object2 = iu_1.b.b((String)object2);
                object3 = object.getProtocol();
                if (object3 != null) {
                    Object object4 = "NONE";
                    boolean bl3 = Intrinsics.areEqual(object4, object3);
                    if (!bl3) {
                        block14: {
                            object4 = wn3_0.Companion;
                            object4.getClass();
                            object3 = Wn3$a.a(object3);
                            object4 = object.getPeerCertificates();
                            if (object4 == null) break block14;
                            int n3 = ((Certificate[])object4).length;
                            object4 = Arrays.copyOf(object4, n3);
                            object4 = ez3.l(object4);
                        }
                        try {
                            object4 = mz0_2.a;
                        }
                        catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
                            object4 = mz0_2.a;
                        }
                        object = object.getLocalCertificates();
                        if (object != null) {
                            int n4 = ((Certificate[])object).length;
                            object = ez3.l(Arrays.copyOf(object, n4));
                        } else {
                            object = mz0_2.a;
                        }
                        K21$a$a k21$a$a = new K21$a$a((List)object4);
                        k21_0 k21_02 = new k21_0((wn3_0)((Object)object3), (iu_1)object2, (List)object, k21$a$a);
                        return k21_02;
                    }
                    object = new IOException("tlsVersion == NONE");
                    throw object;
                }
                object2 = "tlsVersion == null".toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            object2 = "cipherSuite == ".concat((String)object2);
            object = new IOException((String)object2);
            throw object;
        }
        object2 = "cipherSuite == null".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

