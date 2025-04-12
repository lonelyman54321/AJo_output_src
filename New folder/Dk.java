/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;

public final class Dk
implements al1_1 {
    public final Hk a;

    public Dk(Hk hk) {
        this.a = hk;
    }

    public final int a(Rj1 object, List list, int n3) {
        int n4 = list.isEmpty();
        int n7 = 0;
        if (n4 != 0) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((Qj1)list.get(0)).P(n3);
            object = n4;
            int n8 = 1;
            int n10 = xx_2.h(list);
            if (n8 <= n10) {
                while (true) {
                    int n14;
                    Integer n15;
                    int n16;
                    if ((n16 = (n15 = Integer.valueOf(n14 = ((Qj1)list.get(n8)).P(n3))).compareTo(object)) > 0) {
                        object = n15;
                    }
                    if (n8 == n10) break;
                    ++n8;
                }
            }
        }
        if (object != null) {
            n7 = (Integer)object;
        }
        return n7;
    }

    public final bl1_0 c(dl1_1 dl1_12, List list, long l2) {
        bj1 bj12;
        Object object;
        int n3;
        Object object2;
        int n4;
        Object object3;
        Object object4;
        Object object5;
        Dk dk2 = this;
        Object object6 = list;
        long l3 = l2;
        int n7 = 1;
        int n8 = list.size();
        Ns2[] ns2Array = new Ns2[n8];
        int n10 = list.size();
        long l4 = 0L;
        int n14 = 0;
        int n15 = 0;
        Object object7 = null;
        while (true) {
            int n16 = 0;
            object5 = null;
            if (n15 >= n10) break;
            object4 = (xk1_0)object6.get(n15);
            object3 = object4.B();
            boolean bl2 = object3 instanceof Hk$a;
            if (bl2) {
                object5 = object3;
                object5 = (Hk$a)object3;
            }
            if (object5 != null && (n16 = ((Boolean)(object5 = (Boolean)((Hk$a)object5).b.getValue())).booleanValue()) == n7) {
                Ns2 ns2 = object4.Q(l3);
                int n17 = ns2.a;
                n16 = ns2.b;
                long l7 = dj1.a(n17, n16);
                ns2Array[n15] = ns2;
                l4 = l7;
            }
            n15 += n7;
        }
        n10 = list.size();
        object7 = null;
        for (n15 = 0; n15 < n10; n15 += n7) {
            object4 = (xk1_0)object6.get(n15);
            object3 = ns2Array[n15];
            if (object3 != null) continue;
            ns2Array[n15] = object4 = object4.Q(l3);
        }
        int n18 = dl1_12.W();
        Object object8 = "<this>";
        if (n18 != 0) {
            long l8 = l4 >> 32;
            n18 = (int)l8;
        } else {
            if (n8 == 0) {
                n18 = 0;
                object6 = null;
            } else {
                object6 = ns2Array[0];
                Intrinsics.checkNotNullParameter(ns2Array, (String)object8);
                n4 = n8 + -1;
                if (n4 != 0) {
                    n10 = object6 != null ? ((Ns2)object6).a : 0;
                    object7 = new c(n7, n4, n7);
                    object2 = ((c)object7).d();
                    while ((n15 = (int)(((ui1_2)object2).c ? 1 : 0)) != 0) {
                        int n19;
                        n15 = ((ui1_2)object2).nextInt();
                        object7 = ns2Array[n15];
                        if (object7 != null) {
                            n19 = ((Ns2)object7).a;
                        } else {
                            n19 = 0;
                            object4 = null;
                        }
                        if (n10 >= n19) continue;
                        object6 = object7;
                        n10 = n19;
                    }
                }
            }
            if (object6 != null) {
                n18 = ((Ns2)object6).a;
            } else {
                n18 = 0;
                object6 = null;
            }
        }
        n4 = dl1_12.W();
        if (n4 != 0) {
            l3 = 0xFFFFFFFFL & l4;
            n14 = (int)l3;
        } else {
            if (n8 != 0) {
                object5 = ns2Array[0];
                Intrinsics.checkNotNullParameter(ns2Array, (String)object8);
                if ((n8 -= n7) != 0) {
                    if (object5 != null) {
                        n3 = ((Ns2)object5).b;
                    } else {
                        n3 = 0;
                        object8 = null;
                    }
                    object2 = new c(n7, n8, n7);
                    object2 = ((c)object2).d();
                    while ((n7 = (int)(((ui1_2)object2).c ? 1 : 0)) != 0) {
                        n7 = ((ui1_2)object2).nextInt();
                        object = ns2Array[n7];
                        if (object != null) {
                            n8 = ((Ns2)object).b;
                        } else {
                            n8 = 0;
                            bj12 = null;
                        }
                        if (n3 >= n8) continue;
                        object5 = object;
                        n3 = n8;
                    }
                }
            }
            if (object5 != null) {
                n14 = ((Ns2)object5).b;
            }
        }
        n3 = dl1_12.W();
        if (n3 == 0) {
            l3 = dj1.a(n18, n14);
            object = dk2.a.c;
            bj12 = new bj1(l3);
            ((h83_0)object).setValue(bj12);
        }
        object8 = new Dk$a(ns2Array, dk2, n18, n14);
        object2 = dl1_12;
        return cl1_0.a(dl1_12, n18, n14, (Function1)object8);
    }

    public final int h(Rj1 object, List list, int n3) {
        int n4 = list.isEmpty();
        int n7 = 0;
        if (n4 != 0) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((Qj1)list.get(0)).N(n3);
            object = n4;
            int n8 = 1;
            int n10 = xx_2.h(list);
            if (n8 <= n10) {
                while (true) {
                    int n14;
                    Integer n15;
                    int n16;
                    if ((n16 = (n15 = Integer.valueOf(n14 = ((Qj1)list.get(n8)).N(n3))).compareTo(object)) > 0) {
                        object = n15;
                    }
                    if (n8 == n10) break;
                    ++n8;
                }
            }
        }
        if (object != null) {
            n7 = (Integer)object;
        }
        return n7;
    }

    public final int i(Rj1 object, List list, int n3) {
        int n4 = list.isEmpty();
        int n7 = 0;
        if (n4 != 0) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((Qj1)list.get(0)).v(n3);
            object = n4;
            int n8 = 1;
            int n10 = xx_2.h(list);
            if (n8 <= n10) {
                while (true) {
                    int n14;
                    Integer n15;
                    int n16;
                    if ((n16 = (n15 = Integer.valueOf(n14 = ((Qj1)list.get(n8)).v(n3))).compareTo(object)) > 0) {
                        object = n15;
                    }
                    if (n8 == n10) break;
                    ++n8;
                }
            }
        }
        if (object != null) {
            n7 = (Integer)object;
        }
        return n7;
    }

    public final int j(Rj1 object, List list, int n3) {
        int n4 = list.isEmpty();
        int n7 = 0;
        if (n4 != 0) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((Qj1)list.get(0)).I(n3);
            object = n4;
            int n8 = 1;
            int n10 = xx_2.h(list);
            if (n8 <= n10) {
                while (true) {
                    int n14;
                    Integer n15;
                    int n16;
                    if ((n16 = (n15 = Integer.valueOf(n14 = ((Qj1)list.get(n8)).I(n3))).compareTo(object)) > 0) {
                        object = n15;
                    }
                    if (n8 == n10) break;
                    ++n8;
                }
            }
        }
        if (object != null) {
            n7 = (Integer)object;
        }
        return n7;
    }
}

