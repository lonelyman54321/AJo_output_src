/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.layout.a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gk3
 */
public final class gk3_0
implements al1_1 {
    public final boolean a;
    public final float b;
    public final mk2_0 c;

    public gk3_0(boolean bl2, float f5, mk2_0 mk2_02) {
        this.a = bl2;
        this.b = f5;
        this.c = mk2_02;
    }

    public static int d(List object, int n3, Function2 function2) {
        int n4 = object.size();
        int n7 = 0;
        Number number = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            Object object2;
            int n8;
            Object object3;
            int n10;
            int n14;
            Object object4;
            int n15;
            Object object5;
            Object object6;
            block17: {
                Object object7;
                Object object8;
                block16: {
                    block15: {
                        object8 = object.get(i3);
                        object6 = object8;
                        object6 = lk3_0.c((Qj1)object8);
                        boolean bl2 = Intrinsics.areEqual(object6, object5 = "TextField");
                        if (!bl2) continue;
                        Number number2 = n3;
                        number2 = (Number)function2.invoke(object8, number2);
                        n4 = number2.intValue();
                        i3 = object.size();
                        n15 = 0;
                        object8 = null;
                        while (true) {
                            bl2 = false;
                            object6 = null;
                            if (n15 >= i3) break;
                            object7 = object5 = object.get(n15);
                            object7 = lk3_0.c((Qj1)object5);
                            n14 = Intrinsics.areEqual(object7, object4 = "Label");
                            if (n14 == 0) {
                                ++n15;
                                continue;
                            }
                            break block15;
                            break;
                        }
                        n10 = 0;
                        object5 = null;
                    }
                    object5 = (Qj1)object5;
                    if (object5 != null) {
                        number = n3;
                        number = (Number)function2.invoke(object5, number);
                        i3 = number.intValue();
                    } else {
                        i3 = 0;
                        number = null;
                    }
                    n15 = object.size();
                    object5 = null;
                    for (n10 = 0; n10 < n15; ++n10) {
                        object4 = object7 = object.get(n10);
                        object4 = lk3_0.c((Qj1)object7);
                        n8 = Intrinsics.areEqual(object4, object3 = "Trailing");
                        if (n8 == 0) {
                            continue;
                        }
                        break block16;
                    }
                    n14 = 0;
                    object7 = null;
                }
                object7 = (Qj1)object7;
                if (object7 != null) {
                    object8 = n3;
                    object8 = (Number)function2.invoke(object7, object8);
                    n15 = ((Number)object8).intValue();
                } else {
                    n15 = 0;
                    object8 = null;
                }
                n10 = object.size();
                object7 = null;
                for (n14 = 0; n14 < n10; ++n14) {
                    object3 = object4 = object.get(n14);
                    object3 = lk3_0.c((Qj1)object4);
                    boolean bl3 = Intrinsics.areEqual(object3, object2 = "Leading");
                    if (!bl3) {
                        continue;
                    }
                    break block17;
                }
                n8 = 0;
                object4 = null;
            }
            object4 = (Qj1)object4;
            if (object4 != null) {
                object5 = n3;
                object5 = (Number)function2.invoke(object4, object5);
                n10 = ((Number)object5).intValue();
            } else {
                n10 = 0;
                object5 = null;
            }
            n14 = object.size();
            object4 = null;
            for (n8 = 0; n8 < n14; ++n8) {
                String string2;
                object2 = object3 = object.get(n8);
                object2 = lk3_0.c((Qj1)object3);
                boolean bl4 = Intrinsics.areEqual(object2, string2 = "Hint");
                if (!bl4) continue;
                object6 = object3;
                break;
            }
            if ((object6 = (Qj1)object6) != null) {
                object = n3;
                object = (Number)function2.invoke(object6, object);
                n7 = ((Number)object).intValue();
            }
            long l2 = lk3_0.a;
            int n16 = Math.max(i3, n7);
            n16 = Math.max(n4, n16) + n10 + n15;
            int n17 = c60.k(l2);
            return Math.max(n16, n17);
        }
        object = new NoSuchElementException("Collection contains no element matching the predicate.");
        throw object;
    }

    public final int a(Rj1 object, List list, int n3) {
        object = Gk3$b.c;
        return gk3_0.d(list, n3, (Function2)object);
    }

    public final int b(Rj1 rj1, List list, int n3, Function2 function2) {
        Object object;
        int n4;
        int n7;
        Object object2;
        int n8;
        int n10;
        int n14;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        int n15;
        int n16;
        int n17;
        Function2 function22;
        int n18;
        Object object7;
        block21: {
            Object object8;
            block20: {
                block19: {
                    object7 = list;
                    n18 = n3;
                    function22 = function2;
                    n17 = 1;
                    n16 = list.size();
                    n15 = 0;
                    while (true) {
                        object6 = null;
                        if (n15 >= n16) break;
                        object4 = object5 = object7.get(n15);
                        object4 = lk3_0.c((Qj1)object5);
                        n14 = Intrinsics.areEqual(object4, object3 = "Leading");
                        if (!n14) {
                            n15 += n17;
                            continue;
                        }
                        break block19;
                        break;
                    }
                    n10 = 0;
                    object5 = null;
                }
                object5 = (Qj1)object5;
                n16 = -1 >>> 1;
                if (object5 != null) {
                    n15 = object5.P(n16);
                    n15 = n18 == n16 ? n18 : n18 - n15;
                    object4 = n3;
                    object5 = (Number)function22.invoke(object5, object4);
                    n8 = n10 = ((Number)object5).intValue();
                } else {
                    n15 = n18;
                    n8 = 0;
                }
                n10 = list.size();
                object4 = null;
                for (n14 = 0; n14 < n10; n14 += n17) {
                    object8 = object3 = object7.get(n14);
                    object8 = lk3_0.c((Qj1)object3);
                    n7 = Intrinsics.areEqual(object8, object2 = "Trailing");
                    if (n7 == 0) {
                        continue;
                    }
                    break block20;
                }
                n4 = 0;
                object3 = null;
            }
            object3 = (Qj1)object3;
            if (object3 != null) {
                n10 = object3.P(n16);
                if (n15 != n16) {
                    n15 -= n10;
                }
                object = n3;
                object = (Number)function22.invoke(object3, object);
                n7 = n18 = ((Number)object).intValue();
            } else {
                n7 = 0;
                object8 = null;
            }
            n18 = list.size();
            for (n16 = 0; n16 < n18; n16 += n17) {
                object4 = object5 = object7.get(n16);
                object4 = lk3_0.c((Qj1)object5);
                n14 = (int)(Intrinsics.areEqual(object4, object3 = "Label") ? 1 : 0);
                if (!n14) {
                    continue;
                }
                break block21;
            }
            n10 = 0;
            object5 = null;
        }
        object5 = (Qj1)object5;
        if (object5 != null) {
            object = n15;
            object = (Number)function22.invoke(object5, object);
            n4 = n18 = ((Number)object).intValue();
        } else {
            n4 = 0;
            object3 = null;
        }
        n18 = list.size();
        for (n16 = 0; n16 < n18; n16 += n17) {
            int n19;
            object4 = object5 = object7.get(n16);
            object4 = lk3_0.c((Qj1)object5);
            n14 = (int)(Intrinsics.areEqual(object4, object2 = "TextField") ? 1 : 0);
            if (!n14) continue;
            object = n15;
            object = (Number)function22.invoke(object5, object);
            n10 = ((Number)object).intValue();
            n18 = list.size();
            for (n16 = 0; n16 < n18; n16 += n17) {
                String string2;
                object4 = object7.get(n16);
                object2 = object4;
                object2 = lk3_0.c((Qj1)object4);
                n19 = Intrinsics.areEqual(object2, string2 = "Hint");
                if (n19 == 0) continue;
                object6 = object4;
                break;
            }
            if ((object6 = (Qj1)object6) != null) {
                int n20;
                object7 = n15;
                object7 = (Number)function22.invoke(object6, object7);
                n19 = n20 = ((Number)object7).intValue();
            } else {
                n19 = 0;
                object2 = null;
            }
            if (n4 > 0) {
                n14 = 1;
            } else {
                n14 = 0;
                object4 = null;
            }
            long l2 = lk3_0.a;
            float f5 = rj1.getDensity();
            object7 = this;
            object = this.c;
            return Fk3.b(n10, n14 != 0, n4, n8, n7, n19, l2, f5, (mk2_0)object);
        }
        object7 = new NoSuchElementException("Collection contains no element matching the predicate.");
        throw object7;
    }

    public final bl1_0 c(dl1_1 dl1_12, List list, long l2) {
        int n3;
        m91 m912;
        int n4;
        Ns2 ns2;
        int n7;
        int n8;
        int n10;
        Object object;
        Object object2;
        Object object3;
        int n14;
        Object object4;
        int n15;
        long l3;
        Object object5;
        int n16;
        Object object6;
        int n17;
        int n18;
        float f5;
        int n19;
        int n20;
        Object object7;
        Object object8;
        dl1_1 dl1_13;
        Object object9;
        block23: {
            int n21;
            Object object10;
            block22: {
                int n22;
                Ns2 ns22;
                block21: {
                    object9 = this;
                    dl1_13 = dl1_12;
                    object8 = list;
                    object7 = this.c;
                    float f6 = object7.calculateTopPadding-D9Ej5fM();
                    n20 = dl1_12.e0(f6);
                    float f7 = object7.calculateBottomPadding-D9Ej5fM();
                    n19 = dl1_12.e0(f7);
                    f5 = Fk3.a;
                    n18 = dl1_12.e0(f5);
                    n17 = 0;
                    object6 = null;
                    ns22 = null;
                    n16 = 0;
                    object5 = null;
                    n22 = 10;
                    l3 = l2;
                    l3 = c60.b(l2, 0, 0, 0, 0, n22);
                    n15 = list.size();
                    object4 = null;
                    for (n14 = 0; n14 < n15; ++n14) {
                        object2 = object3 = object8.get(n14);
                        object2 = androidx.compose.ui.layout.a.a((xk1_0)object3);
                        n21 = Intrinsics.areEqual(object2, object10 = "Leading");
                        if (n21 == 0) {
                            continue;
                        }
                        break block21;
                    }
                    n22 = 0;
                    object3 = null;
                }
                object3 = (xk1_0)object3;
                if (object3 != null) {
                    ns22 = object3.Q(l3);
                    object3 = ns22;
                } else {
                    n22 = 0;
                    object3 = null;
                }
                n15 = lk3_0.e((Ns2)object3);
                n14 = list.size();
                object2 = null;
                for (n21 = 0; n21 < n14; ++n21) {
                    object = object10 = object8.get(n21);
                    object = androidx.compose.ui.layout.a.a((xk1_0)object10);
                    n17 = Intrinsics.areEqual(object, object6 = "Trailing");
                    if (n17 == 0) {
                        continue;
                    }
                    break block22;
                }
                n10 = 0;
                object10 = null;
            }
            object10 = (xk1_0)object10;
            if (object10 != null) {
                n14 = -n15;
                long l4 = f60.k(n14, 0, l3);
                object4 = object10.Q(l4);
                object2 = object4;
            } else {
                n21 = 0;
                object2 = null;
            }
            n14 = lk3_0.e(object2) + n15;
            n15 = -n19;
            n14 = -n14;
            l3 = f60.k(n14, n15, l3);
            n17 = list.size();
            object10 = null;
            for (n10 = 0; n10 < n17; ++n10) {
                Object object11 = object = object8.get(n10);
                object11 = (xk1_0)object;
                object5 = androidx.compose.ui.layout.a.a((xk1_0)object11);
                n8 = n17;
                object6 = "Label";
                n16 = Intrinsics.areEqual(object5, object6);
                if (n16 == 0) {
                    n16 = 0;
                    object5 = null;
                    continue;
                }
                break block23;
            }
            n7 = 0;
            object = null;
        }
        object = (xk1_0)object;
        if (object != null) {
            ns2 = object.Q(l3);
        } else {
            n4 = 0;
            f5 = 0.0f;
            ns2 = null;
        }
        if (ns2 != null) {
            m912 = Pc.b;
            n3 = ns2.U(m912);
            if (n3 == (n16 = -1 << -1)) {
                n3 = ns2.b;
            }
        } else {
            n3 = 0;
            m912 = null;
        }
        n10 = Math.max(n3, n20);
        n15 = ns2 != null ? n15 - n18 - n10 : -n20 - n19;
        int n24 = 0;
        int n25 = 0;
        int n26 = 0;
        int n27 = 11;
        n8 = n18;
        long l7 = c60.b(l2, 0, 0, 0, 0, n27);
        long l8 = f60.k(n14, n15, l7);
        n19 = list.size();
        object4 = null;
        for (n14 = 0; n14 < n19; ++n14) {
            object6 = (xk1_0)object8.get(n14);
            Object object12 = androidx.compose.ui.layout.a.a((xk1_0)object6);
            n18 = (int)(Intrinsics.areEqual(object12, object = "TextField") ? 1 : 0);
            if (n18 != 0) {
                boolean bl2;
                int n28;
                block24: {
                    object4 = object6.Q(l8);
                    n24 = 0;
                    n25 = 0;
                    n26 = 0;
                    n27 = 14;
                    l8 = c60.b(l8, 0, 0, 0, 0, n27);
                    n19 = list.size();
                    object6 = null;
                    for (n17 = 0; n17 < n19; ++n17) {
                        object = object12 = object8.get(n17);
                        object = androidx.compose.ui.layout.a.a((xk1_0)object12);
                        n28 = (int)(Intrinsics.areEqual(object, object8 = "Hint") ? 1 : 0);
                        if (n28 == 0) {
                            object8 = list;
                            continue;
                        }
                        break block24;
                    }
                    n18 = 0;
                    object12 = null;
                }
                object12 = (xk1_0)object12;
                Object object13 = object12 != null ? (object8 = object12.Q(l8)) : null;
                n28 = lk3_0.e((Ns2)object3);
                n19 = lk3_0.e(object2);
                n15 = ((Ns2)object4).a;
                n16 = lk3_0.e(ns2);
                n17 = lk3_0.e((Ns2)object13);
                n16 = Math.max(n16, n17);
                n15 = Math.max(n15, n16) + n28 + n19;
                n28 = c60.k(l2);
                n7 = Math.max(n15, n28);
                n28 = ((Ns2)object4).b;
                if (ns2 != null) {
                    n16 = 1;
                    bl2 = true;
                } else {
                    bl2 = false;
                }
                n26 = lk3_0.d((Ns2)object3);
                n24 = lk3_0.d(object2);
                n25 = lk3_0.d((Ns2)object13);
                float f8 = dl1_12.getDensity();
                object7 = ((gk3_0)object9).c;
                n18 = Fk3.b(n28, bl2, n10, n26, n24, n25, l2, f8, (mk2_0)object7);
                object8 = object6;
                object7 = ns2;
                n4 = n3;
                n3 = n7;
                n15 = n18;
                object5 = object4;
                object4 = object13;
                object9 = object6;
                object6 = object3;
                object3 = object2;
                object2 = this;
                n18 = n8;
                object = dl1_12;
                ((Gk3$c)object8)(ns2, n20, n4, n7, n15, (Ns2)object5, (Ns2)object13, (Ns2)object6, (Ns2)object3, this, n10, n8, dl1_12);
                n19 = n15;
                n28 = n7;
                return cl1_0.a(dl1_13, n7, n15, (Function1)object8);
            }
            object9 = this;
            object8 = list;
        }
        object8 = new NoSuchElementException("Collection contains no element matching the predicate.");
        throw object8;
    }

    public final int h(Rj1 object, List list, int n3) {
        object = Gk3$e.c;
        return gk3_0.d(list, n3, (Function2)object);
    }

    public final int i(Rj1 rj1, List list, int n3) {
        Gk3$a gk3$a = Gk3$a.c;
        return this.b(rj1, list, n3, gk3$a);
    }

    public final int j(Rj1 rj1, List list, int n3) {
        Gk3$d gk3$d = Gk3$d.c;
        return this.b(rj1, list, n3, gk3$d);
    }
}

