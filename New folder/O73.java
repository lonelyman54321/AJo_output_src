/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class O73 {
    public static final void a(D73 object, LP1 object2, gx0_2 gx0_22, b30_0 object3, int n3) {
        block21: {
            block22: {
                Object object4;
                block20: {
                    Object object5;
                    Object object6;
                    int n4;
                    Object object7;
                    Object object8;
                    int n7;
                    Object object9;
                    int n8;
                    Object object10;
                    int n10;
                    int n14;
                    block19: {
                        object3 = object3.g(2036134589);
                        n14 = n3 & 6;
                        if (n14 == 0) {
                            n14 = n3 & 8;
                            n14 = n14 == 0 ? (int)(((j30_0)object3).J(object) ? 1 : 0) : (int)(((j30_0)object3).x(object) ? 1 : 0);
                            n14 = n14 != 0 ? 4 : 2;
                            n14 |= n3;
                        } else {
                            n14 = n3;
                        }
                        n10 = n3 & 0x30;
                        if (n10 == 0) {
                            n10 = ((j30_0)object3).J(object2) ? 1 : 0;
                            n10 = n10 != 0 ? 32 : 16;
                            n14 |= n10;
                        }
                        if ((n10 = n3 & 0x180) == 0) {
                            n10 = ((j30_0)object3).x(gx0_22) ? 1 : 0;
                            n10 = n10 != 0 ? 256 : 128;
                            n14 |= n10;
                        }
                        if ((n14 &= 0x93) != (n10 = 146) || (n14 = (int)(((j30_0)object3).h() ? 1 : 0)) == 0) break block19;
                        ((j30_0)object3).D();
                        break block20;
                    }
                    object4 = ((j30_0)object3).v();
                    if (object4 == (object10 = b30$a.a)) {
                        object4 = new QI0();
                        ((j30_0)object3).o(object4);
                    }
                    object4 = (QI0)object4;
                    object10 = ((QI0)object4).a;
                    n10 = Intrinsics.areEqual(object, object10) ? 1 : 0;
                    ArrayList arrayList = ((QI0)object4).b;
                    if (n10 == 0) {
                        n10 = 1521898746;
                        ((j30_0)object3).K(n10);
                        ((QI0)object4).a = object;
                        n8 = arrayList.size();
                        object10 = new ArrayList(n8);
                        n8 = arrayList.size();
                        object9 = null;
                        for (n7 = 0; n7 < n8; ++n7) {
                            object8 = (D73)((PI0)arrayList.get((int)n7)).a;
                            ((ArrayList)object10).add(object8);
                        }
                        n8 = ((ArrayList)(object10 = CollectionsKt.m0(object10))).contains(object) ? 1 : 0;
                        if (n8 == 0) {
                            ((ArrayList)object10).add(object);
                        }
                        arrayList.clear();
                        n7 = ((ArrayList)object10).size();
                        object7 = new ArrayList(n7);
                        n7 = ((ArrayList)object10).size();
                        object8 = null;
                        for (n4 = 0; n4 < n7; ++n4) {
                            object6 = ((ArrayList)object10).get(n4);
                            if (object6 == null) continue;
                            ((ArrayList)object7).add(object6);
                        }
                        n7 = ((ArrayList)object7).size();
                        object8 = null;
                        for (n4 = 0; n4 < n7; ++n4) {
                            object6 = (D73)((ArrayList)object7).get(n4);
                            gx0_2 gx0_23 = new J73((D73)object6, (D73)object, (ArrayList)object10, (QI0)object4);
                            int n15 = 1471040642;
                            gx0_23 = v10.c(n15, gx0_23, (b30_0)object3);
                            object5 = new PI0((D73)object6, (u10)gx0_23);
                            arrayList.add(object5);
                        }
                        ((j30_0)object3).T(false);
                    } else {
                        n10 = 1524065801;
                        ((j30_0)object3).K(n10);
                        ((j30_0)object3).T(false);
                    }
                    object10 = HA.e(Nc$a.a, false);
                    n8 = ((j30_0)object3).P;
                    object9 = ((j30_0)object3).P();
                    object8 = a30_0.c((b30_0)object3, (LP1)object2);
                    N20.W.getClass();
                    object6 = N20$a.b;
                    object5 = ((j30_0)object3).a;
                    boolean bl2 = object5 instanceof mp;
                    if (!bl2) break block21;
                    ((j30_0)object3).A();
                    bl2 = ((j30_0)object3).O;
                    if (bl2) {
                        ((j30_0)object3).C((Function0)object6);
                    } else {
                        ((j30_0)object3).n();
                    }
                    object6 = N20$a.e;
                    Ow3.a((b30_0)object3, object10, (Function2)object6);
                    object10 = N20$a.d;
                    Ow3.a((b30_0)object3, object9, (Function2)object10);
                    object10 = N20$a.f;
                    n7 = ((j30_0)object3).O ? 1 : 0;
                    if (n7 != 0 || (n7 = (int)(Intrinsics.areEqual(object9 = ((j30_0)object3).v(), object6 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
                        rk_0.a(n8, (j30_0)object3, n8, (N20$a$a)object10);
                    }
                    object10 = N20$a.c;
                    Ow3.a((b30_0)object3, object8, (Function2)object10);
                    object10 = ((j30_0)object3).s();
                    if (object10 == null) break block22;
                    ((j30_0)object3).B((BF2)object10);
                    ((QI0)object4).c = object10;
                    ((j30_0)object3).K(1801432280);
                    n14 = arrayList.size();
                    object10 = null;
                    for (n10 = 0; n10 < n14; ++n10) {
                        object7 = (PI0)arrayList.get(n10);
                        object9 = (D73)((PI0)object7).a;
                        ((j30_0)object3).z(2123976768, object9);
                        object8 = new k73_0(gx0_22, (D73)object9);
                        n7 = 2041982076;
                        object9 = v10.c(n7, (fx0_2)object8, (b30_0)object3);
                        n4 = 6;
                        object8 = n4;
                        object7 = ((PI0)object7).b;
                        object7.invoke(object9, object3, object8);
                        ((j30_0)object3).T(false);
                    }
                    ((j30_0)object3).T(false);
                    n14 = 1;
                    ((j30_0)object3).T(n14 != 0);
                }
                object3 = ((j30_0)object3).X();
                if (object3 != null) {
                    ((CF2)object3).d = object4 = new l73_0((D73)object, (LP1)object2, gx0_22, n3);
                }
                return;
            }
            object2 = "no recompose scope found".toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        s20.a();
        throw null;
    }

    public static final void b(R73 r73, LP1 lP1, gx0_2 gx0_22, b30_0 object, int n3) {
        object = object.g(431012348);
        int n4 = n3 & 6;
        if (n4 == 0) {
            n4 = ((j30_0)object).J(r73) ? 1 : 0;
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n7 = (n4 |= 0x1B0) & 0x93;
        int n8 = 146;
        if (n7 == n8 && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            b30$a$a b30$a$a;
            lP1 = LP1$a.b;
            gx0_22 = j20.a;
            D73 d73 = (D73)r73.a.getValue();
            Object object2 = O30.a;
            object2 = (P1)((j30_0)object).j((H30)object2);
            boolean bl2 = ((j30_0)object).x(d73);
            boolean bl3 = ((j30_0)object).x(object2);
            Object object3 = ((j30_0)object).v();
            if ((bl2 |= bl3) || object3 == (b30$a$a = b30$a.a)) {
                bl2 = false;
                b30$a$a = null;
                object3 = new m73_0(d73, (P1)object2, null);
                ((j30_0)object).o(object3);
            }
            object3 = (Function2)object3;
            ly0_0.d((b30_0)object, d73, (Function2)object3);
            d73 = (D73)r73.a.getValue();
            O73.a(d73, lP1, gx0_22, (b30_0)object, n4 &= 0x3F0);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            n73_0 n73_02 = new n73_0(r73, lP1, gx0_22, n3);
            ((CF2)object).d = n73_02;
        }
    }
}

