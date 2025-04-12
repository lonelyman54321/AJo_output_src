/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.Network
 *  android.net.NetworkRequest
 *  android.net.NetworkRequest$Builder
 */
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

public final class UE2
implements WU1 {
    public final ConnectivityManager a;
    public final WU1$a b;
    public final UE2$a c;

    public UE2(ConnectivityManager connectivityManager, WU1$a object) {
        this.a = connectivityManager;
        this.b = object;
        super(this);
        this.c = object;
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder = builder.addCapability(12).build();
        connectivityManager.registerNetworkCallback((NetworkRequest)builder, (ConnectivityManager.NetworkCallback)object);
    }

    public static final void b(UE2 uE2, Network network, boolean bl2) {
        Network[] networkArray = uE2.a.getAllNetworks();
        int n3 = networkArray.length;
        boolean bl3 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl4;
            Network network2 = networkArray[i3];
            int n4 = Intrinsics.areEqual(network2, network);
            if (n4 != 0) {
                bl4 = bl2;
            } else {
                ConnectivityManager connectivityManager = uE2.a;
                if ((network2 = connectivityManager.getNetworkCapabilities(network2)) != null && (bl4 = network2.hasCapability(n4 = 12))) {
                    bl4 = true;
                } else {
                    bl4 = false;
                    network2 = null;
                }
            }
            if (!bl4) continue;
            bl3 = true;
            break;
        }
        uE2.b.a(bl3);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = this.a;
        Network[] networkArray = connectivityManager.getAllNetworks();
        int n3 = networkArray.length;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            boolean bl3;
            Network network = networkArray[i3];
            if ((network = connectivityManager.getNetworkCapabilities(network)) == null || !(bl3 = network.hasCapability(n4 = 12))) continue;
            bl2 = true;
            break;
        }
        return bl2;
    }

    public final void shutdown() {
        ConnectivityManager connectivityManager = this.a;
        UE2$a uE2$a = this.c;
        connectivityManager.unregisterNetworkCallback((ConnectivityManager.NetworkCallback)uE2$a);
    }
}

