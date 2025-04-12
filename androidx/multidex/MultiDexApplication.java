/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
package androidx.multidex;

import android.app.Application;
import android.content.Context;

public class MultiDexApplication
extends Application {
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        JQ1.d((Context)this);
    }
}

