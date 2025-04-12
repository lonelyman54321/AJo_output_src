/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sh3
 */
public final class sh3_0 {
    public final String a;
    public final int b;
    public final int c;

    public sh3_0(String string2, int n3, int n4) {
        Intrinsics.checkNotNullParameter(string2, "workSpecId");
        this.a = string2;
        this.b = n3;
        this.c = n4;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof sh3_0;
        if (n3 == 0) {
            return false;
        }
        object = (sh3_0)object;
        String string2 = this.a;
        String string3 = ((sh3_0)object).a;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((sh3_0)object).b;
        if (n3 != n4) {
            return false;
        }
        n3 = this.c;
        int n7 = ((sh3_0)object).c;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SystemIdInfo(workSpecId=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", generation=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", systemId=");
        n3 = this.c;
        return tu.a(stringBuilder, n3, ')');
    }
}

