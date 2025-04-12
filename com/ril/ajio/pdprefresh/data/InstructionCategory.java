/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.data;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class InstructionCategory {
    public static final int $stable = 8;
    private final String brickCategory;
    private final List brickNames;
    private final List colors;
    private final String imageUrl;

    public InstructionCategory() {
        this(null, null, null, null, 15, null);
    }

    public InstructionCategory(String string2, List list, String string3, List list2) {
        Intrinsics.checkNotNullParameter(string2, "brickCategory");
        Intrinsics.checkNotNullParameter(list, "brickNames");
        Intrinsics.checkNotNullParameter(string3, "imageUrl");
        Intrinsics.checkNotNullParameter(list2, "colors");
        this.brickCategory = string2;
        this.brickNames = list;
        this.imageUrl = string3;
        this.colors = list2;
    }

    public InstructionCategory(String string2, List list, String string3, List list2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        String string4 = "";
        if (n4 != 0) {
            string2 = string4;
        }
        if ((n4 = n3 & 2) != 0) {
            list = mz0_2.a;
        }
        if ((n4 = n3 & 4) != 0) {
            string3 = string4;
        }
        if ((n3 &= 8) != 0) {
            list2 = mz0_2.a;
        }
        this(string2, list, string3, list2);
    }

    public static /* synthetic */ InstructionCategory copy$default(InstructionCategory instructionCategory, String string2, List list, String string3, List list2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = instructionCategory.brickCategory;
        }
        if ((n4 = n3 & 2) != 0) {
            list = instructionCategory.brickNames;
        }
        if ((n4 = n3 & 4) != 0) {
            string3 = instructionCategory.imageUrl;
        }
        if ((n3 &= 8) != 0) {
            list2 = instructionCategory.colors;
        }
        return instructionCategory.copy(string2, list, string3, list2);
    }

    public final String component1() {
        return this.brickCategory;
    }

    public final List component2() {
        return this.brickNames;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final List component4() {
        return this.colors;
    }

    public final InstructionCategory copy(String string2, List list, String string3, List list2) {
        Intrinsics.checkNotNullParameter(string2, "brickCategory");
        Intrinsics.checkNotNullParameter(list, "brickNames");
        Intrinsics.checkNotNullParameter(string3, "imageUrl");
        Intrinsics.checkNotNullParameter(list2, "colors");
        InstructionCategory instructionCategory = new InstructionCategory(string2, list, string3, list2);
        return instructionCategory;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof InstructionCategory;
        if (!bl3) {
            return false;
        }
        object = (InstructionCategory)object;
        Object object2 = this.brickCategory;
        Object object3 = ((InstructionCategory)object).brickCategory;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brickNames;
        object3 = ((InstructionCategory)object).brickNames;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageUrl;
        object3 = ((InstructionCategory)object).imageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.colors;
        object = ((InstructionCategory)object).colors;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBrickCategory() {
        return this.brickCategory;
    }

    public final List getBrickNames() {
        return this.brickNames;
    }

    public final List getColors() {
        return this.colors;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        int n3 = this.brickCategory.hashCode();
        int n4 = 31;
        n3 *= 31;
        Object object = this.brickNames;
        n3 = ne_0.a(n3, n4, (List)object);
        object = this.imageUrl;
        n3 = zy_2.b(n3, n4, (String)object);
        return ((Object)this.colors).hashCode() + n3;
    }

    public String toString() {
        String string2 = this.brickCategory;
        List list = this.brickNames;
        String string3 = this.imageUrl;
        List list2 = this.colors;
        StringBuilder stringBuilder = new StringBuilder("InstructionCategory(brickCategory=");
        stringBuilder.append(string2);
        stringBuilder.append(", brickNames=");
        stringBuilder.append(list);
        stringBuilder.append(", imageUrl=");
        stringBuilder.append(string3);
        stringBuilder.append(", colors=");
        stringBuilder.append(list2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

