/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from Sr0
 */
public final class sr0_2
implements tr0_2 {
    public static final ds2_0 a(Function2 fx0_22, Function1 object) {
        fv1_0 fv1_02 = new fv1_0((Function2)fx0_22);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        fx0_22 = (Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object, 1);
        object = CS2.a;
        object = new ds2_0(fv1_02, (Function1)fx0_22);
        return object;
    }

    public List lookup(String string2) {
        Object object;
        Object[] objectArray = "hostname";
        Intrinsics.checkNotNullParameter(string2, (String)objectArray);
        try {
            objectArray = InetAddress.getAllByName(string2);
            object = "getAllByName(hostname)";
        }
        catch (NullPointerException nullPointerException) {
            string2 = kp1_0.c("Broken system behaviour for dns lookup of ", string2);
            object = new UnknownHostException(string2);
            ((Throwable)object).initCause(nullPointerException);
            throw object;
        }
        Intrinsics.checkNotNullExpressionValue(objectArray, (String)object);
        return tp_2.M(objectArray);
    }
}

