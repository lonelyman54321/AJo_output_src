/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package in.juspay.hyper.core;

import android.content.Context;

public interface FileProviderInterface {
    public String readFromFile(Context var1, String var2);

    public void renewFile(String var1, String var2, long var3);
}

