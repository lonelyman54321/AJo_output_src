/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from K21
 */
public final class k21_0 {
    public final wn3_0 a;
    public final iu_1 b;
    public final List c;
    public final hh3_2 d;

    public k21_0(wn3_0 object, iu_1 iu_12, List list, Function0 function0) {
        Intrinsics.checkNotNullParameter(object, "tlsVersion");
        Intrinsics.checkNotNullParameter(iu_12, "cipherSuite");
        Intrinsics.checkNotNullParameter(list, "localCertificates");
        Intrinsics.checkNotNullParameter(function0, "peerCertificatesFn");
        this.a = object;
        this.b = iu_12;
        this.c = list;
        super(function0);
        object = yr1_2.b((Function0)object);
        this.d = object;
    }

    public final List a() {
        return (List)this.d.getValue();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        List list;
        boolean bl2 = object instanceof k21_0;
        if (!bl2) return false;
        object = (k21_0)object;
        wn3_0 wn3_02 = ((k21_0)object).a;
        wn3_0 wn3_03 = this.a;
        if (wn3_02 != wn3_03) return false;
        iu_1 iu_12 = ((k21_0)object).b;
        iu_1 iu_13 = this.b;
        bl2 = Intrinsics.areEqual(iu_12, iu_13);
        if (!bl2) return false;
        List list2 = ((k21_0)object).a();
        bl2 = Intrinsics.areEqual(list2, list = this.a());
        if (!bl2) return false;
        object = ((k21_0)object).c;
        List list3 = this.c;
        boolean bl3 = Intrinsics.areEqual(object, list3);
        if (!bl3) return false;
        return true;
    }

    public final int hashCode() {
        int n3 = (((Object)((Object)this.a)).hashCode() + 527) * 31;
        int n4 = (this.b.hashCode() + n3) * 31;
        n3 = (((Object)this.a()).hashCode() + n4) * 31;
        return ((Object)this.c).hashCode() + n3;
    }

    public final String toString() {
        boolean bl2;
        Object object;
        String string2;
        Iterator iterator = this.a();
        int n3 = 10;
        int n4 = yx_2.o((Iterable)((Object)iterator), n3);
        Serializable serializable = new ArrayList(n4);
        iterator = iterator.iterator();
        while (true) {
            n4 = (int)(iterator.hasNext() ? 1 : 0);
            string2 = "type";
            if (n4 == 0) break;
            object = (Certificate)iterator.next();
            bl2 = object instanceof X509Certificate;
            if (bl2) {
                object = ((Object)((X509Certificate)object).getSubjectDN()).toString();
            } else {
                object = ((Certificate)object).getType();
                Intrinsics.checkNotNullExpressionValue(object, string2);
            }
            ((ArrayList)serializable).add(object);
        }
        iterator = serializable.toString();
        serializable = new StringBuilder("Handshake{tlsVersion=");
        object = this.a;
        ((StringBuilder)serializable).append(object);
        ((StringBuilder)serializable).append(" cipherSuite=");
        object = this.b;
        ((StringBuilder)serializable).append(object);
        ((StringBuilder)serializable).append(" peerCertificates=");
        ((StringBuilder)serializable).append((String)((Object)iterator));
        ((StringBuilder)serializable).append(" localCertificates=");
        iterator = this.c;
        n3 = yx_2.o((Iterable)((Object)iterator), n3);
        object = new ArrayList(n3);
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Object object2 = (Certificate)iterator.next();
            bl2 = object2 instanceof X509Certificate;
            if (bl2) {
                object2 = ((Object)((X509Certificate)object2).getSubjectDN()).toString();
            } else {
                object2 = ((Certificate)object2).getType();
                Intrinsics.checkNotNullExpressionValue(object2, string2);
            }
            ((ArrayList)object).add(object2);
        }
        ((StringBuilder)serializable).append(object);
        ((StringBuilder)serializable).append('}');
        return ((StringBuilder)serializable).toString();
    }
}

