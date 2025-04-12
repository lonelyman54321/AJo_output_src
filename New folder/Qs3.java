/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Qs3
implements xw0_1 {
    public final int a;
    public final int b;
    public final cx0_0 c;

    public Qs3() {
        this(0, null, 7);
    }

    public Qs3(int n3, int n4, cx0_0 cx0_02) {
        this.a = n3;
        this.b = n4;
        this.c = cx0_02;
    }

    public Qs3(int n3, cx0_0 cx0_02, int n4) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = 300;
        }
        if ((n4 &= 4) != 0) {
            cx0_02 = ex0_0.a;
        }
        this(n3, 0, cx0_02);
    }

    public final NA3 a() {
        Object object = ya3_0.a;
        int n3 = this.a;
        int n4 = this.b;
        cx0_0 cx0_02 = this.c;
        object = new va3_2(n3, n4, cx0_02);
        return object;
    }

    public final JA3 b(Vs3 object) {
        int n3 = this.a;
        int n4 = this.b;
        cx0_0 cx0_02 = this.c;
        object = new va3_2(n3, n4, cx0_02);
        return object;
    }

    public final ma3_0 b(Vs3 object) {
        int n3 = this.a;
        int n4 = this.b;
        cx0_0 cx0_02 = this.c;
        object = new va3_2(n3, n4, cx0_02);
        return object;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof Qs3;
        boolean bl2 = false;
        if (n3 != 0) {
            cx0_0 cx0_02;
            boolean bl3;
            object = (Qs3)object;
            n3 = ((Qs3)object).a;
            int n4 = this.a;
            if (n3 == n4 && (n3 = ((Qs3)object).b) == (n4 = this.b) && (bl3 = Intrinsics.areEqual(object = ((Qs3)object).c, cx0_02 = this.c))) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = (this.c.hashCode() + n3) * 31;
        n3 = this.b;
        return n4 + n3;
    }
}

