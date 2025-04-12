/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * Renamed from gE3
 */
public class ge3_0 {
    public static boolean a = true;
    public static Method b;
    public static boolean c;
    public static Field d;
    public static boolean e;

    public float a(View view) {
        boolean bl2 = a;
        if (bl2) {
            try {
                return gE3$a.a(view);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                bl2 = false;
                a = false;
            }
        }
        return view.getAlpha();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(View view, int n3, int n4, int n7, int n8) {
        Object object;
        int n10 = 3;
        int n14 = 2;
        int n15 = 4;
        boolean bl2 = true;
        boolean bl3 = c;
        if (!bl3) {
            object = View.class;
            String string2 = "setFrame";
            try {
                Class<Integer> clazz;
                Class[] classArray = new Class[n15];
                classArray[0] = clazz = Integer.TYPE;
                classArray[bl2] = clazz;
                classArray[n14] = clazz;
                classArray[n10] = clazz;
                b = object = ((Class)object).getDeclaredMethod(string2, classArray);
                ((AccessibleObject)object).setAccessible(bl2);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            c = bl2;
        }
        if ((object = b) == null) return;
        try {
            Integer n16 = n3;
            Integer n17 = n4;
            Integer n18 = n7;
            Integer n19 = n8;
            Object[] objectArray = new Object[n15];
            objectArray[0] = n16;
            objectArray[bl2] = n17;
            objectArray[n14] = n18;
            objectArray[n10] = n19;
            ((Method)object).invoke((Object)view, objectArray);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            RuntimeException runtimeException = new RuntimeException(throwable);
            throw runtimeException;
        }
        catch (IllegalAccessException illegalAccessException) {}
    }

    public void c(View view, float f5) {
        boolean bl2 = a;
        if (bl2) {
            try {
                gE3$a.b(view, f5);
                return;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                bl2 = false;
                a = false;
            }
        }
        view.setAlpha(f5);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d(View view, int n3) {
        Field field;
        Object object;
        int n4 = e;
        if (n4 == 0) {
            n4 = 1;
            object = View.class;
            String string2 = "mViewFlags";
            try {
                d = object = ((Class)object).getDeclaredField(string2);
                ((AccessibleObject)object).setAccessible(n4 != 0);
            }
            catch (NoSuchFieldException noSuchFieldException) {}
            e = n4;
        }
        if ((field = d) == null) return;
        try {
            n4 = field.getInt(view);
            object = d;
            ((Field)object).setInt(view, n3 |= (n4 &= 0xFFFFFFF3));
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            return;
        }
    }
}

