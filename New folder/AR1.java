/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class AR1 {
    public Ov1 a;
    public Ov1 b;
    public Ov1 c;

    public AR1() {
        Ov1$c ov1$c = Ov1$c.c;
        this.a = ov1$c;
        this.b = ov1$c;
        this.c = ov1$c;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Ov1 a(Rv1 object) {
        void var1_6;
        Intrinsics.checkNotNullParameter(object, "loadType");
        int[] nArray = AR1$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 == n4) {
            Ov1 ov1 = this.a;
            return var1_6;
        }
        n4 = 2;
        if (n3 == n4) {
            Ov1 ov1 = this.c;
            return var1_6;
        }
        n4 = 3;
        if (n3 == n4) {
            Ov1 ov1 = this.b;
            return var1_6;
        }
        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
        throw noWhenBranchMatchedException;
    }

    public final void b(Qv1 object) {
        Ov1 ov1;
        Intrinsics.checkNotNullParameter(object, "states");
        this.a = ov1 = ((Qv1)object).a;
        this.c = ov1 = ((Qv1)object).c;
        this.b = object = ((Qv1)object).b;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void c(Rv1 object, Ov1 ov1) {
        void var2_3;
        Intrinsics.checkNotNullParameter(object, "type");
        Intrinsics.checkNotNullParameter(var2_3, "state");
        int[] nArray = AR1$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 == n4) {
            this.a = var2_3;
            return;
        }
        n4 = 2;
        if (n3 == n4) {
            this.c = var2_3;
            return;
        }
        n4 = 3;
        if (n3 == n4) {
            this.b = var2_3;
            return;
        }
        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
        throw noWhenBranchMatchedException;
    }

    public final Qv1 d() {
        Ov1 ov1 = this.a;
        Ov1 ov12 = this.b;
        Ov1 ov13 = this.c;
        Qv1 qv1 = new Qv1(ov1, ov12, ov13);
        return qv1;
    }
}

