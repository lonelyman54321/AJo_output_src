/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Color
 *  android.util.TypedValue
 *  android.view.View
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.R$styleable;

public final class Um3 {
    public static final ThreadLocal a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;

    static {
        ThreadLocal threadLocal;
        a = threadLocal = new ThreadLocal();
        b = new int[]{-16842910};
        c = new int[]{16842908};
        d = new int[]{16842919};
        e = new int[]{0x10100A0};
        f = new int[0];
        g = new int[1];
    }

    public static void a(Context context, View object) {
        Throwable throwable2;
        block6: {
            block5: {
                int n3;
                int[] nArray = R$styleable.AppCompatTheme;
                context = context.obtainStyledAttributes(nArray);
                try {
                    n3 = R$styleable.AppCompatTheme_windowActionBar;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                n3 = (int)(context.hasValue(n3) ? 1 : 0);
                if (n3 != 0) break block5;
                object = object.getClass();
                object.toString();
            }
            context.recycle();
            return;
        }
        context.recycle();
        throw throwable2;
    }

    public static int b(int n3, Context context) {
        boolean bl2;
        Object object = Um3.d(n3, context);
        if (object != null && (bl2 = object.isStateful())) {
            int[] nArray = b;
            int n4 = object.getDefaultColor();
            return object.getColorForState(nArray, n4);
        }
        object = a;
        TypedValue typedValue = (TypedValue)((ThreadLocal)object).get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            ((ThreadLocal)object).set(typedValue);
        }
        context.getTheme().resolveAttribute(0x1010033, typedValue, true);
        float f5 = typedValue.getFloat();
        n3 = Um3.c(n3, context);
        int n7 = Math.round((float)Color.alpha((int)n3) * f5);
        return hZ.i(n3, n7);
    }

    public static int c(int n3, Context context) {
        int[] nArray = g;
        nArray[0] = n3;
        n3 = 0;
        Tn3 tn3 = Tn3.e(context, null, nArray);
        try {
            context = tn3.b;
            int n4 = context.getColor(0, 0);
            return n4;
        }
        finally {
            tn3.g();
        }
    }

    public static ColorStateList d(int n3, Context context) {
        int[] nArray = g;
        nArray[0] = n3;
        n3 = 0;
        Tn3 tn3 = Tn3.e(context, null, nArray);
        try {
            context = tn3.a(0);
            return context;
        }
        finally {
            tn3.g();
        }
    }
}

