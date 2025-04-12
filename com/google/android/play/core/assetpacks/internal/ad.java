/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.play.core.assetpacks.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.play.core.assetpacks.internal.ac;
import com.google.android.play.core.assetpacks.internal.o;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class ad {
    private static final o a;
    private final Context b;
    private final String c;

    static {
        o o3;
        a = o3 = new o("SplitInstallInfoProvider");
    }

    public ad(Context object) {
        this.b = object;
        object = object.getPackageName();
        this.c = object;
    }

    public final Set a() {
        boolean bl2;
        Object object;
        Object object2 = null;
        Object object3 = this.b;
        object3 = object3.getPackageManager();
        Object object4 = this.c;
        int n3 = 128;
        try {
            object3 = object3.getPackageInfo((String)object4, n3);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object3 = a;
            object4 = new Object[]{};
            object = "App is not found in PackageManager";
            ((o)object3).b((String)object, (Object[])object4);
            bl2 = false;
            object3 = null;
        }
        if (object3 != null && (object4 = ((PackageInfo)object3).applicationInfo) != null) {
            Object[] objectArray;
            int n4;
            Object[] objectArray2;
            object4 = new HashSet();
            object = ((PackageInfo)object3).applicationInfo.metaData;
            HashSet hashSet = new HashSet();
            if (object != null) {
                boolean bl3;
                objectArray2 = "com.android.dynamic.apk.fused.modules";
                if ((object = object.getString((String)objectArray2)) != null && !(bl3 = object.isEmpty())) {
                    objectArray2 = ",";
                    n4 = -1;
                    object = object.split((String)objectArray2, n4);
                    Collections.addAll(hashSet, object);
                    hashSet.remove("");
                    object = "base";
                    hashSet.remove(object);
                } else {
                    object = a;
                    objectArray2 = new Object[]{};
                    objectArray = "App has no fused modules.";
                    object.a((String)objectArray, objectArray2);
                }
            }
            if ((object3 = ((PackageInfo)object3).splitNames) != null) {
                object = a;
                objectArray2 = Arrays.toString((Object[])object3);
                n4 = 1;
                objectArray = new Object[n4];
                objectArray[0] = objectArray2;
                object2 = "Adding splits from package manager: %s";
                object.a((String)object2, objectArray);
                Collections.addAll(hashSet, object3);
            } else {
                object3 = a;
                object2 = new Object[]{};
                object = "No splits are found or app cannot be found in package manager.";
                ((o)object3).a((String)object, (Object[])object2);
            }
            object2 = ac.a();
            if (object2 != null) {
                object2 = object2.a();
                hashSet.addAll(object2);
            }
            object2 = hashSet.iterator();
            while (bl2 = object2.hasNext()) {
                object3 = (String)object2.next();
                n3 = (int)(((String)object3).startsWith((String)(object = "config.")) ? 1 : 0);
                if (n3 != 0 || (n3 = (int)(((String)object3).contains((CharSequence)(object = ".config.")) ? 1 : 0)) != 0) continue;
                ((HashSet)object4).add(object3);
            }
            return object4;
        }
        object2 = new HashSet();
        return object2;
    }
}

