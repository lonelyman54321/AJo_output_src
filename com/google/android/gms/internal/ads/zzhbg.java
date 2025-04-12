/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhat;
import com.google.android.gms.internal.ads.zzhay;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzhbg {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzhay zzb(Class object) {
        NoSuchMethodException noSuchMethodException3;
        block23: {
            IllegalAccessException illegalAccessException3;
            block22: {
                Object object2;
                Class<Collection> clazz;
                Object object3;
                Object var1_4 = null;
                int n3 = 1;
                Object object4 = zzhbg.class;
                ArrayList<zzhay> arrayList = ((Class)object4).getClassLoader();
                Class<zzhay> clazz2 = zzhay.class;
                boolean bl2 = object.equals(clazz2);
                if (bl2) {
                    String string2 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
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
                                    zzhbg zzhbg2 = (zzhbg)obj;
                                    zzhay zzhay2 = zzhbg2.zza();
                                    Object t3 = ((Class)object).cast(zzhay2);
                                    return (zzhay)t3;
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
                arrayList = new ArrayList<zzhay>();
                while (bl2 = object4.hasNext()) {
                    try {
                        Object e2 = object4.next();
                        zzhbg zzhbg3 = (zzhbg)e2;
                        zzhay zzhay3 = zzhbg3.zza();
                        Object t4 = ((Class)object).cast(zzhay3);
                        zzhay zzhay4 = (zzhay)t4;
                        arrayList.add(zzhay4);
                    }
                    catch (ServiceConfigurationError serviceConfigurationError) {
                        clazz = Logger.getLogger(zzhat.class.getName());
                        object2 = Level.SEVERE;
                        String string5 = ((Class)object).getSimpleName();
                        String string6 = "load";
                        String string7 = "Unable to load ".concat(string5);
                        String string8 = "com.google.protobuf.GeneratedExtensionRegistryLoader";
                        ((Logger)((Object)clazz)).logp((Level)object2, string8, string6, string7, serviceConfigurationError);
                    }
                }
                int n4 = arrayList.size();
                if (n4 == n3) {
                    return (zzhay)arrayList.get(0);
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
                    return (zzhay)object;
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

    public abstract zzhay zza();
}

