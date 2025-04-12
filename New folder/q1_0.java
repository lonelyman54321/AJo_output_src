/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from q1
 */
public final class q1_0 {
    public static final f80_0[] a = new f80_0[0];

    public static final void a(HashMap hashMap, Function1 function1) {
        int n3;
        Intrinsics.checkNotNullParameter(hashMap, "map");
        Intrinsics.checkNotNullParameter(function1, "fetchBlock");
        int n4 = 999;
        HashMap hashMap2 = new HashMap(n4);
        Iterator iterator = hashMap.keySet().iterator();
        block0: while (true) {
            boolean bl2;
            n3 = 0;
            while (bl2 = iterator.hasNext()) {
                Object k2 = iterator.next();
                Intrinsics.checkNotNullExpressionValue(k2, "key");
                Object v4 = hashMap.get(k2);
                hashMap2.put(k2, v4);
                if (++n3 != n4) continue;
                function1.invoke(hashMap2);
                hashMap2.clear();
                continue block0;
            }
            break;
        }
        if (n3 > 0) {
            function1.invoke(hashMap2);
        }
    }
}

