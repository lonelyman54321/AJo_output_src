/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.ColorSpace
 *  android.graphics.ColorSpace$Named
 *  android.graphics.Matrix
 *  android.graphics.RectF
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  android.util.DisplayMetrics
 *  android.util.Log
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class vs0 {
    public static final U92 f = U92.a((Object)Yi0.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final U92 g;
    public static final U92 h;
    public static final U92 i;
    public static final Set j;
    public static final vs0$a k;
    public static final Set l;
    public static final ArrayDeque m;
    public final ny_0 a;
    public final DisplayMetrics b;
    public final Kp c;
    public final List d;
    public final M31 e;

    static {
        Object object = U92.e;
        Object object2 = new U92("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, (U92$b)object);
        g = object2;
        object2 = ss0.a;
        object2 = Boolean.FALSE;
        h = U92.a(object2, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = U92.a(object2, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        object = Arrays.asList("image/vnd.wap.wbmp", "image/x-ico");
        object2 = new HashSet(object);
        j = Collections.unmodifiableSet(object2);
        k = object2 = new Object();
        object2 = ImageHeaderParser$ImageType.JPEG;
        object = ImageHeaderParser$ImageType.PNG_A;
        ImageHeaderParser$ImageType imageHeaderParser$ImageType = ImageHeaderParser$ImageType.PNG;
        l = Collections.unmodifiableSet(EnumSet.of(object2, object, imageHeaderParser$ImageType));
        object2 = dz3.a;
        object2 = new ArrayDeque(0);
        m = object2;
    }

    public vs0(ArrayList object, DisplayMetrics displayMetrics, ny_0 ny_02, Kp kp) {
        M31 m31;
        this.e = m31 = M31.a();
        this.d = object;
        object = "Argument must not be null";
        dV0.c(displayMetrics, (String)object);
        this.b = displayMetrics;
        dV0.c(ny_02, (String)object);
        this.a = ny_02;
        dV0.c(kp, (String)object);
        this.c = kp;
    }

    /*
     * Exception decompiling
     */
    public static Bitmap c(ne1 var0, BitmapFactory.Options var1_2, vs0$b var2_3, ny_0 var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [2 : 76->79)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        CharSequence charSequence = new StringBuilder(" (");
        int n3 = bitmap.getAllocationByteCount();
        charSequence.append(n3);
        charSequence.append(")");
        charSequence = charSequence.toString();
        StringBuilder stringBuilder = new StringBuilder("[");
        int n4 = bitmap.getWidth();
        stringBuilder.append(n4);
        stringBuilder.append("x");
        n4 = bitmap.getHeight();
        stringBuilder.append(n4);
        stringBuilder.append("] ");
        bitmap = bitmap.getConfig();
        stringBuilder.append(bitmap);
        stringBuilder.append((String)charSequence);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void e(BitmapFactory.Options options) {
        vs0.f(options);
        ArrayDeque arrayDeque = m;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
            return;
        }
    }

    public static void f(BitmapFactory.Options options) {
        int n3;
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = n3 = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 26;
        if (n4 >= n7) {
            zr.b(options);
            ar_0.b(options);
            ts0.a(options);
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final py_2 a(ne1 var1_1, int var2_2, int var3_3, Z92 var4_4, vs0$b var5_5) {
        var6_6 = this;
        var7_7 = var4_4;
        var8_10 = this.c;
        var9_11 = 65536;
        var10_12 = byte[].class;
        var11_13 = var8_10 = var8_10.c((Class)var10_12, var9_11);
        var11_13 = (byte[])var8_10;
        var8_10 = vs0.class;
        // MONITORENTER : var8_10
        var12_14 = vs0.m;
        // MONITORENTER : var12_14
        var10_12 = var12_14.poll();
        var10_12 = var10_12;
        // MONITOREXIT : var12_14
        if (var10_12 == null) {
            var10_12 = new BitmapFactory.Options();
            vs0.f(var10_12);
        }
        var13_15 = var10_12;
        // MONITOREXIT : var8_10
        var10_12.inTempStorage = (byte[])var11_13;
        var8_10 = vs0.f;
        var14_16 /* !! */  = var8_10 = var7_7.c((U92)var8_10);
        var14_16 /* !! */  = (Yi0)var8_10;
        var8_10 = vs0.g;
        var15_17 /* !! */  = var8_10 = var7_7.c((U92)var8_10);
        var15_17 /* !! */  = (ty2_1)var8_10;
        var8_10 = ss0.f;
        var16_18 = var8_10 = var7_7.c((U92)var8_10);
        var16_18 = (ss0)var8_10;
        var8_10 = vs0.h;
        var17_19 = (Boolean)var7_7.c((U92)var8_10);
        var8_10 = vs0.i;
        var12_14 = var7_7.c((U92)var8_10);
        if (var12_14 == null) ** GOTO lbl-1000
        var18_20 = (var7_7 = (Boolean)var7_7.c((U92)var8_10)).booleanValue();
        if (var18_20) {
            var18_20 = true;
            var19_21 = true;
        } else lbl-1000:
        // 2 sources

        {
            var18_20 = false;
            var7_7 = null;
            var19_21 = false;
        }
        var8_10 = this;
        var12_14 = var1_1;
        var10_12 = var13_15;
        try {
            var7_7 = this.b(var1_1, var13_15, (ss0)var16_18, (Yi0)var14_16 /* !! */ , (ty2_1)var15_17 /* !! */ , var19_21, var2_2, var3_3, var17_19, var5_5);
            var8_10 = var6_6.a;
            var7_7 = py_2.b((ny_0)var8_10, (Bitmap)var7_7);
            return var7_7;
        }
        finally {
            vs0.e(var13_15);
            var6_6.c.put(var11_13);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Bitmap b(ne1 var1_1, BitmapFactory.Options var2_2, ss0 var3_3, Yi0 var4_4, ty2_1 var5_5, boolean var6_6, int var7_7, int var8_8, boolean var9_9, vs0$b var10_10) {
        block80: {
            block82: {
                block81: {
                    block67: {
                        block79: {
                            block70: {
                                block68: {
                                    block71: {
                                        block72: {
                                            block66: {
                                                block76: {
                                                    block77: {
                                                        block78: {
                                                            block75: {
                                                                block74: {
                                                                    block73: {
                                                                        block69: {
                                                                            var11_11 = this;
                                                                            var12_12 = var1_1;
                                                                            var13_13 = var2_2;
                                                                            var14_14 = var3_3;
                                                                            var15_15 /* !! */  = var5_5;
                                                                            var16_16 = var10_10;
                                                                            var17_17 /* !! */  = 1;
                                                                            var18_18 = 1.4E-45f;
                                                                            SystemClock.elapsedRealtimeNanos();
                                                                            var2_2.inJustDecodeBounds = var17_17 /* !! */ ;
                                                                            var19_19 = this.a;
                                                                            vs0.c(var1_1, var2_2, var10_10, var19_19);
                                                                            var20_20 = 0;
                                                                            var21_21 = null;
                                                                            var2_2.inJustDecodeBounds = false;
                                                                            var22_22 = var2_2.outWidth;
                                                                            var23_23 = var2_2.outHeight;
                                                                            var24_24 /* !! */  = new int[]{var22_22, var23_23};
                                                                            var23_23 = var24_24 /* !! */ [0];
                                                                            var22_22 = var24_24 /* !! */ [var17_17 /* !! */ ];
                                                                            var25_25 = -1;
                                                                            var26_26 = 0.0f / 0.0f;
                                                                            if (var23_23 != var25_25 && var22_22 != var25_25) {
                                                                                var25_25 = (int)var6_6;
                                                                            } else {
                                                                                var25_25 = 0;
                                                                                var26_26 = 0.0f;
                                                                                var27_27 = null;
                                                                            }
                                                                            var28_28 = var1_1.c();
                                                                            var29_29 = 90;
                                                                            var30_30 = 1.26E-43f;
                                                                            var31_31 = 270;
                                                                            switch (var28_28) {
                                                                                default: {
                                                                                    var32_32 = 0;
                                                                                    break;
                                                                                }
                                                                                case 7: 
                                                                                case 8: {
                                                                                    var32_32 = 270;
                                                                                    break;
                                                                                }
                                                                                case 5: 
                                                                                case 6: {
                                                                                    var32_32 = 90;
                                                                                    break;
                                                                                }
                                                                                case 3: 
                                                                                case 4: {
                                                                                    var32_32 = 180;
                                                                                }
                                                                            }
                                                                            switch (var28_28) {
                                                                                default: {
                                                                                    var33_33 = 0;
                                                                                    break;
                                                                                }
                                                                                case 2: 
                                                                                case 3: 
                                                                                case 4: 
                                                                                case 5: 
                                                                                case 6: 
                                                                                case 7: 
                                                                                case 8: {
                                                                                    var33_33 = 1;
                                                                                }
                                                                            }
                                                                            var20_20 = -1 << -1;
                                                                            var17_17 /* !! */  = var7_7;
                                                                            if (var7_7 == var20_20) {
                                                                                if (var32_32 != var29_29 && var32_32 != var31_31) {
                                                                                    var31_31 = var8_8;
                                                                                    var17_17 /* !! */  = var23_23;
                                                                                } else {
                                                                                    var31_31 = var8_8;
                                                                                    var17_17 /* !! */  = var22_22;
                                                                                }
                                                                            } else {
                                                                                var31_31 = var8_8;
                                                                            }
                                                                            if (var31_31 == var20_20) {
                                                                                var31_31 = var32_32 != var29_29 && var32_32 != (var20_20 = 270) ? var22_22 : var23_23;
                                                                            }
                                                                            var21_21 = var1_1.d();
                                                                            var34_34 = "Downsampler";
                                                                            if (var23_23 <= 0) break block68;
                                                                            if (var22_22 > 0) break block69;
                                                                            var35_35 = var23_23;
                                                                            var36_37 = var25_25;
                                                                            var37_38 = var28_28;
                                                                            var14_14 = var34_34;
                                                                            var23_23 = var31_31;
                                                                            var38_39 = 3;
                                                                            var39_41 = 4.2E-45f;
                                                                            var40_44 = var22_22;
                                                                            var22_22 = var17_17 /* !! */ ;
                                                                            var17_17 /* !! */  = var40_44;
                                                                            break block70;
                                                                        }
                                                                        var37_38 = var28_28;
                                                                        var28_28 = 90;
                                                                        if (var32_32 != var28_28 && var32_32 != (var28_28 = 270)) {
                                                                            var32_32 = var22_22;
                                                                            var28_28 = var23_23;
                                                                        } else {
                                                                            var28_28 = var22_22;
                                                                            var32_32 = var23_23;
                                                                        }
                                                                        var41_46 = var14_14.b(var28_28, var32_32, var17_17 /* !! */ , var31_31);
                                                                        var36_37 = 0;
                                                                        cfr_temp_0 = var41_46 - 0.0f;
                                                                        var42_47 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                                        if (var42_47 <= 0) break block71;
                                                                        var36_37 = var25_25;
                                                                        var27_27 = var14_14.a(var28_28, var32_32, var17_17 /* !! */ , var31_31);
                                                                        if (var27_27 == null) break block72;
                                                                        var39_42 = var28_28;
                                                                        var42_47 = var22_22;
                                                                        var43_48 = var41_46 * var39_42;
                                                                        var44_49 = var23_23;
                                                                        var45_51 = var43_48;
                                                                        var47_52 = 0.5;
                                                                        var22_22 = (int)(var45_51 += var47_52);
                                                                        var49_53 = var32_32;
                                                                        var50_54 = var34_34;
                                                                        var30_30 = var41_46 * var49_53;
                                                                        var51_55 = var31_31;
                                                                        var52_56 = (double)var30_30 + var47_52;
                                                                        var29_29 = (int)var52_56;
                                                                        var22_22 = var28_28 / var22_22;
                                                                        var29_29 = var32_32 / var29_29;
                                                                        var54_57 = ss0$g.MEMORY;
                                                                        var22_22 = var27_27 == var54_57 ? Math.max(var22_22, var29_29) : Math.min(var22_22, var29_29);
                                                                        var29_29 = Build.VERSION.SDK_INT;
                                                                        var55_58 = 23;
                                                                        var56_59 = 3.2E-44f;
                                                                        if (var29_29 > var55_58) break block73;
                                                                        var14_14 = vs0.j;
                                                                        var57_60 = var17_17 /* !! */ ;
                                                                        var58_61 /* !! */  = var13_13.outMimeType;
                                                                        var55_58 = (int)var14_14.contains((Object)var58_61 /* !! */ );
                                                                        if (!var55_58) break block74;
                                                                        var55_58 = 1;
                                                                        var56_59 = 1.4E-45f;
                                                                        break block75;
                                                                    }
                                                                    var57_60 = var17_17 /* !! */ ;
                                                                }
                                                                var55_58 = Integer.highestOneBit(var22_22);
                                                                var17_17 /* !! */  = 1;
                                                                var18_18 = 1.4E-45f;
                                                                var55_58 = Math.max(var17_17 /* !! */ , var55_58);
                                                                if (var27_27 == var54_57) {
                                                                    var43_48 = var55_58;
                                                                    var25_25 = 1065353216;
                                                                    var26_26 = 1.0f;
                                                                    cfr_temp_1 = var43_48 - (var41_46 = var26_26 / var41_46);
                                                                    var35_35 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                                                                    if (var35_35 < 0) {
                                                                        var55_58 <<= var17_17 /* !! */ ;
                                                                    }
                                                                }
                                                            }
                                                            var13_13.inSampleSize = var55_58;
                                                            var15_15 /* !! */  = ImageHeaderParser$ImageType.JPEG;
                                                            if (var21_21 == var15_15 /* !! */ ) {
                                                                var35_35 = 8;
                                                                var41_46 = 1.1E-44f;
                                                                var18_18 = Math.min(var55_58, var35_35);
                                                                var38_40 = (int)Math.ceil(var39_42 /= var18_18);
                                                                var59_62 = Math.ceil(var49_53 /= var18_18);
                                                                var17_17 /* !! */  = (int)var59_62;
                                                                if ((var55_58 /= var35_35) > 0) {
                                                                    var38_40 /= var55_58;
                                                                    var17_17 /* !! */  /= var55_58;
                                                                }
lbl156:
                                                                // 6 sources

                                                                while (true) {
                                                                    var14_14 = var3_3;
                                                                    var23_23 = var51_55;
                                                                    var22_22 = var57_60;
                                                                    break block66;
                                                                    break;
                                                                }
                                                            }
                                                            var15_15 /* !! */  = ImageHeaderParser$ImageType.PNG;
                                                            if (var21_21 == var15_15 /* !! */  || var21_21 == (var15_15 /* !! */  = ImageHeaderParser$ImageType.PNG_A)) break block76;
                                                            var35_35 = (int)var21_21.isWebp();
                                                            if (var35_35 == 0) break block77;
                                                            var35_35 = 24;
                                                            var41_46 = 3.4E-44f;
                                                            if (var29_29 < var35_35) break block78;
                                                            var56_59 = var55_58;
                                                            var38_40 = Math.round(var39_42 /= var56_59);
                                                            var17_17 /* !! */  = Math.round(var49_53 /= var56_59);
                                                            ** GOTO lbl156
                                                        }
                                                        var56_59 = var55_58;
                                                        var59_63 = Math.floor(var39_42 /= var56_59);
                                                        var38_40 = (int)var59_63;
                                                        var61_65 = Math.floor(var49_53 /= var56_59);
lbl177:
                                                        // 2 sources

                                                        while (true) {
                                                            var17_17 /* !! */  = (int)var61_65;
                                                            ** GOTO lbl156
                                                            break;
                                                        }
                                                    }
                                                    var38_40 = var28_28 % var55_58;
                                                    if (var38_40 == 0 && (var38_40 = var32_32 % var55_58) == 0) {
                                                        var38_40 = var28_28 / var55_58;
                                                        var17_17 /* !! */  = var32_32 / var55_58;
                                                        ** continue;
                                                    }
                                                    var38_40 = 1;
                                                    var39_42 = 1.4E-45f;
                                                    var13_13.inJustDecodeBounds = var38_40;
                                                    vs0.c((ne1)var12_12, (BitmapFactory.Options)var13_13, var16_16, var19_19);
                                                    var56_59 = 0.0f;
                                                    var13_13.inJustDecodeBounds = false;
                                                    var35_35 = var13_13.outWidth;
                                                    var17_17 /* !! */  = var13_13.outHeight;
                                                    var15_15 /* !! */  = (ty2_1)new int[]{var35_35, var17_17 /* !! */ };
                                                    var17_17 /* !! */  = (int)var15_15 /* !! */ [0];
                                                    var55_58 = (int)var15_15 /* !! */ [var38_40];
                                                    var38_40 = var17_17 /* !! */ ;
                                                    var23_23 = var51_55;
                                                    var22_22 = var57_60;
                                                    var17_17 /* !! */  = var55_58;
                                                    var14_14 = var3_3;
                                                    break block66;
                                                }
                                                var56_59 = var55_58;
                                                var59_64 = Math.floor(var39_42 /= var56_59);
                                                var38_40 = (int)var59_64;
                                                var61_65 = Math.floor(var49_53 /= var56_59);
                                                ** while (true)
                                            }
                                            var39_42 = var14_14.b(var38_40, var17_17 /* !! */ , var22_22, var23_23);
                                            var61_65 = var39_42;
                                            var63_66 = 1.0;
                                            var38_40 = (int)(var61_65 == var63_66 ? 0 : (var61_65 < var63_66 ? -1 : 1));
                                            var52_56 = var38_40 <= 0 ? var61_65 : var63_66 / var61_65;
                                            var65_67 = 2.147483647E9;
                                            var67_68 = Math.round(var52_56 * var65_67);
                                            var17_17 /* !! */  = (int)var67_68;
                                            var20_20 = (int)((double)var17_17 /* !! */  * var61_65 + var47_52);
                                            var30_30 = var20_20;
                                            var18_18 = var17_17 /* !! */ ;
                                            var52_56 = var30_30 /= var18_18;
                                            var52_56 = var61_65 / var52_56;
                                            var63_66 = var20_20;
                                            var52_56 = var52_56 * var63_66 + var47_52;
                                            var13_13.inTargetDensity = var17_17 /* !! */  = (int)var52_56;
                                            if (var38_40 > 0) {
                                                var63_66 = 1.0;
                                                var61_65 = var63_66 / var61_65;
                                            }
                                            var69_69 = Math.round(var61_65 *= var65_67);
                                            var13_13.inDensity = var38_40 = (int)var69_69;
                                            var55_58 = var13_13.inTargetDensity;
                                            if (var55_58 > 0 && var38_40 > 0 && var55_58 != var38_40) {
                                                var38_40 = 1;
                                                var39_42 = 1.4E-45f;
                                                var13_13.inScaled = var38_40;
lbl237:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var38_40 = 0;
                                            var39_42 = 0.0f;
                                            var11_11 = null;
                                            var13_13.inTargetDensity = 0;
                                            var13_13.inDensity = 0;
                                            ** while (true)
                                            var14_14 = var50_54;
                                            var38_40 = 2;
                                            var39_42 = 2.8E-45f;
                                            Log.isLoggable((String)var50_54, (int)var38_40);
                                            var11_11 = this;
                                            var17_17 /* !! */  = (int)var42_47;
                                            var35_35 = var44_49;
                                            break block79;
                                        }
                                        var11_11 = new IllegalArgumentException("Cannot round with null rounding");
                                        throw var11_11;
                                    }
                                    var42_47 = var22_22;
                                    var44_50 = var23_23;
                                    var23_23 = var31_31;
                                    var22_22 = var17_17 /* !! */ ;
                                    var12_12 = new StringBuilder("Cannot scale with factor: ");
                                    var12_12.append(var41_46);
                                    var12_12.append(" from: ");
                                    var12_12.append(var14_14);
                                    var12_12.append(", source: [");
                                    var13_13 = "x";
                                    var17_17 /* !! */  = (int)var42_47;
                                    var35_36 = var44_50;
                                    m10.a((StringBuilder)var12_12, var44_50, (String)var13_13, (int)var42_47, "], target: [");
                                    var12_12.append(var22_22);
                                    var12_12.append((String)var13_13);
                                    var12_12.append(var31_31);
                                    var12_12.append("]");
                                    var12_12 = var12_12.toString();
                                    var11_11 = new IllegalArgumentException((String)var12_12);
                                    throw var11_11;
                                }
                                var35_35 = var23_23;
                                var36_37 = var25_25;
                                var37_38 = var28_28;
                                var14_14 = var34_34;
                                var23_23 = var31_31;
                                var40_45 = var22_22;
                                var22_22 = var17_17 /* !! */ ;
                                var17_17 /* !! */  = var40_45;
                                var38_39 = 3;
                                var39_43 = 4.2E-45f;
                            }
                            var25_25 = (int)Log.isLoggable((String)var14_14, (int)var38_39);
                            if (var25_25 != 0) {
                                Objects.toString(var21_21);
                            }
                            var11_11 = this;
                        }
                        var21_21 = var11_11.e;
                        var28_28 = var33_33;
                        var25_25 = var36_37;
                        var20_20 = var21_21.c(var22_22, var23_23, (boolean)var36_37, (boolean)var33_33);
                        if (var20_20 != 0) {
                            var27_27 = Kh.a();
                            var13_13.inPreferredConfig = var27_27;
                            var25_25 = 0;
                            var26_26 = 0.0f;
                            var27_27 = null;
                            var13_13.inMutable = false;
                        } else {
                            var25_25 = 0;
                            var26_26 = 0.0f;
                            var27_27 = null;
                        }
                        if (var20_20 != 0) {
                            while (true) {
                                var20_20 = 1;
                                break block67;
                                break;
                            }
                        }
                        var21_21 = Yi0.PREFER_ARGB_8888;
                        var71_70 = var4_4;
                        if (var4_4 != var21_21) {
                            var21_21 = var1_1.d();
                            try {
                                var20_20 = (int)var21_21.hasAlpha();
                            }
                            catch (IOException v0) {
                                var20_20 = (int)Log.isLoggable((String)var14_14, (int)3);
                                if (var20_20 != 0) {
                                    Objects.toString((Object)var4_4);
                                }
                                var20_20 = 0;
                                var21_21 = null;
                            }
                            var21_21 = var20_20 != 0 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                            var13_13.inPreferredConfig = var21_21;
                            if (var21_21 != (var71_70 = Bitmap.Config.RGB_565)) ** continue;
                            var20_20 = 1;
                            var13_13.inDither = var20_20;
                        } else {
                            var20_20 = 1;
                            var71_70 = Bitmap.Config.ARGB_8888;
                            var13_13.inPreferredConfig = var71_70;
                        }
                    }
                    var28_28 = Build.VERSION.SDK_INT;
                    if (var35_35 >= 0 && var17_17 /* !! */  >= 0 && var9_9) {
                        var17_17 /* !! */  = var22_22;
                        var31_31 = var23_23;
                    } else {
                        var22_22 = var13_13.inTargetDensity;
                        if (var22_22 > 0 && (var23_23 = var13_13.inDensity) > 0 && var22_22 != var23_23) {
                            var23_23 = 1;
                            var49_53 = 1.4E-45f;
                        } else {
                            var23_23 = 0;
                            var49_53 = 0.0f;
                            var72_71 = null;
                        }
                        if (var23_23 != 0) {
                            var43_48 = var22_22;
                            var23_23 = var13_13.inDensity;
                            var49_53 = var23_23;
                            var43_48 /= var49_53;
                        } else {
                            var22_22 = 1065353216;
                            var43_48 = 1.0f;
                        }
                        var23_23 = var13_13.inSampleSize;
                        var41_46 = var35_35;
                        var49_53 = var23_23;
                        var35_35 = (int)Math.ceil(var41_46 / var49_53);
                        var52_56 = Math.ceil((float)var17_17 /* !! */  / var49_53);
                        var17_17 /* !! */  = (int)var52_56;
                        var41_46 = (float)var35_35 * var43_48;
                        var35_35 = Math.round(var41_46);
                        var31_31 = Math.round((float)var17_17 /* !! */  * var43_48);
                        var18_18 = 2.8E-45f;
                        Log.isLoggable((String)var14_14, (int)2);
                        var17_17 /* !! */  = var35_35;
                    }
                    var35_35 = 0;
                    var41_46 = 0.0f;
                    var15_15 /* !! */  = null;
                    var22_22 = 26;
                    var43_48 = 3.6E-44f;
                    if (var17_17 /* !! */  <= 0 || var31_31 <= 0) break block80;
                    if (var28_28 < var22_22) break block81;
                    var72_71 = var13_13.inPreferredConfig;
                    var34_34 = Kh.a();
                    if (var72_71 == var34_34) break block80;
                    var72_71 = Yx.a(var2_2);
                    break block82;
                }
                var23_23 = 0;
                var72_71 = null;
                var49_53 = 0.0f;
            }
            if (var72_71 == null) {
                var72_71 = var13_13.inPreferredConfig;
            }
            var58_61 /* !! */  = var19_19.c(var17_17 /* !! */ , var31_31, var72_71);
            var13_13.inBitmap = var58_61 /* !! */ ;
        }
        var58_61 /* !! */  = var5_5;
        if (var5_5 != null) {
            var23_23 = 28;
            var49_53 = 3.9E-44f;
            if (var28_28 >= var23_23) {
                var24_24 /* !! */  = (int[])ty2_1.DISPLAY_P3;
                if (var5_5 == var24_24 /* !! */  && (var58_61 /* !! */  = us0.b(var2_2)) != null && (var17_17 /* !! */  = (int)Em0.a((ColorSpace)(var58_61 /* !! */  = us0.b(var2_2)))) != 0) {
                    var17_17 /* !! */  = 1;
                    var18_18 = 1.4E-45f;
                } else {
                    var17_17 /* !! */  = 0;
                    var18_18 = 0.0f;
                    var58_61 /* !! */  = null;
                }
                var58_61 /* !! */  = var17_17 /* !! */  != 0 ? TY.a() : sy_0.a();
                var58_61 /* !! */  = BY.a((ColorSpace.Named)var58_61 /* !! */ );
                Xx.a((BitmapFactory.Options)var13_13, (ColorSpace)var58_61 /* !! */ );
            } else if (var28_28 >= var22_22) {
                var58_61 /* !! */  = BY.a(sy_0.a());
                Xx.a((BitmapFactory.Options)var13_13, (ColorSpace)var58_61 /* !! */ );
            }
        }
        var12_12 = vs0.c((ne1)var12_12, (BitmapFactory.Options)var13_13, var16_16, var19_19);
        var16_16.b(var19_19, (Bitmap)var12_12);
        var73_72 = 2;
        var74_73 = 2.8E-45f;
        var55_58 = (int)Log.isLoggable((String)var14_14, (int)var73_72);
        if (var55_58) {
            vs0.d((Bitmap)var12_12);
            vs0.d(var13_13.inBitmap);
            var13_13 = Thread.currentThread();
            var13_13.getName();
            SystemClock.elapsedRealtimeNanos();
        }
        if (var12_12 != null) {
            var13_13 = var11_11.b;
            var75_74 = var13_13.densityDpi;
            var12_12.setDensity(var75_74);
            switch (var37_38) {
                default: {
                    var15_15 /* !! */  = var12_12;
                    break;
                }
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: {
                    var13_13 = new Matrix();
                    var55_58 = 0x43340000;
                    var56_59 = 180.0f;
                    var35_35 = 1119092736;
                    var41_46 = 90.0f;
                    var73_72 = -1028390912;
                    var74_73 = -90.0f;
                    var17_17 /* !! */  = -1082130432;
                    var18_18 = -1.0f;
                    switch (var37_38) {
                        default: {
                            break;
                        }
                        case 8: {
                            var13_13.setRotate(var74_73);
                            break;
                        }
                        case 7: {
                            var13_13.setRotate(var74_73);
                            var73_72 = 1065353216;
                            var74_73 = 1.0f;
                            var13_13.postScale(var18_18, var74_73);
                            break;
                        }
                        case 6: {
                            var13_13.setRotate(var41_46);
                            break;
                        }
                        case 5: {
                            var73_72 = 1065353216;
                            var74_73 = 1.0f;
                            var13_13.setRotate(var41_46);
                            var13_13.postScale(var18_18, var74_73);
                            break;
                        }
                        case 4: {
                            var73_72 = 1065353216;
                            var74_73 = 1.0f;
                            var13_13.setRotate(var56_59);
                            var13_13.postScale(var18_18, var74_73);
                            break;
                        }
                        case 3: {
                            var13_13.setRotate(var56_59);
                            break;
                        }
                        case 2: {
                            var73_72 = 1065353216;
                            var74_73 = 1.0f;
                            var13_13.setScale(var18_18, var74_73);
                        }
                    }
                    var41_46 = var12_12.getWidth();
                    var74_73 = var12_12.getHeight();
                    var17_17 /* !! */  = 0;
                    var18_18 = 0.0f;
                    var14_14 = new RectF(0.0f, 0.0f, var41_46, var74_73);
                    var13_13.mapRect((RectF)var14_14);
                    var41_46 = var14_14.width();
                    var35_35 = Math.round(var41_46);
                    var74_73 = var14_14.height();
                    var73_72 = Math.round(var74_73);
                    var58_61 /* !! */  = var12_12.getConfig();
                    var58_61 /* !! */  = var58_61 /* !! */  != null ? var12_12.getConfig() : Bitmap.Config.ARGB_8888;
                    var15_15 /* !! */  = var19_19.e(var35_35, var73_72, (Bitmap.Config)var58_61 /* !! */ );
                    var74_73 = -var14_14.left;
                    var56_59 = -var14_14.top;
                    var13_13.postTranslate(var74_73, var56_59);
                    var55_58 = (int)var12_12.hasAlpha();
                    var15_15 /* !! */ .setHasAlpha((boolean)var55_58);
                    Zq3.a((Bitmap)var12_12, (Bitmap)var15_15 /* !! */ , (Matrix)var13_13);
                }
            }
            var75_74 = (int)var12_12.equals((Object)var15_15 /* !! */ );
            if (var75_74 == 0) {
                var19_19.d((Bitmap)var12_12);
            }
        }
        return var15_15 /* !! */ ;
    }
}

