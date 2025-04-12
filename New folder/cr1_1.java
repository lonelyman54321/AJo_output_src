/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Cr1
 */
public final class cr1_1
implements sp1_0,
zx {
    public static final Cr1$a g;
    public final Er1 b;
    public final Br1 c;
    public final boolean d;
    public final bp1_0 e;
    public final pg2_0 f;

    static {
        Cr1$a cr1$a;
        g = cr1$a = new Object();
    }

    public cr1_1(Er1 er1, Br1 br1, boolean bl2, bp1_0 bp1_02, pg2_0 pg2_02) {
        this.b = er1;
        this.c = br1;
        this.d = bl2;
        this.e = bp1_02;
        this.f = pg2_02;
    }

    public final /* synthetic */ boolean all(Function1 function1) {
        return mp1_1.a(this, function1);
    }

    public final /* synthetic */ boolean any(Function1 function1) {
        return mp1_1.c(this, function1);
    }

    public final Object b(int n3, Function1 function1) {
        Er1 er1 = this.b;
        int n4 = er1.getItemCount();
        if (n4 > 0 && (n4 = (int)(er1.b() ? 1 : 0)) != 0) {
            int n7;
            n4 = (int)(this.p(n3) ? 1 : 0);
            n4 = n4 != 0 ? er1.d() : er1.c();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Object object = this.c;
            object.getClass();
            Br1$a br1$a = new Br1$a(n4, n4);
            WR1 wR1 = ((Br1)object).a;
            wR1.b(br1$a);
            ref$ObjectRef.element = br1$a;
            int n8 = 0;
            object = null;
            while (object == null && (n7 = this.j(br1$a = (Br1$a)ref$ObjectRef.element, n3)) != 0) {
                object = (Br1$a)ref$ObjectRef.element;
                n7 = ((Br1$a)object).a;
                boolean bl2 = this.p(n3);
                n8 = ((Br1$a)object).b;
                if (bl2) {
                    ++n8;
                } else {
                    n7 += -1;
                }
                Br1$a br1$a2 = new Br1$a(n7, n8);
                wR1.b(br1$a2);
                object = (Br1$a)ref$ObjectRef.element;
                wR1.m(object);
                ref$ObjectRef.element = br1$a2;
                er1.a();
                object = new Cr1$c(this, ref$ObjectRef, n3);
                object = function1.invoke(object);
            }
            Br1$a br1$a3 = (Br1$a)ref$ObjectRef.element;
            wR1.m(br1$a3);
            er1.a();
            return object;
        }
        Cr1$a cr1$a = g;
        return function1.invoke(cr1$a);
    }

    public final Object foldIn(Object object, Function2 function2) {
        return function2.invoke(object, this);
    }

    public final LB2 getKey() {
        return Ax.a;
    }

    public final Object getValue() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean j(Br1$a object, int n3) {
        pg2_0 pg2_02;
        boolean bl2 = zx$b.a(n3, 5);
        int n4 = 1;
        bl2 = bl2 ? true : zx$b.a(n3, 6);
        pg2_0 pg2_03 = this.f;
        if (bl2) {
            pg2_02 = pg2_0.Horizontal;
            if (pg2_03 == pg2_02) {
                return false;
            }
        } else {
            bl2 = zx$b.a(n3, 3);
            bl2 = bl2 ? true : zx$b.a(n3, 4);
            if (bl2) {
                pg2_02 = pg2_0.Vertical;
                if (pg2_03 == pg2_02) {
                    return false;
                }
            } else {
                bl2 = zx$b.a(n3, n4);
                bl2 = bl2 ? true : zx$b.a(n3, 2);
                if (!bl2) {
                    String string2 = "Lazy list does not support beyond bounds layout for the specified direction".toString();
                    object = new IllegalStateException(string2);
                    throw object;
                }
            }
        }
        bl2 = false;
        pg2_02 = null;
        if (bl2) {
            return false;
        }
        if ((n3 = (int)(this.p(n3) ? 1 : 0)) != 0) {
            int n7 = ((Br1$a)object).b;
            Er1 er1 = this.b;
            n3 = er1.getItemCount() - n4;
            if (n7 >= n3) return 0 != 0;
            return n4 != 0;
        }
        int n8 = ((Br1$a)object).a;
        if (n8 > 0) return n4 != 0;
        return 0 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean p(int n3) {
        int n4 = 1;
        int n7 = zx$b.a(n3, n4);
        if (n7 != 0) return 0 != 0;
        n7 = 2;
        int n8 = zx$b.a(n3, n7);
        if (n8 != 0) {
            return n4 != 0;
        }
        n8 = zx$b.a(n3, 5);
        int n10 = this.d;
        if (n8 != 0) return n10 != 0;
        n8 = zx$b.a(n3, 6);
        if (n8 != 0) {
            if (n10 != 0) return 0 != 0;
            return n4 != 0;
        }
        n8 = zx$b.a(n3, 3);
        bp1_0 bp1_02 = this.e;
        if (n8 != 0) {
            int[] nArray = Cr1$b.$EnumSwitchMapping$0;
            n8 = bp1_02.ordinal();
            n3 = nArray[n8];
            if (n3 == n4) return n10 != 0;
            if (n3 != n7) {
                NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                throw noWhenBranchMatchedException;
            }
            if (n10 != 0) return 0 != 0;
            return n4 != 0;
        }
        n8 = 4;
        if ((n3 = (int)(zx$b.a(n3, n8) ? 1 : 0)) == 0) {
            String string2 = "Lazy list does not support beyond bounds layout for the specified direction".toString();
            IllegalStateException illegalStateException = new IllegalStateException(string2);
            throw illegalStateException;
        }
        int[] nArray = Cr1$b.$EnumSwitchMapping$0;
        n8 = bp1_02.ordinal();
        n3 = nArray[n8];
        if (n3 != n4) {
            if (n3 == n7) return n10 != 0;
            NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            throw noWhenBranchMatchedException;
        }
        if (n10 == 0) return n4 != 0;
        return 0 != 0;
    }

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }
}

