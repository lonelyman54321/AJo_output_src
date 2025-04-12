/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.data.model.GameInfo$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class GameInfo
implements Parcelable {
    public static final int $stable;
    public static final Parcelable.Creator CREATOR;
    private final String gameName;
    private final String gameType;
    private final String gameUrl;

    static {
        GameInfo$Creator gameInfo$Creator = new GameInfo$Creator();
        CREATOR = gameInfo$Creator;
    }

    public GameInfo(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "gameType");
        Intrinsics.checkNotNullParameter(string4, "gameUrl");
        this.gameType = string2;
        this.gameName = string3;
        this.gameUrl = string4;
    }

    public /* synthetic */ GameInfo(String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = "";
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3, string4);
    }

    public static /* synthetic */ GameInfo copy$default(GameInfo gameInfo, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = gameInfo.gameType;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = gameInfo.gameName;
        }
        if ((n3 &= 4) != 0) {
            string4 = gameInfo.gameUrl;
        }
        return gameInfo.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.gameType;
    }

    public final String component2() {
        return this.gameName;
    }

    public final String component3() {
        return this.gameUrl;
    }

    public final GameInfo copy(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "gameType");
        Intrinsics.checkNotNullParameter(string4, "gameUrl");
        GameInfo gameInfo = new GameInfo(string2, string3, string4);
        return gameInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof GameInfo;
        if (!bl3) {
            return false;
        }
        object = (GameInfo)object;
        String string2 = this.gameType;
        String string3 = ((GameInfo)object).gameType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.gameName;
        string3 = ((GameInfo)object).gameName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.gameUrl;
        object = ((GameInfo)object).gameUrl;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getGameName() {
        return this.gameName;
    }

    public final String getGameType() {
        return this.gameType;
    }

    public final String getGameUrl() {
        return this.gameUrl;
    }

    public int hashCode() {
        int n3;
        String string2 = this.gameType;
        int n4 = string2.hashCode() * 31;
        String string3 = this.gameName;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        return this.gameUrl.hashCode() + n4;
    }

    public String toString() {
        String string2 = this.gameType;
        String string3 = this.gameName;
        String string4 = this.gameUrl;
        return h30_0.a(og_1.a("GameInfo(gameType=", string2, ", gameName=", string3, ", gameUrl="), string4, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.gameType;
        parcel.writeString(string2);
        string2 = this.gameName;
        parcel.writeString(string2);
        string2 = this.gameUrl;
        parcel.writeString(string2);
    }
}

