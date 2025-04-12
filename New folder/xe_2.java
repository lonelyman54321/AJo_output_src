/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xe
 */
public final class xe_2
implements y83_0 {
    public final boolean a(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        return we_1.a(sSLSocket);
    }

    public final String b(SSLSocket object) {
        boolean bl2;
        String string2 = "sslSocket";
        Intrinsics.checkNotNullParameter(object, string2);
        object = vk1_2.a((SSLSocket)object);
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

    public final void c(SSLSocket sSLSocket, String object, List object2) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        object = "protocols";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        try {
            ve_0.a(sSLSocket);
            object = sSLSocket.getSSLParameters();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            object = new IOException("Android internal error", illegalArgumentException);
            throw object;
        }
        String[] stringArray = zs2_2.a;
        object2 = Zs2$a.a((List)object2);
        stringArray = null;
        stringArray = new String[]{};
        object2 = ((ArrayList)object2).toArray(stringArray);
        object2 = (String[])object2;
        ll0.b((SSLParameters)object, (String[])object2);
        sSLSocket.setSSLParameters((SSLParameters)object);
    }

    public final boolean isSupported() {
        int n3;
        int n4 = Zs2$a.c();
        n4 = n4 != 0 && (n4 = Build.VERSION.SDK_INT) >= (n3 = 29) ? 1 : 0;
        return n4 != 0;
    }
}

