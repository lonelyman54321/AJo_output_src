/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;

public final class OT0 {
    public static final uu0_1 a(nt0_0 object) {
        boolean bl2;
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        Object object2 = object.e();
        int n14 = 0;
        Object object3 = null;
        while (true) {
            n10 = 1;
            n8 = 3;
            n7 = 2;
            n4 = 16;
            int n15 = 0;
            if (object2 == null) break;
            n3 = object2 instanceof FocusTargetNode;
            if (n3 != 0) {
                int[] nArray = OT0$a.$EnumSwitchMapping$0;
                n15 = ((Enum)(object2 = ((FocusTargetNode)object2).s1())).ordinal();
                n4 = nArray[n15];
                if (n4 == n10 || n4 == n7 || n4 == n8) {
                    return object2;
                }
            } else {
                n8 = ((LP1$c)object2).c & 0x400;
                if (n8 != 0 && (n8 = object2 instanceof mo0_0) != 0) {
                    Object object4 = object2;
                    object4 = ((mo0_0)object2).o;
                    while (object4 != null) {
                        n7 = ((LP1$c)object4).c & 0x400;
                        if (n7 != 0) {
                            if (++n15 == n10) {
                                object2 = object4;
                            } else {
                                if (object3 == null) {
                                    Object[] objectArray = new LP1$c[n4];
                                    object3 = new WR1(objectArray);
                                }
                                if (object2 != null) {
                                    ((WR1)object3).b(object2);
                                    bl2 = false;
                                    object2 = null;
                                }
                                ((WR1)object3).b(object4);
                            }
                        }
                        object4 = ((LP1$c)object4).f;
                    }
                    if (n15 == n10) continue;
                }
            }
            object2 = go0.b((WR1)object3);
        }
        object2 = object.e();
        bl2 = ((LP1$c)object2).m;
        if (bl2) {
            int n16;
            object3 = new LP1$c[n4];
            object2 = new WR1((Object[])object3);
            object3 = object.e().f;
            if (object3 == null) {
                object = object.e();
                go0.a((WR1)object2, (LP1$c)object);
            } else {
                ((WR1)object2).b(object3);
            }
            block2: while ((n16 = ((WR1)object2).l()) != 0) {
                n16 = ((WR1)object2).c - n10;
                object = (LP1$c)((WR1)object2).n(n16);
                n14 = ((LP1$c)object).d & 0x400;
                if (n14 == 0) {
                    go0.a((WR1)object2, (LP1$c)object);
                    continue;
                }
                while (object != null) {
                    n14 = ((LP1$c)object).c & 0x400;
                    if (n14 != 0) {
                        n14 = 0;
                        object3 = null;
                        while (object != null) {
                            int n17;
                            Object object5;
                            n3 = object instanceof FocusTargetNode;
                            if (n3 != 0) {
                                object5 = OT0$a.$EnumSwitchMapping$0;
                                n17 = ((Enum)(object = ((FocusTargetNode)object).s1())).ordinal();
                                n3 = object5[n17];
                                if (n3 == n10 || n3 == n7 || n3 == n8) {
                                    return object;
                                }
                            } else {
                                n3 = ((LP1$c)object).c & 0x400;
                                if (n3 != 0 && (n3 = object instanceof mo0_0) != 0) {
                                    object5 = object;
                                    object5 = ((mo0_0)object).o;
                                    n17 = 0;
                                    while (object5 != null) {
                                        int n18 = object5.c & 0x400;
                                        if (n18 != 0) {
                                            if (++n17 == n10) {
                                                object = object5;
                                            } else {
                                                if (object3 == null) {
                                                    Object[] objectArray = new LP1$c[n4];
                                                    object3 = new WR1(objectArray);
                                                }
                                                if (object != null) {
                                                    ((WR1)object3).b(object);
                                                    n16 = 0;
                                                    object = null;
                                                }
                                                ((WR1)object3).b(object5);
                                            }
                                        }
                                        object5 = object5.f;
                                    }
                                    if (n17 == n10) continue;
                                }
                            }
                            object = go0.b((WR1)object3);
                        }
                        continue block2;
                    }
                    object = ((LP1$c)object).f;
                }
            }
            return uu0_1.Inactive;
        }
        object2 = "visitChildren called on an unattached node".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public static final void b(FocusTargetNode object) {
        Object object2 = ((LP1$c)object).a;
        boolean bl2 = ((LP1$c)object2).m;
        if (bl2) {
            object = go0.f((fo0)object);
            Object object3 = object2;
            block0: while (object != null) {
                Object object4 = ((xp1_0)object).y.e;
                int n3 = ((LP1$c)object4).d & 0x1400;
                if (n3 != 0) {
                    while (object3 != null) {
                        n3 = ((LP1$c)object3).c;
                        int n4 = n3 & 0x1400;
                        if (n4 != 0) {
                            if (object3 != object2 && (n4 = n3 & 0x400) != 0) break block0;
                            if ((n3 &= 0x1000) != 0) {
                                object4 = object3;
                                n4 = 0;
                                WR1 wR1 = null;
                                while (object4 != null) {
                                    Object object5;
                                    int n7 = object4 instanceof nt0_0;
                                    if (n7 != 0) {
                                        object4 = (nt0_0)object4;
                                        object5 = OT0.a((nt0_0)object4);
                                        object4.L0((tu0_0)object5);
                                    } else {
                                        n7 = ((LP1$c)object4).c & 0x1000;
                                        if (n7 != 0 && (n7 = object4 instanceof mo0_0) != 0) {
                                            int n8;
                                            object5 = object4;
                                            object5 = ((mo0_0)object4).o;
                                            int n10 = 0;
                                            while (true) {
                                                n8 = 1;
                                                if (object5 == null) break;
                                                int n14 = ((LP1$c)object5).c & 0x1000;
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
            return;
        }
        object2 = "visitAncestors called on an unattached node".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

