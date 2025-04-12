/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity;
import com.ril.ajio.services.data.Order.IfscResponse;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UD0
 */
public final class ud0_1
implements F62 {
    public final /* synthetic */ ExchangeReturnVerifyActivity a;

    public /* synthetic */ ud0_1(ExchangeReturnVerifyActivity exchangeReturnVerifyActivity) {
        this.a = exchangeReturnVerifyActivity;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onChanged(Object object) {
        boolean bl2;
        ae0_2 ae0_22;
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        cp$a cp$a = cp_1.Companion;
        boolean bl3 = nn_2.b(cp$a, (DataCallback)object);
        if (!bl3) return;
        AjioLoaderView ajioLoaderView = ((ExchangeReturnVerifyActivity)object2).y0;
        if (ajioLoaderView != null) {
            ajioLoaderView.stopLoader();
        }
        Intrinsics.checkNotNull(object);
        int n3 = ((DataCallback)object).getStatus();
        int n4 = 1;
        Object object3 = "exchange/return screen";
        String string2 = "ifsc_api_request";
        if (n3 == 0) {
            Object object4 = ((DataCallback)object).getData();
            if (object4 == null) {
                return;
            }
            ((ExchangeReturnVerifyActivity)object2).A0 = object = (IfscResponse)((DataCallback)object).getData();
            object = ((ExchangeReturnVerifyActivity)object2).D0;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                IfscResponse ifscResponse = ((ExchangeReturnVerifyActivity)object2).A0;
                ((ae0_2)object).h(ifscResponse);
            }
            if ((object = ((ExchangeReturnVerifyActivity)object2).C0) != null) {
                Intrinsics.checkNotNull(object);
                IfscResponse ifscResponse = ((ExchangeReturnVerifyActivity)object2).A0;
                ((ae0_2)object).h(ifscResponse);
            }
            object = ((ExchangeReturnVerifyActivity)object2).s0;
            Intrinsics.checkNotNull(object);
            boolean bl4 = ((ReturnOrderItemDetails)object).isRefundToBankSelected();
            if (bl4) {
                object = ((ExchangeReturnVerifyActivity)object2).v0;
                Intrinsics.checkNotNull(object);
                object.setEnabled(n4 != 0);
            }
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            object2 = ((ExchangeReturnVerifyActivity)object2).z0;
            Intrinsics.checkNotNull(object2);
            object2 = ((wf1_2)object2).i;
            String string3 = "success";
            ((GTMEvents)object).pushEvent(string2, string3, object2, (String)object3);
            return;
        }
        int n7 = ((DataCallback)object).getStatus();
        if (n7 != n4) return;
        GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
        Object object5 = ((ExchangeReturnVerifyActivity)object2).z0;
        Intrinsics.checkNotNull(object5);
        object5 = ((wf1_2)object5).i;
        String string4 = "failure";
        gTMEvents.pushEvent(string2, string4, object5, (String)object3);
        boolean bl5 = false;
        ((ExchangeReturnVerifyActivity)object2).A0 = null;
        ae0_2 ae0_23 = ((ExchangeReturnVerifyActivity)object2).D0;
        if (ae0_23 != null) {
            Intrinsics.checkNotNull(ae0_23);
            object3 = ((ExchangeReturnVerifyActivity)object2).A0;
            ae0_23.h((IfscResponse)object3);
        }
        if ((ae0_22 = ((ExchangeReturnVerifyActivity)object2).C0) != null) {
            Intrinsics.checkNotNull(ae0_22);
            object3 = ((ExchangeReturnVerifyActivity)object2).A0;
            ae0_22.h((IfscResponse)object3);
        }
        ReturnOrderItemDetails returnOrderItemDetails = ((ExchangeReturnVerifyActivity)object2).s0;
        Intrinsics.checkNotNull(returnOrderItemDetails);
        boolean bl6 = returnOrderItemDetails.isRefundToBankSelected();
        if (bl6) {
            AjioButton ajioButton = ((ExchangeReturnVerifyActivity)object2).v0;
            Intrinsics.checkNotNull(ajioButton);
            ajioButton.setEnabled(n4 != 0);
        }
        if (!(bl2 = ((ExchangeReturnVerifyActivity)object2).H0)) return;
        DataError dataError = ((DataCallback)object).getError();
        if (dataError != null) {
            DataError dataError2 = ((DataCallback)object).getError();
            Intrinsics.checkNotNull(dataError2);
            DataError$ErrorMessage dataError$ErrorMessage = dataError2.getError();
            if (dataError$ErrorMessage != null) {
                object = ((DataCallback)object).getError();
                Intrinsics.checkNotNull(object);
                object = ((DataError)object).getError().getDescription();
                boolean bl7 = TextUtils.isEmpty((CharSequence)object);
                if (bl7) return;
                object = new IfscResponse();
                ((IfscResponse)object).setErrorMessage("Please enter a valid IFSC code");
                ae0_2 ae0_24 = ((ExchangeReturnVerifyActivity)object2).D0;
                if (ae0_24 != null) {
                    Intrinsics.checkNotNull(ae0_24);
                    ae0_24.h((IfscResponse)object);
                }
                if ((object2 = ((ExchangeReturnVerifyActivity)object2).C0) == null) return;
                Intrinsics.checkNotNull(object2);
                ((ae0_2)object2).h((IfscResponse)object);
                return;
            }
        }
        object = "Please try again after some time";
        ((ExchangeReturnVerifyActivity)object2).v2((String)object);
    }
}

