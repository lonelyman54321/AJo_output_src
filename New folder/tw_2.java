/*
 * Decompiled with CFR 0.152.
 */
import java.security.GeneralSecurityException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tw
 */
public final class tw_2
extends i0_0 {
    public final bs3_0 a;

    public tw_2(bs3_0 bs3_02) {
        Intrinsics.checkNotNullParameter(bs3_02, "trustRootIndex");
        this.a = bs3_02;
    }

    public final List E(String serializable, List object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "chain");
        Intrinsics.checkNotNullParameter(serializable, "hostname");
        object = (Collection)object;
        serializable = new ArrayDeque(object);
        object = new ArrayList();
        Object object2 = ((ArrayDeque)serializable).removeFirst();
        Intrinsics.checkNotNullExpressionValue(object2, "queue.removeFirst()");
        ((ArrayList)object).add(object2);
        object2 = null;
        int n4 = 0;
        Object object3 = null;
        block6: for (int i3 = 0; i3 < (n3 = 9); ++i3) {
            boolean bl2;
            n3 = ((ArrayList)object).size();
            int n7 = 1;
            Object object4 = ((ArrayList)object).get(n3 -= n7);
            String string2 = "null cannot be cast to non-null type java.security.cert.X509Certificate";
            Intrinsics.checkNotNull(object4, string2);
            object4 = (X509Certificate)object4;
            Object object5 = this.a.a((X509Certificate)object4);
            if (object5 != null) {
                n4 = ((ArrayList)object).size();
                if (n4 > n7 || (n4 = (int)(Intrinsics.areEqual(object4, object5) ? 1 : 0)) == 0) {
                    ((ArrayList)object).add(object5);
                }
                if ((n4 = (int)(Intrinsics.areEqual(object3 = ((X509Certificate)object5).getIssuerDN(), object4 = ((X509Certificate)object5).getSubjectDN()) ? 1 : 0)) != 0) {
                    try {
                        object3 = ((Certificate)object5).getPublicKey();
                    }
                    catch (GeneralSecurityException generalSecurityException) {}
                    ((Certificate)object5).verify((PublicKey)object3);
                    return object;
                }
                n4 = 1;
                continue;
            }
            Iterator iterator = ((ArrayDeque)serializable).iterator();
            object5 = "queue.iterator()";
            Intrinsics.checkNotNullExpressionValue(iterator, (String)object5);
            while (bl2 = iterator.hasNext()) {
                object5 = iterator.next();
                Intrinsics.checkNotNull(object5, string2);
                object5 = (X509Certificate)object5;
                Object object6 = ((X509Certificate)object4).getIssuerDN();
                Principal principal = ((X509Certificate)object5).getSubjectDN();
                boolean bl3 = Intrinsics.areEqual(object6, principal);
                if (!bl3) continue;
                try {
                    object6 = ((Certificate)object5).getPublicKey();
                }
                catch (GeneralSecurityException generalSecurityException) {
                    continue;
                }
                ((Certificate)object4).verify((PublicKey)object6);
                iterator.remove();
                ((ArrayList)object).add(object5);
                continue block6;
            }
            if (n4 != 0) {
                return object;
            }
            object = new StringBuilder("Failed to find a trusted cert that signed ");
            ((StringBuilder)object).append(object4);
            object = ((StringBuilder)object).toString();
            serializable = new SSLPeerUnverifiedException((String)object);
            throw serializable;
        }
        object2 = new StringBuilder("Certificate chain too long: ");
        ((StringBuilder)object2).append(object);
        object = ((StringBuilder)object2).toString();
        serializable = new SSLPeerUnverifiedException((String)object);
        throw serializable;
    }

    public final boolean equals(Object object) {
        bs3_0 bs3_02;
        boolean bl2;
        boolean bl3;
        boolean bl4 = true;
        if (!(object == this || (bl3 = object instanceof tw_2) && (bl2 = Intrinsics.areEqual(object = ((tw_2)object).a, bs3_02 = this.a)))) {
            bl4 = false;
        }
        return bl4;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

