/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Product.SuggestedSearchTerms;
import kotlin.jvm.internal.Intrinsics;

public final class SuggestedSearchTerms$Creator
implements Parcelable.Creator {
    public final SuggestedSearchTerms createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        object = object.readString();
        SuggestedSearchTerms suggestedSearchTerms = new SuggestedSearchTerms(string2, string3, (String)object);
        return suggestedSearchTerms;
    }

    public final SuggestedSearchTerms[] newArray(int n3) {
        return new SuggestedSearchTerms[n3];
    }
}

