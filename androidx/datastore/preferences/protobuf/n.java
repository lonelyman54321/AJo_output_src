/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.a_0;
import androidx.datastore.preferences.protobuf.g_0;
import androidx.datastore.preferences.protobuf.n$a;
import androidx.datastore.preferences.protobuf.n$f;
import androidx.datastore.preferences.protobuf.y;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class n
extends a_0 {
    private static Map defaultInstanceMap;
    protected int memoizedSerializedSize;
    protected I unknownFields;

    static {
        ConcurrentHashMap concurrentHashMap;
        defaultInstanceMap = concurrentHashMap = new ConcurrentHashMap();
    }

    public n() {
        I i3;
        this.unknownFields = i3 = I.f;
        this.memoizedSerializedSize = -1;
    }

    public static n g(Class serializable) {
        Object object;
        Object object2 = (n)defaultInstanceMap.get(serializable);
        if (object2 == null) {
            try {
                object2 = serializable.getName();
            }
            catch (ClassNotFoundException classNotFoundException) {
                object2 = new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
                throw object2;
            }
            object = serializable.getClassLoader();
            boolean bl2 = true;
            Class.forName((String)object2, bl2, (ClassLoader)object);
            object2 = (n)defaultInstanceMap.get(serializable);
        }
        if (object2 == null) {
            object2 = (n)nw3.a(serializable);
            object2.getClass();
            object = n$f.GET_DEFAULT_INSTANCE;
            object2 = (n)((n)object2).f((n$f)((Object)object));
            if (object2 != null) {
                object = defaultInstanceMap;
                object.put(serializable, object2);
            } else {
                serializable = new IllegalStateException();
                throw serializable;
            }
        }
        return object2;
    }

    public static Object h(Method object, Object object2, Object ... objectArray) {
        try {
            return ((Method)object).invoke(object2, objectArray);
        }
        catch (InvocationTargetException invocationTargetException) {
            object = invocationTargetException.getCause();
            boolean bl2 = object instanceof RuntimeException;
            if (!bl2) {
                bl2 = object instanceof Error;
                if (bl2) {
                    throw (Error)object;
                }
                object2 = new RuntimeException("Unexpected exception thrown by generated accessor method.", (Throwable)object);
                throw object2;
            }
            throw (RuntimeException)object;
        }
        catch (IllegalAccessException illegalAccessException) {
            object2 = new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", illegalAccessException);
            throw object2;
        }
    }

    public static void j(Class clazz, n n3) {
        defaultInstanceMap.put(clazz, n3);
    }

    public final int a() {
        return this.memoizedSerializedSize;
    }

    public n b() {
        n$f n$f = n$f.GET_DEFAULT_INSTANCE;
        return (n)this.f(n$f);
    }

    public final void d(CodedOutputStream codedOutputStream) {
        Object object = GB2.c;
        object.getClass();
        Object object2 = this.getClass();
        object = ((GB2)object).a((Class)object2);
        object2 = codedOutputStream.a;
        if (object2 == null) {
            object2 = new g_0(codedOutputStream);
        }
        object.b(this, (L)object2);
    }

    public final void e(int n3) {
        this.memoizedSerializedSize = n3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Object object2 = n$f.GET_DEFAULT_INSTANCE;
        boolean bl2 = ((Class)(object2 = ((n)this.f((n$f)((Object)object2))).getClass())).isInstance(object);
        if (!bl2) {
            return false;
        }
        object2 = GB2.c;
        object2.getClass();
        Class<?> clazz = this.getClass();
        object2 = ((GB2)object2).a(clazz);
        object = (n)object;
        return object2.equals(this, object);
    }

    public abstract Object f(n$f var1);

    public final int getSerializedSize() {
        int n3 = this.memoizedSerializedSize;
        int n4 = -1;
        if (n3 == n4) {
            Object object = GB2.c;
            object.getClass();
            Class<?> clazz = this.getClass();
            object = ((GB2)object).a(clazz);
            this.memoizedSerializedSize = n3 = object.getSerializedSize(this);
        }
        return this.memoizedSerializedSize;
    }

    public final int hashCode() {
        int n3 = this.memoizedHashCode;
        if (n3 != 0) {
            return n3;
        }
        GB2 gB2 = GB2.c;
        gB2.getClass();
        Class<?> clazz = this.getClass();
        this.memoizedHashCode = n3 = gB2.a(clazz).hashCode(this);
        return n3;
    }

    public final boolean i() {
        byte by2;
        Object object = n$f.GET_MEMOIZED_IS_INITIALIZED;
        byte by4 = (Byte)(object = (Byte)this.f((n$f)((Object)object)));
        if (by4 != (by2 = 1)) {
            if (!by4) {
                by2 = 0;
                Object var4_4 = null;
            } else {
                object = GB2.c;
                ((Object)object).getClass();
                Class<?> clazz = this.getClass();
                by2 = ((GB2)object).a(clazz).isInitialized(this);
                object = n$f.SET_MEMOIZED_IS_INITIALIZED;
                this.f((n$f)((Object)object));
            }
        }
        return by2 != 0;
    }

    public n$a newBuilderForType() {
        n$f n$f = n$f.NEW_BUILDER;
        return (n$a)this.f(n$f);
    }

    public n$a toBuilder() {
        Object object = n$f.NEW_BUILDER;
        object = (n$a)this.f((n$f)((Object)object));
        ((n$a)object).g();
        n$a.i(((n$a)object).b, this);
        return object;
    }

    public final String toString() {
        String string2 = super.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(string2);
        y.c(this, stringBuilder, 0);
        return stringBuilder.toString();
    }
}

