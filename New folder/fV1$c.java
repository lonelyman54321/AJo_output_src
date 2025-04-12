/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.Network
 *  android.net.NetworkCapabilities
 */
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;

public final class fV1$c
extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ i a;
    public final /* synthetic */ pz2_2 b;

    public fV1$c(mb3_2 mb3_22, pz2_2 pz2_22) {
        this.a = mb3_22;
        this.b = pz2_22;
    }

    public final void onCapabilitiesChanged(Network object, NetworkCapabilities object2) {
        Intrinsics.checkNotNullParameter(object, "network");
        Intrinsics.checkNotNullParameter(object2, "networkCapabilities");
        this.a.d(null);
        object = qx1.a();
        object.getClass();
        object = this.b;
        object2 = k60$a.a;
        object.j(object2);
    }

    public final void onLost(Network object) {
        Intrinsics.checkNotNullParameter(object, "network");
        this.a.d(null);
        object = qx1.a();
        object.getClass();
        object = new k60$b(7);
        this.b.j(object);
    }
}

