/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.browser.customtabs;

import android.os.Bundle;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService$Stub;

public final class PostMessageService$a
extends IPostMessageService$Stub {
    public final void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        iCustomTabsCallback.onMessageChannelReady(bundle);
    }

    public final void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String string2, Bundle bundle) {
        iCustomTabsCallback.onPostMessage(string2, bundle);
    }
}

