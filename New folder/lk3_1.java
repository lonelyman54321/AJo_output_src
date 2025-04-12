/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.telephony.TelephonyCallback
 *  android.telephony.TelephonyManager
 */
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/*
 * Renamed from LK3
 */
public final class lk3_1 {
    public static /* bridge */ /* synthetic */ void a(TelephonyManager telephonyManager, Executor executor, TelephonyCallback telephonyCallback) {
        telephonyManager.registerTelephonyCallback(executor, telephonyCallback);
    }
}

