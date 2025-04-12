/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.gms.fido.u2f;

import android.app.Activity;

public interface U2fPendingIntent {
    public boolean hasPendingIntent();

    public void launchPendingIntent(Activity var1, int var2);
}

