/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BlurMaskFilter
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.RectF
 *  android.graphics.Xfermode
 *  android.os.Build$VERSION
 */
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 * Renamed from kw
 */
public abstract class kw_1
implements av0_1,
iw$a,
lo1_1 {
    public float A;
    public BlurMaskFilter B;
    public bp1_1 C;
    public final Path a;
    public final Matrix b;
    public final Matrix c;
    public final bp1_1 d;
    public final bp1_1 e;
    public final bp1_1 f;
    public final bp1_1 g;
    public final bp1_1 h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final yc1_1 o;
    public final pp1 p;
    public final lh1_0 q;
    public final es0_0 r;
    public kw_1 s;
    public kw_1 t;
    public List u;
    public final ArrayList v;
    public final Nq3 w;
    public boolean x;
    public boolean y;
    public bp1_1 z;

    public kw_1(yc1_1 object, pp1 object2) {
        int n3;
        Object object3;
        Object object4 = new Path();
        this.a = object4;
        this.b = object4;
        super();
        this.c = object4;
        int n4 = 1;
        super(n4);
        this.d = object4;
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        super(mode);
        this.e = object4;
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        super(mode2);
        this.f = object4;
        super(n4);
        this.g = object4;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        super();
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(mode3);
        object3.setXfermode((Xfermode)porterDuffXfermode);
        this.h = object3;
        super();
        this.i = object3;
        super();
        this.j = object3;
        super();
        this.k = object3;
        super();
        this.l = object3;
        super();
        this.m = object3;
        super();
        this.n = object3;
        super();
        this.v = object3;
        this.x = n4;
        this.A = 0.0f;
        this.o = object;
        this.p = object2;
        object = pp1$b.INVERT;
        object3 = ((pp1)object2).u;
        if (object3 == object) {
            super(mode2);
            object4.setXfermode((Xfermode)object);
        } else {
            super(mode);
            object4.setXfermode((Xfermode)object);
        }
        object = ((pp1)object2).i;
        object.getClass();
        super((dk_0)object);
        this.w = object4;
        ((Nq3)object4).b(this);
        object = ((pp1)object2).h;
        if (object != null && (n3 = object.isEmpty()) == 0) {
            this.q = object2 = new lh1_0((List)object);
            object = ((lh1_0)object2).a.iterator();
            while ((n3 = object.hasNext()) != 0) {
                object2 = (iw_0)object.next();
                ((iw_0)object2).a(this);
            }
            object = this.q.b.iterator();
            while ((n3 = object.hasNext()) != 0) {
                object2 = (iw_0)object.next();
                this.g((iw_0)object2);
                ((iw_0)object2).a(this);
            }
        }
        object = this.p;
        object2 = ((pp1)object).t;
        n3 = object2.isEmpty();
        if (n3 == 0) {
            object = ((pp1)object).t;
            this.r = object2 = new iw_0((List)object);
            ((iw_0)object2).b = n4;
            object = new jw_0(this);
            ((iw_0)object2).a((iw$a)object);
            object = (Float)this.r.f();
            float f5 = ((Float)object).floatValue();
            n3 = 1065353216;
            float f6 = 1.0f;
            float f7 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
            if (f7 != false) {
                n4 = 0;
            }
            f7 = (float)this.x;
            if (n4 != f7) {
                this.x = n4;
                object = this.o;
                ((yc1_1)((Object)object)).invalidateSelf();
            }
            object = this.r;
            this.g((iw_0)object);
        } else {
            int n7 = this.x;
            if (n4 != n7) {
                this.x = n4;
                object = this.o;
                ((yc1_1)((Object)object)).invalidateSelf();
            }
        }
    }

    public final void a() {
        this.o.invalidateSelf();
    }

    public final void b(List list, List list2) {
    }

    public final void c(ko1 ko12, int n3, ArrayList arrayList, ko1 object) {
        boolean bl2;
        boolean bl3;
        Object object2 = this.s;
        Object object3 = this.p;
        if (object2 != null) {
            boolean bl4;
            boolean bl5;
            object2 = ((kw_1)object2).p.c;
            object.getClass();
            ko1 ko13 = new ko1((ko1)object);
            Object object4 = ko13.a;
            object4.add(object2);
            object2 = this.s.p.c;
            boolean n4 = ko12.a(n3, (String)object2);
            if (n4) {
                object2 = this.s;
                object4 = new ko1(ko13);
                ((ko1)object4).b = object2;
                arrayList.add(object4);
            }
            if ((bl5 = ko12.c(n3, (String)(object2 = this.s.p.c))) && (bl4 = ko12.d(n3, (String)(object2 = ((pp1)object3).c)))) {
                object2 = this.s.p.c;
                int n7 = ko12.b(n3, (String)object2) + n3;
                object4 = this.s;
                ((kw_1)object4).q(ko12, n7, arrayList, ko13);
            }
        }
        if (!(bl3 = ko12.c(n3, (String)(object2 = ((pp1)object3).c)))) {
            return;
        }
        object2 = "__container";
        object3 = ((pp1)object3).c;
        boolean bl6 = ((String)object2).equals(object3);
        if (!bl6) {
            object.getClass();
            object2 = new ko1((ko1)object);
            object = ((ko1)object2).a;
            object.add(object3);
            boolean bl7 = ko12.a(n3, (String)object3);
            if (bl7) {
                object = new ko1((ko1)object2);
                ((ko1)object).b = this;
                arrayList.add(object);
            }
            object = object2;
        }
        if (bl2 = ko12.d(n3, (String)object3)) {
            int n8 = ko12.b(n3, (String)object3) + n3;
            this.q(ko12, n8, arrayList, (ko1)object);
        }
    }

    public void f(RectF rectF, Matrix object, boolean bl2) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.j();
        rectF = this.n;
        rectF.set((Matrix)object);
        if (bl2) {
            object = this.u;
            if (object != null) {
                for (int i3 = object.size() + -1; i3 >= 0; i3 += -1) {
                    Matrix matrix = ((kw_1)this.u.get((int)i3)).w.e();
                    rectF.preConcat(matrix);
                }
            } else {
                object = this.t;
                if (object != null) {
                    object = ((kw_1)object).w.e();
                    rectF.preConcat((Matrix)object);
                }
            }
        }
        object = this.w.e();
        rectF.preConcat((Matrix)object);
    }

    public final void g(iw_0 iw_02) {
        if (iw_02 == null) {
            return;
        }
        this.v.add(iw_02);
    }

    public final String getName() {
        return this.p.c;
    }

    public void h(LC1 lC1, Object object) {
        this.w.c(lC1, object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void i(Canvas var1_1, Matrix var2_2, int var3_3, bw0_0 var4_4) {
        block35: {
            block39: {
                block40: {
                    block33: {
                        var5_5 = this;
                        var6_6 = var1_1;
                        var7_7 /* !! */  = var2_2;
                        var8_8 = var3_3;
                        var9_9 /* !! */  = var4_4;
                        var10_10 = -1;
                        var11_11 = 0.0f / 0.0f;
                        var12_12 = 1;
                        var13_13 = 1.4E-45f;
                        var14_14 = Yo1.a;
                        var15_15 /* !! */  = this.x;
                        if (var15_15 /* !! */  == 0) break block35;
                        var14_14 = this.p;
                        var16_16 = var14_14.v;
                        if (var16_16 != 0) break block35;
                        this.j();
                        var17_17 = this.b;
                        var17_17.reset();
                        var17_17.set(var2_2);
                        var18_18 = this.u;
                        for (var16_16 = var18_18.size() - var12_12; var16_16 >= 0; var16_16 += var10_10) {
                            var19_19 /* !! */  = ((kw_1)var5_5.u.get((int)var16_16)).w.e();
                            var17_17.preConcat(var19_19 /* !! */ );
                        }
                        var18_18 = Yo1.a;
                        var18_18 = var5_5.w;
                        var19_19 /* !! */  = var18_18.j;
                        if (var19_19 /* !! */  != null && (var19_19 /* !! */  = (Integer)var19_19 /* !! */ .f()) != null) {
                            var20_20 = var19_19 /* !! */ .intValue();
                        } else {
                            var20_20 = 100;
                            var21_21 = 1.4E-43f;
                        }
                        var22_22 = var8_8;
                        var23_23 = 1132396544;
                        var24_24 = 255.0f;
                        var22_22 /= var24_24;
                        var21_21 = var20_20;
                        var22_22 *= var21_21;
                        var20_20 = 1120403456;
                        var21_21 = 100.0f;
                        var22_22 = var22_22 / var21_21 * var24_24;
                        var25_25 = (int)var22_22;
                        var19_19 /* !! */  = var5_5.s;
                        var26_26 = 0;
                        var27_27 = null;
                        if (var19_19 /* !! */  != null) {
                            var20_20 = 1;
                            var21_21 = 1.4E-45f;
                        } else {
                            var20_20 = 0;
                            var21_21 = 0.0f;
                            var19_19 /* !! */  = null;
                        }
                        var28_28 /* !! */  = var14_14.y;
                        if (var20_20 == 0 && (var20_20 = (int)this.n()) == 0 && var28_28 /* !! */  == (var19_19 /* !! */  = Zo1.NORMAL)) {
                            var29_29 = var18_18.e();
                            var17_17.preConcat(var29_29);
                            var5_5.l(var6_6, var17_17, var25_25, (bw0_0)var9_9 /* !! */ );
                            this.o();
                            return;
                        }
                        var30_31 = var5_5.i;
                        var5_5.f(var30_31, var17_17, false);
                        var19_19 /* !! */  = var5_5.s;
                        var23_23 = 0;
                        var24_24 = 0.0f;
                        var31_32 /* !! */  = null;
                        if (var19_19 /* !! */  != null && (var14_14 = var14_14.u) != (var19_19 /* !! */  = pp1$b.INVERT)) {
                            var14_14 = var5_5.l;
                            var14_14.set(0.0f, 0.0f, 0.0f, 0.0f);
                            var19_19 /* !! */  = var5_5.s;
                            var19_19 /* !! */ .f((RectF)var14_14, var7_7 /* !! */ , (boolean)var12_12);
                            var15_15 /* !! */  = var30_31.intersect((RectF)var14_14);
                            if (var15_15 /* !! */  == 0) {
                                var30_31.set(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                        }
                        var14_14 = var18_18.e();
                        var17_17.preConcat((Matrix)var14_14);
                        var14_14 = var5_5.k;
                        var14_14.set(0.0f, 0.0f, 0.0f, 0.0f);
                        var16_16 = (int)this.n();
                        var19_19 /* !! */  = var5_5.a;
                        var29_30 /* !! */  = var5_5.q;
                        if (var16_16 == 0) {
                            var32_33 = var29_30 /* !! */ ;
lbl86:
                            // 4 sources

                            while (true) {
                                var33_34 = var19_19 /* !! */ ;
lbl88:
                                // 2 sources

                                while (true) {
                                    var10_10 = 0;
                                    var11_11 = 0.0f;
                                    var29_30 /* !! */  = null;
                                    break block33;
                                    break;
                                }
                                break;
                            }
                        }
                        var18_18 = var29_30 /* !! */ .c;
                        var16_16 = var18_18.size();
                        var27_27 = null;
                        for (var26_26 = 0; var26_26 < var16_16; var26_26 += var10_10) {
                            block38: {
                                block37: {
                                    block36: {
                                        var31_32 /* !! */  = (kh1_0)var29_30 /* !! */ .c.get(var26_26);
                                        var34_35 = (Path)((iw_0)var29_30 /* !! */ .a.get(var26_26)).f();
                                        if (var34_35 == null) {
                                            var32_33 = var29_30 /* !! */ ;
lbl101:
                                            // 2 sources

                                            while (true) {
                                                var35_36 = var16_16;
                                                var33_34 = var19_19 /* !! */ ;
lbl104:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        var19_19 /* !! */ .set((Path)var34_35);
                                        var19_19 /* !! */ .transform(var17_17);
                                        var34_35 = kw$a.b;
                                        var32_33 = var29_30 /* !! */ ;
                                        var29_30 /* !! */  = var31_32 /* !! */ .a;
                                        var10_10 = var29_30 /* !! */ .ordinal();
                                        var10_10 = (int)var34_35[var10_10];
                                        var12_12 = 1;
                                        var13_13 = 1.4E-45f;
                                        if (var10_10 == var12_12) ** GOTO lbl86
                                        var12_12 = 2;
                                        var13_13 = 2.8E-45f;
                                        if (var10_10 == var12_12) ** GOTO lbl86
                                        var12_12 = 3;
                                        var13_13 = 4.2E-45f;
                                        if (var10_10 == var12_12) break block36;
                                        var12_12 = 4;
                                        var13_13 = 5.6E-45f;
                                        if (var10_10 == var12_12) break block37;
                                        break block38;
                                    }
                                    var12_12 = 4;
                                    var13_13 = 5.6E-45f;
                                }
                                if ((var10_10 = (int)var31_32 /* !! */ .d) == 0) ** break;
                                ** continue;
                            }
                            var29_30 /* !! */  = var5_5.m;
                            var23_23 = 0;
                            var24_24 = 0.0f;
                            var31_32 /* !! */  = null;
                            var19_19 /* !! */ .computeBounds((RectF)var29_30 /* !! */ , false);
                            if (var26_26 == 0) {
                                var14_14.set((RectF)var29_30 /* !! */ );
                                ** continue;
                            }
                            var24_24 = var14_14.left;
                            var13_13 = var29_30 /* !! */ .left;
                            var24_24 = Math.min(var24_24, var13_13);
                            var13_13 = var14_14.top;
                            var35_36 = var16_16;
                            var36_37 = var29_30 /* !! */ .top;
                            var36_37 = Math.min(var13_13, var36_37);
                            var13_13 = var14_14.right;
                            var33_34 = var19_19 /* !! */ ;
                            var21_21 = var29_30 /* !! */ .right;
                            var21_21 = Math.max(var13_13, var21_21);
                            var13_13 = var14_14.bottom;
                            var11_11 = var29_30 /* !! */ .bottom;
                            var11_11 = Math.max(var13_13, var11_11);
                            var14_14.set(var24_24, var36_37, var21_21, var11_11);
                            ** continue;
                            var10_10 = 1;
                            var11_11 = 1.4E-45f;
                            var29_30 /* !! */  = var32_33;
                            var16_16 = var35_36;
                            var19_19 /* !! */  = var33_34;
                            var12_12 = 1;
                            var13_13 = 1.4E-45f;
                        }
                        var32_33 = var29_30 /* !! */ ;
                        var33_34 = var19_19 /* !! */ ;
                        ** while ((var10_10 = (int)var30_31.intersect((RectF)var14_14)) != 0)
lbl168:
                        // 1 sources

                        var10_10 = 0;
                        var11_11 = 0.0f;
                        var29_30 /* !! */  = null;
                        var30_31.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    var14_14 = var5_5.j;
                    var16_16 = var1_1.getWidth();
                    var36_37 = var16_16;
                    var21_21 = var1_1.getHeight();
                    var14_14.set(0.0f, 0.0f, var36_37, var21_21);
                    var18_18 = var5_5.c;
                    var6_6.getMatrix((Matrix)var18_18);
                    var20_20 = (int)var18_18.isIdentity();
                    if (var20_20 == 0) {
                        var18_18.invert((Matrix)var18_18);
                        var18_18.mapRect((RectF)var14_14);
                    }
                    if ((var15_15 /* !! */  = var30_31.intersect((RectF)var14_14)) == 0) {
                        var30_31.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    var29_30 /* !! */  = Yo1.a;
                    var11_11 = var30_31.width();
                    var15_15 /* !! */  = 1065353216;
                    var37_38 = 1.0f;
                    cfr_temp_0 = var11_11 - var37_38;
                    var10_10 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                    if (var10_10 < 0 || (var10_10 = (int)((cfr_temp_1 = (var11_11 = var30_31.height()) - var37_38) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) < 0) break block39;
                    var34_35 = var5_5.d;
                    var26_26 = 255;
                    var34_35.setAlpha(var26_26);
                    var29_30 /* !! */  = var28_28 /* !! */ .toNativeBlendMode();
                    gm2_0.a((bp1_1)var34_35, (hy_0)var29_30 /* !! */ );
                    wz3.e(var6_6, var30_31, (Paint)var34_35);
                    var29_30 /* !! */  = Zo1.MULTIPLY;
                    if (var28_28 /* !! */  != var29_30 /* !! */ ) {
                        this.k(var1_1);
                        var27_27 = var32_33;
                        var7_7 /* !! */  = var33_34;
                        var8_8 = 2;
                    } else {
                        var29_30 /* !! */  = var5_5.C;
                        if (var29_30 /* !! */  == null) {
                            var29_30 /* !! */  = new Paint();
                            var5_5.C = var29_30 /* !! */ ;
                            var16_16 = -1;
                            var36_37 = 0.0f / 0.0f;
                            var29_30 /* !! */ .setColor(var16_16);
                        }
                        var36_37 = var30_31.left - var37_38;
                        var21_21 = var30_31.top - var37_38;
                        var22_22 = var30_31.right + var37_38;
                        var11_11 = var30_31.bottom;
                        var24_24 = var11_11 + var37_38;
                        var14_14 = var5_5.C;
                        var27_27 = var32_33;
                        var29_30 /* !! */  = var1_1;
                        var38_39 /* !! */  = var14_14;
                        var37_38 = var36_37;
                        var36_37 = var21_21;
                        var7_7 /* !! */  = var33_34;
                        var21_21 = var22_22;
                        var22_22 = var24_24;
                        var8_8 = 2;
                        var31_32 /* !! */  = var14_14;
                        var1_1.drawRect(var37_38, var36_37, var21_21, var24_24, (Paint)var14_14);
                    }
                    var5_5.l(var6_6, var17_17, var25_25, (bw0_0)var9_9 /* !! */ );
                    var10_10 = (int)this.n();
                    var15_15 /* !! */  = 23;
                    var37_38 = 3.2E-44f;
                    var16_16 = 19;
                    var36_37 = 2.7E-44f;
                    if (var10_10 == 0) break block40;
                    var10_10 = Build.VERSION.SDK_INT;
                    var19_19 /* !! */  = var5_5.e;
                    if (var10_10 < var15_15 /* !! */ ) {
                        var6_6.saveLayer(var30_31, (Paint)var19_19 /* !! */ , var16_16);
                    } else {
                        var6_6.saveLayer(var30_31, (Paint)var19_19 /* !! */ );
                    }
                    var39_40 = 28;
                    var22_22 = 3.9E-44f;
                    if (var10_10 < var39_40) {
                        this.k(var1_1);
                    }
                    var24_24 = 0.0f;
                    var31_32 /* !! */  = null;
                    for (var23_23 = 0; var23_23 < (var10_10 = (var29_30 /* !! */  = var27_27.c).size()); var23_23 += var39_40) {
                        block34: {
                            block41: {
                                block47: {
                                    block42: {
                                        block46: {
                                            block43: {
                                                block45: {
                                                    block44: {
                                                        var29_30 /* !! */  = var27_27.c;
                                                        var28_28 /* !! */  = (kh1_0)var29_30 /* !! */ .get(var23_23);
                                                        var9_9 /* !! */  = var27_27.a;
                                                        var40_41 = (iw_0)var9_9 /* !! */ .get(var23_23);
                                                        var18_18 = (iw_0)var27_27.b.get(var23_23);
                                                        var38_39 /* !! */  = (Hq)kw$a.b;
                                                        var14_14 = var28_28 /* !! */ .a;
                                                        var15_15 /* !! */  = var14_14.ordinal();
                                                        var8_8 = 1;
                                                        if ((var15_15 /* !! */  = (int)var38_39 /* !! */ [var15_15 /* !! */ ]) == var8_8) break block41;
                                                        var29_30 /* !! */  = var5_5.f;
                                                        var39_40 = (int)var28_28 /* !! */ .d;
                                                        var41_42 = 2;
                                                        if (var15_15 /* !! */  == var41_42) break block42;
                                                        var8_8 = 3;
                                                        if (var15_15 /* !! */  == var8_8) break block43;
                                                        var8_8 = 4;
                                                        if (var15_15 /* !! */  == var8_8) break block44;
lbl272:
                                                        // 6 sources

                                                        while (true) {
                                                            var15_15 /* !! */  = 2;
                                                            var37_38 = 2.8E-45f;
lbl275:
                                                            // 3 sources

                                                            while (true) {
                                                                var16_16 = 255;
                                                                var36_37 = 3.57E-43f;
                                                                var39_40 = 1;
                                                                var22_22 = 1.4E-45f;
                                                                break block34;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (var39_40 == 0) break block45;
                                                    wz3.e(var6_6, var30_31, (Paint)var34_35);
                                                    var6_6.drawRect(var30_31, (Paint)var34_35);
                                                    var14_14 = (Path)var40_41.f();
                                                    var7_7 /* !! */ .set((Path)var14_14);
                                                    var7_7 /* !! */ .transform(var17_17);
                                                    var14_14 = (Integer)var18_18.f();
                                                    var37_38 = var14_14.intValue();
                                                    var16_16 = 1076048691;
                                                    var36_37 = 2.55f;
                                                    var15_15 /* !! */  = (int)(var37_38 *= var36_37);
                                                    var34_35.setAlpha(var15_15 /* !! */ );
                                                    var6_6.drawPath((Path)var7_7 /* !! */ , (Paint)var29_30 /* !! */ );
                                                    var1_1.restore();
                                                    ** GOTO lbl272
                                                }
                                                var29_30 /* !! */  = (Path)var40_41.f();
                                                var7_7 /* !! */ .set((Path)var29_30 /* !! */ );
                                                var7_7 /* !! */ .transform(var17_17);
                                                var29_30 /* !! */  = (Integer)var18_18.f();
                                                var11_11 = var29_30 /* !! */ .intValue();
                                                var15_15 /* !! */  = 1076048691;
                                                var37_38 = 2.55f;
                                                var10_10 = (int)(var11_11 *= var37_38);
                                                var34_35.setAlpha(var10_10);
                                                var6_6.drawPath((Path)var7_7 /* !! */ , (Paint)var34_35);
                                                ** GOTO lbl272
                                            }
                                            var8_8 = 4;
                                            if (var39_40 == 0) break block46;
                                            wz3.e(var6_6, var30_31, (Paint)var19_19 /* !! */ );
                                            var6_6.drawRect(var30_31, (Paint)var34_35);
                                            var37_38 = ((Integer)var18_18.f()).intValue();
                                            var16_16 = 1076048691;
                                            var36_37 = 2.55f;
                                            var15_15 /* !! */  = (int)(var37_38 *= var36_37);
                                            var29_30 /* !! */ .setAlpha(var15_15 /* !! */ );
                                            var14_14 = (Path)var40_41.f();
                                            var7_7 /* !! */ .set((Path)var14_14);
                                            var7_7 /* !! */ .transform(var17_17);
                                            var6_6.drawPath((Path)var7_7 /* !! */ , (Paint)var29_30 /* !! */ );
                                            var1_1.restore();
                                            ** GOTO lbl272
                                        }
                                        wz3.e(var6_6, var30_31, (Paint)var19_19 /* !! */ );
                                        var29_30 /* !! */  = (Path)var40_41.f();
                                        var7_7 /* !! */ .set((Path)var29_30 /* !! */ );
                                        var7_7 /* !! */ .transform(var17_17);
                                        var29_30 /* !! */  = (Integer)var18_18.f();
                                        var11_11 = var29_30 /* !! */ .intValue();
                                        var15_15 /* !! */  = 1076048691;
                                        var37_38 = 2.55f;
                                        var10_10 = (int)(var11_11 *= var37_38);
                                        var34_35.setAlpha(var10_10);
                                        var6_6.drawPath((Path)var7_7 /* !! */ , (Paint)var34_35);
                                        var1_1.restore();
                                        ** GOTO lbl272
                                    }
                                    var8_8 = 4;
                                    if (var23_23 == 0) {
                                        var34_35.setColor(-16777216);
                                        var15_15 /* !! */  = 255;
                                        var37_38 = 3.57E-43f;
                                        var34_35.setAlpha(var15_15 /* !! */ );
                                        var6_6.drawRect(var30_31, (Paint)var34_35);
                                    }
                                    if (var39_40 == 0) break block47;
                                    wz3.e(var6_6, var30_31, (Paint)var29_30 /* !! */ );
                                    var6_6.drawRect(var30_31, (Paint)var34_35);
                                    var37_38 = ((Integer)var18_18.f()).intValue();
                                    var16_16 = 1076048691;
                                    var36_37 = 2.55f;
                                    var15_15 /* !! */  = (int)(var37_38 *= var36_37);
                                    var29_30 /* !! */ .setAlpha(var15_15 /* !! */ );
                                    var14_14 = (Path)var40_41.f();
                                    var7_7 /* !! */ .set((Path)var14_14);
                                    var7_7 /* !! */ .transform(var17_17);
                                    var6_6.drawPath((Path)var7_7 /* !! */ , (Paint)var29_30 /* !! */ );
                                    var1_1.restore();
                                    ** GOTO lbl272
                                }
                                var14_14 = (Path)var40_41.f();
                                var7_7 /* !! */ .set((Path)var14_14);
                                var7_7 /* !! */ .transform(var17_17);
                                var6_6.drawPath((Path)var7_7 /* !! */ , (Paint)var29_30 /* !! */ );
                                ** continue;
                            }
                            var15_15 /* !! */  = 2;
                            var37_38 = 2.8E-45f;
                            var8_8 = 4;
                            var16_16 = (int)var9_9 /* !! */ .isEmpty();
                            if (var16_16 != 0) ** GOTO lbl275
                            var36_37 = 0.0f;
                            var18_18 = null;
                            for (var16_16 = 0; var16_16 < (var39_40 = var29_30 /* !! */ .size()); var16_16 += var39_40) {
                                var28_28 /* !! */  = ((kh1_0)var29_30 /* !! */ .get((int)var16_16)).a;
                                var9_9 /* !! */  = kH1$a.MASK_MODE_NONE;
                                if (var28_28 /* !! */  == var9_9 /* !! */ ) ** break;
                                ** continue;
                                var39_40 = 1;
                                var22_22 = 1.4E-45f;
                            }
                            var16_16 = 255;
                            var36_37 = 3.57E-43f;
                            var39_40 = 1;
                            var22_22 = 1.4E-45f;
                            var34_35.setAlpha(var16_16);
                            var6_6.drawRect(var30_31, (Paint)var34_35);
                        }
                        var15_15 /* !! */  = 23;
                        var37_38 = 3.2E-44f;
                        var16_16 = 19;
                        var36_37 = 2.7E-44f;
                        var8_8 = 2;
                    }
                    var29_30 /* !! */  = Yo1.a;
                    var1_1.restore();
                }
                if ((var29_30 /* !! */  = var5_5.s) != null) {
                    var10_10 = Build.VERSION.SDK_INT;
                    var14_14 = var5_5.g;
                    var16_16 = 23;
                    var36_37 = 3.2E-44f;
                    if (var10_10 < var16_16) {
                        var10_10 = 19;
                        var11_11 = 2.7E-44f;
                        var6_6.saveLayer(var30_31, (Paint)var14_14, var10_10);
                    } else {
                        var6_6.saveLayer(var30_31, (Paint)var14_14);
                    }
                    this.k(var1_1);
                    var29_30 /* !! */  = var5_5.s;
                    var15_15 /* !! */  = 0;
                    var37_38 = 0.0f;
                    var14_14 = null;
                    var18_18 = var2_2;
                    var20_20 = var3_3;
                    var29_30 /* !! */ .i(var6_6, var2_2, var3_3, null);
                    var1_1.restore();
                }
                var1_1.restore();
            }
            if ((var10_10 = (int)var5_5.y) != 0 && (var29_30 /* !! */  = var5_5.z) != null) {
                var14_14 = Paint.Style.STROKE;
                var29_30 /* !! */ .setStyle((Paint.Style)var14_14);
                var5_5.z.setColor(-251901);
                var5_5.z.setStrokeWidth(4.0f);
                var29_30 /* !! */  = var5_5.z;
                var6_6.drawRect(var30_31, (Paint)var29_30 /* !! */ );
                var29_30 /* !! */  = var5_5.z;
                var14_14 = Paint.Style.FILL;
                var29_30 /* !! */ .setStyle((Paint.Style)var14_14);
                var29_30 /* !! */  = var5_5.z;
                var15_15 /* !! */  = 1357638635;
                var37_38 = 3.1664855E10f;
                var29_30 /* !! */ .setColor(var15_15 /* !! */ );
                var29_30 /* !! */  = var5_5.z;
                var6_6.drawRect(var30_31, (Paint)var29_30 /* !! */ );
            }
            this.o();
        }
    }

    public final void j() {
        Object object = this.u;
        if (object != null) {
            return;
        }
        object = this.t;
        if (object == null) {
            object = Collections.emptyList();
            this.u = object;
            return;
        }
        object = new ArrayList();
        this.u = object;
        object = this.t;
        while (object != null) {
            List list = this.u;
            list.add(object);
            object = ((kw_1)object).t;
        }
    }

    public final void k(Canvas canvas) {
        Hq hq = Yo1.a;
        hq = this.i;
        float f5 = ((RectF)hq).left;
        float f6 = 1.0f;
        float f7 = f5 - f6;
        float f8 = ((RectF)hq).top - f6;
        float f11 = ((RectF)hq).right + f6;
        float f12 = ((RectF)hq).bottom + f6;
        bp1_1 bp1_12 = this.h;
        canvas.drawRect(f7, f8, f11, f12, (Paint)bp1_12);
    }

    public abstract void l(Canvas var1, Matrix var2, int var3, bw0_0 var4);

    public py_0 m() {
        return this.p.w;
    }

    public final boolean n() {
        boolean bl2;
        Object object = this.q;
        if (object != null && !(bl2 = ((ArrayList)(object = ((lh1_0)object).a)).isEmpty())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final void o() {
        Object object = this.o.a.a;
        Object object2 = this.p.c;
        int n3 = ((Gq2)object).a;
        if (n3 != 0) {
            boolean bl2;
            Object object3 = ((Gq2)object).c;
            WK1 wK1 = (WK1)((HashMap)object3).get(object2);
            if (wK1 == null) {
                wK1 = new WK1();
                ((HashMap)object3).put(object2, wK1);
            }
            wK1.a = n3 = wK1.a + 1;
            int n4 = -1 >>> 1;
            if (n3 == n4) {
                wK1.a = n3 /= 2;
            }
            if (bl2 = ((String)object2).equals(object3 = "__container")) {
                boolean bl3;
                object = ((Gq2)object).b;
                object.getClass();
                object2 = new Np$a((Np)object);
                while (bl3 = ((gg1_1)object2).hasNext()) {
                    object = (Gq2$a)((gg1_1)object2).next();
                    object.a();
                }
            }
        }
    }

    public final void p(iw_0 iw_02) {
        this.v.remove(iw_02);
    }

    public void q(ko1 ko12, int n3, ArrayList arrayList, ko1 ko13) {
    }

    public void r(boolean bl2) {
        bp1_1 bp1_12;
        if (bl2 && (bp1_12 = this.z) == null) {
            this.z = bp1_12 = new Paint();
        }
        this.y = bl2;
    }

    public void s(float f5) {
        int n3;
        Object object = Yo1.a;
        object = this.w;
        iw_0 iw_02 = ((Nq3)object).j;
        if (iw_02 != null) {
            iw_02.j(f5);
        }
        if ((iw_02 = ((Nq3)object).m) != null) {
            iw_02.j(f5);
        }
        if ((iw_02 = ((Nq3)object).n) != null) {
            iw_02.j(f5);
        }
        if ((iw_02 = ((Nq3)object).f) != null) {
            iw_02.j(f5);
        }
        if ((iw_02 = ((Nq3)object).g) != null) {
            iw_02.j(f5);
        }
        if ((iw_02 = ((Nq3)object).h) != null) {
            iw_02.j(f5);
        }
        if ((iw_02 = ((Nq3)object).i) != null) {
            iw_02.j(f5);
        }
        if ((iw_02 = ((Nq3)object).k) != null) {
            iw_02.j(f5);
        }
        if ((object = ((Nq3)object).l) != null) {
            ((iw_0)object).j(f5);
        }
        object = this.q;
        int n4 = 0;
        iw_02 = null;
        if (object != null) {
            Object object2;
            int n7;
            for (n3 = 0; n3 < (n7 = ((ArrayList)(object2 = ((lh1_0)object).a)).size()); ++n3) {
                object2 = (iw_0)((ArrayList)object2).get(n3);
                ((iw_0)object2).j(f5);
            }
            object = Yo1.a;
        }
        if ((object = this.r) != null) {
            ((iw_0)object).j(f5);
        }
        if ((object = this.s) != null) {
            ((kw_1)object).s(f5);
        }
        while (n4 < (n3 = ((ArrayList)(object = this.v)).size())) {
            object = (iw_0)((ArrayList)object).get(n4);
            ((iw_0)object).j(f5);
            ++n4;
        }
    }
}

