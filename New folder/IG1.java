/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class IG1 {
    public static SZ0 a(String object) {
        InstantiationException instantiationException2;
        block12: {
            IllegalAccessException illegalAccessException2;
            block11: {
                NoSuchMethodException noSuchMethodException2;
                block10: {
                    InvocationTargetException invocationTargetException2;
                    block9: {
                        RuntimeException runtimeException;
                        boolean bl2;
                        try {
                            object = Class.forName((String)object);
                            bl2 = false;
                            runtimeException = null;
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to find GlideModule implementation", classNotFoundException);
                            throw illegalArgumentException;
                        }
                        Constructor constructor = ((Class)object).getDeclaredConstructor(null);
                        try {
                            object = constructor.newInstance(null);
                        }
                        catch (InvocationTargetException invocationTargetException2) {
                            break block9;
                        }
                        catch (NoSuchMethodException noSuchMethodException2) {
                            break block10;
                        }
                        catch (IllegalAccessException illegalAccessException2) {
                            break block11;
                        }
                        catch (InstantiationException instantiationException2) {
                            break block12;
                        }
                        bl2 = object instanceof SZ0;
                        if (bl2) {
                            return (SZ0)object;
                        }
                        object = jk0_0.a(object, "Expected instanceof GlideModule, but found: ");
                        runtimeException = new RuntimeException((String)object);
                        throw runtimeException;
                    }
                    IG1.b((Class)object, invocationTargetException2);
                    throw null;
                }
                IG1.b((Class)object, noSuchMethodException2);
                throw null;
            }
            IG1.b((Class)object, illegalAccessException2);
            throw null;
        }
        IG1.b((Class)object, instantiationException2);
        throw null;
    }

    public static void b(Class object, ReflectiveOperationException reflectiveOperationException) {
        StringBuilder stringBuilder = new StringBuilder("Unable to instantiate GlideModule implementation for ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        RuntimeException runtimeException = new RuntimeException((String)object, reflectiveOperationException);
        throw runtimeException;
    }
}

