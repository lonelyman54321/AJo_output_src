/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.util.Property
 *  android.view.View
 */
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/*
 * Renamed from eE3
 */
public final class ee3_0 {
    public static final je3_0 a;
    public static final ee3$a_0 b;
    public static final eE3$b c;

    static {
        Object object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4) {
            object = new Object();
            a = object;
        } else {
            n4 = 23;
            if (n3 >= n4) {
                object = new Object();
                a = object;
            } else {
                n4 = 22;
                if (n3 >= n4) {
                    object = new Object();
                    a = object;
                } else {
                    object = new Object();
                    a = object;
                }
            }
        }
        object = new Property(Float.class, "translationAlpha");
        b = object;
        object = new Property(Rect.class, "clipBounds");
        c = object;
    }

    public static void a(View view, int n3, int n4, int n7, int n8) {
        a.b(view, n3, n4, n7, n8);
    }

    public static void b(View view, float f5) {
        a.c(view, f5);
    }

    public static void c(View view, int n3) {
        a.d(view, n3);
    }
}

