/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package androidx.lifecycle;

import android.app.Application;
import androidx.lifecycle.E$a$a;
import androidx.lifecycle.E$c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

public final class E$a
extends E$c {
    public static E$a b;
    public static final E$a$a c;
    public final Application a;

    static {
        E$a$a e$a$a;
        c = e$a$a = new Object();
    }

    public E$a(Application application) {
        this.a = application;
    }

    public final jD3 a(Application object, Class object2) {
        block16: {
            block15: {
                NoSuchMethodException noSuchMethodException2;
                Object[] objectArray;
                String string2;
                RuntimeException runtimeException;
                block14: {
                    IllegalAccessException illegalAccessException2;
                    block13: {
                        InstantiationException instantiationException2;
                        block12: {
                            InvocationTargetException invocationTargetException2;
                            block11: {
                                runtimeException = null;
                                int n3 = 1;
                                string2 = "Cannot create an instance of ";
                                Object object3 = Hj.class;
                                boolean bl2 = ((Class)object3).isAssignableFrom((Class<?>)object2);
                                if (!bl2) break block15;
                                object3 = new Class[n3];
                                Class<Application> clazz = Application.class;
                                object3[0] = clazz;
                                object3 = ((Class)object2).getConstructor((Class<?>)object3);
                                objectArray = new Object[n3];
                                objectArray[0] = object;
                                object = ((Constructor)object3).newInstance(objectArray);
                                try {
                                    object = (jD3)object;
                                    object2 = "{\n                try {\n\u2026          }\n            }";
                                }
                                catch (InvocationTargetException invocationTargetException2) {
                                    break block11;
                                }
                                catch (InstantiationException instantiationException2) {
                                    break block12;
                                }
                                catch (IllegalAccessException illegalAccessException2) {
                                    break block13;
                                }
                                catch (NoSuchMethodException noSuchMethodException2) {
                                    break block14;
                                }
                                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                                break block16;
                            }
                            objectArray = new StringBuilder(string2);
                            objectArray.append(object2);
                            object2 = objectArray.toString();
                            runtimeException = new RuntimeException((String)object2, invocationTargetException2);
                            throw runtimeException;
                        }
                        objectArray = new StringBuilder(string2);
                        objectArray.append(object2);
                        object2 = objectArray.toString();
                        runtimeException = new RuntimeException((String)object2, instantiationException2);
                        throw runtimeException;
                    }
                    objectArray = new StringBuilder(string2);
                    objectArray.append(object2);
                    object2 = objectArray.toString();
                    runtimeException = new RuntimeException((String)object2, illegalAccessException2);
                    throw runtimeException;
                }
                objectArray = new StringBuilder(string2);
                objectArray.append(object2);
                object2 = objectArray.toString();
                runtimeException = new RuntimeException((String)object2, noSuchMethodException2);
                throw runtimeException;
            }
            object = super.create((Class)object2);
        }
        return object;
    }

    public final jD3 create(Class serializable) {
        Intrinsics.checkNotNullParameter(serializable, "modelClass");
        Application application = this.a;
        if (application != null) {
            return this.a(application, (Class)serializable);
        }
        serializable = new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        throw serializable;
    }

    public final jD3 create(Class object, Wd0 clazz) {
        block5: {
            block3: {
                block4: {
                    Object object2;
                    block2: {
                        Intrinsics.checkNotNullParameter(object, "modelClass");
                        Intrinsics.checkNotNullParameter(clazz, "extras");
                        object2 = this.a;
                        if (object2 == null) break block2;
                        object = this.create((Class)object);
                        break block3;
                    }
                    object2 = c;
                    if ((clazz = (Application)((Wd0)((Object)clazz)).a((Wd0$b)object2)) == null) break block4;
                    object = this.a((Application)clazz, (Class)object);
                    break block3;
                }
                clazz = Hj.class;
                boolean bl2 = clazz.isAssignableFrom((Class<?>)object);
                if (bl2) break block5;
                object = super.create((Class)object);
            }
            return object;
        }
        object = new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        throw object;
    }
}

