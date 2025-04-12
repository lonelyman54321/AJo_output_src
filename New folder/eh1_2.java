/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eH1
 */
public class eh1_2
extends dh1_1 {
    public static ng1_2 a(ng1_2 ng1_22) {
        Intrinsics.checkNotNullParameter(ng1_22, "builder");
        return ng1_22.c();
    }

    public static ng1_2 b() {
        ng1_2 ng1_22 = new ng1_2();
        return ng1_22;
    }

    public static int c(int n3) {
        if (n3 >= 0) {
            int n4 = 3;
            float f5 = 4.2E-45f;
            if (n3 < n4) {
                ++n3;
            } else {
                n4 = 0x40000000;
                f5 = 2.0f;
                if (n3 < n4) {
                    float f6 = (float)n3 / 0.75f;
                    n4 = 1065353216;
                    f5 = 1.0f;
                    n3 = (int)(f6 += f5);
                } else {
                    n3 = -1 >>> 1;
                    float f7 = 0.0f / 0.0f;
                }
            }
        }
        return n3;
    }

    public static Map d(Pair map2) {
        Intrinsics.checkNotNullParameter(map2, "pair");
        Object object = ((Pair)((Object)map2)).a;
        map2 = ((Pair)((Object)map2)).b;
        map2 = Collections.singletonMap(object, map2);
        Intrinsics.checkNotNullExpressionValue(map2, "singletonMap(...)");
        return map2;
    }

    public static final Map e(Map map2) {
        Intrinsics.checkNotNullParameter(map2, "<this>");
        map2 = map2.entrySet().iterator().next();
        Object k2 = map2.getKey();
        map2 = map2.getValue();
        map2 = Collections.singletonMap(k2, map2);
        Intrinsics.checkNotNullExpressionValue(map2, "with(...)");
        return map2;
    }
}

