/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzbj;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;

public final class zzbi
extends zzbj {
    public zzbi(Object object, Field field, Class clazz) {
        clazz = Array.newInstance(clazz, 0).getClass();
        super(object, field, clazz);
    }

    private final Class zzf() {
        return this.zzd().getType().getComponentType();
    }

    public final void zza(Collection object) {
        boolean bl2;
        Object object2 = (Object[])this.zzc();
        int n3 = object2 == null ? 0 : ((Object[])object2).length;
        Object[] objectArray = this.zzf();
        int n4 = object.size() + n3;
        objectArray = (Object[])Array.newInstance(objectArray, n4);
        if (object2 != null) {
            n4 = ((Object[])object2).length;
            System.arraycopy(object2, 0, objectArray, 0, n4);
        }
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            objectArray[n3] = object2 = object.next();
            ++n3;
        }
        this.zze(objectArray);
    }

    public final void zzb(Collection object) {
        boolean bl2;
        Object[] objectArray;
        int n3;
        Object object2 = (Object[])this.zzc();
        int n4 = 0;
        if (object2 == null) {
            n3 = 0;
            objectArray = null;
        } else {
            n3 = ((Object[])object2).length;
        }
        Class clazz = this.zzf();
        int n7 = object.size() + n3;
        objectArray = (Object[])Array.newInstance(clazz, n7);
        if (object2 != null) {
            int n8 = object.size();
            n7 = ((Object[])object2).length;
            System.arraycopy(object2, 0, objectArray, n8, n7);
        }
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            objectArray[n4] = object2 = object.next();
            ++n4;
        }
        this.zze(objectArray);
    }
}

