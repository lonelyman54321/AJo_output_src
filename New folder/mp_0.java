/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from Mp
 */
public class mp_0
implements Eu1$a {
    public k93_0 a = null;
    public float b = 0.0f;
    public final ArrayList c;
    public final Mp$a d;
    public boolean e;

    public mp_0() {
        ArrayList arrayList;
        this.c = arrayList = new ArrayList();
        this.e = false;
    }

    public mp_0(SI sI) {
        Object object = new ArrayList();
        this.c = object;
        this.e = false;
        this.d = object = new Gp(this, sI);
    }

    public k93_0 a(boolean[] blArray) {
        return this.f(blArray, null);
    }

    public final void b(Eu1 object, int n3) {
        Mp$a mp$a = this.d;
        k93_0 k93_02 = ((Eu1)object).j(n3);
        mp$a.k(k93_02, 1.0f);
        mp$a = this.d;
        object = ((Eu1)object).j(n3);
        mp$a.k((k93_0)object, -1.0f);
    }

    public final void c(k93_0 object, k93_0 k93_02, k93_0 k93_03, int n3) {
        float f5;
        boolean bl2 = false;
        Mp$a mp$a = null;
        if (n3 != 0) {
            if (n3 < 0) {
                n3 *= -1;
                bl2 = true;
            }
            this.b = f5 = (float)n3;
        }
        n3 = 1065353216;
        f5 = 1.0f;
        float f6 = -1.0f;
        if (!bl2) {
            mp$a = this.d;
            mp$a.k((k93_0)object, f6);
            this.d.k(k93_02, f5);
            object = this.d;
            object.k(k93_03, f5);
        } else {
            mp$a = this.d;
            mp$a.k((k93_0)object, f5);
            this.d.k(k93_02, f6);
            object = this.d;
            object.k(k93_03, f6);
        }
    }

    public final void d(k93_0 object, k93_0 k93_02, k93_0 k93_03, int n3) {
        float f5;
        boolean bl2 = false;
        Mp$a mp$a = null;
        if (n3 != 0) {
            if (n3 < 0) {
                n3 *= -1;
                bl2 = true;
            }
            this.b = f5 = (float)n3;
        }
        n3 = 1065353216;
        f5 = 1.0f;
        float f6 = -1.0f;
        if (!bl2) {
            mp$a = this.d;
            mp$a.k((k93_0)object, f6);
            this.d.k(k93_02, f5);
            object = this.d;
            object.k(k93_03, f6);
        } else {
            mp$a = this.d;
            mp$a.k((k93_0)object, f5);
            this.d.k(k93_02, f6);
            object = this.d;
            object.k(k93_03, f5);
        }
    }

    public boolean e() {
        float f5;
        float f6;
        int n3;
        Object object = this.a;
        if (object == null && (n3 = (f6 = (f5 = this.b) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) == 0 && (n3 = (object = this.d).f()) == 0) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        }
        return n3 != 0;
    }

    public final k93_0 f(boolean[] blArray, k93_0 k93_02) {
        Mp$a mp$a = this.d;
        int n3 = mp$a.f();
        k93_0 k93_03 = null;
        float f5 = 0.0f;
        for (int i3 = 0; i3 < n3; ++i3) {
            k93$a k93$a;
            k93$a k93$a2;
            int n4;
            Mp$a mp$a2 = this.d;
            float f6 = mp$a2.h(i3);
            float f7 = f6 - 0.0f;
            Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (object >= 0) continue;
            k93_0 k93_04 = this.d.b(i3);
            if (blArray != null) {
                n4 = k93_04.b;
                if ((n4 = blArray[n4]) != 0) continue;
            }
            if (k93_04 == k93_02 || (k93$a2 = k93_04.i) != (k93$a = k93$a.SLACK) && k93$a2 != (k93$a = k93$a.ERROR) || (n4 = (int)(f6 == f5 ? 0 : (f6 < f5 ? -1 : 1))) >= 0) continue;
            f5 = f6;
            k93_03 = k93_04;
        }
        return k93_03;
    }

    public final void g(k93_0 k93_02) {
        float f5;
        int n3;
        Object object = this.a;
        float f6 = -1.0f;
        if (object != null) {
            Mp$a mp$a = this.d;
            mp$a.k((k93_0)object, f6);
            object = this.a;
            ((k93_0)object).c = n3 = -1;
            f5 = 0.0f;
            object = null;
            this.a = null;
        }
        object = this.d;
        n3 = 1;
        f5 = object.i(k93_02, n3 != 0) * f6;
        this.a = k93_02;
        float f7 = 1.0f;
        float f8 = f5 - f7;
        Object object2 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object2 == false) {
            return;
        }
        this.b = f7 = this.b / f5;
        this.d.j(f5);
    }

    public final void h(Eu1 eu1, k93_0 object, boolean bl2) {
        boolean bl3;
        if (object != null && (bl3 = ((k93_0)object).f)) {
            int n3;
            float f5;
            float f6 = this.d.e((k93_0)object);
            float f7 = this.b;
            this.b = f5 = ((k93_0)object).e * f6 + f7;
            Mp$a mp$a = this.d;
            mp$a.i((k93_0)object, bl2);
            if (bl2) {
                ((k93_0)object).b(this);
            }
            if ((n3 = (object = this.d).f()) == 0) {
                n3 = 1;
                this.e = n3;
                eu1.b = n3;
            }
        }
    }

    public void i(Eu1 eu1, mp_0 object, boolean bl2) {
        int n3;
        float f5;
        Mp$a mp$a = this.d;
        float f6 = mp$a.d((mp_0)object, bl2);
        float f7 = this.b;
        this.b = f5 = ((mp_0)object).b * f6 + f7;
        if (bl2) {
            object = ((mp_0)object).a;
            ((k93_0)object).b(this);
        }
        if ((object = this.a) != null && (n3 = (object = this.d).f()) == 0) {
            n3 = 1;
            this.e = n3;
            eu1.b = n3;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String toString() {
        var1_1 = this.a;
        if (var1_1 == null) {
            var1_1 = "0";
        } else {
            var1_1 = new StringBuilder("");
            var2_2 = this.a;
            var1_1.append(var2_2);
            var1_1 = var1_1.toString();
        }
        var2_2 = " = ";
        var1_1 = Ft2.a((String)var1_1, (String)var2_2);
        var3_3 = this.b;
        var4_4 = 0;
        cfr_temp_0 = var3_3 - 0.0f;
        var5_5 /* !! */  = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
        if (var5_5 /* !! */  != false) {
            var1_1 = Ex0.a((String)var1_1);
            var3_3 = this.b;
            var1_1.append(var3_3);
            var1_1 = var1_1.toString();
            var5_5 /* !! */  = (float)true;
            var3_3 = 1.4E-45f;
        } else {
            var5_5 /* !! */  = (float)false;
            var3_3 = 0.0f;
            var2_2 = null;
        }
        var6_6 = this.d;
        var7_7 = var6_6.f();
        while (var4_4 < var7_7) {
            var8_8 = this.d.b(var4_4);
            if (var8_8 != null && (var11_11 = (cfr_temp_1 = (var10_10 = (var9_9 = this.d).h(var4_4)) - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1)) != false) {
                var8_8 = var8_8.toString();
                var12_12 = -1.0f;
                if (var5_5 /* !! */  == false) {
                    cfr_temp_2 = var10_10 - 0.0f;
                    var5_5 /* !! */  = (float)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1));
                    if (var5_5 /* !! */  < 0) {
                        var2_2 = "- ";
                        var1_1 = Ft2.a((String)var1_1, (String)var2_2);
lbl41:
                        // 2 sources

                        while (true) {
                            var10_10 *= var12_12;
                            break;
                        }
                    }
                } else if (var11_11 > 0) {
                    var2_2 = " + ";
                    var1_1 = Ft2.a((String)var1_1, (String)var2_2);
                } else {
                    var2_2 = " - ";
                    var1_1 = Ft2.a((String)var1_1, (String)var2_2);
                    ** continue;
                }
                if ((var5_5 /* !! */  = (cfr_temp_3 = var10_10 - (var3_3 = 1.0f)) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1)) == false) {
                    var1_1 = Ft2.a((String)var1_1, (String)var8_8);
                } else {
                    var2_2 = new StringBuilder();
                    var2_2.append((String)var1_1);
                    var2_2.append(var10_10);
                    var2_2.append(" ");
                    var2_2.append((String)var8_8);
                    var1_1 = var2_2.toString();
                }
                var5_5 /* !! */  = (float)true;
                var3_3 = 1.4E-45f;
            }
            ++var4_4;
        }
        if (var5_5 /* !! */  == false) {
            var2_2 = "0.0";
            var1_1 = Ft2.a((String)var1_1, (String)var2_2);
        }
        return var1_1;
    }
}

