/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
import android.os.CountDownTimer;
import com.ril.ajio.analytics.events.AppsFlyerEvents;

/*
 * Renamed from Do
 */
public final class do_1
extends CountDownTimer {
    public final /* synthetic */ eo_2 a;

    public do_1(eo_2 eo_22, long l2) {
        this.a = eo_22;
        super(l2, 1000L);
    }

    public final void onFinish() {
        this.a.b = 0L;
        AppsFlyerEvents.INSTANCE.pushUserSessionEvent();
    }

    public final void onTick(long l2) {
        this.a.b = l2;
    }
}

