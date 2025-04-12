/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 *  android.net.ConnectivityManager$NetworkCallback
 */
import android.net.ConnectivityManager;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$d$a;

public final class v63 {
    public static /* bridge */ /* synthetic */ void a(ConnectivityManager connectivityManager, SingletonConnectivityReceiver$d$a singletonConnectivityReceiver$d$a) {
        connectivityManager.registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback)singletonConnectivityReceiver$d$a);
    }
}

