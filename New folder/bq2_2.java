/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bq2
 */
public final class bq2_2
implements Function1 {
    public final /* synthetic */ g a;

    public /* synthetic */ bq2_2(g g3) {
        this.a = g3;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        Object[] objectArray = this.a;
        Intrinsics.checkNotNullParameter(objectArray, "this$0");
        Intrinsics.checkNotNullParameter(object, "transactionStatusCallback");
        Object object2 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n3 != 0) {
            object2 = objectArray.c;
            if (object2 != null) {
                object2.h();
            }
            if ((n3 = ((DataCallback)object).getStatus()) == 0) {
                objectArray = objectArray.Wa();
                boolean bl2 = dm0_0.b;
                object = JsonUtils.toJson(((DataCallback)object).getData());
                int n4 = 12;
                object2 = new hj2_0((String)object, n4, bl2, false);
                objectArray.c((hj2_0)object2);
            } else {
                int n7;
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == (n7 = 1)) {
                    object = yn3_0.a;
                    objectArray = new Object[]{};
                    object2 = "Transaction Status Failure";
                    ((yn3$a)object).d((String)object2, objectArray);
                }
            }
        }
        return Unit.a;
    }
}

