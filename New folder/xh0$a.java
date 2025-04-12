/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.internal.StringCompanionObject;

public final class xh0$a
implements fs0_2 {
    public static final xh0$a a;

    static {
        xh0$a xh0$a;
        a = xh0$a = new Object();
    }

    public final Object emit(Object object, f80_0 f80_02) {
        int n3 = 1;
        int n4 = ((DataCallback)(object = (DataCallback)object)).getStatus();
        if (n4 == n3) {
            object = StringCompanionObject.INSTANCE;
            n4 = R$string.acc_error_message;
            object = hv3_0.K(n4);
            String string2 = "Error Loading, try again later";
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            String string3 = "format(...)";
            object = xh2_0.a(objectArray, n3, (String)object, string3);
            hv3_0.o0(n3, string2, (String)object);
        }
        return Unit.a;
    }
}

