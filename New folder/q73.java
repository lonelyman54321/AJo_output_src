/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class q73 {
    public final l73 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public tr1_1 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final fj1 p;
    public final fj1 q;
    public final fj1 r;
    public tr1_1 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public Cz2 x;

    public q73(l73 object) {
        int n3;
        int n4;
        int n7;
        this.a = object;
        int[] nArray = ((l73)object).a;
        this.b = nArray;
        Object[] objectArray = ((l73)object).c;
        this.c = objectArray;
        Object object2 = ((l73)object).h;
        this.d = object2;
        object2 = ((l73)object).i;
        this.e = object2;
        this.f = object2 = ((l73)object).j;
        this.g = n7 = ((l73)object).b;
        this.h = n4 = nArray.length / 5 - n7;
        this.k = n3 = ((l73)object).d;
        this.l = n4 = objectArray.length - n3;
        this.m = n7;
        this.p = object = new fj1();
        this.q = object = new fj1();
        this.r = object = new fj1();
        this.u = n7;
        this.v = -1;
    }

    public static int h(int n3, int n4, int n7, int n8) {
        if (n3 > n4) {
            n8 = n8 - n7 - n3 + 1;
            n3 = -n8;
        }
        return n3;
    }

    public static void u(q73 q732) {
        int n3;
        int[] nArray = q732.b;
        int n4 = q732.v;
        int n7 = q732.p(n4);
        int n8 = n7 * 5 + 1;
        int n10 = nArray[n8];
        int n14 = n10 & (n3 = 0x8000000);
        if (n14 == 0) {
            nArray[n8] = n10 |= n3;
            if ((n7 = (int)(n73.c(nArray, n7) ? 1 : 0)) == 0) {
                int[] nArray2 = q732.b;
                n4 = q732.A(nArray2, n4);
                q732.Q(n4);
            }
        }
    }

    public final int A(int[] nArray, int n3) {
        n3 = this.p(n3);
        int n4 = n73.l(nArray, n3);
        if (n4 <= (n3 = -2)) {
            int n7 = this.n() + n4;
            n4 = n7 + 2;
        }
        return n4;
    }

    public final Object B(Object object) {
        int n3;
        int n4 = this.n;
        int n7 = 1;
        if (n4 > 0) {
            n4 = this.v;
            this.t(n7, n4);
        }
        Object object2 = this.c;
        int n8 = this.i;
        this.i = n3 = n8 + 1;
        n8 = this.g(n8);
        object2 = object2[n8];
        n8 = this.i;
        n3 = this.j;
        if (n8 <= n3) {
            Object[] objectArray = this.c;
            n8 -= n7;
            n7 = this.g(n8);
            objectArray[n7] = object;
            return object2;
        }
        p30_0.c("Writing to an invalid slot");
        throw null;
    }

    public final void C() {
        Cz2 cz2 = this.x;
        if (cz2 != null) {
            while (true) {
                int[] nArray;
                int n3;
                int n4;
                int n7;
                int n8;
                int n10;
                block6: {
                    int n14;
                    Collection collection = cz2.a;
                    n10 = collection.isEmpty();
                    n8 = 1;
                    if ((n10 ^= n8) == 0) break;
                    n10 = cz2.b();
                    n7 = this.p(n10);
                    n4 = this.q(n10) + n10;
                    for (n3 = n10 + 1; n3 < n4; n3 += n14) {
                        int[] nArray2 = this.b;
                        int n15 = this.p(n3) * 5 + n8;
                        n14 = nArray2[n15];
                        n15 = 0xC000000;
                        if ((n14 &= n15) != 0) {
                            n3 = 1;
                            break block6;
                        }
                        n14 = this.q(n3);
                    }
                    n3 = 0;
                }
                if ((n4 = (int)(n73.c(nArray = this.b, n7) ? 1 : 0)) == n3) continue;
                nArray = this.b;
                n7 = n7 * 5 + n8;
                if (n3 != 0) {
                    n8 = nArray[n7];
                    n3 = 0x4000000;
                    nArray[n7] = n8 |= n3;
                } else {
                    n8 = nArray[n7];
                    n3 = -67108865;
                    nArray[n7] = n8 &= n3;
                }
                if ((n10 = this.A(nArray, n10)) < 0) continue;
                cz2.a(n10);
            }
        }
    }

    public final boolean D() {
        int n3 = this.n;
        if (n3 == 0) {
            int n4;
            int n7;
            Object object;
            n3 = this.t;
            int n8 = this.i;
            int[] nArray = this.b;
            int n10 = this.p(n3);
            int n14 = this.f(nArray, n10);
            n10 = this.G();
            int n15 = this.v;
            Object object2 = this.K(n15);
            if (object2 != null && (object = this.N(n3)) != null) {
                ((Q11)object2).c((Ae)object);
            }
            if ((object2 = this.x) != null) {
                while (true) {
                    Object object3 = object = ((Cz2)object2).a;
                    object3 = (Collection)object;
                    n7 = object3.isEmpty() ^ 1;
                    if (n7 == 0 || (n4 = ((Number)(object = (Number)CollectionsKt.L((List)object))).intValue()) < n3) break;
                    ((Cz2)object2).b();
                }
            }
            n15 = this.t - n3;
            n15 = (int)(this.E(n3, n15) ? 1 : 0);
            n4 = this.i - n14;
            n7 = n3 + -1;
            this.F(n14, n4, n7);
            this.t = n3;
            this.i = n8;
            this.o = n3 = this.o - n10;
            return n15 != 0;
        }
        p30_0.c("Cannot remove group while inserting");
        throw null;
    }

    public final boolean E(int n3, int n4) {
        boolean bl2 = false;
        if (n4 > 0) {
            int[] nArray;
            Object object = this.d;
            this.w(n3);
            int n7 = object.isEmpty();
            int n8 = 1;
            if ((n7 ^= n8) != 0) {
                Ae ae2;
                int n10;
                Object object2;
                object = this.e;
                int n14 = this.h;
                int n15 = n3 + n4;
                int n16 = this.m() - n14;
                ArrayList arrayList = this.d;
                n14 = n73.i(arrayList, n15, n16);
                if (n14 >= (n16 = ((ArrayList)(object2 = this.d)).size())) {
                    n14 += -1;
                }
                n16 = n14 + 1;
                int n17 = 0;
                while (n14 >= 0 && (n10 = this.c(ae2 = (Ae)this.d.get(n14))) >= n3) {
                    if (n10 < n15) {
                        ae2.a = n16 = -1 << -1;
                        if (object != null) {
                            object2 = (Q11)((HashMap)object).remove(ae2);
                        }
                        if (n17 == 0) {
                            n17 = n14 + 1;
                        }
                        n16 = n14;
                    }
                    n14 += -1;
                }
                if (n16 < n17) {
                    bl2 = true;
                }
                if (bl2) {
                    object = this.d.subList(n16, n17);
                    object.clear();
                }
            }
            this.g = n3;
            this.h = n7 = this.h + n4;
            n7 = this.m;
            if (n7 > n3) {
                this.m = n3 = Math.max(n3, n7 -= n4);
            }
            if ((n3 = this.u) >= (n7 = this.g)) {
                this.u = n3 -= n4;
            }
            if ((n3 = this.v) >= 0 && (n4 = (int)(n73.c(nArray = this.b, n7 = this.p(n3)) ? 1 : 0)) != 0) {
                this.Q(n3);
            }
        }
        return bl2;
    }

    public final void F(int n3, int n4, int n7) {
        if (n4 > 0) {
            int n8 = this.l;
            int n10 = n3 + n4;
            this.x(n10, n7);
            this.k = n3;
            this.l = n8 += n4;
            Object[] objectArray = this.c;
            n8 = 0;
            rp_1.n(n3, n10, null, objectArray);
            n7 = this.j;
            if (n7 >= n3) {
                this.j = n7 -= n4;
            }
        }
    }

    public final int G() {
        int n3;
        int n4 = this.t;
        n4 = this.p(n4);
        int n7 = this.t;
        int[] nArray = this.b;
        this.t = n3 = n73.e(nArray, n4) + n7;
        int[] nArray2 = this.b;
        n3 = this.p(n3);
        this.i = n7 = this.f(nArray2, n3);
        nArray2 = this.b;
        n7 = (int)(n73.h(nArray2, n4) ? 1 : 0);
        if (n7 != 0) {
            n4 = 1;
        } else {
            nArray2 = this.b;
            n4 = n73.j(nArray2, n4);
        }
        return n4;
    }

    public final void H() {
        int n3;
        this.t = n3 = this.u;
        int[] nArray = this.b;
        n3 = this.p(n3);
        this.i = n3 = this.f(nArray, n3);
    }

    public final int I(int[] objectArray, int n3) {
        int n4;
        int n7 = this.m();
        if (n3 >= n7) {
            objectArray = this.c;
            n4 = objectArray.length;
            n3 = this.l;
            n4 -= n3;
        } else {
            n4 = n73.m(objectArray, n3);
            n3 = this.l;
            Object[] objectArray2 = this.c;
            n7 = objectArray2.length;
            if (n4 < 0) {
                n4 = n7 = n7 - n3 + n4 + 1;
            }
        }
        return n4;
    }

    public final int J(int n3, int n4) {
        StringBuilder stringBuilder;
        int n7 = this.p(n3);
        int[] nArray = this.b;
        n7 = this.I(nArray, n7);
        nArray = this.b;
        int n8 = n3 + 1;
        n8 = this.p(n8);
        int n10 = this.f(nArray, n8);
        n8 = n7 + n4;
        if (n8 >= n7 && n8 < n10) {
            n7 = 1;
        } else {
            n7 = 0;
            stringBuilder = null;
        }
        if (n7 != 0) {
            return n8;
        }
        stringBuilder = new StringBuilder("Write to an invalid slot index ");
        stringBuilder.append(n4);
        stringBuilder.append(" for group ");
        stringBuilder.append(n3);
        p30_0.c(stringBuilder.toString());
        throw null;
    }

    public final Q11 K(int n3) {
        Ae ae2;
        HashMap hashMap = this.e;
        Object object = null;
        if (hashMap != null && (ae2 = this.N(n3)) != null) {
            ae2 = hashMap.get(ae2);
            object = ae2;
            object = (Q11)((Object)ae2);
        }
        return object;
    }

    public final void L() {
        int n3 = this.n;
        if (n3 == 0) {
            b30$a$a b30$a$a = b30$a.a;
            this.M(b30$a$a, 0, b30$a$a, false);
            return;
        }
        p30_0.c("Key must be supplied when inserting");
        throw null;
    }

    public final void M(Object object, int n3, Object object2, boolean bl2) {
        int n4;
        ArrayList<Ae> arrayList;
        q73 q732 = this;
        Object object3 = object;
        Object object4 = object2;
        int n7 = this.v;
        int n8 = this.n;
        int n10 = 1;
        if (n8 > 0) {
            n8 = 1;
        } else {
            n8 = 0;
            arrayList = null;
        }
        Object object5 = q732.r;
        int n14 = q732.o;
        ((fj1)object5).b(n14);
        object5 = b30$a.a;
        if (n8 != 0) {
            int n15;
            n8 = q732.t;
            int[] nArray = q732.b;
            int n16 = q732.p(n8);
            n14 = q732.f(nArray, n16);
            q732.s(n10);
            q732.i = n14;
            q732.j = n14;
            n16 = q732.p(n8);
            int n17 = object3 != object5 ? 1 : 0;
            if (!bl2 && object4 != object5) {
                n15 = 1;
            } else {
                n15 = 0;
                object5 = null;
            }
            int n18 = q732.l;
            int n19 = q732.k;
            Object[] objectArray = q732.c;
            int n20 = objectArray.length;
            n14 = q73.h(n14, n19, n18, n20);
            if (n14 >= 0 && (n18 = q732.m) < n8) {
                Object[] objectArray2 = q732.c;
                n18 = objectArray2.length;
                n19 = q732.l;
                n18 = n18 - n19 - n14 + n10;
                n14 = -n18;
            }
            Object[] objectArray3 = q732.b;
            n18 = q732.v;
            n19 = bl2 ? 0x40000000 : 0;
            if (n17 != 0) {
                n20 = 0x20000000;
            } else {
                n20 = 0;
                objectArray = null;
            }
            int n21 = n15 != 0 ? 0x10000000 : 0;
            objectArray3[n16 *= 5] = n3;
            int n22 = n16 + 1;
            objectArray3[n22] = n19 = n19 | n20 | n21;
            n19 = n16 + 2;
            objectArray3[n19] = n18;
            n18 = n16 + 3;
            objectArray3[n18] = 0;
            objectArray3[n16 += 4] = n14;
            n10 = bl2 + n17 + n15;
            if (n10 > 0) {
                q732.t(n10, n8);
                objectArray3 = q732.c;
                n14 = q732.i;
                if (bl2) {
                    n16 = n14 + 1;
                    objectArray3[n14] = (int)object4;
                    n14 = n16;
                }
                if (n17 != 0) {
                    n16 = n14 + 1;
                    objectArray3[n14] = (int)object3;
                    n14 = n16;
                }
                if (n15 != 0) {
                    n4 = n14 + 1;
                    objectArray3[n14] = (int)object4;
                    n14 = n4;
                }
                q732.i = n14;
            }
            q732.o = 0;
            n4 = n8 + 1;
            q732.v = n8;
            q732.t = n4;
            if (n7 >= 0 && (object4 = q732.K(n7)) != null) {
                object4 = ((Q11)object4).b();
                Ae ae2 = q732.b(n8);
                arrayList = ((Q11)object4).a;
                if (arrayList == null) {
                    arrayList = new ArrayList<Ae>();
                }
                ((Q11)object4).a = arrayList;
                arrayList.add(ae2);
            }
        } else {
            int n24;
            object3 = q732.p;
            ((fj1)object3).b(n7);
            n4 = this.m();
            n7 = q732.h;
            n4 -= n7;
            n7 = q732.u;
            fj1 fj12 = q732.q;
            fj12.b(n4 -= n7);
            n4 = q732.t;
            n7 = q732.p(n4);
            n8 = (int)(Intrinsics.areEqual(object4, object5) ? 1 : 0);
            if (n8 == 0) {
                if (bl2) {
                    n8 = q732.t;
                    q732.R(n8, object4);
                } else {
                    q732.P(object4);
                }
            }
            object4 = q732.b;
            q732.i = n24 = q732.I((int[])object4, n7);
            object4 = q732.b;
            n8 = q732.t + n10;
            n8 = q732.p(n8);
            q732.j = n24 = q732.f((int[])object4, n8);
            q732.o = n24 = n73.j(q732.b, n7);
            q732.v = n4;
            q732.t = n24 = n4 + 1;
            object4 = q732.b;
            n24 = n73.e((int[])object4, n7);
            n4 += n24;
        }
        q732.u = n4;
    }

    public final Ae N(int n3) {
        int n4;
        ArrayList arrayList;
        int n7;
        Ae ae2 = null;
        if (n3 >= 0 && n3 < (n7 = this.n()) && (n3 = n73.q(arrayList = this.d, n3, n4 = this.n())) >= 0) {
            Object e2 = arrayList.get(n3);
            ae2 = (Ae)e2;
            ae2 = (Ae)e2;
        }
        return ae2;
    }

    public final void O(Object object) {
        int n3;
        int n4 = this.n;
        if (n4 > 0 && (n4 = this.i) != (n3 = this.k)) {
            tr1_1 tr1_12 = this.s;
            if (tr1_12 == null) {
                tr1_12 = new tr1_1();
            }
            this.s = tr1_12;
            n3 = this.v;
            Object object2 = tr1_12.c(n3);
            if (object2 == null) {
                object2 = new hr1_0(null);
                tr1_12.i(n3, object2);
            }
            ((hr1_0)object2).b(object);
            return;
        }
        this.B(object);
    }

    public final void P(Object object) {
        int n3 = this.t;
        Object[] objectArray = this.b;
        boolean bl2 = n73.f(objectArray, n3 = this.p(n3));
        if (bl2) {
            objectArray = this.c;
            int[] nArray = this.b;
            int n4 = this.f(nArray, n3);
            n3 = n3 * 5 + 1;
            n3 = n73.p(nArray[n3] >> 29) + n4;
            n3 = this.g(n3);
            objectArray[n3] = (int)object;
            return;
        }
        p30_0.c("Updating the data of a group that was not created with a data slot");
        throw null;
    }

    public final void Q(int n3) {
        if (n3 >= 0) {
            Cz2 cz2 = this.x;
            if (cz2 == null) {
                this.x = cz2 = new Cz2(0);
            }
            cz2.a(n3);
        }
    }

    public final void R(int n3, Object object) {
        boolean bl2;
        int[] nArray;
        int n4;
        int n7 = this.p(n3);
        if (n7 < (n4 = (nArray = this.b).length) && (bl2 = n73.h(nArray, n7))) {
            bl2 = true;
        } else {
            bl2 = false;
            nArray = null;
        }
        if (bl2) {
            Object[] objectArray = this.c;
            nArray = this.b;
            n7 = this.f(nArray, n7);
            n7 = this.g(n7);
            objectArray[n7] = object;
            return;
        }
        object = new StringBuilder("Updating the node of a group at ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(" that was not created with as a node group");
        p30_0.c(((StringBuilder)object).toString());
        throw null;
    }

    public final void a(int n3) {
        int n4 = 0;
        int n7 = n3 >= 0 ? 1 : 0;
        if (n7 != 0) {
            n7 = this.n;
            n7 = n7 <= 0 ? 1 : 0;
            if (n7 != 0) {
                if (n3 == 0) {
                    return;
                }
                n7 = this.t + n3;
                if (n7 >= (n3 = this.v) && n7 <= (n3 = this.u)) {
                    n4 = 1;
                }
                if (n4 != 0) {
                    this.t = n7;
                    int[] nArray = this.b;
                    n4 = this.p(n7);
                    this.i = n3 = this.f(nArray, n4);
                    this.j = n3;
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder("Cannot seek outside the current group (");
                n4 = this.v;
                stringBuilder.append(n4);
                stringBuilder.append('-');
                n4 = this.u;
                stringBuilder.append(n4);
                stringBuilder.append(')');
                p30_0.c(stringBuilder.toString());
                throw null;
            }
            sn2.c("Cannot call seek() while inserting");
            throw null;
        }
        p30_0.c("Cannot seek backwards");
        throw null;
    }

    public final Ae b(int n3) {
        Ae ae2;
        ArrayList arrayList = this.d;
        int n4 = this.n();
        if ((n4 = n73.q(arrayList, n3, n4)) < 0) {
            int n7 = this.g;
            if (n3 > n7) {
                n7 = this.n() - n3;
                n3 = -n7;
            }
            ae2 = new Ae(n3);
            n3 = -(++n4);
            arrayList.add(n3, ae2);
        } else {
            Object e2 = arrayList.get(n4);
            ae2 = e2;
            ae2 = (Ae)e2;
        }
        return ae2;
    }

    public final int c(Ae ae2) {
        int n3 = ae2.a;
        if (n3 < 0) {
            int n4 = this.n();
            n3 += n4;
        }
        return n3;
    }

    public final void d() {
        int n3;
        int n4 = this.n;
        this.n = n3 = n4 + 1;
        if (n4 == 0) {
            n4 = this.m();
            n3 = this.h;
            n4 -= n3;
            n3 = this.u;
            fj1 fj12 = this.q;
            fj12.b(n4 -= n3);
        }
    }

    public final void e(boolean bl2) {
        Object[] objectArray;
        int n3;
        Object[] objectArray2;
        this.w = true;
        if (bl2) {
            objectArray2 = this.p;
            int n4 = objectArray2.b;
            if (n4 == 0) {
                int n7 = this.n();
                this.w(n7);
                objectArray2 = this.c;
                int n8 = objectArray2.length;
                n3 = this.l;
                int n10 = n8 - n3;
                n3 = this.g;
                this.x(n10, n3);
                int n14 = this.k;
                n3 = this.l + n14;
                objectArray = this.c;
                rp_1.n(n14, n3, null, objectArray);
                this.C();
            }
        }
        objectArray2 = this.b;
        n3 = this.g;
        objectArray = this.c;
        int n15 = this.k;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        tr1_1 tr1_12 = this.f;
        l73 l732 = this.a;
        l732.getClass();
        boolean bl3 = l732.f;
        if (bl3) {
            l732.f = false;
            l732.a = (int[])objectArray2;
            l732.b = n3;
            l732.c = objectArray;
            l732.d = n15;
            l732.h = arrayList;
            l732.i = hashMap;
            l732.j = tr1_12;
            return;
        }
        sn2.b("Unexpected writer close()");
        throw null;
    }

    public final int f(int[] objectArray, int n3) {
        int n4;
        int n7 = this.m();
        if (n3 >= n7) {
            objectArray = this.c;
            n4 = objectArray.length;
            n3 = this.l;
            n4 -= n3;
        } else {
            n4 = n73.d(objectArray, n3);
            n3 = this.l;
            Object[] objectArray2 = this.c;
            n7 = objectArray2.length;
            if (n4 < 0) {
                n4 = n7 = n7 - n3 + n4 + 1;
            }
        }
        return n4;
    }

    public final int g(int n3) {
        int n4 = this.k;
        if (n3 >= n4) {
            n4 = this.l;
            n3 += n4;
        }
        return n3;
    }

    public final void i() {
        block20: {
            block19: {
                fj1 fj12;
                boolean bl2;
                int n3;
                int n4;
                int n7;
                int n8;
                int n10;
                int n14;
                Object object;
                int n15;
                int n16;
                int n17;
                block18: {
                    hr1_0 hr1_02;
                    n17 = this.n;
                    n16 = 1;
                    n15 = 0;
                    if (n17 > 0) {
                        n17 = 1;
                    } else {
                        n17 = 0;
                        object = null;
                    }
                    n14 = this.t;
                    n10 = this.u;
                    n8 = this.v;
                    n7 = this.p(n8);
                    n4 = this.o;
                    n3 = n14 - n8;
                    int[] nArray = this.b;
                    bl2 = n73.h(nArray, n7);
                    fj12 = this.r;
                    if (n17 == 0) break block18;
                    object = this.s;
                    if (object != null && (hr1_02 = (hr1_0)((Qi1)object).c(n8)) != null) {
                        Object[] objectArray = hr1_02.a;
                        n14 = hr1_02.b;
                        for (int i3 = 0; i3 < n14; ++i3) {
                            Object object2 = objectArray[i3];
                            this.B(object2);
                        }
                        object = (hr1_0)((tr1_1)object).h(n8);
                    }
                    object = this.b;
                    n73.n(n7, n3, (int[])object);
                    object = this.b;
                    n73.o(n7, n4, (int[])object);
                    n17 = fj12.a();
                    if (bl2) {
                        n4 = 1;
                    }
                    this.o = n17 += n4;
                    object = this.b;
                    this.v = n17 = this.A((int[])object, n8);
                    if (n17 < 0) {
                        n17 = this.n();
                    } else {
                        n17 += n16;
                        n17 = this.p(n17);
                    }
                    if (n17 >= 0) {
                        int[] nArray2 = this.b;
                        n15 = this.f(nArray2, n17);
                    }
                    this.i = n15;
                    this.j = n15;
                    break block19;
                }
                if (n14 != n10) break block20;
                object = this.b;
                n17 = n73.e((int[])object, n7);
                int[] nArray = this.b;
                n16 = n73.j(nArray, n7);
                Object object3 = this.b;
                n73.n(n7, n3, (int[])object3);
                object3 = this.b;
                n73.o(n7, n4, (int[])object3);
                object3 = this.p;
                n14 = ((fj1)object3).a();
                n10 = this.m();
                n7 = this.h;
                n10 -= n7;
                fj1 fj13 = this.q;
                n7 = fj13.a();
                this.u = n10 -= n7;
                this.v = n14;
                int[] nArray3 = this.b;
                n10 = this.A(nArray3, n8);
                this.o = n8 = fj12.a();
                if (n10 == n14) {
                    if (!bl2) {
                        n15 = n4 - n16;
                    }
                    this.o = n8 += n15;
                } else {
                    n4 = bl2 ? 0 : (n4 -= n16);
                    if ((n3 -= n17) != 0 || n4 != 0) {
                        while (n10 != 0 && n10 != n14 && (n4 != 0 || n3 != 0)) {
                            n17 = this.p(n10);
                            if (n3 != 0) {
                                nArray = this.b;
                                n16 = n73.e(nArray, n17) + n3;
                                int[] nArray4 = this.b;
                                n73.n(n17, n16, nArray4);
                            }
                            if (n4 != 0) {
                                nArray = this.b;
                                n8 = n73.j(nArray, n17) + n4;
                                n73.o(n17, n8, nArray);
                            }
                            if ((n17 = (int)(n73.h(nArray = this.b, n17) ? 1 : 0)) != 0) {
                                n4 = 0;
                            }
                            object = this.b;
                            n10 = this.A((int[])object, n10);
                        }
                    }
                    this.o = n17 = this.o + n4;
                }
            }
            return;
        }
        p30_0.c("Expected to be at the end of a group");
        throw null;
    }

    public final void j() {
        fj1 fj12;
        int n3;
        int n4 = this.n;
        if (n4 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            fj12 = null;
        }
        if (n3 != 0) {
            this.n = n4 += -1;
            if (n4 == 0) {
                fj1 fj13 = this.r;
                n4 = fj13.b;
                fj12 = this.p;
                n3 = fj12.b;
                if (n4 == n3) {
                    n4 = this.m();
                    n3 = this.h;
                    n4 -= n3;
                    fj12 = this.q;
                    n3 = fj12.a();
                    this.u = n4 -= n3;
                } else {
                    p30_0.c("startGroup/endGroup mismatch while inserting");
                    throw null;
                }
            }
            return;
        }
        sn2.c("Unbalanced begin/end insert");
        throw null;
    }

    public final void k(int n3) {
        int n4 = this.n;
        int n7 = 0;
        StringBuilder stringBuilder = null;
        int n8 = 1;
        if ((n4 = n4 <= 0 ? 1 : 0) != 0) {
            n4 = this.v;
            if (n4 != n3) {
                int n10;
                if (n3 >= n4 && n3 < (n10 = this.u)) {
                    n7 = 1;
                }
                if (n7 != 0) {
                    n4 = this.t;
                    n7 = this.i;
                    n8 = this.j;
                    this.t = n3;
                    this.L();
                    this.t = n4;
                    this.i = n7;
                    this.j = n8;
                } else {
                    stringBuilder = new StringBuilder("Started group at ");
                    stringBuilder.append(n3);
                    stringBuilder.append(" must be a subgroup of the group at ");
                    stringBuilder.append(n4);
                    p30_0.c(stringBuilder.toString());
                    throw null;
                }
            }
            return;
        }
        p30_0.c("Cannot call ensureStarted() while inserting");
        throw null;
    }

    public final void l(int n3, int n4, int n7) {
        int n8 = this.g;
        if (n3 >= n8) {
            n8 = this.n() - n3 + 2;
            n3 = -n8;
        }
        while (n7 < n4) {
            int[] nArray = this.b;
            int n10 = this.p(n7) * 5 + 2;
            nArray[n10] = n3;
            nArray = this.b;
            n10 = this.p(n7);
            n8 = n73.e(nArray, n10) + n7;
            n10 = n7 + 1;
            this.l(n7, n8, n10);
            n7 = n8;
        }
    }

    public final int m() {
        return this.b.length / 5;
    }

    public final int n() {
        int n3 = this.m();
        int n4 = this.h;
        return n3 - n4;
    }

    public final int o() {
        int n3 = this.c.length;
        int n4 = this.l;
        return n3 - n4;
    }

    public final int p(int n3) {
        int n4 = this.g;
        if (n3 >= n4) {
            n4 = this.h;
            n3 += n4;
        }
        return n3;
    }

    public final int q(int n3) {
        int[] nArray = this.b;
        n3 = this.p(n3);
        return n73.e(nArray, n3);
    }

    /*
     * Unable to fully structure code
     */
    public final boolean r(int var1_1, int var2_2) {
        block10: {
            var3_3 = this.v;
            var4_4 = false;
            if (var2_2 == var3_3) {
                var3_3 = this.u;
            } else {
                block11: {
                    var5_5 = this.p;
                    var6_6 = var5_5.b;
                    if (var6_6 > 0) {
                        var7_7 = var5_5.a;
                        var8_8 = var6_6 + -1;
                        var9_9 = var7_7[var8_8];
                    } else {
                        var9_9 = 0;
                        var7_7 = null;
                    }
                    if (var2_2 > var9_9) {
                        var3_3 = this.q(var2_2);
lbl17:
                        // 2 sources

                        while (true) {
                            var3_3 += var2_2;
                            break block10;
                            break;
                        }
                    }
                    var7_7 = null;
                    for (var9_9 = 0; var9_9 < var6_6; ++var9_9) {
                        var10_10 = var5_5.a;
                        var8_8 = var10_10[var9_9];
                        if (var8_8 != var2_2) {
                            continue;
                        }
                        break block11;
                    }
                    var9_9 = -1;
                }
                if (var9_9 < 0) {
                    var3_3 = this.q(var2_2);
                    ** continue;
                }
                var3_3 = this.m();
                var6_6 = this.h;
                var3_3 -= var6_6;
                var11_11 = this.q.a;
                var6_6 = var11_11[var9_9];
                var3_3 -= var6_6;
            }
        }
        if (var1_1 > var2_2 && var1_1 < var3_3) {
            var4_4 = true;
        }
        return var4_4;
    }

    public final void s(int n3) {
        if (n3 > 0) {
            int n4;
            int n7 = this.t;
            this.w(n7);
            int n8 = this.g;
            int n10 = this.h;
            int[] nArray = this.b;
            int n14 = nArray.length / 5;
            int n15 = n14 - n10;
            int n16 = 0;
            if (n10 < n3) {
                int n17 = n14 * 2;
                int n18 = n15 + n3;
                n17 = Math.max(Math.max(n17, n18), 32);
                n18 = n17 * 5;
                int[] nArray2 = new int[n18];
                n10 += n8;
                int n19 = n8 + (n17 -= n15);
                int n20 = n8 * 5;
                rp_1.f(0, 0, n20, nArray, nArray2);
                rp_1.f(n19 *= 5, n10 *= 5, n14 *= 5, nArray, nArray2);
                this.b = nArray2;
                n10 = n17;
            }
            if ((n4 = this.u) >= n8) {
                this.u = n4 += n3;
            }
            this.g = n4 = n8 + n3;
            this.h = n10 -= n3;
            if (n15 > 0) {
                n7 += n3;
                int[] nArray3 = this.b;
                n7 = this.p(n7);
                n7 = this.f(nArray3, n7);
            } else {
                n7 = 0;
            }
            n10 = this.m;
            if (n10 >= n8) {
                n16 = this.k;
            }
            n10 = this.l;
            Object[] objectArray = this.c;
            n14 = objectArray.length;
            n7 = q73.h(n7, n16, n10, n14);
            for (n10 = n8; n10 < n4; ++n10) {
                objectArray = this.b;
                n15 = n10 * 5 + 4;
                objectArray[n15] = n7;
            }
            n7 = this.m;
            if (n7 >= n8) {
                this.m = n7 += n3;
            }
        }
    }

    public final void t(int n3, int n4) {
        if (n3 > 0) {
            int n7;
            int n8 = this.i;
            this.x(n8, n4);
            n4 = this.k;
            n8 = this.l;
            if (n8 < n3) {
                Object[] objectArray = this.c;
                int n10 = objectArray.length;
                int n14 = n10 - n8;
                int n15 = n10 * 2;
                int n16 = n14 + n3;
                n15 = Math.max(n15, n16);
                n16 = 32;
                n15 = Math.max(n15, n16);
                Object[] objectArray2 = new Object[n15];
                for (int i3 = 0; i3 < n15; ++i3) {
                    objectArray2[i3] = null;
                }
                n15 -= n14;
                n14 = n4 + n15;
                rp_1.i(objectArray, 0, objectArray2, 0, n4);
                rp_1.i(objectArray, n14, objectArray2, n8 += n4, n10);
                this.c = objectArray2;
                n8 = n15;
            }
            if ((n7 = this.j) >= n4) {
                this.j = n7 += n3;
            }
            this.k = n4 += n3;
            this.l = n8 -= n3;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SlotWriter(current = ");
        int n3 = this.t;
        stringBuilder.append(n3);
        stringBuilder.append(" end=");
        n3 = this.u;
        stringBuilder.append(n3);
        stringBuilder.append(" size = ");
        n3 = this.n();
        stringBuilder.append(n3);
        stringBuilder.append(" gap=");
        n3 = this.g;
        stringBuilder.append(n3);
        stringBuilder.append('-');
        n3 = this.g;
        int n4 = this.h;
        stringBuilder.append(n3 += n4);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final void v(l73 l732, int n3) {
        Object object;
        q73 q732 = this;
        l73 l733 = l732;
        int n4 = n3;
        int n7 = this.n;
        int n8 = 1;
        if (n7 > 0) {
            n7 = 1;
        } else {
            n7 = 0;
            object = null;
        }
        p30_0.h(n7 != 0);
        if (n4 == 0 && (n7 = q732.t) == 0) {
            int n10;
            object = q732.a;
            n7 = ((l73)object).b;
            if (n7 == 0 && (n7 = n73.e((int[])(object = (Object)l733.a), n4)) == (n10 = l733.b)) {
                ArrayList arrayList;
                object = q732.b;
                Object[] objectArray = q732.c;
                ArrayList arrayList2 = q732.d;
                HashMap hashMap = q732.e;
                tr1_1 tr1_12 = q732.f;
                int[] nArray = l733.a;
                Object[] objectArray2 = l733.c;
                int n14 = l733.d;
                HashMap hashMap2 = l733.i;
                tr1_1 tr1_13 = l733.j;
                q732.b = nArray;
                q732.c = objectArray2;
                q732.d = arrayList = l733.h;
                q732.g = n10;
                q732.h = n8 = nArray.length / 5 - n10;
                q732.k = n14;
                q732.l = n8 = objectArray2.length - n14;
                q732.m = n10;
                q732.e = hashMap2;
                q732.f = tr1_13;
                l733.a = (int[])object;
                l733.b = 0;
                l733.c = objectArray;
                l733.d = 0;
                l733.h = arrayList2;
                l733.i = hashMap;
                l733.j = tr1_12;
                return;
            }
        }
        q73 q733 = l732.i();
        boolean bl2 = true;
        boolean bl3 = true;
        Object var13_15 = null;
        object = q733;
        n4 = n3;
        try {
            q73$a.a(q733, n3, this, bl2, bl3, false);
            q733.e(n8 != 0);
            return;
        }
        catch (Throwable throwable) {
            object = throwable;
            q733.e(false);
            throw throwable;
        }
    }

    public final void w(int n3) {
        int n4 = this.h;
        int n7 = this.g;
        if (n7 != n3) {
            int[] nArray;
            int n8;
            int n10;
            int n14;
            Object object = this.d;
            int n15 = object.isEmpty();
            int n16 = 1;
            if ((n15 ^= n16) != 0) {
                Object object2;
                n15 = this.h;
                n14 = this.m() - n15;
                if (n7 < n3) {
                    object = this.d;
                    for (n15 = n73.i((ArrayList)object, n7, n14); n15 < (n10 = ((ArrayList)(object2 = this.d)).size()); ++n15) {
                        object2 = (Ae)this.d.get(n15);
                        n8 = ((Ae)object2).a;
                        if (n8 < 0 && (n8 += n14) < n3) {
                            ((Ae)object2).a = n8;
                            continue;
                        }
                        break;
                    }
                } else {
                    object = this.d;
                    for (n15 = n73.i((ArrayList)object, n3, n14); n15 < (n10 = ((ArrayList)(object2 = this.d)).size()); ++n15) {
                        object2 = (Ae)this.d.get(n15);
                        n8 = ((Ae)object2).a;
                        if (n8 >= 0) {
                            ((Ae)object2).a = n8 = -(n14 - n8);
                            continue;
                        }
                        break;
                    }
                }
            }
            if (n4 > 0) {
                object = this.b;
                n14 = n3 * 5;
                n10 = n4 * 5;
                n8 = n7 * 5;
                if (n3 < n7) {
                    rp_1.f(n10 += n14, n14, n8, (int[])object, (int[])object);
                } else {
                    int n17 = n8 + n10;
                    rp_1.f(n8, n17, n14 += n10, (int[])object, (int[])object);
                }
            }
            if (n3 < n7) {
                n7 = n3 + n4;
            }
            if (n7 >= (n15 = this.m())) {
                n16 = 0;
                nArray = null;
            }
            p30_0.h(n16 != 0);
            while (n7 < n15) {
                nArray = this.b;
                n16 = n73.l(nArray, n7);
                n10 = n16 > (n14 = -2) ? n16 : this.n() + n16 - n14;
                if (n10 >= n3) {
                    n8 = this.n() - n10 - n14;
                    n10 = -n8;
                }
                if (n10 != n16) {
                    nArray = this.b;
                    n14 = n7 * 5 + 2;
                    nArray[n14] = n10;
                }
                if (++n7 != n3) continue;
                n7 += n4;
            }
        }
        this.g = n3;
    }

    public final void x(int n3, int n4) {
        int n7;
        int n8;
        int n10 = this.l;
        int n14 = this.k;
        int n15 = this.m;
        if (n14 != n3) {
            Object[] objectArray = this.c;
            if (n3 < n14) {
                n8 = n3 + n10;
                rp_1.i(objectArray, n8, objectArray, n3, n14);
            } else {
                n8 = n14 + n10;
                n7 = n3 + n10;
                rp_1.i(objectArray, n14, objectArray, n8, n7);
            }
        }
        ++n4;
        n14 = this.n();
        if (n15 != (n4 = Math.min(n4, n14))) {
            Object[] objectArray = this.c;
            n14 = objectArray.length - n10;
            n10 = 0;
            if (n4 < n15) {
                int n16 = this.p(n4);
                n15 = this.p(n15);
                n8 = this.g;
                while (n16 < n15) {
                    int[] nArray = this.b;
                    n7 = n73.d(nArray, n16);
                    if (n7 >= 0) {
                        int[] nArray2 = this.b;
                        n7 = -(n14 - n7 + 1);
                        int n17 = n16 * 5 + 4;
                        nArray2[n17] = n7;
                        if (++n16 != n8) continue;
                        n7 = this.h;
                        n16 += n7;
                        continue;
                    }
                    p30_0.c("Unexpected anchor value, expected a positive anchor");
                    throw null;
                }
            } else {
                n15 = this.p(n15);
                int n18 = this.p(n4);
                while (n15 < n18) {
                    int[] nArray = this.b;
                    n8 = n73.d(nArray, n15);
                    if (n8 < 0) {
                        int[] nArray3 = this.b;
                        n8 = n8 + n14 + 1;
                        int n19 = n15 * 5 + 4;
                        nArray3[n19] = n8;
                        n8 = this.g;
                        if (++n15 != n8) continue;
                        n8 = this.h;
                        n15 += n8;
                        continue;
                    }
                    p30_0.c("Unexpected anchor value, expected a negative anchor");
                    throw null;
                }
            }
            this.m = n4;
        }
        this.k = n3;
    }

    public final List y(Ae ae2, q73 object) {
        int n3;
        int[] nArray;
        int n4 = ((q73)object).n;
        boolean bl2 = true;
        if (n4 > 0) {
            n4 = 1;
        } else {
            n4 = 0;
            nArray = null;
        }
        p30_0.h(n4 != 0);
        n4 = this.n;
        if (n4 == 0) {
            n4 = 1;
        } else {
            n4 = 0;
            nArray = null;
        }
        p30_0.h(n4 != 0);
        n4 = ae2.a();
        p30_0.h(n4 != 0);
        int n7 = this.c(ae2) + 1;
        int n8 = this.t;
        if (n8 <= n7 && n7 < (n4 = this.u)) {
            n4 = 1;
        } else {
            n4 = 0;
            nArray = null;
        }
        p30_0.h(n4 != 0);
        nArray = this.b;
        n4 = this.A(nArray, n7);
        int n10 = this.q(n7);
        Object object2 = this.b;
        int n14 = this.p(n7);
        int n15 = n73.h(object2, n14);
        if (n15 != 0) {
            n3 = 1;
        } else {
            object2 = this.b;
            n14 = this.p(n7);
            n3 = n15 = n73.j(object2, n14);
        }
        int n16 = 0;
        boolean bl3 = true;
        object2 = this;
        Object object3 = object;
        object = q73$a.a(this, n7, (q73)object, false, false, bl3);
        this.Q(n4);
        if (n3 > 0) {
            n15 = 1;
        } else {
            n15 = 0;
            object2 = null;
        }
        while (n4 >= n8) {
            n7 = this.p(n4);
            object3 = this.b;
            n16 = n73.e((int[])object3, n7) - n10;
            n73.n(n7, n16, (int[])object3);
            if (n15 != 0) {
                object3 = this.b;
                n14 = (int)(n73.h((int[])object3, n7) ? 1 : 0);
                if (n14 != 0) {
                    n15 = 0;
                    object2 = null;
                } else {
                    object3 = this.b;
                    n16 = n73.j((int[])object3, n7) - n3;
                    n73.o(n7, n16, (int[])object3);
                }
            }
            int[] nArray2 = this.b;
            n4 = this.A(nArray2, n4);
        }
        if (n15 != 0) {
            n8 = this.o;
            if (n8 < n3) {
                bl2 = false;
            }
            p30_0.h(bl2);
            this.o = n8 = this.o - n3;
        }
        return object;
    }

    public final Object z(int n3) {
        Object object;
        Object[] objectArray = this.b;
        boolean bl2 = n73.h(objectArray, n3 = this.p(n3));
        if (bl2) {
            objectArray = this.c;
            int[] nArray = this.b;
            n3 = this.f(nArray, n3);
            n3 = this.g(n3);
            object = objectArray[n3];
        } else {
            n3 = 0;
            object = null;
        }
        return object;
    }
}

