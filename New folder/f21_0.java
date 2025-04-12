/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 */
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from F21
 */
public final class f21_0 {
    public static final /* synthetic */ int a;
    private static volatile Choreographer choreographer;

    static {
        Object object = tl2_2.b;
        tL2$a tL2$a = Looper.getMainLooper();
        tL2$a = f21_0.b((Looper)tL2$a);
        try {
            object = new c21_0((Handler)tL2$a);
        }
        catch (Throwable throwable) {
            tL2$a = tl2_2.b;
            object = vl2_2.a(throwable);
        }
        boolean bl2 = object instanceof tL2$b;
        if (bl2) {
            object = null;
        }
        object = (d21_0)object;
    }

    public static final void a() {
        Choreographer choreographer = f21_0.choreographer;
        if (choreographer == null) {
            choreographer = Choreographer.getInstance();
            Intrinsics.checkNotNull(choreographer);
            f21_0.choreographer = choreographer;
        }
        e21_0 e21_02 = new e21_0();
        choreographer.postFrameCallback((Choreographer.FrameCallback)e21_02);
    }

    public static final Handler b(Looper object) {
        Object object2;
        int n3 = 2;
        int n4 = 3;
        int n7 = 1;
        int n8 = Build.VERSION.SDK_INT;
        int n10 = 28;
        Class<Looper> clazz = Looper.class;
        Class<Handler> clazz2 = Handler.class;
        if (n8 >= n10) {
            Object[] objectArray = new Class[n7];
            objectArray[0] = clazz;
            Method method = clazz2.getDeclaredMethod("createAsync", (Class<?>[])objectArray);
            objectArray = new Object[n7];
            objectArray[0] = object;
            object = method.invoke(null, objectArray);
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.os.Handler");
            return (Handler)object;
        }
        try {
            object2 = new Class[n4];
        }
        catch (NoSuchMethodException noSuchMethodException) {
            Handler handler = new Handler(object);
            return handler;
        }
        object2[0] = clazz;
        Class clazz3 = Handler.Callback.class;
        object2[n7] = clazz3;
        clazz3 = Boolean.TYPE;
        object2[n3] = clazz3;
        object2 = clazz2.getDeclaredConstructor((Class<?>)object2);
        Object[] objectArray = new Object[n4];
        objectArray[0] = object;
        objectArray[n7] = null;
        object = Boolean.TRUE;
        objectArray[n3] = object;
        return (Handler)((Constructor)object2).newInstance(objectArray);
    }
}

