/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.pdp.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.pdp.data.VideoConfig;
import kotlin.jvm.internal.Intrinsics;

public final class VideoConfig$a
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     */
    public final Object createFromParcel(Parcel parcel) {
        void var3_6;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int bl2 = parcel.readInt();
        boolean bl3 = false;
        if (bl2 != 0) {
            boolean bl4 = true;
        } else {
            boolean bl5 = false;
        }
        int n3 = parcel.readInt();
        if (n3 != 0) {
            bl3 = true;
        }
        VideoConfig videoConfig = new VideoConfig((boolean)var3_6, bl3);
        return videoConfig;
    }

    public final Object[] newArray(int n3) {
        return new VideoConfig[n3];
    }
}

