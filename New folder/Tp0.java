/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Tp0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public Tp0(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "title");
        Intrinsics.checkNotNullParameter(string3, "message");
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
        boolean bl3 = object instanceof Tp0;
        if (!bl3) {
            return false;
        }
        object = (Tp0)object;
        String string2 = this.a;
        String string3 = ((Tp0)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string3 = this.b;
        string2 = ((Tp0)object).b;
        bl3 = Intrinsics.areEqual(string3, string2);
        if (!bl3) {
            return false;
        }
        string3 = this.c;
        string2 = ((Tp0)object).c;
        bl3 = Intrinsics.areEqual(string3, string2);
        if (!bl3) {
            return false;
        }
        string3 = this.d;
        object = ((Tp0)object).d;
        boolean bl4 = Intrinsics.areEqual(string3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        int n4 = string2.hashCode();
        int n7 = 31;
        n4 *= 31;
        String string3 = this.b;
        n4 = zy_2.b(n4, n7, string3);
        int n8 = 0;
        string3 = null;
        String string4 = this.c;
        if (string4 == null) {
            n3 = 0;
            string4 = null;
        } else {
            n3 = string4.hashCode();
        }
        n4 = (n4 + n3) * 31;
        String string5 = this.d;
        if (string5 != null) {
            n8 = string5.hashCode();
        }
        return n4 + n8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DialogData(title=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", message=");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", positiveButtonText=");
        string2 = this.c;
        stringBuilder.append((Object)string2);
        stringBuilder.append(", negativeButtonText=");
        string2 = this.d;
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

