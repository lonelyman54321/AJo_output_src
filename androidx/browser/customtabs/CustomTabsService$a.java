/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IBinder$DeathRecipient
 *  android.os.RemoteException
 */
package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService$Stub;
import android.support.customtabs.IEngagementSignalsCallback$Stub;
import androidx.browser.customtabs.CustomTabsService;
import java.util.List;

public final class CustomTabsService$a
extends ICustomTabsService$Stub {
    public final /* synthetic */ CustomTabsService a;

    public CustomTabsService$a(CustomTabsService customTabsService) {
        this.a = customTabsService;
    }

    public static PendingIntent e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string2 = "android.support.customtabs.extra.SESSION_ID";
        PendingIntent pendingIntent = (PendingIntent)bundle.getParcelable(string2);
        bundle.remove(string2);
        return pendingIntent;
    }

    public final Bundle extraCommand(String string2, Bundle bundle) {
        return this.a.a();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean f(ICustomTabsCallback object, PendingIntent pendingIntent) {
        Zf0 zf0;
        Object object2 = new cg0((ICustomTabsCallback)object, pendingIntent);
        pendingIntent = null;
        try {
            zf0 = new Zf0(this, (cg0)object2);
            object2 = this.a;
            object2 = ((CustomTabsService)((Object)object2)).a;
            synchronized (object2) {
            }
        }
        catch (RemoteException remoteException) {
            return false;
        }
        {
            Object object3 = object.asBinder();
            object3.linkToDeath((IBinder.DeathRecipient)zf0, 0);
            object3 = this.a;
            object3 = ((CustomTabsService)((Object)object3)).a;
            object = object.asBinder();
            ((a53)object3).put(object, zf0);
        }
        {
            object = this.a;
            return ((CustomTabsService)((Object)object)).c();
        }
    }

    public final boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        bundle = CustomTabsService$a.e(bundle);
        cg0 cg02 = new cg0(iCustomTabsCallback, (PendingIntent)bundle);
        ((Object)((Object)this.a)).getClass();
        return false;
    }

    public final boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri object, Bundle bundle, List list) {
        bundle = CustomTabsService$a.e(bundle);
        object = new cg0(iCustomTabsCallback, (PendingIntent)bundle);
        return this.a.b();
    }

    public final boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
        return this.f(iCustomTabsCallback, null);
    }

    public final boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        bundle = CustomTabsService$a.e(bundle);
        return this.f(iCustomTabsCallback, (PendingIntent)bundle);
    }

    public final int postMessage(ICustomTabsCallback iCustomTabsCallback, String object, Bundle bundle) {
        bundle = CustomTabsService$a.e(bundle);
        object = new cg0(iCustomTabsCallback, (PendingIntent)bundle);
        return this.a.d();
    }

    public final boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri object, int n3, Bundle bundle) {
        PendingIntent pendingIntent = CustomTabsService$a.e(bundle);
        object = new cg0(iCustomTabsCallback, pendingIntent);
        return this.a.e();
    }

    public final boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
        new cg0(iCustomTabsCallback, null);
        new Bundle();
        return this.a.f();
    }

    public final boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri object, Bundle bundle) {
        Object object2 = CustomTabsService$a.e(bundle);
        object = new cg0(iCustomTabsCallback, (PendingIntent)object2);
        if (bundle != null) {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            object2 = "target_origin";
            iCustomTabsCallback = n3 >= n4 ? (Uri)em.a(bundle, (String)object2, Uri.class) : (Uri)bundle.getParcelable((String)object2);
        }
        return this.a.f();
    }

    public final boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder object, Bundle bundle) {
        IEngagementSignalsCallback$Stub.asInterface(object);
        bundle = CustomTabsService$a.e(bundle);
        object = new cg0(iCustomTabsCallback, (PendingIntent)bundle);
        ((Object)((Object)this.a)).getClass();
        return false;
    }

    public final boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        bundle = CustomTabsService$a.e(bundle);
        cg0 cg02 = new cg0(iCustomTabsCallback, (PendingIntent)bundle);
        return this.a.g();
    }

    public final boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int n3, Uri uri, Bundle bundle) {
        uri = CustomTabsService$a.e(bundle);
        cg0 cg02 = new cg0(iCustomTabsCallback, (PendingIntent)uri);
        return this.a.h();
    }

    public final boolean warmup(long l2) {
        return this.a.i();
    }
}

