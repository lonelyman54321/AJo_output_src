/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 */
package androidx.core.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;

public final class c {
    public static final Class a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        void var5_11;
        Class[] classArray;
        int n3;
        Handler handler;
        int n4 = 3;
        Class<IBinder> clazz = IBinder.class;
        int n7 = 2;
        boolean bl2 = true;
        Object object = Activity.class;
        Object object2 = Looper.getMainLooper();
        g = handler = new Handler((Looper)object2);
        Object var5_9 = null;
        object2 = "android.app.ActivityThread";
        try {
            object2 = Class.forName((String)object2);
        }
        catch (Throwable throwable) {
            n3 = 0;
            object2 = null;
        }
        a = object2;
        object2 = "mMainThread";
        try {
            object2 = ((Class)object).getDeclaredField((String)object2);
            ((AccessibleObject)object2).setAccessible(bl2);
        }
        catch (Throwable throwable) {
            n3 = 0;
            object2 = null;
        }
        b = object2;
        object2 = "mToken";
        try {
            object = ((Class)object).getDeclaredField((String)object2);
            ((AccessibleObject)object).setAccessible(bl2);
        }
        catch (Throwable throwable) {
            object = null;
        }
        c = object;
        object = a;
        object2 = "performStopActivity";
        if (object != null) {
            try {
                Class<String> clazz2;
                Class<Boolean> clazz3;
                classArray = new Class[n4];
                classArray[0] = clazz;
                classArray[bl2] = clazz3 = Boolean.TYPE;
                classArray[n7] = clazz2 = String.class;
                object = ((Class)object).getDeclaredMethod((String)object2, classArray);
                ((AccessibleObject)object).setAccessible(bl2);
            }
            catch (Throwable throwable) {}
        }
        object = null;
        d = object;
        object = a;
        if (object != null) {
            try {
                Class<Boolean> clazz4;
                classArray = new Class[n7];
                classArray[0] = clazz;
                classArray[bl2] = clazz4 = Boolean.TYPE;
                object = ((Class)object).getDeclaredMethod((String)object2, classArray);
                ((AccessibleObject)object).setAccessible(bl2);
            }
            catch (Throwable throwable) {}
        }
        object = null;
        e = object;
        object = a;
        n3 = Build.VERSION.SDK_INT;
        int n8 = 26;
        if ((n3 == n8 || n3 == (n8 = 27)) && object != null) {
            object2 = "requestRelaunchActivity";
            n8 = 9;
            try {
                Class<Integer> clazz5;
                Class<List> clazz6;
                classArray = new Class[n8];
                classArray[0] = clazz;
                classArray[bl2] = clazz6 = List.class;
                classArray[n7] = clazz6;
                classArray[n4] = clazz5 = Integer.TYPE;
                GenericDeclaration genericDeclaration = Boolean.TYPE;
                int n10 = 4;
                classArray[n10] = genericDeclaration;
                Class<Configuration> clazz7 = Configuration.class;
                n7 = 5;
                classArray[n7] = clazz7;
                n7 = 6;
                classArray[n7] = clazz7;
                n10 = 7;
                classArray[n10] = genericDeclaration;
                n10 = 8;
                classArray[n10] = genericDeclaration;
                genericDeclaration = ((Class)object).getDeclaredMethod((String)object2, classArray);
                ((AccessibleObject)((Object)genericDeclaration)).setAccessible(bl2);
                GenericDeclaration genericDeclaration2 = genericDeclaration;
            }
            catch (Throwable throwable) {}
        }
        f = var5_11;
    }
}

