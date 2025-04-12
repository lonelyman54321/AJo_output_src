/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.query.FacetQuery;
import kotlin.jvm.internal.Intrinsics;

public final class FacetValue$Creator
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     */
    public final FacetValue createFromParcel(Parcel parcel) {
        void var21_24;
        FacetValue facetValue;
        String string2;
        boolean bl2;
        String string3;
        boolean bl3;
        Object object;
        Parcel parcel2 = parcel;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int n3 = parcel.readInt();
        Object object2 = null;
        if (n3 == 0) {
            n3 = 0;
            object = null;
        } else {
            object = Facet.CREATOR.createFromParcel(parcel);
        }
        Object object3 = object;
        object3 = (Facet)object;
        String string4 = parcel.readString();
        n3 = parcel.readInt();
        if (n3 != 0) {
            bl3 = true;
        } else {
            bl3 = false;
            string3 = null;
        }
        n3 = parcel.readInt();
        if (n3 != 0) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        int n4 = parcel.readInt();
        String string5 = parcel.readString();
        Object object4 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        n3 = parcel.readInt();
        if (n3 != 0) {
            object = FacetQuery.CREATOR;
            object2 = object.createFromParcel(parcel2);
        }
        FacetQuery facetQuery = object2;
        facetQuery = (FacetQuery)object2;
        n3 = parcel.readInt();
        boolean bl4 = n3 != 0;
        n3 = parcel.readInt();
        boolean bl5 = n3 != 0;
        int bl6 = parcel.readInt();
        if (bl6 != 0) {
            boolean bl7 = true;
        } else {
            boolean bl8 = false;
            parcel2 = null;
        }
        object = facetValue;
        object2 = object3;
        object3 = string4;
        string3 = string5;
        string2 = object4;
        string5 = string7;
        object4 = facetQuery;
        facetValue = new FacetValue((Facet)object2, string4, bl3, bl2, n4, string3, string2, string6, string7, facetQuery, bl4, bl5, (boolean)var21_24);
        return facetValue;
    }

    public final FacetValue[] newArray(int n3) {
        return new FacetValue[n3];
    }
}

