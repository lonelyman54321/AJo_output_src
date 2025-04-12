/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 */
package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.ViewLayer;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class ViewLayer$c {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(View view) {
        int n3 = 2;
        int n4 = 1;
        Object[] objectArray = String.class;
        Class<Class> clazz = Class.class;
        try {
            Object object;
            int n7 = ViewLayer.t;
            if (n7 == 0) {
                ViewLayer.t = n4;
                n7 = Build.VERSION.SDK_INT;
                int n8 = 28;
                String string2 = "mRecreateDisplayList";
                String string3 = "updateDisplayListIfDirty";
                Class<View> clazz2 = View.class;
                if (n7 < n8) {
                    object = clazz2.getDeclaredMethod(string3, null);
                    ViewLayer.r = object;
                    object = clazz2.getDeclaredField(string2);
                    ViewLayer.s = object;
                } else {
                    Class[] classArray = "getDeclaredMethod";
                    Class[] classArray2 = new Class[]{};
                    Class<?> clazz3 = classArray2.getClass();
                    Class[] classArray3 = new Class[n3];
                    classArray3[0] = objectArray;
                    classArray3[n4] = clazz3;
                    classArray = clazz.getDeclaredMethod((String)classArray, classArray3);
                    Class[] classArray4 = new Class[]{};
                    object = new Object[n3];
                    object[0] = string3;
                    object[n4] = classArray4;
                    object = classArray.invoke(clazz2, (Object[])object);
                    ViewLayer.r = object = (Method)object;
                    object = "getDeclaredField";
                    classArray = new Class[n4];
                    classArray[0] = objectArray;
                    object = clazz.getDeclaredMethod((String)object, classArray);
                    objectArray = new Object[n4];
                    objectArray[0] = string2;
                    object = ((Method)object).invoke(clazz2, objectArray);
                    ViewLayer.s = object = (Field)object;
                }
                object = ViewLayer.r;
                if (object != null) {
                    ((AccessibleObject)object).setAccessible(n4 != 0);
                }
                object = ViewLayer.s;
                if (object != null) {
                    ((AccessibleObject)object).setAccessible(n4 != 0);
                }
            }
            if ((object = ViewLayer.s) != null) {
                ((Field)object).setBoolean(view, n4 != 0);
            }
            if ((object = ViewLayer.r) == null) return;
            ((Method)object).invoke((Object)view, null);
            return;
        }
        catch (Throwable throwable) {
            ViewLayer.u = n4;
        }
    }
}

