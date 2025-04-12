/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import kotlin.jvm.internal.Intrinsics;

public final class u6
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u6(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = this.b;
        String string2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (pk0_2)object;
                Intrinsics.checkNotNullParameter(object, string2);
                ((BottomSheetDialogFragment)object).dismiss();
                return;
            }
            case 1: {
                object = (jn_1)object;
                Intrinsics.checkNotNullParameter(object, string2);
                object = ((jn_1)object).b;
                if (object != null) {
                    object.c();
                }
                GTMEvents.pushBagInteractionsEvent$default(AnalyticsManager.Companion.getInstance().getGtmEvents(), "bag interactions", "wallet verify", "click", "checkout_wallet_verify_click", "bag screen", null, 32, null);
                return;
            }
            case 0: 
        }
        object = (z6_0)object;
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((z6_0)object).i;
        if (object != null) {
            object.B0();
        }
    }
}

