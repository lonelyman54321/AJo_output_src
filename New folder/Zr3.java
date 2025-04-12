/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Zr3 {
    public static final yr3_0 a(fo0 object, Object object2) {
        Object object3 = object.e();
        boolean bl2 = ((LP1$c)object3).m;
        if (bl2) {
            object3 = object.e().e;
            object = go0.f((fo0)object);
            while (object != null) {
                Object object4 = ((xp1_0)object).y.e;
                int n3 = ((LP1$c)object4).d;
                int n4 = 262144;
                if ((n3 &= n4) != 0) {
                    while (object3 != null) {
                        n3 = ((LP1$c)object3).c & n4;
                        if (n3 != 0) {
                            object4 = object3;
                            WR1 wR1 = null;
                            while (object4 != null) {
                                Object object5;
                                int n7 = object4 instanceof yr3_0;
                                if (n7 != 0) {
                                    object5 = (object4 = (yr3_0)object4).v();
                                    n7 = (int)(Intrinsics.areEqual(object2, object5) ? 1 : 0);
                                    if (n7 != 0) {
                                        return object4;
                                    }
                                } else {
                                    n7 = ((LP1$c)object4).c & n4;
                                    if (n7 != 0 && (n7 = object4 instanceof mo0_0) != 0) {
                                        int n8;
                                        object5 = object4;
                                        object5 = ((mo0_0)object4).o;
                                        int n10 = 0;
                                        while (true) {
                                            n8 = 1;
                                            if (object5 == null) break;
                                            int n14 = ((LP1$c)object5).c & n4;
                                            if (n14 != 0) {
                                                if (++n10 == n8) {
                                                    object4 = object5;
                                                } else {
                                                    if (wR1 == null) {
                                                        n8 = 16;
                                                        Object[] objectArray = new LP1$c[n8];
                                                        wR1 = new WR1(objectArray);
                                                    }
                                                    if (object4 != null) {
                                                        wR1.b(object4);
                                                        n3 = 0;
                                                        object4 = null;
                                                    }
                                                    wR1.b(object5);
                                                }
                                            }
                                            object5 = ((LP1$c)object5).f;
                                        }
                                        if (n10 == n8) continue;
                                    }
                                }
                                object4 = go0.b(wR1);
                            }
                        }
                        object3 = ((LP1$c)object3).e;
                    }
                }
                if ((object = ((xp1_0)object).A()) != null && (object3 = ((xp1_0)object).y) != null) {
                    object3 = ((T32)object3).d;
                    continue;
                }
                bl2 = false;
                object3 = null;
            }
            return null;
        }
        object2 = "visitAncestors called on an unattached node".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public static final yr3_0 b(yr3_0 object) {
        Object object2 = object.e();
        boolean bl2 = ((LP1$c)object2).m;
        if (bl2) {
            object2 = object.e().e;
            xp1_0 xp1_02 = go0.f((fo0)object);
            while (xp1_02 != null) {
                Object object3 = xp1_02.y.e;
                int n3 = ((LP1$c)object3).d;
                int n4 = 262144;
                if ((n3 &= n4) != 0) {
                    while (object2 != null) {
                        n3 = ((LP1$c)object2).c & n4;
                        if (n3 != 0) {
                            object3 = object2;
                            WR1 wR1 = null;
                            while (object3 != null) {
                                Object object4;
                                Object object5;
                                int n7 = object3 instanceof yr3_0;
                                if (n7 != 0) {
                                    object3 = (yr3_0)object3;
                                    object5 = object.v();
                                    n7 = (int)(Intrinsics.areEqual(object5, object4 = object3.v()) ? 1 : 0);
                                    if (n7 != 0 && (n7 = (int)(U3.a(object, object3) ? 1 : 0)) != 0) {
                                        return object3;
                                    }
                                } else {
                                    n7 = ((LP1$c)object3).c & n4;
                                    if (n7 != 0 && (n7 = object3 instanceof mo0_0) != 0) {
                                        int n8;
                                        object5 = object3;
                                        object5 = ((mo0_0)object3).o;
                                        int n10 = 0;
                                        object4 = null;
                                        while (true) {
                                            n8 = 1;
                                            if (object5 == null) break;
                                            int n14 = ((LP1$c)object5).c & n4;
                                            if (n14 != 0) {
                                                if (++n10 == n8) {
                                                    object3 = object5;
                                                } else {
                                                    if (wR1 == null) {
                                                        n8 = 16;
                                                        Object[] objectArray = new LP1$c[n8];
                                                        wR1 = new WR1(objectArray);
                                                    }
                                                    if (object3 != null) {
                                                        wR1.b(object3);
                                                        n3 = 0;
                                                        object3 = null;
                                                    }
                                                    wR1.b(object5);
                                                }
                                            }
                                            object5 = ((LP1$c)object5).f;
                                        }
                                        if (n10 == n8) continue;
                                    }
                                }
                                object3 = go0.b(wR1);
                            }
                        }
                        object2 = ((LP1$c)object2).e;
                    }
                }
                if ((xp1_02 = xp1_02.A()) != null && (object2 = xp1_02.y) != null) {
                    object2 = ((T32)object2).d;
                    continue;
                }
                bl2 = false;
                object2 = null;
            }
            return null;
        }
        object2 = "visitAncestors called on an unattached node".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public static final void c(yr3_0 object, Function1 object2) {
        Object object3 = object.e();
        boolean bl2 = ((LP1$c)object3).m;
        if (bl2) {
            object3 = object.e().e;
            xp1_0 xp1_02 = go0.f((fo0)object);
            while (xp1_02 != null) {
                Object object4 = xp1_02.y.e;
                int n3 = ((LP1$c)object4).d;
                int n4 = 262144;
                if ((n3 &= n4) != 0) {
                    while (object3 != null) {
                        n3 = ((LP1$c)object3).c & n4;
                        if (n3 != 0) {
                            object4 = object3;
                            WR1 wR1 = null;
                            while (object4 != null) {
                                Object object5;
                                Object object6;
                                int n7 = object4 instanceof yr3_0;
                                int n8 = 1;
                                if (n7 != 0) {
                                    object4 = (yr3_0)object4;
                                    object6 = object.v();
                                    n7 = (int)(Intrinsics.areEqual(object6, object5 = object4.v()) ? 1 : 0);
                                    if (n7 != 0 && (n7 = (int)(U3.a(object, object4) ? 1 : 0)) != 0) {
                                        object4 = (Boolean)object2.invoke(object4);
                                        n8 = ((Boolean)object4).booleanValue();
                                    }
                                    if (n8 == 0) {
                                        return;
                                    }
                                } else {
                                    n7 = ((LP1$c)object4).c & n4;
                                    object5 = null;
                                    if (n7 != 0) {
                                        n7 = 1;
                                    } else {
                                        n7 = 0;
                                        object6 = null;
                                    }
                                    if (n7 != 0 && (n7 = object4 instanceof mo0_0) != 0) {
                                        object6 = object4;
                                        object6 = ((mo0_0)object4).o;
                                        int n10 = 0;
                                        while (object6 != null) {
                                            Object[] objectArray;
                                            int n14 = ((LP1$c)object6).c & n4;
                                            if (n14 != 0) {
                                                n14 = 1;
                                            } else {
                                                n14 = 0;
                                                objectArray = null;
                                            }
                                            if (n14 != 0) {
                                                if (++n10 == n8) {
                                                    object4 = object6;
                                                } else {
                                                    if (wR1 == null) {
                                                        n14 = 16;
                                                        objectArray = new LP1$c[n14];
                                                        wR1 = new WR1(objectArray);
                                                    }
                                                    if (object4 != null) {
                                                        wR1.b(object4);
                                                        n3 = 0;
                                                        object4 = null;
                                                    }
                                                    wR1.b(object6);
                                                }
                                            }
                                            object6 = ((LP1$c)object6).f;
                                        }
                                        if (n10 == n8) continue;
                                    }
                                }
                                object4 = go0.b(wR1);
                            }
                        }
                        object3 = ((LP1$c)object3).e;
                    }
                }
                if ((xp1_02 = xp1_02.A()) != null && (object3 = xp1_02.y) != null) {
                    object3 = ((T32)object3).d;
                    continue;
                }
                bl2 = false;
                object3 = null;
            }
            return;
        }
        object2 = "visitAncestors called on an unattached node".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public static final void d(yr3_0 yr3_02, Function1 function1) {
        Object object = yr3_02.e();
        boolean bl2 = ((LP1$c)object).m;
        if (bl2) {
            int n3;
            int n4 = 16;
            Object object2 = new LP1$c[n4];
            object = new WR1((Object[])object2);
            object2 = yr3_02.e().f;
            if (object2 == null) {
                object2 = yr3_02.e();
                go0.a((WR1)object, (LP1$c)object2);
            } else {
                ((WR1)object).b(object2);
            }
            block0: while ((n3 = ((WR1)object).l()) != 0) {
                n3 = ((WR1)object).c;
                int n7 = 1;
                object2 = (LP1$c)((WR1)object).n(n3 -= n7);
                int n8 = object2.d;
                int n10 = 262144;
                if ((n8 &= n10) != 0) {
                    Object object3 = object2;
                    while (object3 != null) {
                        int n14 = object3.c & n10;
                        if (n14 != 0) {
                            WR1 wR1 = null;
                            Object object4 = object3;
                            while (object4 != null) {
                                Object object5;
                                Object object6;
                                int n15 = object4 instanceof yr3_0;
                                if (n15 != 0) {
                                    object4 = (yr3_0)object4;
                                    object6 = yr3_02.v();
                                    n15 = (int)(Intrinsics.areEqual(object6, object5 = object4.v()) ? 1 : 0);
                                    object4 = n15 != 0 && (n15 = (int)(U3.a(yr3_02, object4) ? 1 : 0)) != 0 ? (Xr3)((Object)function1.invoke(object4)) : Xr3.ContinueTraversal;
                                    if (object4 == (object6 = Xr3.CancelTraversal)) {
                                        return;
                                    }
                                    object6 = Xr3.SkipSubtreeAndContinueTraversal;
                                    if (object4 == object6) continue block0;
                                } else {
                                    n15 = ((LP1$c)object4).c & n10;
                                    if (n15 != 0 && (n15 = object4 instanceof mo0_0) != 0) {
                                        object6 = object4;
                                        object6 = ((mo0_0)object4).o;
                                        int n16 = 0;
                                        object5 = null;
                                        while (object6 != null) {
                                            int n17 = ((LP1$c)object6).c & n10;
                                            if (n17 != 0) {
                                                if (++n16 == n7) {
                                                    object4 = object6;
                                                } else {
                                                    if (wR1 == null) {
                                                        Object[] objectArray = new LP1$c[n4];
                                                        wR1 = new WR1(objectArray);
                                                    }
                                                    if (object4 != null) {
                                                        wR1.b(object4);
                                                        n14 = 0;
                                                        object4 = null;
                                                    }
                                                    wR1.b(object6);
                                                }
                                            }
                                            object6 = ((LP1$c)object6).f;
                                        }
                                        if (n16 == n7) continue;
                                    }
                                }
                                object4 = go0.b(wR1);
                            }
                        }
                        object3 = object3.f;
                    }
                }
                go0.a((WR1)object, (LP1$c)object2);
            }
            return;
        }
        bh1_1.c("visitSubtreeIf called on an unattached node");
        throw null;
    }
}

