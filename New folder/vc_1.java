/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.kmm.shared.network.HttpClientProvider;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.data.Payment.TransactionInformation;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from Vc
 */
public final class vc_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vc_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                x72_0 x72_02 = (x72_0)this.b;
                object = (la1_2)object;
                return HttpClientProvider.b(x72_02, (la1_2)object);
            }
            case 0: 
        }
        object = (DataCallback)object;
        zc_1 zc_12 = (zc_1)this.b;
        Intrinsics.checkNotNullParameter(zc_12, "this$0");
        Object object2 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n4 != 0) {
            int n7;
            object2 = zc_12.h;
            Object object3 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBarListener");
                n4 = 0;
                object2 = null;
            }
            Object object4 = Boolean.FALSE;
            object2.invoke(object4);
            n4 = 1;
            if (object != null && (n7 = ((DataCallback)object).getStatus()) == 0) {
                object4 = (PayNowResponse)JsonUtils.fromJson((String)(object = JsonUtils.toJson((JsonObject)((DataCallback)object).getData())), PayNowResponse.class);
                if (object4 != null && (object4 = ((PayNowResponse)object4).getTransactionInformation()) != null) {
                    object3 = ((TransactionInformation)object4).getTransactionStatus();
                }
                if ((n4 = kotlin.text.b.i(object3, (String)(object4 = "SUCCESS"), n4 != 0)) == 0) {
                    if (object != null && (n4 = ((String)object).length()) != 0) {
                        object2 = zc_12.Pa();
                        n7 = 13;
                        object3 = new hj2_0((String)object, n7, false, false);
                        ((kj2_1)object2).c((hj2_0)object3);
                    }
                    zc_12.Oa();
                }
            } else {
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == n4) {
                    zc_12.Oa();
                }
            }
        }
        return Unit.a;
    }
}

