/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class JY2 {
    public static final GY2 a(xp1_0 xp1_02, boolean bl2) {
        Object object;
        LP1$c lP1$c = xp1_02.y.e;
        int n3 = lP1$c.d & 8;
        Object object2 = null;
        if (n3 != 0) {
            block0: while (lP1$c != null) {
                n3 = lP1$c.c & 8;
                if (n3 != 0) {
                    object = lP1$c;
                    WR1 wR1 = null;
                    while (object != null) {
                        int n4 = object instanceof dy2_0;
                        if (n4 != 0) {
                            object2 = object;
                            break block0;
                        }
                        n4 = ((LP1$c)object).c & 8;
                        if (n4 != 0 && (n4 = object instanceof mo0_0) != 0) {
                            int n7;
                            Object object3 = object;
                            object3 = ((mo0_0)object).o;
                            int n8 = 0;
                            while (true) {
                                n7 = 1;
                                if (object3 == null) break;
                                int n10 = ((LP1$c)object3).c & 8;
                                if (n10 != 0) {
                                    if (++n8 == n7) {
                                        object = object3;
                                    } else {
                                        if (wR1 == null) {
                                            n7 = 16;
                                            Object[] objectArray = new LP1$c[n7];
                                            wR1 = new WR1(objectArray);
                                        }
                                        if (object != null) {
                                            wR1.b(object);
                                            n3 = 0;
                                            object = null;
                                        }
                                        wR1.b(object3);
                                    }
                                }
                                object3 = ((LP1$c)object3).f;
                            }
                            if (n8 == n7) continue;
                        }
                        object = go0.b(wR1);
                    }
                }
                if ((n3 = lP1$c.d & 8) == 0) break;
                lP1$c = lP1$c.f;
            }
        }
        Intrinsics.checkNotNull(object2);
        lP1$c = ((dy2_0)object2).e();
        object = xp1_02.w();
        Intrinsics.checkNotNull(object);
        object2 = new GY2(lP1$c, bl2, xp1_02, (zy2_0)object);
        return object2;
    }

    public static final xp1_0 b(xp1_0 xp1_02, Function1 function1) {
        for (xp1_02 = xp1_02.A(); xp1_02 != null; xp1_02 = xp1_02.A()) {
            Boolean bl2 = (Boolean)function1.invoke(xp1_02);
            boolean bl3 = bl2;
            if (!bl3) continue;
            return xp1_02;
        }
        return null;
    }

    public static final dy2_0 c(xp1_0 object) {
        object = ((xp1_0)object).y.e;
        int n3 = ((LP1$c)object).d & 8;
        Object object2 = null;
        if (n3 != 0) {
            block0: while (object != null) {
                n3 = ((LP1$c)object).c & 8;
                if (n3 != 0) {
                    Object object3 = object;
                    WR1 wR1 = null;
                    while (object3 != null) {
                        Object object4;
                        int n4 = object3 instanceof dy2_0;
                        if (n4 != 0) {
                            object4 = object3;
                            object4 = (dy2_0)object3;
                            n4 = object4.c1() ? 1 : 0;
                            if (n4 != 0) {
                                object2 = object3;
                                break block0;
                            }
                        } else {
                            n4 = ((LP1$c)object3).c & 8;
                            if (n4 != 0 && (n4 = object3 instanceof mo0_0) != 0) {
                                int n7;
                                object4 = object3;
                                object4 = ((mo0_0)object3).o;
                                int n8 = 0;
                                while (true) {
                                    n7 = 1;
                                    if (object4 == null) break;
                                    int n10 = ((LP1$c)object4).c & 8;
                                    if (n10 != 0) {
                                        if (++n8 == n7) {
                                            object3 = object4;
                                        } else {
                                            if (wR1 == null) {
                                                n7 = 16;
                                                Object[] objectArray = new LP1$c[n7];
                                                wR1 = new WR1(objectArray);
                                            }
                                            if (object3 != null) {
                                                wR1.b(object3);
                                                n3 = 0;
                                                object3 = null;
                                            }
                                            wR1.b(object4);
                                        }
                                    }
                                    object4 = ((LP1$c)object4).f;
                                }
                                if (n8 == n7) continue;
                            }
                        }
                        object3 = go0.b(wR1);
                    }
                }
                if ((n3 = ((LP1$c)object).d & 8) == 0) break;
                object = ((LP1$c)object).f;
            }
        }
        return (dy2_0)object2;
    }
}

