/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.RemoteException
 */
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;

public final class cg0$a
extends Uf0 {
    public final /* synthetic */ cg0 a;

    public cg0$a(cg0 cg02) {
        this.a = cg02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void extraCallback(String string2, Bundle bundle) {
        Object object;
        try {
            object = this.a;
        }
        catch (RemoteException remoteException) {
            return;
        }
        object = ((cg0)object).a;
        object.extraCallback(string2, bundle);
    }

    public final Bundle extraCallbackWithResult(String string2, Bundle bundle) {
        Object object;
        try {
            object = this.a;
        }
        catch (RemoteException remoteException) {
            return null;
        }
        object = ((cg0)object).a;
        return object.extraCallbackWithResult(string2, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onActivityLayout(int n3, int n4, int n7, int n8, int n10, Bundle bundle) {
        cg0 cg02;
        try {
            cg02 = this.a;
        }
        catch (RemoteException remoteException) {
            return;
        }
        ICustomTabsCallback iCustomTabsCallback = cg02.a;
        iCustomTabsCallback.onActivityLayout(n3, n4, n7, n8, n10, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onActivityResized(int n3, int n4, Bundle bundle) {
        Object object;
        try {
            object = this.a;
        }
        catch (RemoteException remoteException) {
            return;
        }
        object = ((cg0)object).a;
        object.onActivityResized(n3, n4, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onMessageChannelReady(Bundle bundle) {
        Object object;
        try {
            object = this.a;
        }
        catch (RemoteException remoteException) {
            return;
        }
        object = ((cg0)object).a;
        object.onMessageChannelReady(bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onMinimized(Bundle bundle) {
        Object object;
        try {
            object = this.a;
        }
        catch (RemoteException remoteException) {
            return;
        }
        object = ((cg0)object).a;
        object.onMinimized(bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onNavigationEvent(int n3, Bundle bundle) {
        Object object;
        try {
            object = this.a;
        }
        catch (RemoteException remoteException) {
            return;
        }
        object = ((cg0)object).a;
        object.onNavigationEvent(n3, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onPostMessage(String string2, Bundle bundle) {
        Object object;
        try {
            object = this.a;
        }
        catch (RemoteException remoteException) {
            return;
        }
        object = ((cg0)object).a;
        object.onPostMessage(string2, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onRelationshipValidationResult(int n3, Uri uri, boolean bl2, Bundle bundle) {
        Object object;
        try {
            object = this.a;
        }
        catch (RemoteException remoteException) {
            return;
        }
        object = ((cg0)object).a;
        object.onRelationshipValidationResult(n3, uri, bl2, bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onUnminimized(Bundle bundle) {
        Object object;
        try {
            object = this.a;
        }
        catch (RemoteException remoteException) {
            return;
        }
        object = ((cg0)object).a;
        object.onUnminimized(bundle);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onWarmupCompleted(Bundle bundle) {
        Object object;
        try {
            object = this.a;
        }
        catch (RemoteException remoteException) {
            return;
        }
        object = ((cg0)object).a;
        object.onWarmupCompleted(bundle);
    }
}

