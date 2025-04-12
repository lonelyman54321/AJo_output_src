/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ToggleButton
 */
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from js2
 */
public final class js2_1
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ks2_1 a;
    public final /* synthetic */ co2_0 b;

    public /* synthetic */ js2_1(ks2_1 ks2_12, co2_0 co2_02) {
        this.a = ks2_12;
        this.b = co2_02;
    }

    public final void onCheckedChanged(CompoundButton object, boolean bl2) {
        Object object2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$paymentInfoProvider");
        Object object4 = "Wallet";
        if (bl2) {
            uh_1.Companion.getClass();
            Intrinsics.checkNotNullParameter(object4, "<set-?>");
            uh_1.e = object4;
            object2 = object.f.h;
            int n3 = 11;
            ((eo2_0)object2).b(n3);
            uh_1.d = bl2 = true;
            object.e.showContentContainer();
            object2 = object.b;
            if (object2 != null) {
                object3 = object.d;
                int n4 = object.a;
                object2.k((ToggleButton)object3, n4);
            }
        } else {
            Object object5;
            Object object6;
            Object object7;
            object2 = uh_1.Companion;
            object2.getClass();
            bl2 = uh_1.c;
            if ((bl2 && (bl2 = ((m80_0)(object2 = object3.A())).d()) || !(bl2 = uh_1.d)) && !(bl2 = Intrinsics.areEqual(object2 = uh_1.e, object4))) {
                object2 = object.f;
                ((af3_1)object2).a();
            } else {
                object2 = object.f;
                object3 = ((af3_1)object2).b;
                if (object3 != null) {
                    object3.a();
                }
                if ((object3 = object.c) != null) {
                    object4 = ((af3_1)object2).d;
                    object7 = object4.j0();
                    object6 = object4.n8();
                    object5 = hj_1.WALLET;
                    object4 = object4.H();
                    op2_2.d((op2_2)object3, (PaymentInstruments)object7, (TenantResponse)object6, object5, (HashSet)object4);
                }
                ((af3_1)object2).a();
            }
            object2 = object.b;
            if (object2 != null) {
                boolean bl3 = false;
                object3 = null;
                object2.i4(null);
            }
            Bundle bundle = new Bundle();
            object2 = AnalyticsManager.Companion;
            object3 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp().getPAYMENT_MODE();
            bundle.putString((String)object3, "wallet");
            object4 = object.b;
            if (object4 != null) {
                object2 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                object7 = ((NewCustomEventsRevamp)object2).getEC_CHECKOUT_INTERACTIONS();
                object5 = "wallet click";
                String string2 = "payment_accordian_close";
                object6 = "payment accordian close";
                object4.g((String)object7, (String)object6, (String)object5, bundle, string2);
            }
            object2 = object.e;
            ((AjioCustomExpandablePanel)((Object)object2)).hideContentContainer();
        }
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        object3 = new Tt1(object, 1);
        object2.postDelayed((Runnable)object3, 1000L);
    }
}

