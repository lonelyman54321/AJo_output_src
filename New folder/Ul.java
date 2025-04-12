/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Ul {
    public static final Pair a;

    static {
        Pair pair;
        mz0_2 mz0_22 = mz0_2.a;
        a = pair = new Pair(mz0_22, mz0_22);
    }

    public static final void a(Sl sl, List list, b30_0 object, int n3) {
        object = object.g(-1794596951);
        int n4 = n3 & 6;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).J(sl) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n7 = n3 & 0x30;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).x(list) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        if ((n4 &= 0x13) == (n7 = 18) && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            n4 = list.size();
            n7 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                Object object2 = (Sl$b)list.get(i3);
                gx0_2 gx0_22 = (gx0_2)((Sl$b)object2).a;
                Object object3 = Ul$a.a;
                LP1 lP1 = LP1$a.b;
                int n8 = ((j30_0)object).P;
                Object object4 = ((j30_0)object).P();
                lP1 = a30_0.c((b30_0)object, lP1);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = ((j30_0)object).a;
                boolean bl2 = mp2 instanceof mp;
                if (bl2) {
                    ((j30_0)object).A();
                    bl2 = ((j30_0)object).O;
                    if (bl2) {
                        ((j30_0)object).C((Function0)((Object)serializable));
                    } else {
                        ((j30_0)object).n();
                    }
                    serializable = N20$a.e;
                    Ow3.a((b30_0)object, object3, (Function2)((Object)serializable));
                    object3 = N20$a.d;
                    Ow3.a((b30_0)object, object4, (Function2)object3);
                    object3 = N20$a.f;
                    boolean bl3 = ((j30_0)object).O;
                    if (bl3 || !(bl3 = Intrinsics.areEqual(object4 = ((j30_0)object).v(), serializable = Integer.valueOf(n8)))) {
                        rk_0.a(n8, (j30_0)object, n8, (N20$a$a)object3);
                    }
                    object3 = N20$a.c;
                    Ow3.a((b30_0)object, lP1, (Function2)object3);
                    int n10 = ((Sl$b)object2).b;
                    boolean bl4 = ((Sl$b)object2).c;
                    object2 = sl.d(n10, (int)(bl4 ? 1 : 0));
                    object3 = 0;
                    object2 = ((Sl)object2).a;
                    gx0_22.invoke(object2, object, object3);
                    bl4 = true;
                    ((j30_0)object).T(bl4);
                    continue;
                }
                s20.a();
                throw null;
            }
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ul$b_0 ul$b_0 = new ul$b_0(sl, list, n3);
            ((CF2)object).d = ul$b_0;
        }
    }
}

