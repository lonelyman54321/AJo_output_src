/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from androidx.datastore.preferences.protobuf.i
 */
public final class i_0 {
    public static volatile i_0 b;
    public static final i_0 c;
    public final Map a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object = "androidx.datastore.preferences.protobuf.Extension";
        try {
            Class.forName((String)object);
        }
        catch (ClassNotFoundException classNotFoundException) {}
        c = object = new i_0(0);
    }

    public i_0() {
        HashMap hashMap;
        this.a = hashMap = new HashMap();
    }

    public i_0(int n3) {
        Map map2;
        this.a = map2 = Collections.emptyMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static i_0 a() {
        Object object = b;
        if (object != null) return object;
        Class<i_0> clazz = i_0.class;
        synchronized (clazz) {
            Throwable throwable2;
            block7: {
                block6: {
                    try {
                        object = b;
                        if (object != null) return object;
                        object = KH0.a;
                        if (object == null) break block6;
                        String string2 = "getEmptyRegistry";
                        try {
                            object = ((Class)object).getDeclaredMethod(string2, null);
                            object = ((Method)object).invoke(null, null);
                            object = (i_0)object;
                        }
                        catch (Exception exception) {}
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                object = c;
                b = object;
                return object;
            }
            throw throwable2;
        }
    }
}

