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
package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.BackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class MetadataBackendRegistry$BackendFactoryProvider {
    private final Context applicationContext;
    private Map backendProviders = null;

    public MetadataBackendRegistry$BackendFactoryProvider(Context context) {
        this.applicationContext = context;
    }

    private Map discover(Context context) {
        boolean bl2;
        if ((context = MetadataBackendRegistry$BackendFactoryProvider.getMetadata(context)) == null) {
            return Collections.emptyMap();
        }
        HashMap<String, String> hashMap = new HashMap<String, String>();
        Iterator iterator = context.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2;
            String string3 = (String)iterator.next();
            String[] stringArray = context.get(string3);
            int n3 = stringArray instanceof String;
            if (n3 == 0 || (n3 = string3.startsWith(string2 = "backend:")) == 0) continue;
            stringArray = (String)stringArray;
            string2 = ",";
            stringArray = stringArray.split(string2, -1);
            n3 = stringArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                String string4 = stringArray[i3].trim();
                int n4 = string4.isEmpty();
                if (n4 != 0) continue;
                n4 = 8;
                String string5 = string3.substring(n4);
                hashMap.put(string4, string5);
            }
        }
        return hashMap;
    }

    private Map getBackendProviders() {
        Map map2 = this.backendProviders;
        if (map2 == null) {
            map2 = this.applicationContext;
            this.backendProviders = map2 = this.discover((Context)map2);
        }
        return this.backendProviders;
    }

    private static Bundle getMetadata(Context context) {
        block7: {
            Class<TransportBackendDiscovery> clazz;
            PackageManager packageManager;
            try {
                packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                clazz = TransportBackendDiscovery.class;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return null;
            }
            ComponentName componentName = new ComponentName(context, clazz);
            int n3 = 128;
            context = packageManager.getServiceInfo(componentName, n3);
            if (context != null) break block7;
            return null;
        }
        return context.metaData;
    }

    public BackendFactory get(String string2) {
        CharSequence charSequence = ".";
        String string3 = "Could not instantiate ";
        string2 = (String)this.getBackendProviders().get(string2);
        if (string2 == null) {
            return null;
        }
        Object object = Class.forName(string2);
        Class<BackendFactory> clazz = BackendFactory.class;
        object = ((Class)object).asSubclass(clazz);
        object = ((Class)object).getDeclaredConstructor(null);
        object = ((Constructor)object).newInstance(null);
        try {
            return (BackendFactory)object;
        }
        catch (InvocationTargetException invocationTargetException) {
            string3.concat(string2);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            string3.concat(string2);
        }
        catch (InstantiationException instantiationException) {
            object = new StringBuilder(string3);
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append((String)charSequence);
        }
        catch (IllegalAccessException illegalAccessException) {
            object = new StringBuilder(string3);
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append((String)charSequence);
        }
        catch (ClassNotFoundException classNotFoundException) {
            string3 = "Class ";
            charSequence = new StringBuilder(string3);
            ((StringBuilder)charSequence).append(string2);
            string2 = " is not found.";
            ((StringBuilder)charSequence).append(string2);
        }
        return null;
    }
}

