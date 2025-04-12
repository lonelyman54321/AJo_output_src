/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class tf3 {
    public static final tf3$a a;

    static {
        tf3$a tf3$a;
        a = tf3$a = new Object();
    }

    public static final void a(LP1 lP1, Function2 function2, b30_0 object, int n3, int n4) {
        Object object2;
        int n7;
        int n8;
        object = object.g(-1298353104);
        int n10 = n4 & 1;
        if (n10 != 0) {
            n8 = n3 | 6;
        } else {
            n8 = n3 & 6;
            if (n8 == 0) {
                n8 = (int)(((j30_0)object).J(lP1) ? 1 : 0);
                n8 = n8 != 0 ? 4 : 2;
                n8 |= n3;
            } else {
                n8 = n3;
            }
        }
        int n14 = n3 & 0x30;
        if (n14 == 0) {
            n14 = (int)(((j30_0)object).x(function2) ? 1 : 0);
            n14 = n14 != 0 ? 32 : 16;
            n8 |= n14;
        }
        if ((n14 = n8 & 0x13) == (n7 = 18) && (n14 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            b30$a$a b30$a$a;
            if (n10 != 0) {
                lP1 = LP1$a.b;
            }
            if ((object2 = ((j30_0)object).v()) == (b30$a$a = b30$a.a)) {
                object2 = new wf3();
                ((j30_0)object).o(object2);
            }
            object2 = (wf3)object2;
            n8 = n8 << 3 & 0x3F0;
            tf3.b((wf3)object2, lP1, function2, (b30_0)object, n8);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new tf3$b(lP1, function2, n3, n4);
        }
    }

    public static final void b(wf3 wf32, LP1 lP1, Function2 function2, b30_0 object, int n3) {
        block16: {
            vf3_2 vf3_22;
            block15: {
                int n4;
                block14: {
                    vf3_22 = null;
                    object = object.g(-511989831);
                    n4 = n3 & 6;
                    if (n4 == 0) {
                        n4 = (int)(((j30_0)object).x(wf32) ? 1 : 0);
                        n4 = n4 != 0 ? 4 : 2;
                        n4 |= n3;
                    } else {
                        n4 = n3;
                    }
                    int n7 = n3 & 0x30;
                    if (n7 == 0) {
                        n7 = (int)(((j30_0)object).J(lP1) ? 1 : 0);
                        n7 = n7 != 0 ? 32 : 16;
                        n4 |= n7;
                    }
                    if ((n7 = n3 & 0x180) == 0) {
                        n7 = (int)(((j30_0)object).x(function2) ? 1 : 0);
                        n7 = n7 != 0 ? 256 : 128;
                        n4 |= n7;
                    }
                    if ((n4 &= 0x93) != (n7 = 146) || (n4 = (int)(((j30_0)object).h() ? 1 : 0)) == 0) break block14;
                    ((j30_0)object).D();
                    break block15;
                }
                n4 = ((j30_0)object).P;
                Object object2 = ((j30_0)object).G();
                Object object3 = a30_0.c((b30_0)object, lP1);
                Object object4 = ((j30_0)object).P();
                Lambda lambda = xp1_0.K;
                mp mp2 = ((j30_0)object).a;
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block16;
                ((j30_0)object).A();
                bl2 = ((j30_0)object).O;
                if (bl2) {
                    ((j30_0)object).C((Function0)((Object)lambda));
                } else {
                    ((j30_0)object).n();
                }
                lambda = wf32.c;
                Ow3.a((b30_0)object, wf32, (Function2)((Object)lambda));
                lambda = wf32.d;
                Ow3.a((b30_0)object, object2, (Function2)((Object)lambda));
                object2 = wf32.e;
                Ow3.a((b30_0)object, function2, (Function2)object2);
                N20.W.getClass();
                object2 = N20$a.d;
                Ow3.a((b30_0)object, object4, (Function2)object2);
                object2 = N20$a.c;
                Ow3.a((b30_0)object, object3, (Function2)object2);
                object2 = N20$a.f;
                boolean bl3 = ((j30_0)object).O;
                if (bl3 || !(bl3 = Intrinsics.areEqual(object3 = ((j30_0)object).v(), object4 = Integer.valueOf(n4)))) {
                    rk_0.a(n4, (j30_0)object, n4, (N20$a$a)object2);
                }
                ((j30_0)object).T(true);
                n4 = (int)(((j30_0)object).h() ? 1 : 0);
                if (n4 == 0) {
                    Object object5;
                    ((j30_0)object).K(-26580342);
                    n4 = (int)(((j30_0)object).x(wf32) ? 1 : 0);
                    object2 = ((j30_0)object).v();
                    if (n4 != 0 || object2 == (object5 = b30$a.a)) {
                        object2 = new uf3_2(wf32, 0);
                        ((j30_0)object).o(object2);
                    }
                    object2 = (Function0)object2;
                    object5 = ly0_0.a;
                    ((j30_0)object).q((Function0)object2);
                    ((j30_0)object).T(false);
                } else {
                    n4 = -26502501;
                    ((j30_0)object).K(n4);
                    ((j30_0)object).T(false);
                }
            }
            object = ((j30_0)object).X();
            if (object != null) {
                vf3_22 = new vf3_2(wf32, lP1, function2, n3);
                ((CF2)object).d = vf3_22;
            }
            return;
        }
        s20.a();
        throw null;
    }
}

