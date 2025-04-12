/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

public final class s52 {
    public static final Object c;
    public static String d;
    public static HashSet e;
    public static final Object f;
    public static s52$d g;
    public final Context a;
    public final NotificationManager b;

    static {
        Object object;
        c = object = new Object();
        object = new HashSet();
        e = object;
        f = object = new Object();
    }

    public s52(Context context) {
        this.a = context;
        context = (NotificationManager)context.getSystemService("notification");
        this.b = context;
    }

    public final boolean a() {
        int n3 = 2;
        int n4 = 3;
        boolean bl2 = false;
        int n7 = 1;
        int n8 = Build.VERSION.SDK_INT;
        int n10 = 24;
        if (n8 >= n10) {
            return s52$a.a(this.b);
        }
        Object object = this.a;
        AppOpsManager appOpsManager = (AppOpsManager)object.getSystemService("appops");
        Object object2 = object.getApplicationInfo();
        object = object.getApplicationContext().getPackageName();
        int n14 = object2.uid;
        Object object3 = AppOpsManager.class;
        object3 = ((Class)object3).getName();
        object3 = Class.forName((String)object3);
        Object object4 = "checkOpNoThrow";
        Object object5 = new Class[n4];
        Class<Object> clazz = Integer.TYPE;
        object5[0] = clazz;
        object5[n7] = clazz;
        clazz = String.class;
        object5[n3] = clazz;
        object4 = ((Class)object3).getMethod((String)object4, (Class<?>)object5);
        object5 = "OP_POST_NOTIFICATION";
        object3 = ((Class)object3).getDeclaredField((String)object5);
        object5 = Integer.class;
        object3 = ((Field)object3).get(object5);
        object3 = (Integer)object3;
        ((Integer)object3).intValue();
        object2 = n14;
        Object[] objectArray = new Object[n4];
        objectArray[0] = object3;
        objectArray[n7] = object2;
        objectArray[n3] = object;
        Object object6 = ((Method)object4).invoke((Object)appOpsManager, objectArray);
        object6 = (Integer)object6;
        try {
            n3 = (Integer)object6;
            if (n3 == 0) {
                bl2 = true;
            }
            return bl2;
        }
        catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException exception) {
            return n7 != 0;
        }
    }
}

