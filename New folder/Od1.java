/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.BitmapFactory
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

public final class Od1 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Bitmap a(String string2) {
        int n3;
        float f5;
        int n4;
        int n7;
        float f6;
        int n8;
        block19: {
            float f7;
            block18: {
                block17: {
                    block16: {
                        n8 = 0;
                        f6 = 0.0f;
                        Object var3_3 = null;
                        if (string2 == null) return null;
                        if ((string2 = BitmapFactory.decodeFile((String)string2)) == null) return null;
                        try {
                            n8 = string2.getHeight();
                            n7 = 1024;
                            f7 = 1.435E-42f;
                            if (n8 > n7) break block16;
                        }
                        catch (Exception exception) {
                            return string2;
                        }
                        n8 = string2.getWidth();
                        if (n8 <= n7) return string2;
                    }
                    n8 = string2.getWidth();
                    f6 = n8;
                    n4 = string2.getHeight();
                    f5 = n4;
                    f6 /= f5;
                    n4 = string2.getWidth();
                    n3 = string2.getHeight();
                    if (n4 <= n3) break block17;
                    n4 = 1024;
                    f5 = 1.435E-42f;
                    break block18;
                }
                f5 = (float)n7 * f6;
                n4 = (int)f5;
            }
            n3 = string2.getHeight();
            int n10 = string2.getWidth();
            if (n3 > n10) break block19;
            f7 = (float)n7 / f6;
            n7 = (int)f7;
        }
        n8 = 1;
        f6 = Float.MIN_VALUE;
        Bitmap bitmap = Bitmap.createScaledBitmap((Bitmap)string2, (int)n4, (int)n7, n8 != 0);
        Object object = "createScaledBitmap(...)";
        Intrinsics.checkNotNullExpressionValue(bitmap, (String)object);
        string2.recycle();
        object = new ByteArrayOutputStream();
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        n3 = 80;
        bitmap.compress(compressFormat, n3, (OutputStream)object);
        bitmap.recycle();
        byte[] byArray = ((ByteArrayOutputStream)object).toByteArray();
        object = "toByteArray(...)";
        Intrinsics.checkNotNullExpressionValue(byArray, (String)object);
        n7 = byArray.length;
        n4 = 0;
        f5 = 0.0f;
        compressFormat = null;
        return BitmapFactory.decodeByteArray((byte[])byArray, (int)0, (int)n7);
    }
}

