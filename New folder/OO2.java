/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class OO2 {
    public final String a;
    public final Boolean b;

    public OO2() {
        Boolean bl2 = Boolean.FALSE;
        this("", bl2);
    }

    public OO2(String string2, Boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "ratingValue");
        this.a = string2;
        this.b = bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof OO2;
        if (!bl3) {
            return false;
        }
        object = (OO2)object;
        String string2 = this.a;
        Object object2 = ((OO2)object).a;
        bl3 = Intrinsics.areEqual(string2, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((OO2)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        int n4 = string2.hashCode() * 31;
        Boolean bl2 = this.b;
        if (bl2 == null) {
            n3 = 0;
            bl2 = null;
        } else {
            n3 = ((Object)bl2).hashCode();
        }
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ReviewSortFilterModel(ratingValue=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", isSelected=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

