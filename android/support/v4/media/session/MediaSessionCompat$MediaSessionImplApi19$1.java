/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.Rating
 *  android.media.RemoteControlClient$OnMetadataUpdateListener
 */
package android.support.v4.media.session;

import android.media.Rating;
import android.media.RemoteControlClient;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi19;

class MediaSessionCompat$MediaSessionImplApi19$1
implements RemoteControlClient.OnMetadataUpdateListener {
    final /* synthetic */ MediaSessionCompat$MediaSessionImplApi19 this$0;

    public MediaSessionCompat$MediaSessionImplApi19$1(MediaSessionCompat$MediaSessionImplApi19 mediaSessionImplApi19) {
        this.this$0 = mediaSessionImplApi19;
    }

    public void onMetadataUpdate(int n3, Object object) {
        int n4 = 0x10000001;
        if (n3 == n4 && (n3 = object instanceof Rating) != 0) {
            MediaSessionCompat$MediaSessionImplApi19 mediaSessionCompat$MediaSessionImplApi19 = this.this$0;
            RatingCompat ratingCompat = RatingCompat.fromRating(object);
            int n7 = 19;
            int n8 = -1;
            int n10 = -1;
            mediaSessionCompat$MediaSessionImplApi19.postToHandler(n7, n8, n10, ratingCompat, null);
        }
    }
}

