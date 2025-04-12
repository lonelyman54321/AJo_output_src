/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 *  android.net.ConnectivityManager$NetworkCallback
 */
import android.net.ConnectivityManager;

public final class MU1 {
    public static /* bridge */ /* synthetic */ void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}

