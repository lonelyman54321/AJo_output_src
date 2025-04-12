/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaDescription
 *  android.media.session.MediaSession$QueueItem
 */
package android.support.v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession;

class MediaSessionCompat$QueueItem$Api21Impl {
    private MediaSessionCompat$QueueItem$Api21Impl() {
    }

    public static MediaSession.QueueItem createQueueItem(MediaDescription mediaDescription, long l2) {
        MediaSession.QueueItem queueItem = new MediaSession.QueueItem(mediaDescription, l2);
        return queueItem;
    }

    public static MediaDescription getDescription(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    public static long getQueueId(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }
}

