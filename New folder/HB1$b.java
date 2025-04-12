/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Rect
 */
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class HB1$b
extends Lambda
implements Function1 {
    public final /* synthetic */ Rect c;
    public final /* synthetic */ i70_0 d;
    public final /* synthetic */ Nc e;
    public final /* synthetic */ Matrix f;
    public final /* synthetic */ yc1_1 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ UI2 j;
    public final /* synthetic */ Hq k;
    public final /* synthetic */ QB1 l;
    public final /* synthetic */ Map m;
    public final /* synthetic */ zc1_1 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Context u;
    public final /* synthetic */ Function0 v;
    public final /* synthetic */ tr1_0 w;

    public HB1$b(Rect rect, i70_0 i70_02, Nc nc, Matrix matrix, yc1_1 yc1_12, boolean bl2, boolean bl3, UI2 uI2, Hq hq, QB1 qB1, Map map2, zc1_1 zc1_12, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8, boolean bl9, Context context, Function0 function0, tr1_0 tr1_02) {
        this.c = rect;
        this.d = i70_02;
        this.e = nc;
        this.f = matrix;
        this.g = yc1_12;
        this.h = bl2;
        this.i = bl3;
        this.j = uI2;
        this.k = hq;
        this.l = qB1;
        this.m = map2;
        this.n = zc1_12;
        this.o = bl4;
        this.p = bl5;
        this.q = bl6;
        this.r = bl7;
        this.s = bl8;
        this.t = bl9;
        this.u = context;
        this.v = function0;
        this.w = tr1_02;
        super(1);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object var1_1) {
        block29: {
            block27: {
                block26: {
                    var1_1 /* !! */  = (Kt0)var1_1 /* !! */ ;
                    Intrinsics.checkNotNullParameter(var1_1 /* !! */ , "$this$Canvas");
                    var2_3 = var1_1 /* !! */ .M0().a();
                    var3_4 = this.c;
                    var4_5 = var3_4.width();
                    var5_6 = var3_4.height();
                    var6_7 = bo1_1.a(var4_5, var5_6);
                    var8_8 = C63.d(var1_1 /* !! */ .l());
                    var9_9 = ok1_1.b(var8_8);
                    var10_10 = var1_1 /* !! */ .l();
                    var12_11 = C63.b(var10_10);
                    var13_12 = ok1_1.b(var12_11);
                    var14_13 = dj1.a(var9_9, var13_12);
                    var16_14 = var1_1 /* !! */ .l();
                    var16_14 = this.d.a(var6_7, var16_14);
                    var18_15 = C63.d(var6_7);
                    var19_16 = YS2.a(var16_14) * var18_15;
                    var20_17 = (int)var19_16;
                    var4_5 = C63.b(var6_7);
                    var21_18 = (int)(YS2.b(var16_14) * var4_5);
                    var22_19 = dj1.a(var20_17, var21_18);
                    var24_20 = var1_1 /* !! */ .getLayoutDirection();
                    var25_21 = this.e;
                    var6_7 = var25_21.a(var22_19, var14_13, var24_20);
                    var1_1 /* !! */  = this.f;
                    var1_1 /* !! */ .reset();
                    var20_17 = 32;
                    var26_22 = var6_7 >> var20_17;
                    var28_23 = (int)var26_22;
                    var18_15 = var28_23;
                    var22_19 = 0xFFFFFFFFL;
                    var29_24 = (int)(var6_7 &= var22_19);
                    var4_5 = var29_24;
                    var1_1 /* !! */ .preTranslate(var18_15, var4_5);
                    var4_5 = YS2.a(var16_14);
                    var5_6 = YS2.b(var16_14);
                    var1_1 /* !! */ .preScale(var4_5, var5_6);
                    var30_25 /* !! */  = AC1.MergePathsApi19;
                    var31_26 = this.g;
                    var9_9 = (int)this.h;
                    var31_26.h((AC1)var30_25 /* !! */ , (boolean)var9_9);
                    var21_18 = (int)this.i;
                    var31_26.e = var21_18;
                    var30_25 /* !! */  = this.j;
                    var31_26.w = var30_25 /* !! */ ;
                    var31_26.e();
                    var30_25 /* !! */  = this.k;
                    var31_26.M = var30_25 /* !! */ ;
                    var30_25 /* !! */  = this.l;
                    var31_26.p((QB1)var30_25 /* !! */ );
                    var30_25 /* !! */  = var31_26.k;
                    var32_27 = this.m;
                    if (var32_27 != var30_25 /* !! */ ) {
                        var31_26.k = var32_27;
                        var31_26.invalidateSelf();
                    }
                    var30_25 /* !! */  = this.w;
                    var32_27 = (zc1_1)var30_25 /* !! */ .getValue();
                    var13_12 = 0;
                    var12_11 = 0.0f;
                    var25_21 = this.n;
                    if (var25_21 != var32_27) {
                        var32_27 = (zc1_1)var30_25 /* !! */ .getValue();
                        var33_28 = "drawable";
                        if (var32_27 != null) {
                            Intrinsics.checkNotNullParameter((Object)var31_26, (String)var33_28);
                            throw null;
                        }
                        if (var25_21 != null) {
                            Intrinsics.checkNotNullParameter((Object)var31_26, (String)var33_28);
                            throw null;
                        }
                        var30_25 /* !! */ .setValue(var25_21);
                    }
                    if ((var21_18 = (int)var31_26.s) != (var9_9 = this.o)) {
                        var31_26.s = var9_9;
                        var30_25 /* !! */  = var31_26.p;
                        if (var30_25 /* !! */  != null) {
                            var30_25 /* !! */ .r((boolean)var9_9);
                        }
                    }
                    var21_18 = (int)this.p;
                    var31_26.t = var21_18;
                    var31_26.u = var21_18 = (int)this.q;
                    var31_26.n = var21_18 = this.r;
                    var21_18 = var31_26.o;
                    var9_9 = this.s;
                    if (var9_9 != var21_18) {
                        var31_26.o = var9_9;
                        var30_25 /* !! */  = var31_26.p;
                        if (var30_25 /* !! */  != null) {
                            var30_25 /* !! */ .L = var9_9;
                        }
                        var31_26.invalidateSelf();
                    }
                    if ((var9_9 = this.t) != (var21_18 = var31_26.v)) {
                        var31_26.v = var9_9;
                        var31_26.invalidateSelf();
                    }
                    var30_25 /* !! */  = yc1_1.T.iterator();
                    var9_9 = 0;
                    var32_27 = null;
                    var8_8 = 0.0f;
                    while ((var20_17 = (int)var30_25 /* !! */ .hasNext()) != 0) {
                        var32_27 = (String)var30_25 /* !! */ .next();
                        var25_21 = var31_26.a;
                        if ((var32_27 = var25_21.d((String)var32_27)) == null) continue;
                    }
                    if ((var21_18 = var31_26.b(var30_25 /* !! */  = this.u)) == 0 && var32_27 != null) {
                        var4_5 = var32_27.b;
                        var31_26.B(var4_5);
                    } else {
                        var30_25 /* !! */  = (Number)this.v.invoke();
                        var4_5 = var30_25 /* !! */ .floatValue();
                        var31_26.B(var4_5);
                    }
                    var21_18 = var3_4.width();
                    var34_29 = var3_4.height();
                    var9_9 = 0;
                    var8_8 = 0.0f;
                    var32_27 = null;
                    var31_26.setBounds(0, 0, var21_18, var34_29);
                    var2_3 = Nf.a(var2_3);
                    var3_4 = var31_26.p;
                    var30_25 /* !! */  = var31_26.a;
                    if (var3_4 == null) return Unit.a;
                    if (var30_25 /* !! */  == null) {
                        return Unit.a;
                    }
                    var30_25 /* !! */  = var31_26.M;
                    if (var30_25 /* !! */  == null) {
                        var30_25 /* !! */  = Yo1.a;
                    }
                    var25_21 = Hq.ENABLED;
                    if (var30_25 /* !! */  == var25_21) {
                        var21_18 = 1;
                        var4_5 = 1.4E-45f;
                    } else {
                        var21_18 = 0;
                        var4_5 = 0.0f;
                        var30_25 /* !! */  = null;
                    }
                    var25_21 = yc1_1.U;
                    var33_28 = var31_26.N;
                    var35_30 = var31_26.Q;
                    var36_31 = var31_26.b;
                    if (var21_18 == 0) ** GOTO lbl143
                    var33_28.acquire();
                    var37_32 = var31_26.C();
                    if (var37_32 != 0) {
                        var38_33 = var36_31.e();
                        var31_26.B(var38_33);
                    }
lbl143:
                    // 4 sources

                    if ((var37_32 = var31_26.e) == 0) ** GOTO lbl168
                    try {
                        block28: {
                            var37_32 = var31_26.q;
                            var39_34 = var31_26.x;
                            if (!var39_34) break block28;
                            var2_3.save();
                            var2_3.concat((Matrix)var1_1 /* !! */ );
                            var31_26.n((Canvas)var2_3, (g30_0)var3_4);
                            var2_3.restore();
                            ** GOTO lbl178
                        }
                        var3_4.i((Canvas)var2_3, (Matrix)var1_1 /* !! */ , var37_32, null);
                    }
                    catch (Throwable v0) {
                        try {
                            var1_1 /* !! */  = rx1.a;
                            var1_1 /* !! */ .getClass();
                            var1_1 /* !! */  = Yo1.a;
                        }
                        catch (Throwable var1_2) {
                            break block26;
                        }
                        catch (InterruptedException v1) {
                            break block27;
                        }
lbl168:
                        // 1 sources

                        var37_32 = var31_26.q;
                        var39_35 = var31_26.x;
                        if (var39_35) {
                            var2_3.save();
                            var2_3.concat((Matrix)var1_1 /* !! */ );
                            var31_26.n((Canvas)var2_3, (g30_0)var3_4);
                            var2_3.restore();
                        } else {
                            var3_4.i((Canvas)var2_3, (Matrix)var1_1 /* !! */ , var37_32, null);
                        }
lbl178:
                        // 5 sources

                        var31_26.L = false;
                    }
                    if (var21_18 == 0) return Unit.a;
                    var33_28.release();
                    var40_36 = var3_4.K;
                    var41_38 = var36_31.e();
                    var42_41 = var40_36 == var41_38 ? 0 : (var40_36 > var41_38 ? 1 : -1);
                    if (var42_41 == false) return Unit.a;
                    break block29;
                }
                if (var21_18 == 0) throw var1_2;
                var33_28.release();
                var41_39 = var3_4.K;
                var43_43 = var36_31.e();
                var44_44 = var41_39 == var43_43 ? 0 : (var41_39 > var43_43 ? 1 : -1);
                if (var44_44 == false) throw var1_2;
                var25_21.execute(var35_30);
                throw var1_2;
            }
            if (var21_18 == 0) return Unit.a;
            var33_28.release();
            var40_37 = var3_4.K;
            var41_40 = var36_31.e();
            var42_42 = var40_37 == var41_40 ? 0 : (var40_37 > var41_40 ? 1 : -1);
            if (var42_42 == false) return Unit.a;
        }
        var25_21.execute(var35_30);
        return Unit.a;
    }
}

