/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class VH2 {
    public String a = null;
    public String b = null;
    public String c = null;
    public String d = null;
    public String e = null;
    public String f = null;

    public VH2() {
        this(0);
    }

    public VH2(int n3) {
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof VH2;
        if (!bl3) {
            return false;
        }
        object = (VH2)object;
        String string2 = this.a;
        String string3 = ((VH2)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.b;
        string3 = ((VH2)object).b;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.c;
        string3 = ((VH2)object).c;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.d;
        string3 = ((VH2)object).d;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.e;
        string3 = ((VH2)object).e;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.f;
        object = ((VH2)object).f;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        String string2 = this.a;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.b;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.c;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.d;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.e;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.f;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        CharSequence charSequence = this.a;
        String string2 = this.b;
        String string3 = this.c;
        String string4 = this.d;
        String string5 = this.e;
        String string6 = this.f;
        charSequence = og_1.a("RefundOrderDetails(imageURL=", charSequence, ", price=", string2, ", brand=");
        X50.a((StringBuilder)charSequence, string3, ", productInfo=", string4, ", productID=");
        return ko_0.a((StringBuilder)charSequence, string5, ", sizeInfo=", string6, ")");
    }
}

