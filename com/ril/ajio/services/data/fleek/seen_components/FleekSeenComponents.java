/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.seen_components;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FleekSeenComponents {
    private final String id;
    private final String pageName;
    private final Long time;
    private final String type;

    public FleekSeenComponents(String string2, Long l2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string4, "pageName");
        this.id = string2;
        this.time = l2;
        this.type = string3;
        this.pageName = string4;
    }

    public /* synthetic */ FleekSeenComponents(String string2, Long l2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            l2 = null;
        }
        if ((n3 &= 4) != 0) {
            string3 = null;
        }
        this(string2, l2, string3, string4);
    }

    public static /* synthetic */ FleekSeenComponents copy$default(FleekSeenComponents fleekSeenComponents, String string2, Long l2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = fleekSeenComponents.id;
        }
        if ((n4 = n3 & 2) != 0) {
            l2 = fleekSeenComponents.time;
        }
        if ((n4 = n3 & 4) != 0) {
            string3 = fleekSeenComponents.type;
        }
        if ((n3 &= 8) != 0) {
            string4 = fleekSeenComponents.pageName;
        }
        return fleekSeenComponents.copy(string2, l2, string3, string4);
    }

    public final String component1() {
        return this.id;
    }

    public final Long component2() {
        return this.time;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.pageName;
    }

    public final FleekSeenComponents copy(String string2, Long l2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string4, "pageName");
        FleekSeenComponents fleekSeenComponents = new FleekSeenComponents(string2, l2, string3, string4);
        return fleekSeenComponents;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FleekSeenComponents;
        if (!bl3) {
            return false;
        }
        object = (FleekSeenComponents)object;
        Object object2 = this.id;
        Object object3 = ((FleekSeenComponents)object).id;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.time;
        object3 = ((FleekSeenComponents)object).time;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object3 = ((FleekSeenComponents)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageName;
        object = ((FleekSeenComponents)object).pageName;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final Long getTime() {
        return this.time;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.id;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.time;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.type;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        return this.pageName.hashCode() + n4;
    }

    public String toString() {
        String string2 = this.id;
        Long l2 = this.time;
        String string3 = this.type;
        String string4 = this.pageName;
        StringBuilder stringBuilder = new StringBuilder("FleekSeenComponents(id=");
        stringBuilder.append(string2);
        stringBuilder.append(", time=");
        stringBuilder.append(l2);
        stringBuilder.append(", type=");
        return ko_0.a(stringBuilder, string3, ", pageName=", string4, ")");
    }
}

