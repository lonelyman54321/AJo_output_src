/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.network.entity;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PostBackModel {
    private final List events;
    private final List internalEvents;
    private final List logs;
    private final List metrics;
    private final Map parameters;

    public PostBackModel() {
        this(null, null, null, null, null, 31, null);
    }

    public PostBackModel(Map map2, List list, List list2, List list3, List list4) {
        Intrinsics.checkNotNullParameter(map2, "parameters");
        this.parameters = map2;
        this.events = list;
        this.logs = list2;
        this.metrics = list3;
        this.internalEvents = list4;
    }

    public /* synthetic */ PostBackModel(Map map2, List object, List object2, List object3, List list, int n3, DefaultConstructorMarker object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            map2 = fh1_2.f();
        }
        n4 = n3 & 2;
        List list2 = null;
        if (n4 != 0) {
            n4 = 0;
            object4 = null;
        } else {
            object4 = object;
        }
        int n7 = n3 & 4;
        Object object5 = n7 != 0 ? null : object2;
        n7 = n3 & 8;
        Object object6 = n7 != 0 ? null : object3;
        n7 = n3 & 0x10;
        if (n7 == 0) {
            list2 = list;
        }
        object = this;
        object2 = map2;
        object3 = object4;
        list = object5;
        object4 = list2;
        this(map2, (List)object3, (List)object5, (List)object6, list2);
    }

    public static /* synthetic */ PostBackModel copy$default(PostBackModel postBackModel, Map map2, List object, List object2, List object3, List list, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            map2 = postBackModel.parameters;
        }
        if ((n4 = n3 & 2) != 0) {
            object = postBackModel.events;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = postBackModel.logs;
        }
        List list2 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = postBackModel.metrics;
        }
        List list3 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            list = postBackModel.internalEvents;
        }
        List list4 = list;
        object = postBackModel;
        object2 = map2;
        object3 = object4;
        list = list2;
        object4 = list4;
        return postBackModel.copy(map2, (List)object3, list2, list3, list4);
    }

    public final Map component1() {
        return this.parameters;
    }

    public final List component2() {
        return this.events;
    }

    public final List component3() {
        return this.logs;
    }

    public final List component4() {
        return this.metrics;
    }

    public final List component5() {
        return this.internalEvents;
    }

    public final PostBackModel copy(Map map2, List list, List list2, List list3, List list4) {
        Intrinsics.checkNotNullParameter(map2, "parameters");
        PostBackModel postBackModel = new PostBackModel(map2, list, list2, list3, list4);
        return postBackModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PostBackModel;
        if (!bl3) {
            return false;
        }
        object = (PostBackModel)object;
        Object object2 = this.parameters;
        Object object3 = ((PostBackModel)object).parameters;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.events;
        object3 = ((PostBackModel)object).events;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.logs;
        object3 = ((PostBackModel)object).logs;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.metrics;
        object3 = ((PostBackModel)object).metrics;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.internalEvents;
        object = ((PostBackModel)object).internalEvents;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getEvents() {
        return this.events;
    }

    public final List getInternalEvents() {
        return this.internalEvents;
    }

    public final List getLogs() {
        return this.logs;
    }

    public final List getMetrics() {
        return this.metrics;
    }

    public final Map getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        int n3;
        Map map2 = this.parameters;
        int n4 = ((Object)map2).hashCode() * 31;
        List list = this.events;
        int n7 = 0;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        n4 = (n4 + n3) * 31;
        list = this.logs;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        n4 = (n4 + n3) * 31;
        list = this.metrics;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        n4 = (n4 + n3) * 31;
        list = this.internalEvents;
        if (list != null) {
            n7 = ((Object)list).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PostBackModel(parameters=");
        Object object = this.parameters;
        stringBuilder.append(object);
        stringBuilder.append(", events=");
        object = this.events;
        stringBuilder.append(object);
        stringBuilder.append(", logs=");
        object = this.logs;
        stringBuilder.append(object);
        stringBuilder.append(", metrics=");
        object = this.metrics;
        stringBuilder.append(object);
        stringBuilder.append(", internalEvents=");
        object = this.internalEvents;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

