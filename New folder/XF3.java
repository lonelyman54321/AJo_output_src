/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.wifi.WifiManager
 *  android.net.wifi.WifiManager$WifiLock
 */
import android.content.Context;
import android.net.wifi.WifiManager;

public final class XF3 {
    public final Context a;
    public WifiManager.WifiLock b;
    public boolean c;
    public boolean d;

    public XF3(Context context) {
        this.a = context = context.getApplicationContext();
    }

    public final void a(boolean bl2) {
        WifiManager.WifiLock wifiLock;
        if (bl2 && (wifiLock = this.b) == null) {
            wifiLock = this.a.getApplicationContext();
            String string2 = "wifi";
            if ((wifiLock = (WifiManager)wifiLock.getSystemService(string2)) == null) {
                Cx.f("WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            String string3 = "ExoPlayer:WifiLockManager";
            this.b = wifiLock = wifiLock.createWifiLock(3, string3);
            string2 = null;
            wifiLock.setReferenceCounted(false);
        }
        this.c = bl2;
        wifiLock = this.b;
        if (wifiLock != null) {
            if (bl2 && (bl2 = this.d)) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }
}

