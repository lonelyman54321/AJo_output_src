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
import com.ril.ajio.services.data.Product.SpellCheckSuggestion;

class SpellCheckSuggestion$1
implements Parcelable.Creator {
    public SpellCheckSuggestion createFromParcel(Parcel parcel) {
        SpellCheckSuggestion spellCheckSuggestion = new SpellCheckSuggestion(parcel);
        return spellCheckSuggestion;
    }

    public SpellCheckSuggestion[] newArray(int n3) {
        return new SpellCheckSuggestion[n3];
    }
}

