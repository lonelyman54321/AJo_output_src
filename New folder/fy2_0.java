/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fy2
 */
public final class fy2_0 {
    public static by2_0 a(cj2_0 object, List list, i90_0 i90_02, gy2_2 object2) {
        String string2 = "migrations";
        Intrinsics.checkNotNullParameter(list, string2);
        String string3 = "scope";
        Intrinsics.checkNotNullParameter(i90_02, string3);
        String string4 = "produceFile";
        Intrinsics.checkNotNullParameter(object2, string4);
        sy2_1 sy2_12 = sy2_1.a;
        ey2_2 ey2_22 = new ey2_2(object2, 0);
        object2 = "serializer";
        Intrinsics.checkNotNullParameter(sy2_12, (String)object2);
        Intrinsics.checkNotNullParameter(list, string2);
        Intrinsics.checkNotNullParameter(i90_02, string3);
        Intrinsics.checkNotNullParameter(ey2_22, string4);
        if (object == null) {
            int n3 = 1;
            object = new wv1_0(n3);
        }
        Intrinsics.checkNotNullParameter(list, string2);
        object2 = new hi0_1(list, null);
        list = a.b(object2);
        object2 = new X53(ey2_22, list, (T90)object, i90_02);
        object = new by2_0((X53)object2);
        return object;
    }
}

