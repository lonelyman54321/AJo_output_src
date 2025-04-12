/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ToggleButton
 */
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Nr2
 */
public final class nr2_0
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ or2_0 a;

    public /* synthetic */ nr2_0(or2_0 or2_02) {
        this.a = or2_02;
    }

    public final void onCheckedChanged(CompoundButton object, boolean n3) {
        Object object2;
        Object object3;
        Object object4;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object5 = ((or2_0)object).f;
        Object object6 = null;
        try {
            object4 = object5.getContext();
            object3 = "input_method";
        }
        catch (Exception exception) {}
        object4 = object4.getSystemService((String)object3);
        object3 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
        Intrinsics.checkNotNull(object4, (String)object3);
        object4 = (InputMethodManager)object4;
        object5 = object5.getWindowToken();
        object4.hideSoftInputFromWindow((IBinder)object5, 0);
        object5 = ((or2_0)object).d;
        object4 = null;
        object3 = "CC";
        AjioCustomExpandablePanel ajioCustomExpandablePanel = ((or2_0)object).g;
        dv_0 dv_02 = ((or2_0)object).c;
        il_2 il_22 = ((or2_0)object).e;
        if (n3) {
            int n4;
            int n7;
            uh_1.Companion.getClass();
            object2 = "<set-?>";
            Intrinsics.checkNotNullParameter(object3, (String)object2);
            uh_1.e = object3;
            n3 = ((or2_0)object).n;
            if (!n3) {
                object2 = il_22.f;
                n7 = 8;
                ((eo2_0)object2).b(n7);
            }
            ((or2_0)object).n = false;
            uh_1.d = n3 = 1;
            n7 = ((or2_0)object).w();
            if (n7 <= 0 && (n4 = object5.g6()) == 0) {
                if (dv_02 != null) {
                    dv_02.o3();
                }
                ajioCustomExpandablePanel.hideContentContainer();
            } else {
                ajioCustomExpandablePanel.showContentContainer();
                il_22.i.b();
                object5 = ((or2_0)object).l;
                if (object5 != null && (object5 = ((PaymentInstrumentType)object5).getPaymentInstrumentsInfo()) != null) {
                    n4 = ((ArrayList)object5).size();
                } else {
                    n4 = 0;
                    object5 = null;
                }
                if (n4 == n3) {
                    uh_1.d = false;
                    object2 = ((or2_0)object).l;
                    if (object2 != null && (object2 = ((PaymentInstrumentType)object2).getPaymentInstrumentsInfo()) != null) {
                        object2 = ((ArrayList)object2).get(0);
                        object4 = object2;
                        object4 = (PaymentInstrumentInfo)object2;
                    }
                    ((or2_0)object).s((PaymentInstrumentInfo)object4);
                }
            }
            if (dv_02 != null) {
                object2 = ((or2_0)object).f;
                n4 = ((rw_2)object).a;
                dv_02.k((ToggleButton)object2, n4);
            }
        } else {
            object2 = uh_1.Companion;
            object2.getClass();
            n3 = uh_1.c;
            if ((n3 && (n3 = ((m80_0)(object2 = object5.A())).d()) || !(n3 = uh_1.d)) && !(n3 = Intrinsics.areEqual(object2 = uh_1.e, object3))) {
                object2 = ((or2_0)object).l;
                il_22.b((PaymentInstrumentType)object2);
            } else {
                object2 = ((or2_0)object).l;
                object5 = il_22.c;
                if (object5 != null) {
                    object5.a();
                }
                if ((object5 = il_22.a) != null) {
                    object6 = il_22.d;
                    object3 = object6.j0();
                    TenantResponse tenantResponse = object6.n8();
                    hj_1 hj_12 = hj_1.EXISTING_CARD;
                    object6 = object6.H();
                    op2_2.d((op2_2)object5, (PaymentInstruments)object3, tenantResponse, hj_12, (HashSet)object6);
                }
                il_22.b((PaymentInstrumentType)object2);
            }
            object2 = il_22.i;
            object2.notifyDataSetChanged();
            if (dv_02 != null) {
                dv_02.i4(null);
            }
            ajioCustomExpandablePanel.hideContentContainer();
        }
        object5 = Looper.getMainLooper();
        object2 = new Handler((Looper)object5);
        object5 = new mb_2(object, 1);
        object2.postDelayed((Runnable)object5, 1000L);
    }
}

