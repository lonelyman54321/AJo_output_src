/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

public final class R90 {
    public static final c a(FP2 object) {
        String string2;
        Map map2 = ((FP2)object).getBackingFieldMap();
        Object object2 = map2.get(string2 = "QueryDispatcher");
        if (object2 == null) {
            object = ((FP2)object).getQueryExecutor();
            object2 = h83.a((Executor)object);
            map2.put(string2, object2);
        }
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (c)object2;
    }

    public static boolean b(byte[] byArray, byte[] byArray2) {
        int n3;
        int n4;
        boolean bl2 = false;
        if (byArray != null && (n4 = byArray.length) >= (n3 = 2)) {
            n4 = byArray.length - n3;
            n3 = byArray2[0];
            if ((n4 = byArray[n4]) == n3) {
                n4 = byArray.length;
                n3 = 1;
                byte by2 = byArray[n4 -= n3];
                byte by4 = byArray2[n3];
                if (by2 == by4) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }
}

