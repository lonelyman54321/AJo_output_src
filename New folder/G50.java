/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public class G50
implements qg2_0 {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    public Object J;
    public Object K;
    public Object L;
    public Object M;
    public Object N;
    public Object O;
    public Object P;
    public Object Q;
    public Object R;
    public Object S;
    public Object T;
    public Object U;
    public Object V;
    public Object W;
    public Object X;
    public Object Y;
    public Object Z;
    public Object a;
    public Object a0;
    public final Fb3 b;
    public float b0;
    public ni0_0 c = null;
    public float c0;
    public int d = 0;
    public Fb3$b d0;
    public int e = 0;
    public vq0 e0;
    public float f;
    public vq0 f0;
    public float g;
    public Object g0;
    public float h;
    public Y50 h0;
    public float i;
    public final HashMap i0;
    public int j;
    public HashMap j0;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public float z;

    public G50(Fb3 fb3) {
        float f5;
        this.f = f5 = -1.0f;
        this.g = f5;
        this.h = f5 = 0.5f;
        this.i = f5;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = f5 = 0.0f / 0.0f;
        this.y = f5;
        this.z = f5;
        this.A = f5;
        this.B = f5;
        this.C = f5;
        this.D = f5;
        this.E = f5;
        this.F = f5;
        this.G = f5;
        this.H = f5;
        this.I = 0;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.a0 = null;
        this.d0 = null;
        HashMap hashMap = vq0.i;
        String string2 = vq0.h;
        vq0 vq02 = new vq0(string2);
        vq02.f = hashMap;
        this.e0 = vq02;
        vq02 = new vq0(string2);
        vq02.f = hashMap;
        this.f0 = vq02;
        this.i0 = hashMap = new HashMap();
        this.j0 = hashMap = new HashMap();
        this.b = fb3;
    }

    public Y50 a() {
        Y50 y50 = this.h0;
        if (y50 == null) {
            Object object;
            int n3 = this.e0.d;
            vq0 vq02 = this.f0;
            int n4 = vq02.d;
            this.h0 = y50 = new Y50(n3, n4);
            y50.j0 = object = this.g0;
        }
        return this.h0;
    }

    public void apply() {
        Object object;
        Object object2;
        float f5;
        Object object3 = this.h0;
        if (object3 == null) {
            return;
        }
        object3 = this.c;
        if (object3 != null) {
            object3.apply();
        }
        object3 = this.e0;
        Object object4 = this.h0;
        int n4 = 0;
        float f6 = 0.0f;
        Object object5 = null;
        ((vq0)object3).a((Y50)object4, 0);
        object3 = this.f0;
        object4 = this.h0;
        int n7 = 1;
        float f7 = Float.MIN_VALUE;
        ((vq0)object3).a((Y50)object4, n7);
        object3 = this.J;
        object3 = this.j(object3);
        this.J = object3;
        object3 = this.K;
        object3 = this.j(object3);
        this.K = object3;
        object3 = this.L;
        object3 = this.j(object3);
        this.L = object3;
        object3 = this.M;
        object3 = this.j(object3);
        this.M = object3;
        object3 = this.N;
        object3 = this.j(object3);
        this.N = object3;
        object3 = this.O;
        object3 = this.j(object3);
        this.O = object3;
        object3 = this.P;
        object3 = this.j(object3);
        this.P = object3;
        object3 = this.Q;
        object3 = this.j(object3);
        this.Q = object3;
        object3 = this.R;
        object3 = this.j(object3);
        this.R = object3;
        object3 = this.S;
        object3 = this.j(object3);
        this.S = object3;
        object3 = this.U;
        object3 = this.j(object3);
        this.U = object3;
        object3 = this.V;
        object3 = this.j(object3);
        this.V = object3;
        object3 = this.X;
        object3 = this.j(object3);
        this.X = object3;
        object3 = this.Y;
        object3 = this.j(object3);
        this.Y = object3;
        object3 = this.Z;
        object3 = this.j(object3);
        this.Z = object3;
        object3 = this.h0;
        object4 = this.J;
        Object object6 = Fb3$b.LEFT_TO_LEFT;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.K;
        object6 = Fb3$b.LEFT_TO_RIGHT;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.L;
        object6 = Fb3$b.RIGHT_TO_LEFT;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.M;
        object6 = Fb3$b.RIGHT_TO_RIGHT;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.N;
        object6 = Fb3$b.START_TO_START;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.O;
        object6 = Fb3$b.START_TO_END;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.P;
        object6 = Fb3$b.END_TO_START;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.Q;
        object6 = Fb3$b.END_TO_END;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.R;
        object6 = Fb3$b.TOP_TO_TOP;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.S;
        object6 = Fb3$b.TOP_TO_BOTTOM;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.T;
        object6 = Fb3$b.TOP_TO_BASELINE;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.U;
        object6 = Fb3$b.BOTTOM_TO_TOP;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.V;
        object6 = Fb3$b.BOTTOM_TO_BOTTOM;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.W;
        object6 = Fb3$b.BOTTOM_TO_BASELINE;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.X;
        object6 = Fb3$b.BASELINE_TO_BASELINE;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.Y;
        object6 = Fb3$b.BASELINE_TO_TOP;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.Z;
        object6 = Fb3$b.BASELINE_TO_BOTTOM;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        object3 = this.h0;
        object4 = this.a0;
        object6 = Fb3$b.CIRCULAR_CONSTRAINT;
        this.d((Y50)object3, object4, (Fb3$b)((Object)object6));
        int n8 = this.d;
        if (n8 != 0) {
            object4 = this.h0;
            ((Y50)object4).o0 = n8;
        }
        if ((n8 = this.e) != 0) {
            object4 = this.h0;
            ((Y50)object4).p0 = n8;
        }
        float f8 = this.f;
        int n10 = -1082130432;
        float f11 = -1.0f;
        float f12 = f8 - f11;
        Object object7 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (object7 != false) {
            object6 = this.h0.q0;
            object6[0] = (Fb3$b)f8;
        }
        if ((n10 = (int)((f5 = (f8 = this.g) - f11) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) != 0) {
            object4 = this.h0.q0;
            object4[n7] = f8;
        }
        object3 = this.h0;
        ((Y50)object3).h0 = f11 = this.h;
        ((Y50)object3).i0 = f11 = this.i;
        object4 = ((Y50)object3).k;
        ((UF3)object4).f = f6 = this.x;
        ((UF3)object4).g = f6 = this.y;
        ((UF3)object4).h = f6 = this.z;
        ((UF3)object4).i = f6 = this.A;
        ((UF3)object4).j = f6 = this.B;
        ((UF3)object4).k = f6 = this.C;
        ((UF3)object4).l = f6 = this.D;
        ((UF3)object4).m = f6 = this.E;
        ((UF3)object4).n = f6 = this.G;
        ((UF3)object4).o = f6 = this.H;
        ((UF3)object4).p = f6 = this.F;
        ((UF3)object4).r = n4 = this.I;
        ((Y50)object3).k0 = n4;
        object3 = this.i0;
        n10 = 0;
        f11 = 0.0f;
        object4 = null;
        if (object3 != null) {
            object5 = ((HashMap)object3).keySet().iterator();
            while ((n7 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                int n3;
                object2 = (String)object5.next();
                object6 = (Integer)((HashMap)object3).get(object2);
                object = this.h0.k;
                object7 = (Integer)object6;
                object = ((UF3)object).s;
                boolean n32 = ((HashMap)object).containsKey(object2);
                if (n32) {
                    object2 = (mg0)((HashMap)object).get(object2);
                    ((mg0)object2).c = (int)object7;
                    continue;
                }
                mg0 mg02 = new Object();
                mg02.d = 0.0f / 0.0f;
                mg02.e = null;
                mg02.a = object2;
                mg02.b = n3 = 902;
                mg02.c = (int)object7;
                ((HashMap)object).put(object2, mg02);
            }
        }
        if ((object3 = this.j0) != null) {
            object3 = ((HashMap)object3).keySet().iterator();
            while ((n4 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                int n14;
                object5 = (String)object3.next();
                object2 = (Float)this.j0.get(object5);
                f7 = ((Float)object2).floatValue();
                object6 = this.h0.k.s;
                boolean bl2 = ((HashMap)object6).containsKey(object5);
                if (bl2) {
                    object5 = (mg0)((HashMap)object6).get(object5);
                    ((mg0)object5).d = f7;
                    continue;
                }
                object = new Object();
                ((mg0)object).c = -1 << -1;
                ((mg0)object).e = null;
                ((mg0)object).a = object5;
                ((mg0)object).b = n14 = 901;
                ((mg0)object).d = f7;
                ((HashMap)object6).put(object5, object);
            }
        }
    }

    public final void b(Y50 y50) {
        Object object;
        if (y50 == null) {
            return;
        }
        this.h0 = y50;
        y50.j0 = object = this.g0;
    }

    public final ni0_0 c() {
        return this.c;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void d(Y50 object, Object object2, Fb3$b fb3$b) {
        Object var3_37;
        void var2_4;
        float f5;
        boolean bl2 = object2 instanceof qg2_0;
        if (bl2) {
            Y50 y50 = ((qg2_0)object2).a();
        } else {
            boolean bl3 = false;
            f5 = 0.0f;
            Object var2_5 = null;
        }
        void var5_56 = var2_4;
        if (var2_4 == null) {
            return;
        }
        int[] nArray = G50$a.a;
        int n4 = var3_37.ordinal();
        n4 = nArray[n4];
        int n7 = var3_37.ordinal();
        int n8 = nArray[n7];
        n7 = 0;
        float f6 = 0.0f;
        var3_37 = null;
        switch (n8) {
            default: {
                return;
            }
            case 18: {
                f5 = this.b0;
                f6 = this.c0;
                int n10 = (int)f6;
                object.getClass();
                v50$a v50$a = v50$a.CENTER;
                boolean bl4 = false;
                v50$a v50$a2 = v50$a;
                ((Y50)object).A(v50$a, (Y50)var5_56, v50$a, n10, 0);
                ((Y50)object).F = f5;
                return;
            }
            case 17: {
                v50$a v50$a = v50$a.BASELINE;
                int n14 = this.v;
                int n15 = this.w;
                v50$a v50$a3 = v50$a;
                ((Y50)object).A(v50$a, (Y50)var5_56, v50$a, n14, n15);
                return;
            }
            case 16: {
                v50$a v50$a = v50$a.BASELINE;
                v50$a v50$a4 = v50$a.TOP;
                int n16 = this.v;
                int n17 = this.w;
                ((Y50)object).A(v50$a, (Y50)var5_56, v50$a4, n16, n17);
                return;
            }
            case 15: {
                v50$a v50$a = v50$a.BASELINE;
                v50$a v50$a5 = v50$a.BOTTOM;
                int n18 = this.v;
                int n19 = this.w;
                ((Y50)object).A(v50$a, (Y50)var5_56, v50$a5, n18, n19);
                return;
            }
            case 14: {
                v50$a v50$a = v50$a.BOTTOM;
                v50$a v50$a6 = v50$a.BASELINE;
                int n20 = this.o;
                int n21 = this.u;
                ((Y50)object).A(v50$a, (Y50)var5_56, v50$a6, n20, n21);
                return;
            }
            case 13: {
                v50$a v50$a = v50$a.BOTTOM;
                object = ((Y50)object).n(v50$a);
                v50_0 v50_02 = var5_56.n(v50$a);
                int n22 = this.o;
                int n24 = this.u;
                ((v50_0)object).b(v50_02, n22, n24, false);
                return;
            }
            case 12: {
                v50$a v50$a = v50$a.BOTTOM;
                object = ((Y50)object).n(v50$a);
                v50$a v50$a7 = v50$a.TOP;
                v50_0 v50_03 = var5_56.n(v50$a7);
                int n25 = this.o;
                int n26 = this.u;
                ((v50_0)object).b(v50_03, n25, n26, false);
                return;
            }
            case 11: {
                v50$a v50$a = v50$a.TOP;
                v50$a v50$a8 = v50$a.BASELINE;
                int n27 = this.n;
                int n28 = this.t;
                ((Y50)object).A(v50$a, (Y50)var5_56, v50$a8, n27, n28);
                return;
            }
            case 10: {
                v50$a v50$a = v50$a.TOP;
                object = ((Y50)object).n(v50$a);
                v50$a v50$a9 = v50$a.BOTTOM;
                v50_0 v50_04 = var5_56.n(v50$a9);
                int n29 = this.n;
                int n30 = this.t;
                ((v50_0)object).b(v50_04, n29, n30, false);
                return;
            }
            case 9: {
                v50$a v50$a = v50$a.TOP;
                object = ((Y50)object).n(v50$a);
                v50_0 v50_05 = var5_56.n(v50$a);
                int n32 = this.n;
                int n34 = this.t;
                ((v50_0)object).b(v50_05, n32, n34, false);
                return;
            }
            case 8: {
                v50$a v50$a = v50$a.RIGHT;
                object = ((Y50)object).n(v50$a);
                v50_0 v50_06 = var5_56.n(v50$a);
                int n35 = this.m;
                int n36 = this.s;
                ((v50_0)object).b(v50_06, n35, n36, false);
                return;
            }
            case 7: {
                v50$a v50$a = v50$a.RIGHT;
                object = ((Y50)object).n(v50$a);
                v50$a v50$a10 = v50$a.LEFT;
                v50_0 v50_07 = var5_56.n(v50$a10);
                int n37 = this.m;
                int n38 = this.s;
                ((v50_0)object).b(v50_07, n37, n38, false);
                return;
            }
            case 6: {
                v50$a v50$a = v50$a.LEFT;
                object = ((Y50)object).n(v50$a);
                v50$a v50$a11 = v50$a.RIGHT;
                v50_0 v50_08 = var5_56.n(v50$a11);
                int n39 = this.l;
                int n41 = this.r;
                ((v50_0)object).b(v50_08, n39, n41, false);
                return;
            }
            case 5: {
                v50$a v50$a = v50$a.LEFT;
                object = ((Y50)object).n(v50$a);
                v50_0 v50_09 = var5_56.n(v50$a);
                int n42 = this.l;
                int n43 = this.r;
                ((v50_0)object).b(v50_09, n42, n43, false);
                return;
            }
            case 4: {
                v50$a v50$a = v50$a.RIGHT;
                object = ((Y50)object).n(v50$a);
                v50_0 v50_010 = var5_56.n(v50$a);
                int n44 = this.k;
                int n45 = this.q;
                ((v50_0)object).b(v50_010, n44, n45, false);
                return;
            }
            case 3: {
                v50$a v50$a = v50$a.RIGHT;
                object = ((Y50)object).n(v50$a);
                v50$a v50$a12 = v50$a.LEFT;
                v50_0 v50_011 = var5_56.n(v50$a12);
                int n46 = this.k;
                int n47 = this.q;
                ((v50_0)object).b(v50_011, n46, n47, false);
                return;
            }
            case 2: {
                v50$a v50$a = v50$a.LEFT;
                object = ((Y50)object).n(v50$a);
                v50$a v50$a13 = v50$a.RIGHT;
                v50_0 v50_012 = var5_56.n(v50$a13);
                int n48 = this.j;
                int n49 = this.p;
                ((v50_0)object).b(v50_012, n48, n49, false);
                return;
            }
            case 1: 
        }
        v50$a v50$a = v50$a.LEFT;
        object = ((Y50)object).n(v50$a);
        v50_0 v50_013 = var5_56.n(v50$a);
        int n50 = this.j;
        int n51 = this.p;
        ((v50_0)object).b(v50_013, n50, n51, false);
    }

    public final void e(Object object) {
        Fb3$b fb3$b;
        this.d0 = fb3$b = Fb3$b.BOTTOM_TO_BOTTOM;
        this.V = object;
    }

    public final void f() {
        Fb3$b fb3$b = this.d0;
        if (fb3$b != null) {
            int[] nArray = G50$a.a;
            int n3 = fb3$b.ordinal();
            n3 = nArray[n3];
            switch (n3) {
                default: {
                    break;
                }
                case 18: {
                    this.a0 = null;
                    break;
                }
                case 17: {
                    this.X = null;
                    break;
                }
                case 12: 
                case 13: 
                case 14: {
                    this.U = null;
                    this.V = null;
                    this.W = null;
                    this.o = 0;
                    this.u = 0;
                    break;
                }
                case 9: 
                case 10: 
                case 11: {
                    this.R = null;
                    this.S = null;
                    this.T = null;
                    this.n = 0;
                    this.t = 0;
                    break;
                }
                case 7: 
                case 8: {
                    this.P = null;
                    this.Q = null;
                    this.m = 0;
                    this.s = 0;
                    break;
                }
                case 5: 
                case 6: {
                    this.N = null;
                    this.O = null;
                    this.l = 0;
                    this.r = 0;
                    break;
                }
                case 3: 
                case 4: {
                    this.L = null;
                    this.M = null;
                    this.k = 0;
                    this.q = 0;
                    break;
                }
                case 1: 
                case 2: {
                    this.J = null;
                    this.K = null;
                    this.j = 0;
                    this.p = 0;
                    break;
                }
            }
        } else {
            float f5;
            this.J = null;
            this.K = null;
            this.j = 0;
            this.L = null;
            this.M = null;
            this.k = 0;
            this.N = null;
            this.O = null;
            this.l = 0;
            this.P = null;
            this.Q = null;
            this.m = 0;
            this.R = null;
            this.S = null;
            this.n = 0;
            this.U = null;
            this.V = null;
            this.o = 0;
            this.X = null;
            this.a0 = null;
            int n4 = 0x3F000000;
            this.h = f5 = 0.5f;
            this.i = f5;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
        }
    }

    public final void g() {
        Object object = this.N;
        if (object != null) {
            object = Fb3$b.START_TO_START;
            this.d0 = object;
        } else {
            object = Fb3$b.START_TO_END;
            this.d0 = object;
        }
        this.f();
        object = this.P;
        if (object != null) {
            object = Fb3$b.END_TO_START;
            this.d0 = object;
        } else {
            object = Fb3$b.END_TO_END;
            this.d0 = object;
        }
        this.f();
        object = this.J;
        if (object != null) {
            object = Fb3$b.LEFT_TO_LEFT;
            this.d0 = object;
        } else {
            object = Fb3$b.LEFT_TO_RIGHT;
            this.d0 = object;
        }
        this.f();
        object = this.L;
        if (object != null) {
            object = Fb3$b.RIGHT_TO_LEFT;
            this.d0 = object;
        } else {
            object = Fb3$b.RIGHT_TO_RIGHT;
            this.d0 = object;
        }
        this.f();
    }

    public final Object getKey() {
        return this.a;
    }

    public final void h() {
        Object object = this.R;
        if (object != null) {
            object = Fb3$b.TOP_TO_TOP;
            this.d0 = object;
        } else {
            object = Fb3$b.TOP_TO_BOTTOM;
            this.d0 = object;
        }
        this.f();
        object = Fb3$b.BASELINE_TO_BASELINE;
        this.d0 = object;
        this.f();
        object = this.U;
        if (object != null) {
            object = Fb3$b.BOTTOM_TO_TOP;
            this.d0 = object;
        } else {
            object = Fb3$b.BOTTOM_TO_BOTTOM;
            this.d0 = object;
        }
        this.f();
    }

    public final void i(Object object) {
        Fb3$b fb3$b;
        this.d0 = fb3$b = Fb3$b.END_TO_END;
        this.Q = object;
    }

    public final Object j(Object object) {
        if (object == null) {
            return null;
        }
        boolean bl2 = object instanceof G50;
        if (!bl2) {
            HashMap hashMap = this.b.c;
            object = (qg2_0)hashMap.get(object);
        }
        return object;
    }

    public G50 k(int n3) {
        Fb3$b fb3$b = this.d0;
        if (fb3$b != null) {
            int[] nArray = G50$a.a;
            int n4 = fb3$b.ordinal();
            n4 = nArray[n4];
            switch (n4) {
                default: {
                    break;
                }
                case 18: {
                    float f5;
                    this.c0 = f5 = (float)n3;
                    break;
                }
                case 15: 
                case 16: 
                case 17: {
                    this.v = n3;
                    break;
                }
                case 12: 
                case 13: 
                case 14: {
                    this.o = n3;
                    break;
                }
                case 9: 
                case 10: 
                case 11: {
                    this.n = n3;
                    break;
                }
                case 7: 
                case 8: {
                    this.m = n3;
                    break;
                }
                case 5: 
                case 6: {
                    this.l = n3;
                    break;
                }
                case 3: 
                case 4: {
                    this.k = n3;
                    break;
                }
                case 1: 
                case 2: {
                    this.j = n3;
                    break;
                }
            }
        } else {
            this.j = n3;
            this.k = n3;
            this.l = n3;
            this.m = n3;
            this.n = n3;
            this.o = n3;
        }
        return this;
    }

    public G50 l(Float f5) {
        int n3 = this.b.c(f5);
        return this.k(n3);
    }

    public final void m(int n3) {
        Fb3$b fb3$b = this.d0;
        if (fb3$b != null) {
            int[] nArray = G50$a.a;
            int n4 = fb3$b.ordinal();
            n4 = nArray[n4];
            switch (n4) {
                default: {
                    break;
                }
                case 15: 
                case 16: 
                case 17: {
                    this.w = n3;
                    break;
                }
                case 12: 
                case 13: 
                case 14: {
                    this.u = n3;
                    break;
                }
                case 9: 
                case 10: 
                case 11: {
                    this.t = n3;
                    break;
                }
                case 7: 
                case 8: {
                    this.s = n3;
                    break;
                }
                case 5: 
                case 6: {
                    this.r = n3;
                    break;
                }
                case 3: 
                case 4: {
                    this.q = n3;
                    break;
                }
                case 1: 
                case 2: {
                    this.p = n3;
                    break;
                }
            }
        } else {
            this.p = n3;
            this.q = n3;
            this.r = n3;
            this.s = n3;
            this.t = n3;
            this.u = n3;
        }
    }

    public final void n(Float f5) {
        int n3 = this.b.c(f5);
        this.m(n3);
    }

    public final void o(Object object) {
        Fb3$b fb3$b;
        this.d0 = fb3$b = Fb3$b.START_TO_START;
        this.N = object;
    }

    public final void p(Object object) {
        Fb3$b fb3$b;
        this.d0 = fb3$b = Fb3$b.TOP_TO_TOP;
        this.R = object;
    }
}

