/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HU0
 */
public final class hu0_0
extends LP1$c
implements yr3_0,
c01_0 {
    public static final HU0$a p;
    public boolean n;
    public zp1 o;

    static {
        HU0$a hU0$a;
        p = hU0$a = new Object();
    }

    public final void X(w32_0 object) {
        this.o = object;
        boolean bl2 = this.n;
        if (!bl2) {
            return;
        }
        object = ((w32_0)object).j1();
        boolean bl3 = ((LP1$c)object).m;
        if (bl3) {
            object = this.o;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                bl3 = object.e();
                if (bl3 && (object = this.r1()) != null) {
                    zp1 zp12 = this.o;
                    ((iu0_0)object).r1(zp12);
                }
            }
        } else {
            object = this.r1();
            if (object != null) {
                bl2 = false;
                Object var4_5 = null;
                ((iu0_0)object).r1(null);
            }
        }
    }

    public final boolean g1() {
        return false;
    }

    public final iu0_0 r1() {
        boolean bl2 = this.m;
        Object object = null;
        if (bl2) {
            Object object2 = iu0_0.p;
            boolean bl3 = (object2 = Zr3.a(this, object2)) instanceof iu0_0;
            if (bl3) {
                object = object2;
                object = (iu0_0)object2;
            }
        }
        return object;
    }

    public final Object v() {
        return p;
    }
}

