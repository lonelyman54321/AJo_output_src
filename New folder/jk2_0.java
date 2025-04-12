/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 *  android.net.Network
 */
import android.net.ConnectivityManager;
import android.net.Network;

/*
 * Renamed from jK2
 */
public final class jk2_0 {
    public static /* bridge */ /* synthetic */ Network a(ConnectivityManager connectivityManager) {
        return connectivityManager.getActiveNetwork();
    }
}

