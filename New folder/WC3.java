/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.view.View
 *  android.view.ViewParent
 */
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

public final class WC3 {
    public static final ThreadLocal a;
    public static final ThreadLocal b;

    static {
        ThreadLocal threadLocal;
        a = threadLocal = new ThreadLocal();
        b = threadLocal = new ThreadLocal();
    }

    public static void a(ViewParent viewParent, View view, Matrix matrix) {
        float f5;
        int n3;
        float f6;
        int n4;
        ViewParent viewParent2 = view.getParent();
        boolean bl2 = viewParent2 instanceof View;
        if (bl2 && viewParent2 != viewParent) {
            viewParent2 = (View)viewParent2;
            WC3.a(viewParent, (View)viewParent2, matrix);
            n4 = -viewParent2.getScrollX();
            f6 = n4;
            n3 = -viewParent2.getScrollY();
            f5 = n3;
            matrix.preTranslate(f6, f5);
        }
        f6 = view.getLeft();
        n3 = view.getTop();
        f5 = n3;
        matrix.preTranslate(f6, f5);
        viewParent = view.getMatrix();
        n4 = (int)(viewParent.isIdentity() ? 1 : 0);
        if (n4 == 0) {
            viewParent = view.getMatrix();
            matrix.preConcat((Matrix)viewParent);
        }
    }
}

