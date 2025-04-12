/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.b$b;
import androidx.lifecycle.i$a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b$a {
    public final HashMap a;
    public final Map b;

    public b$a(HashMap object) {
        boolean bl2;
        this.b = object;
        Object object2 = new HashMap();
        this.a = object2;
        object = ((HashMap)object).entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            i$a i$a = (i$a)((Object)object2.getValue());
            List list = (List)this.a.get((Object)i$a);
            if (list == null) {
                HashMap hashMap = this.a;
                hashMap.put(i$a, list);
            }
            object2 = (b$b)object2.getKey();
            list.add(object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(List list, mu1_1 object, i$a i$a, Object object2) {
        InvocationTargetException invocationTargetException2;
        block10: {
            IllegalAccessException illegalAccessException2;
            int n3 = 2;
            int n4 = 1;
            if (list == null) return;
            int n7 = list.size() - n4;
            while (true) {
                block9: {
                    Object[] objectArray;
                    int n8;
                    Object object3;
                    block6: {
                        block7: {
                            block8: {
                                if (n7 < 0) {
                                    return;
                                }
                                object3 = (b$b)list.get(n7);
                                object3.getClass();
                                try {
                                    n8 = ((b$b)object3).a;
                                    object3 = ((b$b)object3).b;
                                    if (n8 == 0) break block6;
                                    if (n8 == n4) break block7;
                                    if (n8 == n3) break block8;
                                    break block9;
                                }
                                catch (IllegalAccessException illegalAccessException2) {
                                    break;
                                }
                                catch (InvocationTargetException invocationTargetException2) {
                                    break block10;
                                }
                            }
                            objectArray = new Object[n3];
                            objectArray[0] = object;
                            objectArray[n4] = i$a;
                            ((Method)object3).invoke(object2, objectArray);
                            break block9;
                        }
                        objectArray = new Object[n4];
                        objectArray[0] = object;
                        ((Method)object3).invoke(object2, objectArray);
                        break block9;
                    }
                    n8 = 0;
                    objectArray = null;
                    ((Method)object3).invoke(object2, null);
                }
                n7 += -1;
            }
            object = new RuntimeException(illegalAccessException2);
            throw object;
        }
        Throwable throwable = invocationTargetException2.getCause();
        object = new RuntimeException("Failed to call observer method", throwable);
        throw object;
    }
}

