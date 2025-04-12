/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 */
import android.graphics.Rect;

public final class vU0 {
    /*
     * Enabled aggressive block sorting
     */
    public static boolean a(int n3, Rect rect, Rect rect2, Rect rect3) {
        int n4;
        int n7;
        int n8;
        boolean bl2;
        block13: {
            block15: {
                int n10;
                int n14;
                int n15;
                String string2;
                int n16;
                block12: {
                    block14: {
                        boolean bl3 = vU0.b(n3, rect, rect2);
                        n16 = vU0.b(n3, rect, rect3);
                        bl2 = false;
                        if (n16 != 0) return false;
                        if (!bl3) {
                            return false;
                        }
                        string2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.";
                        n16 = 130;
                        n15 = 33;
                        n14 = 66;
                        n10 = 17;
                        n8 = 1;
                        if (n3 == n10) break block14;
                        if (n3 != n15) {
                            if (n3 != n14) {
                                if (n3 != n16) {
                                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                                    throw illegalArgumentException;
                                }
                                int n17 = rect.bottom;
                                int n18 = rect3.top;
                                if (n17 > n18) return n8 != 0;
                                break block12;
                            } else {
                                int n19 = rect.right;
                                int n20 = rect3.left;
                                if (n19 > n20) return n8 != 0;
                            }
                            break block12;
                        } else {
                            int n21 = rect.top;
                            int n22 = rect3.bottom;
                            if (n21 < n22) return n8 != 0;
                        }
                        break block12;
                    }
                    int n24 = rect.left;
                    int n25 = rect3.right;
                    if (n24 < n25) return n8 != 0;
                }
                if (n3 == n10) return n8 != 0;
                if (n3 == n14) {
                    return n8 != 0;
                }
                n7 = vU0.d(n3, rect, rect2);
                if (n3 == n10) break block15;
                if (n3 != n15) {
                    if (n3 != n14) {
                        if (n3 != n16) {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                            throw illegalArgumentException;
                        }
                        n3 = rect3.bottom;
                        n4 = rect.bottom;
                        break block13;
                    } else {
                        n3 = rect3.right;
                        n4 = rect.right;
                    }
                    break block13;
                } else {
                    n3 = rect.top;
                    n4 = rect3.top;
                }
                break block13;
            }
            n3 = rect.left;
            n4 = rect3.left;
        }
        n3 -= n4;
        n3 = Math.max(n8, n3);
        if (n7 >= n3) return bl2;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean b(int var0, Rect var1_1, Rect var2_2) {
        var3_3 = 17;
        var4_4 = false;
        if (var0 != var3_3) {
            var3_3 = 33;
            if (var0 != var3_3) {
                var3_3 = 66;
                if (var0 != var3_3) {
                    var3_3 = 130;
                    if (var0 != var3_3) {
                        var5_5 = new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        throw var5_5;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                if ((var0 = var2_2.right) >= (var3_3 = var1_1.left) && (var0 = var2_2.left) <= (var6_6 = var1_1.right)) {
                    var4_4 = true;
                }
                return var4_4;
            }
        }
        if ((var0 = var2_2.bottom) >= (var3_3 = var1_1.top) && (var0 = var2_2.top) <= (var6_7 = var1_1.bottom)) {
            var4_4 = true;
        }
        return var4_4;
    }

    public static boolean c(int n3, Rect rect, Rect rect2) {
        int n4;
        int n7 = 17;
        boolean bl2 = false;
        if (n3 != n7) {
            int n8;
            n7 = 33;
            if (n3 != n7) {
                int n10;
                n7 = 66;
                if (n3 != n7) {
                    n7 = 130;
                    if (n3 == n7) {
                        int n14;
                        n3 = rect.top;
                        n7 = rect2.top;
                        if ((n3 < n7 || (n3 = rect.bottom) <= n7) && (n3 = rect.bottom) < (n14 = rect2.bottom)) {
                            bl2 = true;
                        }
                        return bl2;
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    throw illegalArgumentException;
                }
                n3 = rect.left;
                n7 = rect2.left;
                if ((n3 < n7 || (n3 = rect.right) <= n7) && (n3 = rect.right) < (n10 = rect2.right)) {
                    bl2 = true;
                }
                return bl2;
            }
            n3 = rect.bottom;
            n7 = rect2.bottom;
            if ((n3 > n7 || (n3 = rect.top) >= n7) && (n3 = rect.top) > (n8 = rect2.top)) {
                bl2 = true;
            }
            return bl2;
        }
        n3 = rect.right;
        n7 = rect2.right;
        if ((n3 > n7 || (n3 = rect.left) >= n7) && (n3 = rect.left) > (n4 = rect2.left)) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int d(int n3, Rect rect, Rect rect2) {
        int n4;
        int n7 = 17;
        if (n3 != n7) {
            n7 = 33;
            if (n3 != n7) {
                n7 = 66;
                if (n3 != n7) {
                    n7 = 130;
                    if (n3 == n7) {
                        n3 = rect2.top;
                        n4 = rect.bottom;
                        return Math.max(0, n3 -= n4);
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    throw illegalArgumentException;
                }
                n3 = rect2.left;
                n4 = rect.right;
                return Math.max(0, n3 -= n4);
            }
            n3 = rect.top;
            n4 = rect2.bottom;
            return Math.max(0, n3 -= n4);
        }
        n3 = rect.left;
        n4 = rect2.right;
        return Math.max(0, n3 -= n4);
    }

    /*
     * Unable to fully structure code
     */
    public static int e(int var0, Rect var1_1, Rect var2_2) {
        var3_3 = 17;
        if (var0 != var3_3) {
            var3_3 = 33;
            if (var0 != var3_3) {
                var3_3 = 66;
                if (var0 != var3_3) {
                    var3_3 = 130;
                    if (var0 != var3_3) {
                        var4_4 = new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        throw var4_4;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                var0 = var1_1.left;
                var5_5 = var1_1.width() / 2 + var0;
                var0 = var2_2.left;
                var6_7 = var2_2.width() / 2 + var0;
                return Math.abs(var5_5 - var6_7);
            }
        }
        var0 = var1_1.top;
        var5_6 = var1_1.height() / 2 + var0;
        var0 = var2_2.top;
        var6_8 = var2_2.height() / 2 + var0;
        return Math.abs(var5_6 - var6_8);
    }
}

