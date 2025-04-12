/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 */
package com.google.firebase.dynamiclinks;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.dynamiclinks.DynamicLink$Builder;

public abstract class FirebaseDynamicLinks {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FirebaseDynamicLinks getInstance() {
        Class<FirebaseDynamicLinks> clazz = FirebaseDynamicLinks.class;
        synchronized (clazz) {
            FirebaseApp firebaseApp = FirebaseApp.getInstance();
            return FirebaseDynamicLinks.getInstance(firebaseApp);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FirebaseDynamicLinks getInstance(FirebaseApp object) {
        Class<FirebaseDynamicLinks> clazz = FirebaseDynamicLinks.class;
        synchronized (clazz) {
            Class<FirebaseDynamicLinks> clazz2 = FirebaseDynamicLinks.class;
            object = ((FirebaseApp)object).get(clazz2);
            return (FirebaseDynamicLinks)object;
        }
    }

    public abstract DynamicLink$Builder createDynamicLink();

    public abstract Task getDynamicLink(Intent var1);

    public abstract Task getDynamicLink(Uri var1);
}

