/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oi$a
 */
public final class oi$a_0
implements bs3_0 {
    public final X509TrustManager a;
    public final Method b;

    public oi$a_0(X509TrustManager x509TrustManager, Method method) {
        Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
        Intrinsics.checkNotNullParameter(method, "findByIssuerAndSignatureMethod");
        this.a = x509TrustManager;
        this.b = method;
    }

    public final X509Certificate a(X509Certificate object) {
        IllegalAccessException illegalAccessException2;
        Object object2;
        block9: {
            object2 = "cert";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = this.b;
            X509TrustManager x509TrustManager = this.a;
            int n3 = 1;
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            object = ((Method)object2).invoke((Object)x509TrustManager, objectArray);
            object2 = "null cannot be cast to non-null type java.security.cert.TrustAnchor";
            Intrinsics.checkNotNull(object, (String)object2);
            object = (TrustAnchor)object;
            try {
                object = ((TrustAnchor)object).getTrustedCert();
            }
            catch (IllegalAccessException illegalAccessException2) {
                break block9;
            }
            catch (InvocationTargetException invocationTargetException) {
                object = null;
            }
            return object;
        }
        object2 = new AssertionError("unable to get issues and signature", illegalAccessException2);
        throw object2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof oi$a_0;
        if (!bl3) {
            return false;
        }
        object = (oi$a_0)object;
        X509TrustManager x509TrustManager = this.a;
        Object object2 = ((oi$a_0)object).a;
        bl3 = Intrinsics.areEqual(x509TrustManager, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((oi$a_0)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CustomTrustRootIndex(trustManager=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", findByIssuerAndSignatureMethod=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

