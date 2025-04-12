/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.os.Build$VERSION
 *  android.widget.ImageView
 */
import android.graphics.Matrix;
import android.os.Build;
import android.widget.ImageView;

public final class Pe1 {
    public static boolean a = true;

    public static void a(ImageView imageView, Matrix matrix) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4) {
            Pe1$a.a(imageView, matrix);
        } else {
            n3 = 0;
            if (matrix == null) {
                matrix = imageView.getDrawable();
                if (matrix != null) {
                    n4 = imageView.getWidth();
                    int n7 = imageView.getPaddingLeft();
                    n4 -= n7;
                    n7 = imageView.getPaddingRight();
                    n4 -= n7;
                    n7 = imageView.getHeight();
                    int n8 = imageView.getPaddingTop();
                    n7 -= n8;
                    n8 = imageView.getPaddingBottom();
                    matrix.setBounds(0, 0, n4, n7 -= n8);
                    imageView.invalidate();
                }
            } else {
                n4 = a ? 1 : 0;
                if (n4 != 0) {
                    try {
                        Pe1$a.a(imageView, matrix);
                    }
                    catch (NoSuchMethodError noSuchMethodError) {
                        a = false;
                    }
                }
            }
        }
    }
}

