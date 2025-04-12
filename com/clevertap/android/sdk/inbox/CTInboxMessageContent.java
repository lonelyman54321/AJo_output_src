/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent$a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CTInboxMessageContent
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public Boolean c;
    public Boolean d;
    public String e;
    public JSONArray f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;

    static {
        CTInboxMessageContent$a cTInboxMessageContent$a = new Object();
        CREATOR = cTInboxMessageContent$a;
    }

    public static String a(JSONObject object) {
        JSONException jSONException2;
        block6: {
            block5: {
                block4: {
                    String string2 = "bg";
                    if (object == null) {
                        return null;
                    }
                    try {
                        boolean bl2 = object.has(string2);
                        if (!bl2) break block4;
                    }
                    catch (JSONException jSONException2) {
                        break block6;
                    }
                    object = object.getString(string2);
                    break block5;
                }
                object = "";
            }
            return object;
        }
        jSONException2.getLocalizedMessage();
        com.clevertap.android.sdk.b.j();
        return null;
    }

    public static String b(JSONObject object) {
        JSONException jSONException2;
        block6: {
            block5: {
                block4: {
                    String string2 = "color";
                    if (object == null) {
                        return null;
                    }
                    try {
                        boolean bl2 = object.has(string2);
                        if (!bl2) break block4;
                    }
                    catch (JSONException jSONException2) {
                        break block6;
                    }
                    object = object.getString(string2);
                    break block5;
                }
                object = "";
            }
            return object;
        }
        jSONException2.getLocalizedMessage();
        com.clevertap.android.sdk.b.j();
        return null;
    }

    public static String c(JSONObject object) {
        JSONException jSONException2;
        block6: {
            block5: {
                block4: {
                    String string2 = "text";
                    if (object == null) {
                        return null;
                    }
                    try {
                        boolean bl2 = object.has(string2);
                        if (!bl2) break block4;
                    }
                    catch (JSONException jSONException2) {
                        break block6;
                    }
                    object = object.getString(string2);
                    break block5;
                }
                object = "";
            }
            return object;
        }
        jSONException2.getLocalizedMessage();
        com.clevertap.android.sdk.b.j();
        return null;
    }

    public static String e(JSONObject object) {
        JSONException jSONException2;
        block6: {
            block5: {
                block4: {
                    String string2 = "type";
                    if (object == null) {
                        return null;
                    }
                    try {
                        boolean bl2 = object.has(string2);
                        if (!bl2) break block4;
                    }
                    catch (JSONException jSONException2) {
                        break block6;
                    }
                    object = object.getString(string2);
                    break block5;
                }
                object = "";
            }
            return object;
        }
        jSONException2.getLocalizedMessage();
        com.clevertap.android.sdk.b.j();
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final String f() {
        return this.g;
    }

    public final String g() {
        return this.j;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(JSONObject jSONObject) {
        JSONException jSONException2;
        block24: {
            boolean bl2;
            boolean bl3;
            boolean bl4;
            boolean bl5;
            boolean bl6;
            boolean bl7;
            boolean bl8;
            boolean bl9;
            String string2;
            boolean bl10;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            Object object;
            Object object2;
            Object object3;
            String string10;
            Object object4;
            CTInboxMessageContent cTInboxMessageContent;
            block23: {
                block22: {
                    cTInboxMessageContent = this;
                    object4 = jSONObject;
                    string10 = "links";
                    object3 = "android";
                    object2 = "hasLinks";
                    object = "hasUrl";
                    string9 = "action";
                    string8 = "poster";
                    string7 = "content_type";
                    string6 = "media";
                    string5 = "icon";
                    string4 = "message";
                    string3 = "title";
                    try {
                        boolean bl11 = jSONObject.has(string3);
                        if (!bl11) break block22;
                        string3 = jSONObject.getJSONObject(string3);
                        break block23;
                    }
                    catch (JSONException jSONException2) {
                        break block24;
                    }
                }
                bl10 = false;
                string3 = null;
            }
            String string11 = "color";
            String string12 = "text";
            String string13 = "";
            if (string3 != null) {
                String string14;
                boolean bl12 = string3.has(string12);
                string2 = bl12 ? (string14 = string3.getString(string12)) : string13;
                cTInboxMessageContent.k = string2;
                bl9 = string3.has(string11);
                string3 = bl9 ? string3.getString(string11) : string13;
                cTInboxMessageContent.l = string3;
            }
            if (bl10 = object4.has(string4)) {
                string4 = object4.getJSONObject(string4);
            } else {
                bl8 = false;
                string4 = null;
            }
            if (string4 != null) {
                bl10 = string4.has(string12);
                string3 = bl10 ? string4.getString(string12) : string13;
                cTInboxMessageContent.h = string3;
                bl10 = string4.has(string11);
                string4 = bl10 ? string4.getString(string11) : string13;
                cTInboxMessageContent.i = string4;
            }
            if (bl8 = object4.has(string5)) {
                string5 = object4.getJSONObject(string5);
            } else {
                bl7 = false;
                string5 = null;
            }
            string4 = "url";
            if (string5 != null) {
                bl10 = string5.has(string4);
                string5 = bl10 ? string5.getString(string4) : string13;
                cTInboxMessageContent.e = string5;
            }
            if ((string6 = (bl7 = object4.has(string6)) ? object4.getJSONObject(string6) : null) != null) {
                bl7 = string6.has(string4);
                string5 = bl7 ? string6.getString(string4) : string13;
                cTInboxMessageContent.g = string5;
                bl7 = string6.has(string7);
                string7 = bl7 ? string6.getString(string7) : string13;
                cTInboxMessageContent.b = string7;
                bl6 = string6.has(string8);
                string8 = bl6 ? string6.getString(string8) : string13;
                cTInboxMessageContent.j = string8;
            }
            object4 = (bl5 = object4.has(string9)) ? object4.getJSONObject(string9) : null;
            if (object4 == null) return;
            boolean bl13 = object4.has((String)object);
            bl5 = false;
            string8 = null;
            bl6 = true;
            if (bl13 && (bl4 = object4.getBoolean((String)object))) {
                bl4 = true;
            } else {
                bl4 = false;
                object = null;
            }
            cTInboxMessageContent.d = object = Boolean.valueOf(bl4);
            bl4 = object4.has((String)object2);
            if (bl4 && (bl3 = object4.getBoolean((String)object2))) {
                bl5 = true;
            }
            cTInboxMessageContent.c = object2 = Boolean.valueOf(bl5);
            bl3 = object4.has(string4);
            if (bl3) {
                object2 = object4.getJSONObject(string4);
            } else {
                bl3 = false;
                object2 = null;
            }
            if (object2 != null && (bl4 = ((Boolean)(object = cTInboxMessageContent.d)).booleanValue())) {
                bl4 = object2.has((String)object3);
                if (bl4) {
                    object3 = object2.getJSONObject((String)object3);
                } else {
                    bl2 = false;
                    object3 = null;
                }
                if (object3 != null) {
                    bl4 = object3.has(string12);
                    if (bl4) {
                        string13 = object3.getString(string12);
                    }
                    object3 = string13;
                    cTInboxMessageContent.a = string13;
                }
            }
            if (object2 == null) return;
            object3 = cTInboxMessageContent.c;
            bl2 = (Boolean)object3;
            if (!bl2) return;
            bl2 = object4.has(string10);
            if (bl2) {
                string2 = object4.getJSONArray(string10);
            } else {
                bl9 = false;
                string2 = null;
            }
            cTInboxMessageContent.f = string2;
            return;
        }
        jSONException2.getLocalizedMessage();
        com.clevertap.android.sdk.b.j();
    }

    public final boolean i() {
        boolean bl2;
        String string2;
        String string3 = this.b;
        if (string3 != null && (string2 = this.g) != null && (bl2 = string3.startsWith(string2 = "audio"))) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        return bl2;
    }

    public final boolean j() {
        boolean bl2;
        String string2;
        String string3 = this.b;
        if (string3 != null && (string2 = this.g) != null && (bl2 = string3.equals(string2 = "image/gif"))) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        return bl2;
    }

    public final boolean k() {
        boolean bl2;
        boolean bl3;
        String string2;
        String string3 = this.b;
        if (string3 != null && (string2 = this.g) != null && (bl3 = string3.startsWith(string2 = "image")) && !(bl2 = string3.equals(string2 = "image/gif"))) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        return bl2;
    }

    public final boolean l() {
        boolean bl2;
        String string2;
        String string3 = this.b;
        if (string3 != null && (string2 = this.g) != null && (bl2 = string3.startsWith(string2 = "video"))) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        return bl2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.k;
        parcel.writeString(string2);
        string2 = this.l;
        parcel.writeString(string2);
        string2 = this.h;
        parcel.writeString(string2);
        string2 = this.i;
        parcel.writeString(string2);
        string2 = this.g;
        parcel.writeString(string2);
        n3 = (byte)(this.d.booleanValue() ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = (byte)(this.c.booleanValue() ? 1 : 0);
        parcel.writeByte((byte)n3);
        string2 = this.a;
        parcel.writeString(string2);
        string2 = this.e;
        parcel.writeString(string2);
        string2 = this.f;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
            parcel.writeByte((byte)0);
        } else {
            n3 = 1;
            parcel.writeByte((byte)n3);
            string2 = this.f.toString();
            parcel.writeString(string2);
        }
        string2 = this.b;
        parcel.writeString(string2);
        string2 = this.j;
        parcel.writeString(string2);
    }
}

