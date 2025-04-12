/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.graphics.SurfaceTexture$OnFrameAvailableListener
 *  android.media.MediaFormat
 *  android.opengl.GLES20
 *  android.opengl.Matrix
 */
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.media3.common.d;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.GlUtil$GlException;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Renamed from kT2
 */
public final class kt2_1
implements LB3,
jk_0 {
    public final AtomicBoolean a;
    public final AtomicBoolean b;
    public final BB2 c;
    public final SW0 d;
    public final Dn3 e;
    public final Dn3 f;
    public final float[] g;
    public final float[] h;
    public int i;
    public SurfaceTexture j;
    public volatile int k;
    public int l;
    public byte[] m;

    public kt2_1() {
        Object object = new AtomicBoolean();
        this.a = object;
        object = new AtomicBoolean(true);
        this.b = object;
        this.c = object = new Object();
        this.d = object = new SW0();
        this.e = object = new Dn3();
        this.f = object = new Dn3();
        int n3 = 16;
        float[] fArray = new float[n3];
        this.g = fArray;
        object = new float[n3];
        this.h = (float[])object;
        this.k = 0;
        this.l = -1;
    }

    public final void a(float[] fArray, long l2) {
        this.d.c.a(l2, fArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(float[] fArray) {
        Object object;
        int n3;
        float[] fArray2;
        float[] fArray3;
        float f5;
        Object object2;
        float f6;
        Object object3;
        FloatBuffer floatBuffer;
        float[] fArray4;
        float f7;
        Object object4;
        float f8;
        float[] fArray5;
        Object object5;
        Object object6;
        kt2_1 kt2_12 = this;
        int n4 = 16384;
        Object object7 = 2.2959E-41f;
        GLES20.glClear((int)n4);
        try {
            GlUtil.b();
        }
        catch (GlUtil$GlException glUtil$GlException) {
            object6 = "Failed to draw a frame";
            Cx.d((String)object6, glUtil$GlException);
        }
        object6 = kt2_12.a;
        int n7 = 1;
        n4 = (int)(((AtomicBoolean)object6).compareAndSet(n7 != 0, false) ? 1 : 0);
        int n8 = 2;
        if (n4 != 0) {
            object6 = kt2_12.j;
            object6.getClass();
            object6.updateTexImage();
            try {
                GlUtil.b();
            }
            catch (GlUtil$GlException glUtil$GlException) {
                object6 = "Failed to draw a frame";
                Cx.d((String)object6, glUtil$GlException);
            }
            object6 = kt2_12.b;
            n4 = (int)(((AtomicBoolean)object6).compareAndSet(n7 != 0, false) ? 1 : 0);
            if (n4 != 0) {
                object6 = kt2_12.g;
                Matrix.setIdentityM((float[])object6, (int)0);
            }
            object6 = kt2_12.j;
            long l2 = object6.getTimestamp();
            object5 = kt2_12.e;
            synchronized (object5) {
                object6 = ((Dn3)object5).d(l2, false);
            }
            object6 = (Long)object6;
            if (object6 != null) {
                object5 = kt2_12.d;
                fArray5 = kt2_12.g;
                long l3 = (Long)object6;
                if ((object6 = (Object)((float[])((SW0)object5).c.f(l3))) != null) {
                    f8 = (float)object6[0];
                    object4 = -object6[n7];
                    object7 = -object6[n8];
                    f7 = Matrix.length((float)f8, (float)object4, (float)object7);
                    fArray4 = ((SW0)object5).b;
                    floatBuffer = null;
                    float f11 = f7 - 0.0f;
                    object3 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    if (object3) {
                        double d2 = Math.toDegrees(f7);
                        float f12 = (float)d2;
                        f6 = f8 / f7;
                        object2 = object4 / f7;
                        f5 = object7 / f7;
                        object3 = false;
                        floatBuffer = null;
                        Matrix.setRotateM((float[])fArray4, (int)0, (float)f12, (float)f6, (float)object2, (float)f5);
                    } else {
                        Matrix.setIdentityM((float[])fArray4, (int)0);
                    }
                    n4 = (int)(((SW0)object5).d ? 1 : 0);
                    if (n4 == 0) {
                        object6 = ((SW0)object5).a;
                        fArray3 = ((SW0)object5).b;
                        SW0.a((float[])object6, fArray3);
                        ((SW0)object5).d = n7;
                    }
                    fArray4 = ((SW0)object5).b;
                    fArray2 = ((SW0)object5).a;
                    n3 = 0;
                    f8 = 0.0f;
                    fArray3 = null;
                    object3 = false;
                    floatBuffer = null;
                    f7 = 0.0f;
                    Matrix.multiplyMM((float[])fArray5, (int)0, (float[])fArray2, (int)0, (float[])fArray4, (int)0);
                }
            }
            if ((object6 = (zB2)kt2_12.f.f(l2)) != null) {
                BB2 bB2 = kt2_12.c;
                bB2.getClass();
                int n10 = BB2.b((zB2)object6);
                if (n10 != 0) {
                    bB2.a = n10 = ((zB2)object6).c;
                    object = new BB2$a;
                    object5 = ((zB2)object6).a.a[0];
                    object((zB2$b)object5);
                    bB2.b = object;
                    n10 = (int)(((zB2)object6).d ? 1 : 0);
                    if (n10 == 0) {
                        object = new BB2$a;
                        object6 = ((zB2)object6).b.a[0];
                        object((zB2$b)object6);
                    }
                    bB2.getClass();
                }
            }
        }
        fArray5 = kt2_12.h;
        fArray4 = kt2_12.g;
        n3 = 0;
        f8 = 0.0f;
        fArray3 = null;
        f7 = 0.0f;
        object3 = false;
        floatBuffer = null;
        fArray2 = fArray;
        Matrix.multiplyMM((float[])fArray5, (int)0, (float[])fArray, (int)0, (float[])fArray4, (int)0);
        object6 = kt2_12.c;
        int n14 = kt2_12.i;
        object = kt2_12.h;
        object5 = ((BB2)object6).b;
        if (object5 == null) {
            return;
        }
        int n15 = ((BB2)object6).a;
        float[] fArray6 = n15 == n7 ? BB2.j : (n15 == n8 ? BB2.k : BB2.i);
        n15 = ((BB2)object6).e;
        GLES20.glUniformMatrix3fv((int)n15, (int)n7, (boolean)false, (float[])fArray6, (int)0);
        n8 = ((BB2)object6).d;
        GLES20.glUniformMatrix4fv((int)n8, (int)n7, (boolean)false, (float[])object, (int)0);
        GLES20.glActiveTexture((int)33984);
        GLES20.glBindTexture((int)36197, (int)n14);
        n7 = ((BB2)object6).h;
        GLES20.glUniform1i((int)n7, (int)0);
        try {
            GlUtil.b();
        }
        catch (GlUtil$GlException glUtil$GlException) {}
        n15 = ((BB2)object6).f;
        floatBuffer = ((BB2$a)object5).b;
        int n16 = 5126;
        object4 = 7.183E-42f;
        f7 = 0.0f;
        n3 = 3;
        f8 = 4.2E-45f;
        int n17 = 12;
        GLES20.glVertexAttribPointer((int)n15, (int)n3, (int)n16, (boolean)false, (int)n17, (Buffer)floatBuffer);
        try {
            GlUtil.b();
        }
        catch (GlUtil$GlException glUtil$GlException) {}
        int n18 = ((BB2)object6).g;
        object6 = ((BB2$a)object5).c;
        int n19 = 5126;
        object2 = 7.183E-42f;
        f5 = 0.0f;
        int n20 = 2;
        f6 = 2.8E-45f;
        int n21 = 8;
        GLES20.glVertexAttribPointer((int)n18, (int)n20, (int)n19, (boolean)false, (int)n21, (Buffer)object6);
        try {
            GlUtil.b();
        }
        catch (GlUtil$GlException glUtil$GlException) {}
        n4 = ((BB2$a)object5).d;
        n7 = ((BB2$a)object5).a;
        GLES20.glDrawArrays((int)n4, (int)0, (int)n7);
        try {
            GlUtil.b();
            return;
        }
        catch (GlUtil$GlException glUtil$GlException) {
            return;
        }
    }

    public final SurfaceTexture c() {
        Object object = 1065353216;
        float f5 = 1.0f;
        int n3 = 0x3F000000;
        float f6 = 0.5f;
        GLES20.glClearColor((float)f6, (float)f6, (float)f6, (float)f5);
        GlUtil.b();
        BB2 bB2 = this.c;
        bB2.a();
        GlUtil.b();
        object = 1;
        f5 = Float.MIN_VALUE;
        Object object2 = new int[object];
        GLES20.glGenTextures((int)object, (int[])object2, (int)0);
        GlUtil.b();
        object = object2[0];
        n3 = 36197;
        f6 = 5.0723E-41f;
        GlUtil.a(n3, object);
        try {
            this.i = object;
        }
        catch (GlUtil$GlException glUtil$GlException) {
            object2 = "Failed to initialize the renderer";
            Cx.d((String)object2, glUtil$GlException);
        }
        n3 = this.i;
        bB2 = new SurfaceTexture(n3);
        this.j = bB2;
        object2 = new jT2(this);
        bB2.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener)object2);
        return this.j;
    }

    public final void f() {
        this.e.b();
        SW0 sW0 = this.d;
        sW0.c.b();
        sW0.d = false;
        this.b.set(true);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void q(long var1_1, long var3_2, d var5_3, MediaFormat var6_4) {
        block25: {
            block27: {
                block26: {
                    block24: {
                        block22: {
                            block21: {
                                var7_5 = this;
                                var8_6 = var5_3;
                                var9_7 = 4;
                                var10_8 = 5.6E-45f;
                                var11_9 = 0;
                                var12_10 /* !! */  = null;
                                var13_11 = 2;
                                var14_12 = 1;
                                var15_13 = this.e;
                                var16_14 = var1_1;
                                var15_13.a(var3_2, var16_14);
                                var15_13 = var5_3.A;
                                var17_15 = var5_3.B;
                                var16_14 = this.m;
                                var18_16 = this.l;
                                this.m = (byte[])var15_13;
                                var19_17 = -1;
                                var20_18 = 0.0f / 0.0f;
                                if (var17_15 == var19_17) {
                                    var17_15 = this.k;
                                }
                                var7_5.l = var17_15;
                                if (var18_16 == var17_15 && (var17_15 = (int)Arrays.equals((byte[])var16_14, (byte[])(var8_6 = (Object)var7_5.m))) != 0) break block25;
                                var8_6 = var7_5.m;
                                var19_17 = 0;
                                var20_18 = 0.0f;
                                var15_13 = null;
                                if (var8_6 == null) break block26;
                                var21_19 = var7_5.l;
                                var22_20 = new Xm2((byte[])var8_6);
                                var22_20.J(var9_7);
                                var17_15 = var22_20.i();
                                var22_20.I(0);
                                var23_21 = 1886547818;
                                var24_22 = 3.0012025E29f;
                                if (var17_15 != var23_21) break block21;
                                var17_15 = 8;
                                var22_20.J(var17_15);
                                var17_15 = var22_20.b;
                                var23_21 = var22_20.c;
                                while (var17_15 < var23_21) {
                                    block23: {
                                        var25_23 = var22_20.i() + var17_15;
                                        if (var25_23 <= var17_15 || var25_23 > var23_21) break block22;
                                        var17_15 = var22_20.i();
                                        var26_24 = 2037673328;
                                        var27_25 = 7.9321256E34f;
                                        if (var17_15 == var26_24) break block23;
                                        var26_24 = 1836279920;
                                        var27_25 = 4.7081947E27f;
                                        if (var17_15 == var26_24) break block23;
                                        var22_20.I(var25_23);
                                        var17_15 = var25_23;
                                        continue;
                                    }
                                    var22_20.H(var25_23);
                                    var8_6 = AB2.a((Xm2)var22_20);
                                    break block24;
                                }
                                break block22;
                            }
                            try {
                                var8_6 = AB2.a((Xm2)var22_20);
                                break block24;
                            }
                            catch (ArrayIndexOutOfBoundsException v0) {}
                        }
                        var17_15 = 0;
                        var8_6 = null;
                    }
                    if (var8_6 != null) {
                        var18_16 = var8_6.size();
                        if (var18_16 != var14_12) {
                            if (var18_16 == var13_11) {
                                var22_20 = (zB2$a)var8_6.get(0);
                                var8_6 = (zB2$a)var8_6.get(var14_12);
                                var15_13 = new zB2((zB2$a)var22_20, (zB2$a)var8_6, var21_19);
                            }
                        } else {
                            var8_6 = (zB2$a)var8_6.get(0);
                            var15_13 = new zB2((zB2$a)var8_6, (zB2$a)var8_6, var21_19);
                        }
                    }
                }
                if (var15_13 != null && (var17_15 = (int)BB2.b((zB2)var15_13)) != 0) break block27;
                var17_15 = var7_5.l;
                var19_17 = 0x43340000;
                var28_26 = Math.toRadians(180.0f);
                var20_18 = (float)var28_26;
                var21_19 = 1135869952;
                var30_27 = Math.toRadians(360.0f);
                var32_28 = (float)var30_27;
                var18_16 = 36;
                var33_29 = 5.0E-44f;
                var24_22 = var18_16;
                var24_22 = var20_18 / var24_22;
                var25_23 = 72;
                var34_30 = 1.01E-43f;
                var27_25 = var25_23;
                var27_25 = var32_28 / var27_25;
                var35_31 = 15984;
                var36_32 = new float[var35_31];
                var11_9 = 10656;
                var12_10 /* !! */  = new float[var11_9];
                var9_7 = 0;
                var10_8 = 0.0f;
                var37_33 = 0;
                var38_34 = 0.0f;
                var39_35 = 0;
                while (var9_7 < var18_16) {
                    var33_29 = (float)var9_7 * var24_22;
                    var40_36 = 2.0f;
                    var41_37 = var20_18 / var40_36;
                    var33_29 -= var41_37;
                    var25_23 = var9_7 + 1;
                    var42_38 = (float)var25_23 * var24_22 - var41_37;
                    var14_12 = 0;
                    while (var14_12 < (var13_11 = 73)) {
                        var43_39 = var42_38;
                        var44_40 = var33_29;
                        var45_41 = var25_23;
                        var13_11 = var37_33;
                        var46_42 = var39_35;
                        var18_16 = 0;
                        var33_29 = 0.0f;
                        var22_20 = null;
                        var25_23 = 2;
                        var34_30 = 2.8E-45f;
                        while (var18_16 < var25_23) {
                            block28: {
                                var34_30 = var18_16 == 0 ? var44_40 : var43_39;
                                var47_43 = (float)var14_12 * var27_25;
                                var48_44 = 3.1415927f + var47_43;
                                var38_34 = var32_28 / var40_36;
                                var48_44 -= var38_34;
                                var38_34 = 1.4E-45f;
                                var39_35 = var13_11 + 1;
                                var49_45 = var27_25;
                                var27_25 = 50.0f;
                                var50_46 = var14_12;
                                var51_47 = var20_18;
                                var52_48 = var27_25;
                                var26_24 = var17_15;
                                var54_49 = var48_44;
                                var56_50 = Math.sin(var54_49) * var52_48;
                                var58_51 = var17_15;
                                var59_52 = var34_30;
                                var61_53 = Math.cos(var59_52);
                                var37_33 = var18_16;
                                var63_54 = var24_22;
                                var64_55 = var61_53 * var56_50;
                                var36_32[var13_11] = var33_29 = -((float)var64_55);
                                var18_16 = 2;
                                var33_29 = 2.8E-45f;
                                var23_21 = var13_11 + 2;
                                var56_50 = Math.sin(var59_52);
                                var66_56 = var9_7;
                                var22_20 = var12_10 /* !! */ ;
                                var67_57 = var56_50 * var52_48;
                                var36_32[var39_35] = var10_8 = (float)var67_57;
                                var10_8 = 4.2E-45f;
                                var11_9 = var13_11 + 3;
                                var54_49 = Math.cos(var54_49) * var52_48;
                                var52_48 = Math.cos(var59_52) * var54_49;
                                var36_32[var23_21] = var48_44 = (float)var52_48;
                                var48_44 = 1.4E-45f;
                                var14_12 = var46_42 + 1;
                                var12_10 /* !! */ [var46_42] = var47_43 /= var32_28;
                                var69_58 = 2;
                                var70_59 = var46_42 + 2;
                                var12_10 /* !! */ [var14_12] = var47_43 = (float)(var9_7 += var37_33) * var24_22 / var20_18;
                                if (var50_46 != 0 || var37_33 != 0) break block28;
                                var9_7 = var37_33;
                                var17_15 = var50_46;
                                var69_58 = 72;
                                var47_43 = 1.01E-43f;
                                var14_12 = 1;
                                var19_17 = 3;
                                var20_18 = 4.2E-45f;
                                ** GOTO lbl-1000
                            }
                            var17_15 = var50_46;
                            var69_58 = 72;
                            var47_43 = 1.01E-43f;
                            var9_7 = var37_33;
                            var14_12 = 1;
                            var19_17 = 3;
                            var20_18 = 4.2E-45f;
                            if (var50_46 == var69_58 && var37_33 == var14_12) lbl-1000:
                            // 2 sources

                            {
                                System.arraycopy(var36_32, var13_11, var36_32, var11_9, var19_17);
                                var13_11 += 6;
                                var23_21 = 2;
                                var24_22 = 2.8E-45f;
                                System.arraycopy(var22_20, var46_42, var22_20, var70_59, var23_21);
                                var25_23 = 4;
                                var34_30 = 5.6E-45f;
                                var46_42 += var25_23;
                            } else {
                                var23_21 = 2;
                                var24_22 = 2.8E-45f;
                                var25_23 = 4;
                                var34_30 = 5.6E-45f;
                                var46_42 = var70_59;
                                var13_11 = var11_9;
                            }
                            var70_59 = var9_7 + 1;
                            var14_12 = var17_15;
                            var12_10 /* !! */  = (float[])var22_20;
                            var27_25 = var49_45;
                            var20_18 = var51_47;
                            var17_15 = var58_51;
                            var9_7 = var66_56;
                            var24_22 = var63_54;
                            var25_23 = 2;
                            var34_30 = 2.8E-45f;
                            var18_16 = var70_59;
                        }
                        var58_51 = var17_15;
                        var66_56 = var9_7;
                        var22_20 = var12_10 /* !! */ ;
                        var17_15 = var14_12;
                        var51_47 = var20_18;
                        var63_54 = var24_22;
                        var49_45 = var27_25;
                        var69_58 = 72;
                        var47_43 = 1.01E-43f;
                        var19_17 = 3;
                        var23_21 = 2;
                        var34_30 = 5.6E-45f;
                        var14_12 = var70_59 = var14_12 + 1;
                        var39_35 = var46_42;
                        var37_33 = var13_11;
                        var33_29 = var44_40;
                        var25_23 = var45_41;
                        var17_15 = var58_51;
                        var42_38 = var43_39;
                    }
                    var45_41 = var25_23;
                    var9_7 = var25_23;
                    var13_11 = 2;
                    var14_12 = 1;
                    var18_16 = 36;
                    var33_29 = 5.0E-44f;
                    var25_23 = 72;
                    var34_30 = 1.01E-43f;
                }
                var58_51 = var17_15;
                var22_20 = var12_10 /* !! */ ;
                var70_59 = 0;
                var48_44 = 0.0f;
                var71_60 = new zB2$b(0, var14_12, var36_32, var12_10 /* !! */ );
                var72_61 = new zB2$b[var14_12];
                var72_61[0] = var71_60;
                var8_6 = new zB2$a(var72_61);
                var69_58 = var17_15;
                var15_13 = new zB2((zB2$a)var8_6, (zB2$a)var8_6, var17_15);
            }
            var71_60 = var7_5.f;
            var71_60.a(var3_2, var15_13);
        }
    }
}

