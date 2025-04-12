/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent$a;
import org.json.JSONObject;

public class CleverTapDisplayUnitContent
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    static {
        CleverTapDisplayUnitContent$a cleverTapDisplayUnitContent$a = new Object();
        CREATOR = cleverTapDisplayUnitContent$a;
    }

    public CleverTapDisplayUnitContent(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
        this.i = string2;
        this.j = string3;
        this.f = string4;
        this.g = string5;
        this.d = string6;
        this.e = string7;
        this.b = string8;
        this.h = string9;
        this.a = string10;
        this.c = string11;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CleverTapDisplayUnitContent a(JSONObject jSONObject) {
        CleverTapDisplayUnitContent cleverTapDisplayUnitContent;
        Exception exception2;
        Object object;
        block21: {
            boolean bl2;
            String string2;
            String string3;
            String string4;
            String string5;
            boolean bl3;
            String string6;
            String string7;
            boolean bl4;
            String string8;
            String string9;
            boolean bl5;
            boolean bl6;
            JSONObject jSONObject2;
            String string10;
            String string11;
            String string12;
            String string13;
            String string14;
            String string15;
            String string16;
            Object object2;
            block20: {
                block19: {
                    object2 = jSONObject;
                    object = "android";
                    string16 = "action";
                    string15 = "poster";
                    string14 = "content_type";
                    string13 = "media";
                    string12 = "icon";
                    string11 = "message";
                    string10 = "title";
                    try {
                        boolean bl7 = jSONObject.has(string10);
                        jSONObject2 = null;
                        if (!bl7) break block19;
                        string10 = jSONObject.getJSONObject(string10);
                        break block20;
                    }
                    catch (Exception exception2) {
                        break block21;
                    }
                }
                bl6 = false;
                string10 = null;
            }
            String string17 = "color";
            String string18 = "text";
            String string19 = "";
            if (string10 != null) {
                bl5 = string10.has(string18);
                String string20 = bl5 ? string10.getString(string18) : string19;
                boolean bl8 = string10.has(string17);
                string10 = bl8 ? string10.getString(string17) : string19;
                string9 = string10;
                string8 = string20;
            } else {
                string8 = string19;
                string9 = string19;
            }
            bl6 = object2.has(string11);
            if (bl6) {
                string11 = object2.getJSONObject(string11);
            } else {
                bl4 = false;
                string11 = null;
            }
            if (string11 != null) {
                bl6 = string11.has(string18);
                string10 = bl6 ? string11.getString(string18) : string19;
                bl5 = string11.has(string17);
                string11 = bl5 ? string11.getString(string17) : string19;
                string7 = string11;
                string6 = string10;
            } else {
                string6 = string19;
                string7 = string19;
            }
            bl4 = object2.has(string12);
            if (bl4) {
                string12 = object2.getJSONObject(string12);
            } else {
                bl3 = false;
                string12 = null;
            }
            string11 = "url";
            if (string12 != null) {
                bl6 = string12.has(string11);
                string12 = bl6 ? string12.getString(string11) : string19;
                string5 = string12;
            } else {
                string5 = string19;
            }
            bl3 = object2.has(string13);
            string13 = bl3 ? object2.getJSONObject(string13) : null;
            if (string13 != null) {
                bl3 = string13.has(string11);
                string12 = bl3 ? string13.getString(string11) : string19;
                bl6 = string13.has(string14);
                string14 = bl6 ? string13.getString(string14) : string19;
                bl6 = string13.has(string15);
                string15 = bl6 ? string13.getString(string15) : string19;
                string4 = string15;
                string3 = string14;
                string2 = string12;
            } else {
                string2 = string19;
                string3 = string19;
                string4 = string19;
            }
            boolean bl9 = object2.has(string16);
            if (bl9) {
                object2 = object2.getJSONObject(string16);
            } else {
                bl2 = false;
                object2 = null;
            }
            if (object2 == null) return new CleverTapDisplayUnitContent(string8, string9, string6, string7, string5, string2, string3, string4, string19, null);
            boolean bl10 = object2.has(string11);
            if (bl10) {
                object2 = object2.getJSONObject(string11);
            } else {
                bl2 = false;
                object2 = null;
            }
            if (object2 == null) return new CleverTapDisplayUnitContent(string8, string9, string6, string7, string5, string2, string3, string4, string19, null);
            bl10 = object2.has((String)object);
            if (bl10) {
                jSONObject2 = object2.getJSONObject((String)object);
            }
            if (jSONObject2 == null) return new CleverTapDisplayUnitContent(string8, string9, string6, string7, string5, string2, string3, string4, string19, null);
            bl2 = jSONObject2.has(string18);
            if (!bl2) return new CleverTapDisplayUnitContent(string8, string9, string6, string7, string5, string2, string3, string4, string19, null);
            string19 = jSONObject2.getString(string18);
            return new CleverTapDisplayUnitContent(string8, string9, string6, string7, string5, string2, string3, string4, string19, null);
        }
        exception2.getLocalizedMessage();
        com.clevertap.android.sdk.b.d();
        object = new StringBuilder("Error Creating DisplayUnit Content from JSON : ");
        String string21 = exception2.getLocalizedMessage();
        ((StringBuilder)object).append(string21);
        String string22 = ((StringBuilder)object).toString();
        object = cleverTapDisplayUnitContent;
        return new CleverTapDisplayUnitContent("", "", "", "", "", "", "", "", "", string22);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[ title:");
        String string2 = this.i;
        stringBuilder.append(string2);
        stringBuilder.append(", titleColor:");
        string2 = this.j;
        stringBuilder.append(string2);
        stringBuilder.append(" message:");
        string2 = this.f;
        stringBuilder.append(string2);
        stringBuilder.append(", messageColor:");
        string2 = this.g;
        stringBuilder.append(string2);
        stringBuilder.append(", media:");
        string2 = this.e;
        stringBuilder.append(string2);
        stringBuilder.append(", contentType:");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", posterUrl:");
        string2 = this.h;
        stringBuilder.append(string2);
        stringBuilder.append(", actionUrl:");
        string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", icon:");
        string2 = this.d;
        stringBuilder.append(string2);
        stringBuilder.append(", error:");
        string2 = this.c;
        return h30_0.a(stringBuilder, string2, " ]");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.i;
        parcel.writeString(string2);
        string2 = this.j;
        parcel.writeString(string2);
        string2 = this.f;
        parcel.writeString(string2);
        string2 = this.g;
        parcel.writeString(string2);
        string2 = this.d;
        parcel.writeString(string2);
        string2 = this.e;
        parcel.writeString(string2);
        string2 = this.b;
        parcel.writeString(string2);
        string2 = this.h;
        parcel.writeString(string2);
        string2 = this.a;
        parcel.writeString(string2);
        string2 = this.c;
        parcel.writeString(string2);
    }
}

