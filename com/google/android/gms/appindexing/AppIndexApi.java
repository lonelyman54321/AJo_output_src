/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.net.Uri
 */
package com.google.android.gms.appindexing;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi$ActionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.List;

public interface AppIndexApi {
    public AppIndexApi$ActionResult action(GoogleApiClient var1, Action var2);

    public PendingResult end(GoogleApiClient var1, Action var2);

    public PendingResult start(GoogleApiClient var1, Action var2);

    public PendingResult view(GoogleApiClient var1, Activity var2, Intent var3, String var4, Uri var5, List var6);

    public PendingResult view(GoogleApiClient var1, Activity var2, Uri var3, String var4, Uri var5, List var6);

    public PendingResult viewEnd(GoogleApiClient var1, Activity var2, Intent var3);

    public PendingResult viewEnd(GoogleApiClient var1, Activity var2, Uri var3);
}

