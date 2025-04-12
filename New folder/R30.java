/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.widget.CompoundButton
 */
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class R30 {
    public static Field a;
    public static boolean b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Drawable a(CompoundButton object) {
        Object object2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            return R30$a.a(object);
        }
        n3 = b ? 1 : 0;
        if (!n3) {
            n3 = 1;
            object2 = CompoundButton.class;
            String string2 = "mButtonDrawable";
            try {
                a = object2 = ((Class)object2).getDeclaredField(string2);
                ((AccessibleObject)object2).setAccessible(n3 != 0);
            }
            catch (NoSuchFieldException noSuchFieldException) {}
            b = n3;
        }
        Field field = a;
        n4 = 0;
        object2 = null;
        if (field == null) return null;
        try {
            object = field.get(object);
            return (Drawable)object;
        }
        catch (IllegalAccessException illegalAccessException) {
            a = null;
        }
        return null;
    }
}

