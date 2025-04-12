/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.conscrypt.Conscrypt
 */
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

public final class l50$a
implements Xn0$a {
    public final boolean a(SSLSocket sSLSocket) {
        boolean bl2;
        String string2 = "sslSocket";
        Intrinsics.checkNotNullParameter(sSLSocket, string2);
        boolean bl3 = k50_0.d;
        bl3 = k50$a_0.b();
        if (bl3 && (bl2 = Conscrypt.isConscrypt((SSLSocket)sSLSocket))) {
            bl2 = true;
        } else {
            bl2 = false;
            sSLSocket = null;
        }
        return bl2;
    }

    public final y83_0 b(SSLSocket object) {
        Intrinsics.checkNotNullParameter(object, "sslSocket");
        object = new Object();
        return object;
    }
}

