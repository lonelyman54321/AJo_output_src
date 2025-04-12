/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.gamezop;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.gamezop.Body;
import com.ril.ajio.services.data.gamezop.GameZoneRewards;
import kotlin.jvm.internal.Intrinsics;

public final class GameZoneRewards$Creator
implements Parcelable.Creator {
    public final GameZoneRewards createFromParcel(Parcel object) {
        GameZoneRewards gameZoneRewards;
        Object object2;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "parcel");
        int n3 = object.readInt();
        Object object4 = null;
        if (n3 == 0) {
            n3 = 0;
            object3 = null;
        } else {
            object3 = Body.CREATOR.createFromParcel(object);
        }
        Object object5 = object3;
        object5 = (Body)object3;
        n3 = object.readInt();
        if (n3 == 0) {
            object2 = null;
        } else {
            n3 = object.readInt();
            object2 = object3 = Integer.valueOf(n3);
        }
        String string2 = object.readString();
        String string3 = object.readString();
        String string4 = object.readString();
        n3 = object.readInt();
        if (n3 == 0) {
            boolean bl2 = false;
            object = null;
        } else {
            int n4 = object.readInt();
            object = n4;
        }
        object3 = gameZoneRewards;
        object4 = object5;
        object5 = object2;
        object2 = string2;
        string2 = string3;
        string3 = string4;
        string4 = object;
        gameZoneRewards = new GameZoneRewards((Body)object4, (Integer)object5, (String)object2, string2, string3, (Integer)object);
        return gameZoneRewards;
    }

    public final GameZoneRewards[] newArray(int n3) {
        return new GameZoneRewards[n3];
    }
}

