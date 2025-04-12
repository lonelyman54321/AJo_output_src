/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.media3.common.f;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerControlView$i;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BV1
 */
public final class bv1_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bv1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                int n4;
                boolean bl2;
                PlayerControlView playerControlView = ((PlayerControlView$i)this.b).c;
                Object object = playerControlView.z0;
                if (object != null && (bl2 = object.isCommandAvailable(n4 = 29))) {
                    object = playerControlView.z0.getTrackSelectionParameters();
                    f f5 = playerControlView.z0;
                    object = ((Fp3)object).a();
                    int n7 = 3;
                    object = ((Fp3$b)object).b(n7).d().f().h().a();
                    f5.setTrackSelectionParameters((Fp3)object);
                    playerControlView = playerControlView.k;
                    playerControlView.dismiss();
                }
                return;
            }
            case 0: 
        }
        iv1_2 iv1_22 = (iv1_2)this.b;
        Intrinsics.checkNotNullParameter(iv1_22, "this$0");
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string2 = bv_0.a(analyticsManager$Companion);
        String string3 = cv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp newCustomEventsRevamp = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        String string4 = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp().getEC_COUPON_INTERACTIONS();
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string4, "gift card clicks", "go to bag", "gift_card_go_to_bag", "coupon screen", "coupon screen", string2, null, string3, false, null, 1536, null);
        iv1_22.onNavigationClick();
    }
}

