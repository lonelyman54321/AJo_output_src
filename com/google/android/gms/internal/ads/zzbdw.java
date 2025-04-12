/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Environment
 */
package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

public final class zzbdw
implements Callable {
    public final Object call() {
        String string2 = Environment.getExternalStorageState();
        return "mounted".equals(string2);
    }
}

