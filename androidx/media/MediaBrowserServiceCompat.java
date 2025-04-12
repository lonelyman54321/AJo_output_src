/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.util.Log
 */
package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat$ConnectionRecord;
import androidx.media.MediaBrowserServiceCompat$a;
import androidx.media.MediaBrowserServiceCompat$c;
import androidx.media.MediaBrowserServiceCompat$d;
import androidx.media.MediaBrowserServiceCompat$e;
import androidx.media.MediaBrowserServiceCompat$f;
import androidx.media.MediaBrowserServiceCompat$h;
import androidx.media.MediaBrowserServiceCompat$k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public abstract class MediaBrowserServiceCompat
extends Service {
    public MediaBrowserServiceCompat$c a;
    public final MediaBrowserServiceCompat$h b;
    public final MediaBrowserServiceCompat$ConnectionRecord c;
    public final ArrayList d;
    public final Jp e;
    public final MediaBrowserServiceCompat$k f;

    static {
        Log.isLoggable((String)"MBServiceCompat", (int)3);
    }

    public MediaBrowserServiceCompat() {
        Object object = new MediaBrowserServiceCompat$h(this);
        this.b = object;
        this.c = object = new MediaBrowserServiceCompat$ConnectionRecord(this, "android.media.session.MediaController", -1, -1, null);
        object = new ArrayList();
        this.d = object;
        this.e = object = new Jp();
        object = new Handler();
        ((MediaBrowserServiceCompat$k)((Object)object)).a = this;
        this.f = object;
    }

    public abstract MediaBrowserServiceCompat$a a();

    public abstract void b();

    public final void c(String string2, MediaBrowserServiceCompat$ConnectionRecord object, Bundle object2) {
        if (object2 == null) {
            this.b();
        } else {
            this.b();
        }
        StringBuilder stringBuilder = new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package=");
        object = ((MediaBrowserServiceCompat$ConnectionRecord)object).a;
        string2 = BW0.b(stringBuilder, (String)object, " id=", string2);
        object2 = new IllegalStateException(string2);
        throw object2;
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
    }

    public final IBinder onBind(Intent intent) {
        return this.a.b.onBind(intent);
    }

    public final void onCreate() {
        super.onCreate();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            MediaBrowserServiceCompat$f mediaBrowserServiceCompat$f = new MediaBrowserServiceCompat$e(this);
            this.a = mediaBrowserServiceCompat$f;
        } else {
            n4 = 26;
            if (n3 >= n4) {
                MediaBrowserServiceCompat$e mediaBrowserServiceCompat$e = new MediaBrowserServiceCompat$e(this);
                this.a = mediaBrowserServiceCompat$e;
            } else {
                n4 = 23;
                if (n3 >= n4) {
                    MediaBrowserServiceCompat$d mediaBrowserServiceCompat$d = new MediaBrowserServiceCompat$d(this);
                    this.a = mediaBrowserServiceCompat$d;
                } else {
                    MediaBrowserServiceCompat$c mediaBrowserServiceCompat$c;
                    this.a = mediaBrowserServiceCompat$c = new MediaBrowserServiceCompat$c(this);
                }
            }
        }
        this.a.onCreate();
    }

    public final void onDestroy() {
        this.f.a = null;
    }
}

