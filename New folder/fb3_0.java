/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Matrix
 *  android.media.MediaExtractor
 *  android.media.MediaMetadataRetriever
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 */
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from FB3
 */
public final class fb3_0
implements BK2 {
    public static final U92 d;
    public static final U92 e;
    public static final FB3$f f;
    public static final List g;
    public final FB3$e a;
    public final ny_0 b;
    public final FB3$f c;

    static {
        U92 u92;
        Object object = (long)-1;
        U92$b u92$b = new fb3$a_0();
        d = u92 = new U92("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", object, u92$b);
        object = 2;
        u92$b = new fb3$b_0();
        e = u92 = new U92("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", object, u92$b);
        f = object = new Object();
        g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    }

    public fb3_0(ny_0 object, FB3$e fB3$e) {
        this.b = object;
        this.a = fB3$e;
        this.c = object = f;
    }

    public final boolean a(Object object, Z92 z92) {
        return true;
    }

    public final wk2_0 b(Object object, int n3, int n4, Z92 object2) {
        Object object3;
        long l2;
        long l3;
        Object object4 = d;
        long l4 = (Long)(object4 = (Long)((Z92)object2).c((U92)object4));
        long l7 = l4 - (l3 = 0L);
        Object object5 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object5 < 0 && (object5 = (l2 = l4 - (l3 = (long)-1)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            String string2 = Wm2.a(l4, "Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            object = new IllegalArgumentException(string2);
            throw object;
        }
        object4 = e;
        if ((object4 = (Integer)((Z92)object2).c((U92)object4)) == null) {
            int n7 = 2;
            object4 = n7;
        }
        if ((object2 = (ss0)((Z92)object2).c((U92)(object3 = ss0.f))) == null) {
            object2 = ss0.e;
        }
        Object object6 = object2;
        this.c.getClass();
        object2 = new MediaMetadataRetriever();
        int n8 = 29;
        try {
            object3 = this.a;
            object3.b((MediaMetadataRetriever)object2, object);
            int n10 = (Integer)object4;
            object3 = this;
            object = this.c(object, (MediaMetadataRetriever)object2, l4, n10, n3, n4, (ss0)object6);
            return py_2.b(this.b, (Bitmap)object);
        }
        finally {
            n3 = Build.VERSION.SDK_INT;
            if (n3 >= n8) {
                object2.release();
            } else {
                object2.release();
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bitmap c(Object var1_1, MediaMetadataRetriever var2_2, long var3_3, int var5_4, int var6_5, int var7_6, ss0 var8_7) {
        block25: {
            block24: {
                block27: {
                    block22: {
                        var9_8 /* !! */  = var2_2;
                        var10_10 = var6_5;
                        var11_11 = var7_6;
                        var12_12 = var8_7;
                        var13_13 = Build.DEVICE;
                        var14_14 = 3;
                        var15_15 = "VideoDecoder";
                        var16_16 = null;
                        if (var13_13 == null || !(var18_18 = (int)var13_13.matches((String)(var17_17 = ".+_cheets|cheets_.+")))) break block22;
                        var18_18 = 12;
                        var13_13 = var2_2.extractMetadata(var18_18);
                        var17_17 = "video/webm";
                        var18_18 = (int)var17_17.equals(var13_13);
                        if (!var18_18) break block22;
                        var13_13 = new MediaExtractor();
                        var17_17 = this.a;
                        var19_19 = var1_1;
                        var17_17.a((MediaExtractor)var13_13, var1_1);
                        var20_20 = var13_13.getTrackCount();
                        var19_19 = null;
                        for (var21_21 = 0; var21_21 < var20_20; var21_21 += 1) {
                            var22_22 /* !! */  = var13_13.getTrackFormat(var21_21);
                            var23_23 = "mime";
                            var23_23 = "video/x-vnd.on2.vp8";
                            var24_24 = (int)var23_23.equals(var22_22 /* !! */  = var22_22 /* !! */ .getString(var23_23));
                            if (var24_24 != 0) ** break block23
                        }
                        ** GOTO lbl51
                        {
                            var13_13.release();
                            var9_8 /* !! */  = new IllegalStateException("Cannot decode VP8 video on CrOS.");
                            throw var9_8 /* !! */ ;
                            break;
                        }
                        catch (Throwable v0) {
                            block26: {
                                var18_18 = 0;
                                var13_13 = null;
                                break block26;
                                catch (Throwable v1) {}
                            }
                            try {
                                Log.isLoggable((String)var15_15, (int)var14_14);
                                if (var13_13 == null) break block22;
                            }
                            catch (Throwable var9_9) {
                                var25_25 = var9_9;
                                if (var13_13 != null) {
                                    var13_13.release();
                                }
                                throw var25_25;
                            }
lbl51:
                            // 2 sources

                            var13_13.release();
                            {
                            }
                        }
                    }
                    var18_18 = Build.VERSION.SDK_INT;
                    var20_20 = 27;
                    var24_24 = 24;
                    if (var18_18 >= var20_20 && var10_10 != (var18_18 = -1 << -1) && var11_11 != var18_18 && var12_12 != (var13_13 = ss0.d)) {
                        var18_18 = 18;
                        var13_13 = var9_8 /* !! */ .extractMetadata(var18_18);
                        var18_18 = Integer.parseInt((String)var13_13);
                        var20_20 = 19;
                        var17_17 = var9_8 /* !! */ .extractMetadata(var20_20);
                        var20_20 = Integer.parseInt((String)var17_17);
                        var19_19 = var9_8 /* !! */ .extractMetadata(var24_24);
                        var21_21 = Integer.parseInt((String)var19_19);
                        var26_27 = 90;
                        if (var21_21 == var26_27 || var21_21 == (var26_27 = 270)) {
                            var27_28 = var20_20;
                            var20_20 = var18_18;
                            var18_18 = var27_28;
                        }
                        var28_29 = var12_12.b(var18_18, var20_20, var10_10, var11_11);
                        var29_30 = (float)var18_18 * var28_29;
                        var21_21 = Math.round(var29_30);
                        var29_30 = var20_20;
                        var28_29 *= var29_30;
                        try {
                            var26_27 = Math.round(var28_29);
                            var25_26 = var2_2;
                            var18_18 = var5_4;
                            var20_20 = var21_21;
                            var21_21 = var26_27;
                            var16_16 = EB3.a(var2_2, var3_3, var5_4, var20_20, var26_27);
                        }
                        catch (Throwable v2) {
                            Log.isLoggable((String)var15_15, (int)var14_14);
                        }
                    }
                    if (var16_16 == null) {
                        var16_16 = var2_2.getFrameAtTime(var3_3, var5_4);
                    }
                    var25_26 = Build.MODEL;
                    var30_31 = "Pixel";
                    var10_10 = (int)var25_26.startsWith(var30_31);
                    var11_11 = 33;
                    var29_30 = 4.6E-44f;
                    if (var10_10 == 0 || (var10_10 = Build.VERSION.SDK_INT) != var11_11) break block27;
                    var25_26 = fb3_0.g.iterator();
                    while (var11_11 = (int)var25_26.hasNext()) {
                        var12_12 = Build.ID;
                        var30_31 = (String)var25_26.next();
                        var11_11 = (int)var12_12.startsWith(var30_31);
                        if (!var11_11) continue;
                        break block24;
                    }
                    break block25;
                }
                var10_10 = Build.VERSION.SDK_INT;
                var31_32 = 30;
                var32_33 = 4.2E-44f;
                if (var10_10 < var31_32 || var10_10 >= var11_11) break block25;
            }
            var10_10 = 36;
            var28_29 = 5.0E-44f;
            try {
                var25_26 = var9_8 /* !! */ .extractMetadata(var10_10);
                var11_11 = 35;
                var29_30 = 4.9E-44f;
                var30_31 = var9_8 /* !! */ .extractMetadata(var11_11);
                var10_10 = Integer.parseInt((String)var25_26);
                var11_11 = Integer.parseInt(var30_31);
                var31_32 = 7;
                var32_33 = 9.8E-45f;
                var18_18 = 6;
                if (var10_10 != var31_32 && var10_10 != var18_18 || var11_11 != var18_18) break block25;
                var9_8 /* !! */  = var9_8 /* !! */ .extractMetadata(var24_24);
                var33_34 = Integer.parseInt((String)var9_8 /* !! */ );
                var33_34 = Math.abs(var33_34);
                var10_10 = 180;
                var28_29 = 2.52E-43f;
                ** if (var33_34 != var10_10) goto lbl-1000
            }
            catch (NumberFormatException v3) {
                Log.isLoggable((String)var15_15, (int)var14_14);
            }
lbl-1000:
            // 1 sources

            {
                Log.isLoggable((String)var15_15, (int)var14_14);
                var9_8 /* !! */  = new Matrix();
                var28_29 = var16_16.getWidth();
                var29_30 = 2.0f;
                var28_29 /= var29_30;
                var32_33 = (float)var16_16.getHeight() / var29_30;
                var29_30 = 180.0f;
                var9_8 /* !! */ .postRotate(var29_30, var28_29, var32_33);
                var10_10 = var16_16.getWidth();
                var11_11 = var16_16.getHeight();
                var31_32 = 0;
                var32_33 = 0.0f;
                var12_12 = null;
                var18_18 = 1;
                var20_20 = 0;
                var17_17 = null;
                var1_1 = var16_16;
                var2_2 = null;
                var5_4 = var11_11;
                var7_6 = var18_18;
                var16_16 = Bitmap.createBitmap((Bitmap)var16_16, (int)0, (int)0, (int)var10_10, (int)var11_11, (Matrix)var9_8 /* !! */ , (boolean)var18_18);
            }
lbl-1000:
            // 2 sources

            {
            }
        }
        if (var16_16 != null) {
            return var16_16;
        }
        var9_8 /* !! */  = new RuntimeException("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        throw var9_8 /* !! */ ;
    }
}

