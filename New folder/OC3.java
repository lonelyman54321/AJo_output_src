/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.ViewConfiguration
 */
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

public final class OC3 {
    public static final Method a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 25;
        if (n3 != n4) return;
        Object object = ViewConfiguration.class;
        String string2 = "getScaledScrollFactor";
        try {
            a = object = ((Class)object).getDeclaredMethod(string2, null);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static float a(ViewConfiguration object, Context context) {
        boolean bl2;
        Method method;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 25;
        if (n3 >= n4 && (method = a) != null) {
            n4 = 0;
            try {
                object = method.invoke(object, null);
            }
            catch (Exception exception) {}
            object = (Integer)object;
            return ((Integer)object).intValue();
        }
        object = new TypedValue();
        method = context.getTheme();
        n3 = method.resolveAttribute(n4 = 16842829, (TypedValue)object, bl2 = true) ? 1 : 0;
        if (n3 != 0) {
            context = context.getResources().getDisplayMetrics();
            return object.getDimension((DisplayMetrics)context);
        }
        return 0.0f;
    }
}

