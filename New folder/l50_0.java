/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.conscrypt.Conscrypt
 */
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

/*
 * Renamed from l50
 */
public final class l50_0
implements y83_0 {
    public static final l50$a a;

    static {
        l50$a l50$a;
        a = l50$a = new Object();
    }

    public final boolean a(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt((SSLSocket)sSLSocket);
    }

    public final String b(SSLSocket object) {
        String string2 = "sslSocket";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = this.a((SSLSocket)object);
        object = bl2 ? Conscrypt.getApplicationProtocol((SSLSocket)object) : null;
        return object;
    }

    public final void c(SSLSocket sSLSocket, String stringArray, List stringArray2) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        stringArray = "protocols";
        Intrinsics.checkNotNullParameter(stringArray2, (String)stringArray);
        boolean bl2 = this.a(sSLSocket);
        if (bl2) {
            bl2 = true;
            Conscrypt.setUseSessionTickets((SSLSocket)sSLSocket, (boolean)bl2);
            stringArray = zs2_2.a;
            stringArray = Zs2$a.a((List)stringArray2);
            stringArray2 = new String[]{};
            stringArray = stringArray.toArray(stringArray2);
            Conscrypt.setApplicationProtocols((SSLSocket)sSLSocket, (String[])stringArray);
        }
    }

    public final boolean isSupported() {
        return k50_0.d;
    }
}

