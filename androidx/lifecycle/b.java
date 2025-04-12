/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.b$a;
import androidx.lifecycle.b$b;
import androidx.lifecycle.i$a;
import androidx.lifecycle.p;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class b {
    public static final b c;
    public final HashMap a;
    public final HashMap b;

    static {
        b b2;
        c = b2 = new b();
    }

    public b() {
        HashMap hashMap;
        this.a = hashMap = new HashMap();
        this.b = hashMap = new HashMap();
    }

    public static void b(HashMap object, b$b object2, i$a i$a, Class clazz) {
        i$a i$a2 = (i$a)((Object)((HashMap)object).get(object2));
        if (i$a2 != null && i$a != i$a2) {
            object = ((b$b)object2).b;
            StringBuilder stringBuilder = new StringBuilder("Method ");
            object = ((Method)object).getName();
            stringBuilder.append((String)object);
            stringBuilder.append(" in ");
            object = clazz.getName();
            stringBuilder.append((String)object);
            stringBuilder.append(" already declared with different @OnLifecycleEvent value: previous value ");
            stringBuilder.append((Object)i$a2);
            stringBuilder.append(", new value ");
            stringBuilder.append((Object)i$a);
            object = stringBuilder.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        if (i$a2 == null) {
            ((HashMap)object).put(object2, i$a);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final b$a a(Class serializable, Method[] object) {
        void var2_9;
        void var2_7;
        int n3;
        Object object2;
        Object object3 = ((Class)serializable).getSuperclass();
        HashMap hashMap = new HashMap();
        int n4 = 0;
        HashMap hashMap2 = this.a;
        if (object3 != null) {
            void var7_19;
            b$a b$a = (b$a)hashMap2.get(object3);
            if (b$a == null) {
                b$a b$a2 = this.a((Class)object3, null);
            }
            object3 = var7_19.b;
            hashMap.putAll(object3);
        }
        object3 = ((Class)serializable).getInterfaces();
        int n7 = ((Class<?>[])object3).length;
        Method method = null;
        for (int i3 = 0; i3 < n7; ++i3) {
            void var12_31;
            object2 = object3[i3];
            b$a b$a = (b$a)hashMap2.get(object2);
            if (b$a == null) {
                b$a b$a3 = this.a((Class)object2, null);
            }
            object2 = var12_31.b.entrySet().iterator();
            while ((n3 = object2.hasNext()) != 0) {
                Map.Entry entry = (Map.Entry)object2.next();
                b$b b$b = (b$b)entry.getKey();
                i$a i$a = (i$a)((Object)entry.getValue());
                androidx.lifecycle.b.b(hashMap, b$b, i$a, (Class)serializable);
            }
        }
        if (var2_7 == null) {
            try {
                Method[] methodArray = ((Class)serializable).getDeclaredMethods();
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", noClassDefFoundError);
                throw illegalArgumentException;
            }
        }
        int n8 = ((void)var2_9).length;
        n4 = 0;
        n7 = 0;
        Object var7_20 = null;
        while (true) {
            if (n4 >= n8) {
                b$a b$a = new b$a(hashMap);
                hashMap2.put(serializable, b$a);
                object3 = this.b;
                Boolean bl2 = n7 != 0;
                ((HashMap)object3).put(serializable, bl2);
                return b$a;
            }
            method = var2_9[n4];
            object2 = method.getAnnotation(p.class);
            if (object2 != null) {
                Class<?> clazz;
                Class<?>[] classArray = method.getParameterTypes();
                n3 = classArray.length;
                int n10 = 1;
                if (n3 > 0) {
                    Class<mu1_1> clazz2 = mu1_1.class;
                    clazz = classArray[0];
                    n3 = (int)(clazz2.isAssignableFrom(clazz) ? 1 : 0);
                    if (n3 == 0) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        throw illegalArgumentException;
                    }
                    n3 = 1;
                } else {
                    n3 = 0;
                    Object var12_36 = null;
                }
                object2 = object2.value();
                int n14 = classArray.length;
                int n15 = 2;
                if (n14 > n10) {
                    Class<i$a> clazz3 = i$a.class;
                    clazz = classArray[n10];
                    n3 = (int)(clazz3.isAssignableFrom(clazz) ? 1 : 0);
                    if (n3 == 0) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("invalid parameter type. second arg must be an event");
                        throw illegalArgumentException;
                    }
                    i$a i$a = i$a.ON_ANY;
                    if (object2 != i$a) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        throw illegalArgumentException;
                    }
                    n3 = 2;
                }
                if ((n7 = classArray.length) > n15) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("cannot have more than 2 params");
                    throw illegalArgumentException;
                }
                b$b b$b = new b$b(method, n3);
                androidx.lifecycle.b.b(hashMap, b$b, (i$a)((Object)object2), (Class)serializable);
                n7 = 1;
            }
            ++n4;
        }
    }
}

