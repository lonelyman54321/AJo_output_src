/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JY0
 */
public final class jy0_0 {
    public final String a;
    public final boolean b;

    public jy0_0(String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        this.a = string2;
        this.b = bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof jy0_0;
        if (!bl3) {
            return false;
        }
        object = (jy0_0)object;
        String string2 = this.a;
        String string3 = ((jy0_0)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        bl3 = this.b;
        boolean bl4 = ((jy0_0)object).b;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n3 = string2.hashCode() * 31;
        int n4 = (int)(this.b ? 1 : 0);
        if (n4 != 0) {
            n4 = 1;
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GateKeeper(name=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", value=");
        boolean bl2 = this.b;
        return AR.a(stringBuilder, bl2, ')');
    }
}

