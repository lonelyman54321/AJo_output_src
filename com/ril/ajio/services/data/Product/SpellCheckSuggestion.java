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
import com.ril.ajio.services.data.Product.SpellCheckSuggestion$1;
import java.io.Serializable;

public class SpellCheckSuggestion
implements Parcelable,
Serializable {
    public static final Parcelable.Creator CREATOR;
    private String term;
    private String url;

    static {
        SpellCheckSuggestion$1 spellCheckSuggestion$1 = new SpellCheckSuggestion$1();
        CREATOR = spellCheckSuggestion$1;
    }

    public SpellCheckSuggestion() {
    }

    public SpellCheckSuggestion(Parcel object) {
        String string2;
        this.term = string2 = object.readString();
        object = object.readString();
        this.url = object;
    }

    public int describeContents() {
        return 0;
    }

    public String getTerm() {
        return this.term;
    }

    public String getUrl() {
        return this.url;
    }

    public void setTerm(String string2) {
        this.term = string2;
    }

    public void setUrl(String string2) {
        this.url = string2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.term;
        parcel.writeString(string2);
        string2 = this.url;
        parcel.writeString(string2);
    }
}

