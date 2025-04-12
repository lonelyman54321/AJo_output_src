/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xn0
 */
public final class xn0_2
implements y83_0 {
    public final Xn0$a a;
    public y83_0 b;

    public xn0_2(Xn0$a xn0$a) {
        Intrinsics.checkNotNullParameter(xn0$a, "socketAdapterFactory");
        this.a = xn0$a;
    }

    public final boolean a(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        return this.a.a(sSLSocket);
    }

    public final String b(SSLSocket object) {
        Intrinsics.checkNotNullParameter(object, "sslSocket");
        y83_0 y83_02 = this.d((SSLSocket)object);
        object = y83_02 != null ? y83_02.b((SSLSocket)object) : null;
        return object;
    }

    public final void c(SSLSocket sSLSocket, String string2, List list) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(list, "protocols");
        y83_0 y83_02 = this.d(sSLSocket);
        if (y83_02 != null) {
            y83_02.c(sSLSocket, string2, list);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final y83_0 d(SSLSocket object) {
        synchronized (this) {
            try {
                Object object2 = this.b;
                if (object2 != null) return this.b;
                object2 = this.a;
                boolean bl2 = object2.a((SSLSocket)object);
                if (!bl2) return this.b;
                object2 = this.a;
                this.b = object = object2.b((SSLSocket)object);
                return this.b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final boolean isSupported() {
        return true;
    }
}

