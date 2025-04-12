/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Paint
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

public final class It2 {
    public static final Typeface a(Typeface object, sv0_1 object2, Context object3) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            n3 = 0;
            if (object == null) {
                boolean bl2 = false;
                object = null;
            } else {
                object2 = ((sv0_1)object2).a;
                n4 = ((ArrayList)object2).isEmpty() ? '\u0001' : '\u0000';
                if (n4 == 0) {
                    ThreadLocal threadLocal = kt3.a;
                    Paint paint = (Paint)threadLocal.get();
                    if (paint == null) {
                        paint = new Paint();
                        threadLocal.set(paint);
                    }
                    paint.setTypeface(object);
                    object = ap1_0.a(object3);
                    object3 = new jt3((Xo0)object);
                    int n7 = 31;
                    object = jv1_0.a((List)object2, null, (jt3)object3, n7);
                    it3.a(paint, (String)object);
                    object = paint.getTypeface();
                }
            }
        }
        return object;
    }
}

