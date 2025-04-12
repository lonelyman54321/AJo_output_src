/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from he
 */
public final class he_1 {
    public String a;
    public String b;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof he_1;
        if (!bl3) {
            return false;
        }
        object = (he_1)object;
        String string2 = this.a;
        String string3 = ((he_1)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string3 = this.b;
        object = ((he_1)object).b;
        boolean bl4 = Intrinsics.areEqual(string3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        String string2 = this.a;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.b;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AlternateData(inactiveImageUrl=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", name=");
        string2 = this.b;
        return h30_0.a(stringBuilder, string2, ")");
    }
}

