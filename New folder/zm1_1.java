/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.gson.JsonObject;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.payment.juspay.JuspayActivity;
import com.ril.ajio.payment.juspay.JuspayActivity$a;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zm1
 */
public final class zm1_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zm1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3;
        int n4 = 0;
        Object object2 = null;
        Object object3 = "this$0";
        Object object4 = this.b;
        int n7 = this.a;
        object = (DataCallback)object;
        switch (n7) {
            default: {
                object4 = (g)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                object3 = cp_1.Companion;
                int n8 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (n8 != 0) {
                    object3 = ((g)object4).c;
                    if (object3 != null) {
                        object3.h();
                    }
                    if ((n8 = ((DataCallback)object).getStatus()) == 0) {
                        object = (String)((DataCallback)object).getData();
                        object3 = ((Fragment)object4).getActivity();
                        if (object3 != null && (n8 = (int)(object3.isFinishing() ? 1 : 0)) == 0 && (n8 = (int)(((Fragment)object4).isAdded() ? 1 : 0)) != 0) {
                            ((g)object4).r = object;
                            object3 = ((g)object4).Wa();
                            object3 = ((kj2_1)object3).E;
                            try {
                                object2 = JsonUtils.toJson(object3);
                            }
                            catch (Exception exception) {
                                yn3$a yn3$a = yn3_0.a;
                                yn3$a.e(exception);
                            }
                            ((g)object4).s = object2;
                            if (object2 != null && (n4 = ((String)object2).length()) != 0) {
                                object2 = cp_1.Companion;
                                n4 = (int)(km_1.b((cp$a)object2) ? 1 : 0);
                                if (n4 != 0) {
                                    object = new cn2_1();
                                    object2 = ka0_0.NET_BANKING_PAYMENT;
                                    Intrinsics.checkNotNullParameter(object2, "paymentType");
                                    ((cn2_1)object).c = object2;
                                    Intrinsics.checkNotNullParameter(object4, "onCountDownSuccess");
                                    ((cn2_1)object).b = object4;
                                    object2 = ((Fragment)object4).requireActivity().getSupportFragmentManager();
                                    object3 = "PaymentAcc";
                                    ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
                                } else {
                                    object2 = ((g)object4).s;
                                    ((g)object4).Xa((String)object, (String)object2);
                                }
                            } else {
                                Bo2.a();
                            }
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        JuspayActivity$a juspayActivity$a = JuspayActivity.Companion;
        object4 = (JuspayActivity)object4;
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object3 = ((JuspayActivity)object4).Y;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            n3 = 0;
            object3 = null;
        }
        ((PEProgressView)((Object)object3)).dismiss();
        n3 = ((DataCallback)object).getStatus();
        if (n3 == 0) {
            object3 = (PayNowResponse)JsonUtils.fromJson((String)(object = JsonUtils.toJson((JsonObject)((DataCallback)object).getData())), PayNowResponse.class);
            if (object3 != null) {
                object2 = ((PayNowResponse)object3).getTransactionInformation();
            }
            if (object2 != null) {
                object2 = new Intent();
                object3 = "transactionresponse";
                object = object2.putExtra((String)object3, (String)object);
                n4 = -1;
                object4.setResult(n4, (Intent)object);
                object4.finish();
            }
        } else {
            int n10 = ((DataCallback)object).getStatus();
            if (n10 == (n4 = 1)) {
                ((JuspayActivity)object4).r2();
            }
        }
        return Unit.a;
    }
}

