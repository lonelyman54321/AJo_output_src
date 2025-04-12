/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class Kj0
implements vv1$a,
o60_0 {
    public void accept(Object object) {
        int n3 = 1;
        object = (Throwable)object;
        object = Yz2.Companion;
        object = hv3_0.K(R$string.something_wrong_msg);
        Object object2 = StringCompanionObject.INSTANCE;
        object2 = hv3_0.K(R$string.acc_error_message);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        Object object3 = Arrays.copyOf(objectArray, n3);
        object3 = String.format((String)object2, object3);
        Intrinsics.checkNotNullExpressionValue(object3, "format(...)");
        mq0_2.b((String)object, (String)object3);
    }

    public void invoke(Object object) {
        ((oe)object).getClass();
    }
}

