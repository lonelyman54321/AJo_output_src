/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Cart.ConvenienceFee;
import kotlin.jvm.internal.Intrinsics;

public final class hP
implements View.OnClickListener {
    public final /* synthetic */ iP a;
    public final /* synthetic */ ConvenienceFee b;

    public /* synthetic */ hP(iP iP2, ConvenienceFee convenienceFee) {
        this.a = iP2;
        this.b = convenienceFee;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ConvenienceFee convenienceFee = this.b;
        Intrinsics.checkNotNullParameter(convenienceFee, "$convenienceFee");
        GTMEvents.pushCartInteractionsEvent$default(AnalyticsManager.Companion.getInstance().getGtmEvents(), "Whats this click", "", "whats_this_click", "bag screen", "bag interactions", null, 32, null);
        object.a.q0(convenienceFee);
    }
}

