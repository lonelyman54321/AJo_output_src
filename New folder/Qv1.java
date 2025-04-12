/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class Qv1 {
    public static final Qv1 f;
    public final Ov1 a;
    public final Ov1 b;
    public final Ov1 c;
    public final boolean d;
    public final boolean e;

    static {
        Qv1 qv1;
        Ov1$c ov1$c = Ov1$c.c;
        f = qv1 = new Qv1(ov1$c, ov1$c, ov1$c);
    }

    public Qv1(Ov1 ov1, Ov1 ov12, Ov1 ov13) {
        Intrinsics.checkNotNullParameter(ov1, "refresh");
        Intrinsics.checkNotNullParameter(ov12, "prepend");
        String string2 = "append";
        Intrinsics.checkNotNullParameter(ov13, string2);
        this.a = ov1;
        this.b = ov12;
        this.c = ov13;
        boolean bl2 = ov1 instanceof Ov1.a;
        boolean bl3 = true;
        if (!(bl2 || (bl2 = ov13 instanceof Ov1.a) || (bl2 = ov12 instanceof Ov1.a))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        this.d = bl2;
        boolean bl4 = ov1 instanceof Ov1$c;
        if (!(bl4 && (bl4 = ov13 instanceof Ov1$c) && (bl4 = ov12 instanceof Ov1$c))) {
            bl3 = false;
        }
        this.e = bl3;
    }

    public static Qv1 a(Qv1 qv1, Ov1 ov1, Ov1 ov12, Ov1 ov13, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            ov1 = qv1.a;
        }
        if ((n4 = n3 & 2) != 0) {
            ov12 = qv1.b;
        }
        if ((n3 &= 4) != 0) {
            ov13 = qv1.c;
        }
        qv1.getClass();
        Intrinsics.checkNotNullParameter(ov1, "refresh");
        Intrinsics.checkNotNullParameter(ov12, "prepend");
        Intrinsics.checkNotNullParameter(ov13, "append");
        qv1 = new Qv1(ov1, ov12, ov13);
        return qv1;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Qv1 b(Rv1 object) {
        void var1_6;
        Ov1$c ov1$c = Ov1$c.c;
        Intrinsics.checkNotNullParameter(object, "loadType");
        Intrinsics.checkNotNullParameter(ov1$c, "newState");
        int[] nArray = Qv1$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        int n7 = 3;
        if (n3 == n4) {
            Qv1 qv1 = Qv1.a(this, null, null, ov1$c, n7);
            return var1_6;
        }
        n4 = 2;
        if (n3 == n4) {
            n3 = 5;
            Qv1 qv1 = Qv1.a(this, null, ov1$c, null, n3);
            return var1_6;
        }
        if (n3 == n7) {
            n3 = 6;
            Qv1 qv1 = Qv1.a(this, ov1$c, null, null, n3);
            return var1_6;
        }
        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
        throw noWhenBranchMatchedException;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Qv1;
        if (!bl3) {
            return false;
        }
        object = (Qv1)object;
        Ov1 ov1 = this.a;
        Ov1 ov12 = ((Qv1)object).a;
        bl3 = Intrinsics.areEqual(ov1, ov12);
        if (!bl3) {
            return false;
        }
        ov12 = this.b;
        ov1 = ((Qv1)object).b;
        bl3 = Intrinsics.areEqual(ov12, ov1);
        if (!bl3) {
            return false;
        }
        ov12 = this.c;
        object = ((Qv1)object).c;
        boolean bl4 = Intrinsics.areEqual(ov12, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = (this.b.hashCode() + n3) * 31;
        return this.c.hashCode() + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LoadStates(refresh=");
        Ov1 ov1 = this.a;
        stringBuilder.append(ov1);
        stringBuilder.append(", prepend=");
        ov1 = this.b;
        stringBuilder.append(ov1);
        stringBuilder.append(", append=");
        ov1 = this.c;
        stringBuilder.append(ov1);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

