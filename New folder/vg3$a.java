/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 */
import android.view.MenuItem;
import java.lang.reflect.Method;

public final class vg3$a
implements MenuItem.OnMenuItemClickListener {
    public static final Class[] c;
    public Object a;
    public Method b;

    static {
        Class[] classArray = new Class[]{MenuItem.class};
        c = classArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean onMenuItemClick(MenuItem object) {
        Exception exception2;
        RuntimeException runtimeException;
        block4: {
            Object object2;
            Object[] objectArray;
            Method method;
            boolean bl2;
            block3: {
                runtimeException = null;
                bl2 = true;
                method = this.b;
                try {
                    objectArray = method.getReturnType();
                    Class<Boolean> clazz = Boolean.TYPE;
                    object2 = this.a;
                    if (objectArray != clazz) break block3;
                }
                catch (Exception exception2) {
                    break block4;
                }
                Object[] objectArray2 = new Object[bl2];
                objectArray2[0] = object;
                object = method.invoke(object2, objectArray2);
                object = (Boolean)object;
                return (Boolean)object;
            }
            objectArray = new Object[bl2];
            objectArray[0] = object;
            method.invoke(object2, objectArray);
            return bl2;
        }
        runtimeException = new RuntimeException(exception2);
        throw runtimeException;
    }
}

