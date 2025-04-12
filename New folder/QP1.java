/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

public final class QP1 {
    public final sg2_0 a;
    public final WR1 b;
    public final WR1 c;
    public final WR1 d;
    public final WR1 e;
    public boolean f;

    public QP1(sg2_0 object) {
        this.a = object;
        int n3 = 16;
        Object[] objectArray = new eu_1[n3];
        this.b = object = new WR1(objectArray);
        objectArray = new OP1[n3];
        this.c = object = new WR1(objectArray);
        objectArray = new xp1_0[n3];
        this.d = object = new WR1(objectArray);
        Object[] objectArray2 = new OP1[n3];
        this.e = object = new WR1(objectArray2);
    }

    public static void b(LP1$c lP1$c, OP1 oP1, HashSet hashSet) {
        lP1$c = lP1$c.a;
        boolean bl2 = lP1$c.m;
        if (bl2) {
            int n3;
            int n4 = 16;
            Object object = new LP1$c[n4];
            WR1 wR1 = new WR1((Object[])object);
            object = lP1$c.f;
            if (object == null) {
                go0.a(wR1, lP1$c);
            } else {
                wR1.b(object);
            }
            block0: while ((n3 = wR1.l()) != 0) {
                n3 = wR1.c;
                int n7 = 1;
                lP1$c = (LP1$c)wR1.n(n3 -= n7);
                int n8 = lP1$c.d & 0x20;
                if (n8 != 0) {
                    LP1$c lP1$c2 = lP1$c;
                    while (lP1$c2 != null) {
                        int n10 = lP1$c2.c & 0x20;
                        if (n10 != 0) {
                            WR1 wR12 = null;
                            Object object2 = lP1$c2;
                            while (object2 != null) {
                                int n14;
                                LP1$b lP1$b;
                                Object object3;
                                int n15 = object2 instanceof rp1_0;
                                if (n15 != 0) {
                                    n15 = (object2 = (rp1_0)object2) instanceof eu_1;
                                    if (n15 != 0) {
                                        object3 = object2;
                                        object3 = (eu_1)object2;
                                        lP1$b = ((eu_1)object3).n;
                                        n14 = lP1$b instanceof pp1_0;
                                        if (n14 != 0 && (n15 = (int)(((HashSet)(object3 = ((eu_1)object3).q)).contains(oP1) ? 1 : 0)) != 0) {
                                            hashSet.add(object2);
                                        }
                                    }
                                    if ((n10 = ((i0_0)(object2 = ((rp1_0)object2).S())).F(oP1) ^ n7) == 0) {
                                        continue block0;
                                    }
                                } else {
                                    n15 = ((LP1$c)object2).c & 0x20;
                                    if (n15 != 0 && (n15 = object2 instanceof mo0_0) != 0) {
                                        object3 = object2;
                                        object3 = ((mo0_0)object2).o;
                                        n14 = 0;
                                        lP1$b = null;
                                        while (object3 != null) {
                                            int n16 = ((LP1$c)object3).c & 0x20;
                                            if (n16 != 0) {
                                                if (++n14 == n7) {
                                                    object2 = object3;
                                                } else {
                                                    if (wR12 == null) {
                                                        Object[] objectArray = new LP1$c[n4];
                                                        wR12 = new WR1(objectArray);
                                                    }
                                                    if (object2 != null) {
                                                        wR12.b(object2);
                                                        n10 = 0;
                                                        object2 = null;
                                                    }
                                                    wR12.b(object3);
                                                }
                                            }
                                            object3 = ((LP1$c)object3).f;
                                        }
                                        if (n14 == n7) continue;
                                    }
                                }
                                object2 = go0.b(wR12);
                            }
                        }
                        lP1$c2 = lP1$c2.f;
                    }
                }
                go0.a(wR1, lP1$c);
            }
            return;
        }
        bh1_1.c("visitSubtreeIf called on an unattached node");
        throw null;
    }

    public final void a() {
        boolean bl2 = this.f;
        if (!bl2) {
            this.f = bl2 = true;
            QP1$a qP1$a = new QP1$a(this);
            sg2_0 sg2_02 = this.a;
            sg2_02.t(qP1$a);
        }
    }
}

