/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

public final class Jk2 {
    public final Kl2 a;
    public final ArrayList b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final le_2 i;
    public final le_2 j;
    public final LinkedHashMap k;
    public final AR1 l;

    public Jk2(Kl2 object) {
        le_2 le_22;
        this.a = object;
        object = new ArrayList();
        this.b = object;
        this.c = object;
        int n3 = -1;
        int n4 = 6;
        this.i = le_22 = sr_2.a(n3, n4, null);
        this.j = object = sr_2.a(n3, n4, null);
        object = new LinkedHashMap();
        this.k = object;
        object = new AR1();
        Rv1 rv1 = Rv1.REFRESH;
        Ov1$b ov1$b = Ov1$b.b;
        ((AR1)object).c(rv1, ov1$b);
        this.l = object;
    }

    public final cm2 a(rE3$a object) {
        ArrayList arrayList = this.c;
        List list = CollectionsKt.k0(arrayList);
        Kl2 kl2 = this.a;
        if (object != null) {
            int n3;
            int n4 = this.d();
            int n7 = -this.d;
            int n8 = xx_2.h(arrayList);
            int n10 = this.d;
            n8 -= n10;
            for (n10 = n7; n10 < (n3 = ((rE3$a)object).e); ++n10) {
                if (n10 > n8) {
                    n3 = kl2.a;
                } else {
                    n3 = this.d + n10;
                    List list2 = ((am2$b$b)arrayList.get((int)n3)).a;
                    n3 = list2.size();
                }
                n4 += n3;
            }
            int n14 = ((rE3$a)object).f;
            n4 += n14;
            if (n3 < n7) {
                n14 = kl2.a;
                n4 -= n14;
            }
            object = n4;
        } else {
            boolean bl2 = false;
            object = null;
        }
        int n15 = this.d();
        cm2 cm22 = new cm2(list, (Integer)object, kl2, n15);
        return cm22;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void b(rk2$a object) {
        int n3;
        Object object2 = "event";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = ((rk2$a)object).a();
        ArrayList arrayList = this.c;
        int n7 = arrayList.size();
        if (n4 > n7) {
            object2 = new StringBuilder("invalid drop count. have ");
            int n8 = arrayList.size();
            ((StringBuilder)object2).append(n8);
            ((StringBuilder)object2).append(" but wanted to drop ");
            int n10 = ((rk2$a)object).a();
            ((StringBuilder)object2).append(n10);
            object = ((StringBuilder)object2).toString();
            object = object.toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        object2 = this.k;
        Rv1 rv1 = ((rk2$a)object).a;
        object2.remove((Object)rv1);
        object2 = Ov1$c.c;
        this.l.c(rv1, (Ov1)object2);
        object2 = Jk2$b.$EnumSwitchMapping$0;
        int n14 = rv1.ordinal();
        Object object3 = object2[n14];
        ArrayList arrayList2 = this.b;
        int n15 = -1 << -1;
        int n16 = 0;
        int n17 = 2;
        int n18 = ((rk2$a)object).d;
        if (object3 != n17) {
            void var3_6;
            n17 = 3;
            if (object3 != n17) {
                object2 = new StringBuilder("cannot drop ");
                ((StringBuilder)object2).append((Object)rv1);
                object2 = ((StringBuilder)object2).toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            int n19 = ((rk2$a)object).a();
            boolean bl2 = false;
            object2 = null;
            while (var3_6 < n19) {
                n7 = arrayList.size() + -1;
                arrayList2.remove(n7);
                ++var3_6;
            }
            if (n18 != n15) {
                n16 = n18;
            }
            this.f = n16;
            this.h = n19 = this.h + 1;
            object = n19;
            object2 = this.j;
            object2.j(object);
            return;
        }
        int n20 = ((rk2$a)object).a();
        arrayList = null;
        for (int i3 = 0; i3 < n20; ++i3) {
            arrayList2.remove(0);
        }
        int n21 = this.d;
        int n22 = ((rk2$a)object).a();
        this.d = n3 = n21 - n22;
        if (n18 != n15) {
            n16 = n18;
        }
        this.e = n16;
        this.g = n22 = this.g + 1;
        object = n22;
        object2 = this.i;
        object2.j(object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final rk2$a c(Rv1 object, re3_0 object2) {
        void var10_27;
        void var11_35;
        void var5_18;
        Object object3;
        void var11_31;
        void var11_29;
        List list;
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(object, "loadType");
        Intrinsics.checkNotNullParameter(object2, "hint");
        Kl2 kl2 = this.a;
        int n7 = kl2.e;
        int n8 = -1 >>> 1;
        rk2$a rk2$a = null;
        if (n7 == n8) {
            return null;
        }
        ArrayList arrayList = this.c;
        int n10 = arrayList.size();
        if (n10 <= (n4 = 2)) {
            return null;
        }
        Iterator iterator = arrayList.iterator();
        boolean bl2 = false;
        boolean bl3 = false;
        Rv1 rv1 = null;
        while ((n3 = iterator.hasNext()) != 0) {
            list = ((am2$b$b)iterator.next()).a;
            n3 = list.size();
            var11_29 += n3;
        }
        int n14 = kl2.e;
        if (var11_29 <= n14) {
            return null;
        }
        rv1 = Rv1.REFRESH;
        if (object == rv1) {
            StringBuilder stringBuilder = new StringBuilder("Drop LoadType must be PREPEND or APPEND, but got ");
            stringBuilder.append(object);
            object = stringBuilder.toString();
            object = object.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        boolean bl4 = false;
        rv1 = null;
        n3 = 0;
        list = null;
        while (var11_31 < (object3 = arrayList.size())) {
            int n15;
            Object object4 = arrayList.iterator();
            Object object5 = 0;
            List list2 = null;
            while ((n15 = object4.hasNext()) != 0) {
                List list3 = ((am2$b$b)object4.next()).a;
                n15 = list3.size();
                object5 += n15;
            }
            if ((object5 -= n3) <= n14) break;
            object4 = Jk2$b.$EnumSwitchMapping$0;
            object5 = ((Enum)object).ordinal();
            if ((object5 = (Object)object4[object5]) == n4) {
                list2 = ((am2$b$b)arrayList.get((int)var11_31)).a;
                object5 = list2.size();
            } else {
                object5 = xx_2.h(arrayList) - var11_31;
                list2 = ((am2$b$b)arrayList.get((int)object5)).a;
                object5 = list2.size();
            }
            n15 = ((Enum)object).ordinal();
            Object object3 = object4[n15];
            object3 = object3 == n4 ? ((re3_0)object2).a : ((re3_0)object2).b;
            object3 = object3 - n3 - object5;
            n15 = kl2.b;
            if (object3 < n15) break;
            n3 += object5;
            ++var11_31;
        }
        if (var11_31 == false) {
            return rk2$a;
        }
        int[] nArray = Jk2$b.$EnumSwitchMapping$0;
        int n17 = ((Enum)object).ordinal();
        n17 = nArray[n17];
        if (n17 == n4) {
            int n18 = -this.d;
        } else {
            int n19 = xx_2.h(arrayList);
            int n20 = this.d;
            int n21 = n19 - n20;
            void var15_41 = var11_31 + -1;
            int n22 = n21 - var15_41;
        }
        int n24 = ((Enum)object).ordinal();
        int n25 = nArray[n24];
        if (n25 == n4) {
            void var11_32 = var11_31 + -1;
            int n26 = this.d;
            void var11_33 = var11_32 - n26;
        } else {
            int n27 = xx_2.h(arrayList);
            n7 = this.d;
            int n28 = n27 - n7;
        }
        boolean bl5 = kl2.c;
        if (!bl5) return new rk2$a((Rv1)((Object)((Object)object)), (int)var5_18, (int)var11_35, (int)var10_27);
        Rv1 rv12 = Rv1.PREPEND;
        if (object == rv12) {
            int n29 = this.d();
            int n30 = n29 + n3;
            return new rk2$a((Rv1)((Object)object), (int)var5_18, (int)var11_35, (int)var10_27);
        } else {
            int n32;
            boolean bl6 = kl2.c;
            if (bl6) {
                n32 = this.f;
            }
            void var10_26 = n32 + n3;
        }
        return new rk2$a((Rv1)((Object)((Object)object)), (int)var5_18, (int)var11_35, (int)var10_27);
    }

    public final int d() {
        Kl2 kl2 = this.a;
        int n3 = kl2.c;
        if (n3 != 0) {
            n3 = this.e;
        } else {
            n3 = 0;
            kl2 = null;
        }
        return n3;
    }

    public final boolean e(int n3, Rv1 object, am2$b$b am2$b$b) {
        block20: {
            block21: {
                int n4;
                block17: {
                    int n7;
                    int n8;
                    ArrayList arrayList;
                    int n10;
                    Object object2;
                    block15: {
                        block19: {
                            Rv1 rv1;
                            LinkedHashMap linkedHashMap;
                            block16: {
                                block18: {
                                    Object object3;
                                    Intrinsics.checkNotNullParameter(object, "loadType");
                                    Intrinsics.checkNotNullParameter(am2$b$b, "page");
                                    object2 = Jk2$b.$EnumSwitchMapping$0;
                                    n10 = ((Enum)object).ordinal();
                                    n10 = object2[n10];
                                    object2 = this.b;
                                    arrayList = this.c;
                                    n8 = -1 << -1;
                                    n7 = 0;
                                    n4 = 1;
                                    if (n10 == n4) break block15;
                                    linkedHashMap = this.k;
                                    int n14 = 2;
                                    if (n10 == n14) break block16;
                                    n14 = 3;
                                    if (n10 != n14) break block17;
                                    n10 = arrayList.isEmpty() ^ n4;
                                    if (n10 == 0) break block18;
                                    n10 = this.h;
                                    if (n3 != n10) {
                                        return false;
                                    }
                                    ((ArrayList)object2).add(am2$b$b);
                                    n3 = am2$b$b.e;
                                    if (n3 == n8) {
                                        object3 = this.a;
                                        n3 = object3.c ? 1 : 0;
                                        if (n3 != 0) {
                                            n3 = this.f;
                                        } else {
                                            n3 = 0;
                                            object3 = null;
                                        }
                                        object = am2$b$b.a;
                                        n10 = object.size();
                                        if ((n3 -= n10) < 0) {
                                            n3 = 0;
                                            object3 = null;
                                        }
                                    }
                                    if (n3 != n8) {
                                        n7 = n3;
                                    }
                                    this.f = n7;
                                    object3 = Rv1.APPEND;
                                    linkedHashMap.remove(object3);
                                    break block17;
                                }
                                object = "should've received an init before append".toString();
                                IllegalStateException illegalStateException = new IllegalStateException((String)object);
                                throw illegalStateException;
                            }
                            n10 = arrayList.isEmpty() ^ n4;
                            if (n10 == 0) break block19;
                            n10 = this.g;
                            if (n3 != n10) {
                                return false;
                            }
                            ((ArrayList)object2).add(0, am2$b$b);
                            this.d = n3 = this.d + n4;
                            n3 = am2$b$b.d;
                            if (n3 == n8) {
                                n3 = this.d();
                                object = am2$b$b.a;
                                n10 = object.size();
                                if ((n3 -= n10) < 0) {
                                    n3 = 0;
                                    rv1 = null;
                                }
                            }
                            if (n3 != n8) {
                                n7 = n3;
                            }
                            this.e = n7;
                            rv1 = Rv1.PREPEND;
                            linkedHashMap.remove((Object)rv1);
                            break block17;
                        }
                        object = "should've received an init before prepend".toString();
                        IllegalStateException illegalStateException = new IllegalStateException((String)object);
                        throw illegalStateException;
                    }
                    n10 = arrayList.isEmpty() ? 1 : 0;
                    if (n10 == 0) break block20;
                    if (n3 != 0) break block21;
                    ((ArrayList)object2).add(am2$b$b);
                    this.d = 0;
                    n3 = am2$b$b.e;
                    if (n3 == n8) {
                        n3 = 0;
                        Object var12_16 = null;
                    }
                    this.f = n3;
                    n3 = am2$b$b.d;
                    if (n3 != n8) {
                        n7 = n3;
                    }
                    this.e = n7;
                }
                return n4 != 0;
            }
            object = "init loadId must be the initial value, 0".toString();
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        object = "cannot receive multiple init calls".toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final rk2$b f(am2$b$b am2$b$b, Rv1 rv1) {
        Object object;
        Jk2 jk2 = this;
        Object object2 = am2$b$b;
        Intrinsics.checkNotNullParameter(am2$b$b, "<this>");
        Rv1 rv12 = rv1;
        Intrinsics.checkNotNullParameter((Object)rv1, "loadType");
        Object object3 = Jk2$b.$EnumSwitchMapping$0;
        int n3 = rv1.ordinal();
        n3 = object3[n3];
        int n4 = 0;
        int n7 = 3;
        int n8 = 2;
        int n10 = 1;
        if (n3 != n10) {
            if (n3 != n8) {
                if (n3 != n7) {
                    object2 = new NoWhenBranchMatchedException();
                    throw object2;
                }
                object = this.c;
                n3 = ((ArrayList)object).size();
                int n14 = this.d;
                n3 = n3 - n14 - n10;
            } else {
                n3 = this.d;
                n3 = 0 - n3;
            }
        } else {
            n3 = 0;
            object = null;
        }
        object2 = ((am2$b$b)object2).a;
        Wq3 wq3 = new Wq3(n3, (List)object2);
        List list = kotlin.collections.a.b(wq3);
        int n15 = rv1.ordinal();
        n15 = object3[n15];
        object3 = jk2.l;
        Kl2 kl2 = jk2.a;
        if (n15 != n10) {
            object = "sourceLoadStates";
            String string2 = "pages";
            if (n15 == n8) {
                object2 = rk2$b.g;
                int n16 = this.d();
                Qv1 qv1 = ((AR1)object3).d();
                Intrinsics.checkNotNullParameter(list, string2);
                Intrinsics.checkNotNullParameter(qv1, (String)object);
                Rv1 rv13 = Rv1.PREPEND;
                int n17 = -1;
                return new rk2$b(rv13, list, n16, n17, qv1, null);
            }
            if (n15 != n7) {
                object2 = new NoWhenBranchMatchedException();
                throw object2;
            }
            object2 = rk2$b.g;
            n15 = kl2.c ? 1 : 0;
            int n18 = n15 != 0 ? (n4 = jk2.f) : 0;
            Qv1 qv1 = ((AR1)object3).d();
            Intrinsics.checkNotNullParameter(list, string2);
            Intrinsics.checkNotNullParameter(qv1, (String)object);
            Rv1 rv14 = Rv1.APPEND;
            int n19 = -1;
            return new rk2$b(rv14, list, n19, n18, qv1, null);
        }
        object2 = rk2$b.g;
        n15 = this.d();
        boolean bl2 = kl2.c;
        if (bl2) {
            n4 = jk2.f;
        }
        object3 = ((AR1)object3).d();
        bl2 = false;
        Object var5_7 = null;
        return rk2$b$a.a(list, n15, n4, (Qv1)object3, null);
    }
}

