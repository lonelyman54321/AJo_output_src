/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.ValueCallback
 */
import android.webkit.ValueCallback;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.payment.activity.PeWebViewActivity;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.Payment.TransactionStatusRequest;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nq2
 */
public final class nq2_2
implements ValueCallback {
    public final /* synthetic */ PeWebViewActivity a;

    public /* synthetic */ nq2_2(PeWebViewActivity peWebViewActivity) {
        this.a = peWebViewActivity;
    }

    public final void onReceiveValue(Object object) {
        object = (String)object;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        TenantResponse tenantResponse = ((PeWebViewActivity)object).r0;
        if (tenantResponse != null) {
            oo2_0.a.getClass();
            TransactionStatusRequest transactionStatusRequest = oo2_0.s(tenantResponse);
            PEProgressView pEProgressView = ((PeWebViewActivity)object).p0;
            if (pEProgressView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webProgressView");
                pEProgressView = null;
            }
            pEProgressView.show();
            object = (op2_2)((PeWebViewActivity)object).Z.getValue();
            ((op2_2)object).m(transactionStatusRequest, tenantResponse);
        }
    }
}

