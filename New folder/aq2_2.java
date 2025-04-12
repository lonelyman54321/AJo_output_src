/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/*
 * Renamed from aQ2
 */
public final class aq2_2 {
    public final h4_0 a;
    public final yp2_2 b;
    public final ij_2 c;
    public final ib0_2 d;
    public final List e;
    public int f;
    public List g;
    public final ArrayList h;

    public aq2_2(h4_0 object, yp2_2 object2, ij_2 ij_22, ib0_2 object3) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "address");
        Intrinsics.checkNotNullParameter(object2, "routeDatabase");
        String string2 = "call";
        Intrinsics.checkNotNullParameter(ij_22, string2);
        Intrinsics.checkNotNullParameter(object3, "eventListener");
        this.a = object;
        this.b = object2;
        this.c = ij_22;
        this.d = object3;
        this.e = object2 = mz0_2.a;
        this.g = object2;
        object2 = new ArrayList();
        this.h = object2;
        object2 = object.i;
        object3.getClass();
        Intrinsics.checkNotNullParameter(ij_22, string2);
        object3 = "url";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Object object4 = object.g;
        if (object4 != null) {
            object = kotlin.collections.a.b(object4);
        } else {
            object4 = ((ob1_1)object2).j();
            String string3 = ((URI)object4).getHost();
            if (string3 == null) {
                Proxy proxy;
                object = new Proxy[n3];
                object[0] = proxy = Proxy.NO_PROXY;
                object = ez3.l(object);
            } else {
                boolean bl2;
                object = object.h.select((URI)object4);
                object4 = object;
                object4 = (Collection)object;
                if (object4 != null && !(bl2 = object4.isEmpty())) {
                    String string4 = "proxiesOrNull";
                    Intrinsics.checkNotNullExpressionValue(object, string4);
                    object = ez3.x((List)object);
                } else {
                    Proxy proxy;
                    object = new Proxy[n3];
                    object[0] = proxy = Proxy.NO_PROXY;
                    object = ez3.l(object);
                }
            }
        }
        this.e = object;
        this.f = 0;
        Intrinsics.checkNotNullParameter(ij_22, string2);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object, "proxies");
    }

    public final boolean a() {
        ArrayList arrayList;
        int n3 = this.f;
        List list = this.e;
        int n4 = list.size();
        boolean bl2 = false;
        int n7 = 1;
        if (n3 < n4) {
            n3 = 1;
        } else {
            n3 = 0;
            arrayList = null;
        }
        if (n3 != 0 || (n3 = (arrayList = this.h).isEmpty() ^ n7) != 0) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final aq2$a_0 b() {
        Object object;
        int n3;
        int n4;
        int n7 = 1;
        boolean bl2 = this.a();
        if (!bl2) {
            NoSuchElementException noSuchElementException = new NoSuchElementException();
            throw noSuchElementException;
        }
        Object object2 = new ArrayList();
        while ((n4 = this.f) < (n3 = (object = this.e).size())) {
            boolean bl3;
            int n8;
            Object object3;
            Object object4;
            int n10;
            Object object5;
            n4 = this.f;
            object = this.e;
            n3 = object.size();
            if (n4 < n3) {
                n4 = 1;
            } else {
                n4 = 0;
                object5 = null;
            }
            object = this.a;
            Object object6 = "No route to ";
            if (n4 == 0) {
                object2 = new StringBuilder((String)object6);
                object5 = ((h4_0)object).i.d;
                ((StringBuilder)object2).append((String)object5);
                ((StringBuilder)object2).append("; exhausted proxy configurations: ");
                object5 = this.e;
                ((StringBuilder)object2).append(object5);
                object2 = ((StringBuilder)object2).toString();
                SocketException socketException = new SocketException((String)object2);
                throw socketException;
            }
            object5 = this.e;
            int n14 = this.f;
            this.f = n10 = n14 + 1;
            object5 = (Proxy)object5.get(n14);
            Object object7 = new ArrayList();
            this.g = object7;
            Object object8 = ((Proxy)object5).type();
            if (object8 != (object4 = Proxy.Type.DIRECT) && (object8 = ((Proxy)object5).type()) != (object4 = Proxy.Type.SOCKS)) {
                object8 = ((Proxy)object5).address();
                boolean bl4 = object8 instanceof InetSocketAddress;
                if (!bl4) {
                    CharSequence charSequence = new StringBuilder("Proxy.address() is not an InetSocketAddress: ");
                    object2 = ((Object)object8).getClass();
                    ((StringBuilder)charSequence).append(object2);
                    charSequence = ((StringBuilder)charSequence).toString();
                    charSequence = ((Object)charSequence).toString();
                    object2 = new IllegalArgumentException((String)charSequence);
                    throw object2;
                }
                Intrinsics.checkNotNullExpressionValue(object8, "proxyAddress");
                object8 = (InetSocketAddress)object8;
                Intrinsics.checkNotNullParameter(object8, "<this>");
                object4 = ((InetSocketAddress)object8).getAddress();
                if (object4 == null) {
                    object4 = ((InetSocketAddress)object8).getHostName();
                    object3 = "hostName";
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                } else {
                    object4 = ((InetAddress)object4).getHostAddress();
                    object3 = "address.hostAddress";
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                }
                n10 = ((InetSocketAddress)object8).getPort();
            } else {
                object8 = ((h4_0)object).i;
                object4 = ((ob1_1)object8).d;
                n10 = ((ob1_1)object8).e;
            }
            if (n7 <= n10 && n10 < (n8 = 65536)) {
                object6 = ((Proxy)object5).type();
                if (object6 == (object3 = Proxy.Type.SOCKS)) {
                    object = InetSocketAddress.createUnresolved((String)object4, n10);
                    ((ArrayList)object7).add(object);
                } else {
                    object6 = ez3.a;
                    Intrinsics.checkNotNullParameter(object4, "<this>");
                    object6 = ez3.f;
                    bl3 = ((Regex)object6).c((CharSequence)object4);
                    if (bl3) {
                        object = kotlin.collections.a.b(InetAddress.getByName((String)object4));
                    } else {
                        this.d.getClass();
                        object6 = this.c;
                        object3 = "call";
                        Intrinsics.checkNotNullParameter(object6, (String)object3);
                        String string2 = "domainName";
                        Intrinsics.checkNotNullParameter(object4, string2);
                        List list = ((h4_0)object).a.lookup((String)object4);
                        boolean bl5 = list.isEmpty();
                        if (bl5) {
                            object2 = new StringBuilder();
                            object5 = ((h4_0)object).a;
                            ((StringBuilder)object2).append(object5);
                            ((StringBuilder)object2).append(" returned no addresses for ");
                            ((StringBuilder)object2).append((String)object4);
                            object2 = ((StringBuilder)object2).toString();
                            UnknownHostException unknownHostException = new UnknownHostException((String)object2);
                            throw unknownHostException;
                        }
                        Intrinsics.checkNotNullParameter(object6, (String)object3);
                        Intrinsics.checkNotNullParameter(object4, string2);
                        Intrinsics.checkNotNullParameter(list, "inetAddressList");
                        object = list;
                    }
                    object = object.iterator();
                    while (bl3 = object.hasNext()) {
                        object6 = (InetAddress)object.next();
                        object4 = new InetSocketAddress((InetAddress)object6, n10);
                        ((ArrayList)object7).add(object4);
                    }
                }
                object = this.g.iterator();
            } else {
                object2 = new StringBuilder((String)object6);
                ((StringBuilder)object2).append((String)object4);
                ((StringBuilder)object2).append(':');
                ((StringBuilder)object2).append(n10);
                ((StringBuilder)object2).append("; port is out of range");
                object2 = ((StringBuilder)object2).toString();
                SocketException socketException = new SocketException((String)object2);
                throw socketException;
            }
            while (bl3 = object.hasNext()) {
                object6 = (InetSocketAddress)object.next();
                object8 = this.a;
                object7 = new wp2_2((h4_0)object8, (Proxy)object5, (InetSocketAddress)object6);
                object6 = this.b;
                // MONITORENTER : object6
                object8 = "route";
                Intrinsics.checkNotNullParameter(object7, (String)object8);
                object8 = ((yp2_2)object6).a;
                n10 = (int)(object8.contains(object7) ? 1 : 0);
                // MONITOREXIT : object6
                if (n10 != 0) {
                    object6 = this.h;
                    ((ArrayList)object6).add(object7);
                    continue;
                }
                ((ArrayList)object2).add(object7);
            }
            n4 = ((ArrayList)object2).isEmpty() ^ n7;
            if (n4 == 0) continue;
        }
        if ((n7 = ((ArrayList)object2).isEmpty()) == 0) return new aq2$a_0((ArrayList)object2);
        cx_2.r(this.h, object2);
        ArrayList arrayList = this.h;
        arrayList.clear();
        return new aq2$a_0((ArrayList)object2);
    }
}

