/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 */
package com.google.android.material.color;

import android.os.Build;
import com.google.android.material.color.DynamicColors$DeviceSupportCondition;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

class DynamicColors$2
implements DynamicColors$DeviceSupportCondition {
    private Long version;

    public boolean isSupported() {
        long l2;
        long l3;
        long l4;
        long l7;
        boolean bl2 = false;
        Object object = this.version;
        int n3 = 1;
        if (object == null) {
            object = Build.class;
            Object[] objectArray = "getLong";
            Object object2 = new Class[n3];
            Class<String> clazz = String.class;
            object2[0] = clazz;
            object = ((Class)object).getDeclaredMethod((String)objectArray, (Class<?>)object2);
            ((AccessibleObject)object).setAccessible(n3 != 0);
            objectArray = new Object[n3];
            object2 = "ro.build.version.oneui";
            objectArray[0] = object2;
            object2 = null;
            object = ((Method)object).invoke(null, objectArray);
            object = (Long)object;
            ((Long)object).longValue();
            try {
                this.version = object;
            }
            catch (Exception exception) {
                l7 = -1;
                this.version = object = Long.valueOf(l7);
            }
        }
        if ((l4 = (l3 = (l7 = ((Long)(object = this.version)).longValue()) - (l2 = 40100L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) >= 0) {
            bl2 = true;
        }
        return bl2;
    }
}

