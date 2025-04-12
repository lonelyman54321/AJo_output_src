/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 */
import android.content.DialogInterface;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.payment.fragment.f;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ca2
 */
public final class ca2_0
implements DialogInterface.OnDismissListener {
    public final /* synthetic */ f a;
    public final /* synthetic */ long b;

    public /* synthetic */ ca2_0(f f5, long l2) {
        this.a = f5;
        this.b = l2;
    }

    public final void onDismiss(DialogInterface object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object.getClass();
        tj2_0.e(AnalyticsManager.Companion, "AppRating_popup", "RemindmeLater", "order confirmation screen");
        long l2 = this.b + 1L;
        object = ((ew_2)object).a;
        ((sw_0)object).putPreference("CLICK_RATING_LATER_COUNT", l2);
        ((sw_0)object).putPreference("SHOW_RATING_ON_LP", true);
    }
}

