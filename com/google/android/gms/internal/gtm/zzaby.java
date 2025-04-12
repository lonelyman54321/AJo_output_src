/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabq;
import com.google.android.gms.internal.gtm.zzafb;
import com.google.android.gms.internal.gtm.zzzi;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzaby {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzabq zzb(Class object) {
        NoSuchMethodException noSuchMethodException3;
        block23: {
            IllegalAccessException illegalAccessException3;
            block22: {
                boolean bl2;
                Class<Collection> clazz;
                int n3;
                Object var1_4 = null;
                int n4 = 1;
                Object object2 = zzaby.class;
                ArrayList<zzabq> arrayList = ((Class)object2).getClassLoader();
                Object object3 = zzabq.class;
                boolean bl3 = object.equals(object3);
                if (bl3) {
                    object2 = "com.google.android.gms.internal.gtm.zzyn";
                } else {
                    object3 = ((Class)object).getPackage();
                    n3 = object3.equals(object2 = ((Class)object2).getPackage());
                    if (n3 == 0) {
                        object = ((Class)object).getName();
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                        throw illegalArgumentException;
                    }
                    object2 = ((Class)object).getPackage().getName();
                    object3 = ((Class)object).getSimpleName();
                    String string2 = ".BlazeGenerated";
                    clazz = "Loader";
                    object2 = y02.a((String)object2, string2, (String)object3, (String)((Object)clazz));
                }
                bl3 = false;
                object3 = null;
                try {
                    NoSuchMethodException noSuchMethodException22;
                    block21: {
                        InstantiationException instantiationException2;
                        block20: {
                            IllegalAccessException illegalAccessException22;
                            block19: {
                                object2 = Class.forName((String)object2, n4 != 0, (ClassLoader)((Object)arrayList));
                                try {
                                    object2 = ((Class)object2).getConstructor(null);
                                    object2 = ((Constructor)object2).newInstance(null);
                                    object2 = (zzaby)object2;
                                    object2 = ((zzaby)object2).zza();
                                    object2 = ((Class)object).cast(object2);
                                    return (zzabq)object2;
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
                                arrayList = new ArrayList<zzabq>((Throwable)invocationTargetException);
                                throw arrayList;
                            }
                            arrayList = new ArrayList<zzabq>((Throwable)illegalAccessException22);
                            throw arrayList;
                        }
                        arrayList = new ArrayList<zzabq>((Throwable)instantiationException2);
                        throw arrayList;
                    }
                    arrayList = new ArrayList<zzabq>((Throwable)noSuchMethodException22);
                    throw arrayList;
                }
                catch (ClassNotFoundException classNotFoundException) {}
                object2 = Collections.singletonList(zzafb.class.getDeclaredConstructor(null).newInstance(null)).iterator();
                arrayList = new ArrayList<zzabq>();
                while (bl2 = object2.hasNext()) {
                    try {
                        Object e2 = object2.next();
                        zzaby zzaby2 = (zzaby)e2;
                        zzabq zzabq2 = zzaby2.zza();
                        Object t3 = ((Class)object).cast(zzabq2);
                        zzabq zzabq3 = (zzabq)t3;
                        arrayList.add(zzabq3);
                    }
                    catch (ServiceConfigurationError serviceConfigurationError) {
                        clazz = Logger.getLogger(zzzi.class.getName());
                        Level level = Level.SEVERE;
                        String string3 = ((Class)object).getSimpleName();
                        String string4 = "load";
                        String string5 = "Unable to load ".concat(string3);
                        String string6 = "com.google.protobuf.GeneratedExtensionRegistryLoader";
                        ((Logger)((Object)clazz)).logp(level, string6, string4, string5, serviceConfigurationError);
                    }
                }
                n3 = arrayList.size();
                if (n3 == n4) {
                    return (zzabq)arrayList.get(0);
                }
                n3 = arrayList.size();
                if (n3 == 0) {
                    return null;
                }
                object2 = "combine";
                try {
                    Class[] classArray = new Class[n4];
                    classArray[0] = clazz = Collection.class;
                    object = ((Class)object).getMethod((String)object2, classArray);
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = arrayList;
                    object = ((Method)object).invoke(null, objectArray);
                    return (zzabq)object;
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

    public abstract zzabq zza();
}

