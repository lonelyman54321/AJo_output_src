/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class mZ0 {
    public final String a;
    public final boolean b;

    public mZ0() {
        this("", false);
    }

    public mZ0(String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "adsSdkName");
        this.a = string2;
        this.b = bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof mZ0;
        if (!bl4) {
            return false;
        }
        object = (mZ0)object;
        String string2 = this.a;
        String string3 = ((mZ0)object).a;
        bl4 = Intrinsics.areEqual(string2, string3);
        if (!bl4 || (bl4 = this.b) != (bl2 = ((mZ0)object).b)) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n3 = string2.hashCode() * 31;
        int n4 = this.b;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GetTopicsRequest: adsSdkName=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", shouldRecordObservation=");
        boolean bl2 = this.b;
        stringBuilder.append(bl2);
        return stringBuilder.toString();
    }
}

