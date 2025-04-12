/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.ParcelableVolumeInfo$1;

public class ParcelableVolumeInfo
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public int audioStream;
    public int controlType;
    public int currentVolume;
    public int maxVolume;
    public int volumeType;

    static {
        ParcelableVolumeInfo$1 parcelableVolumeInfo$1 = new ParcelableVolumeInfo$1();
        CREATOR = parcelableVolumeInfo$1;
    }

    public ParcelableVolumeInfo(int n3, int n4, int n7, int n8, int n10) {
        this.volumeType = n3;
        this.audioStream = n4;
        this.controlType = n7;
        this.maxVolume = n8;
        this.currentVolume = n10;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        int n3;
        int n4;
        this.volumeType = n4 = parcel.readInt();
        this.controlType = n4 = parcel.readInt();
        this.maxVolume = n4 = parcel.readInt();
        this.currentVolume = n4 = parcel.readInt();
        this.audioStream = n3 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = this.volumeType;
        parcel.writeInt(n3);
        n3 = this.controlType;
        parcel.writeInt(n3);
        n3 = this.maxVolume;
        parcel.writeInt(n3);
        n3 = this.currentVolume;
        parcel.writeInt(n3);
        n3 = this.audioStream;
        parcel.writeInt(n3);
    }
}

