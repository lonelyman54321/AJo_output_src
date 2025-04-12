/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.network.entity;

import com.affise.attribution.network.entity.PostBackModel;
import com.affise.attribution.parameters.ProviderType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class PostBackModelKt {
    public static final PostBackModel asFirstOpen(PostBackModel postBackModel) {
        Object object;
        Object object2;
        Intrinsics.checkNotNullParameter(postBackModel, "<this>");
        Object object3 = postBackModel.getParameters().entrySet();
        int n3 = eh1_2.c(yx_2.o((Iterable)object3, 10));
        int n4 = 16;
        if (n3 < n4) {
            n3 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n3);
        object3 = object3.iterator();
        while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
            Object object4 = (Map.Entry)object3.next();
            object2 = object4.getKey();
            if (object2 == (object = ProviderType.INSTALL_FIRST_EVENT)) {
                object4 = object4.getKey();
                object2 = Boolean.TRUE;
                object = new Pair(object4, object2);
            } else {
                object2 = object4.getKey();
                object4 = object4.getValue();
                object = new Pair(object2, object4);
            }
            object4 = ((Pair)object).a;
            object2 = ((Pair)object).b;
            linkedHashMap.put(object4, object2);
        }
        object = postBackModel.getEvents();
        List list = postBackModel.getLogs();
        List list2 = postBackModel.getMetrics();
        List list3 = postBackModel.getInternalEvents();
        object2 = postBackModel;
        postBackModel = new PostBackModel(linkedHashMap, (List)object, list, list2, list3);
        return postBackModel;
    }
}

