/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Home;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Home.NavigationChannel$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class NavigationChannel
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String channelName;
    private final Boolean defaultExpandable;
    private final Boolean visible;

    static {
        NavigationChannel$Creator navigationChannel$Creator = new NavigationChannel$Creator();
        CREATOR = navigationChannel$Creator;
    }

    public NavigationChannel() {
        this(null, null, null, 7, null);
    }

    public NavigationChannel(String string2, Boolean bl2, Boolean bl3) {
        this.channelName = string2;
        this.defaultExpandable = bl2;
        this.visible = bl3;
    }

    public /* synthetic */ NavigationChannel(String string2, Boolean bl2, Boolean bl3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            bl2 = Boolean.FALSE;
        }
        if ((n3 &= 4) != 0) {
            bl3 = Boolean.FALSE;
        }
        this(string2, bl2, bl3);
    }

    public final int describeContents() {
        return 0;
    }

    public final String getChannelName() {
        return this.channelName;
    }

    public final Boolean getDefaultExpandable() {
        return this.defaultExpandable;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.channelName;
        parcel.writeString((String)object);
        object = this.defaultExpandable;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n4, (Boolean)object);
        }
        object = this.visible;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n4, (Boolean)object);
        }
    }
}

