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
 * Renamed from oV1
 */
public final class ov1_0 {
    public static /* bridge */ /* synthetic */ void a(TelephonyManager telephonyManager, Executor executor, rv1_0 rv1_02) {
        telephonyManager.registerTelephonyCallback(executor, (TelephonyCallback)rv1_02);
    }
}

