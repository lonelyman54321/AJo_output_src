/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Facet$Companion {
    private Facet$Companion() {
    }

    public /* synthetic */ Facet$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ int a(Map.Entry entry, Map.Entry entry2) {
        return Facet$Companion.sortByValue$lambda$0(entry, entry2);
    }

    public static /* synthetic */ int b(di0_2 di0_22, Object object, Object object2) {
        return Facet$Companion.sortByValue$lambda$1(di0_22, object, object2);
    }

    private final HashMap sortByValue(HashMap linkedHashMap) {
        boolean bl2;
        linkedHashMap = ((HashMap)linkedHashMap).entrySet();
        Object object = new LinkedList(linkedHashMap);
        linkedHashMap = new LinkedHashMap();
        Object object2 = new ei0_2((di0_2)((Object)linkedHashMap));
        Collections.sort(object, object2);
        linkedHashMap = new LinkedHashMap();
        object = ((AbstractCollection)object).iterator();
        object2 = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            Intrinsics.checkNotNull(object2);
            Object object3 = object2.getKey();
            Intrinsics.checkNotNullExpressionValue(object3, "component1(...)");
            object3 = (String)object3;
            object2 = object2.getValue();
            String string2 = "component2(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            object2 = (Integer)object2;
            linkedHashMap.put(object3, object2);
        }
        return linkedHashMap;
    }

    private static final int sortByValue$lambda$0(Map.Entry entry, Map.Entry entry2) {
        int n3 = ((Number)entry2.getValue()).intValue();
        entry = entry.getValue();
        Intrinsics.checkNotNullExpressionValue(entry, "<get-value>(...)");
        int n4 = ((Number)((Object)entry)).intValue();
        return Intrinsics.compare(n3, n4);
    }

    private static final int sortByValue$lambda$1(Function2 function2, Object object, Object object2) {
        Intrinsics.checkNotNullParameter(function2, "$tmp0");
        return ((Number)function2.invoke(object, object2)).intValue();
    }
}

