/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.graphics.Bitmap$Config
 *  android.graphics.ColorSpace
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.i;
import coil.memory.MemoryCache$Key;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlinx.coroutines.c;

/*
 * Renamed from pe1$a
 */
public final class pe1$a_0 {
    public final c A;
    public final Hm2$a B;
    public final MemoryCache$Key C;
    public final Integer D;
    public final Drawable E;
    public final Integer F;
    public final Drawable G;
    public final Integer H;
    public final Drawable I;
    public i J;
    public L63 K;
    public WS2 L;
    public i M;
    public L63 N;
    public WS2 O;
    public final Context a;
    public Om0 b;
    public Object c;
    public ji3_0 d;
    public pe1$b e;
    public final MemoryCache$Key f;
    public final String g;
    public final Bitmap.Config h;
    public final ColorSpace i;
    public yx2_0 j;
    public final Pair k;
    public final dj0$a l;
    public final List m;
    public pr3$a n;
    public final m41$a_0 o;
    public final LinkedHashMap p;
    public final boolean q;
    public final Boolean r;
    public final Boolean s;
    public final boolean t;
    public final fj_1 u;
    public final fj_1 v;
    public final fj_1 w;
    public final c x;
    public final c y;
    public final c z;

    public pe1$a_0(Context object) {
        this.a = object;
        object = j.a;
        this.b = object;
        object = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            this.i = null;
        }
        this.j = null;
        this.k = null;
        this.l = null;
        mz0_2 mz0_22 = mz0_2.a;
        this.m = mz0_22;
        this.n = null;
        this.o = null;
        this.p = null;
        n3 = 1;
        this.q = n3;
        this.r = null;
        this.s = null;
        this.t = n3;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
    }

    public pe1$a_0(pe1_0 object, Context object2) {
        Hm2$a hm2$a;
        this.a = object2;
        Object object3 = object.M;
        this.b = object3;
        this.c = object3 = object.b;
        this.d = object3 = object.c;
        this.e = object3 = object.d;
        this.f = object3 = object.e;
        this.g = object3 = object.f;
        object3 = object.L;
        Object object4 = ((Yn0)object3).j;
        this.h = object4;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            object4 = object.h;
            this.i = object4;
        }
        object4 = ((Yn0)object3).i;
        this.j = object4;
        object4 = object.j;
        this.k = object4;
        object4 = object.k;
        this.l = object4;
        object4 = object.l;
        this.m = object4;
        object4 = ((Yn0)object3).h;
        this.n = object4;
        object4 = object.n.e();
        this.o = object4;
        object4 = fh1_2.q(object.o.a);
        this.p = object4;
        n3 = (int)(object.p ? 1 : 0);
        this.q = n3;
        object4 = ((Yn0)object3).k;
        this.r = object4;
        object4 = ((Yn0)object3).l;
        this.s = object4;
        n3 = (int)(object.s ? 1 : 0);
        this.t = n3;
        object4 = ((Yn0)object3).m;
        this.u = object4;
        object4 = ((Yn0)object3).n;
        this.v = object4;
        object4 = ((Yn0)object3).o;
        this.w = object4;
        object4 = ((Yn0)object3).d;
        this.x = object4;
        object4 = ((Yn0)object3).e;
        this.y = object4;
        object4 = ((Yn0)object3).f;
        this.z = object4;
        object4 = ((Yn0)object3).g;
        this.A = object4;
        object4 = object.D;
        object4.getClass();
        this.B = hm2$a = new Hm2$a((hm2_0)object4);
        this.C = object4 = object.E;
        this.D = object4 = object.F;
        object4 = object.G;
        this.E = object4;
        this.F = object4 = object.H;
        object4 = object.I;
        this.G = object4;
        this.H = object4 = object.J;
        object4 = object.K;
        this.I = object4;
        this.J = object4 = ((Yn0)object3).a;
        this.K = object4 = ((Yn0)object3).b;
        object3 = ((Yn0)object3).c;
        this.L = object3;
        object3 = object.a;
        if (object3 == object2) {
            object2 = object.A;
            this.M = object2;
            object2 = object.B;
            this.N = object2;
            object = object.C;
            this.O = object;
        } else {
            object = null;
            this.M = null;
            this.N = null;
            this.O = null;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final pe1_0 a() {
        block50: {
            block47: {
                block49: {
                    block48: {
                        block43: {
                            var1_1 = this;
                            var2_2 /* !! */  = this.c;
                            if (var2_2 /* !! */  == null) {
                                var2_2 /* !! */  = dl_2.b;
                            }
                            var3_3 /* !! */  = var2_2 /* !! */ ;
                            var4_4 = var1_1.d;
                            var5_5 = var1_1.e;
                            var2_2 /* !! */  = var1_1.h;
                            if (var2_2 /* !! */  == null) {
                                var2_2 /* !! */  = var1_1.b.g;
                            }
                            var6_6 = var2_2 /* !! */ ;
                            var7_7 /* !! */  = var1_1.i;
                            var2_2 /* !! */  = var1_1.j;
                            if (var2_2 /* !! */  == null) {
                                var2_2 /* !! */  = var1_1.b.f;
                            }
                            var8_8 = var2_2 /* !! */ ;
                            var2_2 /* !! */  = var1_1.n;
                            if (var2_2 /* !! */  == null) {
                                var2_2 /* !! */  = var1_1.b.e;
                            }
                            var9_9 = var2_2 /* !! */ ;
                            var2_2 /* !! */  = var1_1.o;
                            var10_10 = null;
                            if (var2_2 /* !! */  != null) {
                                var2_2 /* !! */  = var2_2 /* !! */ .e();
                            } else {
                                var11_11 /* !! */  = false;
                                var2_2 /* !! */  = null;
                            }
                            if (var2_2 /* !! */  == null) {
                                var2_2 /* !! */  = m.c;
lbl30:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var13_12 = m.a;
                            ** while (true)
                            var12_13 = var2_2 /* !! */ ;
                            var2_2 /* !! */  = var1_1.p;
                            if (var2_2 /* !! */  != null) {
                                var2_2 /* !! */  = e.b((Map)var2_2 /* !! */ );
                                var13_12 = new zi3((Map)var2_2 /* !! */ );
                            } else {
                                var14_14 = false;
                                var13_12 = null;
                            }
                            if (var13_12 == null) {
                                var2_2 /* !! */  = zi3.b;
                                var15_15 /* !! */  = var2_2 /* !! */ ;
                            } else {
                                var15_15 /* !! */  = var13_12;
                            }
                            var2_2 /* !! */  = var1_1.r;
                            if (var2_2 /* !! */  != null) {
                                var11_11 /* !! */  = var2_2 /* !! */ .booleanValue();
lbl50:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var2_2 /* !! */  = var1_1.b;
                            var11_11 /* !! */  = var2_2 /* !! */ .h;
                            ** while (true)
                            var16_16 = var11_11 /* !! */ ;
                            var2_2 /* !! */  = var1_1.s;
                            if (var2_2 /* !! */  != null) {
                                var11_11 /* !! */  = var2_2 /* !! */ .booleanValue();
lbl59:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var2_2 /* !! */  = var1_1.b;
                            var11_11 /* !! */  = var2_2 /* !! */ .i;
                            ** while (true)
                            var17_17 = var11_11 /* !! */ ;
                            var2_2 /* !! */  = var1_1.u;
                            if (var2_2 /* !! */  == null) {
                                var2_2 /* !! */  = var1_1.b.m;
                            }
                            var18_18 = var2_2 /* !! */ ;
                            var2_2 /* !! */  = var1_1.v;
                            if (var2_2 /* !! */  == null) {
                                var2_2 /* !! */  = var1_1.b.n;
                            }
                            var19_19 = var2_2 /* !! */ ;
                            var2_2 /* !! */  = var1_1.w;
                            if (var2_2 /* !! */  == null) {
                                var2_2 /* !! */  = var1_1.b.o;
                            }
                            var20_20 = var2_2 /* !! */ ;
                            var2_2 /* !! */  = var1_1.x;
                            if (var2_2 /* !! */  == null) {
                                var2_2 /* !! */  = var1_1.b.a;
                            }
                            var21_21 = var2_2 /* !! */ ;
                            var2_2 /* !! */  = var1_1.y;
                            if (var2_2 /* !! */  == null) {
                                var2_2 /* !! */  = var1_1.b.b;
                            }
                            var22_22 = var2_2 /* !! */ ;
                            var2_2 /* !! */  = var1_1.z;
                            if (var2_2 /* !! */  == null) {
                                var2_2 /* !! */  = var1_1.b.c;
                            }
                            var23_23 = var2_2 /* !! */ ;
                            var2_2 /* !! */  = var1_1.A;
                            if (var2_2 /* !! */  == null) {
                                var2_2 /* !! */  = var1_1.b.d;
                            }
                            var24_24 = var2_2 /* !! */ ;
                            var2_2 /* !! */  = var1_1.J;
                            var13_12 = var1_1.a;
                            if (var2_2 /* !! */  != null || (var2_2 /* !! */  = var1_1.M) != null) break block43;
                            var2_2 /* !! */  = var1_1.d;
                            var25_25 = var2_2 /* !! */  instanceof nd3_0;
                            var2_2 /* !! */  = var25_25 != false ? ((nd3_0)var2_2 /* !! */ ).getView().getContext() : var13_12;
                            while (true) {
                                block46: {
                                    block45: {
                                        block44: {
                                            if (!(var25_25 = var2_2 /* !! */  instanceof mu1_1)) break block44;
                                            var2_2 /* !! */  = ((mu1_1)var2_2 /* !! */ ).getLifecycle();
                                            break block45;
                                        }
                                        var25_25 = var2_2 /* !! */  instanceof ContextWrapper;
                                        if (var25_25) break block46;
                                        var11_11 /* !! */  = false;
                                        var2_2 /* !! */  = null;
                                    }
                                    if (var2_2 /* !! */  == null) {
                                        var2_2 /* !! */  = b01_0.b;
                                    }
                                    break;
                                }
                                var2_2 /* !! */  = ((ContextWrapper)var2_2 /* !! */ ).getBaseContext();
                            }
                        }
                        var26_26 = var2_2 /* !! */ ;
                        var2_2 /* !! */  = var1_1.K;
                        var25_25 = true;
                        if (var2_2 /* !! */  != null || (var2_2 /* !! */  = var1_1.N) != null) break block47;
                        var2_2 /* !! */  = var1_1.d;
                        var27_27 = var2_2 /* !! */  instanceof nd3_0;
                        if (!var27_27) break block48;
                        var14_14 = (var2_2 /* !! */  = ((nd3_0)var2_2 /* !! */ ).getView()) instanceof ImageView;
                        if (!var14_14) ** GOTO lbl-1000
                        var13_12 = var2_2 /* !! */ ;
                        var13_12 = ((ImageView)var2_2 /* !! */ ).getScaleType();
                        if (var13_12 == (var28_28 /* !! */  = ImageView.ScaleType.CENTER) || var13_12 == (var28_28 /* !! */  = ImageView.ScaleType.MATRIX)) {
                            var2_2 /* !! */  = B63.c;
                            var13_12 = new WE2((B63)var2_2 /* !! */ );
                        } else lbl-1000:
                        // 2 sources

                        {
                            var13_12 = new ye2_0((View)var2_2 /* !! */ , var25_25);
                        }
                        break block49;
                    }
                    var2_2 /* !! */  = new wr0_1(var13_12);
                    var13_12 = var2_2 /* !! */ ;
                }
                var29_29 = var13_12;
                break block50;
            }
            var29_29 = var2_2 /* !! */ ;
        }
        var2_2 /* !! */  = var1_1.L;
        if (var2_2 /* !! */  == null && (var2_2 /* !! */  = var1_1.O) == null) {
            var2_2 /* !! */  = var1_1.K;
            var14_14 = var2_2 /* !! */  instanceof id3_1;
            if (var14_14) {
                var2_2 /* !! */  = (id3_1)var2_2 /* !! */ ;
            } else {
                var11_11 /* !! */  = false;
                var2_2 /* !! */  = null;
            }
            if (var2_2 /* !! */  == null || (var2_2 /* !! */  = var2_2 /* !! */ .getView()) == null) {
                var2_2 /* !! */  = var1_1.d;
                var14_14 = var2_2 /* !! */  instanceof nd3_0;
                if (var14_14) {
                    var2_2 /* !! */  = (nd3_0)var2_2 /* !! */ ;
                } else {
                    var11_11 /* !! */  = false;
                    var2_2 /* !! */  = null;
                }
                if (var2_2 /* !! */  != null) {
                    var2_2 /* !! */  = var2_2 /* !! */ .getView();
                } else {
                    var11_11 /* !! */  = false;
                    var2_2 /* !! */  = null;
                }
            }
            if (var14_14 = var2_2 /* !! */  instanceof ImageView) {
                var2_2 /* !! */  = (ImageView)var2_2 /* !! */ ;
                var13_12 = m.a;
                if ((var2_2 /* !! */  = var2_2 /* !! */ .getScaleType()) == null) {
                    var11_11 /* !! */  = -1 != 0;
                } else {
                    var13_12 = (Context)m$a.$EnumSwitchMapping$1;
                    var11_11 /* !! */  = var2_2 /* !! */ .ordinal();
                    var11_11 /* !! */  = (boolean)var13_12[var11_11 /* !! */ ];
                }
                var2_2 /* !! */  = var11_11 /* !! */  != var25_25 && var11_11 /* !! */  != (var14_14 = 2 != 0) && var11_11 /* !! */  != (var14_14 = 3 != 0) && var11_11 /* !! */  != (var14_14 = 4 != 0) ? WS2.FILL : WS2.FIT;
            } else {
                var2_2 /* !! */  = WS2.FIT;
            }
        }
        var30_30 = var2_2 /* !! */ ;
        var2_2 /* !! */  = var1_1.B;
        if (var2_2 /* !! */  != null) {
            var2_2 /* !! */  = e.b(var2_2 /* !! */ .a);
            var10_10 = new hm2_0((Map)var2_2 /* !! */ );
        }
        if (var10_10 == null) {
            var2_2 /* !! */  = hm2_0.b;
            var31_31 /* !! */  = var2_2 /* !! */ ;
        } else {
            var31_31 /* !! */  = var10_10;
        }
        var33_33 = var32_32;
        var2_2 /* !! */  = var1_1.J;
        var10_10 = var1_1.K;
        var13_12 = var1_1.L;
        var34_34 = var1_1.n;
        var28_28 /* !! */  = var1_1.j;
        var35_35 /* !! */  = var1_1.v;
        var36_36 /* !! */  = var1_1.w;
        var37_37 = var1_1.x;
        var38_38 = var9_9;
        var9_9 = var1_1.y;
        var39_39 = var8_8;
        var8_8 = var1_1.z;
        var40_40 = var7_7 /* !! */ ;
        var7_7 /* !! */  = var1_1.A;
        var41_41 = var6_6;
        var6_6 = var1_1.h;
        var42_42 = var5_5;
        var5_5 = var1_1.r;
        var43_43 = var4_4;
        var4_4 = var1_1.s;
        var44_44 = var3_3 /* !! */ ;
        var3_3 /* !! */  = var1_1.u;
        var32_32 = new Yn0((i)var2_2 /* !! */ , (L63)var10_10, (WS2)var13_12, (c)var37_37, (c)var9_9, (c)var8_8, (c)var7_7 /* !! */ , (pr3$a)var34_34, (yx2_0)var28_28 /* !! */ , (Bitmap.Config)var6_6, (Boolean)var5_5, (Boolean)var4_4, (fj_1)var3_3 /* !! */ , var35_35 /* !! */ , var36_36 /* !! */ );
        var32_32 = var1_1.b;
        var10_10 = var2_2 /* !! */ ;
        var34_34 = var1_1.f;
        var28_28 /* !! */  = var1_1.g;
        var35_35 /* !! */  = var1_1.k;
        var36_36 /* !! */  = var1_1.l;
        var37_37 = var1_1.m;
        var45_45 = var1_1.q;
        var14_14 = var1_1.t;
        var46_46 = var1_1.C;
        var47_47 = var1_1.D;
        var48_48 = var1_1.E;
        var49_49 = var1_1.F;
        var50_50 = var1_1.G;
        var51_51 = var1_1.H;
        var52_52 = var1_1.I;
        var13_12 = var1_1.a;
        var3_3 /* !! */  = var44_44;
        var4_4 = var43_43;
        var5_5 = var42_42;
        var6_6 = var41_41;
        var7_7 /* !! */  = var40_40;
        var8_8 = var39_39;
        var9_9 = var38_38;
        var2_2 /* !! */  = new pe1_0(var13_12, var44_44, var43_43, var42_42, (MemoryCache$Key)var34_34, (String)var28_28 /* !! */ , (Bitmap.Config)var41_41, var40_40, (yx2_0)var39_39, (Pair)var35_35 /* !! */ , (dj0$a)var36_36 /* !! */ , (List)var37_37, (pr3$a)var38_38, (m41_0)var12_13, (zi3)var15_15 /* !! */ , var45_45, var16_16, var17_17, var14_14, (fj_1)var18_18, (fj_1)var19_19, (fj_1)var20_20, (c)var21_21, (c)var22_22, (c)var23_23, (c)var24_24, (i)var26_26, (L63)var29_29, (WS2)var30_30, var31_31 /* !! */ , var46_46, var47_47, var48_48, var49_49, var50_50, var51_51, var52_52, var33_33, (Om0)var32_32);
        return var2_2 /* !! */ ;
    }

    public final void b() {
        ye0$a ye0$a = new ye0$a(100, 2);
        this.n = ye0$a;
    }

    public final void c() {
        this.M = null;
        this.N = null;
        this.O = null;
    }

    public final void d(B63 b63) {
        WE2 wE2 = new WE2(b63);
        this.K = wE2;
        this.c();
    }
}

