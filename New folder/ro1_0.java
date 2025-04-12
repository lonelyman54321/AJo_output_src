/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ro1
 */
public final class ro1_0 {
    public final String a;
    public final String b;

    public ro1_0(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "value");
        this.a = string2;
        this.b = string3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ro1_0;
        if (!bl3) {
            return false;
        }
        object = (ro1_0)object;
        String string2 = this.a;
        String string3 = ((ro1_0)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string3 = this.b;
        object = ((ro1_0)object).b;
        boolean bl4 = Intrinsics.areEqual(string3, object);
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
        StringBuilder stringBuilder = new StringBuilder("KeyValueData(key=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", value=");
        string2 = this.b;
        return h30_0.a(stringBuilder, string2, ")");
    }
}

