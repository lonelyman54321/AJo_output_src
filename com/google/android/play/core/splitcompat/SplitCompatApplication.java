/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
package com.google.android.play.core.splitcompat;

import android.app.Application;
import android.content.Context;
import com.google.android.play.core.splitcompat.SplitCompat;

public class SplitCompatApplication
extends Application {
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        SplitCompat.install((Context)this);
    }
}

