/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.webkit.WebView
 */
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class DF3 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static InvocationHandler a() {
        NoSuchMethodException noSuchMethodException2222;
        Object object;
        block6: {
            InvocationTargetException invocationTargetException2222;
            block5: {
                Object object2;
                int n3 = Build.VERSION.SDK_INT;
                int n4 = 28;
                if (n3 >= n4) {
                    object2 = Am.b();
                    return (InvocationHandler)Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, (ClassLoader)object2).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
                }
                object2 = WebView.class;
                object = "getFactory";
                try {
                    object2 = ((Class)object2).getDeclaredMethod((String)object, null);
                    n4 = 1;
                    ((AccessibleObject)object2).setAccessible(n4 != 0);
                    object2 = ((Method)object2).invoke(null, null).getClass().getClassLoader();
                    return (InvocationHandler)Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, (ClassLoader)object2).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
                }
                catch (IllegalAccessException illegalAccessException222) {
                }
                catch (InvocationTargetException invocationTargetException2222) {
                    break block5;
                }
                catch (NoSuchMethodException noSuchMethodException2222) {
                    break block6;
                }
                object = new RuntimeException(illegalAccessException222);
                throw object;
            }
            object = new RuntimeException(invocationTargetException2222);
            throw object;
        }
        object = new RuntimeException(noSuchMethodException2222);
        throw object;
    }
}

