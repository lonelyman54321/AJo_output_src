/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.pm.ProviderInfo
 *  android.database.Cursor
 *  android.net.Uri
 */
package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import java.util.concurrent.atomic.AtomicBoolean;

public class FirebaseInitProvider
extends ContentProvider {
    static final String EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY = "com.google.firebase.firebaseinitprovider";
    private static final String TAG = "FirebaseInitProvider";
    private static AtomicBoolean currentlyInitializing;
    private static StartupTime startupTime;

    static {
        AtomicBoolean atomicBoolean;
        startupTime = StartupTime.now();
        currentlyInitializing = atomicBoolean = new AtomicBoolean(false);
    }

    private static void checkContentProviderAuthority(ProviderInfo object) {
        Preconditions.checkNotNull(object, "FirebaseInitProvider ProviderInfo cannot be null.");
        String string2 = EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY;
        object = object.authority;
        boolean bl2 = string2.equals(object);
        if (!bl2) {
            return;
        }
        object = new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        throw object;
    }

    public static StartupTime getStartupTime() {
        return startupTime;
    }

    public static boolean isCurrentlyInitializing() {
        return currentlyInitializing.get();
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        FirebaseInitProvider.checkContentProviderAuthority(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    public int delete(Uri uri, String string2, String[] stringArray) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        try {
            AtomicBoolean atomicBoolean = currentlyInitializing;
            boolean bl2 = true;
            atomicBoolean.set(bl2);
            atomicBoolean = this.getContext();
            FirebaseApp.initializeApp((Context)atomicBoolean);
            return false;
        }
        finally {
            currentlyInitializing.set(false);
        }
    }

    public Cursor query(Uri uri, String[] stringArray, String string2, String[] stringArray2, String string3) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String string2, String[] stringArray) {
        return 0;
    }
}

