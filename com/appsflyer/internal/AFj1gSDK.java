/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.BuildConfig
 */
package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import com.appsflyer.internal.AFj1hSDK;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

public final class AFj1gSDK
implements AFj1hSDK {
    public final String AFAdRevenueData() {
        Object object = "";
        Object object2 = tl2_2.b;
        object2 = BuildConfig.class;
        Object object3 = "VERSION_NAME";
        object2 = ((Class)object2).getDeclaredField((String)object3);
        boolean bl2 = true;
        ((AccessibleObject)object2).setAccessible(bl2);
        bl2 = false;
        object3 = null;
        object2 = ((Field)object2).get(null);
        try {
            Intrinsics.checkNotNull(object2, (String)object);
            object2 = (String)object2;
        }
        catch (Throwable throwable) {
            object3 = tl2_2.b;
            object2 = vl2_2.a(throwable);
        }
        object3 = object2;
        object3 = (Serializable)object2;
        bl2 = tl2_2.b((Serializable)object3);
        if (!bl2) {
            object = object2;
        }
        return object;
    }
}

