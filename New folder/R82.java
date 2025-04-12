/*
 * Decompiled with CFR 0.152.
 */
public final class R82 {
    public final WR1 a;
    public xp1_0[] b;

    public R82() {
        WR1 wR1;
        Object[] objectArray = new xp1_0[16];
        this.a = wR1 = new WR1(objectArray);
    }

    public static void a(xp1_0 objectArray) {
        int n3;
        int n4;
        Object object = objectArray.z;
        Object object2 = ((bq1)object).c;
        Xp1$d xp1$d = Xp1$d.Idle;
        int n7 = 1;
        int n8 = 0;
        if (object2 == xp1$d && (n4 = ((bq1)object).e) == 0 && (n3 = ((bq1)object).d) == 0 && (n3 = (int)(objectArray.I ? 1 : 0)) == 0 && (n3 = (int)(objectArray.L() ? 1 : 0)) != 0) {
            object = objectArray.y.e;
            n4 = ((LP1$c)object).d;
            int n10 = 256;
            if ((n4 &= n10) != 0) {
                while (object != null) {
                    n4 = ((LP1$c)object).c & n10;
                    if (n4 != 0) {
                        n4 = 0;
                        object2 = null;
                        Object object3 = object;
                        WR1 wR1 = null;
                        while (object3 != null) {
                            Object object4;
                            int n14 = object3 instanceof c01_0;
                            if (n14 != 0) {
                                object3 = (c01_0)object3;
                                object4 = go0.d((fo0)object3, n10);
                                object3.X((w32_0)object4);
                            } else {
                                n14 = ((LP1$c)object3).c & n10;
                                if (n14 != 0 && (n14 = object3 instanceof mo0_0) != 0) {
                                    object4 = object3;
                                    object4 = ((mo0_0)object3).o;
                                    int n15 = 0;
                                    while (object4 != null) {
                                        int n16 = ((LP1$c)object4).c & n10;
                                        if (n16 != 0) {
                                            if (++n15 == n7) {
                                                object3 = object4;
                                            } else {
                                                if (wR1 == null) {
                                                    n16 = 16;
                                                    Object[] objectArray2 = new LP1$c[n16];
                                                    wR1 = new WR1(objectArray2);
                                                }
                                                if (object3 != null) {
                                                    wR1.b(object3);
                                                    object3 = null;
                                                }
                                                wR1.b(object4);
                                            }
                                        }
                                        object4 = ((LP1$c)object4).f;
                                    }
                                    if (n15 == n7) continue;
                                }
                            }
                            object3 = go0.b(wR1);
                        }
                    }
                    if ((n4 = ((LP1$c)object).d & n10) == 0) break;
                    object = ((LP1$c)object).f;
                }
            }
        }
        objectArray.H = false;
        objectArray = objectArray.D();
        n3 = objectArray.c;
        if (n3 > 0) {
            objectArray = objectArray.a;
            do {
                object2 = (xp1_0)objectArray[n8];
                R82.a((xp1_0)object2);
            } while ((n8 += n7) < n3);
        }
    }
}

