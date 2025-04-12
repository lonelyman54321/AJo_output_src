/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.PointF
 *  android.graphics.RectF
 *  android.graphics.Typeface
 */
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * Renamed from Pl3
 */
public final class pl3_0
extends kw_1 {
    public final StringBuilder D;
    public final RectF E;
    public final Matrix F;
    public final Pl3$a G;
    public final Pl3$b H;
    public final HashMap I;
    public final pb1_0 J;
    public final ArrayList K;
    public final Kl3 L;
    public final yc1_1 M;
    public final QB1 N;
    public final qm3 O;
    public final WX P;
    public la3_0 Q;
    public final WX R;
    public la3_0 S;
    public final es0_0 T;
    public la3_0 U;
    public final es0_0 V;
    public la3_0 W;
    public final hj1 X;
    public la3_0 Y;
    public la3_0 Z;
    public final hj1 a0;
    public final hj1 b0;
    public final hj1 c0;

    public pl3_0(yc1_1 object, pp1 object2) {
        super((yc1_1)((Object)object), (pp1)object2);
        Object object3;
        this.D = object3 = new StringBuilder(2);
        super();
        this.E = object3;
        super();
        this.F = object3;
        int n3 = 1;
        super(n3);
        Paint.Style style2 = Paint.Style.FILL;
        object3.setStyle(style2);
        this.G = object3;
        super(n3);
        Paint.Style style3 = Paint.Style.STROKE;
        object3.setStyle(style3);
        this.H = object3;
        super();
        this.I = object3;
        super();
        this.J = object3;
        super();
        this.K = object3;
        object3 = qm3.INDEX;
        this.O = object3;
        this.M = object;
        object = ((pp1)object2).b;
        this.N = object;
        object3 = (List)((pp1)object2).q.b;
        super((List)object3);
        this.L = object;
        ((iw_0)object).a(this);
        this.g((iw_0)object);
        object = ((pp1)object2).r;
        if (object != null && (object2 = ((Zj)object).a) != null && (object2 = ((ck_0)object2).a) != null) {
            object2 = ((nj_1)object2).a();
            object3 = object2;
            object3 = (WX)object2;
            this.P = object3;
            ((iw_0)object2).a(this);
            this.g((iw_0)object2);
        }
        if (object != null && (object2 = ((Zj)object).a) != null && (object2 = ((ck_0)object2).b) != null) {
            object2 = ((nj_1)object2).a();
            object3 = object2;
            object3 = (WX)object2;
            this.R = object3;
            ((iw_0)object2).a(this);
            this.g((iw_0)object2);
        }
        if (object != null && (object2 = ((Zj)object).a) != null && (object2 = ((ck_0)object2).c) != null) {
            this.T = object2 = ((oj_1)object2).d();
            ((iw_0)object2).a(this);
            this.g((iw_0)object2);
        }
        if (object != null && (object2 = ((Zj)object).a) != null && (object2 = ((ck_0)object2).d) != null) {
            this.V = object2 = ((oj_1)object2).d();
            ((iw_0)object2).a(this);
            this.g((iw_0)object2);
        }
        if (object != null && (object2 = ((Zj)object).a) != null && (object2 = ((ck_0)object2).e) != null) {
            object2 = ((qj_0)object2).a();
            object3 = object2;
            object3 = (hj1)object2;
            this.X = object3;
            ((iw_0)object2).a(this);
            this.g((iw_0)object2);
        }
        if (object != null && (object2 = ((Zj)object).b) != null && (object2 = ((bk)object2).a) != null) {
            object2 = ((qj_0)object2).a();
            object3 = object2;
            object3 = (hj1)object2;
            this.a0 = object3;
            ((iw_0)object2).a(this);
            this.g((iw_0)object2);
        }
        if (object != null && (object2 = ((Zj)object).b) != null && (object2 = ((bk)object2).b) != null) {
            object2 = ((qj_0)object2).a();
            object3 = object2;
            object3 = (hj1)object2;
            this.b0 = object3;
            ((iw_0)object2).a(this);
            this.g((iw_0)object2);
        }
        if (object != null && (object2 = ((Zj)object).b) != null && (object2 = ((bk)object2).c) != null) {
            object2 = ((qj_0)object2).a();
            object3 = object2;
            object3 = (hj1)object2;
            this.c0 = object3;
            ((iw_0)object2).a(this);
            this.g((iw_0)object2);
        }
        if (object != null && (object = ((Zj)object).b) != null) {
            object = ((bk)object).d;
            this.O = object;
        }
    }

    public static void u(String string2, Paint paint, Canvas canvas) {
        Paint.Style style2;
        int n3 = paint.getColor();
        if (n3 == 0) {
            return;
        }
        Paint.Style style3 = paint.getStyle();
        if (style3 == (style2 = Paint.Style.STROKE)) {
            float f5 = paint.getStrokeWidth();
            style2 = null;
            float f6 = f5 - 0.0f;
            n3 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
            if (n3 == 0) {
                return;
            }
        }
        int n4 = string2.length();
        style2 = canvas;
        canvas.drawText(string2, 0, n4, 0.0f, 0.0f, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        Paint.Style style2;
        int n3 = paint.getColor();
        if (n3 == 0) {
            return;
        }
        Paint.Style style3 = paint.getStyle();
        if (style3 == (style2 = Paint.Style.STROKE)) {
            float f5 = paint.getStrokeWidth();
            style2 = null;
            float f6 = f5 - 0.0f;
            n3 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
            if (n3 == 0) {
                return;
            }
        }
        canvas.drawPath(path, paint);
    }

    public final void f(RectF rectF, Matrix object, boolean bl2) {
        super.f(rectF, (Matrix)object, bl2);
        object = this.N;
        float f5 = object.k.width();
        float f6 = object.k.height();
        rectF.set(0.0f, 0.0f, f5, f6);
    }

    public final void h(LC1 object, Object object2) {
        super.h((LC1)object, object2);
        Object object3 = GC1.a;
        int n3 = 1;
        object3 = n3;
        wr0_0 wr0_02 = null;
        if (object2 == object3) {
            object2 = this.Q;
            if (object2 != null) {
                this.p((iw_0)object2);
            }
            if (object == null) {
                this.Q = null;
            } else {
                this.Q = object2 = new la3_0((LC1)object, null);
                ((iw_0)object2).a(this);
                object = this.Q;
                this.g((iw_0)object);
            }
        } else {
            n3 = 2;
            object3 = n3;
            if (object2 == object3) {
                object2 = this.S;
                if (object2 != null) {
                    this.p((iw_0)object2);
                }
                if (object == null) {
                    this.S = null;
                } else {
                    this.S = object2 = new la3_0((LC1)object, null);
                    ((iw_0)object2).a(this);
                    object = this.S;
                    this.g((iw_0)object);
                }
            } else {
                object3 = GC1.n;
                if (object2 == object3) {
                    object2 = this.U;
                    if (object2 != null) {
                        this.p((iw_0)object2);
                    }
                    if (object == null) {
                        this.U = null;
                    } else {
                        this.U = object2 = new la3_0((LC1)object, null);
                        ((iw_0)object2).a(this);
                        object = this.U;
                        this.g((iw_0)object);
                    }
                } else {
                    object3 = GC1.o;
                    if (object2 == object3) {
                        object2 = this.W;
                        if (object2 != null) {
                            this.p((iw_0)object2);
                        }
                        if (object == null) {
                            this.W = null;
                        } else {
                            this.W = object2 = new la3_0((LC1)object, null);
                            ((iw_0)object2).a(this);
                            object = this.W;
                            this.g((iw_0)object);
                        }
                    } else {
                        object3 = GC1.A;
                        if (object2 == object3) {
                            object2 = this.Y;
                            if (object2 != null) {
                                this.p((iw_0)object2);
                            }
                            if (object == null) {
                                this.Y = null;
                            } else {
                                this.Y = object2 = new la3_0((LC1)object, null);
                                ((iw_0)object2).a(this);
                                object = this.Y;
                                this.g((iw_0)object);
                            }
                        } else {
                            object3 = GC1.H;
                            if (object2 == object3) {
                                object2 = this.Z;
                                if (object2 != null) {
                                    this.p((iw_0)object2);
                                }
                                if (object == null) {
                                    this.Z = null;
                                } else {
                                    this.Z = object2 = new la3_0((LC1)object, null);
                                    ((iw_0)object2).a(this);
                                    object = this.Z;
                                    this.g((iw_0)object);
                                }
                            } else {
                                object3 = GC1.J;
                                if (object2 == object3) {
                                    object2 = this.L;
                                    object2.getClass();
                                    object3 = new Object();
                                    wr0_02 = new wr0_0();
                                    Jl3 jl3 = new Jl3((CC1)object3, (LC1)object, wr0_02);
                                    ((iw_0)object2).k(jl3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void l(Canvas var1_1, Matrix var2_2, int var3_3, bw0_0 var4_4) {
        block71: {
            block68: {
                block74: {
                    block72: {
                        block73: {
                            block70: {
                                var5_5 = this;
                                var6_6 = var1_1;
                                var7_7 = var3_3;
                                var9_9 = var8_8 = this.L.f();
                                var9_9 = (wr0_0)var8_8;
                                var10_10 /* !! */  = this.N;
                                var8_8 = var10_10 /* !! */ .f;
                                var11_11 = var9_9.b;
                                var12_12 = var8_8 = var8_8.get(var11_11);
                                var12_12 = (MU0)var8_8;
                                if (var12_12 == null) {
                                    return;
                                }
                                var1_1.save();
                                var1_1.concat(var2_2 /* !! */ );
                                var13_13 = 0;
                                var14_14 = 0.0f;
                                var15_15 /* !! */  = null;
                                this.t((wr0_0)var9_9, var3_3, 0);
                                var16_16 = this.M;
                                var8_8 = var16_16.k;
                                var11_11 = this.V;
                                var17_17 = "\n";
                                var18_18 /* !! */  = "\u0003";
                                var19_19 = "\r";
                                var20_20 = "\r\n";
                                var21_21 = this.G;
                                var22_22 = this.H;
                                var23_23 = -1;
                                var24_24 = 1092616192 != 0;
                                var25_25 = 10.0f;
                                var26_26 = 3;
                                var27_27 /* !! */  = 4.2E-45f;
                                var28_28 = 2;
                                var29_29 /* !! */  = var22_22;
                                var30_30 = 1120403456;
                                var31_31 = 100.0f;
                                var32_32 /* !! */  = var12_12.c;
                                var22_22 = var12_12.a;
                                if (var8_8 == null && (var33_33 = (var8_8 = var16_16.a.h).j()) > 0) {
                                    var8_8 = this.Y;
                                    if (var8_8 != null) {
                                        var8_8 = (Float)var8_8.f();
                                        var34_34 = var8_8.floatValue();
                                    } else {
                                        var34_34 = var9_9.c;
                                    }
                                    var35_36 = wz3.e.get();
                                    var36_37 = var34_34 /= var31_31;
                                    var8_8 = var35_36;
                                    var8_8 = (float[])var35_36;
                                    var30_30 = 0;
                                    var31_31 = 0.0f;
                                    var35_36 = null;
                                    var8_8[0] = 0.0f;
                                    var37_38 = 1;
                                    var38_40 = 1.4E-45f;
                                    var8_8[var37_38] = 0.0f;
                                    var39_42 /* !! */  = wz3.f;
                                    var8_8[var28_28] = var39_42 /* !! */ ;
                                    var8_8[var26_26] = var39_42 /* !! */ ;
                                    var15_15 /* !! */  = var2_2 /* !! */ ;
                                    var2_2 /* !! */ .mapPoints((float[])var8_8);
                                    var14_14 = (float)var8_8[var28_28];
                                    var28_28 = 0;
                                    var39_42 /* !! */  = (float)var8_8[0];
                                    var27_27 /* !! */  = (float)var8_8[var26_26];
                                    var34_34 = (float)var8_8[var37_38];
                                    var34_34 = var27_27 /* !! */  - var34_34;
                                    var40_43 = var16_16;
                                    var41_44 = var14_14 -= var39_42 /* !! */ ;
                                    var43_45 = var34_34;
                                    Math.hypot(var41_44, var43_45);
                                    var8_8 = var9_9.a.replaceAll((String)var20_20, var19_19).replaceAll(var18_18 /* !! */ , var19_19).replaceAll((String)var17_17, var19_19).split(var19_19);
                                    var6_6 = Arrays.asList(var8_8);
                                    var7_7 = var6_6.size();
                                    var33_33 = var9_9.e;
                                    var34_34 = (float)var33_33 / var25_25;
                                    var17_17 = var5_5.W;
                                    if (var17_17 != null) {
                                        var11_11 = (Float)var17_17.f();
                                        var45_46 = var11_11.floatValue();
lbl83:
                                        // 2 sources

                                        while (true) {
                                            var34_34 += var45_46;
                                            while (true) {
                                                ** GOTO lbl91
                                                break;
                                            }
                                            break;
                                        }
                                    } else {
                                        if (var11_11 == null) ** continue;
                                        var11_11 = (Float)var11_11.f();
                                        var45_46 = var11_11.floatValue();
                                        ** continue;
                                    }
lbl91:
                                    // 1 sources

                                    var14_14 = var34_34;
                                    var46_48 = 0;
                                    var47_50 = 0.0f;
                                    var16_16 = null;
                                    while (var46_48 < var7_7) {
                                        var11_11 = var8_8 = var6_6.get(var46_48);
                                        var11_11 = (String)var8_8;
                                        var8_8 = var9_9.m;
                                        if (var8_8 == null) {
                                            var48_52 = 0;
                                            var49_54 = 0.0f;
                                            var17_17 = null;
                                        } else {
                                            var49_54 = var34_34 = var8_8.x;
                                        }
                                        var24_24 = true;
                                        var25_25 = 1.4E-45f;
                                        var8_8 = this;
                                        var18_18 /* !! */  = var12_12;
                                        var50_56 = var36_37;
                                        var2_2 /* !! */  = var6_6;
                                        var51_58 = var36_37;
                                        var26_26 = var7_7;
                                        var28_28 = var46_48;
                                        var52_60 /* !! */  = var29_29 /* !! */ ;
                                        var16_16 = var22_22;
                                        var29_29 /* !! */  = var12_12;
                                        var12_12 = var32_32 /* !! */ ;
                                        var53_62 = var24_24;
                                        var8_8 = this.z((String)var11_11, var49_54, (MU0)var18_18 /* !! */ , var36_37, var14_14, var24_24);
                                        var54_64 = 0;
                                        var45_46 = 0.0f;
                                        var11_11 = null;
                                        while (var54_64 < (var48_52 = var8_8.size())) {
                                            var17_17 = (Pl3$d)var8_8.get(var54_64);
                                            var55_66 = var23_23 + 1;
                                            var1_1.save();
                                            var50_56 = var17_17.b;
                                            var22_22 = var1_1;
                                            var56_68 = var5_5.y(var1_1, (wr0_0)var9_9, var55_66, var50_56);
                                            if (var56_68 != 0) {
                                                var17_17 = var17_17.a;
                                                var50_56 = 0.0f;
                                                var19_19 = null;
                                                for (var56_68 = 0; var56_68 < (var57_70 = var17_17.length()); ++var56_68) {
                                                    var57_70 = PU0.a(var17_17.charAt(var56_68), (String)var16_16, (String)var12_12);
                                                    var58_72 = var8_8;
                                                    var8_8 = (PU0)var10_10 /* !! */ .h.f(var57_70);
                                                    if (var8_8 == null) {
                                                        var59_74 = var54_64;
                                                        var60_75 = var17_17;
                                                        var30_30 = var55_66;
                                                        var61_76 /* !! */  = var12_12;
                                                        var62_78 = var16_16;
                                                        var11_11 = var40_43;
                                                    } else {
                                                        var57_70 = var3_3;
                                                        var5_5.t((wr0_0)var9_9, var3_3, var56_68);
                                                        var60_75 = var17_17;
                                                        var17_17 = var5_5.I;
                                                        var30_30 = (int)var17_17.containsKey(var8_8);
                                                        if (var30_30 != 0) {
                                                            var17_17 = (List)var17_17.get(var8_8);
                                                            var59_74 = var54_64;
                                                            var30_30 = var55_66;
                                                            var61_76 /* !! */  = var12_12;
                                                            var62_78 = var16_16;
                                                            var11_11 = var40_43;
                                                        } else {
                                                            var30_30 = var55_66;
                                                            var18_18 /* !! */  = var8_8.a;
                                                            var57_70 = var18_18 /* !! */ .size();
                                                            var61_76 /* !! */  = var12_12;
                                                            var12_12 = new ArrayList(var57_70);
                                                            var62_78 = var16_16;
                                                            var47_50 = 0.0f;
                                                            var16_16 = null;
                                                            for (var46_48 = 0; var46_48 < var57_70; ++var46_48) {
                                                                var63_80 /* !! */  = var18_18 /* !! */ .get(var46_48);
                                                                var64_81 = var18_18 /* !! */ ;
                                                                var18_18 /* !! */  = var63_80 /* !! */ ;
                                                                var18_18 /* !! */  = (p13)var63_80 /* !! */ ;
                                                                var37_38 = var57_70;
                                                                var59_74 = var54_64;
                                                                var11_11 = var40_43;
                                                                var20_20 = new f60_0((yc1_1)var40_43, var5_5, (p13)var18_18 /* !! */ , (QB1)var10_10 /* !! */ );
                                                                var12_12.add(var20_20);
                                                                var18_18 /* !! */  = var64_81;
                                                            }
                                                            var59_74 = var54_64;
                                                            var11_11 = var40_43;
                                                            var17_17.put(var8_8, var12_12);
                                                            var17_17 = var12_12;
                                                        }
                                                        var65_82 = 0.0f;
                                                        var18_18 /* !! */  = null;
                                                        for (var55_66 = 0; var55_66 < (var57_70 = var17_17.size()); ++var55_66) {
                                                            var20_20 = ((f60_0)var17_17.get(var55_66)).getPath();
                                                            var12_12 = var5_5.E;
                                                            var46_48 = 0;
                                                            var16_16 = null;
                                                            var20_20.computeBounds((RectF)var12_12, false);
                                                            var12_12 = var5_5.F;
                                                            var12_12.reset();
                                                            var47_50 = -var9_9.g;
                                                            var38_40 = wz3.c();
                                                            var63_80 /* !! */  = var17_17;
                                                            var49_54 = 0.0f;
                                                            var17_17 = null;
                                                            var12_12.preTranslate(0.0f, var47_50 *= var38_40);
                                                            var12_12.preScale(var51_58, var51_58);
                                                            var20_20.transform((Matrix)var12_12);
                                                            var48_52 = (int)var9_9.k;
                                                            if (var48_52 != 0) {
                                                                pl3_0.v((Path)var20_20, var21_21, (Canvas)var22_22);
                                                                pl3_0.v((Path)var20_20, var52_60 /* !! */ , (Canvas)var22_22);
                                                            } else {
                                                                pl3_0.v((Path)var20_20, var52_60 /* !! */ , (Canvas)var22_22);
                                                                pl3_0.v((Path)var20_20, var21_21, (Canvas)var22_22);
                                                            }
                                                            var17_17 = var63_80 /* !! */ ;
                                                        }
                                                        var66_84 = var8_8.c;
                                                        var34_34 = (float)var66_84 * var51_58;
                                                        var49_54 = wz3.c() * var34_34 + var14_14;
                                                        var33_33 = 0;
                                                        var34_34 = 0.0f;
                                                        var8_8 = null;
                                                        var22_22.translate(var49_54, 0.0f);
                                                    }
                                                    var40_43 = var11_11;
                                                    var17_17 = var60_75;
                                                    var8_8 = var58_72;
                                                    var55_66 = var30_30;
                                                    var12_12 = var61_76 /* !! */ ;
                                                    var16_16 = var62_78;
                                                    var54_64 = var59_74;
                                                }
                                            }
                                            var58_72 = var8_8;
                                            var59_74 = var54_64;
                                            var30_30 = var55_66;
                                            var61_76 /* !! */  = var12_12;
                                            var62_78 = var16_16;
                                            var11_11 = var40_43;
                                            var1_1.restore();
                                            var33_33 = var54_64 + 1;
                                            var23_23 = var55_66;
                                            var54_64 = var33_33;
                                        }
                                        var22_22 = var1_1;
                                        var61_76 /* !! */  = var12_12;
                                        var62_78 = var16_16;
                                        var11_11 = var40_43;
                                        var46_48 = var28_28 + 1;
                                        var12_12 = var29_29 /* !! */ ;
                                        var32_32 /* !! */  = var61_76 /* !! */ ;
                                        var22_22 = var16_16;
                                        var30_30 = 0;
                                        var31_31 = 0.0f;
                                        var35_36 = null;
                                        var36_37 = var51_58;
                                        var29_29 /* !! */  = var52_60 /* !! */ ;
                                        var7_7 = var26_26;
                                        var6_6 = var2_2 /* !! */ ;
                                    }
lbl257:
                                    // 3 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var8_8 = var11_11;
                                var62_79 /* !! */  = var22_22;
                                var22_22 = var6_6;
                                var11_11 = var16_16;
                                var52_61 = var29_29 /* !! */ ;
                                var61_77 = var32_32 /* !! */ ;
                                var37_39 = 1;
                                var38_41 = 1.4E-45f;
                                var29_29 /* !! */  = var12_12;
                                var10_10 /* !! */  = var5_5.Z;
                                if (var10_10 /* !! */  == null || (var10_10 /* !! */  = (Typeface)var10_10 /* !! */ .f()) == null) break block70;
                                var61_77 = var18_18 /* !! */ ;
                                var15_15 /* !! */  = var12_12;
                                var29_29 /* !! */  = var17_17;
                                break block71;
                            }
                            var10_10 /* !! */  = var11_11.k;
                            if (var10_10 /* !! */  == null) break block72;
                            var12_12 = var62_79 /* !! */ ;
                            var13_13 = var10_10 /* !! */ .containsKey((Object)var62_79 /* !! */ );
                            if (var13_13 == 0) break block73;
                            var11_11 = (Typeface)var10_10 /* !! */ .get((Object)var62_79 /* !! */ );
                            var10_10 /* !! */  = var11_11;
                            var61_77 = var18_18 /* !! */ ;
                            var15_15 /* !! */  = var29_29 /* !! */ ;
                            var29_29 /* !! */  = var17_17;
                            break block68;
                        }
                        var15_15 /* !! */  = var29_29 /* !! */ ;
                        var16_16 = var29_29 /* !! */ .b;
                        var68_85 = var10_10 /* !! */ .containsKey(var16_16);
                        if (var68_85) {
                            var11_11 = (Typeface)var10_10 /* !! */ .get(var16_16);
lbl292:
                            // 2 sources

                            while (true) {
                                var10_10 /* !! */  = var11_11;
                                var29_29 /* !! */  = var17_17;
                                var61_77 = var18_18 /* !! */ ;
                                break block68;
                                break;
                            }
                        }
                        var22_22 = var61_77;
                        var16_16 = n1.a((String)var62_79 /* !! */ , "-", var61_77);
                        var68_85 = var10_10 /* !! */ .containsKey(var16_16);
                        if (var68_85) {
                            var11_11 = (Typeface)var10_10 /* !! */ .get(var16_16);
                            ** continue;
                        }
                        break block74;
                    }
                    var15_15 /* !! */  = var29_29 /* !! */ ;
                    var22_22 = var61_77;
                    var12_12 = var62_79 /* !! */ ;
                }
                if ((var11_11 = var11_11.j()) != null) {
                    var10_10 /* !! */  = var11_11.a;
                    var10_10 /* !! */ .a = var12_12;
                    var10_10 /* !! */ .b = var22_22;
                    var16_16 = var11_11.b;
                    var29_29 /* !! */  = (Typeface)var16_16.get(var10_10 /* !! */ );
                    if (var29_29 /* !! */  != null) {
                        var61_77 = var18_18 /* !! */ ;
                        var11_11 = var29_29 /* !! */ ;
                        var29_29 /* !! */  = var17_17;
                    } else {
                        var6_6 = var11_11.c;
                        var29_29 /* !! */  = (Typeface)var6_6.get(var12_12);
                        if (var29_29 /* !! */  != null) {
                            var61_77 = var18_18 /* !! */ ;
                            var11_11 = var29_29 /* !! */ ;
                            var29_29 /* !! */  = var17_17;
                        } else {
                            var29_29 /* !! */  = var17_17;
                            var17_17 = var15_15 /* !! */ .d;
                            if (var17_17 != null) {
                                var11_11 = var17_17;
                                var61_77 = var18_18 /* !! */ ;
                            } else {
                                var61_77 = var18_18 /* !! */ ;
                                var17_17 = new StringBuilder("fonts/");
                                var17_17.append((String)var12_12);
                                var18_18 /* !! */  = var11_11.e;
                                var17_17.append(var18_18 /* !! */ );
                                var17_17 = var17_17.toString();
                                var11_11 = Typeface.createFromAsset((AssetManager)var11_11.d, (String)var17_17);
                                var6_6.put(var12_12, var11_11);
                            }
                        }
                        var17_17 = "Italic";
                        var48_53 = var22_22.contains((CharSequence)var17_17);
                        var18_18 /* !! */  = "Bold";
                        var55_67 = (int)var22_22.contains(var18_18 /* !! */ );
                        if (var48_53 != 0 && var55_67 != 0) {
                            var53_63 = 3;
                        } else if (var48_53 != 0) {
                            var53_63 = 2;
                        } else if (var55_67 != 0) {
                            var53_63 = 1;
                        } else {
                            var53_63 = 0;
                            var22_22 = null;
                        }
                        var48_53 = var11_11.getStyle();
                        if (var48_53 != var53_63) {
                            var11_11 = Typeface.create((Typeface)var11_11, (int)var53_63);
                        }
                        var16_16.put(var10_10 /* !! */ , var11_11);
                    }
lbl364:
                    // 3 sources

                    while (true) {
                        var10_10 /* !! */  = var11_11;
                        break;
                    }
                } else {
                    var29_29 /* !! */  = var17_17;
                    var61_77 = var18_18 /* !! */ ;
                    var54_65 = 0;
                    var45_47 = 0.0f;
                    var11_11 = null;
                    ** continue;
                }
            }
            if (var10_10 /* !! */  == null) {
                var10_10 /* !! */  = var15_15 /* !! */ .d;
            }
        }
        if (var10_10 /* !! */  == null) ** GOTO lbl257
        var11_11 = var9_9.a;
        var21_21.setTypeface((Typeface)var10_10 /* !! */ );
        var17_17 = var5_5.Y;
        if (var17_17 != null) {
            var17_17 = (Float)var17_17.f();
            var49_55 = var17_17.floatValue();
        } else {
            var49_55 = var9_9.c;
        }
        var65_83 = wz3.c() * var49_55;
        var21_21.setTextSize(var65_83);
        var18_18 /* !! */  = var21_21.getTypeface();
        var52_61.setTypeface((Typeface)var18_18 /* !! */ );
        var65_83 = var21_21.getTextSize();
        var52_61.setTextSize(var65_83);
        var55_67 = var9_9.e;
        var65_83 = (float)var55_67 / var25_25;
        var22_22 = var5_5.W;
        if (var22_22 != null) {
            var8_8 = (Float)var22_22.f();
            var34_35 = var8_8.floatValue();
lbl400:
            // 2 sources

            while (true) {
                var65_83 += var34_35;
                break;
            }
        } else if (var8_8 != null) {
            var8_8 = (Float)var8_8.f();
            var34_35 = var8_8.floatValue();
            ** continue;
        }
        var34_35 = wz3.c() * var65_83 * var49_55;
        var51_59 = var34_35 / var31_31;
        var8_8 = var11_11.replaceAll((String)var20_20, var19_19);
        var11_11 = var61_77;
        var8_8 = var8_8.replaceAll(var61_77, var19_19);
        var11_11 = var29_29 /* !! */ ;
        var8_8 = var8_8.replaceAll((String)var29_29 /* !! */ , var19_19).split(var19_19);
        var10_10 /* !! */  = Arrays.asList(var8_8);
        var69_86 = var10_10 /* !! */ .size();
        var46_49 = 0;
        var47_51 = 0.0f;
        var16_16 = null;
        var28_28 = 0;
        while (true) {
            if (var46_49 < var69_86) ** break;
            ** continue;
            var11_11 = var8_8 = var10_10 /* !! */ .get(var46_49);
            var11_11 = (String)var8_8;
            var8_8 = var9_9.m;
            if (var8_8 == null) {
                var48_53 = 0;
                var49_55 = 0.0f;
                var17_17 = null;
            } else {
                var49_55 = var34_35 = var8_8.x;
            }
            var56_69 = false;
            var50_57 = 0.0f;
            var19_19 = null;
            var53_63 = 0;
            var22_22 = null;
            var8_8 = this;
            var18_18 /* !! */  = var15_15 /* !! */ ;
            var2_2 /* !! */  = var10_10 /* !! */ ;
            var10_10 /* !! */  = var1_1;
            var8_8 = this.z((String)var11_11, var49_55, (MU0)var15_15 /* !! */ , 0.0f, var51_59, false);
            var45_47 = 0.0f;
            var11_11 = null;
            for (var54_65 = 0; var54_65 < (var48_53 = var8_8.size()); ++var54_65) {
                var17_17 = (Pl3$d)var8_8.get(var54_65);
                var55_67 = var23_23 + 1;
                var1_1.save();
                var19_19 = var17_17.a;
                var50_57 = var21_21.measureText(var19_19);
                var56_69 = var5_5.y(var10_10 /* !! */ , (wr0_0)var9_9, var55_67, var50_57);
                if (var56_69) {
                    var19_19 = var17_17.a;
                    var20_20 = null;
                    for (var57_71 = 0; var57_71 < (var53_63 = var19_19.length()); var57_71 += var33_33) {
                        block69: {
                            var53_63 = var19_19.codePointAt(var57_71);
                            var23_23 = Character.charCount(var53_63) + var57_71;
                            var58_73 = var8_8;
                            var33_33 = var23_23;
                            var23_23 = var55_67;
                            while (var33_33 < (var55_67 = var19_19.length())) {
                                var55_67 = var19_19.codePointAt(var33_33);
                                var26_26 = var69_86;
                                var69_86 = Character.getType(var55_67);
                                var29_29 /* !! */  = var15_15 /* !! */ ;
                                var13_13 = 16;
                                var14_14 = 2.2E-44f;
                                if (var69_86 != var13_13) {
                                    var69_86 = Character.getType(var55_67);
                                    var13_13 = 27;
                                    var14_14 = 3.8E-44f;
                                    if (var69_86 != var13_13) {
                                        var69_86 = Character.getType(var55_67);
                                        var13_13 = 6;
                                        var14_14 = 8.4E-45f;
                                        if (var69_86 != var13_13) {
                                            var69_86 = Character.getType(var55_67);
                                            var13_13 = 28;
                                            var14_14 = 3.9E-44f;
                                            if (var69_86 != var13_13) {
                                                var69_86 = Character.getType(var55_67);
                                                var13_13 = 8;
                                                var14_14 = 1.1E-44f;
                                                if (var69_86 != var13_13) {
                                                    var69_86 = Character.getType(var55_67);
                                                    var13_13 = 19;
                                                    var14_14 = 2.7E-44f;
                                                    if (var69_86 != var13_13) break block69;
                                                }
                                            }
                                        }
                                    }
                                }
                                var69_86 = Character.charCount(var55_67);
                                var33_33 += var69_86;
                                var53_63 = var53_63 * 31 + var55_67;
                                var69_86 = var26_26;
                                var15_15 /* !! */  = var29_29 /* !! */ ;
                            }
                            var26_26 = var69_86;
                            var29_29 /* !! */  = var15_15 /* !! */ ;
                        }
                        if ((var53_63 = (var18_18 /* !! */  = var5_5.J).i(var70_87 = (long)var53_63)) >= 0) {
                            var8_8 = (String)var18_18 /* !! */ .f(var70_87);
                            var30_30 = var46_49;
                        } else {
                            var22_22 = var5_5.D;
                            var30_30 = var46_49;
                            var47_51 = 0.0f;
                            var16_16 = null;
                            var22_22.setLength(0);
                            for (var46_49 = var57_71; var46_49 < var33_33; var46_49 += var33_33) {
                                var37_39 = var33_33;
                                var33_33 = var19_19.codePointAt(var46_49);
                                var22_22.appendCodePoint(var33_33);
                                var33_33 = Character.charCount(var33_33);
                                var33_33 = var37_39;
                            }
                            var8_8 = var22_22.toString();
                            var18_18 /* !! */ .l(var70_87, var8_8);
                        }
                        var55_67 = var28_28 + var57_71;
                        var53_63 = var3_3;
                        var5_5.t((wr0_0)var9_9, var3_3, var55_67);
                        var55_67 = (int)var9_9.k;
                        if (var55_67 != 0) {
                            pl3_0.u((String)var8_8, var21_21, var10_10 /* !! */ );
                            pl3_0.u((String)var8_8, var52_61, var10_10 /* !! */ );
                        } else {
                            pl3_0.u((String)var8_8, var52_61, var10_10 /* !! */ );
                            pl3_0.u((String)var8_8, var21_21, var10_10 /* !! */ );
                        }
                        var65_83 = var21_21.measureText((String)var8_8) + var51_59;
                        var12_12 = null;
                        var10_10 /* !! */ .translate(var65_83, 0.0f);
                        var33_33 = var8_8.length();
                        var55_67 = var23_23;
                        var8_8 = var58_73;
                        var69_86 = var26_26;
                        var15_15 /* !! */  = var29_29 /* !! */ ;
                        var46_49 = var30_30;
                    }
                }
                var53_63 = var3_3;
                var58_73 = var8_8;
                var23_23 = var55_67;
                var26_26 = var69_86;
                var29_29 /* !! */  = var15_15 /* !! */ ;
                var30_30 = var46_49;
                var12_12 = null;
                var33_33 = var17_17.a.length();
                var28_28 = var33_33 + var28_28;
                var1_1.restore();
                var8_8 = var58_73;
            }
            var53_63 = var3_3;
            var26_26 = var69_86;
            var29_29 /* !! */  = var15_15 /* !! */ ;
            var30_30 = var46_49++;
            var12_12 = null;
            var10_10 /* !! */  = var2_2 /* !! */ ;
        }
        var10_10 /* !! */  = var1_1;
        var1_1.restore();
    }

    public final void t(wr0_0 object, int n3, int n4) {
        int n7;
        float f5;
        int n8;
        int n10;
        Object object2 = this.Q;
        Pl3$a pl3$a = this.G;
        if (object2 != null) {
            object2 = (Integer)((la3_0)object2).f();
            n10 = (Integer)object2;
            pl3$a.setColor(n10);
        } else {
            boolean bl2;
            object2 = this.P;
            if (object2 != null && (bl2 = this.x(n4))) {
                object2 = (Integer)((iw_0)object2).f();
                n10 = (Integer)object2;
                pl3$a.setColor(n10);
            } else {
                n10 = ((wr0_0)object).h;
                pl3$a.setColor(n10);
            }
        }
        object2 = this.S;
        Pl3$b pl3$b = this.H;
        if (object2 != null) {
            object2 = (Integer)((la3_0)object2).f();
            n10 = (Integer)object2;
            pl3$b.setColor(n10);
        } else {
            object2 = this.R;
            if (object2 != null && (n8 = this.x(n4)) != 0) {
                object2 = (Integer)((iw_0)object2).f();
                n10 = (Integer)object2;
                pl3$b.setColor(n10);
            } else {
                n10 = ((wr0_0)object).i;
                pl3$b.setColor(n10);
            }
        }
        object2 = this.w.j;
        n8 = 100;
        float f6 = 1.4E-43f;
        if (object2 == null) {
            n10 = 100;
            f5 = 1.4E-43f;
        } else {
            object2 = (Integer)((iw_0)object2).f();
            n10 = (Integer)object2;
        }
        hj1 hj12 = this.X;
        if (hj12 != null && (n7 = this.x(n4)) != 0) {
            Integer n14 = (Integer)hj12.f();
            n8 = n14;
        }
        f5 = n10;
        float f7 = 255.0f;
        f5 *= f7;
        n7 = 1120403456;
        float f8 = 100.0f;
        f6 = (float)n8 / f8 * (f5 /= f8);
        float f11 = n3;
        f6 = f6 * f11 / f7;
        n3 = Math.round(f6);
        pl3$a.setAlpha(n3);
        pl3$b.setAlpha(n3);
        iw_0 iw_02 = this.U;
        if (iw_02 != null) {
            object = (Float)((la3_0)iw_02).f();
            float f12 = ((Float)object).floatValue();
            pl3$b.setStrokeWidth(f12);
        } else {
            iw_02 = this.T;
            if (iw_02 != null && (n4 = (int)(this.x(n4) ? 1 : 0)) != 0) {
                object = (Float)iw_02.f();
                float f14 = ((Float)object).floatValue();
                pl3$b.setStrokeWidth(f14);
            } else {
                float f15 = ((wr0_0)object).j;
                f11 = wz3.c() * f15;
                pl3$b.setStrokeWidth(f11);
            }
        }
    }

    public final Pl3$d w(int n3) {
        ArrayList arrayList = this.K;
        for (int i3 = arrayList.size(); i3 < n3; ++i3) {
            Pl3$d pl3$d = new Pl3$d();
            arrayList.add(pl3$d);
        }
        return (Pl3$d)arrayList.get(n3 += -1);
    }

    public final boolean x(int n3) {
        Object object;
        String string2 = ((wr0_0)this.L.f()).a;
        int n4 = string2.length();
        Object object2 = this.a0;
        boolean bl2 = true;
        if (object2 != null && (object = this.b0) != null) {
            float f5;
            Integer n7 = (Integer)((iw_0)object2).f();
            int n8 = n7;
            Object object3 = (Integer)((iw_0)object).f();
            int n10 = object3;
            n8 = Math.min(n8, n10);
            object2 = (Integer)((iw_0)object2).f();
            int n14 = (Integer)object2;
            int n15 = (Integer)((iw_0)object).f();
            n14 = Math.max(n14, n15);
            object = this.c0;
            if (object != null) {
                object = (Integer)((iw_0)object).f();
                n15 = (Integer)object;
                n8 += n15;
                n14 += n15;
            }
            if ((object = this.O) == (object3 = qm3.INDEX)) {
                if (n3 < n8 || n3 >= n14) {
                    bl2 = false;
                }
                return bl2;
            }
            float f6 = n3;
            float f7 = n4;
            float f8 = (f6 = f6 / f7 * 100.0f) - (f7 = (float)n8);
            n4 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
            if (n4 < 0 || (n3 = (int)((f5 = f6 - (f7 = (float)n14)) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1))) >= 0) {
                bl2 = false;
            }
        }
        return bl2;
    }

    public final boolean y(Canvas canvas, wr0_0 object, int n3, float f5) {
        float f6;
        float f7;
        float f8;
        PointF pointF = ((wr0_0)object).l;
        Object object2 = ((wr0_0)object).m;
        float f11 = wz3.c();
        float f12 = 0.0f;
        if (pointF == null) {
            f8 = 0.0f;
        } else {
            f8 = ((wr0_0)object).f * f11;
            f7 = pointF.y;
            f8 += f7;
        }
        float f14 = n3;
        f7 = ((wr0_0)object).f;
        f14 = f14 * f7 * f11 + f8;
        yc1_1 yc1_12 = this.M;
        Object object3 = yc1_12.v;
        if (object3 != 0 && object2 != null && pointF != null) {
            f11 = pointF.y;
            f8 = object2.y;
            f11 += f8;
            f8 = ((wr0_0)object).c;
            float f15 = f14 - (f11 += f8);
            object3 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
            if (object3 >= 0) {
                return false;
            }
        }
        if (pointF == null) {
            f6 = 0.0f;
            pointF = null;
        } else {
            f6 = pointF.x;
        }
        if (object2 != null) {
            f12 = object2.x;
        }
        object2 = Pl3$c.a;
        object = ((wr0_0)object).d;
        int n4 = ((Enum)object).ordinal();
        n4 = (int)object2[n4];
        int n7 = true;
        if (n4 != n7) {
            object3 = 2;
            f11 = 2.8E-45f;
            if (n4 != object3) {
                object3 = 3;
                f11 = 4.2E-45f;
                if (n4 == object3) {
                    n4 = 0x40000000;
                    float f16 = 2.0f;
                    f12 = f12 / f16 + f6;
                    canvas.translate(f12 -= (f5 /= f16), f14);
                }
            } else {
                f6 = f6 + f12 - f5;
                canvas.translate(f6, f14);
            }
        } else {
            canvas.translate(f6, f14);
        }
        return n7;
    }

    public final List z(String string2, float f5, MU0 mU0, float f6, float f7, boolean bl2) {
        int n3;
        pl3_0 pl3_02 = this;
        String string3 = string2;
        Object object = mU0;
        float f8 = 0.0f;
        int n4 = 0;
        int n7 = 0;
        float f11 = 0.0f;
        String string4 = null;
        boolean bl3 = false;
        float f12 = 0.0f;
        String string5 = null;
        int n8 = 0;
        float f14 = 0.0f;
        for (int i3 = 0; i3 < (n3 = string2.length()); ++i3) {
            float f15;
            float f16;
            float f17;
            float f18;
            int n10;
            Object object2;
            Object object3;
            n3 = string3.charAt(i3);
            if (bl2) {
                object3 = ((MU0)object).c;
                object2 = ((MU0)object).a;
                object2 = pl3_02.N.h;
                n10 = PU0.a((char)n3, (String)object2, (String)object3);
                if ((object3 = (PU0)((ca3)object2).f(n10)) == null) continue;
                double d2 = ((PU0)object3).c;
                f18 = (float)d2 * f6;
                f17 = wz3.c() * f18 + f7;
            } else {
                n10 = i3 + 1;
                object3 = string3.substring(i3, n10);
                object2 = pl3_02.G;
                f18 = object2.measureText((String)object3);
                f17 = f18 + f7;
            }
            n10 = 32;
            f18 = 4.5E-44f;
            if (n3 == n10) {
                bl3 = true;
                f14 = f17;
            } else if (bl3) {
                n8 = i3;
                f12 = f17;
                bl3 = false;
            } else {
                f12 += f17;
            }
            float f19 = (f16 = f5 - 0.0f) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
            if (f19 <= 0 || (f19 = (f15 = (f8 += f17) - f5) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1)) < 0 || n3 == n10) continue;
            Pl3$d pl3$d = pl3_02.w(++n4);
            if (n8 == n7) {
                string4 = string3.substring(n7, i3);
                string5 = string4.trim();
                n8 = string5.length();
                n7 = string4.length();
                f11 = (float)(n8 - n7) * f14;
                f8 = f8 - f17 - f11;
                pl3$d.a = string5;
                pl3$d.b = f8;
                n7 = i3;
                n8 = i3;
                f8 = f17;
                f12 = f17;
                continue;
            }
            n10 = n8 + -1;
            string4 = string3.substring(n7, n10);
            object3 = string4.trim();
            n7 = string4.length();
            int n14 = ((String)object3).length();
            f11 = (float)(n7 - n14) * f14;
            f8 = f8 - f12 - f11 - f14;
            pl3$d.a = object3;
            pl3$d.b = f8;
            f8 = f12;
            n7 = n8;
        }
        float f20 = f8 - 0.0f;
        Object object4 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
        if (object4 > 0) {
            object = pl3_02.w(++n4);
            ((Pl3$d)object).a = string3 = string3.substring(n7);
            ((Pl3$d)object).b = f8;
        }
        return pl3_02.K.subList(0, n4);
    }
}

