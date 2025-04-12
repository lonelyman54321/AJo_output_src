/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 */
package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.support.customtabs.ICustomTabsCallback;
import java.util.List;

public interface ICustomTabsService
extends IInterface {
    public static final String DESCRIPTOR = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    public Bundle extraCommand(String var1, Bundle var2);

    public boolean isEngagementSignalsApiAvailable(ICustomTabsCallback var1, Bundle var2);

    public boolean mayLaunchUrl(ICustomTabsCallback var1, Uri var2, Bundle var3, List var4);

    public boolean newSession(ICustomTabsCallback var1);

    public boolean newSessionWithExtras(ICustomTabsCallback var1, Bundle var2);

    public int postMessage(ICustomTabsCallback var1, String var2, Bundle var3);

    public boolean receiveFile(ICustomTabsCallback var1, Uri var2, int var3, Bundle var4);

    public boolean requestPostMessageChannel(ICustomTabsCallback var1, Uri var2);

    public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback var1, Uri var2, Bundle var3);

    public boolean setEngagementSignalsCallback(ICustomTabsCallback var1, IBinder var2, Bundle var3);

    public boolean updateVisuals(ICustomTabsCallback var1, Bundle var2);

    public boolean validateRelationship(ICustomTabsCallback var1, int var2, Uri var3, Bundle var4);

    public boolean warmup(long var1);
}

