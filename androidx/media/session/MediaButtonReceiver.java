/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  android.os.Build$VERSION
 */
package androidx.media.session;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.session.MediaButtonReceiver$a;
import androidx.media.session.MediaButtonReceiver$b;
import java.util.Objects;

public class MediaButtonReceiver
extends BroadcastReceiver {
    public static final /* synthetic */ int a;

    public static ComponentName a(Context object, String charSequence) {
        Object object2 = object.getPackageManager();
        Intent intent = new Intent((String)charSequence);
        object = object.getPackageName();
        intent.setPackage((String)object);
        boolean bl2 = false;
        object = null;
        object2 = object2.queryIntentServices(intent, 0);
        int n3 = object2.size();
        int n4 = 1;
        if (n3 == n4) {
            object = (ResolveInfo)object2.get(0);
            object = object.serviceInfo;
            object2 = object.packageName;
            object = object.name;
            charSequence = new ComponentName((String)object2, (String)object);
            return charSequence;
        }
        bl2 = object2.isEmpty();
        if (bl2) {
            return null;
        }
        charSequence = Gn.a("Expected 1 service that handles ", (String)charSequence, ", found ");
        int n7 = object2.size();
        ((StringBuilder)charSequence).append(n7);
        charSequence = ((StringBuilder)charSequence).toString();
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public final void onReceive(Context object, Intent object2) {
        String string2;
        String string3;
        int n3;
        if (object2 != null && (n3 = (string3 = "android.intent.action.MEDIA_BUTTON").equals(string2 = object2.getAction())) != 0 && (n3 = object2.hasExtra(string2 = "android.intent.extra.KEY_EVENT")) != 0) {
            string2 = MediaButtonReceiver.a(object, string3);
            if (string2 != null) {
                IllegalStateException illegalStateException2;
                block5: {
                    object2.setComponent((ComponentName)string2);
                    try {
                        t70.startForegroundService(object, (Intent)object2);
                    }
                    catch (IllegalStateException illegalStateException2) {
                        int n4 = Build.VERSION.SDK_INT;
                        n3 = 31;
                        if (n4 < n3 || (n4 = (int)(MediaButtonReceiver$a.b(illegalStateException2) ? 1 : 0)) == 0) break block5;
                        ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException = MediaButtonReceiver$a.a(illegalStateException2);
                        BL1.a(foregroundServiceStartNotAllowedException);
                    }
                    return;
                }
                throw illegalStateException2;
            }
            string2 = MediaButtonReceiver.a(object, "android.media.browse.MediaBrowserService");
            if (string2 != null) {
                string3 = this.goAsync();
                object = object.getApplicationContext();
                MediaButtonReceiver$b mediaButtonReceiver$b = new MediaButtonReceiver$b((BroadcastReceiver.PendingResult)string3, (Context)object, (Intent)object2);
                object2 = new MediaBrowserCompat((Context)object, (ComponentName)string2, mediaButtonReceiver$b, null);
                mediaButtonReceiver$b.d = object2;
                ((MediaBrowserCompat)object2).connect();
                return;
            }
            object = new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            throw object;
        }
        Objects.toString(object2);
    }
}

