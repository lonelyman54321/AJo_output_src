/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class J8
implements Function1 {
    public final Object invoke(Object object) {
        int n3 = 1;
        object = (DataCallback)object;
        Object object2 = q9_0.Companion;
        object2 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n4 != 0) {
            int n7;
            Intrinsics.checkNotNull(object);
            n4 = ((DataCallback)object).getStatus();
            if (n4 != 0 && (n7 = ((DataCallback)object).getStatus()) == n3) {
                object = StringCompanionObject.INSTANCE;
                n7 = R$string.acc_error_message;
                object = hv3_0.K(n7);
                n4 = R$string.addresses_not_able_to_fetch;
                object2 = hv3_0.K(n4);
                Object[] objectArray = new Object[n3];
                objectArray[0] = object2;
                Object object3 = Arrays.copyOf(objectArray, n3);
                object = String.format((String)object, object3);
                object3 = "format(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            }
        }
        return Unit.a;
    }
}

