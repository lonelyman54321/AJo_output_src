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
 * Renamed from mW1
 */
public final class mw1_1
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ mw1_1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        String string2 = null;
        object = (DataCallback)object;
        ex1_0 ex1_02 = this.a;
        Intrinsics.checkNotNullParameter(ex1_02, "this$0");
        Object object2 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n4 != 0) {
            ex1_02.Xa();
            if (object != null && (n4 = ((DataCallback)object).getStatus()) == 0) {
                ex1_02.sb(false);
            } else {
                int n7;
                n4 = ((DataCallback)object).getStatus();
                if (n4 == n3 && (n7 = ex1_02.Ua((DataError)(object = ((DataCallback)object).getError()))) == 0) {
                    object = StringCompanionObject.INSTANCE;
                    n7 = R$string.acc_error_message_page_load_fail;
                    object = hv3_0.K(n7);
                    n4 = R$string.something_wrong_msg;
                    object2 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object2;
                    string2 = "format(...)";
                    object = xh2_0.a(objectArray, n3, (String)object, string2);
                    n3 = R$string.something_wrong_msg;
                    String string3 = hv3_0.K(n3);
                    ex1_02.kb(string3, (String)object);
                }
            }
        }
        return Unit.a;
    }
}

