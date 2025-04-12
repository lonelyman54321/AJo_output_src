/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.data.Payment.TransactionGetStatusResponse;
import com.ril.ajio.services.data.Payment.TransactionInformation;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aq2
 */
public final class aq2_1
implements Function1 {
    public final /* synthetic */ g a;

    public /* synthetic */ aq2_1(g g3) {
        this.a = g3;
    }

    public final Object invoke(Object object) {
        block9: {
            block6: {
                int n3;
                Object object2;
                block7: {
                    Object object3;
                    block8: {
                        object = (DataCallback)object;
                        object2 = this.a;
                        Intrinsics.checkNotNullParameter(object2, "this$0");
                        Intrinsics.checkNotNullParameter(object, "transactionGetStatusCallback");
                        object3 = cp_1.Companion;
                        n3 = nn_2.b((cp$a)object3, (DataCallback)object);
                        if (n3 == 0) break block6;
                        n3 = ((DataCallback)object).getStatus();
                        if (n3 != 0) break block7;
                        if ((object = (TransactionGetStatusResponse)((DataCallback)object).getData()) == null) break block6;
                        object3 = "FAILED";
                        n3 = (int)(((String)object3).equalsIgnoreCase((String)(object = ((TransactionGetStatusResponse)object).getTransactionStatus())) ? 1 : 0);
                        if (n3 != 0 || (n3 = (int)(((String)(object3 = "SUCCESS")).equalsIgnoreCase((String)object) ? 1 : 0)) != 0) break block8;
                        object2 = "PENDING";
                        boolean bl2 = ((String)object2).equalsIgnoreCase((String)object);
                        if (bl2) {
                            object = yn3_0.a;
                            object2 = new Object[]{};
                            object3 = "Transaction Status Failure";
                            ((yn3$a)object).d((String)object3, (Object[])object2);
                        }
                        break block6;
                    }
                    object = ((g)object2).e;
                    if (object != null) {
                        object.cancel();
                    }
                    object = ((g)object2).i;
                    object3 = PayNowResponse.class;
                    if ((object = (PayNowResponse)JsonUtils.fromJson((String)object, object3)) != null && (object = ((PayNowResponse)object).getTransactionInformation()) != null && (object = ((TransactionInformation)object).getPaymentEngineTransactionId()) != null && (n3 = ((String)object).length()) > 0) {
                        object3 = ((g)object2).c;
                        if (object3 != null) {
                            object3.a();
                        }
                        object2 = ((g)object2).Va();
                        ((op2_2)object2).n((String)object);
                    }
                    object = Unit.a;
                    break block9;
                }
                int n4 = ((DataCallback)object).getStatus();
                if (n4 == (n3 = 1)) {
                    object = ((g)object2).c;
                    if (object != null) {
                        object.h();
                    }
                    object = ((g)object2).Wa();
                    n3 = (int)(dm0_0.b ? 1 : 0);
                    int n7 = 14;
                    object2 = new hj2_0(null, n7, n3 != 0, false);
                    ((kj2_1)object).c((hj2_0)object2);
                }
            }
            object = Unit.a;
        }
        return object;
    }
}

