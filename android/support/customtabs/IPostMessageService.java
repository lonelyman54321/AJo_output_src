/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IInterface
 */
package android.support.customtabs;

import android.os.Bundle;
import android.os.IInterface;
import android.support.customtabs.ICustomTabsCallback;

public interface IPostMessageService
extends IInterface {
    public static final String DESCRIPTOR = "android$support$customtabs$IPostMessageService".replace('$', '.');

    public void onMessageChannelReady(ICustomTabsCallback var1, Bundle var2);

    public void onPostMessage(ICustomTabsCallback var1, String var2, Bundle var3);
}

