/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class Value
implements Serializable {
    private final String alt_text;
    private final String imageUrl;
    private final String text;

    public Value(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "alt_text");
        Intrinsics.checkNotNullParameter(string3, "imageUrl");
        Intrinsics.checkNotNullParameter(string4, "text");
        this.alt_text = string2;
        this.imageUrl = string3;
        this.text = string4;
    }

    public static /* synthetic */ Value copy$default(Value value, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = value.alt_text;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = value.imageUrl;
        }
        if ((n3 &= 4) != 0) {
            string4 = value.text;
        }
        return value.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.alt_text;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.text;
    }

    public final Value copy(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "alt_text");
        Intrinsics.checkNotNullParameter(string3, "imageUrl");
        Intrinsics.checkNotNullParameter(string4, "text");
        Value value = new Value(string2, string3, string4);
        return value;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Value;
        if (!bl3) {
            return false;
        }
        object = (Value)object;
        String string2 = this.alt_text;
        String string3 = ((Value)object).alt_text;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.imageUrl;
        string3 = ((Value)object).imageUrl;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.text;
        object = ((Value)object).text;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAlt_text() {
        return this.alt_text;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int n3 = this.alt_text.hashCode() * 31;
        String string2 = this.imageUrl;
        n3 = zy_2.b(n3, 31, string2);
        return this.text.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.alt_text;
        String string3 = this.imageUrl;
        String string4 = this.text;
        return h30_0.a(og_1.a("Value(alt_text=", string2, ", imageUrl=", string3, ", text="), string4, ")");
    }
}

