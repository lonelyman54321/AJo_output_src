/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qP
 */
public final class qp_2
implements Function1 {
    public final Object invoke(Object object) {
        object = (Map.Entry)object;
        Intrinsics.checkNotNullParameter(object, "$this$DelegatingMutableSet");
        String string2 = ((vp_2)object.getKey()).a;
        object = object.getValue();
        ca0_2 ca0_22 = new ca0_2(string2, object);
        return ca0_22;
    }
}

