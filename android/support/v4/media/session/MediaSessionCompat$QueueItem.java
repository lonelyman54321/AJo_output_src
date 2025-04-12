/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaDescription
 *  android.media.session.MediaSession$QueueItem
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package android.support.v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem$1;
import android.support.v4.media.session.MediaSessionCompat$QueueItem$Api21Impl;
import java.util.ArrayList;
import java.util.List;

public final class MediaSessionCompat$QueueItem
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int UNKNOWN_ID = 255;
    private final MediaDescriptionCompat mDescription;
    private final long mId;
    private MediaSession.QueueItem mItemFwk;

    static {
        MediaSessionCompat$QueueItem$1 mediaSessionCompat$QueueItem$1 = new MediaSessionCompat$QueueItem$1();
        CREATOR = mediaSessionCompat$QueueItem$1;
    }

    private MediaSessionCompat$QueueItem(MediaSession.QueueItem object, MediaDescriptionCompat mediaDescriptionCompat, long l2) {
        if (mediaDescriptionCompat != null) {
            long l3 = -1;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 != false) {
                this.mDescription = mediaDescriptionCompat;
                this.mId = l2;
                this.mItemFwk = object;
                return;
            }
            super("Id cannot be QueueItem.UNKNOWN_ID");
            throw object;
        }
        super("Description cannot be null");
        throw object;
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        long l2;
        MediaDescriptionCompat mediaDescriptionCompat;
        this.mDescription = mediaDescriptionCompat = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.mId = l2 = parcel.readLong();
    }

    public MediaSessionCompat$QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long l2) {
        this(null, mediaDescriptionCompat, l2);
    }

    public static MediaSessionCompat$QueueItem fromQueueItem(Object object) {
        if (object != null) {
            object = (MediaSession.QueueItem)object;
            MediaDescriptionCompat mediaDescriptionCompat = MediaDescriptionCompat.fromMediaDescription(MediaSessionCompat$QueueItem$Api21Impl.getDescription((MediaSession.QueueItem)object));
            long l2 = MediaSessionCompat$QueueItem$Api21Impl.getQueueId((MediaSession.QueueItem)object);
            MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem((MediaSession.QueueItem)object, mediaDescriptionCompat, l2);
            return mediaSessionCompat$QueueItem;
        }
        return null;
    }

    public static List fromQueueItemList(List object) {
        if (object != null) {
            int n3 = object.size();
            ArrayList<MediaSessionCompat$QueueItem> arrayList = new ArrayList<MediaSessionCompat$QueueItem>(n3);
            object = object.iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem.fromQueueItem(object.next());
                arrayList.add(mediaSessionCompat$QueueItem);
            }
            return arrayList;
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public MediaDescriptionCompat getDescription() {
        return this.mDescription;
    }

    public long getQueueId() {
        return this.mId;
    }

    public Object getQueueItem() {
        MediaSession.QueueItem queueItem = this.mItemFwk;
        if (queueItem == null) {
            queueItem = (MediaDescription)this.mDescription.getMediaDescription();
            long l2 = this.mId;
            this.mItemFwk = queueItem = MediaSessionCompat$QueueItem$Api21Impl.createQueueItem((MediaDescription)queueItem, l2);
        }
        return queueItem;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MediaSession.QueueItem {Description=");
        MediaDescriptionCompat mediaDescriptionCompat = this.mDescription;
        stringBuilder.append(mediaDescriptionCompat);
        stringBuilder.append(", Id=");
        long l2 = this.mId;
        return jl0_0.b(stringBuilder, l2, " }");
    }

    public void writeToParcel(Parcel parcel, int n3) {
        this.mDescription.writeToParcel(parcel, n3);
        long l2 = this.mId;
        parcel.writeLong(l2);
    }
}

