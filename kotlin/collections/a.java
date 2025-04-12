/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public class a {
    public static vu1_2 a(vu1_2 serializable) {
        Intrinsics.checkNotNullParameter(serializable, "builder");
        vu1_2 vu1_22 = serializable.e;
        if (vu1_22 == null) {
            serializable.h();
            serializable.d = true;
            int n3 = serializable.c;
            if (n3 <= 0) {
                serializable = vu1_2.g;
            }
            return serializable;
        }
        serializable = new IllegalStateException();
        throw serializable;
    }

    public static List b(Object list) {
        list = Collections.singletonList(list);
        Intrinsics.checkNotNullExpressionValue(list, "singletonList(...)");
        return list;
    }

    public static List c(ArrayList list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        list = CollectionsKt___CollectionsKt.D(list);
        Collections.shuffle(list);
        return list;
    }
}

