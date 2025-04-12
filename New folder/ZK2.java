/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.LongSparseArray
 */
import android.util.LongSparseArray;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;

public final class ZK2 {
    public static Field a;
    public static boolean b;
    public static Class c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Object object) {
        AnnotatedElement annotatedElement;
        boolean bl2 = d;
        boolean bl3 = true;
        if (!bl2) {
            annotatedElement = "android.content.res.ThemedResourceCache";
            try {
                annotatedElement = Class.forName((String)((Object)annotatedElement));
                c = annotatedElement;
            }
            catch (ClassNotFoundException classNotFoundException) {}
            d = bl3;
        }
        if ((annotatedElement = c) == null) {
            return;
        }
        boolean bl4 = f;
        if (!bl4) {
            String string2 = "mUnthemedEntries";
            try {
                annotatedElement = ((Class)annotatedElement).getDeclaredField(string2);
                e = annotatedElement;
                ((AccessibleObject)annotatedElement).setAccessible(bl3);
            }
            catch (NoSuchFieldException noSuchFieldException) {}
            f = bl3;
        }
        if ((annotatedElement = e) == null) {
            return;
        }
        try {
            object = ((Field)annotatedElement).get(object);
            object = (LongSparseArray)object;
        }
        catch (IllegalAccessException illegalAccessException) {
            return;
        }
        if (object == null) return;
        object.clear();
    }
}

