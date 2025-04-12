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
import com.ril.ajio.services.data.Home.HomePageRatingResponse$Creator;
import com.ril.ajio.services.data.Home.UserUnratedItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class HomePageRatingResponse
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String ratingTitle;
    private ArrayList userUnratedItems;
    private String widgetTitle;

    static {
        HomePageRatingResponse$Creator homePageRatingResponse$Creator = new HomePageRatingResponse$Creator();
        CREATOR = homePageRatingResponse$Creator;
    }

    public HomePageRatingResponse() {
        this(null, null, null, 7, null);
    }

    public HomePageRatingResponse(String string2, ArrayList arrayList, String string3) {
        this.ratingTitle = string2;
        this.userUnratedItems = arrayList;
        this.widgetTitle = string3;
    }

    public /* synthetic */ HomePageRatingResponse(String string2, ArrayList arrayList, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            arrayList = null;
        }
        if ((n3 &= 4) != 0) {
            string3 = null;
        }
        this(string2, arrayList, string3);
    }

    public static /* synthetic */ HomePageRatingResponse copy$default(HomePageRatingResponse homePageRatingResponse, String string2, ArrayList arrayList, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = homePageRatingResponse.ratingTitle;
        }
        if ((n4 = n3 & 2) != 0) {
            arrayList = homePageRatingResponse.userUnratedItems;
        }
        if ((n3 &= 4) != 0) {
            string3 = homePageRatingResponse.widgetTitle;
        }
        return homePageRatingResponse.copy(string2, arrayList, string3);
    }

    public final String component1() {
        return this.ratingTitle;
    }

    public final ArrayList component2() {
        return this.userUnratedItems;
    }

    public final String component3() {
        return this.widgetTitle;
    }

    public final HomePageRatingResponse copy(String string2, ArrayList arrayList, String string3) {
        HomePageRatingResponse homePageRatingResponse = new HomePageRatingResponse(string2, arrayList, string3);
        return homePageRatingResponse;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof HomePageRatingResponse;
        if (!bl3) {
            return false;
        }
        object = (HomePageRatingResponse)object;
        Object object2 = this.ratingTitle;
        Object object3 = ((HomePageRatingResponse)object).ratingTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.userUnratedItems;
        object3 = ((HomePageRatingResponse)object).userUnratedItems;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.widgetTitle;
        object = ((HomePageRatingResponse)object).widgetTitle;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getRatingTitle() {
        return this.ratingTitle;
    }

    public final ArrayList getUserUnratedItems() {
        return this.userUnratedItems;
    }

    public final String getWidgetTitle() {
        return this.widgetTitle;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.ratingTitle;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.userUnratedItems;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.widgetTitle;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setRatingTitle(String string2) {
        this.ratingTitle = string2;
    }

    public final void setUserUnratedItems(ArrayList arrayList) {
        this.userUnratedItems = arrayList;
    }

    public final void setWidgetTitle(String string2) {
        this.widgetTitle = string2;
    }

    public String toString() {
        String string2 = this.ratingTitle;
        ArrayList arrayList = this.userUnratedItems;
        String string3 = this.widgetTitle;
        StringBuilder stringBuilder = new StringBuilder("HomePageRatingResponse(ratingTitle=");
        stringBuilder.append(string2);
        stringBuilder.append(", userUnratedItems=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", widgetTitle=");
        return h30_0.a(stringBuilder, string3, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Iterator iterator = this.ratingTitle;
        parcel.writeString((String)((Object)iterator));
        iterator = this.userUnratedItems;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            parcel.writeInt(n4);
            int n7 = ((ArrayList)((Object)iterator)).size();
            parcel.writeInt(n7);
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while ((n7 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                UserUnratedItem userUnratedItem = (UserUnratedItem)iterator.next();
                if (userUnratedItem == null) {
                    parcel.writeInt(0);
                    continue;
                }
                parcel.writeInt(n4);
                userUnratedItem.writeToParcel(parcel, n3);
            }
        }
        String string2 = this.widgetTitle;
        parcel.writeString(string2);
    }
}

