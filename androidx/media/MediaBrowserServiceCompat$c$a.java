/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Messenger
 *  android.service.media.MediaBrowserService
 *  android.service.media.MediaBrowserService$BrowserRoot
 *  android.service.media.MediaBrowserService$Result
 */
package androidx.media;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat$ConnectionRecord;
import androidx.media.MediaBrowserServiceCompat$c;

public class MediaBrowserServiceCompat$c$a
extends MediaBrowserService {
    public final /* synthetic */ MediaBrowserServiceCompat$c a;

    public MediaBrowserServiceCompat$c$a(MediaBrowserServiceCompat$c c2, Context context) {
        this.a = c2;
        this.attachBaseContext(context);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final MediaBrowserService.BrowserRoot onGetRoot(String var1_1, int var2_2, Bundle var3_3) {
        MediaSessionCompat.ensureClassLoader(var3_3 /* !! */ );
        var4_4 = var3_3 /* !! */  == null ? null : new Bundle(var3_3 /* !! */ );
        var3_3 /* !! */  = this.a;
        var5_5 = var3_3 /* !! */ .d;
        var6_6 = -1;
        if (var4_4 == null) ** GOTO lbl-1000
        var7_7 /* !! */  = null;
        var8_8 = "extra_client_version";
        var9_9 = var4_4.getInt((String)var8_8, 0);
        if (var9_9 != 0) {
            var4_4.remove((String)var8_8);
            var8_8 = var5_5.f;
            var3_3 /* !! */ .c = var7_7 /* !! */  = new Messenger((Handler)var8_8);
            var10_10 = 2;
            var7_7 /* !! */  = dk0.a(var10_10, "extra_service_version");
            var8_8 = var3_3 /* !! */ .c.getBinder();
            var11_11 /* !! */  = "extra_messenger";
            var7_7 /* !! */ .putBinder((String)var11_11 /* !! */ , (IBinder)var8_8);
            var8_8 = var3_3 /* !! */ .a;
            var8_8.add(var7_7 /* !! */ );
            var7_7 /* !! */  = "extra_calling_pid";
            var6_6 = var4_4.getInt((String)var7_7 /* !! */ , var6_6);
            var4_4.remove((String)var7_7 /* !! */ );
            var12_12 = var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var12_12 = -1;
        }
        var11_11 /* !! */  = var3_3 /* !! */ .d;
        var8_8 = new MediaBrowserServiceCompat$ConnectionRecord(var11_11 /* !! */ , var1_1, var12_12, var2_2, null);
        var5_5.getClass();
        var5_5.a();
        return null;
    }

    public final void onLoadChildren(String object, MediaBrowserService.Result result2) {
        object = this.a;
        object.getClass();
        object = ((MediaBrowserServiceCompat$c)object).d;
        MediaBrowserServiceCompat$ConnectionRecord cfr_ignored_0 = ((MediaBrowserServiceCompat)((Object)object)).c;
        ((MediaBrowserServiceCompat)((Object)object)).b();
    }
}

