/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from ry0
 */
public final class ry0_0 {
    public static final Qs3 a;
    public static final Qs3 b;
    public static final Qs3 c;

    static {
        Qs3 qs3;
        ne0_1 ne0_12 = ex0_0.a;
        int n3 = 120;
        int n4 = 2;
        a = qs3 = new Qs3(n3, ne0_12, n4);
        float f5 = 0.4f;
        float f6 = 0.6f;
        ne0_12 = new ne0_1(f5, 0.0f, f6);
        b = qs3 = new Qs3(150, ne0_12, n4);
        ne0_12 = new ne0_1(f5, 0.0f, f6);
        c = qs3 = new Qs3(n3, ne0_12, n4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final Object a(Lj object, float f5, kj1 object2, kj1 kj12, f80_0 f80_02) {
        j90_0 j90_02;
        Object object3;
        Qs3 qs3;
        block7: {
            block8: {
                block9: {
                    block6: {
                        qs3 = null;
                        if (kj12 == null) break block6;
                        boolean bl2 = kj12 instanceof Ey2$b;
                        object3 = a;
                        if (!bl2 && !(bl2 = kj12 instanceof us0_0) && !(bl2 = kj12 instanceof x91) && !(bl2 = kj12 instanceof rt0_0)) break block7;
                        break block8;
                    }
                    if (object2 == null) break block7;
                    boolean bl3 = object2 instanceof Ey2$b;
                    object3 = b;
                    if (bl3 || (bl3 = object2 instanceof us0_0)) break block8;
                    bl3 = object2 instanceof x91;
                    if (!bl3) break block9;
                    qs3 = c;
                    break block7;
                }
                boolean bl4 = object2 instanceof rt0_0;
                if (!bl4) break block7;
            }
            qs3 = object3;
        }
        if (qs3 != null) {
            j90_0 j90_03;
            xs0_0 xs0_02 = new xs0_0(f5);
            int n3 = 12;
            object3 = object;
            if ((object = Lj.c((Lj)object, xs0_02, qs3, null, f80_02, n3)) == (j90_03 = j90_0.COROUTINE_SUSPENDED)) {
                return object;
            }
            return Unit.a;
        }
        object2 = new xs0_0(f5);
        if ((object = ((Lj)object).e(f80_02, object2)) == (j90_02 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

