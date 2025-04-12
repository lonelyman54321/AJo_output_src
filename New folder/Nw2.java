/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.widget.PopupWindow
 */
import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class Nw2 {
    public static Method a;
    public static boolean b;
    public static Field c;
    public static boolean d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(PopupWindow popupWindow, boolean bl2) {
        Field field;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            Nw2$a.a(popupWindow, bl2);
            return;
        }
        n3 = d ? 1 : 0;
        if (!n3) {
            n3 = 1;
            Object object = PopupWindow.class;
            String string2 = "mOverlapAnchor";
            try {
                c = object = ((Class)object).getDeclaredField(string2);
                ((AccessibleObject)object).setAccessible(n3 != 0);
            }
            catch (NoSuchFieldException noSuchFieldException) {}
            d = n3;
        }
        if ((field = c) == null) return;
        try {
            Boolean bl3 = bl2;
            field.set(popupWindow, bl3);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(PopupWindow popupWindow, int n3) {
        Object object;
        boolean bl2 = true;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 >= n7) {
            Nw2$a.b(popupWindow, n3);
            return;
        }
        n4 = b ? 1 : 0;
        if (n4 == 0) {
            object = PopupWindow.class;
            String string2 = "setWindowLayoutType";
            try {
                Class<Integer> clazz;
                Class[] classArray = new Class[bl2];
                classArray[0] = clazz = Integer.TYPE;
                a = object = ((Class)object).getDeclaredMethod(string2, classArray);
                ((AccessibleObject)object).setAccessible(bl2);
            }
            catch (Exception exception) {}
            b = bl2;
        }
        if ((object = a) == null) return;
        try {
            Integer n8 = n3;
            Object[] objectArray = new Object[bl2];
            objectArray[0] = n8;
            ((Method)object).invoke((Object)popupWindow, objectArray);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

