/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import androidx.work.b;
import androidx.work.b$a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class OverwritingInputMerger
extends Nh1 {
    public final b a(ArrayList object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "inputs");
        b$a b$a = new b$a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Map map2 = Collections.unmodifiableMap(((b)object.next()).a);
            String string2 = "unmodifiableMap(values)";
            Intrinsics.checkNotNullExpressionValue(map2, string2);
            linkedHashMap.putAll(map2);
        }
        b$a.c(linkedHashMap);
        return b$a.a();
    }
}

