/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 */
package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener;
import com.google.android.gms.common.api.internal.GoogleApiManager;

final class zabl
implements BackgroundDetector$BackgroundStateChangeListener {
    final /* synthetic */ GoogleApiManager zaa;

    public zabl(GoogleApiManager googleApiManager) {
        this.zaa = googleApiManager;
    }

    public final void onBackgroundStateChanged(boolean bl2) {
        GoogleApiManager googleApiManager = this.zaa;
        Handler handler = GoogleApiManager.zad(googleApiManager);
        googleApiManager = GoogleApiManager.zad(googleApiManager);
        Boolean bl3 = bl2;
        bl3 = googleApiManager.obtainMessage(1, bl3);
        handler.sendMessage((Message)bl3);
    }
}

