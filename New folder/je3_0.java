/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.view.View
 */
import android.graphics.Matrix;
import android.view.View;

/*
 * Renamed from jE3
 */
public class je3_0
extends ge3_0 {
    public static boolean f = true;
    public static boolean g = true;
    public static boolean h = true;

    public void e(View view, Matrix matrix) {
        boolean bl2 = f;
        if (bl2) {
            try {
                je3$a_0.a(view, matrix);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                view = null;
                f = false;
            }
        }
    }

    public void f(View view, Matrix matrix) {
        boolean bl2 = g;
        if (bl2) {
            try {
                je3$a_0.b(view, matrix);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                view = null;
                g = false;
            }
        }
    }

    public void g(View view, Matrix matrix) {
        boolean bl2 = h;
        if (bl2) {
            try {
                je3$a_0.c(view, matrix);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                view = null;
                h = false;
            }
        }
    }
}

