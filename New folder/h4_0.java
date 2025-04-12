/*
 * Decompiled with CFR 0.152.
 */
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from H4
 */
public final class h4_0 {
    public final tr0_2 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final mr_2 e;
    public final ur_2 f;
    public final Proxy g;
    public final ProxySelector h;
    public final ob1_1 i;
    public final List j;
    public final List k;

    public h4_0(String object, int n3, tr0_2 object2, SocketFactory object3, SSLSocketFactory object4, HostnameVerifier object5, mr_2 object6, ur_2 ur_22, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        block7: {
            block6: {
                block5: {
                    Intrinsics.checkNotNullParameter(object, "uriHost");
                    Intrinsics.checkNotNullParameter(object2, "dns");
                    Intrinsics.checkNotNullParameter(object3, "socketFactory");
                    Intrinsics.checkNotNullParameter(ur_22, "proxyAuthenticator");
                    Intrinsics.checkNotNullParameter(list, "protocols");
                    Intrinsics.checkNotNullParameter(list2, "connectionSpecs");
                    String string2 = "proxySelector";
                    Intrinsics.checkNotNullParameter(proxySelector, string2);
                    this.a = object2;
                    this.b = object3;
                    this.c = object4;
                    this.d = object5;
                    this.e = object6;
                    this.f = ur_22;
                    this.g = proxy;
                    this.h = proxySelector;
                    object2 = new Ob1$a();
                    object3 = "http";
                    object5 = "https";
                    object4 = object4 != null ? object5 : object3;
                    object6 = "scheme";
                    Intrinsics.checkNotNullParameter(object4, (String)object6);
                    boolean bl2 = ((String)object4).equalsIgnoreCase((String)object3);
                    if (!bl2) break block5;
                    ((Ob1$a)object2).a = object3;
                    break block6;
                }
                boolean n4 = ((String)object4).equalsIgnoreCase((String)object5);
                if (!n4) break block7;
                ((Ob1$a)object2).a = object5;
            }
            Intrinsics.checkNotNullParameter(object, "host");
            int n4 = 7;
            object4 = null;
            object3 = w91_0.b(Ob1$b.c((String)object, 0, 0, false, n4));
            if (object3 != null) {
                ((Ob1$a)object2).d = object3;
                int n7 = 1;
                if (n7 <= n3 && n3 < (n7 = 65536)) {
                    ((Ob1$a)object2).e = n3;
                    this.i = object = ((Ob1$a)object2).b();
                    this.j = object = ez3.x(list);
                    this.k = object = ez3.x(list2);
                    return;
                }
                object = hj0_0.a(n3, "unexpected port: ");
                object = object.toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
            object = "unexpected host: ".concat((String)object);
            IllegalArgumentException string3 = new IllegalArgumentException((String)object);
            throw string3;
        }
        String string2 = "unexpected scheme: ".concat((String)object4);
        object = new IllegalArgumentException(string2);
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(h4_0 object) {
        Intrinsics.checkNotNullParameter(object, "that");
        Object object2 = ((h4_0)object).a;
        Object object3 = this.a;
        int n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) return 0 != 0;
        object2 = this.f;
        object3 = ((h4_0)object).f;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) return 0 != 0;
        object2 = this.j;
        object3 = ((h4_0)object).j;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) return 0 != 0;
        object2 = this.k;
        object3 = ((h4_0)object).k;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) return 0 != 0;
        object2 = this.h;
        object3 = ((h4_0)object).h;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) return 0 != 0;
        object2 = this.g;
        object3 = ((h4_0)object).g;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) return 0 != 0;
        object2 = this.c;
        object3 = ((h4_0)object).c;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) return 0 != 0;
        object2 = this.d;
        object3 = ((h4_0)object).d;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) return 0 != 0;
        object2 = this.e;
        object3 = ((h4_0)object).e;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) return 0 != 0;
        object2 = this.i;
        n3 = ((ob1_1)object2).e;
        object = ((h4_0)object).i;
        int n4 = ((ob1_1)object).e;
        if (n3 != n4) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof h4_0;
        if (!bl2) return false;
        object = (h4_0)object;
        ob1_1 ob1_12 = this.i;
        ob1_1 ob1_13 = ((h4_0)object).i;
        bl2 = Intrinsics.areEqual(ob1_12, ob1_13);
        if (!bl2) return false;
        boolean bl3 = this.a((h4_0)object);
        if (!bl3) return false;
        return true;
    }

    public final int hashCode() {
        String string2 = this.i.i;
        int n3 = 31;
        int n4 = zy_2.b(527, n3, string2);
        int n7 = (this.a.hashCode() + n4) * 31;
        n4 = (this.f.hashCode() + n7) * 31;
        List list = this.j;
        n4 = ne_0.a(n4, n3, list);
        list = this.k;
        n4 = ne_0.a(n4, n3, list);
        n7 = (this.h.hashCode() + n4) * 31;
        n4 = (Objects.hashCode(this.g) + n7) * 31;
        n7 = (Objects.hashCode(this.c) + n4) * 31;
        n4 = (Objects.hashCode(this.d) + n7) * 31;
        return Objects.hashCode(this.e) + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Address{");
        Object object = this.i;
        Object object2 = ((ob1_1)object).d;
        stringBuilder.append((String)object2);
        char c2 = ':';
        stringBuilder.append(c2);
        int n3 = ((ob1_1)object).e;
        stringBuilder.append(n3);
        stringBuilder.append(", ");
        object = this.g;
        if (object != null) {
            String string2 = "proxy=";
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append(object);
            object = ((StringBuilder)object2).toString();
        } else {
            object = new StringBuilder("proxySelector=");
            object2 = this.h;
            ((StringBuilder)object).append(object2);
            object = ((StringBuilder)object).toString();
        }
        return ui0_1.a(stringBuilder, (String)object, '}');
    }
}

