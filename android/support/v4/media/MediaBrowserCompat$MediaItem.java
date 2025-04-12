/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.browse.MediaBrowser$MediaItem
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$Api21Impl;
import android.support.v4.media.MediaBrowserCompat$MediaItem$1;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class MediaBrowserCompat$MediaItem
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int FLAG_BROWSABLE = 1;
    public static final int FLAG_PLAYABLE = 2;
    private final MediaDescriptionCompat mDescription;
    private final int mFlags;

    static {
        MediaBrowserCompat$MediaItem$1 mediaBrowserCompat$MediaItem$1 = new MediaBrowserCompat$MediaItem$1();
        CREATOR = mediaBrowserCompat$MediaItem$1;
    }

    public MediaBrowserCompat$MediaItem(Parcel object) {
        int n3;
        this.mFlags = n3 = object.readInt();
        object = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(object);
        this.mDescription = object;
    }

    public MediaBrowserCompat$MediaItem(MediaDescriptionCompat object, int n3) {
        if (object != null) {
            String string2 = ((MediaDescriptionCompat)object).getMediaId();
            boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (!bl2) {
                this.mFlags = n3;
                this.mDescription = object;
                return;
            }
            object = new IllegalArgumentException("description must have a non-empty media id");
            throw object;
        }
        object = new IllegalArgumentException("description cannot be null");
        throw object;
    }

    public static MediaBrowserCompat$MediaItem fromMediaItem(Object object) {
        if (object != null) {
            object = (MediaBrowser.MediaItem)object;
            int n3 = MediaBrowserCompat$Api21Impl.getFlags((MediaBrowser.MediaItem)object);
            object = MediaDescriptionCompat.fromMediaDescription(MediaBrowserCompat$Api21Impl.getDescription((MediaBrowser.MediaItem)object));
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = new MediaBrowserCompat$MediaItem((MediaDescriptionCompat)object, n3);
            return mediaBrowserCompat$MediaItem;
        }
        return null;
    }

    public static List fromMediaItemList(List object) {
        if (object != null) {
            int n3 = object.size();
            ArrayList<MediaBrowserCompat$MediaItem> arrayList = new ArrayList<MediaBrowserCompat$MediaItem>(n3);
            object = object.iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = MediaBrowserCompat$MediaItem.fromMediaItem(object.next());
                arrayList.add(mediaBrowserCompat$MediaItem);
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

    public int getFlags() {
        return this.mFlags;
    }

    public String getMediaId() {
        return this.mDescription.getMediaId();
    }

    public boolean isBrowsable() {
        int n3 = this.mFlags;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean isPlayable() {
        int n3 = this.mFlags & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MediaItem{mFlags=");
        int n3 = this.mFlags;
        stringBuilder.append(n3);
        stringBuilder.append(", mDescription=");
        MediaDescriptionCompat mediaDescriptionCompat = this.mDescription;
        stringBuilder.append(mediaDescriptionCompat);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.mFlags;
        parcel.writeInt(n4);
        this.mDescription.writeToParcel(parcel, n3);
    }
}

