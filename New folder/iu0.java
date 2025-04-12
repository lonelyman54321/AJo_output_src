/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.util.Log
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;

public final class iu0 {
    public static final iu0$a_0 a;

    static {
        iu0$a_0 iu0$a_0;
        a = iu0$a_0 = new Object();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static py_2 a(ny_0 var0, Drawable var1_2, int var2_3, int var3_4) {
        block15: {
            block16: {
                block13: {
                    block17: {
                        block14: {
                            var1_2 /* !! */  = var1_2 /* !! */ .getCurrent();
                            var4_5 = var1_2 /* !! */  instanceof BitmapDrawable;
                            var5_6 = false;
                            if (var4_5 == 0) break block14;
                            var1_2 /* !! */  = ((BitmapDrawable)var1_2 /* !! */ ).getBitmap();
                            break block15;
                        }
                        var4_5 = var1_2 /* !! */  instanceof Animatable;
                        if (var4_5 != 0) break block16;
                        var4_5 = 5;
                        var6_7 = "DrawableToBitmap";
                        var7_8 = -1 << -1;
                        if (var2_3 == var7_8 && (var8_9 = var1_2 /* !! */ .getIntrinsicWidth()) <= 0) {
                            var2_3 = (int)Log.isLoggable((String)var6_7, (int)var4_5);
                            if (var2_3 != 0) {
                                var1_2 /* !! */ .toString();
                            }
lbl18:
                            // 5 sources

                            while (true) {
                                var1_2 /* !! */  = null;
                                break block13;
                                break;
                            }
                        }
                        if (var3_4 != var7_8 || (var7_8 = var1_2 /* !! */ .getIntrinsicHeight()) > 0) break block17;
                        var2_3 = (int)Log.isLoggable((String)var6_7, (int)var4_5);
                        if (var2_3 == 0) ** GOTO lbl18
                        var1_2 /* !! */ .toString();
                        ** while (true)
                    }
                    var4_5 = var1_2 /* !! */ .getIntrinsicWidth();
                    if (var4_5 > 0) {
                        var2_3 = var1_2 /* !! */ .getIntrinsicWidth();
                    }
                    if ((var4_5 = var1_2 /* !! */ .getIntrinsicHeight()) > 0) {
                        var3_4 = var1_2 /* !! */ .getIntrinsicHeight();
                    }
                    var9_10 = Zq3.d;
                    var9_10.lock();
                    var6_7 = Bitmap.Config.ARGB_8888;
                    var6_7 = var0.e(var2_3, var3_4, (Bitmap.Config)var6_7);
                    var10_11 = new Canvas((Bitmap)var6_7);
                    var1_2 /* !! */ .setBounds(0, 0, var2_3, var3_4);
                    var1_2 /* !! */ .draw(var10_11);
                    var10_11.setBitmap(null);
                    var1_2 /* !! */  = var6_7;
                }
                var5_6 = true;
                break block15;
                finally {
                    var9_10.unlock();
                }
            }
            var1_2 /* !! */  = null;
        }
        if (!var5_6) {
            var0 = iu0.a;
        }
        return py_2.b(var0, (Bitmap)var1_2 /* !! */ );
    }
}

