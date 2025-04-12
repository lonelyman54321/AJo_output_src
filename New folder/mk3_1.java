/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.telephony.TelephonyCallback
 *  android.telephony.TelephonyManager
 */
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;

/*
 * Renamed from MK3
 */
public final class mk3_1 {
    public static /* bridge */ /* synthetic */ void a(TelephonyManager telephonyManager, TelephonyCallback telephonyCallback) {
        telephonyManager.unregisterTelephonyCallback(telephonyCallback);
    }
}

