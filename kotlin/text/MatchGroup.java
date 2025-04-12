/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

public final class MatchGroup {
    public final String a;
    public final IntRange b;

    public MatchGroup(String string2, IntRange intRange) {
        Intrinsics.checkNotNullParameter(string2, "value");
        Intrinsics.checkNotNullParameter(intRange, "range");
        this.a = string2;
        this.b = intRange;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof MatchGroup;
        if (!bl3) {
            return false;
        }
        object = (MatchGroup)object;
        String string2 = this.a;
        Object object2 = ((MatchGroup)object).a;
        bl3 = Intrinsics.areEqual(string2, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((MatchGroup)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MatchGroup(value=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", range=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

