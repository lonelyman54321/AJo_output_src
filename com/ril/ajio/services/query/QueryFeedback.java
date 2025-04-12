/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.query.QueryFeedback$1;

public class QueryFeedback
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String channel;
    private String comments;
    private String loginID;
    private String orderID;
    private String rating;

    static {
        QueryFeedback$1 queryFeedback$1 = new QueryFeedback$1();
        CREATOR = queryFeedback$1;
    }

    public QueryFeedback() {
    }

    private QueryFeedback(Parcel object) {
        String string2;
        this.rating = string2 = object.readString();
        this.comments = string2 = object.readString();
        this.channel = string2 = object.readString();
        this.orderID = string2 = object.readString();
        object = object.readString();
        this.loginID = object;
    }

    public /* synthetic */ QueryFeedback(Parcel parcel, int n3) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getComments() {
        return this.comments;
    }

    public String getLoginID() {
        return this.loginID;
    }

    public String getOrderID() {
        return this.orderID;
    }

    public String getRating() {
        return this.rating;
    }

    public void setChannel(String string2) {
        this.channel = string2;
    }

    public void setComments(String string2) {
        this.comments = string2;
    }

    public void setLoginID(String string2) {
        this.loginID = string2;
    }

    public void setOrderID(String string2) {
        this.orderID = string2;
    }

    public void setRating(String string2) {
        this.rating = string2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.rating;
        parcel.writeString(string2);
        string2 = this.comments;
        parcel.writeString(string2);
        string2 = this.channel;
        parcel.writeString(string2);
        string2 = this.orderID;
        parcel.writeString(string2);
        string2 = this.loginID;
        parcel.writeString(string2);
    }
}

