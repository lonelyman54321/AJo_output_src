/*
 * Decompiled with CFR 0.152.
 */
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ox
 */
public final class ox_2
implements bs3_0 {
    public final LinkedHashMap a;

    public ox_2(X509Certificate ... x509CertificateArray) {
        Intrinsics.checkNotNullParameter(x509CertificateArray, "caCerts");
        LinkedHashMap<X500Principal, Object> linkedHashMap = new LinkedHashMap<X500Principal, Object>();
        for (X509Certificate x509Certificate : x509CertificateArray) {
            X500Principal x500Principal = x509Certificate.getSubjectX500Principal();
            Intrinsics.checkNotNullExpressionValue(x500Principal, "caCert.subjectX500Principal");
            Object object = linkedHashMap.get(x500Principal);
            if (object == null) {
                linkedHashMap.put(x500Principal, object);
            }
            object = (Set)object;
            object.add((X509Certificate)x509Certificate);
        }
        this.a = linkedHashMap;
    }

    public final X509Certificate a(X509Certificate x509Certificate) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(x509Certificate, "cert");
        Iterator iterator = x509Certificate.getIssuerX500Principal();
        iterator = (Set)this.a.get(iterator);
        Object var3_3 = null;
        if (iterator == null) {
            return null;
        }
        iterator = ((Iterable)((Object)iterator)).iterator();
        while (bl2 = iterator.hasNext()) {
            Object t3 = iterator.next();
            Object object = t3;
            object = (X509Certificate)t3;
            try {
                object = ((Certificate)object).getPublicKey();
            }
            catch (Exception exception) {
                continue;
            }
            x509Certificate.verify((PublicKey)object);
            var3_3 = t3;
            break;
        }
        return var3_3;
    }

    public final boolean equals(Object object) {
        LinkedHashMap linkedHashMap;
        boolean bl2;
        boolean bl3;
        if (!(object == this || (bl3 = object instanceof ox_2) && (bl2 = Intrinsics.areEqual(object = ((ox_2)object).a, linkedHashMap = this.a)))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final int hashCode() {
        return ((Object)this.a).hashCode();
    }
}

