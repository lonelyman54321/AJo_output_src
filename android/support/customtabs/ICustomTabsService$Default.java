/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.IBinder
 */
package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import java.util.List;

public class ICustomTabsService$Default
implements ICustomTabsService {
    public IBinder asBinder() {
        return null;
    }

    public Bundle extraCommand(String string2, Bundle bundle) {
        return null;
    }

    public boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        return false;
    }

    public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List list) {
        return false;
    }

    public boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
        return false;
    }

    public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        return false;
    }

    public int postMessage(ICustomTabsCallback iCustomTabsCallback, String string2, Bundle bundle) {
        return 0;
    }

    public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int n3, Bundle bundle) {
        return false;
    }

    public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
        return false;
    }

    public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
        return false;
    }

    public boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
        return false;
    }

    public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        return false;
    }

    public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int n3, Uri uri, Bundle bundle) {
        return false;
    }

    public boolean warmup(long l2) {
        return false;
    }
}

