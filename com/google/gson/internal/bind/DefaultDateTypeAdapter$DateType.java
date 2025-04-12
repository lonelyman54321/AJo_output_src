/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType$1;
import com.google.gson.internal.bind.TypeAdapters;
import java.util.Date;

public abstract class DefaultDateTypeAdapter$DateType {
    public static final DefaultDateTypeAdapter$DateType DATE;
    private final Class dateClass;

    static {
        DefaultDateTypeAdapter$DateType$1 defaultDateTypeAdapter$DateType$1 = new DefaultDateTypeAdapter$DateType$1(Date.class);
        DATE = defaultDateTypeAdapter$DateType$1;
    }

    public DefaultDateTypeAdapter$DateType(Class clazz) {
        this.dateClass = clazz;
    }

    private TypeAdapterFactory createFactory(DefaultDateTypeAdapter defaultDateTypeAdapter) {
        return TypeAdapters.newFactory(this.dateClass, (TypeAdapter)defaultDateTypeAdapter);
    }

    public final TypeAdapterFactory createAdapterFactory(int n3) {
        DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, n3, null);
        return this.createFactory(defaultDateTypeAdapter);
    }

    public final TypeAdapterFactory createAdapterFactory(int n3, int n4) {
        DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, n3, n4, null);
        return this.createFactory(defaultDateTypeAdapter);
    }

    public final TypeAdapterFactory createAdapterFactory(String string2) {
        DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, string2, null);
        return this.createFactory(defaultDateTypeAdapter);
    }

    public final TypeAdapterFactory createDefaultsAdapterFactory() {
        int n3 = 2;
        DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, n3, n3, null);
        return this.createFactory(defaultDateTypeAdapter);
    }

    public abstract Date deserialize(Date var1);
}

