/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from la2
 */
public final class la2_0 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;

    public la2_0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.i;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof la2_0;
        if (!bl3) {
            return false;
        }
        object = (la2_0)object;
        String string2 = this.a;
        String string3 = ((la2_0)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.b;
        string3 = ((la2_0)object).b;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.c;
        string3 = ((la2_0)object).c;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.d;
        string3 = ((la2_0)object).d;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.e;
        string3 = ((la2_0)object).e;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.f;
        string3 = ((la2_0)object).f;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.g;
        string3 = ((la2_0)object).g;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.h;
        string3 = ((la2_0)object).h;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.i;
        object = ((la2_0)object).i;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.h;
    }

    public final String h() {
        return this.g;
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
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final String i() {
        return this.e;
    }

    public final String toString() {
        CharSequence charSequence = this.a;
        String string2 = this.b;
        String string3 = this.c;
        String string4 = this.d;
        String string5 = this.e;
        String string6 = this.f;
        String string7 = this.g;
        String string8 = this.h;
        String string9 = this.i;
        charSequence = og_1.a("OrderCommunicationPacketConfig(alertTitle=", charSequence, ", alertDescription=", string2, ", packageCodeTitle=");
        X50.a((StringBuilder)charSequence, string3, ", alertCtaText=", string4, ", popupTitle=");
        X50.a((StringBuilder)charSequence, string5, ", popupDescription=", string6, ", popupQuestionTitle=");
        X50.a((StringBuilder)charSequence, string7, ", popupQuestionDescription=", string8, ", popupCtaText=");
        return h30_0.a((StringBuilder)charSequence, string9, ")");
    }
}

