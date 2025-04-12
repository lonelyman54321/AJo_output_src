/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build$VERSION
 */
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;

public final class dU1 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Intent a(Activity object) {
        Object object2 = object.getParentActivityIntent();
        if (object2 != null) {
            return object2;
        }
        try {
            object2 = object.getComponentName();
            object2 = dU1.c((Context)object, (ComponentName)object2);
            if (object2 == null) {
                return null;
            }
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object2 = new IllegalArgumentException(nameNotFoundException);
            throw object2;
        }
        ComponentName componentName = new ComponentName((Context)object, (String)object2);
        try {
            object = dU1.c((Context)object, componentName);
            if (object == null) {
                return Intent.makeMainActivity((ComponentName)componentName);
            }
            object = new Intent();
            return object.setComponent(componentName);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return null;
        }
    }

    public static Intent b(Context object, ComponentName object2) {
        String string2 = dU1.c(object, object2);
        if (string2 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName((String)(object2 = object2.getPackageName()), string2);
        if ((object = dU1.c(object, componentName)) == null) {
            object = Intent.makeMainActivity((ComponentName)componentName);
        } else {
            object = new Intent();
            object = object.setComponent(componentName);
        }
        return object;
    }

    public static String c(Context object, ComponentName object2) {
        Object object3 = object.getPackageManager();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        n3 = n3 >= n4 ? 269222528 : (n3 >= (n4 = 24) ? 787072 : 640);
        object2 = object3.getActivityInfo((ComponentName)object2, n3);
        object3 = ((ActivityInfo)object2).parentActivityName;
        if (object3 != null) {
            return object3;
        }
        object2 = ((ActivityInfo)object2).metaData;
        char c2 = '\u0000';
        object3 = null;
        if (object2 == null) {
            return null;
        }
        String string2 = "android.support.PARENT_ACTIVITY";
        if ((object2 = object2.getString(string2)) == null) {
            return null;
        }
        object3 = null;
        c2 = ((String)object2).charAt(0);
        if (c2 == (n3 = 46)) {
            object3 = new StringBuilder();
            object = object.getPackageName();
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append((String)object2);
            object2 = ((StringBuilder)object3).toString();
        }
        return object2;
    }
}

