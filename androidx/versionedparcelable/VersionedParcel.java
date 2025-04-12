/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable
 */
package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class VersionedParcel {
    public final Jp a;
    public final Jp b;
    public final Jp c;

    public VersionedParcel(Jp jp, Jp jp2, Jp jp4) {
        this.a = jp;
        this.b = jp2;
        this.c = jp4;
    }

    public abstract pb3_1 a();

    public final Class b(Class object) {
        Class<?> clazz = ((Class)object).getName();
        Jp jp = this.c;
        if ((clazz = (Class)jp.get(clazz)) == null) {
            clazz = ((Class)object).getPackage().getName();
            String string2 = ((Class)object).getSimpleName();
            String string3 = "Parcelizer";
            clazz = y02.a((String)((Object)clazz), ".", string2, string3);
            string2 = null;
            ClassLoader classLoader = ((Class)object).getClassLoader();
            clazz = Class.forName((String)((Object)clazz), false, classLoader);
            object = ((Class)object).getName();
            jp.put(object, clazz);
        }
        return clazz;
    }

    public final Method c(String string2) {
        int n3 = 1;
        Jp jp = this.a;
        Object object = (Method)jp.get(string2);
        if (object == null) {
            System.currentTimeMillis();
            object = VersionedParcel.class;
            Object object2 = ((Class)object).getClassLoader();
            object2 = Class.forName(string2, n3 != 0, (ClassLoader)object2);
            String string3 = "read";
            Class[] classArray = new Class[n3];
            classArray[0] = object;
            object = ((Class)object2).getDeclaredMethod(string3, classArray);
            jp.put(string2, object);
        }
        return object;
    }

    public final Method d(Class object) {
        Object object2 = ((Class)object).getName();
        Jp jp = this.b;
        if ((object2 = (Method)jp.get(object2)) == null) {
            object2 = this.b((Class)object);
            System.currentTimeMillis();
            int n3 = 2;
            Class[] classArray = new Class[n3];
            classArray[0] = object;
            int n4 = 1;
            classArray[n4] = VersionedParcel.class;
            String string2 = "write";
            object2 = ((Class)object2).getDeclaredMethod(string2, classArray);
            object = ((Class)object).getName();
            jp.put(object, object2);
        }
        return object2;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int var1);

    public abstract int i();

    public final int j(int n3, int n4) {
        if ((n4 = (int)(this.h(n4) ? 1 : 0)) == 0) {
            return n3;
        }
        return this.i();
    }

    public abstract Parcelable k();

    public abstract String l();

    public final qB3 m() {
        IllegalAccessException illegalAccessException2;
        Throwable throwable;
        block14: {
            InvocationTargetException invocationTargetException2;
            boolean bl2;
            block13: {
                NoSuchMethodException noSuchMethodException2;
                block12: {
                    Object object = this.l();
                    bl2 = false;
                    throwable = null;
                    if (object == null) {
                        return null;
                    }
                    pb3_1 pb3_12 = this.a();
                    object = this.c((String)object);
                    int n3 = 1;
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = pb3_12;
                    object = ((Method)object).invoke(null, objectArray);
                    try {
                        return (qB3)object;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                    }
                    catch (NoSuchMethodException noSuchMethodException2) {
                        break block12;
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block13;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block14;
                    }
                    throwable = new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException);
                    throw throwable;
                }
                throwable = new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException2);
                throw throwable;
            }
            throwable = invocationTargetException2.getCause();
            bl2 = throwable instanceof RuntimeException;
            if (bl2) {
                throw (RuntimeException)invocationTargetException2.getCause();
            }
            throwable = new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException2);
            throw throwable;
        }
        throwable = new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException2);
        throw throwable;
    }

    public abstract void n(int var1);

    public abstract void o(boolean var1);

    public abstract void p(byte[] var1);

    public abstract void q(CharSequence var1);

    public abstract void r(int var1);

    public final void s(int n3, int n4) {
        this.n(n4);
        this.r(n3);
    }

    public abstract void t(Parcelable var1);

    public abstract void u(String var1);

    public final void v(qB3 object) {
        IllegalAccessException illegalAccessException2;
        Throwable throwable;
        block18: {
            InvocationTargetException invocationTargetException2;
            boolean bl2;
            block17: {
                NoSuchMethodException noSuchMethodException2;
                block16: {
                    Object object2;
                    bl2 = false;
                    throwable = null;
                    if (object == null) {
                        this.u(null);
                        return;
                    }
                    try {
                        object2 = object.getClass();
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        object = object.getClass().getSimpleName().concat(" does not have a Parcelizer");
                        object2 = new RuntimeException((String)object, classNotFoundException);
                        throw object2;
                    }
                    object2 = this.b((Class)object2).getName();
                    this.u((String)object2);
                    object2 = this.a();
                    GenericDeclaration genericDeclaration = object.getClass();
                    genericDeclaration = this.d((Class)genericDeclaration);
                    int n3 = 2;
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object;
                    int n4 = 1;
                    objectArray[n4] = object2;
                    try {
                        ((Method)genericDeclaration).invoke(null, objectArray);
                        ((pb3_1)object2).w();
                        return;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                    }
                    catch (NoSuchMethodException noSuchMethodException2) {
                        break block16;
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block17;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block18;
                    }
                    throwable = new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException);
                    throw throwable;
                }
                throwable = new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException2);
                throw throwable;
            }
            throwable = invocationTargetException2.getCause();
            bl2 = throwable instanceof RuntimeException;
            if (bl2) {
                throw (RuntimeException)invocationTargetException2.getCause();
            }
            throwable = new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException2);
            throw throwable;
        }
        throwable = new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException2);
        throw throwable;
    }
}

