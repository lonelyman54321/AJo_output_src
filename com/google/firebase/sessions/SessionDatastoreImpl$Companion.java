/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.SessionDatastoreImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;

final class SessionDatastoreImpl$Companion {
    static final /* synthetic */ gn1_2[] $$delegatedProperties;

    static {
        jn1_2 jn1_22 = new PropertyReference2Impl(SessionDatastoreImpl$Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        jn1_22 = Reflection.property2(jn1_22);
        gn1_2[] gn1_2Array = new gn1_2[]{jn1_22};
        $$delegatedProperties = gn1_2Array;
    }

    private SessionDatastoreImpl$Companion() {
    }

    public /* synthetic */ SessionDatastoreImpl$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ ui0 access$getDataStore(SessionDatastoreImpl$Companion sessionDatastoreImpl$Companion, Context context) {
        return sessionDatastoreImpl$Companion.getDataStore(context);
    }

    private final ui0 getDataStore(Context context) {
        be2_2 be2_22 = SessionDatastoreImpl.access$getDataStore$delegate$cp();
        gn1_2 gn1_22 = $$delegatedProperties[0];
        return (ui0)be2_22.b(gn1_22, context);
    }
}

