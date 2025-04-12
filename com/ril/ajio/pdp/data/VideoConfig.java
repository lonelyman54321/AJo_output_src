/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.pdp.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.pdp.data.VideoConfig$a;
import kotlin.jvm.internal.Intrinsics;

public final class VideoConfig
implements Parcelable {
    public static final int $stable;
    public static final Parcelable.Creator CREATOR;
    private final boolean autoplayEnabled;
    private final boolean isPdpVideosEnabled;

    static {
        VideoConfig$a videoConfig$a = new Object();
        CREATOR = videoConfig$a;
    }

    public VideoConfig(boolean bl2, boolean bl3) {
        this.isPdpVideosEnabled = bl2;
        this.autoplayEnabled = bl3;
    }

    public static /* synthetic */ VideoConfig copy$default(VideoConfig videoConfig, boolean bl2, boolean bl3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = videoConfig.isPdpVideosEnabled;
        }
        if ((n3 &= 2) != 0) {
            bl3 = videoConfig.autoplayEnabled;
        }
        return videoConfig.copy(bl2, bl3);
    }

    public final boolean component1() {
        return this.isPdpVideosEnabled;
    }

    public final boolean component2() {
        return this.autoplayEnabled;
    }

    public final VideoConfig copy(boolean bl2, boolean bl3) {
        VideoConfig videoConfig = new VideoConfig(bl2, bl3);
        return videoConfig;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof VideoConfig;
        if (!bl3) {
            return false;
        }
        object = (VideoConfig)object;
        bl3 = this.isPdpVideosEnabled;
        boolean bl4 = ((VideoConfig)object).isPdpVideosEnabled;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.autoplayEnabled;
        boolean bl5 = ((VideoConfig)object).autoplayEnabled;
        if (bl3 != bl5) {
            return false;
        }
        return bl2;
    }

    public final boolean getAutoplayEnabled() {
        return this.autoplayEnabled;
    }

    public int hashCode() {
        int n3 = this.isPdpVideosEnabled;
        int n4 = 1237;
        n3 = n3 != 0 ? 1231 : 1237;
        n3 *= 31;
        boolean bl2 = this.autoplayEnabled;
        if (bl2) {
            n4 = 1231;
        }
        return n3 + n4;
    }

    public final boolean isPdpVideosEnabled() {
        return this.isPdpVideosEnabled;
    }

    public String toString() {
        boolean bl2 = this.isPdpVideosEnabled;
        boolean bl3 = this.autoplayEnabled;
        StringBuilder stringBuilder = new StringBuilder("VideoConfig(isPdpVideosEnabled=");
        stringBuilder.append(bl2);
        stringBuilder.append(", autoplayEnabled=");
        stringBuilder.append(bl3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        n3 = (int)(this.isPdpVideosEnabled ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.autoplayEnabled ? 1 : 0);
        parcel.writeInt(n3);
    }
}

