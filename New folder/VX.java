/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class VX {
    public static final VX h;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        VX vX;
        int n3 = -1;
        h = vX = new VX(1, 2, 3, n3, n3, null);
        f4.b(0, 1, 2, 3, 4);
        gz3.D(5);
    }

    public VX(int n3, int n4, int n7, int n8, int n10, byte[] byArray) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
        this.d = byArray;
        this.e = n8;
        this.f = n10;
    }

    public static String a(int n3) {
        int n4 = -1;
        if (n3 != n4) {
            n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return hj0_0.a(n3, "Undefined color range ");
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public static String b(int n3) {
        int n4 = -1;
        if (n3 != n4) {
            n4 = 6;
            if (n3 != n4) {
                n4 = 1;
                if (n3 != n4) {
                    n4 = 2;
                    if (n3 != n4) {
                        return hj0_0.a(n3, "Undefined color space ");
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static String c(int n3) {
        int n4 = -1;
        if (n3 != n4) {
            n4 = 10;
            if (n3 != n4) {
                n4 = 1;
                if (n3 != n4) {
                    n4 = 2;
                    if (n3 != n4) {
                        n4 = 3;
                        if (n3 != n4) {
                            n4 = 6;
                            if (n3 != n4) {
                                n4 = 7;
                                if (n3 != n4) {
                                    return hj0_0.a(n3, "Undefined color transfer ");
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static boolean e(VX vX) {
        int n3;
        block5: {
            block4: {
                int n4;
                byte[] byArray;
                n3 = 1;
                if (vX == null) {
                    return n3 != 0;
                }
                int n7 = 2;
                int n8 = vX.a;
                int n10 = -1;
                if (n8 != n10 && n8 != n3 && n8 != n7 || (n8 = vX.b) != n10 && n8 != n7 || (n7 = vX.c) != n10 && n7 != (n8 = 3) || (byArray = vX.d) != null) break block4;
                n7 = 8;
                n8 = vX.f;
                if (!(n8 != n10 && n8 != n7 || (n4 = vX.e) != n10 && n4 != n7)) break block5;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    public static int f(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 9;
            int n7 = 6;
            if (n3 != n4) {
                n4 = 4;
                if (n3 != n4 && n3 != (n4 = 5) && n3 != n7 && n3 != (n4 = 7)) {
                    return -1;
                }
                return 2;
            }
            return n7;
        }
        return n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int g(int n3) {
        int n4 = 1;
        if (n3 == n4) return 3;
        n4 = 4;
        if (n3 == n4) return 10;
        n4 = 13;
        if (n3 == n4) return 2;
        n4 = 16;
        int n7 = 6;
        if (n3 == n4) return n7;
        n4 = 18;
        int n8 = 7;
        if (n3 == n4) return n8;
        if (n3 == n7 || n3 == n8) return 3;
        return -1;
    }

    public final boolean d() {
        int n3 = this.a;
        int n4 = -1;
        n3 = n3 != n4 && (n3 = this.b) != n4 && (n3 = this.c) != n4 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = VX.class) == (object2 = object.getClass())) {
            int n3;
            object = (VX)object;
            int n4 = this.a;
            int n7 = ((VX)object).a;
            if (n4 != n7 || (n4 = this.b) != (n7 = ((VX)object).b) || (n4 = this.c) != (n7 = ((VX)object).c) || (n4 = (int)(Arrays.equals((byte[])(object2 = (Object)this.d), (byte[])(object3 = (Object)((VX)object).d)) ? 1 : 0)) == 0 || (n4 = this.e) != (n7 = ((VX)object).e) || (n4 = this.f) != (n3 = ((VX)object).f)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.g;
        if (n3 == 0) {
            int n4 = this.a;
            n3 = (527 + n4) * 31;
            n4 = this.b;
            n3 = (n3 + n4) * 31;
            n4 = this.c;
            n3 = (n3 + n4) * 31;
            byte[] byArray = this.d;
            n4 = (Arrays.hashCode(byArray) + n3) * 31;
            n3 = this.e;
            n4 = (n4 + n3) * 31;
            n3 = this.f;
            this.g = n4 += n3;
        }
        return this.g;
    }

    /*
     * WARNING - void declaration
     */
    public final String toString() {
        Object object;
        void var5_8;
        StringBuilder stringBuilder = new StringBuilder("ColorInfo(");
        int n3 = this.a;
        String string2 = VX.b(n3);
        stringBuilder.append(string2);
        string2 = ", ";
        stringBuilder.append(string2);
        Object object2 = VX.a(this.b);
        stringBuilder.append((String)object2);
        stringBuilder.append(string2);
        int bl2 = this.c;
        object2 = VX.c(bl2);
        stringBuilder.append((String)object2);
        stringBuilder.append(string2);
        object2 = this.d;
        if (object2 != null) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object2 = null;
        }
        stringBuilder.append((boolean)var5_8);
        stringBuilder.append(string2);
        object2 = "NA";
        int n4 = -1;
        int n7 = this.e;
        if (n7 != n4) {
            String string3 = "bit Luma";
            object = UX.a(n7, string3);
        } else {
            object = object2;
        }
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        n3 = this.f;
        if (n3 != n4) {
            object2 = UX.a(n3, "bit Chroma");
        }
        return h30_0.a(stringBuilder, (String)object2, ")");
    }
}

