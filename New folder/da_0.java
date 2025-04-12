/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Da
 */
public final class da_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ da_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                vv2_2 vv2_22 = (vv2_2)this.b;
                Intrinsics.checkNotNullParameter(vv2_22, "this$0");
                vv2_22.Ra();
                NewCustomEventsRevamp newCustomEventsRevamp = vv2_22.z0;
                String string2 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
                String string3 = av_0.a(AnalyticsManager.Companion);
                String string4 = vv2_22.A0;
                String string5 = vv2_22.B0;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "search by image interactions", "Click a photo", "event_search_by_image_interactions", string3, "home landing screen", string4, null, string5, false, null, 1536, null);
                return;
            }
            case 1: {
                ff1_2 ff1_22 = (ff1_2)this.b;
                Intrinsics.checkNotNullParameter(ff1_22, "this$0");
                ff1_22.dismiss();
                return;
            }
            case 0: 
        }
        ia_0 ia_02 = (ia_0)this.b;
        Intrinsics.checkNotNullParameter(ia_02, "this$0");
        ia_02.Pb();
    }
}

