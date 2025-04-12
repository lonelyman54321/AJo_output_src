/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.CustomerCare;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.CustomerCare.ChatStatus;
import com.ril.ajio.services.data.CustomerCare.InitiateChat$Creator;
import kotlin.jvm.internal.Intrinsics;

public final class InitiateChat
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String authCode;
    private String authId;
    private ChatStatus status;

    static {
        InitiateChat$Creator initiateChat$Creator = new InitiateChat$Creator();
        CREATOR = initiateChat$Creator;
    }

    public InitiateChat() {
        String string2;
        this.authCode = string2 = "";
        this.authId = string2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String getAuthCode() {
        return this.authCode;
    }

    public final String getAuthId() {
        return this.authId;
    }

    public final ChatStatus getStatus() {
        return this.status;
    }

    public final void setAuthCode(String string2) {
        this.authCode = string2;
    }

    public final void setAuthId(String string2) {
        this.authId = string2;
    }

    public final void setStatus(ChatStatus chatStatus) {
        this.status = chatStatus;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeInt(1);
    }
}

