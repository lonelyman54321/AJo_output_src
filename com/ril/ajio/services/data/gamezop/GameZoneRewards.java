/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.gamezop;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.gamezop.Body;
import com.ril.ajio.services.data.gamezop.GameZoneRewards$Creator;
import kotlin.jvm.internal.Intrinsics;

public final class GameZoneRewards
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private Body body;
    private final Integer code;
    private final String displayMessage;
    private final String statusCode;
    private final Integer statusCodeValue;
    private final String statusMessage;

    static {
        GameZoneRewards$Creator gameZoneRewards$Creator = new GameZoneRewards$Creator();
        CREATOR = gameZoneRewards$Creator;
    }

    public GameZoneRewards(Body body, Integer n3, String string2, String string3, String string4, Integer n4) {
        this.body = body;
        this.code = n3;
        this.statusMessage = string2;
        this.displayMessage = string3;
        this.statusCode = string4;
        this.statusCodeValue = n4;
    }

    public final int describeContents() {
        return 0;
    }

    public final Body getBody() {
        return this.body;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getDisplayMessage() {
        return this.displayMessage;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final Integer getStatusCodeValue() {
        return this.statusCodeValue;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final void setBody(Body body) {
        this.body = body;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Body body = this.body;
        int n4 = 1;
        if (body == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            body.writeToParcel(parcel, n3);
        }
        Object object = this.code;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            n3 = (Integer)object;
            parcel.writeInt(n3);
        }
        object = this.statusMessage;
        parcel.writeString((String)object);
        object = this.displayMessage;
        parcel.writeString((String)object);
        object = this.statusCode;
        parcel.writeString((String)object);
        object = this.statusCodeValue;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            n3 = (Integer)object;
            parcel.writeInt(n3);
        }
    }
}

