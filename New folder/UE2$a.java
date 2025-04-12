/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.Network
 */
import android.net.ConnectivityManager;
import android.net.Network;

public final class UE2$a
extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ UE2 a;

    public UE2$a(UE2 uE2) {
        this.a = uE2;
    }

    public final void onAvailable(Network network) {
        UE2.b(this.a, network, true);
    }

    public final void onLost(Network network) {
        UE2.b(this.a, network, false);
    }
}

