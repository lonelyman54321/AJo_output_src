/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class qu3 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final float e;
    public String f;
    public String g;

    public qu3(String string2, String string3, boolean bl2, String string4, float f5) {
        Intrinsics.checkNotNullParameter(string4, "state");
        this.a = string2;
        this.b = string3;
        this.c = bl2;
        this.d = string4;
        this.e = f5;
        this.f = "";
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof qu3;
        if (!bl3) {
            return false;
        }
        object = (qu3)object;
        String string2 = this.a;
        String string3 = ((qu3)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string3 = this.b;
        string2 = ((qu3)object).b;
        bl3 = Intrinsics.areEqual(string3, string2);
        if (!bl3) {
            return false;
        }
        bl3 = this.c;
        boolean bl4 = ((qu3)object).c;
        if (bl3 != bl4) {
            return false;
        }
        string3 = this.d;
        string2 = ((qu3)object).d;
        bl3 = Intrinsics.areEqual(string3, string2);
        if (!bl3) {
            return false;
        }
        float f5 = this.e;
        float f6 = ((qu3)object).e;
        int n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        String string2 = null;
        String string3 = this.a;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        int n7 = 31;
        n3 *= 31;
        String string4 = this.b;
        if (string4 != null) {
            n4 = string4.hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.c ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        string2 = this.d;
        n4 = zy_2.b(n3, n7, string2);
        return Float.floatToIntBits(this.e) + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UTMParams(source=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", medium=");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", isSuccess=");
        boolean bl2 = this.c;
        stringBuilder.append(bl2);
        stringBuilder.append(", state=");
        string2 = this.d;
        stringBuilder.append(string2);
        stringBuilder.append(", requestTime=");
        float f5 = this.e;
        stringBuilder.append(f5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

