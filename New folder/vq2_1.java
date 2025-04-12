/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VQ2
 */
public final class vq2_1
implements View.OnClickListener {
    public final /* synthetic */ wq2_2 a;

    public /* synthetic */ vq2_1(wq2_2 wq2_22) {
        this.a = wq2_22;
    }

    public final void onClick(View view) {
        Object object = wq2_2.Companion;
        wq2_2 wq2_22 = this.a;
        Intrinsics.checkNotNullParameter(wq2_22, "this$0");
        object = wq2_22.e;
        if (object != null) {
            boolean bl2;
            int n3;
            Intrinsics.checkNotNullParameter(object, "entryPoint");
            Object object2 = wq2_22.f;
            Object object3 = "close";
            if (object2 != null && (object2 = ((ProfileHealth)object2).getRule()) != null && (n3 = ((String)object2).length()) != 0) {
                object3 = object2;
            }
            String string2 = object3;
            object2 = wq2_22.f;
            object3 = "";
            if (object2 != null && (object2 = ((ProfileHealth)object2).getMessage()) != null && (n3 = ((String)object2).length()) != 0) {
                object3 = object2;
            }
            if (bl2 = Intrinsics.areEqual(object, object2 = "ProceedPayment")) {
                NewCustomEventsRevamp newCustomEventsRevamp = wq2_22.a;
                String string3 = "rvp alert halfcut screen - auto";
                String string4 = "RVP_fraud_engine_response";
                String string5 = "bag screen";
                String string6 = "bag screen";
                String string7 = wq2_22.b;
                String string8 = wq2_22.c;
                int n4 = 1664;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string3, string2, (String)object3, string4, string5, string6, string7, null, string8, false, null, n4, null);
            } else {
                NewCustomEventsRevamp newCustomEventsRevamp = wq2_22.a;
                String string9 = "rvp alert halfcut screen - manual";
                String string10 = "RVP_fraud_engine_response";
                String string11 = "bag screen";
                String string12 = "bag screen";
                String string13 = wq2_22.b;
                String string14 = wq2_22.c;
                int n7 = 1664;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string9, string2, (String)object3, string10, string11, string12, string13, null, string14, false, null, n7, null);
            }
        }
        wq2_22.dismiss();
    }
}

