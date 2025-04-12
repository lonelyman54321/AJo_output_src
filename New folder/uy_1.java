/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.Matrix
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.media3.common.ParserException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/*
 * Renamed from uy
 */
public final class uy_1 {
    public static Bitmap a(int n3, byte[] object) {
        int n4 = 0;
        Bitmap bitmap = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n3, null);
        if (bitmap != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
            object = new ue0_0;
            ((ue0_0)object)(byteArrayInputStream);
            n3 = ((ue0_0)object).c();
            switch (n3) {
                default: {
                    break;
                }
                case 6: 
                case 7: {
                    n4 = 90;
                    break;
                }
                case 5: 
                case 8: {
                    n4 = 270;
                    break;
                }
                case 3: 
                case 4: {
                    n4 = 180;
                }
            }
            if (n4 != 0) {
                Matrix matrix = new Matrix();
                float f5 = n4;
                matrix.postRotate(f5);
                int n7 = bitmap.getWidth();
                int n8 = bitmap.getHeight();
                bitmap = Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)0, (int)n7, (int)n8, (Matrix)matrix, (boolean)false);
            }
            return bitmap;
            finally {
                try {
                    ((InputStream)byteArrayInputStream).close();
                }
                catch (Throwable throwable) {
                    Throwable throwable2;
                    throwable2.addSuppressed(throwable);
                }
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException();
        throw ParserException.a("Could not decode image data", illegalStateException);
    }
}

