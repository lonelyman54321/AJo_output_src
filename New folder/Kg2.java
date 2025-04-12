/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.layout.a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Kg2
implements al1_1 {
    public final Function1 a;
    public final boolean b;
    public final float c;
    public final mk2_0 d;

    public Kg2(Function1 function1, boolean bl2, float f5, mk2_0 mk2_02) {
        this.a = function1;
        this.b = bl2;
        this.c = f5;
        this.d = mk2_02;
    }

    public final int a(Rj1 rj1, List list, int n3) {
        Kg2$b kg2$b = Kg2$b.c;
        return this.d(rj1, list, n3, kg2$b);
    }

    public final int b(Rj1 rj1, List list, int n3, Function2 function2) {
        Number number;
        Number number2;
        int n4;
        int n7;
        Object object;
        Object object2;
        Object object3;
        int n8;
        float f5;
        int n10;
        int n14;
        String string2;
        Object object4;
        int n15;
        int n16;
        int n17;
        Function2 function22;
        int n18;
        Object object5;
        Kg2 kg2;
        block19: {
            Object object6;
            block18: {
                Object object7;
                block17: {
                    kg2 = this;
                    object5 = list;
                    n18 = n3;
                    function22 = function2;
                    n17 = list.size();
                    n16 = 0;
                    n15 = 0;
                    while (true) {
                        object4 = null;
                        if (n15 >= n17) break;
                        object7 = object5.get(n15);
                        object6 = object7;
                        object6 = lk3_0.c((Qj1)object7);
                        n14 = Intrinsics.areEqual(object6, string2 = "Leading");
                        if (n14 == 0) {
                            ++n15;
                            continue;
                        }
                        break block17;
                        break;
                    }
                    n10 = 0;
                    object7 = null;
                }
                object7 = (Qj1)object7;
                n17 = -1 >>> 1;
                f5 = 0.0f / 0.0f;
                if (object7 != null) {
                    n15 = object7.P(n17);
                    n15 = n18 == n17 ? n18 : n18 - n15;
                    object6 = n3;
                    object7 = (Number)function22.invoke(object7, object6);
                    n10 = ((Number)object7).intValue();
                } else {
                    n15 = n18;
                    n10 = 0;
                    object7 = null;
                }
                n14 = list.size();
                string2 = null;
                for (n8 = 0; n8 < n14; ++n8) {
                    object2 = object3 = object5.get(n8);
                    object2 = lk3_0.c((Qj1)object3);
                    n7 = Intrinsics.areEqual(object2, object = "Trailing");
                    if (n7 == 0) {
                        continue;
                    }
                    break block18;
                }
                n4 = 0;
                object3 = null;
            }
            object3 = (Qj1)object3;
            if (object3 != null) {
                n14 = object3.P(n17);
                if (n15 != n17) {
                    n15 -= n14;
                }
                number2 = n3;
                number2 = (Number)function22.invoke(object3, number2);
                n14 = n17 = number2.intValue();
            } else {
                n14 = 0;
                object6 = null;
            }
            n17 = list.size();
            string2 = null;
            for (n8 = 0; n8 < n17; ++n8) {
                object2 = object3 = object5.get(n8);
                object2 = lk3_0.c((Qj1)object3);
                n7 = Intrinsics.areEqual(object2, object = "Label");
                if (n7 == 0) {
                    continue;
                }
                break block19;
            }
            n4 = 0;
            object3 = null;
        }
        object3 = (Qj1)object3;
        if (object3 != null) {
            f5 = kg2.c;
            number = LK1.d(n15, n18, f5);
            number = (Number)function22.invoke(object3, number);
            n4 = n18 = number.intValue();
        } else {
            n4 = 0;
            object3 = null;
        }
        n18 = list.size();
        f5 = 0.0f;
        number2 = null;
        for (n17 = 0; n17 < n18; ++n17) {
            string2 = object5.get(n17);
            object2 = string2;
            object2 = lk3_0.c((Qj1)((Object)string2));
            n7 = Intrinsics.areEqual(object2, object = "TextField");
            if (n7 == 0) continue;
            number = n15;
            number = (Number)function22.invoke(string2, number);
            n8 = number.intValue();
            n18 = list.size();
            f5 = 0.0f;
            number2 = null;
            for (n17 = 0; n17 < n18; ++n17) {
                String string3;
                object2 = object5.get(n17);
                object = object2;
                object = lk3_0.c((Qj1)object2);
                boolean bl2 = Intrinsics.areEqual(object, string3 = "Hint");
                if (!bl2) continue;
                object4 = object2;
                break;
            }
            if ((object4 = (Qj1)object4) != null) {
                object5 = n15;
                object5 = (Number)function22.invoke(object4, object5);
                n7 = n16 = ((Number)object5).intValue();
            } else {
                n7 = 0;
                object2 = null;
            }
            long l2 = lk3_0.a;
            float f6 = rj1.getDensity();
            object5 = kg2.d;
            float f7 = kg2.c;
            return Jg2.b(n10, n14, n8, n4, n7, f7, l2, f6, (mk2_0)object5);
        }
        object5 = new NoSuchElementException("Collection contains no element matching the predicate.");
        throw object5;
    }

    public final bl1_0 c(dl1_1 dl1_12, List list, long l2) {
        int n3;
        float f5;
        int n4;
        Object object;
        float f6;
        int n7;
        Object object2;
        Object object3;
        int n8;
        Object object4;
        Object object5;
        Object object6;
        int n10;
        Object object7;
        long l3;
        Object object8;
        boolean bl2;
        Object object9;
        Object object10;
        int n14;
        int n15;
        float f7;
        Object object11;
        Object object12;
        dl1_1 dl1_13;
        Kg2 kg2;
        block27: {
            float f8;
            int n16;
            float f11;
            int n17;
            block26: {
                int n18;
                block25: {
                    kg2 = this;
                    dl1_13 = dl1_12;
                    object12 = list;
                    object11 = this.d;
                    f7 = object11.calculateBottomPadding-D9Ej5fM();
                    n15 = dl1_12.e0(f7);
                    n14 = 0;
                    object10 = null;
                    object9 = null;
                    bl2 = false;
                    object8 = null;
                    n17 = 10;
                    l3 = l2;
                    l3 = c60.b(l2, 0, 0, 0, 0, n17);
                    n18 = list.size();
                    f11 = 0.0f;
                    object7 = null;
                    for (n10 = 0; n10 < n18; ++n10) {
                        object6 = object12.get(n10);
                        object5 = object6;
                        object5 = androidx.compose.ui.layout.a.a((xk1_0)object6);
                        n8 = Intrinsics.areEqual(object5, object4 = "Leading");
                        if (n8 == 0) {
                            continue;
                        }
                        break block25;
                    }
                    n17 = 0;
                    object6 = null;
                }
                object6 = (xk1_0)object6;
                if (object6 != null) {
                    object9 = object6.Q(l3);
                } else {
                    n18 = 0;
                    object9 = null;
                }
                n10 = lk3_0.e(object9);
                n17 = list.size();
                object5 = null;
                for (n8 = 0; n8 < n17; ++n8) {
                    object3 = object4 = object12.get(n8);
                    object3 = androidx.compose.ui.layout.a.a((xk1_0)object4);
                    n7 = Intrinsics.areEqual(object3, object2 = "Trailing");
                    if (n7 == 0) {
                        continue;
                    }
                    break block26;
                }
                n16 = 0;
                f8 = 0.0f;
                object4 = null;
            }
            object4 = (xk1_0)object4;
            if (object4 != null) {
                n17 = -n10;
                long l4 = f60.k(n17, 0, l3);
                object6 = object4.Q(l4);
            } else {
                n17 = 0;
                object6 = null;
            }
            n8 = lk3_0.e((Ns2)object6) + n10;
            object7 = dl1_12.getLayoutDirection();
            f11 = object11.calculateLeftPadding-u2uoSUM((bp1_0)((Object)object7));
            n10 = dl1_13.e0(f11);
            object4 = dl1_12.getLayoutDirection();
            f8 = object11.calculateRightPadding-u2uoSUM((bp1_0)((Object)object4));
            n16 = dl1_13.e0(f8) + n10;
            n10 = -n8;
            n8 = n10 - n16;
            n16 = -n16;
            f6 = kg2.c;
            n8 = LK1.d(n8, n16, f6);
            n15 = -n15;
            l3 = f60.k(n8, n15, l3);
            n8 = list.size();
            f8 = 0.0f;
            object4 = null;
            for (n16 = 0; n16 < n8; ++n16) {
                object2 = object3 = object12.get(n16);
                object2 = androidx.compose.ui.layout.a.a((xk1_0)object3);
                bl2 = Intrinsics.areEqual(object2, object8 = "Label");
                if (!bl2) {
                    bl2 = false;
                    object8 = null;
                    continue;
                }
                break block27;
            }
            n7 = 0;
            f6 = 0.0f;
            object3 = null;
        }
        object3 = (xk1_0)object3;
        if (object3 != null) {
            object8 = object = object3.Q(l3);
        } else {
            bl2 = false;
            object8 = null;
        }
        if (object8 != null) {
            n4 = ((Ns2)object8).a;
            f5 = n4;
            n3 = ((Ns2)object8).b;
            float f12 = n3;
            l3 = bo1_1.a(f5, f12);
        } else {
            l3 = 0L;
        }
        object5 = new Object(l3);
        object = kg2.a;
        object.invoke(object5);
        n4 = lk3_0.d((Ns2)object8) / 2;
        float f14 = object11.calculateTopPadding-D9Ej5fM();
        int n19 = dl1_13.e0(f14);
        n19 = Math.max(n4, n19);
        l3 = l2;
        long l7 = f60.k(n10, n15 -= n19, l2);
        int n20 = 0;
        int n21 = 0;
        int n22 = 11;
        long l8 = c60.b(l7, 0, 0, 0, 0, n22);
        n10 = list.size();
        n8 = 0;
        object5 = null;
        while (true) {
            object4 = "Collection contains no element matching the predicate.";
            if (n8 >= n10) break;
            object3 = (xk1_0)object12.get(n8);
            object2 = androidx.compose.ui.layout.a.a((xk1_0)object3);
            n14 = Intrinsics.areEqual(object2, object10 = "TextField");
            if (n14 != 0) {
                block28: {
                    object7 = object3.Q(l8);
                    int n24 = 14;
                    l8 = c60.b(l8, 0, 0, 0, 0, n24);
                    n14 = list.size();
                    object5 = null;
                    for (n8 = 0; n8 < n14; ++n8) {
                        object2 = object3 = object12.get(n8);
                        object2 = androidx.compose.ui.layout.a.a((xk1_0)object3);
                        n4 = (int)(Intrinsics.areEqual(object2, object = "Hint") ? 1 : 0);
                        if (n4 == 0) {
                            l3 = l2;
                            continue;
                        }
                        break block28;
                    }
                    n7 = 0;
                    f6 = 0.0f;
                    object3 = null;
                }
                object3 = (xk1_0)object3;
                if (object3 != null) {
                    object10 = object11 = object3.Q(l8);
                } else {
                    n14 = 0;
                    object10 = null;
                }
                int n25 = lk3_0.e(object9);
                int n26 = lk3_0.e((Ns2)object6);
                n19 = ((Ns2)object7).a;
                n21 = lk3_0.e((Ns2)object8);
                n20 = lk3_0.e((Ns2)object10);
                float f15 = dl1_12.getDensity();
                mk2_0 mk2_02 = kg2.d;
                f5 = kg2.c;
                n7 = Jg2.c(n25, n26, n19, n21, n20, f5, l2, f15, mk2_02);
                n25 = lk3_0.d(object9);
                n26 = lk3_0.d((Ns2)object6);
                n19 = ((Ns2)object7).b;
                n21 = lk3_0.d((Ns2)object8);
                n20 = lk3_0.d((Ns2)object10);
                f15 = dl1_12.getDensity();
                mk2_02 = kg2.d;
                f5 = kg2.c;
                int n27 = Jg2.b(n25, n26, n19, n21, n20, f5, l2, f15, mk2_02);
                n19 = list.size();
                f7 = 0.0f;
                mk2_02 = null;
                for (n15 = 0; n15 < n19; ++n15) {
                    object = (xk1_0)object12.get(n15);
                    Object object13 = androidx.compose.ui.layout.a.a((xk1_0)object);
                    n3 = (int)(Intrinsics.areEqual(object13, object5 = "border") ? 1 : 0);
                    if (n3 == 0) continue;
                    int n28 = -1 >>> 1;
                    if (n7 != n28) {
                        n19 = n7;
                    } else {
                        n19 = 0;
                        f14 = 0.0f;
                        object11 = null;
                    }
                    if (n27 != n28) {
                        n28 = n27;
                    } else {
                        n28 = 0;
                        object12 = null;
                    }
                    long l12 = f60.a(n19, n7, n28, n27);
                    object5 = object.Q(l12);
                    object12 = object4;
                    n19 = n27;
                    n15 = n7;
                    object = object9;
                    object13 = object6;
                    object9 = object7;
                    object7 = object10;
                    object10 = object5;
                    object6 = this;
                    object5 = dl1_12;
                    object4 = new Kg2$c(n27, n7, (Ns2)object, (Ns2)object13, (Ns2)object9, (Ns2)object8, (Ns2)object7, (Ns2)object10, this, dl1_12);
                    return cl1_0.a(dl1_13, n7, n27, (Function1)object4);
                }
                object12 = new NoSuchElementException((String)object4);
                throw object12;
            }
            ++n8;
            l3 = l2;
        }
        object12 = new NoSuchElementException((String)object4);
        throw object12;
    }

    public final int d(Rj1 rj1, List list, int n3, Function2 function2) {
        Kg2 kg2 = this;
        Object object = list;
        Function2 function22 = function2;
        int n4 = list.size();
        int n7 = 0;
        Number number = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            float f5;
            Object object2;
            int n8;
            Object object3;
            int n10;
            int n14;
            Object object4;
            Object object5;
            int n15;
            Object object6;
            block18: {
                Number number2;
                block17: {
                    Object object7;
                    block16: {
                        Object object8 = object6 = object.get(i3);
                        object8 = lk3_0.c((Qj1)object6);
                        n15 = Intrinsics.areEqual(object8, object7 = "TextField");
                        if (n15 == 0) continue;
                        number2 = n3;
                        number2 = (Number)function22.invoke(object6, number2);
                        n15 = number2.intValue();
                        n4 = list.size();
                        i3 = 0;
                        number = null;
                        while (true) {
                            object6 = null;
                            if (i3 >= n4) break;
                            object5 = object7 = object.get(i3);
                            object5 = lk3_0.c((Qj1)object7);
                            n14 = Intrinsics.areEqual(object5, object4 = "Label");
                            if (n14 == 0) {
                                ++i3;
                                continue;
                            }
                            break block16;
                            break;
                        }
                        n10 = 0;
                        object7 = null;
                    }
                    object7 = (Qj1)object7;
                    if (object7 != null) {
                        number2 = n3;
                        number2 = (Number)function22.invoke(object7, number2);
                        n10 = n4 = number2.intValue();
                    } else {
                        n10 = 0;
                        object7 = null;
                    }
                    n4 = list.size();
                    number = null;
                    for (i3 = 0; i3 < n4; ++i3) {
                        object4 = object5 = object.get(i3);
                        object4 = lk3_0.c((Qj1)object5);
                        n8 = Intrinsics.areEqual(object4, object3 = "Trailing");
                        if (n8 == 0) {
                            continue;
                        }
                        break block17;
                    }
                    n14 = 0;
                    object5 = null;
                }
                object5 = (Qj1)object5;
                if (object5 != null) {
                    number2 = n3;
                    number2 = (Number)function22.invoke(object5, number2);
                    n4 = number2.intValue();
                } else {
                    n4 = 0;
                    number2 = null;
                }
                i3 = list.size();
                object5 = null;
                for (n14 = 0; n14 < i3; ++n14) {
                    object3 = object4 = object.get(n14);
                    object3 = lk3_0.c((Qj1)object4);
                    boolean bl2 = Intrinsics.areEqual(object3, object2 = "Leading");
                    if (!bl2) {
                        continue;
                    }
                    break block18;
                }
                n8 = 0;
                object4 = null;
                f5 = 0.0f;
            }
            object4 = (Qj1)object4;
            if (object4 != null) {
                number = n3;
                number = (Number)function22.invoke(object4, number);
                i3 = number.intValue();
            } else {
                i3 = 0;
                number = null;
            }
            n14 = list.size();
            f5 = 0.0f;
            object4 = null;
            for (n8 = 0; n8 < n14; ++n8) {
                String string2;
                object2 = object3 = object.get(n8);
                object2 = lk3_0.c((Qj1)object3);
                boolean bl3 = Intrinsics.areEqual(object2, string2 = "Hint");
                if (!bl3) continue;
                object6 = object3;
                break;
            }
            if ((object6 = (Qj1)object6) != null) {
                object = n3;
                object = (Number)function22.invoke(object6, object);
                n14 = n7 = ((Number)object).intValue();
            } else {
                n14 = 0;
                object5 = null;
            }
            long l2 = lk3_0.a;
            float f6 = rj1.getDensity();
            mk2_0 mk2_02 = kg2.d;
            f5 = kg2.c;
            return Jg2.c(i3, n4, n15, n10, n14, f5, l2, f6, mk2_02);
        }
        object = new NoSuchElementException("Collection contains no element matching the predicate.");
        throw object;
    }

    public final int h(Rj1 rj1, List list, int n3) {
        Kg2$e kg2$e = Kg2$e.c;
        return this.d(rj1, list, n3, kg2$e);
    }

    public final int i(Rj1 rj1, List list, int n3) {
        Kg2$a kg2$a = Kg2$a.c;
        return this.b(rj1, list, n3, kg2$a);
    }

    public final int j(Rj1 rj1, List list, int n3) {
        Kg2$d kg2$d = Kg2$d.c;
        return this.b(rj1, list, n3, kg2$d);
    }
}

