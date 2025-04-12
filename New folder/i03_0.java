/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from i03
 */
public final class i03_0
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (yn1_2)object;
        object2 = (List)object2;
        Intrinsics.checkNotNullParameter(object, "clazz");
        Intrinsics.checkNotNullParameter(object2, "types");
        ArrayList arrayList = m03_0.e(p03.a, (List)object2, true);
        Intrinsics.checkNotNull(arrayList);
        t52_0 t52_02 = new t52_0(object2, 1);
        return m03_0.a((yn1_2)object, arrayList, t52_02);
    }
}

