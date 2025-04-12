/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.os.Bundle
 */
package in.juspay.hyper.core;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

public interface FragmentHooks {
    public void requestPermission(String[] var1, int var2);

    public void startActivityForResult(Intent var1, int var2, Bundle var3);

    public void startIntentSenderForResult(IntentSender var1, int var2, Intent var3, int var4, int var5, int var6, Bundle var7);
}

