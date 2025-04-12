/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from N63
 */
public final class n63_0
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ O63 a;

    public /* synthetic */ n63_0(O63 o63) {
        this.a = o63;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean bl2) {
        O63 o63 = this.a;
        Intrinsics.checkNotNullParameter(o63, "this$0");
        o63.d.C4(bl2);
        Object object = o63.w;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            object = null;
        }
        if ((object = ((RecyclerView)object).getAdapter()) != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
        NewCustomEventsRevamp newCustomEventsRevamp = o63.Q;
        String string2 = newCustomEventsRevamp.getEC_PRODUCT_DETAILS_INTERACTIONS();
        String string3 = av_0.a(AnalyticsManager.Companion);
        Bundle bundle = o63.f();
        String string4 = o63.R;
        String string5 = o63.S;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "brand toggle click", "", "event_size_guide_interactions", string3, "pdp screen", string4, bundle, string5, false, null, 1536, null);
    }
}

