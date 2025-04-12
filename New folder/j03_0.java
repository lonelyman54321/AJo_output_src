/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from j03
 */
public final class j03_0
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (yn1_2)object;
        object2 = (List)object2;
        Intrinsics.checkNotNullParameter(object, "clazz");
        Intrinsics.checkNotNullParameter(object2, "types");
        Object object3 = p03.a;
        boolean bl2 = true;
        object3 = m03_0.e((i0_0)object3, (List)object2, bl2);
        Intrinsics.checkNotNull(object3);
        k03 k032 = new k03((List)object2);
        object = m03_0.a((yn1_2)object, (ArrayList)object3, k032);
        object = object != null ? xe_1.p((KSerializer)object) : null;
        return object;
    }
}

