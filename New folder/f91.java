/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.google.gson.JsonObject;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.data.Payment.TransactionInformation;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class f91
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f91(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                gu1_2 gu1_22 = (gu1_2)this.b;
                Intrinsics.checkNotNullParameter(gu1_22, "this$0");
                Object object2 = cp_1.Companion;
                int n4 = nn_2.b(object2, (DataCallback)object);
                if (n4 != 0) {
                    int n7;
                    object2 = gu1_22.d;
                    if (object2 != null) {
                        ((PEProgressView)((Object)object2)).dismiss();
                    }
                    n4 = 1;
                    if (object != null && (n7 = ((DataCallback)object).getStatus()) == 0) {
                        Object object3 = (PayNowResponse)JsonUtils.fromJson((String)(object = JsonUtils.toJson((JsonObject)((DataCallback)object).getData())), PayNowResponse.class);
                        if (object3 != null && (object3 = ((PayNowResponse)object3).getTransactionInformation()) != null) {
                            object3 = ((TransactionInformation)object3).getTransactionStatus();
                        } else {
                            n7 = 0;
                            object3 = null;
                        }
                        String string2 = "SUCCESS";
                        n4 = kotlin.text.b.i((String)object3, string2, n4 != 0);
                        if (n4 == 0) {
                            if (object != null && (n4 = ((String)object).length()) != 0) {
                                object2 = gu1_22.Pa();
                                int n8 = 13;
                                object3 = new hj2_0((String)object, n8, false, false);
                                ((kj2_1)object2).c((hj2_0)object3);
                            }
                            gu1_22.Oa();
                        }
                    } else {
                        int n10 = ((DataCallback)object).getStatus();
                        if (n10 == n4) {
                            gu1_22.Oa();
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        Object object4 = object;
        object4 = (Throwable)object;
        Object object5 = (h91)this.b;
        Intrinsics.checkNotNullParameter(object5, "this$0");
        object = ((h91)object5).j;
        object5 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(object4);
        object5 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object5, (Throwable)object4, "CouponPromotionRequest", false, null, null, 28, null);
        ((LiveData)object).k(object5);
        return Unit.a;
    }
}

