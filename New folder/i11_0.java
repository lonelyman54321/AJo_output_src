/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
 * Renamed from I11
 */
public final class i11_0
extends se3_0 {
    public Z50 K0;
    public Y50[] L0;
    public boolean M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public float R0;
    public float S0;
    public String T0;
    public String U0;
    public String V0;
    public String W0;
    public int X0;
    public int Y0;
    public boolean[][] Z0;
    public final HashSet a1;
    public int[][] b1;
    public int c1;
    public int[][] d1;
    public int e1;

    public i11_0() {
        int n3;
        int n4;
        int n7;
        boolean bl2 = false;
        Object object = null;
        this.M0 = false;
        this.Y0 = 0;
        Object object2 = new HashSet();
        this.a1 = object2;
        this.e1 = 0;
        this.m0();
        object2 = this.b1;
        boolean bl3 = true;
        if (object2 != null && (n7 = ((Object)object2).length) == (n4 = this.y0) && (object2 = (Object)this.Z0) != null && (n4 = ((Object)object2).length) == (n3 = this.N0) && (n7 = ((Object)(object2 = object2[0])).length) == (n4 = this.P0)) {
            n7 = 1;
        } else {
            n7 = 0;
            object2 = null;
        }
        if (n7 == 0) {
            this.i0();
        }
        if (n7 != 0) {
            Object object3;
            boolean[] blArray;
            int n8;
            Object object4;
            object2 = null;
            for (n7 = 0; n7 < (n4 = ((boolean[][])(object4 = this.Z0)).length); ++n7) {
                object4 = null;
                for (n4 = 0; n4 < (n8 = (blArray = (object3 = this.Z0)[0]).length); ++n4) {
                    object3 = object3[n7];
                    object3[n4] = (boolean[])bl3;
                }
            }
            object2 = null;
            for (n7 = 0; n7 < (n4 = ((boolean[][])(object4 = (Object)this.b1)).length); ++n7) {
                object4 = null;
                for (n4 = 0; n4 < (n8 = (blArray = (object3 = (Object)this.b1)[0]).length); ++n4) {
                    object3 = object3[n7];
                    n8 = -1;
                    object3[n4] = (boolean[])n8;
                }
            }
        }
        this.Y0 = 0;
        object2 = this.W0;
        if (object2 != null && (n7 = (int)(((String)(object2 = ((String)object2).trim())).isEmpty() ? 1 : 0)) == 0 && (object = (Object)this.k0((String)(object2 = this.W0), false)) != null) {
            this.g0((int[][])object);
        }
        if ((object = this.V0) != null && !(bl2 = ((String)(object = ((String)object).trim())).isEmpty())) {
            object = this.V0;
            if ((object = (Object)this.k0((String)object, bl3)) != null) {
                this.h0((int[][])object);
            }
        }
    }

    public static void c0(Y50 y50) {
        y50.q0[1] = -1.0f;
        y50.M.j();
        y50.O.j();
        y50.P.j();
    }

    public static float[] l0(int n3, String stringArray) {
        Object object;
        boolean bl2;
        if (stringArray != null && !(bl2 = ((String)(object = stringArray.trim())).isEmpty())) {
            stringArray = stringArray.split(",");
            object = new float[n3];
            for (int i3 = 0; i3 < n3; ++i3) {
                int n4 = stringArray.length;
                float f5 = 1.0f;
                if (i3 < n4) {
                    String string2 = stringArray[i3];
                    float f6 = Float.parseFloat(string2);
                    try {
                        object[i3] = f6;
                    }
                    catch (Exception exception) {
                        PrintStream printStream = System.err;
                        StringBuilder stringBuilder = new StringBuilder("Error parsing `");
                        String string3 = stringArray[i3];
                        stringBuilder.append(string3);
                        string3 = "`: ";
                        stringBuilder.append(string3);
                        string2 = exception.getMessage();
                        stringBuilder.append(string2);
                        string2 = stringBuilder.toString();
                        printStream.println(string2);
                        object[i3] = f5;
                    }
                    continue;
                }
                object[i3] = f5;
            }
            return object;
        }
        return null;
    }

    public final void a0(int n3, int n4, int n7, int n8) {
        Object object;
        Object object2;
        Object object3 = (Z50)this.X;
        this.K0 = object3;
        n3 = this.N0;
        n4 = 0;
        n7 = 1;
        if (n3 >= n7 && (n3 = this.P0) >= n7) {
            Object object4;
            Object object5;
            int n10;
            this.Y0 = 0;
            object3 = this.W0;
            if (object3 != null && (n3 = (int)((object3 = object3.trim()).isEmpty() ? 1 : 0)) == 0) {
                object3 = this.W0;
                if ((object3 = (Object)this.k0((String)object3, false)) != null) {
                    this.g0((int[][])object3);
                }
            }
            if ((object3 = this.V0) != null && (n3 = (int)((object3 = object3.trim()).isEmpty() ? 1 : 0)) == 0) {
                object3 = this.V0;
                object3 = this.k0((String)object3, n7 != 0);
                this.d1 = (int[][])object3;
            }
            n3 = this.N0;
            n8 = this.P0;
            n3 = Math.max(n3, n8);
            Y50[] y50Array = this.L0;
            if (y50Array == null) {
                object3 = new Y50[n3];
                this.L0 = object3;
                object3 = null;
                for (n3 = 0; n3 < (n10 = (y50Array = this.L0).length); ++n3) {
                    object2 = new Y50();
                    object5 = ((Y50)object2).W;
                    object4 = Y50$b.MATCH_CONSTRAINT;
                    object5[0] = object4;
                    object5[n7] = object4;
                    int n14 = object2.hashCode();
                    ((Y50)object2).l = object5 = String.valueOf(n14);
                    y50Array[n3] = object2;
                }
            } else {
                n8 = y50Array.length;
                if (n3 != n8) {
                    y50Array = new Y50[n3];
                    object2 = null;
                    for (n10 = 0; n10 < n3; ++n10) {
                        Y50$b y50$b;
                        object5 = this.L0;
                        int n15 = ((Y50[])object5).length;
                        if (n10 < n15) {
                            object5 = object5[n10];
                            y50Array[n10] = object5;
                            continue;
                        }
                        object5 = new Y50();
                        object4 = ((Y50)object5).W;
                        object4[0] = y50$b = Y50$b.MATCH_CONSTRAINT;
                        object4[n7] = y50$b;
                        n15 = object5.hashCode();
                        ((Y50)object5).l = object4 = String.valueOf(n15);
                        y50Array[n10] = object5;
                    }
                    while (n3 < (n10 = ((Y50[])(object = this.L0)).length)) {
                        object = object[n3];
                        object2 = this.K0.x0;
                        ((ArrayList)object2).remove(object);
                        ((Y50)object).H();
                        ++n3;
                    }
                    this.L0 = y50Array;
                }
            }
            if ((object3 = (Object)this.d1) != null) {
                this.h0((int[][])object3);
            }
        }
        object3 = this.K0;
        object = this.L0;
        object3.getClass();
        n8 = ((Y50[])object).length;
        while (n4 < n8) {
            object2 = object[n4];
            object3.a((Y50)object2);
            ++n4;
        }
    }

    public final void d0(Y50 y50, int n3, int n4, int n7, int n8) {
        Y50[] y50Array = y50.L;
        v50_0 v50_02 = this.L0[n4].L;
        y50Array.a(v50_02, 0);
        y50Array = this.L0[n3].M;
        y50.M.a((v50_0)y50Array, 0);
        y50Array = this.L0;
        n4 = n4 + n8 + -1;
        Y50[] y50Array2 = y50Array[n4].N;
        y50.N.a((v50_0)y50Array2, 0);
        y50Array2 = this.L0;
        n3 = n3 + n7 + -1;
        v50_0 v50_03 = y50Array2[n3].O;
        y50.O.a(v50_03, 0);
    }

    public final int e0(int n3) {
        int n4 = this.X0;
        int n7 = 1;
        if (n4 == n7) {
            n4 = this.N0;
            return n3 / n4;
        }
        n4 = this.P0;
        return n3 % n4;
    }

    public final void f(Eu1 object, boolean object2) {
        int n3;
        float f5;
        int n4;
        Object object3;
        Object object4;
        float f6;
        super.f((Eu1)object, (boolean)object2);
        int n7 = this.N0;
        object2 = this.P0;
        n7 = Math.max(n7, object2);
        Object object5 = this.L0[0];
        Object object6 = this.N0;
        Object object7 = this.T0;
        Object object8 = i11_0.l0(object6, (String)object7);
        int n8 = this.N0;
        v50_0 v50_02 = this.O;
        Object object9 = this.M;
        int n10 = 1;
        if (n8 == n10) {
            i11_0.c0((Y50)object5);
            object5.M.a((v50_0)object9, 0);
            object = object5.O;
            ((v50_0)object).a(v50_02, 0);
        } else {
            object5 = null;
            for (object2 = 0; object2 < (n8 = this.N0); ++object2) {
                object7 = this.L0[object2];
                i11_0.c0((Y50)object7);
                if (object8 != null) {
                    f6 = object8[object2];
                    object4 = ((Y50)object7).q0;
                    object4[n10] = f6;
                }
                object3 = ((Y50)object7).M;
                if (object2 > 0) {
                    object4 = this.L0;
                    n4 = object2 + -1;
                    object4 = object4[n4].O;
                    ((v50_0)object3).a((v50_0)object4, 0);
                } else {
                    ((v50_0)object3).a((v50_0)object9, 0);
                }
                int n14 = this.N0 - n10;
                object7 = ((Y50)object7).O;
                if (object2 < n14) {
                    object4 = this.L0;
                    n4 = object2 + 1;
                    object4 = object4[n4].M;
                    ((v50_0)object7).a((v50_0)object4, 0);
                } else {
                    ((v50_0)object7).a(v50_02, 0);
                }
                if (object2 <= 0) continue;
                f5 = this.S0;
                ((v50_0)object3).g = n8 = (int)f5;
            }
            while (n8 < n7) {
                object5 = this.L0[n8];
                i11_0.c0((Y50)object5);
                object8 = object5.M;
                object8.a((v50_0)object9, 0);
                object5 = object5.O;
                object5.a(v50_02, 0);
                ++n8;
            }
        }
        n7 = this.N0;
        object2 = this.P0;
        n7 = Math.max(n7, object2);
        object5 = this.L0[0];
        object6 = this.P0;
        object7 = this.U0;
        object8 = i11_0.l0(object6, (String)object7);
        n8 = this.P0;
        v50_02 = this.N;
        object9 = this.L;
        f6 = -1.0f;
        if (n8 == n10) {
            object5.q0[0] = f6;
            object5.L.j();
            object5.N.j();
            object5.L.a((v50_0)object9, 0);
            object = object5.N;
            ((v50_0)object).a(v50_02, 0);
        } else {
            object5 = null;
            for (object2 = 0; object2 < (n8 = this.P0); ++object2) {
                Object object10;
                object7 = this.L0[object2];
                ((Y50)object7).q0[0] = f6;
                ((Y50)object7).L.j();
                object4 = ((Y50)object7).N;
                ((v50_0)object4).j();
                if (object8 != null) {
                    float f7 = object8[object2];
                    object10 = ((Y50)object7).q0;
                    object10[0] = f7;
                }
                object4 = ((Y50)object7).L;
                if (object2 > 0) {
                    object10 = this.L0;
                    n3 = object2 + -1;
                    object10 = object10[n3].N;
                    ((v50_0)object4).a((v50_0)object10, 0);
                } else {
                    ((v50_0)object4).a((v50_0)object9, 0);
                }
                n4 = this.P0 - n10;
                object7 = ((Y50)object7).N;
                if (object2 < n4) {
                    object10 = this.L0;
                    n3 = object2 + 1;
                    object10 = object10[n3].L;
                    ((v50_0)object7).a((v50_0)object10, 0);
                } else {
                    ((v50_0)object7).a(v50_02, 0);
                }
                if (object2 <= 0) continue;
                f5 = this.R0;
                ((v50_0)object4).g = n8 = (int)f5;
            }
            while (n8 < n7) {
                object5 = this.L0[n8];
                object5.q0[0] = f6;
                object5.L.j();
                object5.N.j();
                object8 = object5.L;
                object8.a((v50_0)object9, 0);
                object5 = object5.N;
                object5.a(v50_02, 0);
                ++n8;
            }
        }
        object = null;
        for (n7 = 0; n7 < (object2 = this.y0); ++n7) {
            Object object11;
            Object object12;
            Object object13;
            Object object14;
            object5 = this.a1;
            object8 = this.x0[n7].l;
            object2 = object5.contains(object8);
            if (object2 != 0) continue;
            object2 = 0;
            object5 = null;
            object6 = 0;
            object8 = null;
            while (true) {
                n8 = -1;
                f5 = 0.0f / 0.0f;
                if (object2 != 0) break;
                object6 = this.Y0;
                object14 = this.N0;
                object13 = this.P0;
                if (object6 >= (object14 *= object13)) {
                    object6 = -1;
                    break;
                }
                n8 = this.f0((int)object6);
                object14 = this.Y0;
                object9 = this.Z0;
                object7 = object9[n8];
                object13 = object7[object14 = this.e0((int)object14)];
                if (object13 != 0) {
                    object7[object14] = false;
                    object2 = 1;
                }
                this.Y0 = n8 = this.Y0 + n10;
            }
            n4 = this.f0((int)object6);
            n3 = this.e0((int)object6);
            if (object6 == n8) break;
            object2 = this.c1;
            n8 = 2;
            f5 = 2.8E-45f;
            if ((object2 &= n8) > 0 && (object5 = (Object)this.d1) != null && (object14 = this.e1) < (object13 = ((Y50[])object5).length) && (object14 = (Object)(object5 = object5[object14])[0]) == object6) {
                object8 = this.Z0[n4];
                object8[n3] = n10;
                object6 = object5[n10];
                object2 = object5[n8];
                if ((object2 = (Object)this.j0(n4, n3, (int)object6, (int)object2)) == 0) continue;
                object4 = this.x0[n7];
                object5 = this.d1;
                object6 = this.e1;
                object5 = object5[object6];
                object12 = object5[n10];
                object11 = object5[n8];
                object3 = this;
                this.d0((Y50)object4, n4, n3, (int)object12, (int)object11);
                this.e1 = object2 = this.e1 + n10;
                continue;
            }
            object5 = this.x0;
            object4 = object5[n7];
            object12 = 1;
            object11 = 1;
            object3 = this;
            this.d0((Y50)object4, n4, n3, (int)object12, (int)object11);
        }
    }

    public final int f0(int n3) {
        int n4 = this.X0;
        int n7 = 1;
        if (n4 == n7) {
            n4 = this.N0;
            return n3 % n4;
        }
        n4 = this.P0;
        return n3 / n4;
    }

    public final void g0(int[][] nArray) {
        for (int[] nArray2 : nArray) {
            int n3 = nArray2[0];
            n3 = this.f0(n3);
            int n4 = nArray2[0];
            n4 = this.e0(n4);
            int n7 = nArray2[1];
            int n8 = 2;
            int n10 = nArray2[n8];
            if ((n10 = (int)(this.j0(n3, n4, n7, n10) ? 1 : 0)) != 0) continue;
            return;
        }
    }

    public final void h0(int[][] nArray) {
        int n3;
        int n4 = this.c1;
        int n7 = 2;
        if ((n4 &= n7) > 0) {
            return;
        }
        n4 = 0;
        for (int i3 = 0; i3 < (n3 = nArray.length); ++i3) {
            n3 = nArray[i3][0];
            int n8 = this.f0(n3);
            n3 = nArray[i3][0];
            int n10 = this.e0(n3);
            Object object = nArray[i3];
            int n14 = 1;
            int n15 = object[n14];
            n3 = object[n7];
            if ((n3 = (int)(this.j0(n8, n10, n15, n3) ? 1 : 0)) == 0) {
                return;
            }
            Y50 y50 = this.x0[i3];
            object = nArray[i3];
            int n16 = object[n14];
            int n17 = object[n7];
            Object object2 = this;
            this.d0(y50, n8, n10, n16, n17);
            object = this.x0[i3].l;
            object2 = this.a1;
            ((HashSet)object2).add(object);
        }
    }

    public final void i0() {
        int n3 = this.N0;
        int n4 = this.P0;
        int n7 = 2;
        Object[] objectArray = new int[n7];
        int n8 = 1;
        objectArray[n8] = n4;
        n4 = 0;
        objectArray[0] = n3;
        Object object = (boolean[][])Array.newInstance(Boolean.TYPE, objectArray);
        this.Z0 = object;
        int n10 = ((boolean[][])object).length;
        for (int i3 = 0; i3 < n10; ++i3) {
            boolean[] blArray = object[i3];
            Arrays.fill(blArray, n8 != 0);
        }
        n3 = this.y0;
        if (n3 > 0) {
            int[] nArray = new int[n7];
            nArray[n8] = n10 = 4;
            nArray[0] = n3;
            object = (int[][])Array.newInstance(Integer.TYPE, nArray);
            this.b1 = (int[][])object;
            n7 = ((boolean[][])object).length;
            while (n4 < n7) {
                objectArray = object[n4];
                n8 = -1;
                Arrays.fill(objectArray, n8);
                ++n4;
            }
        }
    }

    public final boolean j0(int n3, int n4, int n7, int n8) {
        int n10;
        for (int i3 = n3; i3 < (n10 = n3 + n7); ++i3) {
            int n14;
            for (n10 = n4; n10 < (n14 = n4 + n8); ++n10) {
                boolean[] blArray;
                Object object = this.Z0;
                Object object2 = ((boolean[][])object).length;
                if (i3 < object2 && n10 < (object2 = (blArray = object[0]).length) && (object2 = (Object)(object = (Object)object[i3])[n10]) != 0) {
                    object[n10] = (boolean[])false;
                    continue;
                }
                return false;
            }
        }
        return true;
    }

    public final int[][] k0(String stringArray, boolean n3) {
        Object object;
        block75: {
            int n4;
            block81: {
                int n7;
                int n8;
                block80: {
                    String string2;
                    int n10;
                    Object object2;
                    int n14;
                    block74: {
                        object = ",";
                        stringArray = stringArray.split((String)object);
                        object = new Object();
                        Arrays.sort(stringArray, object);
                        int n15 = stringArray.length;
                        n14 = 2;
                        object2 = new int[n14];
                        int n16 = 3;
                        n4 = 1;
                        object2[n4] = n16;
                        n16 = 0;
                        object2[0] = n15;
                        object = Integer.TYPE;
                        object = Array.newInstance(object, (int[])object2);
                        object = (int[][])object;
                        n10 = this.N0;
                        string2 = ":";
                        if (n10 == n4) break block74;
                        n10 = this.P0;
                        if (n10 == n4) break block74;
                        n3 = 0;
                        while (true) {
                            block77: {
                                int n17;
                                int n18;
                                Object object3;
                                Object object4;
                                block76: {
                                    n10 = stringArray.length;
                                    if (n3 >= n10) break block75;
                                    object2 = stringArray[n3];
                                    object2 = ((String)object2).trim();
                                    object2 = ((String)object2).split(string2);
                                    object4 = object2[n4];
                                    object3 = "x";
                                    object4 = object4.split((String)object3);
                                    object3 = object[n3];
                                    object2 = object2[0];
                                    n10 = Integer.parseInt((String)object2);
                                    object3[0] = n10;
                                    n10 = this.c1 & n4;
                                    if (n10 <= 0) break block76;
                                    object2 = object[n3];
                                    object3 = object4[n4];
                                    n18 = Integer.parseInt((String)object3);
                                    object2[n4] = n18;
                                    object2 = object[n3];
                                    object4 = object4[0];
                                    n17 = Integer.parseInt((String)object4);
                                    object2[n14] = n17;
                                    break block77;
                                }
                                object2 = object[n3];
                                object3 = object4[0];
                                n18 = Integer.parseInt((String)object3);
                                object2[n4] = n18;
                                object2 = object[n3];
                                object4 = object4[n4];
                                n17 = Integer.parseInt((String)object4);
                                object2[n14] = n17;
                            }
                            ++n3;
                        }
                    }
                    n10 = 0;
                    object2 = null;
                    int n19 = 0;
                    Object var11_12 = null;
                    n8 = 0;
                    Object var12_14 = null;
                    while (true) {
                        block79: {
                            Object object5;
                            Object object6;
                            Object object7;
                            Object object8;
                            block78: {
                                object8 = stringArray.length;
                                if (n10 >= object8) break;
                                object7 = stringArray[n10];
                                object7 = object7.trim();
                                object7 = object7.split(string2);
                                object6 = object[n10];
                                String string3 = object7[0];
                                int n20 = Integer.parseInt(string3);
                                object6[0] = n20;
                                object6 = object[n10];
                                object6[n4] = n4;
                                object6[n14] = n4;
                                n20 = this.P0;
                                if (n20 != n4) break block78;
                                string3 = object7[n4];
                                n20 = Integer.parseInt(string3);
                                object6[n4] = n20;
                                object6 = object[n10];
                                object5 = object6[n4];
                                n19 += object5;
                                if (n3 == 0) break block78;
                                n19 += -1;
                            }
                            object5 = this.N0;
                            if (object5 != n4) break block79;
                            object6 = object[n10];
                            object7 = object7[n4];
                            object8 = Integer.parseInt((String)object7);
                            object6[n14] = object8;
                            object7 = object[n10];
                            object8 = object7[n14];
                            n8 += object8;
                            if (n3 == 0) break block79;
                            n8 += -1;
                        }
                        ++n10;
                    }
                    n7 = 50;
                    if (n19 != 0) {
                        n3 = (int)(this.M0 ? 1 : 0);
                        if (n3 != 0) break block80;
                        n3 = this.N0 + n19;
                        if (n3 > n7) break block80;
                        n14 = this.O0;
                        if (n14 == n3) break block80;
                        this.O0 = n3;
                        this.m0();
                        this.i0();
                    }
                }
                if (n8 != 0) {
                    n3 = (int)(this.M0 ? 1 : 0);
                    if (n3 != 0) break block81;
                    n3 = this.P0 + n8;
                    if (n3 > n7) break block81;
                    n7 = this.Q0;
                    if (n7 == n3) break block81;
                    this.Q0 = n3;
                    this.m0();
                    this.i0();
                }
            }
            try {
                this.M0 = n4;
            }
            catch (Exception exception) {
                return null;
            }
        }
        return object;
    }

    public final void m0() {
        int n3;
        int n4 = this.O0;
        if (n4 != 0 && (n3 = this.Q0) != 0) {
            this.N0 = n4;
            this.P0 = n3;
        } else {
            n3 = this.Q0;
            if (n3 > 0) {
                this.P0 = n3;
                this.N0 = n4 = (this.y0 + n3 + -1) / n3;
            } else if (n4 > 0) {
                this.N0 = n4;
                this.P0 = n3 = (this.y0 + n4 + -1) / n4;
            } else {
                double d2 = Math.sqrt(this.y0);
                double d5 = 1.5;
                this.N0 = n4 = (int)(d2 += d5);
                this.P0 = n3 = (this.y0 + n4 + -1) / n4;
            }
        }
    }
}

