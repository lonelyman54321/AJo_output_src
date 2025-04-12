/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;

/*
 * Renamed from Ar2
 */
public final class ar2_0
implements View.OnClickListener {
    public final void onClick(View object) {
        object = AnalyticsManager.Companion;
        GTMEvents gTMEvents = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        ak0_0.a((AnalyticsManager$Companion)object, gTMEvents, "CVV_entered", "CVV entered");
    }
}

