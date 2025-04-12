/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.NoWhenBranchMatchedException;

public final class AU0 {
    public static final FocusTargetNode a(FocusTargetNode object) {
        Object object2 = ((FocusTargetNode)object).s1();
        int[] nArray = AU0$a.$EnumSwitchMapping$1;
        int n3 = ((Enum)object2).ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n4 = 3;
                if (n3 != n4) {
                    int n8 = 4;
                    if (n3 == n8) {
                        return null;
                    }
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
            } else {
                object = ((LP1$c)object).a;
                n3 = ((LP1$c)object).m ? 1 : 0;
                if (n3 != 0) {
                    int n10;
                    n7 = 16;
                    Object object3 = new LP1$c[n7];
                    object2 = new WR1((Object[])object3);
                    object3 = ((LP1$c)object).f;
                    if (object3 == null) {
                        go0.a((WR1)object2, (LP1$c)object);
                    } else {
                        ((WR1)object2).b(object3);
                    }
                    block0: while ((n10 = ((WR1)object2).l()) != 0) {
                        n10 = ((WR1)object2).c - n4;
                        object = (LP1$c)((WR1)object2).n(n10);
                        int n14 = ((LP1$c)object).d & 0x400;
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
                                    int n15 = object instanceof FocusTargetNode;
                                    if (n15 != 0) {
                                        if ((object = AU0.a((FocusTargetNode)object)) != null) {
                                            return object;
                                        }
                                    } else {
                                        n15 = ((LP1$c)object).c & 0x400;
                                        if (n15 != 0 && (n15 = object instanceof mo0_0) != 0) {
                                            Object object4 = object;
                                            object4 = ((mo0_0)object).o;
                                            int n16 = 0;
                                            while (object4 != null) {
                                                int n17 = ((LP1$c)object4).c & 0x400;
                                                if (n17 != 0) {
                                                    if (++n16 == n4) {
                                                        object = object4;
                                                    } else {
                                                        if (object3 == null) {
                                                            Object[] objectArray = new LP1$c[n7];
                                                            object3 = new WR1(objectArray);
                                                        }
                                                        if (object != null) {
                                                            ((WR1)object3).b(object);
                                                            n10 = 0;
                                                            object = null;
                                                        }
                                                        ((WR1)object3).b(object4);
                                                    }
                                                }
                                                object4 = ((LP1$c)object4).f;
                                            }
                                            if (n16 == n4) continue;
                                        }
                                    }
                                    object = go0.b((WR1)object3);
                                }
                                continue block0;
                            }
                            object = ((LP1$c)object).f;
                        }
                    }
                    return null;
                }
                object2 = "visitChildren called on an unattached node".toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
        }
        return object;
    }

    public static final aG2 b(FocusTargetNode object) {
        object = ((LP1$c)object).h;
        if (object != null) {
            zp1 zp12 = ap1_0.d((zp1)object);
            object = zp12.G((zp1)object, false);
        } else {
            object = aG2.e;
        }
        return object;
    }

    public static final FocusTargetNode c(FocusTargetNode object) {
        object = ((LP1$c)object).a;
        boolean bl2 = ((LP1$c)object).m;
        if (!bl2) {
            return null;
        }
        if (bl2) {
            int n3;
            int n4 = 16;
            Object object2 = new LP1$c[n4];
            WR1 wR1 = new WR1((Object[])object2);
            object2 = ((LP1$c)object).f;
            if (object2 == null) {
                go0.a(wR1, (LP1$c)object);
            } else {
                wR1.b(object2);
            }
            block0: while ((n3 = wR1.l()) != 0) {
                n3 = wR1.c;
                int n7 = 1;
                object = (LP1$c)wR1.n(n3 -= n7);
                int n8 = ((LP1$c)object).d & 0x400;
                if (n8 == 0) {
                    go0.a(wR1, (LP1$c)object);
                    continue;
                }
                while (object != null) {
                    n8 = ((LP1$c)object).c & 0x400;
                    if (n8 != 0) {
                        n8 = 0;
                        WR1 wR12 = null;
                        while (object != null) {
                            int n10;
                            int[] nArray;
                            Object object3;
                            int n14 = object instanceof FocusTargetNode;
                            if (n14 != 0) {
                                object = (FocusTargetNode)object;
                                object3 = ((LP1$c)object).a;
                                n14 = ((LP1$c)object3).m ? 1 : 0;
                                if (n14 != 0) {
                                    object3 = ((FocusTargetNode)object).s1();
                                    nArray = AU0$a.$EnumSwitchMapping$1;
                                    n14 = ((Enum)object3).ordinal();
                                    if ((n14 = nArray[n14]) == n7 || n14 == (n10 = 2) || n14 == (n10 = 3)) {
                                        return object;
                                    }
                                }
                            } else {
                                n14 = ((LP1$c)object).c & 0x400;
                                if (n14 != 0 && (n14 = object instanceof mo0_0) != 0) {
                                    object3 = object;
                                    object3 = ((mo0_0)object).o;
                                    n10 = 0;
                                    nArray = null;
                                    while (object3 != null) {
                                        int n15 = ((LP1$c)object3).c & 0x400;
                                        if (n15 != 0) {
                                            if (++n10 == n7) {
                                                object = object3;
                                            } else {
                                                if (wR12 == null) {
                                                    Object[] objectArray = new LP1$c[n4];
                                                    wR12 = new WR1(objectArray);
                                                }
                                                if (object != null) {
                                                    wR12.b(object);
                                                    n3 = 0;
                                                    object = null;
                                                }
                                                wR12.b(object3);
                                            }
                                        }
                                        object3 = ((LP1$c)object3).f;
                                    }
                                    if (n10 == n7) continue;
                                }
                            }
                            object = go0.b(wR12);
                        }
                        continue block0;
                    }
                    object = ((LP1$c)object).f;
                }
            }
            return null;
        }
        String string2 = "visitChildren called on an unattached node".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public static final boolean d(FocusTargetNode object) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        Tg2 tg2 = ((LP1$c)object).h;
        if (tg2 == null || (tg2 = ((w32_0)tg2).m) == null || (bl4 = ((xp1_0)tg2).L()) != (bl3 = true) || (object = ((LP1$c)object).h) == null || (object = ((w32_0)object).m) == null || (bl2 = ((xp1_0)object).e()) != bl3) {
            bl3 = false;
        }
        return bl3;
    }
}

