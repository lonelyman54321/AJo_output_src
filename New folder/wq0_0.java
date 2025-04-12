/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wQ0
 */
public final class wq0_0 {
    public String a = null;
    public String b = null;
    public String c = null;
    public String d = null;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public wq0_0() {
        this(0);
    }

    public wq0_0(int n3) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof wq0_0;
        if (!bl3) {
            return false;
        }
        object = (wq0_0)object;
        String string2 = this.a;
        String string3 = ((wq0_0)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.b;
        string3 = ((wq0_0)object).b;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.c;
        string3 = ((wq0_0)object).c;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.d;
        string3 = ((wq0_0)object).d;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.e;
        string3 = ((wq0_0)object).e;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.f;
        string3 = ((wq0_0)object).f;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.g;
        string3 = ((wq0_0)object).g;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.h;
        string3 = ((wq0_0)object).h;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.i;
        string3 = ((wq0_0)object).i;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.j;
        string3 = ((wq0_0)object).j;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.k;
        string3 = ((wq0_0)object).k;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.l;
        object = ((wq0_0)object).l;
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
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.g;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.h;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.i;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.j;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.k;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.l;
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
        charSequence = og_1.a("FleekImpressionData(itemId=", (String)charSequence, ", itemName=", string2, ", creativeName=");
        X50.a((StringBuilder)charSequence, string3, ", creativeSlot=", string4, ", storeType=");
        string2 = this.e;
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(", containsStore=");
        string2 = this.f;
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(", productId=");
        string2 = this.g;
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(", productName=");
        string2 = this.h;
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(", productBrandProductBrick=");
        string2 = this.i;
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(", itemList=");
        string2 = this.j;
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(", bannerId=");
        string2 = this.k;
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(", bannerName=");
        string2 = this.l;
        return h30_0.a((StringBuilder)charSequence, string2, ")");
    }
}

