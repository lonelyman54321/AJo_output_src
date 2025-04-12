/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;

/*
 * Renamed from c42
 */
public final class c42_0 {
    public static final gr1_1 a;

    static {
        gr1_1 gr1_12 = j62.a;
        a = gr1_12 = new gr1_1(null);
    }

    public static final void a(LP1$c lP1$c) {
        boolean bl2 = lP1$c.m;
        if (bl2) {
            c42_0.b(lP1$c, -1, 1);
            return;
        }
        bh1_1.c("autoInvalidateInsertedNode called on unattached node");
        throw null;
    }

    public static final void b(LP1$c lP1$c, int n3, int n4) {
        int n7 = lP1$c instanceof mo0_0;
        if (n7 != 0) {
            LP1$c lP1$c2 = lP1$c;
            lP1$c2 = (mo0_0)lP1$c;
            int n8 = ((mo0_0)lP1$c2).n & n3;
            c42_0.c(lP1$c, n8, n4);
            int n10 = ~((mo0_0)lP1$c2).n & n3;
            LP1$c lP1$c3 = ((mo0_0)lP1$c2).o;
            while (lP1$c3 != null) {
                c42_0.b(lP1$c3, n10, n4);
                lP1$c3 = lP1$c3.f;
            }
        } else {
            n7 = lP1$c.c;
            c42_0.c(lP1$c, n3 &= n7, n4);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void c(LP1$c object, int n3, int n4) {
        int n7;
        int n8;
        Object object2;
        Object object3;
        int n10;
        if (n4 == 0 && (n10 = ((LP1$c)object).g1()) == 0) {
            return;
        }
        n10 = n3 & 2;
        int n14 = 2;
        int n15 = 1;
        if (n10 != 0 && (n10 = object instanceof rp1_1) != 0) {
            object3 = object;
            object3 = go0.f((rp1_1)object);
            ((xp1_0)object3).I();
            if (n4 == n14) {
                object3 = go0.d((fo0)object, n14);
                ((w32_0)object3).r = n15;
                ((w32_0)object3).E.invoke();
                object2 = ((w32_0)object3).G;
                if (object2 != null) {
                    object2 = ((w32_0)object3).H;
                    if (object2 != null) {
                        ((w32_0)object3).H = null;
                    }
                    ((w32_0)object3).E1(null, false);
                    object3 = ((w32_0)object3).m;
                    ((xp1_0)object3).Y(false);
                }
            }
        }
        if ((n10 = n3 & 0x80) != 0 && (n10 = object instanceof xp1_1) != 0 && n4 != n14) {
            object3 = go0.f((fo0)object);
            ((xp1_0)object3).I();
        }
        if ((n10 = n3 & 0x100) != 0 && (n10 = object instanceof c01_0) != 0 && n4 != n14) {
            object3 = go0.f((fo0)object);
            object2 = ((xp1_0)object3).z;
            n8 = ((bq1)object2).e;
            if (n8 == 0 && (n7 = ((bq1)object2).d) == 0 && (n7 = ((xp1_0)object3).H) == 0) {
                object2 = aq1_0.a((xp1_0)object3);
                object2.g((xp1_0)object3);
            }
        }
        if ((n10 = n3 & 4) != 0 && (n10 = object instanceof it0_0) != 0) {
            object3 = object;
            object3 = (it0_0)object;
            jt0_0.a((it0_0)object3);
        }
        if ((n10 = n3 & 8) != 0 && (n10 = object instanceof dy2_0) != 0) {
            object3 = object;
            object3 = go0.f((dy2_0)object);
            ((xp1_0)object3).J();
        }
        if ((n10 = n3 & 0x40) != 0 && (n10 = object instanceof sm2_0) != 0) {
            object3 = object;
            object3 = go0.f((fo0)((sm2_0)object)).z;
            object2 = ((bq1)object3).r;
            ((bq1$b)object2).q = n15;
            object3 = ((bq1)object3).s;
            if (object3 != null) {
                ((bq1$a_0)object3).v = n15;
            }
        }
        if ((n10 = n3 & 0x400) != 0 && (n10 = object instanceof FocusTargetNode) != 0 && n4 != n14) {
            object3 = object;
            object3 = (FocusTargetNode)object;
            object2 = go0.g((fo0)object3).getFocusOwner();
            object2.g((FocusTargetNode)object3);
        }
        if ((n10 = n3 & 0x800) != 0 && (n10 = object instanceof lu0_0) != 0) {
            object3 = object;
            object3 = (lu0_0)object;
            lk_1.b = null;
            object2 = lk_1.a;
            object3.J((gU0)object2);
            object2 = lk_1.b;
            if (object2 != null) {
                if (n4 != n14) {
                    bu0_1 bu0_12 = go0.g((fo0)object3).getFocusOwner();
                    bu0_12.m((lu0_0)object3);
                } else {
                    Object object4 = object3.e();
                    n4 = (int)(((LP1$c)object4).m ? 1 : 0);
                    if (n4 == 0) {
                        String string2 = "visitChildren called on an unattached node".toString();
                        object = new IllegalStateException(string2);
                        throw object;
                    }
                    n14 = 16;
                    object2 = new LP1$c[n14];
                    object4 = new WR1((Object[])object2);
                    object2 = object3.e().f;
                    if (object2 == null) {
                        object3 = object3.e();
                        go0.a((WR1)object4, (LP1$c)object3);
                    } else {
                        ((WR1)object4).b(object2);
                    }
                    block0: while ((n10 = (int)(((WR1)object4).l() ? 1 : 0)) != 0) {
                        n10 = ((WR1)object4).c - n15;
                        object3 = (LP1$c)((WR1)object4).n(n10);
                        n7 = ((LP1$c)object3).d & 0x400;
                        if (n7 == 0) {
                            go0.a((WR1)object4, (LP1$c)object3);
                            continue;
                        }
                        while (object3 != null) {
                            n7 = ((LP1$c)object3).c & 0x400;
                            if (n7 != 0) {
                                n7 = 0;
                                object2 = null;
                            } else {
                                object3 = ((LP1$c)object3).f;
                                continue;
                            }
                            while (object3 != null) {
                                Object object5;
                                n8 = object3 instanceof FocusTargetNode;
                                if (n8 != 0) {
                                    object3 = (FocusTargetNode)object3;
                                    object5 = go0.g((fo0)object3).getFocusOwner();
                                    object5.g((FocusTargetNode)object3);
                                } else {
                                    n8 = ((LP1$c)object3).c & 0x400;
                                    if (n8 != 0 && (n8 = object3 instanceof mo0_0) != 0) {
                                        object5 = object3;
                                        object5 = ((mo0_0)object3).o;
                                        int n16 = 0;
                                        while (object5 != null) {
                                            int n17 = ((LP1$c)object5).c & 0x400;
                                            if (n17 != 0) {
                                                if (++n16 == n15) {
                                                    object3 = object5;
                                                } else {
                                                    if (object2 == null) {
                                                        Object[] objectArray = new LP1$c[n14];
                                                        object2 = new WR1(objectArray);
                                                    }
                                                    if (object3 != null) {
                                                        ((WR1)object2).b(object3);
                                                        n10 = 0;
                                                        object3 = null;
                                                    }
                                                    ((WR1)object2).b(object5);
                                                }
                                            }
                                            object5 = ((LP1$c)object5).f;
                                        }
                                        if (n16 == n15) continue;
                                    }
                                }
                                object3 = go0.b((WR1)object2);
                            }
                            continue block0;
                        }
                    }
                }
            }
        }
        if ((n3 &= 0x1000) != 0 && (n3 = object instanceof nt0_0) != 0) {
            object = (nt0_0)object;
            bu0_1 bu0_13 = go0.g((fo0)object).getFocusOwner();
            bu0_13.b((nt0_0)object);
        }
    }

    public static final void d(LP1$c lP1$c) {
        boolean bl2 = lP1$c.m;
        if (bl2) {
            c42_0.b(lP1$c, -1, 0);
            return;
        }
        bh1_1.c("autoInvalidateUpdatedNode called on unattached node");
        throw null;
    }

    public static final int e(LP1$b lP1$b) {
        boolean bl2;
        int n3 = lP1$b instanceof op1_1;
        n3 = n3 != 0 ? 3 : 1;
        boolean bl3 = lP1$b instanceof ht0;
        if (bl3) {
            n3 |= 4;
        }
        if (bl3 = lP1$b instanceof by2_1) {
            n3 |= 8;
        }
        if (bl3 = lP1$b instanceof fw2) {
            n3 |= 0x10;
        }
        if ((bl3 = lP1$b instanceof pp1_0) || (bl3 = lP1$b instanceof sp1_0)) {
            n3 |= 0x20;
        }
        if (bl3 = lP1$b instanceof mt0_0) {
            n3 |= 0x1000;
        }
        if (bl3 = lP1$b instanceof zt0_0) {
            n3 |= 0x800;
        }
        if (bl3 = lP1$b instanceof B82) {
            n3 |= 0x100;
        }
        if (bl3 = lP1$b instanceof Rm2) {
            n3 |= 0x40;
        }
        if ((bl3 = lP1$b instanceof P82) || (bl2 = lP1$b instanceof Y82)) {
            n3 |= 0x80;
        }
        return n3;
    }

    public static final int f(LP1$c object) {
        Object object2;
        int n3 = ((LP1$c)object).c;
        if (n3 != 0) {
            return n3;
        }
        gr1_1 gr1_12 = a;
        Class<?> clazz = object.getClass();
        int n4 = gr1_12.b(clazz);
        if (n4 >= 0) {
            object = gr1_12.c;
            object2 = object[n4];
        } else {
            n4 = object instanceof rp1_1;
            n4 = n4 != 0 ? 3 : 1;
            int n7 = object instanceof it0_0;
            if (n7 != 0) {
                n4 |= 4;
            }
            if ((n7 = object instanceof dy2_0) != 0) {
                n4 |= 8;
            }
            if ((n7 = object instanceof gw2_0) != 0) {
                n4 |= 0x10;
            }
            if ((n7 = object instanceof rp1_0) != 0) {
                n4 |= 0x20;
            }
            if ((n7 = object instanceof sm2_0) != 0) {
                n4 |= 0x40;
            }
            if ((n7 = object instanceof xp1_1) != 0) {
                n4 |= 0x80;
            }
            if ((n7 = object instanceof c01_0) != 0) {
                n4 |= 0x100;
            }
            if ((n7 = object instanceof pp_1) != 0) {
                n4 |= 0x200;
            }
            if ((n7 = object instanceof FocusTargetNode) != 0) {
                n4 |= 0x400;
            }
            if ((n7 = object instanceof lu0_0) != 0) {
                n4 |= 0x800;
            }
            if ((n7 = object instanceof nt0_0) != 0) {
                n4 |= 0x1000;
            }
            if ((n7 = object instanceof eo1_2) != 0) {
                n4 |= 0x2000;
            }
            if ((n7 = object instanceof kp2_0) != 0) {
                n4 |= 0x4000;
            }
            if ((n7 = object instanceof J30) != 0) {
                n7 = 32768;
                n4 |= n7;
            }
            if ((n7 = object instanceof a93) != 0) {
                n7 = 131072;
                n4 |= n7;
            }
            object2 = (object2 = (Object)(object instanceof yr3_0)) != false ? (Object)(0x40000 | n4) : (Object)n4;
            gr1_12.h(clazz, (int)object2);
        }
        return (int)object2;
    }

    public static final int g(LP1$c lP1$c) {
        int n3 = lP1$c instanceof mo0_0;
        if (n3 != 0) {
            lP1$c = (mo0_0)lP1$c;
            n3 = ((mo0_0)lP1$c).n;
            lP1$c = ((mo0_0)lP1$c).o;
            while (lP1$c != null) {
                int n4 = c42_0.g(lP1$c);
                n3 |= n4;
                lP1$c = lP1$c.f;
            }
        } else {
            n3 = c42_0.f(lP1$c);
        }
        return n3;
    }

    public static final boolean h(int n3) {
        n3 = (n3 &= 0x80) != 0 ? 1 : 0;
        return n3 != 0;
    }
}

