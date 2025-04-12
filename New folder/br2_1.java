/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.Scheduler;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.Functions$b;
import java.lang.reflect.Type;

/*
 * Renamed from bR2
 */
public final class br2_1
implements kj_2 {
    public final Type a;
    public final Scheduler b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public br2_1(Type type2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        this.a = type2;
        this.b = null;
        this.c = false;
        this.d = bl2;
        this.e = bl3;
        this.f = bl4;
        this.g = bl5;
        this.h = bl6;
        this.i = bl7;
    }

    public final Type a() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object b(v72_0 object) {
        int n3;
        Object object2;
        block14: {
            block13: {
                block12: {
                    boolean bl2 = this.c;
                    object2 = bl2 ? new lj_2((v72_0)object) : new mj_2((v72_0)object);
                    n3 = this.d;
                    if (n3 == 0) break block12;
                    object = new wl2_2((t62_0)object2);
                    break block13;
                }
                n3 = this.e;
                if (n3 == 0) break block14;
                object = new vy_2((t62_0)object2);
            }
            object2 = object;
        }
        if ((object = this.b) != null) {
            object2 = ((t62_0)object2).g((Scheduler)object);
        }
        if ((n3 = this.f) != 0) {
            object = cu_2.MISSING;
            object2 = new yt0_2();
            int[] nArray = t62$a.a;
            n3 = ((Enum)object).ordinal();
            int n4 = 1;
            if ((n3 = nArray[n3]) != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 == n4) return object2;
                    n4 = 4;
                    if (n3 != n4) {
                        n3 = yt0_2.a;
                        x03_0.c(n3, "capacity");
                        Functions$b functions$b = Functions.b;
                        object = new n0_0((zt0_2)object2);
                        return object;
                    } else {
                        object = new n0_0((zt0_2)object2);
                    }
                    return object;
                }
                object = new n0_0((zt0_2)object2);
                return object;
            }
            object = new n0_0((zt0_2)object2);
            return object;
        }
        n3 = this.g;
        if (n3 != 0) {
            return new c62_0((t62_0)object2);
        }
        n3 = this.h;
        if (n3 != 0) {
            return new uk1_1();
        }
        n3 = (int)(this.i ? 1 : 0);
        if (n3 == 0) return object2;
        return new w62_0((t62_0)object2);
    }
}

