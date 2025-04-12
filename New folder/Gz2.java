/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Process
 */
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class Gz2 {
    static {
        Intrinsics.checkNotNullExpressionValue(qx1.b("ProcessUtils"), "tagWithPrefix(\"ProcessUtils\")");
    }

    public static final boolean a(Context object, a a2) {
        Object object2;
        block11: {
            String string2;
            boolean bl2;
            Iterator iterator;
            int n3;
            block14: {
                int n4;
                block13: {
                    Intrinsics.checkNotNullParameter(object, "context");
                    object2 = "configuration";
                    Intrinsics.checkNotNullParameter(a2, (String)object2);
                    n4 = Build.VERSION.SDK_INT;
                    n3 = 28;
                    if (n4 < n3) break block13;
                    object2 = Zl.a();
                    break block11;
                }
                n4 = 0;
                object2 = null;
                Object object3 = "android.app.ActivityThread";
                iterator = li3_1.class;
                iterator = ((Class)((Object)iterator)).getClassLoader();
                bl2 = false;
                string2 = null;
                object3 = Class.forName((String)object3, false, (ClassLoader)((Object)iterator));
                iterator = "currentProcessName";
                object3 = ((Class)object3).getDeclaredMethod((String)((Object)iterator), null);
                boolean bl3 = true;
                ((AccessibleObject)object3).setAccessible(bl3);
                object3 = ((Method)object3).invoke(null, null);
                Intrinsics.checkNotNull(object3);
                bl3 = object3 instanceof String;
                if (!bl3) break block14;
                try {
                    object2 = object3 = (String)object3;
                    break block11;
                }
                catch (Throwable throwable) {
                    object3 = qx1.a();
                    object3.getClass();
                }
            }
            n3 = Process.myPid();
            iterator = object.getSystemService("activity");
            string2 = "null cannot be cast to non-null type android.app.ActivityManager";
            Intrinsics.checkNotNull(iterator, string2);
            iterator = ((ActivityManager)iterator).getRunningAppProcesses();
            if (iterator != null) {
                block12: {
                    iterator = ((Iterable)((Object)iterator)).iterator();
                    while (bl2 = iterator.hasNext()) {
                        String string3 = string2 = iterator.next();
                        string3 = (ActivityManager.RunningAppProcessInfo)string2;
                        int n7 = ((ActivityManager.RunningAppProcessInfo)string3).pid;
                        if (n7 != n3) continue;
                        break block12;
                    }
                    bl2 = false;
                    string2 = null;
                }
                string2 = (ActivityManager.RunningAppProcessInfo)string2;
                if (string2 != null) {
                    object2 = ((ActivityManager.RunningAppProcessInfo)string2).processName;
                }
            }
        }
        a2.getClass();
        object = object.getApplicationInfo().processName;
        return Intrinsics.areEqual(object2, object);
    }
}

