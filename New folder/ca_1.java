/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.jsse.BCSSLParameters
 *  org.bouncycastle.jsse.BCSSLSocket
 */
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/*
 * Renamed from CA
 */
public final class ca_1
implements y83_0 {
    public static final CA$a a;

    static {
        CA$a cA$a;
        a = cA$a = new Object();
    }

    public final boolean a(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        return false;
    }

    public final String b(SSLSocket object) {
        boolean bl2;
        String string2 = "sslSocket";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((BCSSLSocket)object).getApplicationProtocol();
        if (object == null) {
            bl2 = true;
        } else {
            string2 = "";
            bl2 = Intrinsics.areEqual(object, string2);
        }
        if (bl2) {
            object = null;
        }
        return object;
    }

    public final void c(SSLSocket sSLSocket, String string2, List stringArray) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        string2 = "protocols";
        Intrinsics.checkNotNullParameter(stringArray, string2);
        boolean bl2 = this.a(sSLSocket);
        if (bl2) {
            sSLSocket = (BCSSLSocket)sSLSocket;
            string2 = sSLSocket.getParameters();
            String[] stringArray2 = zs2_2.a;
            stringArray = Zs2$a.a((List)stringArray);
            stringArray2 = new String[]{};
            stringArray = stringArray.toArray(stringArray2);
            string2.setApplicationProtocols(stringArray);
            sSLSocket.setParameters((BCSSLParameters)string2);
        }
    }

    public final boolean isSupported() {
        return ba_1.d;
    }
}

