/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package in.juspay.hypersdk.data;

import android.os.Bundle;

public interface JuspayResponseHandler
extends Runnable {
    public void onError(String var1);

    public void onResponse(Bundle var1);

    public void onResponse(String var1);
}

