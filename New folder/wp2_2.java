/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WP2
 */
public final class wp2_2 {
    public final h4_0 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public wp2_2(h4_0 h4_02, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Intrinsics.checkNotNullParameter(h4_02, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "socketAddress");
        this.a = h4_02;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof wp2_2;
        if (!bl2) return false;
        object = (wp2_2)object;
        Object object2 = ((wp2_2)object).a;
        Object object3 = this.a;
        bl2 = Intrinsics.areEqual(object2, object3);
        if (!bl2) return false;
        object2 = ((wp2_2)object).b;
        object3 = this.b;
        bl2 = Intrinsics.areEqual(object2, object3);
        if (!bl2) return false;
        object = ((wp2_2)object).c;
        object2 = this.c;
        boolean bl3 = Intrinsics.areEqual(object, object2);
        if (!bl3) return false;
        return true;
    }

    public final int hashCode() {
        int n3 = (this.a.hashCode() + 527) * 31;
        int n4 = (this.b.hashCode() + n3) * 31;
        return this.c.hashCode() + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Route{");
        InetSocketAddress inetSocketAddress = this.c;
        stringBuilder.append(inetSocketAddress);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

