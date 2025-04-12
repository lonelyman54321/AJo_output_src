/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 */
import android.content.Context;
import android.os.PowerManager;

public final class PE3 {
    public final Context a;
    public PowerManager.WakeLock b;
    public boolean c;
    public boolean d;

    public PE3(Context context) {
        this.a = context = context.getApplicationContext();
    }

    public final void a(boolean bl2) {
        PowerManager.WakeLock wakeLock;
        if (bl2 && (wakeLock = this.b) == null) {
            wakeLock = this.a;
            String string2 = "power";
            if ((wakeLock = (PowerManager)wakeLock.getSystemService(string2)) == null) {
                Cx.f("PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            String string3 = "ExoPlayer:WakeLockManager";
            this.b = wakeLock = wakeLock.newWakeLock(1, string3);
            string2 = null;
            wakeLock.setReferenceCounted(false);
        }
        this.c = bl2;
        wakeLock = this.b;
        if (wakeLock != null) {
            if (bl2 && (bl2 = this.d)) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }
}

