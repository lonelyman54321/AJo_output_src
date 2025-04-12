/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.CreationContext;
import com.google.android.datatransport.runtime.backends.CreationContextFactory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry$BackendFactoryProvider;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import java.util.HashMap;
import java.util.Map;

class MetadataBackendRegistry
implements BackendRegistry {
    private static final String BACKEND_KEY_PREFIX = "backend:";
    private static final String TAG = "BackendRegistry";
    private final MetadataBackendRegistry$BackendFactoryProvider backendFactoryProvider;
    private final Map backends;
    private final CreationContextFactory creationContextFactory;

    public MetadataBackendRegistry(Context context, CreationContextFactory creationContextFactory) {
        MetadataBackendRegistry$BackendFactoryProvider metadataBackendRegistry$BackendFactoryProvider = new MetadataBackendRegistry$BackendFactoryProvider(context);
        this(metadataBackendRegistry$BackendFactoryProvider, creationContextFactory);
    }

    public MetadataBackendRegistry(MetadataBackendRegistry$BackendFactoryProvider metadataBackendRegistry$BackendFactoryProvider, CreationContextFactory creationContextFactory) {
        HashMap hashMap;
        this.backends = hashMap = new HashMap();
        this.backendFactoryProvider = metadataBackendRegistry$BackendFactoryProvider;
        this.creationContextFactory = creationContextFactory;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public TransportBackend get(String object) {
        synchronized (this) {
            Throwable throwable2;
            Object object2;
            block6: {
                block5: {
                    try {
                        object2 = this.backends;
                        boolean bl2 = object2.containsKey(object);
                        if (!bl2) break block5;
                        object2 = this.backends;
                        object = object2.get(object);
                        return (TransportBackend)object;
                    }
                    catch (Throwable throwable2) {}
                }
                object2 = this.backendFactoryProvider;
                object2 = ((MetadataBackendRegistry$BackendFactoryProvider)object2).get((String)object);
                if (object2 != null) break block6;
                return null;
            }
            Object object3 = this.creationContextFactory;
            object3 = ((CreationContextFactory)object3).create((String)object);
            object2 = object2.create((CreationContext)object3);
            object3 = this.backends;
            object3.put(object, object2);
            return object2;
            throw throwable2;
        }
    }
}

