/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final class Ik
implements al1_1 {
    public final ll_2 a;
    public boolean b;

    public Ik(ll_2 ll_22) {
        this.a = ll_22;
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

    public final bl1_0 c(dl1_1 dl1_12, List object, long l2) {
        Object object2;
        int n3;
        Object object3;
        Object e2;
        int n4;
        Object object4;
        int n7;
        int n8 = object.size();
        ArrayList<Ns2> arrayList = new ArrayList<Ns2>(n8);
        n8 = object.size();
        int n10 = 0;
        for (n7 = 0; n7 < n8; ++n7) {
            Ns2 ns2 = ((xk1_0)object.get(n7)).Q(l2);
            arrayList.add(ns2);
        }
        int n14 = arrayList.isEmpty();
        int n15 = 1;
        boolean bl2 = false;
        Object object5 = null;
        if (n14 != 0) {
            n14 = 0;
            object = null;
        } else {
            object4 = object = arrayList.get(0);
            object4 = (Ns2)object;
            n8 = ((Ns2)object4).a;
            n7 = xx_2.h(arrayList);
            if (n15 <= n7) {
                n4 = 1;
                while (true) {
                    object3 = e2 = arrayList.get(n4);
                    object3 = (Ns2)e2;
                    n3 = ((Ns2)object3).a;
                    if (n8 < n3) {
                        object = e2;
                        n8 = n3;
                    }
                    if (n4 == n7) break;
                    ++n4;
                }
            }
        }
        object = (Ns2)object;
        if (object != null) {
            n14 = ((Ns2)object).a;
        } else {
            n14 = 0;
            object = null;
        }
        n8 = (int)(arrayList.isEmpty() ? 1 : 0);
        if (n8 == 0) {
            object4 = object5 = arrayList.get(0);
            object4 = object5;
            n8 = ((Ns2)object4).b;
            n7 = xx_2.h(arrayList);
            if (n15 <= n7) {
                n4 = 1;
                while (true) {
                    object3 = e2 = arrayList.get(n4);
                    object3 = (Ns2)e2;
                    n3 = ((Ns2)object3).b;
                    if (n8 < n3) {
                        object5 = e2;
                        n8 = n3;
                    }
                    if (n4 == n7) break;
                    ++n4;
                }
            }
        }
        object5 = (Ns2)object5;
        if (object5 != null) {
            n10 = ((Ns2)object5).b;
        }
        bl2 = dl1_12.W();
        object4 = this.a;
        if (bl2) {
            this.b = n15;
            object2 = ((ll_2)object4).a;
            long l3 = dj1.a(n14, n10);
            object5 = new bj1(l3);
            ((h83_0)object2).setValue(object5);
        } else {
            n15 = (int)(this.b ? 1 : 0);
            if (n15 == 0) {
                object2 = ((ll_2)object4).a;
                long l4 = dj1.a(n14, n10);
                object5 = new bj1(l4);
                ((h83_0)object2).setValue(object5);
            }
        }
        object2 = new Ik$a(arrayList);
        return cl1_0.a(dl1_12, n14, n10, (Function1)object2);
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

