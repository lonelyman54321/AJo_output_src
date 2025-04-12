/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.dynamic;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class ObjectWrapper
extends IObjectWrapper$Stub {
    private final Object zza;

    private ObjectWrapper(Object object) {
        this.zza = object;
    }

    public static Object unwrap(IObjectWrapper object) {
        boolean bl2 = object instanceof ObjectWrapper;
        if (bl2) {
            return ((ObjectWrapper)object).zza;
        }
        object = object.asBinder();
        Object object2 = object.getClass().getDeclaredFields();
        int n3 = ((Field[])object2).length;
        AccessibleObject accessibleObject = null;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; i3 += 1) {
            Field field = object2[i3];
            boolean bl3 = field.isSynthetic();
            if (bl3) continue;
            n4 += 1;
            accessibleObject = field;
        }
        n3 = 1;
        if (n4 == n3) {
            Preconditions.checkNotNull(accessibleObject);
            bl2 = accessibleObject.isAccessible();
            if (!bl2) {
                accessibleObject.setAccessible(n3 != 0);
                try {
                    return ((Field)accessibleObject).get(object);
                }
                catch (IllegalAccessException illegalAccessException) {
                    object2 = new IllegalArgumentException("Could not access the field in remoteBinder.", illegalAccessException);
                    throw object2;
                }
                catch (NullPointerException nullPointerException) {
                    object2 = new IllegalArgumentException("Binder object is null.", nullPointerException);
                    throw object2;
                }
            }
            object = new IllegalArgumentException("IObjectWrapper declared field not private!");
            throw object;
        }
        object2 = hj0_0.a(((Field[])object2).length, "Unexpected number of IObjectWrapper declared fields: ");
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public static IObjectWrapper wrap(Object object) {
        ObjectWrapper objectWrapper = new ObjectWrapper(object);
        return objectWrapper;
    }
}

