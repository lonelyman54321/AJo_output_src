/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JA2
 */
public final class ja2_2 {
    public String a = null;
    public boolean b = false;
    public String c = null;

    public ja2_2() {
        this(0);
    }

    public ja2_2(int n3) {
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ja2_2;
        if (!bl3) {
            return false;
        }
        object = (ja2_2)object;
        String string2 = this.a;
        String string3 = ((ja2_2)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        bl3 = this.b;
        boolean bl4 = ((ja2_2)object).b;
        if (bl3 != bl4) {
            return false;
        }
        string2 = this.c;
        object = ((ja2_2)object).c;
        boolean bl5 = Intrinsics.areEqual(string2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        int n7 = this.b;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        String string3 = this.c;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        String string2 = this.a;
        boolean bl2 = this.b;
        String string3 = this.c;
        StringBuilder stringBuilder = new StringBuilder("ProductS1S2Data(extraTitleInfo=");
        stringBuilder.append(string2);
        stringBuilder.append(", hideSizeUI=");
        stringBuilder.append(bl2);
        stringBuilder.append(", s2TitleText=");
        return h30_0.a(stringBuilder, string3, ")");
    }
}

