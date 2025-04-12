/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.IInterface
 */
package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;

public interface ICustomTabsCallback
extends IInterface {
    public static final String DESCRIPTOR = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    public void extraCallback(String var1, Bundle var2);

    public Bundle extraCallbackWithResult(String var1, Bundle var2);

    public void onActivityLayout(int var1, int var2, int var3, int var4, int var5, Bundle var6);

    public void onActivityResized(int var1, int var2, Bundle var3);

    public void onMessageChannelReady(Bundle var1);

    public void onMinimized(Bundle var1);

    public void onNavigationEvent(int var1, Bundle var2);

    public void onPostMessage(String var1, Bundle var2);

    public void onRelationshipValidationResult(int var1, Uri var2, boolean var3, Bundle var4);

    public void onUnminimized(Bundle var1);

    public void onWarmupCompleted(Bundle var1);
}

