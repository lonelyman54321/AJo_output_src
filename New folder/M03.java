/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class M03
implements mx0 {
    public final Sl a;
    public final int b;

    public M03(String string2, int n3) {
        Sl sl = new Sl(6, string2, null);
        this.a = sl;
        this.b = n3;
    }

    public final void a(Xx0 xx0) {
        String string2;
        int n3;
        int n4 = xx0.d;
        int n7 = 1;
        int n8 = -1;
        if (n4 != n8) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        Sl sl = this.a;
        if (n3 != 0) {
            n3 = xx0.e;
            String string3 = sl.a;
            xx0.d(n4, n3, string3);
            string2 = sl.a;
            int n10 = string2.length();
            if (n10 > 0) {
                n3 = string2.length() + n4;
                xx0.e(n4, n3);
            }
        } else {
            n4 = xx0.b;
            n3 = xx0.c;
            String string4 = sl.a;
            xx0.d(n4, n3, string4);
            string2 = sl.a;
            int n14 = string2.length();
            if (n14 > 0) {
                n3 = string2.length() + n4;
                xx0.e(n4, n3);
            }
        }
        if ((n4 = xx0.b) == (n3 = xx0.c)) {
            n8 = n3;
        }
        if ((n4 = this.b) > 0) {
            n8 = n8 + n4 - n7;
        } else {
            n8 += n4;
            String string5 = sl.a;
            n4 = string5.length();
            n8 -= n4;
        }
        n4 = xx0.a.a();
        n4 = f.g(n8, 0, n4);
        xx0.f(n4, n4);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof M03;
        if (n3 == 0) {
            return false;
        }
        String string2 = this.a.a;
        object = (M03)object;
        String string3 = ((M03)object).a.a;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((M03)object).b;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.a.hashCode() * 31;
        int n4 = this.b;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SetComposingTextCommand(text='");
        String string2 = this.a.a;
        stringBuilder.append(string2);
        stringBuilder.append("', newCursorPosition=");
        int n3 = this.b;
        return tu.a(stringBuilder, n3, ')');
    }
}

