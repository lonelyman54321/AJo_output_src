/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.telephony.TelephonyCallback
 *  android.telephony.TelephonyCallback$DisplayInfoListener
 *  android.telephony.TelephonyDisplayInfo
 */
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/*
 * Renamed from rV1
 */
public final class rv1_0
extends TelephonyCallback
implements TelephonyCallback.DisplayInfoListener {
    public final sV1 a;

    public rv1_0(sV1 sV12) {
        this.a = sV12;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int n3 = qv1_0.a(telephonyDisplayInfo);
        int n4 = 3;
        int n7 = 5;
        if (n3 != n4 && n3 != (n4 = 4) && n3 != n7) {
            n3 = 0;
            telephonyDisplayInfo = null;
        } else {
            n3 = 1;
        }
        sV1 sV12 = this.a;
        if (n3 != 0) {
            n7 = 10;
        }
        sV1.a(sV12, n7);
    }
}

