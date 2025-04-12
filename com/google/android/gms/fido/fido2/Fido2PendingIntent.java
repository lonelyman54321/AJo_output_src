/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.gms.fido.fido2;

import android.app.Activity;

public interface Fido2PendingIntent {
    public boolean hasPendingIntent();

    public void launchPendingIntent(Activity var1, int var2);
}

