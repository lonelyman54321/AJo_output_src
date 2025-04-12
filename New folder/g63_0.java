/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from G63
 */
public final class g63_0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public g63_0(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string3, "attributeName");
        Intrinsics.checkNotNullParameter(string4, "attributeValue");
        Intrinsics.checkNotNullParameter(string5, "convertedAttributeValue");
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof g63_0;
        if (!bl3) {
            return false;
        }
        object = (g63_0)object;
        String string2 = this.a;
        String string3 = ((g63_0)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string3 = this.b;
        string2 = ((g63_0)object).b;
        bl3 = Intrinsics.areEqual(string3, string2);
        if (!bl3) {
            return false;
        }
        string3 = this.c;
        string2 = ((g63_0)object).c;
        bl3 = Intrinsics.areEqual(string3, string2);
        if (!bl3) {
            return false;
        }
        string3 = this.d;
        object = ((g63_0)object).d;
        boolean bl4 = Intrinsics.areEqual(string3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        int n4 = 31;
        n3 *= 31;
        String string3 = this.b;
        n3 = zy_2.b(n3, n4, string3);
        string3 = this.c;
        n3 = zy_2.b(n3, n4, string3);
        return this.d.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SizeInstructionModel(colorCode=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", attributeName=");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", attributeValue=");
        string2 = this.c;
        stringBuilder.append(string2);
        stringBuilder.append(", convertedAttributeValue=");
        string2 = this.d;
        return h30_0.a(stringBuilder, string2, ")");
    }
}

