/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.perf.util;

import android.os.Bundle;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Optional;

public final class ImmutableBundle {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final Bundle bundle;

    public ImmutableBundle() {
        Bundle bundle = new Bundle();
        this(bundle);
    }

    public ImmutableBundle(Bundle bundle) {
        this.bundle = bundle = (Bundle)bundle.clone();
    }

    private Optional getInt(String string2) {
        Object object;
        boolean bl2 = this.containsKey(string2);
        if (!bl2) {
            return Optional.absent();
        }
        try {
            object = this.bundle;
        }
        catch (ClassCastException classCastException) {
            AndroidLogger androidLogger = logger;
            String string3 = classCastException.getMessage();
            Object[] objectArray = new Object[]{string2, string3};
            androidLogger.debug("Metadata key %s contains type other than int: %s", objectArray);
            return Optional.absent();
        }
        object = object.get(string2);
        object = (Integer)object;
        return Optional.fromNullable(object);
    }

    public boolean containsKey(String string2) {
        Bundle bundle;
        boolean bl2;
        if (string2 != null && (bl2 = (bundle = this.bundle).containsKey(string2))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public Optional getBoolean(String string2) {
        Object object;
        boolean bl2 = this.containsKey(string2);
        if (!bl2) {
            return Optional.absent();
        }
        try {
            object = this.bundle;
        }
        catch (ClassCastException classCastException) {
            AndroidLogger androidLogger = logger;
            String string3 = classCastException.getMessage();
            Object[] objectArray = new Object[]{string2, string3};
            androidLogger.debug("Metadata key %s contains type other than boolean: %s", objectArray);
            return Optional.absent();
        }
        object = object.get(string2);
        object = (Boolean)object;
        return Optional.fromNullable(object);
    }

    public Optional getDouble(String string2) {
        boolean bl2 = this.containsKey(string2);
        if (!bl2) {
            return Optional.absent();
        }
        Object object = this.bundle.get(string2);
        if (object == null) {
            return Optional.absent();
        }
        boolean bl3 = object instanceof Float;
        if (bl3) {
            return Optional.of(((Float)object).doubleValue());
        }
        bl3 = object instanceof Double;
        if (bl3) {
            return Optional.of((Double)object);
        }
        object = logger;
        Object[] objectArray = new Object[]{string2};
        ((AndroidLogger)object).debug("Metadata key %s contains type other than double: %s", objectArray);
        return Optional.absent();
    }

    public Optional getLong(String object) {
        boolean bl2 = ((Optional)(object = this.getInt((String)object))).isAvailable();
        if (bl2) {
            return Optional.of((Integer)((Optional)object).get());
        }
        return Optional.absent();
    }
}

