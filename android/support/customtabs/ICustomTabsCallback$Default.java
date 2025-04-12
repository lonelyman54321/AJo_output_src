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

public class ICustomTabsCallback$Default
implements ICustomTabsCallback {
    public IBinder asBinder() {
        return null;
    }

    public void extraCallback(String string2, Bundle bundle) {
    }

    public Bundle extraCallbackWithResult(String string2, Bundle bundle) {
        return null;
    }

    public void onActivityLayout(int n3, int n4, int n7, int n8, int n10, Bundle bundle) {
    }

    public void onActivityResized(int n3, int n4, Bundle bundle) {
    }

    public void onMessageChannelReady(Bundle bundle) {
    }

    public void onMinimized(Bundle bundle) {
    }

    public void onNavigationEvent(int n3, Bundle bundle) {
    }

    public void onPostMessage(String string2, Bundle bundle) {
    }

    public void onRelationshipValidationResult(int n3, Uri uri, boolean bl2, Bundle bundle) {
    }

    public void onUnminimized(Bundle bundle) {
    }

    public void onWarmupCompleted(Bundle bundle) {
    }
}

