/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnCreateContextMenuListener
 */
import android.app.Dialog;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

public final class Ea
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ Ea(View.OnCreateContextMenuListener onCreateContextMenuListener, int n3) {
        this.a = n3;
        this.b = onCreateContextMenuListener;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                vv2_2 vv2_22 = (vv2_2)this.b;
                Intrinsics.checkNotNullParameter(vv2_22, "this$0");
                vv2_22.Wa();
                NewCustomEventsRevamp newCustomEventsRevamp = vv2_22.z0;
                String string2 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
                String string3 = av_0.a(AnalyticsManager.Companion);
                String string4 = vv2_22.A0;
                String string5 = vv2_22.B0;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "search by image interactions", "Select from gallery", "event_search_by_image_interactions", string3, "home landing screen", string4, null, string5, false, null, 1536, null);
                return;
            }
            case 3: {
                Dialog dialog = (Dialog)this.b;
                Intrinsics.checkNotNullParameter(dialog, "$dialog");
                dialog.dismiss();
                return;
            }
            case 2: {
                ff1_2 ff1_22 = (ff1_2)this.b;
                Intrinsics.checkNotNullParameter(ff1_22, "this$0");
                ff1_22.dismiss();
                return;
            }
            case 1: {
                io0_1 io0_12 = (io0_1)this.b;
                Intrinsics.checkNotNullParameter(io0_12, "this$0");
                io0_12.dismissAllowingStateLoss();
                return;
            }
            case 0: 
        }
        ia_0 ia_02 = (ia_0)this.b;
        Intrinsics.checkNotNullParameter(ia_02, "this$0");
        ConstraintLayout constraintLayout = ia_02.C1;
        if (constraintLayout != null) {
            int n4 = 8;
            constraintLayout.setVisibility(n4);
        }
        ia_02.Ob();
        NewCustomEventsRevamp newCustomEventsRevamp = ia_02.K1;
        String string6 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
        String string7 = ia_02.L1;
        String string8 = ia_02.M1;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string6, "try again", "", "event_upload_image_interactions", "search plp screen", "search plp screen", string7, null, string8, false, null, 1536, null);
    }
}

