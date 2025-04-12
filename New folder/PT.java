/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.CheckBox
 */
import android.view.View;
import android.widget.CheckBox;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

public final class PT
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ PT(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                vv2_2 vv2_22 = (vv2_2)this.b;
                Intrinsics.checkNotNullParameter(vv2_22, "this$0");
                ue1_2.Companion.getClass();
                Intrinsics.checkNotNullParameter(vv2_22, "searchBarCameraListener");
                Object object = "SEARCH";
                Intrinsics.checkNotNullParameter(object, "sourcePage");
                Object object2 = new ue1_2();
                ((ue1_2)object2).h = vv2_22;
                ((ue1_2)object2).i = object;
                ((ue1_2)object2).j = null;
                object = vv2_22.getChildFragmentManager();
                ((DialogFragment)object2).show((FragmentManager)object, "ImageSearch");
                NewCustomEventsRevamp newCustomEventsRevamp = vv2_22.z0;
                String string2 = newCustomEventsRevamp.getEC_IMAGE_SEARCH();
                object2 = AnalyticsManager.Companion;
                String string3 = Ft2.a(av_0.a((AnalyticsManager$Companion)object2), "-icon");
                String string4 = av_0.a((AnalyticsManager$Companion)object2);
                String string5 = vv2_22.A0;
                String string6 = vv2_22.B0;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "image search click", string3, "event_image_search_click", string4, "home landing screen", string5, null, string6, false, null, 1536, null);
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
        ST sT = (ST)this.b;
        Intrinsics.checkNotNullParameter(sT, "this$0");
        CheckBox checkBox = sT.f;
        boolean bl2 = checkBox.isChecked() ^ true;
        checkBox.setChecked(bl2);
    }
}

