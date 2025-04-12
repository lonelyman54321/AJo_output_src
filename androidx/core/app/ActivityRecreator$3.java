/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.app;

import androidx.core.app.c;
import java.lang.reflect.Method;

class ActivityRecreator$3
implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public ActivityRecreator$3(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        RuntimeException runtimeException2222;
        Object object;
        int n3;
        block5: {
            Object object2;
            Object object3;
            Method method;
            int n4 = 2;
            n3 = 1;
            object = null;
            try {
                method = c.d;
                object3 = this.b;
                object2 = this.a;
                if (method != null) {
                    int n7 = 3;
                    Object[] objectArray = new Object[n7];
                    objectArray[0] = object3;
                    objectArray[n3] = object = Boolean.FALSE;
                    String string2 = "AppCompat recreation";
                    objectArray[n4] = string2;
                    method.invoke(object2, objectArray);
                    return;
                }
            }
            catch (RuntimeException runtimeException2222) {
                break block5;
            }
            method = c.e;
            Object[] objectArray = new Object[n4];
            objectArray[0] = object3;
            objectArray[n3] = object = Boolean.FALSE;
            method.invoke(object2, objectArray);
            return;
        }
        Object object4 = runtimeException2222.getClass();
        object = RuntimeException.class;
        if (object4 != object) return;
        object4 = runtimeException2222.getMessage();
        if (object4 == null) return;
        object4 = runtimeException2222.getMessage();
        n3 = (int)(((String)object4).startsWith((String)(object = "Unable to stop")) ? 1 : 0);
        if (n3 != 0) throw runtimeException2222;
        return;
        catch (Throwable throwable) {}
    }
}

