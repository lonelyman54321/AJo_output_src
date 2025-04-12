/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.a;

/*
 * Renamed from J52
 */
public final class j52_0
extends ProxySelector {
    public static final j52_0 a;

    static {
        j52_0 j52_02;
        a = j52_02 = new ProxySelector();
    }

    public final void connectFailed(URI uRI, SocketAddress socketAddress, IOException iOException) {
    }

    public final List select(URI serializable) {
        if (serializable != null) {
            return kotlin.collections.a.b(Proxy.NO_PROXY);
        }
        String string2 = "uri must not be null".toString();
        serializable = new IllegalArgumentException(string2);
        throw serializable;
    }
}

