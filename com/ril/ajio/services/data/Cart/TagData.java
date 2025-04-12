/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class TagData
implements Serializable {
    private final String category;
    private final String name;
    private final String value;

    public TagData() {
        this(null, null, null, 7, null);
    }

    public TagData(String string2, String string3, String string4) {
        this.category = string2;
        this.name = string3;
        this.value = string4;
    }

    public /* synthetic */ TagData(String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            string4 = null;
        }
        this(string2, string3, string4);
    }

    public static /* synthetic */ TagData copy$default(TagData tagData, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = tagData.category;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = tagData.name;
        }
        if ((n3 &= 4) != 0) {
            string4 = tagData.value;
        }
        return tagData.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.category;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.value;
    }

    public final TagData copy(String string2, String string3, String string4) {
        TagData tagData = new TagData(string2, string3, string4);
        return tagData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof TagData;
        if (!bl3) {
            return false;
        }
        object = (TagData)object;
        String string2 = this.category;
        String string3 = ((TagData)object).category;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.name;
        string3 = ((TagData)object).name;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.value;
        object = ((TagData)object).value;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.category;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.name;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.value;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        String string2 = this.category;
        String string3 = this.name;
        String string4 = this.value;
        return h30_0.a(og_1.a("TagData(category=", string2, ", name=", string3, ", value="), string4, ")");
    }
}

