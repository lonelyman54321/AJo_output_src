/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjn;
import com.google.android.gms.internal.measurement.zzjt;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzkf {
    private static String zza = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzjt zza(Class object) {
        NoSuchMethodException noSuchMethodException3;
        block23: {
            IllegalAccessException illegalAccessException3;
            block22: {
                Object object2;
                Class<Collection> clazz;
                Object object3;
                Object var1_4 = null;
                int n3 = 1;
                Object object4 = zzkf.class;
                ArrayList<zzjt> arrayList = ((Class)object4).getClassLoader();
                Class<zzjt> clazz2 = zzjt.class;
                boolean bl2 = object.equals(clazz2);
                if (bl2) {
                    String string2 = zza;
                } else {
                    Package package_ = ((Class)object).getPackage();
                    bl2 = package_.equals(object3 = ((Class)object4).getPackage());
                    if (!bl2) {
                        object = ((Class)object).getName();
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                        throw illegalArgumentException;
                    }
                    String string3 = ((Class)object).getPackage().getName();
                    object3 = ((Class)object).getSimpleName();
                    clazz = ".BlazeGenerated";
                    object2 = "Loader";
                    String string4 = y02.a(string3, (String)((Object)clazz), (String)object3, (String)object2);
                }
                object3 = null;
                try {
                    NoSuchMethodException noSuchMethodException22;
                    block21: {
                        InstantiationException instantiationException2;
                        block20: {
                            IllegalAccessException illegalAccessException22;
                            block19: {
                                void var5_17;
                                Class<?> clazz3 = Class.forName((String)var5_17, n3 != 0, (ClassLoader)((Object)arrayList));
                                try {
                                    Constructor<?> constructor = clazz3.getConstructor(null);
                                    Object obj = constructor.newInstance(null);
                                    zzkf zzkf2 = (zzkf)obj;
                                    zzjt zzjt2 = zzkf2.zza();
                                    Object t3 = ((Class)object).cast(zzjt2);
                                    return (zzjt)t3;
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                }
                                catch (IllegalAccessException illegalAccessException22) {
                                    break block19;
                                }
                                catch (InstantiationException instantiationException2) {
                                    break block20;
                                }
                                catch (NoSuchMethodException noSuchMethodException22) {
                                    break block21;
                                }
                                clazz = new Class<Collection>((Throwable)invocationTargetException);
                                throw clazz;
                            }
                            clazz = new Class<Collection>((Throwable)illegalAccessException22);
                            throw clazz;
                        }
                        clazz = new Class<Collection>((Throwable)instantiationException2);
                        throw clazz;
                    }
                    clazz = new Class<Collection>((Throwable)noSuchMethodException22);
                    throw clazz;
                }
                catch (ClassNotFoundException classNotFoundException) {}
                object4 = ServiceLoader.load(object4, (ClassLoader)((Object)arrayList)).iterator();
                arrayList = new ArrayList<zzjt>();
                while (bl2 = object4.hasNext()) {
                    try {
                        Object e2 = object4.next();
                        zzkf zzkf3 = (zzkf)e2;
                        zzjt zzjt3 = zzkf3.zza();
                        Object t4 = ((Class)object).cast(zzjt3);
                        zzjt zzjt4 = (zzjt)t4;
                        arrayList.add(zzjt4);
                    }
                    catch (ServiceConfigurationError serviceConfigurationError) {
                        clazz = Logger.getLogger(zzjn.class.getName());
                        object2 = Level.SEVERE;
                        String string5 = ((Class)object).getSimpleName();
                        String string6 = "Unable to load ".concat(string5);
                        String string7 = "com.google.protobuf.GeneratedExtensionRegistryLoader";
                        String string8 = "load";
                        ((Logger)((Object)clazz)).logp((Level)object2, string7, string8, string6, serviceConfigurationError);
                    }
                }
                int n4 = arrayList.size();
                if (n4 == n3) {
                    return (zzjt)arrayList.get(0);
                }
                n4 = arrayList.size();
                if (n4 == 0) {
                    return null;
                }
                object4 = "combine";
                try {
                    Class[] classArray = new Class[n3];
                    classArray[0] = clazz = Collection.class;
                    object = ((Class)object).getMethod((String)object4, classArray);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = arrayList;
                    object = ((Method)object).invoke(null, objectArray);
                    return (zzjt)object;
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (IllegalAccessException illegalAccessException3) {
                    break block22;
                }
                catch (NoSuchMethodException noSuchMethodException3) {
                    break block23;
                }
                IllegalStateException illegalStateException = new IllegalStateException(invocationTargetException);
                throw illegalStateException;
            }
            IllegalStateException illegalStateException = new IllegalStateException(illegalAccessException3);
            throw illegalStateException;
        }
        IllegalStateException illegalStateException = new IllegalStateException(noSuchMethodException3);
        throw illegalStateException;
    }

    public abstract zzjt zza();
}

