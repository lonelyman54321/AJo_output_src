/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.os.RemoteException
 */
import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import androidx.browser.customtabs.CustomTabsClient$2;

public final class bg0 {
    public final Object a;
    public final ICustomTabsService b;
    public final ICustomTabsCallback c;
    public final ComponentName d;
    public final PendingIntent e;

    public bg0(ICustomTabsService iCustomTabsService, CustomTabsClient$2 customTabsClient$2, ComponentName componentName) {
        Object object;
        this.a = object = new Object();
        this.b = iCustomTabsService;
        this.c = customTabsClient$2;
        this.d = componentName;
        this.e = null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string2) {
        Object object;
        Bundle bundle = new Bundle();
        Object object2 = this.e;
        if (object2 != null) {
            object = "android.support.customtabs.extra.SESSION_ID";
            bundle.putParcelable((String)object, (Parcelable)object2);
        }
        object2 = this.a;
        synchronized (object2) {
            Throwable throwable22222;
            object = this.b;
            ICustomTabsCallback iCustomTabsCallback = this.c;
            object.postMessage(iCustomTabsCallback, string2, bundle);
            return;
            {
                catch (Throwable throwable22222) {
                }
                catch (RemoteException remoteException) {}
                return;
            }
            throw throwable22222;
        }
    }
}

