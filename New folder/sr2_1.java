/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.h;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sr2
 */
public final class sr2_1
implements Function1 {
    public final /* synthetic */ h a;

    public /* synthetic */ sr2_1(h h3) {
        this.a = h3;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "payNowCallback");
        Object object3 = cp_1.Companion;
        int n3 = nn_2.b(object3, (DataCallback)object);
        if (n3 != 0) {
            object3 = ((h)object2).e;
            String string2 = null;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressView");
                n3 = 0;
                object3 = null;
            }
            ((PEProgressView)((Object)object3)).dismiss();
            n3 = ((DataCallback)object).getStatus();
            if (n3 == 0) {
                object = (String)((DataCallback)object).getData();
                object3 = ((h)object2).Qa();
                object3 = ((kj2_1)object3).E;
                try {
                    string2 = JsonUtils.toJson(object3);
                }
                catch (Exception exception) {
                    yn3$a yn3$a = yn3_0.a;
                    yn3$a.e(exception);
                }
                ((h)object2).K = string2;
                ((h)object2).J = object;
                if (string2 != null && (n3 = string2.length()) != 0) {
                    object3 = cp_1.Companion;
                    n3 = (int)(km_1.b(object3) ? 1 : 0);
                    if (n3 != 0) {
                        object = new cn2_1();
                        object3 = ka0_0.NET_BANKING_PAYMENT;
                        string2 = "paymentType";
                        Intrinsics.checkNotNullParameter(object3, string2);
                        ((cn2_1)object).c = object3;
                        Intrinsics.checkNotNullParameter(object2, "onCountDownSuccess");
                        ((cn2_1)object).b = object2;
                        object2 = ((Fragment)object2).requireActivity().getSupportFragmentManager();
                        object3 = "PaymentAcc";
                        ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
                    } else {
                        object3 = ((h)object2).K;
                        ((h)object2).Sa((String)object, (String)object3);
                    }
                } else {
                    Bo2.a();
                }
            }
        }
        return Unit.a;
    }
}

