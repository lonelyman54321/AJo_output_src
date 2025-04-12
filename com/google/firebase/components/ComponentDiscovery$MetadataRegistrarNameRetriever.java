/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 */
package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.components.ComponentDiscovery$1;
import com.google.firebase.components.ComponentDiscovery$RegistrarNameRetriever;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class ComponentDiscovery$MetadataRegistrarNameRetriever
implements ComponentDiscovery$RegistrarNameRetriever {
    private final Class discoveryService;

    private ComponentDiscovery$MetadataRegistrarNameRetriever(Class clazz) {
        this.discoveryService = clazz;
    }

    public /* synthetic */ ComponentDiscovery$MetadataRegistrarNameRetriever(Class clazz, ComponentDiscovery$1 componentDiscovery$1) {
        this(clazz);
    }

    private Bundle getMetadata(Context object) {
        block10: {
            PackageManager packageManager;
            block9: {
                try {
                    packageManager = object.getPackageManager();
                    if (packageManager != null) break block9;
                    return null;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    return null;
                }
            }
            Class clazz = this.discoveryService;
            ComponentName componentName = new ComponentName(object, clazz);
            int n3 = 128;
            object = packageManager.getServiceInfo(componentName, n3);
            if (object != null) break block10;
            object = this.discoveryService;
            Objects.toString(object);
            return null;
        }
        return object.metaData;
    }

    public List retrieve(Context context) {
        boolean bl2;
        if ((context = this.getMetadata(context)) == null) {
            return Collections.emptyList();
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator iterator = context.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = "com.google.firebase.components.ComponentRegistrar";
            String string3 = (String)iterator.next();
            Object object = context.get(string3);
            int n3 = string2.equals(object);
            if (n3 == 0 || (n3 = string3.startsWith((String)(object = "com.google.firebase.components:"))) == 0) continue;
            n3 = 31;
            string3 = string3.substring(n3);
            arrayList.add(string3);
        }
        return arrayList;
    }
}

