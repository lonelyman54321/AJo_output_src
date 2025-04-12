/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.Network
 *  android.net.NetworkCapabilities
 *  android.os.Build$VERSION
 */
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

public final class iV1$a
extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ iv1_1 a;

    public iV1$a(iv1_1 iv1_12) {
        this.a = iv1_12;
    }

    public final void onCapabilitiesChanged(Network object, NetworkCapabilities networkCapabilities) {
        hv1_0 hv1_02;
        String string2 = "network";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(networkCapabilities, "capabilities");
        object = qx1.a();
        int bl2 = jV1.a;
        Objects.toString(networkCapabilities);
        object.getClass();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        iv1_1 iv1_12 = this.a;
        if (n3 >= n4) {
            object = "<this>";
            Intrinsics.checkNotNullParameter(networkCapabilities, (String)object);
            boolean bl3 = networkCapabilities.hasCapability(12);
            boolean bl4 = networkCapabilities.hasCapability(16);
            boolean bl5 = networkCapabilities.hasCapability(11) ^ true;
            int n7 = 18;
            boolean bl6 = networkCapabilities.hasCapability(n7);
            hv1_02 = new hv1_0(bl3, bl4, bl5, bl6);
        } else {
            object = iv1_12.f;
            hv1_02 = jV1.a((ConnectivityManager)object);
        }
        iv1_12.b(hv1_02);
    }

    public final void onLost(Network object) {
        Intrinsics.checkNotNullParameter(object, "network");
        object = qx1.a();
        object.getClass();
        object = this.a;
        hv1_0 hv1_02 = jV1.a(((iv1_1)object).f);
        ((N50)object).b(hv1_02);
    }
}

