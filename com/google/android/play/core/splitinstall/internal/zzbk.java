/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzbi;
import com.google.android.play.core.splitinstall.internal.zzbj;
import com.google.android.play.core.splitinstall.internal.zzbl;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public final class zzbk {
    public static zzbi zza(Object object, String object2, Class clazz) {
        object2 = zzbk.zzh(object, (String)object2);
        zzbi zzbi2 = new zzbi(object, (Field)object2, clazz);
        return zzbi2;
    }

    public static zzbj zzb(Object object, String object2, Class clazz) {
        object2 = zzbk.zzh(object, (String)object2);
        zzbj zzbj2 = new zzbj(object, (Field)object2, clazz);
        return zzbj2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object zzc(Class object) {
        Object var1_1 = null;
        try {
            Constructor constructor = ((Class)object).getDeclaredConstructor(null);
            boolean bl2 = constructor.isAccessible();
            if (bl2) return constructor.newInstance(null);
            bl2 = true;
            ((AccessibleObject)constructor).setAccessible(bl2);
            return constructor.newInstance(null);
        }
        catch (Exception exception) {}
        object = ((Class)object).getName();
        object = "Failed to invoke default constructor on class ".concat((String)object);
        zzbl zzbl2 = new zzbl((String)object, exception);
        throw zzbl2;
    }

    public static Object zzd(Object object, String string2, Class clazz, Class object2, Object object3) {
        Object[] objectArray;
        int n3 = 1;
        Class[] classArray = new Class[n3];
        classArray[0] = object2;
        object2 = zzbk.zzi(object.getClass(), string2, classArray);
        try {
            objectArray = new Object[n3];
        }
        catch (Exception exception) {
            object = object.getClass();
            object3 = new StringBuilder("Failed to invoke method ");
            ((StringBuilder)object3).append(string2);
            ((StringBuilder)object3).append(" on an object of type ");
            ((StringBuilder)object3).append(object);
            object = ((StringBuilder)object3).toString();
            object2 = new zzbl((String)object, exception);
            throw object2;
        }
        objectArray[0] = object3;
        object2 = ((Method)object2).invoke(object, objectArray);
        return clazz.cast(object2);
    }

    public static Object zze(Object object, String string2, Class clazz, Class object2, Object object3, Class clazz2, Object object4, Class genericDeclaration, Object object5) {
        Object[] objectArray;
        int n3 = 3;
        Class[] classArray = new Class[n3];
        classArray[0] = object2;
        int n4 = 1;
        classArray[n4] = clazz2;
        int n7 = 2;
        classArray[n7] = genericDeclaration;
        genericDeclaration = zzbk.zzi(object.getClass(), string2, classArray);
        try {
            objectArray = new Object[n3];
        }
        catch (Exception exception) {
            object = object.getClass();
            object3 = new StringBuilder("Failed to invoke method ");
            ((StringBuilder)object3).append(string2);
            ((StringBuilder)object3).append(" on an object of type ");
            ((StringBuilder)object3).append(object);
            object = ((StringBuilder)object3).toString();
            object2 = new zzbl((String)object, exception);
            throw object2;
        }
        objectArray[0] = object3;
        objectArray[n4] = object4;
        objectArray[n7] = object5;
        object2 = ((Method)genericDeclaration).invoke(object, objectArray);
        return clazz.cast(object2);
    }

    public static Object zzf(Class object, String object2, Class serializable, Class object3, Object object4) {
        int n3 = 1;
        Class[] classArray = new Class[n3];
        classArray[0] = object3;
        object3 = zzbk.zzi((Class)object, "isDexOptNeeded", classArray);
        try {
            object2 = new Object[n3];
        }
        catch (Exception exception) {
            object3 = new StringBuilder("Failed to invoke static method isDexOptNeeded on type ");
            ((StringBuilder)object3).append(object);
            object = ((StringBuilder)object3).toString();
            serializable = new zzbl((String)object, exception);
            throw serializable;
        }
        object2[0] = object4;
        object4 = null;
        object2 = ((Method)object3).invoke(null, object2);
        return ((Class)serializable).cast(object2);
    }

    public static Object zzg(Class object, String object2, Class serializable, Class serializable2, Object object3, Class genericDeclaration, Object object4) {
        int n3 = 2;
        Class[] classArray = new Class[n3];
        classArray[0] = serializable2;
        int n4 = 1;
        classArray[n4] = genericDeclaration;
        genericDeclaration = zzbk.zzi((Class)object, "optimizedPathFor", classArray);
        try {
            object2 = new Object[n3];
        }
        catch (Exception exception) {
            serializable2 = new StringBuilder("Failed to invoke static method optimizedPathFor on type ");
            ((StringBuilder)serializable2).append(object);
            object = ((StringBuilder)serializable2).toString();
            serializable = new zzbl((String)object, exception);
            throw serializable;
        }
        object2[0] = object3;
        object2[n4] = object4;
        n4 = 0;
        serializable2 = null;
        object2 = ((Method)genericDeclaration).invoke(null, object2);
        return ((Class)serializable).cast(object2);
    }

    private static Field zzh(Object object, String string2) {
        Serializable serializable;
        for (serializable = object.getClass(); serializable != null; serializable = ((Class)serializable).getSuperclass()) {
            Field field;
            block5: {
                try {
                    field = ((Class)serializable).getDeclaredField(string2);
                }
                catch (NoSuchFieldException noSuchFieldException) {
                    continue;
                }
                boolean bl2 = field.isAccessible();
                if (bl2) break block5;
                bl2 = true;
                ((AccessibleObject)field).setAccessible(bl2);
            }
            return field;
        }
        object = object.getClass().getName();
        object = UX.c("Failed to find a field named ", string2, " on an object of instance ", (String)object);
        serializable = new zzbl((String)object);
        throw serializable;
    }

    private static Method zzi(Class object, String string2, Class ... object2) {
        Object[] objectArray;
        Serializable serializable;
        int n3 = 1;
        for (serializable = object; serializable != null; serializable = ((Class)serializable).getSuperclass()) {
            block5: {
                try {
                    objectArray = ((Class)serializable).getDeclaredMethod(string2, (Class<?>)object2);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    continue;
                }
                boolean bl2 = objectArray.isAccessible();
                if (bl2) break block5;
                objectArray.setAccessible(n3 != 0);
            }
            return objectArray;
        }
        object2 = Arrays.asList(object2);
        objectArray = new Object[3];
        objectArray[0] = string2;
        objectArray[n3] = object2;
        objectArray[2] = object;
        object = String.format("Could not find a method named %s with parameters %s in type %s", objectArray);
        serializable = new zzbl((String)object);
        throw serializable;
    }
}

