/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.hardware.display.DisplayManager
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 *  android.view.Display
 *  android.view.Display$Mode
 *  android.view.WindowManager
 *  android.view.accessibility.CaptioningManager
 */
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class zn0$d$a
extends Fp3$b {
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final SparseArray R;
    public final SparseBooleanArray S;

    public zn0$d$a() {
        SparseArray sparseArray;
        this.R = sparseArray = new SparseArray();
        this.S = sparseArray;
        this.l();
    }

    public zn0$d$a(Context context) {
        this.n(context);
        this.o(context);
        this.R = context;
        super();
        this.S = context;
        this.l();
    }

    public zn0$d$a(zn0$d zn0$d) {
        Object object;
        int n3;
        boolean bl2;
        this.c(zn0$d);
        this.C = bl2 = zn0$d.D;
        this.D = bl2 = zn0$d.E;
        this.E = bl2 = zn0$d.F;
        this.F = bl2 = zn0$d.G;
        this.G = bl2 = zn0$d.H;
        this.H = bl2 = zn0$d.I;
        this.I = bl2 = zn0$d.J;
        this.J = bl2 = zn0$d.K;
        this.K = bl2 = zn0$d.L;
        this.L = bl2 = zn0$d.M;
        this.M = bl2 = zn0$d.N;
        this.N = bl2 = zn0$d.O;
        this.O = bl2 = zn0$d.P;
        this.P = bl2 = zn0$d.Q;
        this.Q = bl2 = zn0$d.R;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = 0; i3 < (n3 = (object = zn0$d.S).size()); ++i3) {
            n3 = object.keyAt(i3);
            object = (Map)object.valueAt(i3);
            HashMap hashMap = new HashMap(object);
            sparseArray.put(n3, hashMap);
        }
        this.R = sparseArray;
        zn0$d = zn0$d.T.clone();
        this.S = zn0$d;
    }

    public final Fp3 a() {
        zn0$d zn0$d = new zn0$d(this);
        return zn0$d;
    }

    public final Fp3$b b(int n3) {
        super.b(n3);
        return this;
    }

    public final Fp3$b d() {
        this.v = -3;
        return this;
    }

    public final Fp3$b e(Ep3 ep3) {
        super.e(ep3);
        return this;
    }

    public final Fp3$b f() {
        super.f();
        return this;
    }

    public final Fp3$b g(String[] stringArray) {
        super.g(stringArray);
        return this;
    }

    public final Fp3$b h() {
        this.u = 0;
        return this;
    }

    public final Fp3$b i(int n3) {
        super.i(n3);
        return this;
    }

    public final Fp3$b j(int n3, int n4) {
        super.j(n3, n4);
        return this;
    }

    public final zn0$d k() {
        zn0$d zn0$d = new zn0$d(this);
        return zn0$d;
    }

    public final void l() {
        boolean bl2;
        this.C = bl2 = true;
        this.D = false;
        this.E = bl2;
        this.F = false;
        this.G = bl2;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = bl2;
        this.M = bl2;
        this.N = bl2;
        this.O = false;
        this.P = bl2;
        this.Q = false;
    }

    public final Fp3$b m() {
        this.a = 1279;
        this.b = 719;
        return this;
    }

    public final void n(Context object) {
        Object object2;
        int n3 = gz3.a;
        int n4 = 23;
        if ((n3 >= n4 || (object2 = Looper.myLooper()) != null) && (object = (CaptioningManager)object.getSystemService((String)(object2 = "captioning"))) != null && (n3 = (int)(object.isEnabled() ? 1 : 0)) != 0) {
            this.u = n3 = 1088;
            if ((object = object.getLocale()) != null) {
                this.t = object = ImmutableList.of(((Locale)object).toLanguageTag());
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void o(Context var1_1) {
        block19: {
            var2_2 = gz3.a;
            var3_3 = (DisplayManager)var1_1.getSystemService("display");
            var4_4 = 0;
            var5_5 = null;
            if (var3_3 != null) {
                var3_3 = var3_3.getDisplay(0);
            } else {
                var2_2 = 0;
                var3_3 = null;
            }
            if (var3_3 == null) {
                var3_3 = (WindowManager)var1_1.getSystemService("window");
                var3_3.getClass();
                var3_3 = var3_3.getDefaultDisplay();
            }
            var6_6 = var3_3.getDisplayId();
            var7_7 = gz3.a;
            if (var6_6 != 0 || (var6_6 = (int)gz3.G(var1_1)) == 0) ** GOTO lbl-1000
            var6_6 = 28;
            var8_8 = var7_7 < var6_6 ? gz3.w("sys.display-size") : gz3.w("vendor.display-size");
            var9_9 = TextUtils.isEmpty((CharSequence)var8_8);
            if (var9_9 == 0) {
                block18: {
                    try {
                        var10_10 /* !! */  = var8_8.trim();
                        var11_11 /* !! */  = "x";
                        var12_12 = -1;
                    }
                    catch (NumberFormatException v0) {}
                    var10_10 /* !! */  = var10_10 /* !! */ .split((String)var11_11 /* !! */ , var12_12);
                    var13_13 = var10_10 /* !! */ .length;
                    var12_12 = 2;
                    if (var13_13 != var12_12) break block18;
                    var5_5 = var10_10 /* !! */ [0];
                    var4_4 = Integer.parseInt((String)var5_5);
                    var13_13 = 1;
                    var10_10 /* !! */  = var10_10 /* !! */ [var13_13];
                    var9_9 = Integer.parseInt((String)var10_10 /* !! */ );
                    if (var4_4 <= 0 || var9_9 <= 0) break block18;
                    var11_11 /* !! */  = new Point(var4_4, var9_9);
                    break block19;
                }
                var10_10 /* !! */  = "Invalid display size: ";
                var5_5 = new StringBuilder((String)var10_10 /* !! */ );
                var5_5.append(var8_8);
                var5_5 = var5_5.toString();
                Cx.c((String)var5_5);
            }
            if ((var4_4 = (var5_5 = "Sony").equals(var8_8 = gz3.c)) != 0 && (var4_4 = (var5_5 = gz3.d).startsWith(var8_8 = "BRAVIA")) != 0 && (var14_14 = (int)(var1_1 = var1_1.getPackageManager()).hasSystemFeature((String)(var5_5 = "com.sony.dtv.hardware.panel.qfhd"))) != 0) {
                var14_14 = 3840;
                var2_2 = 2160;
                var11_11 /* !! */  = new Point(var14_14, var2_2);
            } else lbl-1000:
            // 2 sources

            {
                var11_11 /* !! */  = new Point();
                var14_14 = 23;
                if (var7_7 >= var14_14) {
                    var1_1 = Ty3.a((Display)var3_3);
                    var11_11 /* !! */ .x = var2_2 = Uy3.a((Display.Mode)var1_1);
                    var11_11 /* !! */ .y = var14_14 = Vy3.a((Display.Mode)var1_1);
                } else {
                    var3_3.getRealSize(var11_11 /* !! */ );
                }
            }
        }
        var14_14 = var11_11 /* !! */ .x;
        var2_2 = var11_11 /* !! */ .y;
        this.j(var14_14, var2_2);
    }
}

