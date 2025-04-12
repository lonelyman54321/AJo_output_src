/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Map;

public class AbtComponent {
    private final Map abtOriginInstances;
    private final Provider analyticsConnector;
    private final Context appContext;

    public AbtComponent(Context context, Provider provider) {
        HashMap hashMap;
        this.abtOriginInstances = hashMap = new HashMap();
        this.appContext = context;
        this.analyticsConnector = provider;
    }

    public FirebaseABTesting createAbtInstance(String string2) {
        Context context = this.appContext;
        Provider provider = this.analyticsConnector;
        FirebaseABTesting firebaseABTesting = new FirebaseABTesting(context, provider, string2);
        return firebaseABTesting;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public FirebaseABTesting get(String object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Map map2;
                block4: {
                    try {
                        map2 = this.abtOriginInstances;
                        boolean bl2 = map2.containsKey(object);
                        if (bl2) break block4;
                        map2 = this.abtOriginInstances;
                        FirebaseABTesting firebaseABTesting = this.createAbtInstance((String)object);
                        map2.put(object, firebaseABTesting);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                map2 = this.abtOriginInstances;
                object = map2.get(object);
                return (FirebaseABTesting)object;
            }
            throw throwable2;
        }
    }
}

