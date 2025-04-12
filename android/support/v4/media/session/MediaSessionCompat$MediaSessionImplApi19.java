/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.media.RemoteControlClient$MetadataEditor
 *  android.media.RemoteControlClient$OnMetadataUpdateListener
 *  android.os.Bundle
 *  android.os.Handler
 */
package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.media.RemoteControlClient;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.MediaSessionCompat$Callback;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi18;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi19$1;
import android.support.v4.media.session.PlaybackStateCompat;

class MediaSessionCompat$MediaSessionImplApi19
extends MediaSessionCompat$MediaSessionImplApi18 {
    public MediaSessionCompat$MediaSessionImplApi19(Context context, String string2, ComponentName componentName, PendingIntent pendingIntent, qB3 qB32, Bundle bundle) {
        super(context, string2, componentName, pendingIntent, qB32, bundle);
    }

    public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle) {
        RemoteControlClient.MetadataEditor metadataEditor = super.buildRccMetadata(bundle);
        PlaybackStateCompat playbackStateCompat = this.mState;
        long l2 = 0L;
        long l3 = playbackStateCompat == null ? l2 : playbackStateCompat.getActions();
        long l4 = 128L;
        int n3 = 0x10000001;
        long l7 = (l3 &= l4) - l2;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false) {
            metadataEditor.addEditableKey(n3);
        }
        if (bundle == null) {
            return metadataEditor;
        }
        String string2 = "android.media.metadata.YEAR";
        int n4 = bundle.containsKey(string2);
        if (n4 != 0) {
            n4 = 8;
            l3 = bundle.getLong(string2);
            metadataEditor.putLong(n4, l3);
        }
        if ((n4 = (int)(bundle.containsKey(string2 = "android.media.metadata.RATING") ? 1 : 0)) != 0) {
            n4 = 101;
            string2 = bundle.getParcelable(string2);
            metadataEditor.putObject(n4, (Object)string2);
        }
        if ((n4 = (int)(bundle.containsKey(string2 = "android.media.metadata.USER_RATING") ? 1 : 0)) != 0) {
            bundle = bundle.getParcelable(string2);
            metadataEditor.putObject(n3, (Object)bundle);
        }
        return metadataEditor;
    }

    public int getRccTransportControlFlagsFromActions(long l2) {
        int n3 = super.getRccTransportControlFlagsFromActions(l2);
        long l3 = 0L;
        long l4 = (l2 &= 0x80L) - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            n3 |= 0x200;
        }
        return n3;
    }

    public void setCallback(MediaSessionCompat$Callback object, Handler handler) {
        super.setCallback((MediaSessionCompat$Callback)object, handler);
        if (object == null) {
            object = this.mRcc;
            handler = null;
            object.setMetadataUpdateListener(null);
        } else {
            object = new MediaSessionCompat$MediaSessionImplApi19$1(this);
            handler = this.mRcc;
            handler.setMetadataUpdateListener((RemoteControlClient.OnMetadataUpdateListener)object);
        }
    }
}

