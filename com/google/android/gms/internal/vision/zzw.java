/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Color
 *  android.graphics.Matrix
 */
package com.google.android.gms.internal.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import com.google.android.gms.internal.vision.zzs;
import java.nio.ByteBuffer;

public final class zzw {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static Bitmap zza(Bitmap object, zzs zzs2) {
        void var0_3;
        int n3;
        int n4;
        int n7;
        void var1_4;
        int n8;
        int n10;
        block7: {
            float f5;
            int n14;
            Matrix matrix;
            block6: {
                block8: {
                    n10 = object.getWidth();
                    n8 = object.getHeight();
                    n7 = var1_4.zze;
                    n4 = 3;
                    n3 = 1;
                    if (n7 == 0) break block7;
                    matrix = new Matrix();
                    n7 = var1_4.zze;
                    if (n7 == 0) break block8;
                    if (n7 != n3) {
                        n14 = 2;
                        if (n7 != n14) {
                            if (n7 != n4) {
                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported rotation degree.");
                                throw illegalArgumentException;
                            }
                            n7 = 270;
                            f5 = 3.78E-43f;
                            break block6;
                        } else {
                            n7 = 180;
                            f5 = 2.52E-43f;
                        }
                        break block6;
                    } else {
                        n7 = 90;
                        f5 = 1.26E-43f;
                    }
                    break block6;
                }
                n7 = 0;
                f5 = 0.0f;
            }
            f5 = n7;
            matrix.postRotate(f5);
            n14 = 0;
            Bitmap bitmap = Bitmap.createBitmap((Bitmap)object, (int)0, (int)0, (int)n10, (int)n8, (Matrix)matrix, (boolean)false);
        }
        if ((n7 = var1_4.zze) == n3 || n7 == n4) {
            var1_4.zza = n8;
            var1_4.zzb = n10;
        }
        return var0_3;
    }

    public static ByteBuffer zza(Bitmap bitmap, boolean bl2) {
        int n3 = bitmap.getWidth();
        int n4 = bitmap.getHeight();
        int n7 = n3 * n4;
        int n8 = (n3 + 1) / 2;
        n4 = ((n4 + 1) / 2 * n8 << 1) + n7;
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(n4);
        int n10 = n7;
        for (n8 = 0; n8 < n7; ++n8) {
            int n14 = n8 % n3;
            byte by2 = n8 / n3;
            int n15 = bitmap.getPixel(n14, (int)by2);
            int n16 = Color.red((int)n15);
            int n17 = Color.green((int)n15);
            n15 = Color.blue((int)n15);
            float f5 = n16;
            float f6 = 0.299f * f5;
            float f7 = n17;
            float f8 = 0.587f * f7 + f6;
            float f11 = n15;
            f6 = 0.114f * f11 + f8;
            byte by4 = (byte)f6;
            byteBuffer.put(n8, by4);
            if ((by2 %= 2) != 0 || (n14 %= 2) != 0) continue;
            float f12 = -0.169f * f5;
            float f14 = -0.331f * f7 + f12;
            f12 = 0.5f;
            f6 = f11 * f12 + f14;
            f14 = 128.0f;
            f7 = f7 * -0.419f + (f5 *= f12);
            f12 = -0.081f;
            f11 = f11 * f12 + f7 + f14;
            n14 = n10 + 1;
            by2 = (byte)(f6 += f14);
            byteBuffer.put(n10, by2);
            n10 += 2;
            by2 = (byte)f11;
            byteBuffer.put(n14, by2);
        }
        return byteBuffer;
    }
}

