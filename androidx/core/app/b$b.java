/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.pm.PackageManager
 */
package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class b$b {
    public static boolean a(Activity activity, String string2) {
        Object object = null;
        int n3 = 1;
        Application application = activity.getApplication();
        application = application.getPackageManager();
        Object object2 = PackageManager.class;
        String string3 = "shouldShowRequestPermissionRationale";
        Class[] classArray = new Class[n3];
        Class<String> clazz = String.class;
        classArray[0] = clazz;
        object2 = ((Class)object2).getMethod(string3, classArray);
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        object = ((Method)object2).invoke((Object)application, objectArray);
        object = (Boolean)object;
        try {
            return (Boolean)object;
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            return activity.shouldShowRequestPermissionRationale(string2);
        }
    }
}

