/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Message
 *  android.os.Messenger
 */
package androidx.media;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import androidx.media.MediaBrowserServiceCompat$i;

public final class MediaBrowserServiceCompat$j
implements MediaBrowserServiceCompat$i {
    public final Messenger a;

    public MediaBrowserServiceCompat$j(Messenger messenger) {
        this.a = messenger;
    }

    public final void a(int n3, Bundle bundle) {
        Message message = Message.obtain();
        message.what = n3;
        message.arg1 = 2;
        message.setData(bundle);
        this.a.send(message);
    }
}

