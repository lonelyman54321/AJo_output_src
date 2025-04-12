/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Renamed from BZ
 */
public final class bz_0
implements mx0 {
    public final Sl a;
    public final int b;

    public bz_0(Sl sl, int n3) {
        this.a = sl;
        this.b = n3;
    }

    public bz_0(String string2, int n3) {
        Sl sl = new Sl(6, string2, null);
        this(sl, n3);
    }

    public final void a(Xx0 xx0) {
        int n3 = xx0.d;
        int n4 = 1;
        int n7 = -1;
        int n8 = n3 != n7 ? 1 : 0;
        Sl sl = this.a;
        if (n8 != 0) {
            n8 = xx0.e;
            String string2 = sl.a;
            xx0.d(n3, n8, string2);
        } else {
            n3 = xx0.b;
            n8 = xx0.c;
            String string3 = sl.a;
            xx0.d(n3, n8, string3);
        }
        n3 = xx0.b;
        n8 = xx0.c;
        if (n3 == n8) {
            n7 = n8;
        }
        if ((n3 = this.b) > 0) {
            n7 = n7 + n3 - n4;
        } else {
            n7 += n3;
            String string4 = sl.a;
            n3 = string4.length();
            n7 -= n3;
        }
        n3 = xx0.a.a();
        n3 = f.g(n7, 0, n3);
        xx0.f(n3, n3);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof bz_0;
        if (n3 == 0) {
            return false;
        }
        String string2 = this.a.a;
        object = (bz_0)object;
        String string3 = ((bz_0)object).a.a;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((bz_0)object).b;
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
        StringBuilder stringBuilder = new StringBuilder("CommitTextCommand(text='");
        String string2 = this.a.a;
        stringBuilder.append(string2);
        stringBuilder.append("', newCursorPosition=");
        int n3 = this.b;
        return tu.a(stringBuilder, n3, ')');
    }
}

