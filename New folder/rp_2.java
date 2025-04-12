/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rP
 */
public final class rp_2
implements Function1 {
    public final Object invoke(Object object) {
        object = (Map.Entry)object;
        Intrinsics.checkNotNullParameter(object, "$this$DelegatingMutableSet");
        vp_2 vp_22 = ol3_0.a((String)object.getKey());
        object = object.getValue();
        ca0_2 ca0_22 = new ca0_2(vp_22, object);
        return ca0_22;
    }
}

