/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzii;
import com.google.android.gms.internal.vision.zzio;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class zziz {
    private static final Logger zza = Logger.getLogger(zzii.class.getName());
    private static String zzb = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzio zza(Class object) {
        NoSuchMethodException noSuchMethodException3;
        block25: {
            IllegalAccessException illegalAccessException3;
            block24: {
                Object object2;
                Class<Collection> clazz;
                Object object3;
                Object var1_4 = null;
                int n3 = 1;
                Object object4 = zziz.class;
                ArrayList arrayList = ((Class)object4).getClassLoader();
                Class<zzio> clazz2 = zzio.class;
                boolean bl2 = object.equals(clazz2);
                if (bl2) {
                    String string2 = zzb;
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
                    block23: {
                        InstantiationException instantiationException2;
                        block22: {
                            IllegalAccessException illegalAccessException22;
                            block21: {
                                void var5_17;
                                Class<?> clazz3 = Class.forName((String)var5_17, n3 != 0, (ClassLoader)((Object)arrayList));
                                try {
                                    Constructor<?> constructor = clazz3.getConstructor(null);
                                    Object obj = constructor.newInstance(null);
                                    zziz zziz2 = (zziz)obj;
                                    zzio zzio2 = zziz2.zza();
                                    Object t3 = ((Class)object).cast(zzio2);
                                    return (zzio)t3;
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                }
                                catch (IllegalAccessException illegalAccessException22) {
                                    break block21;
                                }
                                catch (InstantiationException instantiationException2) {
                                    break block22;
                                }
                                catch (NoSuchMethodException noSuchMethodException22) {
                                    break block23;
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
                arrayList = new ArrayList();
                while (bl2 = object4.hasNext()) {
                    try {
                        Object e2 = object4.next();
                        zziz zziz3 = (zziz)e2;
                        zzio zzio3 = zziz3.zza();
                        Object t4 = ((Class)object).cast(zzio3);
                        arrayList.add(t4);
                    }
                    catch (ServiceConfigurationError serviceConfigurationError) {
                        void var5_35;
                        clazz = zza;
                        object2 = Level.SEVERE;
                        String string5 = ((Class)object).getSimpleName();
                        int n4 = string5.length();
                        String string6 = "Unable to load ";
                        if (n4 != 0) {
                            String string7 = string6.concat(string5);
                        } else {
                            String string8 = new String(string6);
                        }
                        String string9 = "com.google.protobuf.GeneratedExtensionRegistryLoader";
                        string6 = "load";
                        ((Logger)((Object)clazz)).logp((Level)object2, string9, string6, (String)var5_35, serviceConfigurationError);
                    }
                }
                int n7 = arrayList.size();
                if (n7 == n3) {
                    return (zzio)arrayList.get(0);
                }
                n7 = arrayList.size();
                if (n7 == 0) {
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
                    return (zzio)object;
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (IllegalAccessException illegalAccessException3) {
                    break block24;
                }
                catch (NoSuchMethodException noSuchMethodException3) {
                    break block25;
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

    public abstract zzio zza();
}

