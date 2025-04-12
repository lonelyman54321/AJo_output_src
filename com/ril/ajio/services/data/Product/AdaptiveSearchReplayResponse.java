/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Product.AdaptiveSearchReplayResponse$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AdaptiveSearchReplayResponse
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String autoSuggestSearchTerm;
    private final String autosuggestType;
    private final Boolean isMateriallRanking;
    private final String materiallClientID;

    static {
        AdaptiveSearchReplayResponse$Creator adaptiveSearchReplayResponse$Creator = new AdaptiveSearchReplayResponse$Creator();
        CREATOR = adaptiveSearchReplayResponse$Creator;
    }

    public AdaptiveSearchReplayResponse() {
        this(null, null, null, null, 15, null);
    }

    public AdaptiveSearchReplayResponse(Boolean bl2, String string2, String string3, String string4) {
        this.isMateriallRanking = bl2;
        this.materiallClientID = string2;
        this.autoSuggestSearchTerm = string3;
        this.autosuggestType = string4;
    }

    public /* synthetic */ AdaptiveSearchReplayResponse(Boolean bl2, String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = Boolean.FALSE;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string3 = null;
        }
        if ((n3 &= 8) != 0) {
            string4 = null;
        }
        this(bl2, string2, string3, string4);
    }

    public static /* synthetic */ AdaptiveSearchReplayResponse copy$default(AdaptiveSearchReplayResponse adaptiveSearchReplayResponse, Boolean bl2, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = adaptiveSearchReplayResponse.isMateriallRanking;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = adaptiveSearchReplayResponse.materiallClientID;
        }
        if ((n4 = n3 & 4) != 0) {
            string3 = adaptiveSearchReplayResponse.autoSuggestSearchTerm;
        }
        if ((n3 &= 8) != 0) {
            string4 = adaptiveSearchReplayResponse.autosuggestType;
        }
        return adaptiveSearchReplayResponse.copy(bl2, string2, string3, string4);
    }

    public final Boolean component1() {
        return this.isMateriallRanking;
    }

    public final String component2() {
        return this.materiallClientID;
    }

    public final String component3() {
        return this.autoSuggestSearchTerm;
    }

    public final String component4() {
        return this.autosuggestType;
    }

    public final AdaptiveSearchReplayResponse copy(Boolean bl2, String string2, String string3, String string4) {
        AdaptiveSearchReplayResponse adaptiveSearchReplayResponse = new AdaptiveSearchReplayResponse(bl2, string2, string3, string4);
        return adaptiveSearchReplayResponse;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AdaptiveSearchReplayResponse;
        if (!bl3) {
            return false;
        }
        object = (AdaptiveSearchReplayResponse)object;
        Object object2 = this.isMateriallRanking;
        Object object3 = ((AdaptiveSearchReplayResponse)object).isMateriallRanking;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.materiallClientID;
        object3 = ((AdaptiveSearchReplayResponse)object).materiallClientID;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.autoSuggestSearchTerm;
        object3 = ((AdaptiveSearchReplayResponse)object).autoSuggestSearchTerm;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.autosuggestType;
        object = ((AdaptiveSearchReplayResponse)object).autosuggestType;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAutoSuggestSearchTerm() {
        return this.autoSuggestSearchTerm;
    }

    public final String getAutosuggestType() {
        return this.autosuggestType;
    }

    public final String getMateriallClientID() {
        return this.materiallClientID;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.isMateriallRanking;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        String string2 = this.materiallClientID;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.autoSuggestSearchTerm;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.autosuggestType;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isMateriallRanking() {
        return this.isMateriallRanking;
    }

    public String toString() {
        Boolean bl2 = this.isMateriallRanking;
        String string2 = this.materiallClientID;
        String string3 = this.autoSuggestSearchTerm;
        String string4 = this.autosuggestType;
        StringBuilder stringBuilder = new StringBuilder("AdaptiveSearchReplayResponse(isMateriallRanking=");
        stringBuilder.append(bl2);
        stringBuilder.append(", materiallClientID=");
        stringBuilder.append(string2);
        stringBuilder.append(", autoSuggestSearchTerm=");
        return ko_0.a(stringBuilder, string3, ", autosuggestType=", string4, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.isMateriallRanking;
        if (object == null) {
            object = null;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            yi0_2.a(parcel, n4, (Boolean)object);
        }
        object = this.materiallClientID;
        parcel.writeString((String)object);
        object = this.autoSuggestSearchTerm;
        parcel.writeString((String)object);
        object = this.autosuggestType;
        parcel.writeString((String)object);
    }
}

