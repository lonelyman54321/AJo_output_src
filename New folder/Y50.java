/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Y50 {
    public int A;
    public float B;
    public int C;
    public float D;
    public int[] E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public final v50_0 L;
    public final v50_0 M;
    public final v50_0 N;
    public final v50_0 O;
    public final v50_0 P;
    public final v50_0 Q;
    public final v50_0 R;
    public final v50_0 S;
    public final v50_0[] T;
    public final ArrayList U;
    public final boolean[] V;
    public Y50$b[] W;
    public Y50 X;
    public int Y;
    public int Z;
    public boolean a;
    public float a0;
    public sr_0 b;
    public int b0;
    public sr_0 c;
    public int c0;
    public v91 d;
    public int d0;
    public zb3_1 e;
    public int e0;
    public final boolean[] f;
    public int f0;
    public boolean g;
    public int g0;
    public final boolean h;
    public float h0;
    public int i;
    public float i0;
    public int j;
    public Object j0;
    public final UF3 k;
    public int k0;
    public String l;
    public boolean l0;
    public boolean m;
    public String m0;
    public boolean n;
    public String n0;
    public boolean o;
    public int o0;
    public boolean p;
    public int p0;
    public int q;
    public final float[] q0;
    public int r;
    public final Y50[] r0;
    public int s;
    public final Y50[] s0;
    public int t;
    public Y50 t0;
    public int u;
    public Y50 u0;
    public final int[] v;
    public int v0;
    public int w;
    public int w0;
    public int x;
    public float y;
    public int z;

    public Y50() {
        float f5;
        int n3;
        this.a = false;
        this.d = null;
        this.e = null;
        int n4 = 1;
        int n7 = 2;
        boolean[] blArray = new boolean[n7];
        blArray[0] = true;
        blArray[1] = true;
        this.f = blArray;
        this.g = n4;
        this.h = n4;
        this.i = n3 = -1;
        this.j = n3;
        Object[] objectArray = new UF3(this);
        this.k = objectArray;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = n3;
        this.r = n3;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        objectArray = new int[n7];
        this.v = (int[])objectArray;
        this.w = 0;
        this.x = 0;
        this.y = f5 = 1.0f;
        this.z = 0;
        this.A = 0;
        this.B = f5;
        this.C = n3;
        this.D = f5;
        int n8 = -1 >>> 1;
        objectArray = new int[]{n8, n8};
        this.E = (int[])objectArray;
        this.F = 0.0f / 0.0f;
        this.G = false;
        this.I = false;
        this.J = 0;
        this.K = 0;
        Object object = v50$a.LEFT;
        objectArray = new v50_0(this, (v50$a)((Object)object));
        this.L = objectArray;
        Object object2 = v50$a.TOP;
        super(this, (v50$a)((Object)object2));
        this.M = object;
        Object object3 = v50$a.RIGHT;
        super(this, (v50$a)((Object)object3));
        this.N = object2;
        Object object4 = v50$a.BOTTOM;
        super(this, (v50$a)((Object)object4));
        this.O = object3;
        Object object5 = v50$a.BASELINE;
        super(this, (v50$a)((Object)object5));
        this.P = object4;
        v50_0[] v50_0Array = v50$a.CENTER_X;
        super(this, (v50$a)v50_0Array);
        this.Q = object5;
        v50_0Array = v50$a.CENTER_Y;
        super(this, (v50$a)v50_0Array);
        this.R = object5;
        v50_0Array = v50$a.CENTER;
        super(this, (v50$a)v50_0Array);
        this.S = object5;
        v50_0Array = new v50_0[6];
        v50_0Array[0] = objectArray;
        v50_0Array[n4] = object2;
        v50_0Array[n7] = object;
        v50_0Array[3] = object3;
        v50_0Array[4] = object4;
        v50_0Array[5] = object5;
        this.T = v50_0Array;
        objectArray = new ArrayList();
        this.U = objectArray;
        objectArray = new boolean[n7];
        this.V = (boolean[])objectArray;
        objectArray = new Y50$b[n7];
        object = Y50$b.FIXED;
        objectArray[0] = object;
        objectArray[n4] = object;
        this.W = objectArray;
        this.X = null;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0.0f;
        this.b0 = n3;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.h0 = f5 = 0.5f;
        this.i0 = f5;
        this.k0 = 0;
        this.l0 = false;
        this.m0 = null;
        this.n0 = null;
        this.o0 = 0;
        this.p0 = 0;
        objectArray = new float[n7];
        objectArray[0] = (Y50$b)-1.0f;
        objectArray[1] = (Y50$b)-1.0f;
        this.q0 = (float[])objectArray;
        objectArray = new Y50[n7];
        objectArray[0] = null;
        objectArray[n4] = null;
        this.r0 = objectArray;
        Y50[] y50Array = new Y50[n7];
        y50Array[0] = null;
        y50Array[n4] = null;
        this.s0 = y50Array;
        this.t0 = null;
        this.u0 = null;
        this.v0 = n3;
        this.w0 = n3;
        this.d();
    }

    public Y50(int n3, int n4) {
        float f5;
        int n7;
        int n8 = 1;
        int n10 = 2;
        this.a = false;
        this.d = null;
        this.e = null;
        boolean[] blArray = new boolean[n10];
        blArray[0] = true;
        blArray[1] = true;
        this.f = blArray;
        this.g = n8;
        this.h = n8;
        this.i = n7 = -1;
        this.j = n7;
        Object[] objectArray = new UF3(this);
        this.k = objectArray;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = n7;
        this.r = n7;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        objectArray = new int[n10];
        this.v = (int[])objectArray;
        this.w = 0;
        this.x = 0;
        this.y = f5 = 1.0f;
        this.z = 0;
        this.A = 0;
        this.B = f5;
        this.C = n7;
        this.D = f5;
        int n14 = -1 >>> 1;
        objectArray = new int[]{n14, n14};
        this.E = (int[])objectArray;
        this.F = 0.0f / 0.0f;
        this.G = false;
        this.I = false;
        this.J = 0;
        this.K = 0;
        Object object = v50$a.LEFT;
        objectArray = new v50_0(this, (v50$a)((Object)object));
        this.L = objectArray;
        Object object2 = v50$a.TOP;
        super(this, (v50$a)((Object)object2));
        this.M = object;
        Object object3 = v50$a.RIGHT;
        super(this, (v50$a)((Object)object3));
        this.N = object2;
        Object object4 = v50$a.BOTTOM;
        super(this, (v50$a)((Object)object4));
        this.O = object3;
        Object object5 = v50$a.BASELINE;
        super(this, (v50$a)((Object)object5));
        this.P = object4;
        v50_0[] v50_0Array = v50$a.CENTER_X;
        super(this, (v50$a)v50_0Array);
        this.Q = object5;
        v50_0Array = v50$a.CENTER_Y;
        super(this, (v50$a)v50_0Array);
        this.R = object5;
        v50_0Array = v50$a.CENTER;
        super(this, (v50$a)v50_0Array);
        this.S = object5;
        v50_0Array = new v50_0[6];
        v50_0Array[0] = objectArray;
        v50_0Array[n8] = object2;
        v50_0Array[n10] = object;
        v50_0Array[3] = object3;
        v50_0Array[4] = object4;
        v50_0Array[5] = object5;
        this.T = v50_0Array;
        objectArray = new ArrayList();
        this.U = objectArray;
        objectArray = new boolean[n10];
        this.V = (boolean[])objectArray;
        objectArray = new Y50$b[n10];
        object = Y50$b.FIXED;
        objectArray[0] = object;
        objectArray[n8] = object;
        this.W = objectArray;
        this.X = null;
        this.a0 = 0.0f;
        this.b0 = n7;
        this.e0 = 0;
        this.h0 = f5 = 0.5f;
        this.i0 = f5;
        this.k0 = 0;
        this.l0 = false;
        this.m0 = null;
        this.n0 = null;
        this.o0 = 0;
        this.p0 = 0;
        objectArray = new float[n10];
        objectArray[0] = (Y50$b)-1.0f;
        objectArray[1] = (Y50$b)-1.0f;
        this.q0 = (float[])objectArray;
        objectArray = new Y50[n10];
        objectArray[0] = null;
        objectArray[n8] = null;
        this.r0 = objectArray;
        Y50[] y50Array = new Y50[n10];
        y50Array[0] = null;
        y50Array[n8] = null;
        this.s0 = y50Array;
        this.t0 = null;
        this.u0 = null;
        this.v0 = n7;
        this.w0 = n7;
        this.c0 = 0;
        this.d0 = 0;
        this.Y = n3;
        this.Z = n4;
        this.d();
    }

    public static void L(String string2, int n3, int n4, StringBuilder stringBuilder) {
        if (n3 == n4) {
            return;
        }
        stringBuilder.append(string2);
        stringBuilder.append(" :   ");
        stringBuilder.append(n3);
        stringBuilder.append(",\n");
    }

    public static void M(StringBuilder stringBuilder, String string2, float f5, float f6) {
        Object object = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
        if (object == false) {
            return;
        }
        stringBuilder.append(string2);
        stringBuilder.append(" :   ");
        stringBuilder.append(f5);
        stringBuilder.append(",\n");
    }

    public static void t(StringBuilder stringBuilder, String string2, int n3, int n4, int n7, int n8, int n10, float f5, Y50$b object) {
        stringBuilder.append(string2);
        stringBuilder.append(" :  {\n");
        string2 = object.toString();
        object = ((Object)((Object)Y50$b.FIXED)).toString();
        boolean bl2 = ((String)object).equals(string2);
        if (!bl2) {
            object = "      behavior";
            String string3 = " :   ";
            String string4 = ",\n";
            X50.a(stringBuilder, (String)object, string3, string2, string4);
        }
        Y50.L("      size", n3, 0, stringBuilder);
        Y50.L("      min", n4, 0, stringBuilder);
        Y50.L("      max", n7, -1 >>> 1, stringBuilder);
        Y50.L("      matchMin", n8, 0, stringBuilder);
        Y50.L("      matchDef", n10, 0, stringBuilder);
        Y50.M(stringBuilder, "      matchPercent", f5, 1.0f);
        stringBuilder.append("    },\n");
    }

    public static void u(StringBuilder stringBuilder, String object, v50_0 v50_02) {
        Object object2 = v50_02.f;
        if (object2 == null) {
            return;
        }
        object2 = "    ";
        stringBuilder.append((String)object2);
        stringBuilder.append((String)object);
        stringBuilder.append(" : [ '");
        object = v50_02.f;
        stringBuilder.append(object);
        object = "'";
        stringBuilder.append((String)object);
        int n3 = v50_02.h;
        int n4 = -1 << -1;
        if (n3 != n4 || (n3 = v50_02.g) != 0) {
            object = ",";
            stringBuilder.append((String)object);
            int n7 = v50_02.g;
            stringBuilder.append(n7);
            n7 = v50_02.h;
            if (n7 != n4) {
                stringBuilder.append((String)object);
                int n8 = v50_02.h;
                stringBuilder.append(n8);
                stringBuilder.append((String)object);
            }
        }
        stringBuilder.append(" ] ,\n");
    }

    public final void A(v50$a object, Y50 object2, v50$a v50$a, int n3, int n4) {
        object = this.n((v50$a)((Object)object));
        object2 = ((Y50)object2).n(v50$a);
        ((v50_0)object).b((v50_0)object2, n3, n4, true);
    }

    public final boolean B(int n3) {
        int n4;
        block3: {
            v50_0 v50_02;
            block2: {
                Object object = this.T;
                v50_02 = object[n3 *= 2];
                v50_0 v50_03 = v50_02.f;
                if (v50_03 == null || (v50_03 = v50_03.f) == v50_02) break block2;
                n4 = 1;
                v50_0 v50_04 = object[n3 += n4];
                object = v50_04.f;
                if (object != null && (object = object.f) == v50_04) break block3;
            }
            n4 = 0;
            v50_02 = null;
        }
        return n4 != 0;
    }

    public final boolean C() {
        block3: {
            block2: {
                v50_0 v50_02 = this.L;
                v50_0 v50_03 = v50_02.f;
                if (v50_03 != null && (v50_03 = v50_03.f) == v50_02) break block2;
                v50_02 = this.N;
                v50_03 = v50_02.f;
                if (v50_03 == null || (v50_03 = v50_03.f) != v50_02) break block3;
            }
            return true;
        }
        return false;
    }

    public final boolean D() {
        block3: {
            block2: {
                v50_0 v50_02 = this.M;
                v50_0 v50_03 = v50_02.f;
                if (v50_03 != null && (v50_03 = v50_03.f) == v50_02) break block2;
                v50_02 = this.O;
                v50_03 = v50_02.f;
                if (v50_03 == null || (v50_03 = v50_03.f) != v50_02) break block3;
            }
            return true;
        }
        return false;
    }

    public final boolean E() {
        int n3;
        int n4 = this.g;
        n4 = n4 != 0 && (n4 = this.k0) != (n3 = 8) ? 1 : 0;
        return n4 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean F() {
        boolean bl2 = this.m;
        if (bl2) return true;
        v50_0 v50_02 = this.L;
        bl2 = v50_02.c;
        if (!bl2) return false;
        v50_02 = this.N;
        bl2 = v50_02.c;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean G() {
        boolean bl2 = this.n;
        if (bl2) return true;
        v50_0 v50_02 = this.M;
        bl2 = v50_02.c;
        if (!bl2) return false;
        v50_02 = this.O;
        bl2 = v50_02.c;
        if (!bl2) return false;
        return true;
    }

    public void H() {
        float f5;
        Y50$b y50$b;
        float f6;
        int n3;
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.S.j();
        this.X = null;
        this.F = 0.0f / 0.0f;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0.0f;
        this.b0 = n3 = -1;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = 0;
        this.h0 = f6 = 0.5f;
        this.i0 = f6;
        Y50$b[] y50$bArray = this.W;
        y50$bArray[0] = y50$b = Y50$b.FIXED;
        int n4 = 1;
        y50$bArray[n4] = y50$b;
        this.j0 = null;
        this.k0 = 0;
        this.n0 = null;
        this.o0 = 0;
        this.p0 = 0;
        Object[] objectArray = this.q0;
        objectArray[0] = f6 = -1.0f;
        objectArray[n4] = f6;
        this.q = n3;
        this.r = n3;
        objectArray = this.E;
        int n7 = -1 >>> 1;
        objectArray[0] = n7;
        objectArray[n4] = n7;
        this.t = 0;
        this.u = 0;
        this.y = f5 = 1.0f;
        this.B = f5;
        this.x = n7;
        this.A = n7;
        this.w = 0;
        this.z = 0;
        this.C = n3;
        this.D = f5;
        objectArray = this.f;
        objectArray[0] = n4;
        objectArray[n4] = n4;
        this.I = false;
        objectArray = this.V;
        objectArray[0] = 0.0f;
        objectArray[n4] = 0.0f;
        this.g = n4;
        objectArray = this.v;
        objectArray[0] = 0.0f;
        objectArray[n4] = 0.0f;
        this.i = n3;
        this.j = n3;
    }

    public final void I() {
        int n3;
        Object object = this.X;
        if (object != null && (n3 = object instanceof Z50) != 0) {
            object = (Z50)object;
            object.getClass();
        }
        object = this.U;
        n3 = ((ArrayList)object).size();
        for (int i3 = 0; i3 < n3; ++i3) {
            v50_0 v50_02 = (v50_0)((ArrayList)object).get(i3);
            v50_02.j();
        }
    }

    public final void J() {
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        ArrayList arrayList = this.U;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            v50_0 v50_02 = (v50_0)arrayList.get(i3);
            v50_02.c = false;
            v50_02.b = 0;
        }
    }

    public void K(SI sI) {
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.P.k();
        this.S.k();
        this.Q.k();
        this.R.k();
    }

    public final void N(int n3) {
        this.e0 = n3;
        n3 = n3 > 0 ? 1 : 0;
        this.G = n3;
    }

    public final void O(String string2) {
        block11: {
            float f5;
            float f6;
            int n3;
            int n4;
            block10: {
                block13: {
                    int n7;
                    int n8;
                    block12: {
                        float f7;
                        float f8;
                        int n10;
                        n4 = 0;
                        if (string2 == null || (n8 = string2.length()) == 0) break block11;
                        n8 = string2.length();
                        int n14 = string2.indexOf(44);
                        n7 = 0;
                        String string3 = null;
                        int n15 = 1;
                        n3 = -1;
                        if (n14 > 0 && n14 < (n10 = n8 + -1)) {
                            String string4;
                            String string5 = string2.substring(0, n14);
                            boolean bl2 = string5.equalsIgnoreCase(string4 = "W");
                            if (!bl2) {
                                string3 = "H";
                                n7 = (int)(string5.equalsIgnoreCase(string3) ? 1 : 0);
                                n7 = n7 != 0 ? 1 : -1;
                            }
                            n3 = n7;
                            n7 = n14 += n15;
                        }
                        if ((n14 = string2.indexOf(58)) < 0 || n14 >= (n8 -= n15)) break block12;
                        String string6 = string2.substring(n7, n14);
                        string2 = string2.substring(n14 += n15);
                        n14 = string6.length();
                        if (n14 <= 0 || (n14 = string2.length()) <= 0) break block13;
                        try {
                            f8 = Float.parseFloat(string6);
                        }
                        catch (NumberFormatException numberFormatException) {}
                        f6 = Float.parseFloat(string2);
                        float f11 = f8 - 0.0f;
                        n14 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
                        if (n14 <= 0 || (n14 = (int)((f7 = f6 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) <= 0) break block13;
                        if (n3 == n15) {
                            f6 /= f8;
                            f6 = Math.abs(f6);
                            break block10;
                        }
                        f8 /= f6;
                        f6 = Math.abs(f8);
                        break block10;
                    }
                    n8 = (string2 = string2.substring(n7)).length();
                    if (n8 <= 0) break block13;
                    f6 = Float.parseFloat(string2);
                    break block10;
                }
                f6 = 0.0f;
                string2 = null;
            }
            n4 = (f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
            if (n4 > 0) {
                this.a0 = f6;
                this.b0 = n3;
            }
            return;
        }
        this.a0 = 0.0f;
    }

    public final void P(int n3, int n4) {
        boolean bl2 = this.m;
        if (bl2) {
            return;
        }
        this.L.l(n3);
        this.N.l(n4);
        this.c0 = n3;
        this.Y = n4 -= n3;
        this.m = true;
    }

    public final void Q(int n3, int n4) {
        boolean bl2 = this.n;
        if (bl2) {
            return;
        }
        this.M.l(n3);
        v50_0 v50_02 = this.O;
        v50_02.l(n4);
        this.d0 = n3;
        this.Z = n4 -= n3;
        n4 = (int)(this.G ? 1 : 0);
        if (n4 != 0) {
            n4 = this.e0;
            v50_0 v50_03 = this.P;
            v50_03.l(n3 += n4);
        }
        this.n = true;
    }

    public final void R(int n3) {
        this.Z = n3;
        int n4 = this.g0;
        if (n3 < n4) {
            this.Z = n4;
        }
    }

    public final void S(Y50$b y50$b) {
        this.W[0] = y50$b;
    }

    public final void T(int n3, float f5, int n4, int n7) {
        this.t = n3;
        this.w = n4;
        n4 = -1 >>> 1;
        float f6 = 0.0f / 0.0f;
        if (n7 == n4) {
            n7 = 0;
        }
        this.x = n7;
        this.y = f5;
        f6 = 0.0f;
        float f7 = f5 - 0.0f;
        n4 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
        if (n4 > 0) {
            n4 = 1065353216;
            f6 = 1.0f;
            float f8 = f5 - f6;
            Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (object < 0 && n3 == 0) {
                this.t = n3 = 2;
            }
        }
    }

    public final void U(Y50$b y50$b) {
        this.W[1] = y50$b;
    }

    public final void V(int n3, float f5, int n4, int n7) {
        this.u = n3;
        this.z = n4;
        n4 = -1 >>> 1;
        float f6 = 0.0f / 0.0f;
        if (n7 == n4) {
            n7 = 0;
        }
        this.A = n7;
        this.B = f5;
        f6 = 0.0f;
        float f7 = f5 - 0.0f;
        n4 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
        if (n4 > 0) {
            n4 = 1065353216;
            f6 = 1.0f;
            float f8 = f5 - f6;
            Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (object < 0 && n3 == 0) {
                this.u = n3 = 2;
            }
        }
    }

    public final void W(int n3) {
        this.Y = n3;
        int n4 = this.f0;
        if (n3 < n4) {
            this.Y = n4;
        }
    }

    public void X(boolean n3, boolean bl2) {
        Object object;
        Zo0 zo0 = this.d;
        int n4 = zo0.g;
        n3 &= n4;
        Zo0 zo02 = this.e;
        int n7 = zo02.g;
        bl2 &= n7;
        Object object2 = zo0.h;
        n7 = object2.g;
        dp0 dp02 = zo02.h;
        int n8 = dp02.g;
        zo0 = zo0.i;
        int n10 = ((dp0)zo0).g;
        zo02 = zo02.i;
        n4 = ((dp0)zo02).g;
        int n14 = n10 - n7;
        int n15 = n4 - n8;
        if (n14 < 0 || n15 < 0 || n7 == (n14 = -1 << -1) || n7 == (n15 = -1 >>> 1) || n8 == n14 || n8 == n15 || n10 == n14 || n10 == n15 || n4 == n14 || n4 == n15) {
            n10 = 0;
            zo0 = null;
            n4 = 0;
            zo02 = null;
            n7 = 0;
            object2 = null;
            n8 = 0;
            dp02 = null;
        }
        n10 -= n7;
        n4 -= n8;
        if (n3 != 0) {
            this.c0 = n7;
        }
        if (bl2) {
            this.d0 = n8;
        }
        if ((n7 = this.k0) == (n8 = 8)) {
            this.Y = 0;
            this.Z = 0;
            return;
        }
        if (n3 != 0) {
            object = this.W[0];
            object2 = Y50$b.FIXED;
            if (object == object2 && n10 < (n3 = this.Y)) {
                n10 = n3;
            }
            this.Y = n10;
            n3 = this.f0;
            if (n10 < n3) {
                this.Y = n3;
            }
        }
        if (bl2) {
            object = this.W;
            bl2 = true;
            Y50$b y50$b = Y50$b.FIXED;
            if ((object = object[bl2]) == y50$b && n4 < (n3 = this.Z)) {
                n4 = n3;
            }
            this.Z = n4;
            n3 = this.g0;
            if (n4 < n3) {
                this.Z = n3;
            }
        }
    }

    public void Y(Eu1 object, boolean n3) {
        boolean bl2;
        Object object2;
        dp0 dp02;
        Zo0 zo0;
        Object object3 = this.L;
        object.getClass();
        int n4 = Eu1.n(object3);
        object3 = this.M;
        int n7 = Eu1.n(object3);
        v50_0 v50_02 = this.N;
        int n8 = Eu1.n(v50_02);
        v50_0 v50_03 = this.O;
        int n10 = Eu1.n(v50_03);
        if (n3 != 0 && (zo0 = this.d) != null) {
            dp02 = zo0.h;
            boolean bl3 = dp02.j;
            if (bl3) {
                zo0 = zo0.i;
                bl3 = ((dp0)zo0).j;
                if (bl3) {
                    n4 = dp02.g;
                    n8 = ((dp0)zo0).g;
                }
            }
        }
        if (n3 != 0 && (object2 = this.e) != null) {
            zo0 = object2.h;
            bl2 = ((dp0)zo0).j;
            if (bl2) {
                object2 = object2.i;
                bl2 = ((dp0)object2).j;
                if (bl2) {
                    n7 = ((dp0)zo0).g;
                    n10 = ((dp0)object2).g;
                }
            }
        }
        n3 = n8 - n4;
        int n14 = n10 - n7;
        bl2 = false;
        dp02 = null;
        if (n3 < 0 || n14 < 0 || n4 == (n3 = -1 << -1) || n4 == (n14 = -1 >>> 1) || n7 == n3 || n7 == n14 || n8 == n3 || n8 == n14 || n10 == n3 || n10 == n14) {
            n4 = 0;
            object = null;
            n7 = 0;
            object3 = null;
            n8 = 0;
            v50_02 = null;
            n10 = 0;
            v50_03 = null;
        }
        n8 -= n4;
        n10 -= n7;
        this.c0 = n4;
        this.d0 = n7;
        n4 = this.k0;
        n3 = 8;
        if (n4 == n3) {
            this.Y = 0;
            this.Z = 0;
        } else {
            object = this.W;
            object2 = object[0];
            object3 = Y50$b.FIXED;
            if (object2 == object3 && n8 < (n14 = this.Y)) {
                n8 = n14;
            }
            if ((object = object[n14 = 1]) == object3 && n10 < (n4 = this.Z)) {
                n10 = n4;
            }
            this.Y = n8;
            this.Z = n10;
            n4 = this.g0;
            if (n10 < n4) {
                this.Z = n4;
            }
            if (n8 < (n4 = this.f0)) {
                this.Y = n4;
            }
            if ((n4 = this.x) > 0 && object2 == (object3 = Y50$b.MATCH_CONSTRAINT)) {
                n3 = this.Y;
                this.Y = n4 = Math.min(n3, n4);
            }
            if ((n4 = this.A) > 0 && (object2 = this.W[n14]) == (object3 = Y50$b.MATCH_CONSTRAINT)) {
                n3 = this.Z;
                this.Z = n4 = Math.min(n3, n4);
            }
            if (n8 != (n4 = this.Y)) {
                this.i = n4;
            }
            if (n10 != (n4 = this.Z)) {
                this.j = n4;
            }
        }
    }

    public final void d() {
        v50_0 v50_02 = this.L;
        ArrayList arrayList = this.U;
        arrayList.add(v50_02);
        v50_02 = this.M;
        arrayList.add(v50_02);
        v50_02 = this.N;
        arrayList.add(v50_02);
        v50_02 = this.O;
        arrayList.add(v50_02);
        v50_02 = this.Q;
        arrayList.add(v50_02);
        v50_02 = this.R;
        arrayList.add(v50_02);
        v50_02 = this.S;
        arrayList.add(v50_02);
        v50_02 = this.P;
        arrayList.add(v50_02);
    }

    public final void e(Z50 z50, Eu1 eu1, HashSet hashSet, int n3, boolean bl2) {
        block14: {
            boolean bl3;
            Y50 y50;
            v50_0 v50_02;
            boolean bl4;
            block13: {
                boolean bl5;
                Y50 y502;
                v50_0 v50_03;
                boolean bl6;
                if (bl2) {
                    bl2 = hashSet.contains(this);
                    if (!bl2) {
                        return;
                    }
                    T92.a(z50, eu1, this);
                    hashSet.remove(this);
                    bl2 = z50.f0(64);
                    this.f(eu1, bl2);
                }
                if (n3 != 0) break block13;
                Object object = this.L.a;
                if (object != null) {
                    object = ((HashSet)object).iterator();
                    while (bl6 = object.hasNext()) {
                        v50_03 = (v50_0)object.next();
                        y502 = v50_03.d;
                        bl5 = true;
                        y502.e(z50, eu1, hashSet, n3, bl5);
                    }
                }
                if ((object = this.N.a) == null) break block14;
                object = ((HashSet)object).iterator();
                while (bl6 = object.hasNext()) {
                    v50_03 = (v50_0)object.next();
                    y502 = v50_03.d;
                    bl5 = true;
                    y502.e(z50, eu1, hashSet, n3, bl5);
                }
                break block14;
            }
            Object object = this.M.a;
            if (object != null) {
                object = ((HashSet)object).iterator();
                while (bl4 = object.hasNext()) {
                    v50_02 = (v50_0)object.next();
                    y50 = v50_02.d;
                    bl3 = true;
                    y50.e(z50, eu1, hashSet, n3, bl3);
                }
            }
            if ((object = this.O.a) != null) {
                object = ((HashSet)object).iterator();
                while (bl4 = object.hasNext()) {
                    v50_02 = (v50_0)object.next();
                    y50 = v50_02.d;
                    bl3 = true;
                    y50.e(z50, eu1, hashSet, n3, bl3);
                }
            }
            if ((object = this.P.a) != null) {
                object = ((HashSet)object).iterator();
                while (bl4 = object.hasNext()) {
                    v50_02 = (v50_0)object.next();
                    y50 = v50_02.d;
                    bl3 = true;
                    y50.e(z50, eu1, hashSet, n3, bl3);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void f(Eu1 var1_1, boolean var2_2) {
        block122: {
            block121: {
                block119: {
                    block120: {
                        block117: {
                            block118: {
                                block116: {
                                    block115: {
                                        block114: {
                                            block113: {
                                                block96: {
                                                    block109: {
                                                        block95: {
                                                            block112: {
                                                                block110: {
                                                                    block111: {
                                                                        block108: {
                                                                            block107: {
                                                                                block105: {
                                                                                    block106: {
                                                                                        block98: {
                                                                                            block104: {
                                                                                                block99: {
                                                                                                    block100: {
                                                                                                        block102: {
                                                                                                            block103: {
                                                                                                                block101: {
                                                                                                                    block97: {
                                                                                                                        block94: {
                                                                                                                            block93: {
                                                                                                                                var3_3 = this;
                                                                                                                                var4_4 = var1_1;
                                                                                                                                var5_5 = this.L;
                                                                                                                                var6_6 = var1_1.k(var5_5);
                                                                                                                                var7_7 = this.N;
                                                                                                                                var8_8 = var1_1.k(var7_7);
                                                                                                                                var9_9 = this.M;
                                                                                                                                var10_10 /* !! */  = var1_1.k(var9_9);
                                                                                                                                var11_11 /* !! */  = this.O;
                                                                                                                                var12_12 /* !! */  = var1_1.k(var11_11 /* !! */ );
                                                                                                                                var13_13 = this.P;
                                                                                                                                var14_14 = var1_1.k(var13_13);
                                                                                                                                var15_15 = this.X;
                                                                                                                                var16_16 = 1;
                                                                                                                                var17_17 = 1.4E-45f;
                                                                                                                                var18_18 /* !! */  = 0;
                                                                                                                                var19_19 /* !! */  = null;
                                                                                                                                if (var15_15 == null) ** GOTO lbl-1000
                                                                                                                                var15_15 = var15_15.W;
                                                                                                                                var20_20 /* !! */  = var15_15[0];
                                                                                                                                var19_19 /* !! */  = Y50$b.WRAP_CONTENT;
                                                                                                                                if (var20_20 /* !! */  == var19_19 /* !! */ ) {
                                                                                                                                    var21_21 = 1;
                                                                                                                                    var22_22 = 1.4E-45f;
                                                                                                                                } else {
                                                                                                                                    var21_21 = 0;
                                                                                                                                    var22_22 = 0.0f;
                                                                                                                                    var20_20 /* !! */  = null;
                                                                                                                                }
                                                                                                                                var15_15 = var15_15[var16_16];
                                                                                                                                if (var15_15 == var19_19 /* !! */ ) {
                                                                                                                                    var23_23 = 1;
                                                                                                                                    var24_24 = 1.4E-45f;
                                                                                                                                } else {
                                                                                                                                    var23_23 = 0;
                                                                                                                                    var24_24 = 0.0f;
                                                                                                                                    var15_15 = null;
                                                                                                                                }
                                                                                                                                var18_18 /* !! */  = var3_3.s;
                                                                                                                                if (var18_18 /* !! */  == var16_16) ** GOTO lbl60
                                                                                                                                var16_16 = 2;
                                                                                                                                var17_17 = 2.8E-45f;
                                                                                                                                if (var18_18 /* !! */  != var16_16) {
                                                                                                                                    var16_16 = 3;
                                                                                                                                    var17_17 = 4.2E-45f;
                                                                                                                                    ** if (var18_18 /* !! */  == var16_16) goto lbl-1000
lbl-1000:
                                                                                                                                    // 1 sources

                                                                                                                                    {
                                                                                                                                        var25_25 = var23_23;
                                                                                                                                        var26_26 = var24_24;
                                                                                                                                        var27_27 = var21_21;
                                                                                                                                        var28_28 = var22_22;
                                                                                                                                        ** GOTO lbl64
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                ** GOTO lbl57
lbl-1000:
                                                                                                                                // 2 sources

                                                                                                                                {
                                                                                                                                    var25_25 = 0;
                                                                                                                                    var26_26 = 0.0f;
lbl53:
                                                                                                                                    // 2 sources

                                                                                                                                    while (true) {
                                                                                                                                        var27_27 = 0;
                                                                                                                                        var28_28 = 0.0f;
                                                                                                                                        break block93;
                                                                                                                                        break;
                                                                                                                                    }
lbl57:
                                                                                                                                    // 1 sources

                                                                                                                                    var25_25 = var23_23;
                                                                                                                                    var26_26 = var24_24;
                                                                                                                                    ** continue;
lbl60:
                                                                                                                                    // 1 sources

                                                                                                                                    var27_27 = var21_21;
                                                                                                                                    var28_28 = var22_22;
                                                                                                                                    var25_25 = 0;
                                                                                                                                    var26_26 = 0.0f;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var23_23 = var3_3.k0;
                                                                                                                            var20_20 /* !! */  = (Y50$b)var3_3.V;
                                                                                                                            var16_16 = 8;
                                                                                                                            var17_17 = 1.1E-44f;
                                                                                                                            if (var23_23 == var16_16 && (var23_23 = (int)var3_3.l0) == 0) {
                                                                                                                                var15_15 = var3_3.U;
                                                                                                                                var18_18 /* !! */  = var15_15.size();
                                                                                                                                var17_17 = 0.0f;
                                                                                                                                var29_29 /* !! */  = null;
                                                                                                                                for (var16_16 = 0; var16_16 < var18_18 /* !! */ ; ++var16_16) {
                                                                                                                                    var30_30 = var15_15.get(var16_16);
                                                                                                                                    var31_31 /* !! */  = var15_15;
                                                                                                                                    var15_15 = var30_30;
                                                                                                                                    var15_15 = ((v50_0)var30_30).a;
                                                                                                                                    if (var15_15 == null || (var23_23 = var15_15.size()) <= 0) {
                                                                                                                                        var15_15 = var31_31 /* !! */ ;
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    break block94;
                                                                                                                                }
                                                                                                                                var23_23 = 0;
                                                                                                                                var24_24 = 0.0f;
                                                                                                                                var15_15 = null;
                                                                                                                                var18_18 /* !! */  = (int)var20_20 /* !! */ [0];
                                                                                                                                if (var18_18 /* !! */  == 0) {
                                                                                                                                    var23_23 = 1;
                                                                                                                                    var24_24 = 1.4E-45f;
                                                                                                                                    var18_18 /* !! */  = (int)var20_20 /* !! */ [var23_23];
                                                                                                                                    if (var18_18 /* !! */  == 0) {
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if ((var23_23 = (int)var3_3.m) != 0 || (var18_18 /* !! */  = var3_3.n) != 0) break block97;
                                                                                                                        var31_31 /* !! */  = var20_20 /* !! */ ;
                                                                                                                        var16_16 = 5;
                                                                                                                        var17_17 = 7.0E-45f;
                                                                                                                        break block98;
                                                                                                                    }
                                                                                                                    var18_18 /* !! */  = var3_3.h;
                                                                                                                    if (var23_23 == 0) break block99;
                                                                                                                    var23_23 = var3_3.c0;
                                                                                                                    var4_4.d(var6_6, var23_23);
                                                                                                                    var23_23 = var3_3.c0;
                                                                                                                    var16_16 = var3_3.Y;
                                                                                                                    var4_4.d((k93_0)var8_8, var23_23 += var16_16);
                                                                                                                    if (var27_27 == 0 || (var15_15 = var3_3.X) == null) break block99;
                                                                                                                    if (var18_18 /* !! */  == 0) break block100;
                                                                                                                    var15_15 = (Z50)var15_15;
                                                                                                                    var29_29 /* !! */  = var15_15.O0;
                                                                                                                    if (var29_29 /* !! */  == null || (var29_29 /* !! */  = var29_29 /* !! */ .get()) == null) break block101;
                                                                                                                    var16_16 = var5_5.d();
                                                                                                                    var31_31 /* !! */  = var20_20 /* !! */ ;
                                                                                                                    var20_20 /* !! */  = (v50_0)var15_15.O0.get();
                                                                                                                    var21_21 = var20_20 /* !! */ .d();
                                                                                                                    if (var16_16 <= var21_21) break block102;
                                                                                                                    break block103;
                                                                                                                }
                                                                                                                var31_31 /* !! */  = var20_20 /* !! */ ;
                                                                                                            }
                                                                                                            var20_20 /* !! */  = new WeakReference(var5_5);
                                                                                                            var15_15.O0 = var20_20 /* !! */ ;
                                                                                                        }
                                                                                                        if ((var20_20 /* !! */  = var15_15.Q0) == null || (var20_20 /* !! */  = var20_20 /* !! */ .get()) == null || (var21_21 = var7_7.d()) > (var16_16 = (var29_29 /* !! */  = (v50_0)var15_15.Q0.get()).d())) {
                                                                                                            var20_20 /* !! */  = new WeakReference(var7_7);
                                                                                                            var15_15.Q0 = var20_20 /* !! */ ;
                                                                                                        }
                                                                                                        break block104;
                                                                                                    }
                                                                                                    var31_31 /* !! */  = var20_20 /* !! */ ;
                                                                                                    var15_15 = var15_15.N;
                                                                                                    var15_15 = var4_4.k(var15_15);
                                                                                                    var21_21 = 0;
                                                                                                    var22_22 = 0.0f;
                                                                                                    var20_20 /* !! */  = null;
                                                                                                    var16_16 = 5;
                                                                                                    var17_17 = 7.0E-45f;
                                                                                                    var4_4.f((k93_0)var15_15, (k93_0)var8_8, 0, var16_16);
                                                                                                    break block104;
                                                                                                }
                                                                                                var31_31 /* !! */  = var20_20 /* !! */ ;
                                                                                            }
                                                                                            if ((var23_23 = (int)var3_3.n) == 0) ** GOTO lbl163
                                                                                            var23_23 = var3_3.d0;
                                                                                            var4_4.d(var10_10 /* !! */ , var23_23);
                                                                                            var23_23 = var3_3.d0;
                                                                                            var21_21 = var3_3.Z;
                                                                                            var4_4.d((k93_0)var12_12 /* !! */ , var23_23 += var21_21);
                                                                                            var15_15 = var13_13.a;
                                                                                            if (var15_15 != null && (var23_23 = var15_15.size()) > 0) {
                                                                                                var23_23 = var3_3.d0;
                                                                                                var21_21 = var3_3.e0;
                                                                                                var4_4.d((k93_0)var14_14, var23_23 += var21_21);
                                                                                            }
                                                                                            if (var25_25 == 0 || (var15_15 = var3_3.X) == null) ** GOTO lbl163
                                                                                            if (var18_18 /* !! */  != 0) {
                                                                                                var15_15 = (Z50)var15_15;
                                                                                                var20_20 /* !! */  = var15_15.N0;
                                                                                                if (var20_20 /* !! */  == null || (var20_20 /* !! */  = var20_20 /* !! */ .get()) == null || (var21_21 = var9_9.d()) > (var18_18 /* !! */  = (var19_19 /* !! */  = (v50_0)var15_15.N0.get()).d())) {
                                                                                                    var20_20 /* !! */  = new WeakReference(var9_9);
                                                                                                    var15_15.N0 = var20_20 /* !! */ ;
                                                                                                }
                                                                                                if ((var20_20 /* !! */  = var15_15.P0) == null || (var20_20 /* !! */  = var20_20 /* !! */ .get()) == null || (var21_21 = var11_11 /* !! */ .d()) > (var18_18 /* !! */  = (var19_19 /* !! */  = (v50_0)var15_15.P0.get()).d())) {
                                                                                                    var20_20 /* !! */  = new WeakReference(var11_11 /* !! */ );
                                                                                                    var15_15.P0 = var20_20 /* !! */ ;
                                                                                                }
lbl163:
                                                                                                // 5 sources

                                                                                                var21_21 = 0;
                                                                                                var22_22 = 0.0f;
                                                                                                var20_20 /* !! */  = null;
                                                                                                var16_16 = 5;
                                                                                                var17_17 = 7.0E-45f;
                                                                                            } else {
                                                                                                var15_15 = var15_15.O;
                                                                                                var15_15 = var4_4.k(var15_15);
                                                                                                var21_21 = 0;
                                                                                                var22_22 = 0.0f;
                                                                                                var20_20 /* !! */  = null;
                                                                                                var16_16 = 5;
                                                                                                var17_17 = 7.0E-45f;
                                                                                                var4_4.f((k93_0)var15_15, (k93_0)var12_12 /* !! */ , 0, var16_16);
                                                                                            }
                                                                                            var23_23 = (int)var3_3.m;
                                                                                            if (var23_23 != 0 && (var23_23 = (int)var3_3.n) != 0) {
                                                                                                var3_3.m = false;
                                                                                                var3_3.n = false;
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        var20_20 /* !! */  = (Y50$b)var3_3.f;
                                                                                        if (!var2_2 || (var15_15 = var3_3.d) == null || (var19_19 /* !! */  = var3_3.e) == null) break block105;
                                                                                        var29_29 /* !! */  = var15_15.h;
                                                                                        var32_32 = var13_13;
                                                                                        var33_33 = var29_29 /* !! */ .j;
                                                                                        if (var33_33 == 0) break block106;
                                                                                        var15_15 = var15_15.i;
                                                                                        var23_23 = (int)var15_15.j;
                                                                                        if (var23_23 == 0) break block106;
                                                                                        var15_15 = var19_19 /* !! */ .h;
                                                                                        var23_23 = (int)var15_15.j;
                                                                                        if (var23_23 == 0) break block106;
                                                                                        var15_15 = var19_19 /* !! */ .i;
                                                                                        var23_23 = (int)var15_15.j;
                                                                                        if (var23_23 == 0) break block106;
                                                                                        var34_34 /* !! */  = var29_29 /* !! */ .g;
                                                                                        var4_4.d(var6_6, var34_34 /* !! */ );
                                                                                        var34_34 /* !! */  = var3_3.d.i.g;
                                                                                        var4_4.d((k93_0)var8_8, var34_34 /* !! */ );
                                                                                        var34_34 /* !! */  = var3_3.e.h.g;
                                                                                        var4_4.d(var10_10 /* !! */ , var34_34 /* !! */ );
                                                                                        var34_34 /* !! */  = var3_3.e.i.g;
                                                                                        var4_4.d((k93_0)var12_12 /* !! */ , var34_34 /* !! */ );
                                                                                        var34_34 /* !! */  = var3_3.e.k.g;
                                                                                        var4_4.d((k93_0)var14_14, var34_34 /* !! */ );
                                                                                        var5_5 = var3_3.X;
                                                                                        if (var5_5 == null) ** GOTO lbl-1000
                                                                                        if (var27_27 != 0) {
                                                                                            var34_34 /* !! */  = 0;
                                                                                            var35_36 = 0.0f;
                                                                                            var5_5 = null;
                                                                                            var36_38 /* !! */  = var20_20 /* !! */ [0];
                                                                                            if (var36_38 /* !! */  != false && (var36_38 /* !! */  = (Y50$b)this.C()) == false) {
                                                                                                var7_7 = var3_3.X.N;
                                                                                                var7_7 = var4_4.k(var7_7);
                                                                                                var37_40 = 8;
                                                                                                var38_42 = 1.1E-44f;
                                                                                                var4_4.f((k93_0)var7_7, (k93_0)var8_8, 0, var37_40);
                                                                                            }
                                                                                        }
                                                                                        if (var25_25 == 0) ** GOTO lbl-1000
                                                                                        var35_36 = 1.4E-45f;
                                                                                        var34_34 /* !! */  = (int)var20_20 /* !! */ [1];
                                                                                        if (var34_34 /* !! */  != 0 && (var34_34 /* !! */  = (int)this.D()) == 0) {
                                                                                            var5_5 = var3_3.X.O;
                                                                                            var5_5 = var4_4.k(var5_5);
                                                                                            var36_38 /* !! */  = (Y50$b)8;
                                                                                            var39_44 = 1.1E-44f;
                                                                                            var23_23 = 0;
                                                                                            var24_24 = 0.0f;
                                                                                            var15_15 = null;
                                                                                            var4_4.f((k93_0)var5_5, (k93_0)var12_12 /* !! */ , 0, (int)var36_38 /* !! */ );
                                                                                        } else lbl-1000:
                                                                                        // 3 sources

                                                                                        {
                                                                                            var23_23 = 0;
                                                                                            var24_24 = 0.0f;
                                                                                            var15_15 = null;
                                                                                        }
                                                                                        var3_3.m = false;
                                                                                        var3_3.n = false;
                                                                                        return;
                                                                                    }
lbl241:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var32_32 = var13_13;
                                                                                ** while (true)
                                                                                var23_23 = 0;
                                                                                var24_24 = 0.0f;
                                                                                var15_15 = null;
                                                                                var13_13 = var3_3.X;
                                                                                if (var13_13 == null) break block107;
                                                                                var33_33 = var3_3.B(0);
                                                                                if (var33_33 != 0) {
                                                                                    var13_13 = (Z50)var3_3.X;
                                                                                    var13_13.a0(var3_3, 0);
                                                                                    var23_23 = 1;
                                                                                    var24_24 = 1.4E-45f;
lbl257:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var23_23 = (int)this.C();
                                                                                ** while (true)
                                                                                var33_33 = 1;
                                                                                var40_46 = 1.4E-45f;
                                                                                var18_18 /* !! */  = (int)var3_3.B(var33_33);
                                                                                if (var18_18 /* !! */  != 0) {
                                                                                    var19_19 /* !! */  = (Z50)var3_3.X;
                                                                                    var19_19 /* !! */ .a0(var3_3, var33_33);
                                                                                    var33_33 = 1;
                                                                                    var40_46 = 1.4E-45f;
                                                                                } else {
                                                                                    var33_33 = (int)this.D();
                                                                                }
                                                                                if (var23_23 != 0 || var27_27 == 0) ** GOTO lbl-1000
                                                                                var18_18 /* !! */  = var3_3.k0;
                                                                                var16_16 = 8;
                                                                                var17_17 = 1.1E-44f;
                                                                                if (var18_18 /* !! */  != var16_16 && (var19_19 /* !! */  = var5_5.f) == null && (var19_19 /* !! */  = var7_7.f) == null) {
                                                                                    var19_19 /* !! */  = var3_3.X.N;
                                                                                    var19_19 /* !! */  = var4_4.k((Object)var19_19 /* !! */ );
                                                                                    var41_47 = var23_23;
                                                                                    var23_23 = 0;
                                                                                    var24_24 = 0.0f;
                                                                                    var15_15 = null;
                                                                                    var16_16 = 1;
                                                                                    var17_17 = 1.4E-45f;
                                                                                    var4_4.f((k93_0)var19_19 /* !! */ , (k93_0)var8_8, 0, var16_16);
                                                                                } else lbl-1000:
                                                                                // 2 sources

                                                                                {
                                                                                    var41_47 = var23_23;
                                                                                }
                                                                                if (var33_33 == 0 && var25_25 != 0 && (var23_23 = var3_3.k0) != (var18_18 /* !! */  = 8) && (var15_15 = var9_9.f) == null && (var15_15 = var11_11 /* !! */ .f) == null && var32_32 == null) {
                                                                                    var15_15 = var3_3.X.O;
                                                                                    var15_15 = var4_4.k(var15_15);
                                                                                    var18_18 /* !! */  = 1;
                                                                                    var16_16 = 0;
                                                                                    var17_17 = 0.0f;
                                                                                    var29_29 /* !! */  = null;
                                                                                    var4_4.f((k93_0)var15_15, (k93_0)var12_12 /* !! */ , 0, var18_18 /* !! */ );
                                                                                }
                                                                                var42_48 = var33_33;
                                                                                var43_49 = var41_47;
                                                                                break block108;
                                                                            }
                                                                            var42_48 = 0;
                                                                            var43_49 = 0;
                                                                        }
                                                                        var23_23 = var3_3.Y;
                                                                        var33_33 = var3_3.f0;
                                                                        if (var23_23 >= var33_33) {
                                                                            var33_33 = var23_23;
                                                                        }
                                                                        var18_18 /* !! */  = var3_3.Z;
                                                                        var16_16 = var3_3.g0;
                                                                        var44_50 = var14_14;
                                                                        if (var18_18 /* !! */  >= var16_16) {
                                                                            var16_16 = var18_18 /* !! */ ;
                                                                        }
                                                                        var14_14 = var3_3.W;
                                                                        var41_47 = var33_33;
                                                                        var45_51 = false;
                                                                        var46_52 = null;
                                                                        var13_13 = var14_14[0];
                                                                        var47_53 = var10_10 /* !! */ ;
                                                                        var10_10 /* !! */  = Y50$b.MATCH_CONSTRAINT;
                                                                        var48_54 = 1;
                                                                        var49_55 = var13_13 != var10_10 /* !! */  ? 1 : 0;
                                                                        var14_14 = var14_14[var48_54];
                                                                        var50_56 /* !! */  = var12_12 /* !! */ ;
                                                                        if (var14_14 != var10_10 /* !! */ ) {
                                                                            var51_57 = true;
                                                                            var52_58 = 1.4E-45f;
                                                                        } else {
                                                                            var51_57 = false;
                                                                            var52_58 = 0.0f;
                                                                        }
                                                                        var3_3.C = var53_59 = var3_3.b0;
                                                                        var54_60 = var16_16;
                                                                        var3_3.D = var17_17 = var3_3.a0;
                                                                        var55_61 /* !! */  = var20_20 /* !! */ ;
                                                                        var21_21 = var3_3.t;
                                                                        var56_62 = var8_8;
                                                                        var57_63 = var3_3.u;
                                                                        var58_64 = var6_6;
                                                                        cfr_temp_0 = var17_17 - 0.0f;
                                                                        var59_65 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                        if (var59_65 <= 0 || (var60_66 = var3_3.k0) == (var61_67 /* !! */  = 8)) break block109;
                                                                        if (var13_13 == var10_10 /* !! */  && var21_21 == 0) {
                                                                            var21_21 = 3;
                                                                            var22_22 = 4.2E-45f;
                                                                        }
                                                                        if (var14_14 == var10_10 /* !! */  && var57_63 == 0) {
                                                                            var57_63 = 3;
                                                                        }
                                                                        if (var13_13 == var10_10 /* !! */  && var14_14 == var10_10 /* !! */ ) {
                                                                            var60_66 = 3;
                                                                            var62_68 = 4.2E-45f;
                                                                            if (var21_21 == var60_66 && var57_63 == var60_66) {
                                                                                var60_66 = -1;
                                                                                var62_68 = 0.0f / 0.0f;
                                                                                if (var53_59 == var60_66) {
                                                                                    if (var49_55 != 0 && !var51_57) {
                                                                                        var23_23 = 0;
                                                                                        var24_24 = 0.0f;
                                                                                        var15_15 = null;
                                                                                        var3_3.C = 0;
                                                                                    } else if (var49_55 == 0 && var51_57) {
                                                                                        var23_23 = 1;
                                                                                        var24_24 = 1.4E-45f;
                                                                                        var3_3.C = var23_23;
                                                                                        if (var53_59 == var60_66) {
                                                                                            var23_23 = 1065353216;
                                                                                            var24_24 = 1.0f;
                                                                                            var3_3.D = var62_68 = var24_24 / var17_17;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if ((var23_23 = var3_3.C) == 0 && ((var23_23 = (int)var9_9.h()) == 0 || (var23_23 = (int)var11_11 /* !! */ .h()) == 0)) {
                                                                                    var23_23 = 1;
                                                                                    var24_24 = 1.4E-45f;
                                                                                    var3_3.C = var23_23;
                                                                                } else {
                                                                                    var23_23 = 1;
                                                                                    var24_24 = 1.4E-45f;
                                                                                    var63_70 = var3_3.C;
                                                                                    if (var63_70 == var23_23 && ((var23_23 = (int)var5_5.h()) == 0 || (var23_23 = (int)var7_7.h()) == 0)) {
                                                                                        var23_23 = 0;
                                                                                        var24_24 = 0.0f;
                                                                                        var15_15 = null;
                                                                                        var3_3.C = 0;
                                                                                    }
                                                                                }
                                                                                var23_23 = var3_3.C;
                                                                                var63_70 = -1;
                                                                                var64_71 = 0.0f / 0.0f;
                                                                                if (var23_23 == var63_70 && ((var23_23 = (int)var9_9.h()) == 0 || (var23_23 = (int)var11_11 /* !! */ .h()) == 0 || (var23_23 = (int)var5_5.h()) == 0 || (var23_23 = (int)var7_7.h()) == 0)) {
                                                                                    var37_41 = (int)var9_9.h();
                                                                                    if (var37_41 != 0 && (var37_41 = (int)var11_11 /* !! */ .h()) != 0) {
                                                                                        var37_41 = 0;
                                                                                        var38_43 = 0.0f;
                                                                                        var9_9 = null;
                                                                                        var3_3.C = 0;
                                                                                    } else {
                                                                                        var34_35 = (int)var5_5.h();
                                                                                        if (var34_35 != 0 && (var34_35 = (int)var7_7.h()) != 0) {
                                                                                            var35_37 = var3_3.D;
                                                                                            var36_39 /* !! */  = 1065353216;
                                                                                            var39_45 = 1.0f;
                                                                                            var3_3.D = var62_68 = var39_45 / var35_37;
                                                                                            var34_35 = 1;
                                                                                            var35_37 = 1.4E-45f;
                                                                                            var3_3.C = var34_35;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                var34_35 = var3_3.C;
                                                                                var36_39 /* !! */  = -1;
                                                                                var39_45 = 0.0f / 0.0f;
                                                                                if (var34_35 == var36_39 /* !! */ ) {
                                                                                    var34_35 = var3_3.w;
                                                                                    if (var34_35 > 0 && (var36_39 /* !! */  = var3_3.z) == 0) {
                                                                                        var36_39 /* !! */  = 0;
                                                                                        var39_45 = 0.0f;
                                                                                        var7_7 = null;
                                                                                        var3_3.C = 0;
                                                                                    } else if (var34_35 == 0 && (var34_35 = var3_3.z) > 0) {
                                                                                        var35_37 = var3_3.D;
                                                                                        var36_39 /* !! */  = 1065353216;
                                                                                        var39_45 = 1.0f;
                                                                                        var3_3.D = var62_68 = var39_45 / var35_37;
                                                                                        var34_35 = 1;
                                                                                        var35_37 = 1.4E-45f;
                                                                                        var3_3.C = var34_35;
                                                                                    }
                                                                                }
lbl417:
                                                                                // 7 sources

                                                                                while (true) {
                                                                                    break block95;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        var34_35 = 4;
                                                                        var35_37 = 5.6E-45f;
                                                                        var36_39 /* !! */  = 3;
                                                                        var39_45 = 4.2E-45f;
                                                                        if (var13_13 != var10_10 /* !! */  || var21_21 != var36_39 /* !! */ ) break block110;
                                                                        var37_41 = 0;
                                                                        var38_43 = 0.0f;
                                                                        var9_9 = null;
                                                                        var3_3.C = 0;
                                                                        var39_45 = var18_18 /* !! */ ;
                                                                        var33_33 = (int)(var17_17 *= var39_45);
                                                                        if (var14_14 == var10_10 /* !! */ ) break block111;
                                                                        var65_72 = var57_63;
                                                                        var66_73 = var54_60;
                                                                        var60_66 = 1065353216;
                                                                        var62_68 = 1.0f;
                                                                        var54_60 = 0;
                                                                        var67_74 = 4;
                                                                        break block96;
                                                                    }
                                                                    var67_74 = var21_21;
                                                                    var65_72 = var57_63;
                                                                    var66_73 = var54_60;
                                                                    var60_66 = 1065353216;
                                                                    var62_68 = 1.0f;
lbl444:
                                                                    // 3 sources

                                                                    while (true) {
                                                                        var54_60 = 1;
                                                                        break block96;
                                                                        break;
                                                                    }
                                                                }
                                                                ** while (var14_14 != var10_10 /* !! */  || var57_63 != var36_39 /* !! */ )
lbl449:
                                                                // 1 sources

                                                                var3_3.C = 1;
                                                                var36_39 /* !! */  = -1;
                                                                var39_45 = 0.0f / 0.0f;
                                                                var60_66 = 1065353216;
                                                                var62_68 = 1.0f;
                                                                if (var53_59 == var36_39 /* !! */ ) {
                                                                    var3_3.D = var39_45 = var62_68 / var17_17;
                                                                }
                                                                var39_45 = var3_3.D;
                                                                var38_43 = var23_23;
                                                                var16_16 = (int)(var39_45 *= var38_43);
                                                                var67_74 = var21_21;
                                                                var66_73 = var16_16;
                                                                if (var13_13 == var10_10 /* !! */ ) break block112;
                                                                var33_33 = var41_47;
                                                                var54_60 = 0;
                                                                var65_72 = 4;
                                                                break block96;
                                                            }
                                                            var65_72 = var57_63;
                                                            var33_33 = var41_47;
                                                            ** GOTO lbl444
                                                        }
                                                        var60_66 = 1065353216;
                                                        var62_68 = 1.0f;
                                                        var67_74 = var21_21;
                                                        var65_72 = var57_63;
                                                        var33_33 = var41_47;
                                                        var66_73 = var54_60;
                                                        ** while (true)
                                                    }
                                                    var60_66 = 1065353216;
                                                    var62_69 = 1.0f;
                                                    var67_74 = var21_21;
                                                    var65_72 = var57_63;
                                                    var33_33 = var41_47;
                                                    var66_73 = var54_60;
                                                    var54_60 = 0;
                                                }
                                                var5_5 = var3_3.v;
                                                var7_7 = null;
                                                var5_5[0] = var67_74;
                                                var36_39 /* !! */  = 1;
                                                var39_45 = 1.4E-45f;
                                                var5_5[var36_39 /* !! */ ] = var65_72;
                                                if (var54_60 == 0) break block113;
                                                var34_35 = var3_3.C;
                                                var36_39 /* !! */  = -1;
                                                var39_45 = 0.0f / 0.0f;
                                                if (var34_35 != 0 && var34_35 != var36_39 /* !! */ ) break block114;
                                                var59_65 = (float)true;
                                                break block115;
                                            }
                                            var36_39 /* !! */  = -1;
                                            var39_45 = 0.0f / 0.0f;
                                        }
                                        var59_65 = (float)false;
                                    }
                                    if (var54_60 == 0) ** GOTO lbl-1000
                                    var34_35 = var3_3.C;
                                    var37_41 = 1;
                                    var38_43 = 1.4E-45f;
                                    if (var34_35 == var37_41 || var34_35 == var36_39 /* !! */ ) {
                                        var68_75 = true;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var68_75 = false;
                                    }
                                    var5_5 = var3_3.W;
                                    var36_39 /* !! */  = 0;
                                    var39_45 = 0.0f;
                                    var7_7 = null;
                                    var5_5 = var5_5[0];
                                    var4_4 = Y50$b.WRAP_CONTENT;
                                    if (var5_5 == var4_4 && (var34_35 = var3_3 instanceof Z50) != 0) {
                                        var57_63 = 1;
                                    } else {
                                        var57_63 = 0;
                                        var8_8 = null;
                                    }
                                    var69_76 = var57_63 != 0 ? 0 : var33_33;
                                    var12_12 /* !! */  = var3_3.S;
                                    var34_35 = (int)var12_12 /* !! */ .h();
                                    var36_39 /* !! */  = 1;
                                    var39_45 = 1.4E-45f;
                                    var70_77 = var34_35 ^ 1;
                                    var35_37 = 0.0f;
                                    var5_5 = null;
                                    var71_78 = var31_31 /* !! */ [0];
                                    var72_79 = var31_31 /* !! */ [var36_39 /* !! */ ];
                                    var34_35 = var3_3.q;
                                    var21_21 = 2;
                                    var22_22 = 2.8E-45f;
                                    if (var34_35 == var21_21 || (var34_35 = (int)var3_3.m) != 0) ** GOTO lbl581
                                    if (!var2_2 || (var5_5 = var3_3.d) == null) ** GOTO lbl591
                                    var7_7 = var5_5.h;
                                    var37_41 = (int)var7_7.j;
                                    if (var37_41 == 0) ** GOTO lbl591
                                    var5_5 = var5_5.i;
                                    var34_35 = (int)var5_5.j;
                                    if (var34_35 != 0) break block116;
                                    ** GOTO lbl591
                                }
                                if (var2_2) {
                                    var34_35 = var7_7.g;
                                    var13_13 = var1_1;
                                    var14_14 = var58_64;
                                    var1_1.d(var58_64, var34_35);
                                    var34_35 = var3_3.d.i.g;
                                    var15_15 = var56_62;
                                    var1_1.d((k93_0)var56_62, var34_35);
                                    var5_5 = var3_3.X;
                                    if (var5_5 != null && var27_27 != 0) {
                                        var34_35 = 0;
                                        var35_37 = 0.0f;
                                        var5_5 = null;
                                        var36_39 /* !! */  = (int)var55_61 /* !! */ [0];
                                        if (var36_39 /* !! */  != 0 && (var36_39 /* !! */  = (int)this.C()) == 0) {
                                            var7_7 = var3_3.X.N;
                                            var7_7 = var1_1.k(var7_7);
                                            var37_41 = 8;
                                            var38_43 = 1.1E-44f;
                                            var1_1.f((k93_0)var7_7, (k93_0)var56_62, 0, var37_41);
                                        }
                                    }
                                    var73_80 /* !! */  = var15_15;
                                    var74_81 /* !! */  = var14_14;
                                    var75_82 = var11_11 /* !! */ ;
                                    var76_83 /* !! */  = var10_10 /* !! */ ;
                                    var77_84 = var4_4;
                                    var78_85 = var32_32;
                                    var79_86 = var44_50;
                                    var80_87 = var47_53;
                                    var81_88 = var50_56 /* !! */ ;
lbl577:
                                    // 2 sources

                                    while (true) {
                                        var50_56 /* !! */  = var12_12 /* !! */ ;
                                        break;
                                    }
                                } else {
                                    var13_13 = var1_1;
lbl581:
                                    // 2 sources

                                    var75_82 = var11_11 /* !! */ ;
                                    var76_83 /* !! */  = var10_10 /* !! */ ;
                                    var77_84 = var4_4;
                                    var78_85 = var32_32;
                                    var79_86 = var44_50;
                                    var80_87 = var47_53;
                                    var81_88 = var50_56 /* !! */ ;
                                    var73_80 /* !! */  = var56_62;
                                    var74_81 /* !! */  = var58_64;
                                    ** continue;
lbl591:
                                    // 3 sources

                                    var13_13 = var1_1;
                                    var15_15 = var56_62;
                                    var14_14 = var58_64;
                                    var37_41 = 8;
                                    var38_43 = 1.1E-44f;
                                    var5_5 = var3_3.X;
                                    if (var5_5 != null) {
                                        var5_5 = var5_5.N;
                                        var82_89 = var5_5 = var1_1.k(var5_5);
                                    } else {
                                        var82_89 = null;
                                    }
                                    var5_5 = var3_3.X;
                                    if (var5_5 != null) {
                                        var5_5 = var5_5.L;
                                        var46_52 = var5_5 = var13_13.k(var5_5);
lbl606:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var45_51 = false;
                                    var46_52 = null;
                                    ** continue;
                                    var34_35 = 0;
                                    var35_37 = 0.0f;
                                    var5_5 = null;
                                    var83_90 /* !! */  = var55_61 /* !! */ [0];
                                    var7_7 = var3_3.W;
                                    var31_31 /* !! */  = var7_7[0];
                                    var16_16 = var3_3.c0;
                                    var18_18 /* !! */  = var3_3.f0;
                                    var9_9 = var3_3.E;
                                    var84_91 = var9_9[0];
                                    var38_43 = var3_3.h0;
                                    var48_54 = 1;
                                    var7_7 = var7_7[var48_54];
                                    var85_92 = var7_7 == var10_10 /* !! */ ;
                                    var41_47 = var3_3.w;
                                    var49_55 = var3_3.x;
                                    var52_58 = var3_3.y;
                                    var19_19 /* !! */  = var3_3.L;
                                    var7_7 = var3_3.N;
                                    var48_54 = var16_16;
                                    var29_29 /* !! */  = var7_7;
                                    var86_93 = var38_43;
                                    var37_41 = true;
                                    var38_43 = 1.4E-45f;
                                    var36_39 /* !! */  = 0;
                                    var39_45 = 0.0f;
                                    var5_5 = this;
                                    var7_7 = var1_1;
                                    var56_62 = var15_15;
                                    var23_23 = var27_27;
                                    var24_24 = var28_28;
                                    var21_21 = var25_25;
                                    var22_22 = var26_26;
                                    var79_86 = var44_50;
                                    var44_50 = var14_14;
                                    var63_70 = (int)var83_90 /* !! */ ;
                                    var78_85 = var32_32;
                                    var13_13 = var46_52;
                                    var81_88 = var50_56 /* !! */ ;
                                    var50_56 /* !! */  = var12_12 /* !! */ ;
                                    var12_12 /* !! */  = var82_89;
                                    var75_82 = var11_11 /* !! */ ;
                                    var11_11 /* !! */  = var31_31 /* !! */ ;
                                    var76_83 /* !! */  = var10_10 /* !! */ ;
                                    var80_87 = var47_53;
                                    var87_94 = var57_63;
                                    var73_80 /* !! */  = var15_15;
                                    var57_63 = var16_16;
                                    var74_81 /* !! */  = var14_14;
                                    var60_66 = var69_76;
                                    var77_84 = var4_4;
                                    var61_67 /* !! */  = var18_18 /* !! */ ;
                                    var88_95 /* !! */  = var84_91;
                                    var45_51 = var85_92;
                                    var48_54 = var43_49;
                                    var83_90 /* !! */  = (Y50$b)var42_48;
                                    var89_96 /* !! */  = var71_78;
                                    var90_97 = var67_74;
                                    var91_98 = var70_77;
                                    this.h(var1_1, (boolean)var37_41, (boolean)var27_27, (boolean)var25_25, (boolean)var63_70, (k93_0)var46_52, (k93_0)var82_89, var31_31 /* !! */ , var87_94, (v50_0)var19_19 /* !! */ , (v50_0)var29_29 /* !! */ , var16_16, var69_76, var18_18 /* !! */ , (int)var84_91, var86_93, (boolean)var59_65, var85_92, (boolean)var43_49, (boolean)var42_48, (boolean)var71_78, var67_74, var65_72, var41_47, var49_55, var52_58, var70_77);
                                }
                                if (!var2_2) break block117;
                                var3_3 = this;
                                var5_5 = this.e;
                                if (var5_5 == null) break block118;
                                var7_7 = var5_5.h;
                                var37_41 = (int)var7_7.j;
                                if (var37_41 == 0) break block118;
                                var5_5 = var5_5.i;
                                var34_35 = (int)var5_5.j;
                                if (var34_35 == 0) break block118;
                                var34_35 = var7_7.g;
                                var4_4 = var1_1;
                                var6_6 = var80_87;
                                var1_1.d(var80_87, var34_35);
                                var34_35 = this.e.i.g;
                                var8_8 = var81_88;
                                var1_1.d((k93_0)var81_88, var34_35);
                                var34_35 = this.e.k.g;
                                var7_7 = var79_86;
                                var1_1.d((k93_0)var79_86, var34_35);
                                var5_5 = this.X;
                                if (var5_5 != null && var42_48 == 0 && var25_25 != 0) {
                                    var87_94 = true;
                                    var37_41 = (int)var55_61 /* !! */ [var87_94];
                                    if (var37_41 != 0) {
                                        var5_5 = var5_5.O;
                                        var5_5 = var1_1.k(var5_5);
                                        var37_41 = 8 != 0;
                                        var38_43 = 1.1E-44f;
                                        var11_11 /* !! */  = null;
                                        var1_1.f((k93_0)var5_5, (k93_0)var81_88, 0, var37_41);
                                    } else {
                                        var37_41 = 8 != 0;
                                        var38_43 = 1.1E-44f;
                                        var11_11 /* !! */  = null;
                                    }
                                } else {
                                    var37_41 = 8;
                                    var38_43 = 1.1E-44f;
                                    var11_11 /* !! */  = null;
                                    var87_94 = true;
                                }
                                var16_16 = 0;
                                var17_17 = 0.0f;
                                var29_29 /* !! */  = null;
                                break block119;
                            }
                            var4_4 = var1_1;
                            var7_7 = var79_86;
                            var8_8 = var81_88;
                            var6_6 = var80_87;
                            var37_41 = 8;
                            var38_43 = 1.1E-44f;
                            var11_11 /* !! */  = null;
                            var87_94 = true;
                            break block120;
                        }
                        var37_41 = 8;
                        var38_43 = 1.1E-44f;
                        var11_11 /* !! */  = null;
                        var87_94 = true;
                        var3_3 = this;
                        var4_4 = var1_1;
                        var7_7 = var79_86;
                        var8_8 = var81_88;
                        var6_6 = var80_87;
                    }
                    var16_16 = 1;
                    var17_17 = 1.4E-45f;
                }
                var34_35 = var3_3.r;
                var23_23 = 2;
                var24_24 = 2.8E-45f;
                if (var34_35 == var23_23) {
                    var18_18 /* !! */  = 0;
                    var19_19 /* !! */  = null;
                } else {
                    var18_18 /* !! */  = var16_16;
                }
                if (var18_18 /* !! */  == 0 || (var34_35 = (int)var3_3.n) != 0) break block121;
                var5_5 = var3_3.W[var87_94];
                var15_15 = var77_84;
                var69_76 = var5_5 == var77_84 && (var34_35 = var3_3 instanceof Z50) != 0 ? 1 : 0;
                if (var69_76 != 0) {
                    var66_73 = 0;
                }
                if ((var5_5 = var3_3.X) != null) {
                    var5_5 = var5_5.O;
                    var5_5 = var4_4.k(var5_5);
                    var12_12 /* !! */  = var5_5;
                } else {
                    var53_59 = 0;
                    var12_12 /* !! */  = null;
                }
                var5_5 = var3_3.X;
                if (var5_5 != null) {
                    var5_5 = var5_5.M;
                    var13_13 = var5_5 = var4_4.k(var5_5);
                } else {
                    var33_33 = 0;
                    var13_13 = null;
                    var40_46 = 0.0f;
                }
                var34_35 = var3_3.e0;
                if (var34_35 <= 0 && (var23_23 = var3_3.k0) != var37_41) ** GOTO lbl793
                var15_15 = var78_85;
                var20_20 /* !! */  = var78_85.f;
                if (var20_20 /* !! */  != null) {
                    var4_4.e((k93_0)var7_7, var6_6, var34_35, var37_41);
                    var5_5 = var78_85.f;
                    var5_5 = var4_4.k(var5_5);
                    var23_23 = var78_85.e();
                    var4_4.e((k93_0)var7_7, (k93_0)var5_5, var23_23, var37_41);
                    if (var25_25 != 0) {
                        var5_5 = var75_82;
                        var5_5 = var4_4.k(var75_82);
                        var36_39 /* !! */  = 5;
                        var39_45 = 7.0E-45f;
                        var4_4.f((k93_0)var12_12 /* !! */ , (k93_0)var5_5, 0, var36_39 /* !! */ );
                    }
                    var91_98 = false;
                    var44_50 = null;
                } else {
                    var21_21 = var3_3.k0;
                    if (var21_21 == var37_41) {
                        var34_35 = var78_85.e();
                        var4_4.e((k93_0)var7_7, var6_6, var34_35, var37_41);
                    } else {
                        var4_4.e((k93_0)var7_7, var6_6, var34_35, var37_41);
                    }
lbl793:
                    // 3 sources

                    var91_98 = var70_77;
                }
                var63_70 = (int)var55_61 /* !! */ [var87_94];
                var5_5 = var3_3.W;
                var82_89 = var5_5[var87_94];
                var21_21 = var3_3.d0;
                var23_23 = var3_3.g0;
                var7_7 = var3_3.E;
                var45_51 = var7_7[var87_94];
                var39_45 = var3_3.i0;
                var5_5 = var5_5[0];
                var9_9 = var76_83 /* !! */ ;
                var48_54 = var5_5 == var76_83 /* !! */  ? 1 : 0;
                var41_47 = var3_3.z;
                var49_55 = var34_35 = var3_3.A;
                var52_58 = var35_37 = var3_3.B;
                var19_19 /* !! */  = var3_3.M;
                var29_29 /* !! */  = var3_3.O;
                var37_41 = false;
                var38_43 = 0.0f;
                var9_9 = null;
                var5_5 = this;
                var7_7 = var1_1;
                var89_96 /* !! */  = (Y50$b)var23_23;
                var23_23 = var25_25;
                var24_24 = var26_26;
                var90_97 = var21_21;
                var21_21 = var27_27;
                var22_22 = var28_28;
                var11_11 /* !! */  = var82_89;
                var87_94 = var69_76;
                var92_99 = var8_8;
                var57_63 = var90_97;
                var93_100 = var6_6;
                var60_66 = var66_73;
                var61_67 /* !! */  = (int)var89_96 /* !! */ ;
                var88_95 /* !! */  = var45_51;
                var45_51 = var48_54;
                var48_54 = var42_48;
                var83_90 /* !! */  = (Y50$b)var43_49;
                var89_96 /* !! */  = var72_79;
                var90_97 = var65_72;
                this.h(var1_1, false, (boolean)var25_25, (boolean)var27_27, (boolean)var63_70, (k93_0)var13_13, (k93_0)var12_12 /* !! */ , (Y50$b)var82_89, (boolean)var69_76, (v50_0)var19_19 /* !! */ , (v50_0)var29_29 /* !! */ , var57_63, var66_73, var61_67 /* !! */ , (int)var88_95 /* !! */ , var39_45, var68_75, (boolean)var45_51, (boolean)var42_48, (boolean)var43_49, (boolean)var72_79, var65_72, var67_74, var41_47, var34_35, var35_37, var91_98);
                break block122;
            }
            var92_99 = var8_8;
            var93_100 = var6_6;
        }
        var5_5 = this;
        if (var54_60 != 0) {
            var36_39 /* !! */  = this.C;
            var37_41 = -1082130432;
            var38_43 = -1.0f;
            var23_23 = 1;
            var24_24 = 1.4E-45f;
            if (var36_39 /* !! */  == var23_23) {
                var39_45 = this.D;
                var15_15 = var1_1.l();
                var20_20 /* !! */  = var15_15.d;
                var14_14 = var92_99;
                var20_20 /* !! */ .k((k93_0)var92_99, var38_43);
                var9_9 = var15_15.d;
                var20_20 /* !! */  = var93_100;
                var33_33 = 1065353216;
                var40_46 = 1.0f;
                var9_9.k(var93_100, var40_46);
                var9_9 = var15_15.d;
                var12_12 /* !! */  = var73_80 /* !! */ ;
                var9_9.k((k93_0)var73_80 /* !! */ , var39_45);
                var9_9 = var15_15.d;
                var39_45 = -var39_45;
                var11_11 /* !! */  = var74_81 /* !! */ ;
                var9_9.k((k93_0)var74_81 /* !! */ , var39_45);
                var7_7 = var1_1;
                var1_1.c((mp_0)var15_15);
            } else {
                var7_7 = var1_1;
                var12_12 /* !! */  = var73_80 /* !! */ ;
                var11_11 /* !! */  = var74_81 /* !! */ ;
                var14_14 = var92_99;
                var20_20 /* !! */  = var93_100;
                var33_33 = 1065353216;
                var40_46 = 1.0f;
                var24_24 = this.D;
                var10_10 /* !! */  = var1_1.l();
                var19_19 /* !! */  = var10_10 /* !! */ .d;
                var19_19 /* !! */ .k((k93_0)var73_80 /* !! */ , var38_43);
                var10_10 /* !! */ .d.k((k93_0)var74_81 /* !! */ , var40_46);
                var10_10 /* !! */ .d.k((k93_0)var92_99, var24_24);
                var9_9 = var10_10 /* !! */ .d;
                var24_24 = -var24_24;
                var9_9.k(var93_100, var24_24);
                var1_1.c((mp_0)var10_10 /* !! */ );
            }
        } else {
            var7_7 = var1_1;
        }
        var37_41 = (int)var50_56 /* !! */ .h();
        if (var37_41 != 0) {
            var9_9 = var50_56 /* !! */ ;
            var15_15 = var50_56 /* !! */ .f.d;
            var22_22 = (float)Math.toRadians(var5_5.F + 90.0f);
            var37_41 = var50_56 /* !! */ .e();
            var14_14 = v50$a.LEFT;
            var13_13 = var5_5.n((v50$a)var14_14);
            var13_13 = var7_7.k(var13_13);
            var12_12 /* !! */  = v50$a.TOP;
            var11_11 /* !! */  = var5_5.n((v50$a)var12_12 /* !! */ );
            var11_11 /* !! */  = var7_7.k(var11_11 /* !! */ );
            var10_10 /* !! */  = v50$a.RIGHT;
            var19_19 /* !! */  = var5_5.n((v50$a)var10_10 /* !! */ );
            var19_19 /* !! */  = var7_7.k((Object)var19_19 /* !! */ );
            var29_29 /* !! */  = v50$a.BOTTOM;
            var8_8 = var5_5.n((v50$a)var29_29 /* !! */ );
            var8_8 = var7_7.k(var8_8);
            var14_14 = var15_15.n((v50$a)var14_14);
            var14_14 = var7_7.k(var14_14);
            var12_12 /* !! */  = var15_15.n((v50$a)var12_12 /* !! */ );
            var12_12 /* !! */  = var7_7.k(var12_12 /* !! */ );
            var10_10 /* !! */  = var15_15.n((v50$a)var10_10 /* !! */ );
            var10_10 /* !! */  = var7_7.k(var10_10 /* !! */ );
            var15_15 = var15_15.n((v50$a)var29_29 /* !! */ );
            var15_15 = var7_7.k(var15_15);
            var29_29 /* !! */  = var1_1.l();
            var94_101 = var22_22;
            var96_102 = Math.sin(var94_101);
            var20_20 /* !! */  = var10_10 /* !! */ ;
            var98_103 = var37_41;
            var82_89 = var10_10 /* !! */ ;
            var9_9 = var14_14;
            var100_104 = var96_102 * var98_103;
            var22_22 = (float)var100_104;
            var14_14 = var29_29 /* !! */ .d;
            var88_95 /* !! */  = 0x3F000000;
            var102_105 = 0.5f;
            var14_14.k((k93_0)var12_12 /* !! */ , var102_105);
            var14_14 = var29_29 /* !! */ .d;
            var14_14.k((k93_0)var15_15, var102_105);
            var15_15 = var29_29 /* !! */ .d;
            var63_70 = -1090519040 != 0;
            var64_71 = -0.5f;
            var15_15.k((k93_0)var11_11 /* !! */ , var64_71);
            var29_29 /* !! */ .d.k((k93_0)var8_8, var64_71);
            var29_29 /* !! */ .b = var24_24 = -var22_22;
            var7_7.c((mp_0)var29_29 /* !! */ );
            var15_15 = var1_1.l();
            var103_106 = Math.cos(var94_101) * var98_103;
            var22_22 = (float)var103_106;
            var15_15.d.k((k93_0)var9_9, var102_105);
            var9_9 = var15_15.d;
            var12_12 /* !! */  = var10_10 /* !! */ ;
            var9_9.k(var10_10 /* !! */ , var102_105);
            var15_15.d.k((k93_0)var13_13, var64_71);
            var9_9 = var15_15.d;
            var13_13 = var19_19 /* !! */ ;
            var9_9.k((k93_0)var19_19 /* !! */ , var64_71);
            var15_15.b = var38_43 = -var22_22;
            var7_7.c((mp_0)var15_15);
        }
        var5_5.m = false;
        var5_5.n = false;
    }

    public boolean g() {
        int n3 = this.k0;
        int n4 = 8;
        n3 = n3 != n4 ? 1 : 0;
        return n3 != 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void h(Eu1 var1_1, boolean var2_2, boolean var3_3, boolean var4_4, boolean var5_5, k93_0 var6_6, k93_0 var7_7, Y50$b var8_8, boolean var9_9, v50_0 var10_10, v50_0 var11_11, int var12_12, int var13_13, int var14_14, int var15_15, float var16_16, boolean var17_17, boolean var18_18, boolean var19_19, boolean var20_20, boolean var21_21, int var22_22, int var23_23, int var24_24, int var25_25, float var26_26, boolean var27_27) {
        block106: {
            block104: {
                block98: {
                    block99: {
                        block107: {
                            block112: {
                                block119: {
                                    block120: {
                                        block115: {
                                            block118: {
                                                block117: {
                                                    block116: {
                                                        block113: {
                                                            block114: {
                                                                block111: {
                                                                    block109: {
                                                                        block110: {
                                                                            block108: {
                                                                                block105: {
                                                                                    block97: {
                                                                                        block101: {
                                                                                            block103: {
                                                                                                block102: {
                                                                                                    block100: {
                                                                                                        var28_28 = this;
                                                                                                        var29_29 = var1_1;
                                                                                                        var30_30 /* !! */  = var6_6;
                                                                                                        var31_31 /* !! */  = var7_7;
                                                                                                        var32_32 = var10_10;
                                                                                                        var33_33 = var11_11;
                                                                                                        var34_34 = var14_14;
                                                                                                        var35_35 = var15_15;
                                                                                                        var36_36 = var23_23;
                                                                                                        var37_37 = var24_24;
                                                                                                        var38_38 = var25_25;
                                                                                                        var39_39 = var26_26;
                                                                                                        var40_40 = var1_1.k(var10_10);
                                                                                                        var41_41 = var1_1.k(var11_11);
                                                                                                        var42_42 /* !! */  = var10_10.f;
                                                                                                        var43_43 = var1_1.k(var42_42 /* !! */ );
                                                                                                        var42_42 /* !! */  = var11_11.f;
                                                                                                        var42_42 /* !! */  = var1_1.k(var42_42 /* !! */ );
                                                                                                        var44_44 = var10_10.h();
                                                                                                        var45_45 = var11_11.h();
                                                                                                        var31_31 /* !! */  = this.S;
                                                                                                        var46_46 = var31_31 /* !! */ .h();
                                                                                                        var47_47 = var45_45 != 0 ? var44_44 + 1 : var44_44;
                                                                                                        if (var46_46 != 0) {
                                                                                                            ++var47_47;
                                                                                                        }
                                                                                                        var36_36 = var47_47;
                                                                                                        if (var17_17) {
                                                                                                            var48_48 = 3;
                                                                                                            var49_49 = 4.2E-45f;
                                                                                                        } else {
                                                                                                            var48_48 = var22_22;
                                                                                                        }
                                                                                                        var50_50 = var8_8.ordinal();
                                                                                                        var51_51 = var42_42 /* !! */ ;
                                                                                                        if (var50_50 == 0 || var50_50 == (var52_52 = 1) || var50_50 != (var52_52 = 2)) {
                                                                                                            while (true) {
                                                                                                                var50_50 = 0;
                                                                                                                var30_30 /* !! */  = null;
                                                                                                                break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (var48_48 == (var52_52 = 4)) ** continue;
                                                                                                            var50_50 = 1;
                                                                                                        }
                                                                                                        var52_52 = var28_28.i;
                                                                                                        var53_53 = var50_50;
                                                                                                        var50_50 = -1;
                                                                                                        if (var52_52 != var50_50 && var2_2) {
                                                                                                            var28_28.i = var50_50;
                                                                                                            var13_13 = var52_52;
                                                                                                            var53_53 = 0;
                                                                                                        }
                                                                                                        if ((var52_52 = var28_28.j) != var50_50 && !var2_2) {
                                                                                                            var28_28.j = var50_50;
                                                                                                            var53_53 = 0;
                                                                                                        } else {
                                                                                                            var52_52 = var13_13;
                                                                                                        }
                                                                                                        var50_50 = var28_28.k0;
                                                                                                        var13_13 = var52_52;
                                                                                                        var52_52 = 8;
                                                                                                        if (var50_50 == var52_52) {
                                                                                                            var50_50 = 0;
                                                                                                            var30_30 /* !! */  = null;
                                                                                                            var53_53 = 0;
                                                                                                        } else {
                                                                                                            var50_50 = var13_13;
                                                                                                        }
                                                                                                        if (!var27_27) ** GOTO lbl66
                                                                                                        if (var44_44 == 0 && var45_45 == 0 && var46_46 == 0) {
                                                                                                            var52_52 = var12_12;
                                                                                                            var29_29.d(var40_40, var12_12);
lbl66:
                                                                                                            // 3 sources

                                                                                                            while (true) {
                                                                                                                var54_54 = var46_46;
                                                                                                                var46_46 = 8;
                                                                                                                break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (var44_44 == 0 || var45_45 != 0) ** continue;
                                                                                                            var52_52 = var10_10.e();
                                                                                                            var54_54 = var46_46;
                                                                                                            var46_46 = 8;
                                                                                                            var29_29.e(var40_40, var43_43, var52_52, var46_46);
                                                                                                        }
                                                                                                        if (var53_53 == 0) {
                                                                                                            if (var9_9) {
                                                                                                                var55_55 = 3;
                                                                                                                var39_39 = 4.2E-45f;
                                                                                                                var52_52 = 0;
                                                                                                                var42_42 /* !! */  = null;
                                                                                                                var29_29.e(var41_41, var40_40, 0, var55_55);
                                                                                                                if (var34_34 > 0) {
                                                                                                                    var29_29.f(var41_41, var40_40, var34_34, var46_46);
                                                                                                                }
                                                                                                                if (var35_35 < (var52_52 = -1 >>> 1)) {
                                                                                                                    var29_29.g(var41_41, var40_40, var35_35, var46_46);
                                                                                                                }
                                                                                                            } else {
                                                                                                                var55_55 = 3;
                                                                                                                var39_39 = 4.2E-45f;
                                                                                                                var29_29.e(var41_41, var40_40, var50_50, var46_46);
                                                                                                            }
lbl90:
                                                                                                            // 5 sources

                                                                                                            while (true) {
                                                                                                                var50_50 = (int)var5_5;
                                                                                                                var56_56 = var36_36;
lbl93:
                                                                                                                // 2 sources

                                                                                                                while (true) {
                                                                                                                    var46_46 = var37_37;
                                                                                                                    break block97;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        var35_35 = 3;
                                                                                                        var52_52 = 2;
                                                                                                        if (var36_36 == var52_52 || var17_17 || var48_48 != (var52_52 = 1) && var48_48 != 0) break block100;
                                                                                                        var55_55 = Math.max(var37_37, var50_50);
                                                                                                        if (var38_38 > 0) {
                                                                                                            var55_55 = Math.min(var38_38, var55_55);
                                                                                                        }
                                                                                                        var52_52 = 8;
                                                                                                        var29_29.e(var41_41, var40_40, var55_55, var52_52);
                                                                                                        var50_50 = (int)var5_5;
                                                                                                        var56_56 = var36_36;
                                                                                                        var46_46 = var37_37;
                                                                                                        var53_53 = 0;
                                                                                                        break block97;
                                                                                                    }
                                                                                                    var52_52 = -2;
                                                                                                    if (var37_37 == var52_52) {
                                                                                                        var37_37 = var50_50;
                                                                                                    }
                                                                                                    if (var38_38 == var52_52) {
                                                                                                        var38_38 = var50_50;
                                                                                                    }
                                                                                                    if (var50_50 > 0 && var48_48 != (var52_52 = 1)) {
                                                                                                        var50_50 = 0;
                                                                                                        var30_30 /* !! */  = null;
                                                                                                    }
                                                                                                    var52_52 = 8;
                                                                                                    if (var37_37 > 0) {
                                                                                                        var29_29.f(var41_41, var40_40, var37_37, var52_52);
                                                                                                        var50_50 = Math.max(var50_50, var37_37);
                                                                                                    }
                                                                                                    var46_46 = 1;
                                                                                                    if (var38_38 > 0) {
                                                                                                        if (!var3_3 || var48_48 != var46_46) {
                                                                                                            var29_29.g(var41_41, var40_40, var38_38, var52_52);
                                                                                                        }
                                                                                                        var50_50 = Math.min(var50_50, var38_38);
                                                                                                    }
                                                                                                    if (var48_48 != var46_46) break block101;
                                                                                                    if (!var3_3) break block102;
                                                                                                    var29_29.e(var41_41, var40_40, var50_50, var52_52);
                                                                                                    ** GOTO lbl90
                                                                                                }
                                                                                                if (!var19_19) break block103;
                                                                                                var55_55 = 5;
                                                                                                var39_39 = 7.0E-45f;
                                                                                                var29_29.e(var41_41, var40_40, var50_50, var55_55);
                                                                                                var29_29.g(var41_41, var40_40, var50_50, var52_52);
                                                                                                ** GOTO lbl90
                                                                                            }
                                                                                            var55_55 = 5;
                                                                                            var39_39 = 7.0E-45f;
                                                                                            var29_29.e(var41_41, var40_40, var50_50, var55_55);
                                                                                            var29_29.g(var41_41, var40_40, var50_50, var52_52);
                                                                                            ** while (true)
                                                                                        }
                                                                                        var52_52 = 2;
                                                                                        if (var48_48 == var52_52) {
                                                                                            var30_30 /* !! */  = var32_32.e;
                                                                                            var42_42 /* !! */  = v50$a.TOP;
                                                                                            if (var30_30 /* !! */  != var42_42 /* !! */  && var30_30 /* !! */  != (var31_31 /* !! */  = v50$a.BOTTOM)) {
                                                                                                var42_42 /* !! */  = var28_28.X;
                                                                                                var30_30 /* !! */  = v50$a.LEFT;
                                                                                                var42_42 /* !! */  = var42_42 /* !! */ .n((v50$a)var30_30 /* !! */ );
                                                                                                var42_42 /* !! */  = var29_29.k(var42_42 /* !! */ );
                                                                                                var30_30 /* !! */  = var28_28.X;
                                                                                                var31_31 /* !! */  = v50$a.RIGHT;
                                                                                                var30_30 /* !! */  = var30_30 /* !! */ .n((v50$a)var31_31 /* !! */ );
                                                                                                var30_30 /* !! */  = var29_29.k(var30_30 /* !! */ );
                                                                                            } else {
                                                                                                var42_42 /* !! */  = var28_28.X.n((v50$a)var42_42 /* !! */ );
                                                                                                var42_42 /* !! */  = var29_29.k(var42_42 /* !! */ );
                                                                                                var30_30 /* !! */  = var28_28.X;
                                                                                                var31_31 /* !! */  = v50$a.BOTTOM;
                                                                                                var30_30 /* !! */  = var30_30 /* !! */ .n((v50$a)var31_31 /* !! */ );
                                                                                                var30_30 /* !! */  = var29_29.k(var30_30 /* !! */ );
                                                                                            }
                                                                                            var31_31 /* !! */  = var1_1.l();
                                                                                            var57_57 = var31_31 /* !! */ .d;
                                                                                            var56_56 = var36_36;
                                                                                            var57_57.k(var41_41, -1.0f);
                                                                                            var57_57 = var31_31 /* !! */ .d;
                                                                                            var36_36 = 1065353216;
                                                                                            var57_57.k(var40_40, 1.0f);
                                                                                            var31_31 /* !! */ .d.k(var30_30 /* !! */ , var39_39);
                                                                                            var57_57 = var31_31 /* !! */ .d;
                                                                                            var58_58 = -var39_39;
                                                                                            var57_57.k((k93_0)var42_42 /* !! */ , var58_58);
                                                                                            var29_29.c((mp_0)var31_31 /* !! */ );
                                                                                            if (var3_3) {
                                                                                                var53_53 = 0;
                                                                                            }
                                                                                            var50_50 = (int)var5_5;
                                                                                            ** continue;
                                                                                        }
                                                                                        var56_56 = var36_36;
                                                                                        var46_46 = var37_37;
                                                                                        var50_50 = 1;
                                                                                    }
                                                                                    if (!var27_27) break block104;
                                                                                    if (!var19_19) break block105;
                                                                                    var59_59 /* !! */  = var6_6;
                                                                                    var43_43 = var41_41;
                                                                                    var60_61 = var40_40;
                                                                                    var5_5 = var50_50;
                                                                                    var35_35 = var56_56;
                                                                                    var36_36 = 2;
                                                                                    var58_58 = 2.8E-45f;
                                                                                    var38_38 = 8;
                                                                                    var61_64 = 1.1E-44f;
                                                                                    var52_52 = 0;
                                                                                    var42_42 /* !! */  = null;
                                                                                    var45_45 = 1;
                                                                                    var62_68 = 1.4E-45f;
                                                                                    var41_41 = var7_7;
                                                                                    break block106;
                                                                                }
                                                                                if (var44_44 == 0 && var45_45 == 0 && var54_54 == 0) {
                                                                                    var63_70 = var11_11;
                                                                                    var43_43 = var41_41;
                                                                                    var5_5 = var50_50;
                                                                                    var64_71 = var51_51;
lbl208:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var35_35 = 5;
lbl210:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            continue;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (var44_44 != 0 && var45_45 == 0) {
                                                                                    var57_57 = var32_32.f.d;
                                                                                    var52_52 = var3_3 != false && (var35_35 = var57_57 instanceof Lv) != 0 ? 8 : 5;
                                                                                    var54_54 = (int)var3_3;
                                                                                    var63_70 = var11_11;
                                                                                    var35_35 = var52_52;
                                                                                    var43_43 = var41_41;
                                                                                    var5_5 = var50_50;
                                                                                    var64_71 = var51_51;
lbl221:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var52_52 = 0;
                                                                                        var42_42 /* !! */  = null;
                                                                                        break block98;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (var44_44 == 0 && var45_45 != 0) {
                                                                                    var35_35 = -var11_11.e();
                                                                                    var42_42 /* !! */  = var51_51;
                                                                                    var36_36 = 8;
                                                                                    var58_58 = 1.1E-44f;
                                                                                    var29_29.e(var41_41, (k93_0)var51_51, var35_35, var36_36);
                                                                                    if (var3_3) {
                                                                                        var59_60 = var6_6;
                                                                                        var35_35 = 5;
                                                                                        var55_55 = 0;
                                                                                        var39_39 = 0.0f;
                                                                                        var60_62 = null;
                                                                                        var29_29.f(var40_40, var6_6, 0, var35_35);
                                                                                        var63_70 = var11_11;
                                                                                        var64_71 = var51_51;
                                                                                        var43_43 = var41_41;
                                                                                        var5_5 = var50_50;
                                                                                        ** continue;
                                                                                    }
lbl243:
                                                                                    // 3 sources

                                                                                    while (true) {
                                                                                        var63_70 = var11_11;
                                                                                        var64_71 = var42_42 /* !! */ ;
                                                                                        var43_43 = var41_41;
                                                                                        var5_5 = var50_50;
                                                                                        ** continue;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var59_60 = var6_6;
                                                                                var42_42 /* !! */  = var51_51;
                                                                                var55_55 = 0;
                                                                                var39_39 = 0.0f;
                                                                                var60_63 = null;
                                                                                ** while (var44_44 == 0 || var45_45 == 0)
lbl255:
                                                                                // 1 sources

                                                                                var64_71 = var32_32.f.d;
                                                                                var57_57 = var11_11;
                                                                                var60_63 = var11_11.f.d;
                                                                                var32_32 = var28_28.X;
                                                                                var44_44 = 6;
                                                                                if (var53_53 == 0) break block107;
                                                                                if (var48_48 != 0) break block108;
                                                                                if (var38_38 == 0 && var46_46 == 0) {
                                                                                    var38_38 = (int)var43_43.f;
                                                                                    if (var38_38 != 0 && (var38_38 = (int)var51_51.f) != 0) {
                                                                                        var36_36 = var10_10.e();
                                                                                        var38_38 = 8;
                                                                                        var29_29.e(var40_40, var43_43, var36_36, var38_38);
                                                                                        var35_35 = -var11_11.e();
                                                                                        var29_29.e(var41_41, (k93_0)var51_51, var35_35, var38_38);
                                                                                        return;
                                                                                    }
                                                                                    var38_38 = 8;
                                                                                    var61_65 = 1.1E-44f;
                                                                                    var45_45 = 0;
                                                                                    var62_69 = 0.0f;
                                                                                    var65_73 = 1;
                                                                                    var66_74 = 1.4E-45f;
                                                                                    var67_75 = false;
                                                                                    var54_54 = 8;
                                                                                    var68_76 = 1.1E-44f;
                                                                                    var56_56 = 8;
                                                                                    var69_77 = 1.1E-44f;
                                                                                } else {
                                                                                    var38_38 = 8;
                                                                                    var61_65 = 1.1E-44f;
                                                                                    var45_45 = 1;
                                                                                    var62_69 = 1.4E-45f;
                                                                                    var65_73 = 0;
                                                                                    var66_74 = 0.0f;
                                                                                    var51_51 = null;
                                                                                    var67_75 = true;
                                                                                    var54_54 = 5;
                                                                                    var68_76 = 7.0E-45f;
                                                                                    var56_56 = 5;
                                                                                    var69_77 = 7.0E-45f;
                                                                                }
                                                                                var38_38 = var64_71 instanceof Lv;
                                                                                if (var38_38 == 0 && (var38_38 = var60_63 instanceof Lv) == 0) {
                                                                                    var70_89 = var54_54;
                                                                                    var71_90 = var68_76;
                                                                                    var72_91 = var56_56;
                                                                                    var73_92 = var69_77;
                                                                                    var38_38 = 5;
                                                                                    var61_65 = 7.0E-45f;
                                                                                    var34_34 = 1;
                                                                                    var74_93 = 6;
                                                                                    var54_54 = var45_45;
                                                                                    var68_76 = var62_69;
                                                                                    var56_56 = var65_73;
                                                                                    var69_77 = var66_74;
                                                                                    var45_45 = 8;
                                                                                    var62_69 = 1.1E-44f;
                                                                                    var65_73 = var48_48;
lbl312:
                                                                                    // 5 sources

                                                                                    while (true) {
                                                                                        var33_33 = var7_7;
                                                                                        break block99;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var56_56 = var65_73;
                                                                                var69_77 = var66_74;
                                                                                var70_89 = var54_54;
                                                                                var71_90 = var68_76;
                                                                                var38_38 = 5;
                                                                                var61_65 = 7.0E-45f;
                                                                                var34_34 = 1;
                                                                                var74_93 = 6;
                                                                                var72_91 = 4;
                                                                                var73_92 = 5.6E-45f;
                                                                                var65_73 = var48_48;
                                                                                var54_54 = var45_45;
                                                                                var68_76 = var62_69;
                                                                                var45_45 = 8;
                                                                                var62_69 = 1.1E-44f;
                                                                                ** GOTO lbl312
                                                                            }
                                                                            var34_34 = 2;
                                                                            var45_45 = 8;
                                                                            var62_69 = 1.1E-44f;
                                                                            if (var48_48 != var34_34) break block109;
                                                                            var38_38 = var64_71 instanceof Lv;
                                                                            if (var38_38 != 0 || (var38_38 = var60_63 instanceof Lv) != 0) break block110;
                                                                            var65_73 = var48_48;
                                                                            var38_38 = 5;
                                                                            var61_65 = 7.0E-45f;
                                                                            var34_34 = 1;
                                                                            var67_75 = true;
                                                                            var54_54 = 1;
                                                                            var68_76 = 1.4E-45f;
                                                                            var56_56 = 0;
                                                                            var69_78 = 0.0f;
                                                                            var74_93 = 6;
                                                                            var72_91 = 5;
                                                                            var73_92 = 7.0E-45f;
lbl350:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var70_89 = 5;
                                                                                var71_90 = 7.0E-45f;
                                                                                ** GOTO lbl312
                                                                                break;
                                                                            }
                                                                        }
                                                                        var65_73 = var48_48;
                                                                        var38_38 = 5;
                                                                        var61_65 = 7.0E-45f;
                                                                        var34_34 = 1;
                                                                        var67_75 = true;
                                                                        var54_54 = 1;
                                                                        var68_76 = 1.4E-45f;
                                                                        var56_56 = 0;
                                                                        var69_79 = 0.0f;
                                                                        var74_93 = 6;
                                                                        var72_91 = 4;
                                                                        var73_92 = 5.6E-45f;
                                                                        ** while (true)
                                                                    }
                                                                    var34_34 = 1;
                                                                    if (var48_48 != var34_34) break block111;
                                                                    var65_73 = var48_48;
                                                                    var38_38 = 5;
                                                                    var61_65 = 7.0E-45f;
                                                                    var34_34 = 1;
                                                                    var67_75 = true;
                                                                    var54_54 = 1;
                                                                    var68_76 = 1.4E-45f;
                                                                    var56_56 = 0;
                                                                    var69_80 = 0.0f;
                                                                    var74_93 = 6;
                                                                    var72_91 = 4;
                                                                    var73_92 = 5.6E-45f;
                                                                    var70_89 = 8;
                                                                    var71_90 = 1.1E-44f;
                                                                    ** GOTO lbl312
                                                                }
                                                                var34_34 = 3;
                                                                if (var48_48 != var34_34) break block112;
                                                                var34_34 = var28_28.C;
                                                                var65_73 = var48_48;
                                                                var48_48 = -1;
                                                                var49_49 = 0.0f / 0.0f;
                                                                if (var34_34 != var48_48) break block113;
                                                                if (!var20_20) break block114;
                                                                var33_33 = var7_7;
                                                                var38_38 = 5;
                                                                var61_65 = 7.0E-45f;
                                                                var34_34 = 1;
                                                                var67_75 = true;
                                                                var54_54 = 1;
                                                                var68_76 = 1.4E-45f;
                                                                var56_56 = 1;
                                                                var69_81 = 1.4E-45f;
                                                                if (var3_3) {
                                                                    var74_93 = 5;
lbl406:
                                                                    // 3 sources

                                                                    while (true) {
                                                                        var72_91 = 5;
                                                                        var73_92 = 7.0E-45f;
                                                                        var70_89 = 8;
                                                                        var71_90 = 1.1E-44f;
                                                                        break block99;
                                                                        break;
                                                                    }
                                                                }
                                                                var74_93 = 4;
                                                                ** GOTO lbl406
                                                            }
                                                            var33_33 = var7_7;
                                                            var38_38 = 5;
                                                            var61_65 = 7.0E-45f;
                                                            var34_34 = 1;
                                                            var67_75 = true;
                                                            var54_54 = 1;
                                                            var68_76 = 1.4E-45f;
                                                            var56_56 = 1;
                                                            var69_82 = 1.4E-45f;
                                                            var74_93 = 8;
                                                            ** while (true)
                                                        }
                                                        if (!var17_17) break block115;
                                                        var48_48 = var23_23;
                                                        var34_34 = 2;
                                                        if (var23_23 == var34_34) break block116;
                                                        var34_34 = 1;
                                                        if (var23_23 == var34_34) break block117;
                                                        var38_38 = 8;
                                                        var61_65 = 1.1E-44f;
                                                        var48_48 = 5;
                                                        var49_49 = 7.0E-45f;
                                                        break block118;
                                                    }
                                                    var34_34 = 1;
                                                }
                                                var38_38 = 5;
                                                var61_65 = 7.0E-45f;
                                                var48_48 = 4;
                                                var49_49 = 5.6E-45f;
                                            }
                                            var70_89 = var38_38;
                                            var71_90 = var61_65;
                                            var72_91 = var48_48;
                                            var73_92 = var49_49;
                                            var38_38 = 5;
                                            var61_65 = 7.0E-45f;
                                            var67_75 = true;
                                            var54_54 = 1;
                                            var68_76 = 1.4E-45f;
                                            var56_56 = 1;
                                            var69_83 = 1.4E-45f;
                                            var74_93 = 6;
                                            ** while (true)
                                        }
                                        var34_34 = 1;
                                        if (var38_38 > 0) {
                                            var33_33 = var7_7;
                                            var38_38 = 5;
                                            var61_65 = 7.0E-45f;
                                            var67_75 = true;
                                            var54_54 = 1;
                                            var68_76 = 1.4E-45f;
                                            var56_56 = 1;
                                            var69_84 = 1.4E-45f;
                                            var74_93 = 6;
                                            var72_91 = 5;
                                            var73_92 = 7.0E-45f;
lbl473:
                                            // 3 sources

                                            while (true) {
                                                var70_89 = 5;
                                                var71_90 = 7.0E-45f;
                                                break block99;
                                                break;
                                            }
                                        }
                                        if (var38_38 != 0 || var46_46 != 0) break block119;
                                        if (var20_20) break block120;
                                        var33_33 = var7_7;
                                        var38_38 = 5;
                                        var61_65 = 7.0E-45f;
                                        var67_75 = true;
                                        var54_54 = 1;
                                        var68_76 = 1.4E-45f;
                                        var56_56 = 1;
                                        var69_85 = 1.4E-45f;
                                        var74_93 = 6;
                                        var72_91 = 8;
                                        var73_92 = 1.1E-44f;
                                        ** GOTO lbl473
                                    }
                                    if (var64_71 != var32_32 && var60_63 != var32_32) {
                                        var38_38 = 4;
                                        var61_65 = 5.6E-45f;
                                    } else {
                                        var38_38 = 5;
                                        var61_65 = 7.0E-45f;
                                    }
                                    var33_33 = var7_7;
                                    var70_89 = var38_38;
                                    var71_90 = var61_65;
                                    var38_38 = 5;
                                    var61_65 = 7.0E-45f;
                                    var67_75 = true;
                                    var54_54 = 1;
                                    var68_76 = 1.4E-45f;
                                    var56_56 = 1;
                                    var69_86 = 1.4E-45f;
                                    var74_93 = 6;
                                    var72_91 = 4;
                                    var73_92 = 5.6E-45f;
                                    break block99;
                                }
                                var33_33 = var7_7;
                                var38_38 = 5;
                                var61_65 = 7.0E-45f;
                                var67_75 = true;
                                var54_54 = 1;
                                var68_76 = 1.4E-45f;
                                var56_56 = 1;
                                var69_87 = 1.4E-45f;
lbl521:
                                // 2 sources

                                while (true) {
                                    var74_93 = 6;
                                    var72_91 = 4;
                                    var73_92 = 5.6E-45f;
                                    ** continue;
                                    break;
                                }
                            }
                            var65_73 = var48_48;
                            var34_34 = 1;
                            var33_33 = var7_7;
                            var38_38 = 5;
                            var61_65 = 7.0E-45f;
                            var67_75 = false;
                            var54_54 = 0;
                            var68_76 = 0.0f;
lbl535:
                            // 2 sources

                            while (true) {
                                var56_56 = 0;
                                var69_88 = 0.0f;
                                ** continue;
                                break;
                            }
                        }
                        var65_73 = var48_48;
                        var34_34 = 1;
                        var45_45 = 8;
                        var62_69 = 1.1E-44f;
                        var38_38 = (int)var43_43.f;
                        if (var38_38 != 0 && (var38_38 = (int)var51_51.f) != 0) {
                            var36_36 = var10_10.e();
                            var37_37 = var11_11.e();
                            var38_38 = 8;
                            var61_66 = 1.1E-44f;
                            var20_20 = var36_36;
                            var24_24 = var37_37;
                            var25_25 = var38_38;
                            var1_1.b(var40_40, var43_43, var36_36, var16_16, (k93_0)var51_51, var41_41, var37_37, var38_38);
                            if (var3_3 && var50_50 != 0) {
                                var64_71 = var11_11.f;
                                if (var64_71 != null) {
                                    var35_35 = var11_11.e();
                                    var33_33 = var7_7;
                                } else {
                                    var33_33 = var7_7;
                                    var35_35 = 0;
                                    var57_57 = null;
                                }
                                if (var42_42 /* !! */  != var33_33) {
                                    var38_38 = 5;
                                    var61_66 = 7.0E-45f;
                                    var29_29.f((k93_0)var33_33, var41_41, var35_35, var38_38);
                                }
                            }
                            return;
                        }
                        var33_33 = var7_7;
                        var38_38 = 5;
                        var61_65 = 7.0E-45f;
                        var67_75 = true;
                        var54_54 = 1;
                        var68_76 = 1.4E-45f;
                        ** while (true)
                    }
                    if (var67_75 && var43_43 == var42_42 /* !! */  && var64_71 != var32_32) {
                        var67_75 = false;
                        var75_94 = 0;
                        var76_95 = 0.0f;
                    } else {
                        var75_94 = 1;
                        var76_95 = 1.4E-45f;
                    }
                    if (var54_54 != 0) {
                        if (var53_53 == 0 && !var18_18 && !var20_20 && var43_43 == var59_60 && var42_42 /* !! */  == var33_33) {
                            var54_54 = 0;
                            var68_76 = 0.0f;
                            var74_93 = 8;
                            var70_89 = 8;
                            var71_90 = 1.1E-44f;
                            var75_94 = 0;
                            var76_95 = 0.0f;
                        } else {
                            var54_54 = (int)var3_3;
                        }
                        var77_96 = var10_10.e();
                        var78_97 = var11_11.e();
                        var63_70 = var57_57;
                        var57_57 = var1_1;
                        var33_33 = var64_71;
                        var64_71 = var40_40;
                        var5_5 = var50_50;
                        var30_30 /* !! */  = var59_60;
                        var59_60 = var43_43;
                        var38_38 = var77_96;
                        var9_9 = var46_46;
                        var31_31 /* !! */  = var60_63;
                        var39_39 = var16_16;
                        var79_98 = var42_42 /* !! */ ;
                        var50_50 = 8;
                        var45_45 = 1;
                        var62_69 = 1.4E-45f;
                        var80_99 = var43_43;
                        var43_43 = var41_41;
                        var81_100 = var41_41;
                        var82_101 = var78_97;
                        var83_102 = var40_40;
                        var1_1.b(var40_40, (k93_0)var59_60, var77_96, var16_16, (k93_0)var42_42 /* !! */ , var41_41, var78_97, var74_93);
lbl617:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var63_70 = var57_57;
                    var33_33 = var64_71;
                    var79_98 = var42_42 /* !! */ ;
                    var80_99 = var43_43;
                    var81_100 = var41_41;
                    var83_102 = var40_40;
                    var5_5 = var50_50;
                    var9_9 = var46_46;
                    var50_50 = 8;
                    var45_45 = 1;
                    var62_69 = 1.4E-45f;
                    var31_31 /* !! */  = var60_63;
                    var54_54 = (int)var3_3;
                    ** while (true)
                    var52_52 = var75_94;
                    var35_35 = var28_28.k0;
                    if (var35_35 == var50_50 && ((var57_57 = var63_70.a) == null || (var35_35 = var57_57.size()) <= 0)) {
                        return;
                    }
                    var64_71 = var79_98;
                    var57_57 = var80_99;
                    if (var67_75) {
                        if (var54_54 != 0 && var80_99 != var79_98 && var53_53 == 0 && ((var37_37 = var33_33 instanceof Lv) != 0 || (var37_37 = var31_31 /* !! */  instanceof Lv) != 0)) {
                            var37_37 = 6;
                            var84_103 = 8.4E-45f;
                        } else {
                            var37_37 = var70_89;
                            var84_103 = var71_90;
                        }
                        var38_38 = var10_10.e();
                        var60_63 = var83_102;
                        var29_29.f(var83_102, (k93_0)var57_57, var38_38, var37_37);
                        var38_38 = -var11_11.e();
                        var43_43 = var81_100;
                        var29_29.g(var81_100, (k93_0)var64_71, var38_38, var37_37);
                        var70_89 = var37_37;
                        var71_90 = var84_103;
                    } else {
                        var43_43 = var81_100;
                        var60_63 = var83_102;
                    }
                    if (var54_54 != 0 && var21_21 && (var37_37 = var33_33 instanceof Lv) == 0 && (var37_37 = var31_31 /* !! */  instanceof Lv) == 0 && var31_31 /* !! */  != var32_32) {
                        var37_37 = 6;
                        var84_103 = 8.4E-45f;
                        var38_38 = 6;
                        var61_65 = 8.4E-45f;
                        var52_52 = 1;
                    } else {
                        var37_37 = var72_91;
                        var84_103 = var73_92;
                        var38_38 = var70_89;
                        var61_65 = var71_90;
                    }
                    if (var52_52 != 0) {
                        if (var56_56 != 0 && (!var20_20 || var4_4)) {
                            var52_52 = var33_33 != var32_32 && var31_31 /* !! */  != var32_32 ? var37_37 : 6;
                            var82_101 = var33_33 instanceof w11_0;
                            if (var82_101 != 0 || (var82_101 = var31_31 /* !! */  instanceof w11_0) != 0) {
                                var52_52 = 5;
                            }
                            if ((var82_101 = var33_33 instanceof Lv) != 0 || (var82_101 = var31_31 /* !! */  instanceof Lv) != 0) {
                                var52_52 = 5;
                            }
                            if (var20_20) {
                                var52_52 = 5;
                            }
                            var37_37 = Math.max(var52_52, var37_37);
                        }
                        var52_52 = var37_37;
                        if (var54_54 != 0) {
                            var52_52 = Math.min(var38_38, var37_37);
                            if (var17_17 && !var20_20 && (var33_33 == var32_32 || var31_31 /* !! */  == var32_32)) {
                                var52_52 = 4;
                            }
                        }
                        var37_37 = var10_10.e();
                        var29_29.e((k93_0)var60_63, (k93_0)var57_57, var37_37, var52_52);
                        var37_37 = -var11_11.e();
                        var29_29.e(var43_43, (k93_0)var64_71, var37_37, var52_52);
                    }
                    if (var54_54 != 0) {
                        var59_60 = var6_6;
                        var38_38 = 8;
                        var61_65 = 1.1E-44f;
                        if (var6_6 == var57_57) {
                            var52_52 = var10_10.e();
                        } else {
                            var52_52 = 0;
                            var42_42 /* !! */  = null;
                        }
                        if (var57_57 != var59_60) {
                            var35_35 = 5;
                            var29_29.f((k93_0)var60_63, (k93_0)var59_60, var52_52, var35_35);
                        } else {
                            var35_35 = 5;
                        }
                    } else {
                        var35_35 = 5;
                        var38_38 = 8;
                        var61_65 = 1.1E-44f;
                    }
                    ** while (var54_54 == 0 || var53_53 == 0 || var14_14 != 0 || var9_9)
lbl707:
                    // 1 sources

                    if (var53_53 == 0) ** GOTO lbl-1000
                    var48_48 = var65_73;
                    var37_37 = 3;
                    var84_103 = 4.2E-45f;
                    if (var65_73 == var37_37) {
                        var52_52 = 0;
                        var42_42 /* !! */  = null;
                        var29_29.f(var43_43, (k93_0)var60_63, 0, var38_38);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var52_52 = 0;
                        var42_42 /* !! */  = null;
                        var29_29.f(var43_43, (k93_0)var60_63, 0, var35_35);
                    }
                    break block98;
                    var52_52 = 0;
                    var42_42 /* !! */  = null;
                    var54_54 = (int)var3_3;
                }
                if (var54_54 != 0 && var5_5) {
                    var59_60 = var63_70.f;
                    if (var59_60 != null) {
                        var52_52 = var11_11.e();
                    }
                    var41_41 = var7_7;
                    if (var64_71 != var7_7) {
                        var29_29.f(var7_7, var43_43, var52_52, var35_35);
                    }
                }
                return;
            }
            var59_59 /* !! */  = var6_6;
            var43_43 = var41_41;
            var60_61 = var40_40;
            var5_5 = var50_50;
            var35_35 = var56_56;
            var38_38 = 8;
            var61_67 = 1.1E-44f;
            var52_52 = 0;
            var42_42 /* !! */  = null;
            var45_45 = 1;
            var62_68 = 1.4E-45f;
            var41_41 = var7_7;
            var36_36 = 2;
            var58_58 = 2.8E-45f;
        }
        if (var35_35 < var36_36 && var3_3 && var5_5) {
            var29_29.f(var60_61, var59_59 /* !! */ , 0, var38_38);
            var57_57 = var28_28.P;
            if (!var2_2 && (var64_72 /* !! */  = var57_57.f) != null) {
                var36_36 = 0;
                var58_58 = 0.0f;
                var64_72 /* !! */  = null;
            } else {
                var36_36 = 1;
                var58_58 = 1.4E-45f;
            }
            if (!var2_2 && (var57_57 = var57_57.f) != null) {
                var57_57 = var57_57.d;
                var58_58 = var57_57.a0;
                var37_37 = 0;
                var84_104 = 0.0f;
                var59_59 /* !! */  = null;
                cfr_temp_0 = var58_58 - 0.0f;
                var36_36 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                if (var36_36 == 0 || (var64_72 /* !! */  = (var57_57 = var57_57.W)[0]) != (var59_59 /* !! */  = Y50$b.MATCH_CONSTRAINT) || (var57_57 = var57_57[var45_45]) != var59_59 /* !! */ ) {
                    var45_45 = 0;
                    var62_68 = 0.0f;
                }
            } else {
                var45_45 = var36_36;
                var62_68 = var58_58;
            }
            if (var45_45 != 0) {
                var29_29.f(var41_41, var43_43, 0, var38_38);
            }
        }
    }

    public final void i(v50$a object, Y50 object2, v50$a object3, int n3) {
        Object object4 = v50$a.CENTER;
        v50_0 v50_02 = null;
        if (object == object4) {
            if (object3 == object4) {
                boolean bl2;
                boolean bl3;
                object = v50$a.LEFT;
                object3 = this.n((v50$a)((Object)object));
                v50$a v50$a = v50$a.RIGHT;
                v50_0 v50_03 = this.n(v50$a);
                v50$a v50$a2 = v50$a.TOP;
                v50_0 v50_04 = this.n(v50$a2);
                v50$a v50$a3 = v50$a.BOTTOM;
                v50_0 v50_05 = this.n(v50$a3);
                boolean bl4 = true;
                if (object3 != null && (bl3 = ((v50_0)object3).h()) || v50_03 != null && (bl3 = v50_03.h())) {
                    bl2 = false;
                    object = null;
                } else {
                    this.i((v50$a)((Object)object), (Y50)object2, (v50$a)((Object)object), 0);
                    this.i(v50$a, (Y50)object2, v50$a, 0);
                    bl2 = true;
                }
                if (v50_04 != null && (bl3 = v50_04.h()) || v50_05 != null && (bl3 = v50_05.h())) {
                    bl4 = false;
                } else {
                    this.i(v50$a2, (Y50)object2, v50$a2, 0);
                    this.i(v50$a3, (Y50)object2, v50$a3, 0);
                }
                if (bl2 && bl4) {
                    object = this.n((v50$a)((Object)object4));
                    object2 = ((Y50)object2).n((v50$a)((Object)object4));
                    ((v50_0)object).a((v50_0)object2, 0);
                } else if (bl2) {
                    object = v50$a.CENTER_X;
                    object3 = this.n((v50$a)((Object)object));
                    object = ((Y50)object2).n((v50$a)((Object)object));
                    ((v50_0)object3).a((v50_0)object, 0);
                } else if (bl4) {
                    object = v50$a.CENTER_Y;
                    object3 = this.n((v50$a)((Object)object));
                    object = ((Y50)object2).n((v50$a)((Object)object));
                    ((v50_0)object3).a((v50_0)object, 0);
                }
            } else {
                v50$a v50$a;
                object = v50$a.LEFT;
                if (object3 != object && object3 != (v50$a = v50$a.RIGHT)) {
                    object = v50$a.TOP;
                    if (object3 == object || object3 == (v50$a = v50$a.BOTTOM)) {
                        this.i((v50$a)((Object)object), (Y50)object2, (v50$a)((Object)object3), 0);
                        object = v50$a.BOTTOM;
                        this.i((v50$a)((Object)object), (Y50)object2, (v50$a)((Object)object3), 0);
                        object = this.n((v50$a)((Object)object4));
                        object2 = ((Y50)object2).n((v50$a)((Object)object3));
                        ((v50_0)object).a((v50_0)object2, 0);
                    }
                } else {
                    this.i((v50$a)((Object)object), (Y50)object2, (v50$a)((Object)object3), 0);
                    object = v50$a.RIGHT;
                    this.i((v50$a)((Object)object), (Y50)object2, (v50$a)((Object)object3), 0);
                    object = this.n((v50$a)((Object)object4));
                    object2 = ((Y50)object2).n((v50$a)((Object)object3));
                    ((v50_0)object).a((v50_0)object2, 0);
                }
            }
        } else {
            v50$a v50$a;
            v50$a v50$a4;
            v50$a v50$a5 = v50$a.CENTER_X;
            if (object == v50$a5 && (object3 == (v50$a4 = v50$a.LEFT) || object3 == (v50$a = v50$a.RIGHT))) {
                object = this.n(v50$a4);
                object2 = ((Y50)object2).n((v50$a)((Object)object3));
                object3 = v50$a.RIGHT;
                object3 = this.n((v50$a)((Object)object3));
                ((v50_0)object).a((v50_0)object2, 0);
                ((v50_0)object3).a((v50_0)object2, 0);
                object = this.n(v50$a5);
                ((v50_0)object).a((v50_0)object2, 0);
            } else {
                v50$a v50$a6;
                v50$a4 = v50$a.CENTER_Y;
                if (object == v50$a4 && (object3 == (v50$a = v50$a.TOP) || object3 == (v50$a6 = v50$a.BOTTOM))) {
                    object = ((Y50)object2).n((v50$a)((Object)object3));
                    this.n(v50$a).a((v50_0)object, 0);
                    object2 = v50$a.BOTTOM;
                    this.n((v50$a)((Object)object2)).a((v50_0)object, 0);
                    object2 = this.n(v50$a4);
                    ((v50_0)object2).a((v50_0)object, 0);
                } else if (object == v50$a5 && object3 == v50$a5) {
                    object = v50$a.LEFT;
                    v50_0 v50_06 = this.n((v50$a)((Object)object));
                    object = ((Y50)object2).n((v50$a)((Object)object));
                    v50_06.a((v50_0)object, 0);
                    object = v50$a.RIGHT;
                    v50_06 = this.n((v50$a)((Object)object));
                    object = ((Y50)object2).n((v50$a)((Object)object));
                    v50_06.a((v50_0)object, 0);
                    object = this.n(v50$a5);
                    object2 = ((Y50)object2).n((v50$a)((Object)object3));
                    ((v50_0)object).a((v50_0)object2, 0);
                } else if (object == v50$a4 && object3 == v50$a4) {
                    object = v50$a.TOP;
                    v50_0 v50_07 = this.n((v50$a)((Object)object));
                    object = ((Y50)object2).n((v50$a)((Object)object));
                    v50_07.a((v50_0)object, 0);
                    object = v50$a.BOTTOM;
                    v50_07 = this.n((v50$a)((Object)object));
                    object = ((Y50)object2).n((v50$a)((Object)object));
                    v50_07.a((v50_0)object, 0);
                    object = this.n(v50$a4);
                    object2 = ((Y50)object2).n((v50$a)((Object)object3));
                    ((v50_0)object).a((v50_0)object2, 0);
                } else {
                    v50_02 = this.n((v50$a)((Object)object));
                    boolean bl5 = v50_02.i((v50_0)(object2 = ((Y50)object2).n((v50$a)((Object)object3))));
                    if (bl5) {
                        object3 = v50$a.BASELINE;
                        if (object == object3) {
                            object = v50$a.TOP;
                            object = this.n((v50$a)((Object)object));
                            object3 = v50$a.BOTTOM;
                            object3 = this.n((v50$a)((Object)object3));
                            if (object != null) {
                                ((v50_0)object).j();
                            }
                            if (object3 != null) {
                                ((v50_0)object3).j();
                            }
                        } else {
                            v50$a = v50$a.TOP;
                            if (object != v50$a && object != (v50$a = v50$a.BOTTOM)) {
                                object3 = v50$a.LEFT;
                                if (object == object3 || object == (object3 = v50$a.RIGHT)) {
                                    object3 = this.n((v50$a)((Object)object4));
                                    object4 = ((v50_0)object3).f;
                                    if (object4 != object2) {
                                        ((v50_0)object3).j();
                                    }
                                    object = this.n((v50$a)((Object)object)).f();
                                    object3 = this.n(v50$a5);
                                    boolean bl6 = ((v50_0)object3).h();
                                    if (bl6) {
                                        ((v50_0)object).j();
                                        ((v50_0)object3).j();
                                    }
                                }
                            } else {
                                if ((object3 = this.n((v50$a)((Object)object3))) != null) {
                                    ((v50_0)object3).j();
                                }
                                object3 = this.n((v50$a)((Object)object4));
                                object4 = ((v50_0)object3).f;
                                if (object4 != object2) {
                                    ((v50_0)object3).j();
                                }
                                object = this.n((v50$a)((Object)object)).f();
                                object3 = this.n(v50$a4);
                                boolean bl7 = ((v50_0)object3).h();
                                if (bl7) {
                                    ((v50_0)object).j();
                                    ((v50_0)object3).j();
                                }
                            }
                        }
                        v50_02.a((v50_0)object2, n3);
                    }
                }
            }
        }
    }

    public final void j(v50_0 object, v50_0 object2, int n3) {
        Y50 y50 = object.d;
        if (y50 == this) {
            y50 = object2.d;
            object = object.e;
            object2 = object2.e;
            this.i((v50$a)((Object)object), y50, (v50$a)((Object)object2), n3);
        }
    }

    public void k(Y50 y50, HashMap hashMap) {
        float f5;
        int n3;
        this.q = n3 = y50.q;
        this.r = n3 = y50.r;
        this.t = n3 = y50.t;
        this.u = n3 = y50.u;
        Object object = y50.v;
        int n4 = object[0];
        Object object2 = this.v;
        object2[0] = n4;
        n4 = 1;
        object2[n4] = n3 = object[n4];
        this.w = n3 = y50.w;
        this.x = n3 = y50.x;
        this.z = n3 = y50.z;
        this.A = n3 = y50.A;
        this.B = f5 = y50.B;
        this.C = n3 = y50.C;
        this.D = f5 = y50.D;
        object = y50.E;
        int n7 = ((int[])object).length;
        object = Arrays.copyOf(object, n7);
        this.E = object;
        this.F = f5 = y50.F;
        n3 = (int)(y50.G ? 1 : 0);
        this.G = n3;
        n3 = (int)(y50.H ? 1 : 0);
        this.H = n3;
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.S.j();
        object = Arrays.copyOf(this.W, 2);
        this.W = (Y50$b[])object;
        object = this.X;
        n7 = 0;
        object2 = null;
        if (object == null) {
            n3 = 0;
            object = null;
            f5 = 0.0f;
        } else {
            object = y50.X;
            object = (Y50)hashMap.get(object);
        }
        this.X = object;
        this.Y = n3 = y50.Y;
        this.Z = n3 = y50.Z;
        this.a0 = f5 = y50.a0;
        this.b0 = n3 = y50.b0;
        this.c0 = n3 = y50.c0;
        this.d0 = n3 = y50.d0;
        this.e0 = n3 = y50.e0;
        this.f0 = n3 = y50.f0;
        this.g0 = n3 = y50.g0;
        this.h0 = f5 = y50.h0;
        this.i0 = f5 = y50.i0;
        object = y50.j0;
        this.j0 = object;
        this.k0 = n3 = y50.k0;
        n3 = (int)(y50.l0 ? 1 : 0);
        this.l0 = n3;
        object = y50.m0;
        this.m0 = object;
        object = y50.n0;
        this.n0 = object;
        this.o0 = n3 = y50.o0;
        this.p0 = n3 = y50.p0;
        object = y50.q0;
        int n8 = object[0];
        Object[] objectArray = this.q0;
        objectArray[0] = n8;
        objectArray[n4] = f5 = (float)object[n4];
        object = y50.r0;
        int n10 = object[0];
        objectArray = this.r0;
        objectArray[0] = n10;
        object = object[n4];
        objectArray[n4] = (float)object;
        object = y50.s0;
        n10 = object[0];
        objectArray = this.s0;
        objectArray[0] = n10;
        object = object[n4];
        objectArray[n4] = (float)object;
        object = y50.t0;
        if (object == null) {
            n3 = 0;
            object = null;
            f5 = 0.0f;
        } else {
            object = (Y50)hashMap.get(object);
        }
        this.t0 = (Y50)object;
        y50 = y50.u0;
        if (y50 != null) {
            y50 = hashMap.get(y50);
            object2 = y50;
            object2 = y50;
        }
        this.u0 = object2;
    }

    public final void l(Eu1 eu1) {
        v50_0 v50_02 = this.L;
        eu1.k(v50_02);
        v50_02 = this.M;
        eu1.k(v50_02);
        v50_02 = this.N;
        eu1.k(v50_02);
        v50_02 = this.O;
        eu1.k(v50_02);
        int n3 = this.e0;
        if (n3 > 0) {
            v50_02 = this.P;
            eu1.k(v50_02);
        }
    }

    public final void m() {
        int n3;
        Object object;
        dp0 dp02;
        wf3_0 wf3_02 = this.d;
        if (wf3_02 == null) {
            wf3_02 = new wf3_0(this);
            dp02 = wf3_02.h;
            dp02.e = object = dp0$a.LEFT;
            dp02 = wf3_02.i;
            dp02.e = object = dp0$a.RIGHT;
            n3 = 0;
            dp02 = null;
            wf3_02.f = 0;
            this.d = wf3_02;
        }
        if ((wf3_02 = this.e) == null) {
            dp0$a dp0$a;
            wf3_02 = new wf3_0(this);
            ((zb3_1)wf3_02).k = dp02 = new dp0(wf3_02);
            ((zb3_1)wf3_02).l = null;
            object = wf3_02.h;
            ((dp0)object).e = dp0$a = dp0$a.TOP;
            object = wf3_02.i;
            ((dp0)object).e = dp0$a = dp0$a.BOTTOM;
            dp02.e = object = dp0$a.BASELINE;
            wf3_02.f = n3 = 1;
            this.e = wf3_02;
        }
    }

    public v50_0 n(v50$a object) {
        Object object2 = Y50$a.a;
        int n3 = object.ordinal();
        int n4 = object2[n3];
        switch (n4) {
            default: {
                object2 = new AssertionError;
                object = object.name();
                object2(object);
                throw object2;
            }
            case 9: {
                return null;
            }
            case 8: {
                return this.R;
            }
            case 7: {
                return this.Q;
            }
            case 6: {
                return this.S;
            }
            case 5: {
                return this.P;
            }
            case 4: {
                return this.O;
            }
            case 3: {
                return this.N;
            }
            case 2: {
                return this.M;
            }
            case 1: 
        }
        return this.L;
    }

    public final Y50$b o(int n3) {
        if (n3 == 0) {
            return this.W[0];
        }
        int n4 = 1;
        if (n3 == n4) {
            return this.W[n4];
        }
        return null;
    }

    public final int p() {
        int n3 = this.k0;
        int n4 = 8;
        if (n3 == n4) {
            return 0;
        }
        return this.Z;
    }

    public final Y50 q(int n3) {
        if (n3 == 0) {
            v50_0 v50_02;
            v50_0 v50_03 = this.N;
            v50_0 v50_04 = v50_03.f;
            if (v50_04 != null && (v50_02 = v50_04.f) == v50_03) {
                return v50_04.d;
            }
        } else {
            int n4 = 1;
            if (n3 == n4) {
                v50_0 v50_05;
                v50_0 v50_06 = this.O;
                v50_0 v50_07 = v50_06.f;
                if (v50_07 != null && (v50_05 = v50_07.f) == v50_06) {
                    return v50_07.d;
                }
            }
        }
        return null;
    }

    public final Y50 r(int n3) {
        if (n3 == 0) {
            v50_0 v50_02;
            v50_0 v50_03 = this.L;
            v50_0 v50_04 = v50_03.f;
            if (v50_04 != null && (v50_02 = v50_04.f) == v50_03) {
                return v50_04.d;
            }
        } else {
            int n4 = 1;
            if (n3 == n4) {
                v50_0 v50_05;
                v50_0 v50_06 = this.M;
                v50_0 v50_07 = v50_06.f;
                if (v50_07 != null && (v50_05 = v50_07.f) == v50_06) {
                    return v50_07.d;
                }
            }
        }
        return null;
    }

    public void s(StringBuilder stringBuilder) {
        Object object = new StringBuilder("  ");
        Object object2 = this.l;
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(":{\n");
        object = ((StringBuilder)object).toString();
        stringBuilder.append((String)object);
        object = new StringBuilder("    actualWidth:");
        int n3 = this.Y;
        ((StringBuilder)object).append(n3);
        object = ((StringBuilder)object).toString();
        stringBuilder.append((String)object);
        object = "\n";
        stringBuilder.append((String)object);
        object2 = new StringBuilder("    actualHeight:");
        int n4 = this.Z;
        ((StringBuilder)object2).append(n4);
        object2 = ((StringBuilder)object2).toString();
        stringBuilder.append((String)object2);
        stringBuilder.append((String)object);
        object2 = new StringBuilder("    actualLeft:");
        n4 = this.c0;
        ((StringBuilder)object2).append(n4);
        object2 = ((StringBuilder)object2).toString();
        stringBuilder.append((String)object2);
        stringBuilder.append((String)object);
        object2 = new StringBuilder("    actualTop:");
        n4 = this.d0;
        ((StringBuilder)object2).append(n4);
        object2 = ((StringBuilder)object2).toString();
        stringBuilder.append((String)object2);
        stringBuilder.append((String)object);
        object2 = this.L;
        Y50.u(stringBuilder, "left", (v50_0)object2);
        object2 = this.M;
        Y50.u(stringBuilder, "top", (v50_0)object2);
        object2 = this.N;
        Y50.u(stringBuilder, "right", (v50_0)object2);
        object2 = this.O;
        Y50.u(stringBuilder, "bottom", (v50_0)object2);
        object2 = this.P;
        Y50.u(stringBuilder, "baseline", (v50_0)object2);
        object2 = this.Q;
        Y50.u(stringBuilder, "centerX", (v50_0)object2);
        object2 = this.R;
        Y50.u(stringBuilder, "centerY", (v50_0)object2);
        n4 = this.Y;
        int n7 = this.f0;
        Object object3 = this.E[0];
        int n8 = this.w;
        int n10 = this.t;
        float f5 = this.y;
        Y50$b y50$b = this.W[0];
        float[] fArray = this.q0;
        float f6 = fArray[0];
        object = stringBuilder;
        Y50.t(stringBuilder, "    width", n4, n7, object3, n8, n10, f5, y50$b);
        n4 = this.Z;
        n7 = this.g0;
        object = this.E;
        n3 = 1;
        float f7 = Float.MIN_VALUE;
        object3 = object[n3];
        n8 = this.z;
        n10 = this.u;
        f5 = this.B;
        y50$b = this.W[n3];
        f6 = fArray[n3];
        object2 = "    height";
        object = stringBuilder;
        Y50.t(stringBuilder, (String)object2, n4, n7, object3, n8, n10, f5, y50$b);
        f6 = this.a0;
        n3 = this.b0;
        float f8 = 0.0f;
        String string2 = null;
        float f11 = f6 - 0.0f;
        n4 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
        if (n4 != 0) {
            stringBuilder.append("    dimensionRatio");
            string2 = " :  [";
            stringBuilder.append(string2);
            stringBuilder.append(f6);
            stringBuilder.append(",");
            stringBuilder.append(n3);
            stringBuilder.append("");
            object = "],\n";
            stringBuilder.append((String)object);
        }
        f6 = this.h0;
        f8 = 0.5f;
        Y50.M(stringBuilder, "    horizontalBias", f6, f8);
        f7 = this.i0;
        Y50.M(stringBuilder, "    verticalBias", f7, f8);
        n3 = this.o0;
        Y50.L("    horizontalChainStyle", n3, 0, stringBuilder);
        n3 = this.p0;
        Y50.L("    verticalChainStyle", n3, 0, stringBuilder);
        stringBuilder.append("  }");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence charSequence = this.n0;
        String string2 = "";
        String string3 = " ";
        if (charSequence != null) {
            charSequence = new StringBuilder("type: ");
            String string4 = this.n0;
            charSequence = h30_0.a((StringBuilder)charSequence, string4, string3);
        } else {
            charSequence = string2;
        }
        stringBuilder.append((String)charSequence);
        charSequence = this.m0;
        if (charSequence != null) {
            charSequence = new StringBuilder("id: ");
            string2 = this.m0;
            string2 = h30_0.a((StringBuilder)charSequence, string2, string3);
        }
        stringBuilder.append(string2);
        stringBuilder.append("(");
        int n3 = this.c0;
        stringBuilder.append(n3);
        stringBuilder.append(", ");
        n3 = this.d0;
        stringBuilder.append(n3);
        stringBuilder.append(") - (");
        n3 = this.Y;
        stringBuilder.append(n3);
        stringBuilder.append(" x ");
        return g30.a(this.Z, ")", stringBuilder);
    }

    public final int v() {
        int n3 = this.k0;
        int n4 = 8;
        if (n3 == n4) {
            return 0;
        }
        return this.Y;
    }

    public final int w() {
        int n3;
        Y50 y50 = this.X;
        if (y50 != null && (n3 = y50 instanceof Z50) != 0) {
            int n4 = ((Z50)y50).E0;
            n3 = this.c0;
            return n4 + n3;
        }
        return this.c0;
    }

    public final int x() {
        int n3;
        Y50 y50 = this.X;
        if (y50 != null && (n3 = y50 instanceof Z50) != 0) {
            int n4 = ((Z50)y50).F0;
            n3 = this.d0;
            return n4 + n3;
        }
        return this.d0;
    }

    public final boolean y(int n3) {
        int n4;
        int n7 = 2;
        boolean bl2 = false;
        if (n3 == 0) {
            int n8;
            v50_0 v50_02 = this.L.f;
            if (v50_02 != null) {
                n3 = 1;
            } else {
                n3 = 0;
                v50_02 = null;
            }
            v50_0 v50_03 = this.N.f;
            if (v50_03 != null) {
                n8 = 1;
            } else {
                n8 = 0;
                v50_03 = null;
            }
            if ((n3 += n8) < n7) {
                bl2 = true;
            }
            return bl2;
        }
        v50_0 v50_04 = this.M.f;
        if (v50_04 != null) {
            n3 = 1;
        } else {
            n3 = 0;
            v50_04 = null;
        }
        v50_0 v50_05 = this.O.f;
        if (v50_05 != null) {
            n4 = 1;
        } else {
            n4 = 0;
            v50_05 = null;
        }
        n3 += n4;
        v50_05 = this.P.f;
        if (v50_05 != null) {
            n4 = 1;
        } else {
            n4 = 0;
            v50_05 = null;
        }
        if ((n3 += n4) < n7) {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean z(int n3, int n4) {
        boolean bl2 = true;
        if (n3 == 0) {
            int n7;
            v50_0 v50_02 = this.L;
            v50_0 v50_03 = v50_02.f;
            if (v50_03 != null && (n7 = v50_03.c) != 0) {
                boolean bl3;
                v50_03 = this.N;
                v50_0 v50_04 = v50_03.f;
                if (v50_04 != null && (bl3 = v50_04.c)) {
                    int n8 = v50_04.d();
                    n7 = v50_03.e();
                    n8 -= n7;
                    v50_03 = v50_02.f;
                    n7 = v50_03.d();
                    n3 = v50_02.e() + n7;
                    if ((n8 -= n3) < n4) {
                        bl2 = false;
                    }
                    return bl2;
                }
            }
        } else {
            int n10;
            v50_0 v50_05 = this.M;
            v50_0 v50_06 = v50_05.f;
            if (v50_06 != null && (n10 = v50_06.c) != 0) {
                boolean bl4;
                v50_06 = this.O;
                v50_0 v50_07 = v50_06.f;
                if (v50_07 != null && (bl4 = v50_07.c)) {
                    int n14 = v50_07.d();
                    n10 = v50_06.e();
                    n14 -= n10;
                    v50_06 = v50_05.f;
                    n10 = v50_06.d();
                    n3 = v50_05.e() + n10;
                    if ((n14 -= n3) < n4) {
                        bl2 = false;
                    }
                    return bl2;
                }
            }
        }
        return false;
    }
}

