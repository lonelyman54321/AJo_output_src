/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from oW1
 */
public final class ow1_1
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ ow1_1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        String string2 = null;
        int n4 = 1;
        object = (DataCallback)object;
        ex1_0 ex1_02 = this.a;
        Intrinsics.checkNotNullParameter(ex1_02, "this$0");
        Object object2 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (bl2) {
            int n7;
            ex1_02.Xa();
            object2 = "format(...)";
            if (object != null && (n7 = ((DataCallback)object).getStatus()) == 0) {
                object = StringCompanionObject.INSTANCE;
                int n8 = R$string.acc_alert_message;
                object = hv3_0.K(n8);
                n7 = R$string.coupon_removed;
                String string3 = hv3_0.K(n7);
                Object[] objectArray = new Object[n4];
                objectArray[0] = string3;
                object = xh2_0.a(objectArray, n4, (String)object, (String)object2);
                n4 = R$string.coupon_removed;
                String string4 = hv3_0.K(n4);
                ex1_02.kb(string4, (String)object);
                object = ex1_02.x0;
                if (object != null) {
                    n4 = 0;
                    string4 = null;
                    ((qm_1)object).a = null;
                    ((qm_1)object).b = null;
                    ((qm_1)object).c = false;
                    ((qm_1)object).d = false;
                }
                ex1_02.sb(false);
            } else {
                int n10;
                n7 = ((DataCallback)object).getStatus();
                if (n7 == n4 && (n10 = ex1_02.Ua((DataError)(object = ((DataCallback)object).getError()))) == 0) {
                    object = StringCompanionObject.INSTANCE;
                    n10 = R$string.acc_error_message_page_load_fail;
                    object = hv3_0.K(n10);
                    n7 = R$string.coupon_removal_alert;
                    String string5 = hv3_0.K(n7);
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = string5;
                    object = xh2_0.a(objectArray, n4, (String)object, (String)object2);
                    n3 = R$string.coupon_removal_alert;
                    string2 = hv3_0.K(n3);
                    ex1_02.kb(string2, (String)object);
                }
            }
        }
        return Unit.a;
    }
}

