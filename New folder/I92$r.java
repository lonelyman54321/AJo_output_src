/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class I92$r
extends I92 {
    public static final I92$r c;

    static {
        I92$r i92$r;
        c = i92$r = new I92(1, 0, 2);
    }

    public final void a(R92$a r92$a, mp mp2, q73 q732, F30$a f30$a) {
        block13: {
            ArrayList<Object> arrayList;
            block14: {
                block16: {
                    block15: {
                        Object[] objectArray;
                        int n3;
                        int n4;
                        Object object;
                        int n7;
                        q73 q733 = q732;
                        int n8 = 0;
                        Object object2 = r92$a;
                        int n10 = q732.n;
                        int n14 = 1;
                        n10 = n10 == 0 ? 1 : 0;
                        int n15 = 0;
                        ArrayList arrayList2 = null;
                        if (n10 == 0) break block13;
                        n10 = n7 >= 0 ? 1 : 0;
                        arrayList = "Parameter offset is out of bounds";
                        if (n10 == 0) break block14;
                        if (n7 == 0) break block15;
                        n10 = q733.t;
                        int n16 = q733.v;
                        int n17 = q733.u;
                        int n18 = n10;
                        for (n7 = r92$a.a(0); n7 > 0; n7 += -1) {
                            object = q733.b;
                            if ((n18 += (n4 = n73.e(object, n3 = q733.p(n18)))) <= n17) {
                                continue;
                            }
                            p30_0.c((String)((Object)arrayList));
                            throw null;
                        }
                        object2 = q733.b;
                        int n19 = q733.p(n18);
                        n7 = n73.e((int[])object2, n19);
                        arrayList = (ArrayList<Object>)q733.b;
                        n17 = q733.t;
                        n17 = q733.p(n17);
                        n19 = q733.f((int[])arrayList, n17);
                        int[] nArray = q733.b;
                        n4 = q733.p(n18);
                        n17 = q733.f(nArray, n4);
                        object = q733.b;
                        n3 = q733.p(n18 += n7);
                        n4 = q733.f((int[])object, n3);
                        n3 = n4 - n17;
                        int n20 = Math.max(q733.t - n14, 0);
                        q733.t(n3, n20);
                        q733.s(n7);
                        Object object3 = q733.b;
                        int n21 = q733.p(n18) * 5;
                        int n22 = q733.p(n10) * 5;
                        int n24 = n7 * 5 + n21;
                        rp_1.f(n22, n21, n24, object3, object3);
                        if (n3 > 0) {
                            objectArray = q733.c;
                            n22 = n17 + n3;
                            n22 = q733.g(n22);
                            n4 += n3;
                            n4 = q733.g(n4);
                            rp_1.i(objectArray, n19, objectArray, n22, n4);
                        }
                        n19 = (n17 += n3) - n19;
                        n4 = q733.k;
                        n21 = q733.l;
                        Object object4 = q733.c;
                        n22 = ((Object[])object4).length;
                        n24 = q733.m;
                        n8 = n10 + n7;
                        for (n15 = n10; n15 < n8; ++n15) {
                            n14 = q733.p(n15);
                            int n25 = q733.f((int[])object3, n14);
                            int n26 = n8;
                            n8 = n25 - n19;
                            n25 = n19;
                            if (n24 < n14) {
                                n19 = 0;
                                arrayList = null;
                            } else {
                                n19 = n4;
                            }
                            n8 = q73.h(n8, n19, n21, n22);
                            n19 = q733.k;
                            int n27 = n4;
                            n4 = q733.l;
                            int n28 = n21;
                            objectArray = q733.c;
                            n21 = objectArray.length;
                            n8 = q73.h(n8, n19, n4, n21);
                            n14 = n14 * 5 + 4;
                            object3[n14] = n8;
                            n19 = n25;
                            n8 = n26;
                            n4 = n27;
                            n21 = n28;
                            n14 = 1;
                        }
                        n8 = n18 + n7;
                        n14 = q732.n();
                        arrayList2 = q733.d;
                        n15 = n73.i(arrayList2, n18, n14);
                        arrayList = new ArrayList<Object>();
                        if (n15 >= 0) {
                            while (n15 < (n4 = (object = (Object)q733.d).size()) && (n20 = q733.c((Ae)(object = (Ae)q733.d.get(n15)))) >= n18 && n20 < n8) {
                                arrayList.add(object);
                                object = q733.d;
                                object.remove(n15);
                            }
                        }
                        n8 = n10 - n18;
                        n15 = arrayList.size();
                        object = null;
                        for (n4 = 0; n4 < n15; ++n4) {
                            object3 = (Ae)arrayList.get(n4);
                            n21 = q733.c((Ae)object3) + n8;
                            object3.a = n21 >= (n22 = q733.g) ? (n22 = -(n14 - n21)) : n21;
                            n21 = n73.i(q733.d, n21, n14);
                            object4 = q733.d;
                            ((ArrayList)object4).add(n21, object3);
                        }
                        n8 = (int)(q733.E(n18, n7) ? 1 : 0);
                        n7 = 1;
                        if ((n8 ^= n7) == 0) break block16;
                        n8 = q733.u;
                        q733.l(n16, n8, n10);
                        if (n3 > 0) {
                            q733.F(n17, n3, n18 -= n7);
                        }
                    }
                    return;
                }
                p30_0.c("Unexpectedly removed anchors");
                throw null;
            }
            p30_0.c((String)((Object)arrayList));
            throw null;
        }
        p30_0.c("Cannot move a group while inserting");
        throw null;
    }

    public final String b(int n3) {
        boolean bl2 = I92$q.a(n3, 0);
        String string2 = bl2 ? "offset" : super.b(n3);
        return string2;
    }
}

