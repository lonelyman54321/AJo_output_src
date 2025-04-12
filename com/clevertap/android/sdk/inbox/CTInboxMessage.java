/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inbox.CTInboxMessage$a;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class CTInboxMessage
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public String d;
    public JSONObject e;
    public JSONObject f;
    public long g;
    public long h;
    public String i;
    public ArrayList j;
    public boolean k;
    public String l;
    public String m;
    public ArrayList n;
    public String o;
    public qi_1 p;
    public JSONObject q;

    static {
        CTInboxMessage$a cTInboxMessage$a = new Object();
        CREATOR = cTInboxMessage$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CTInboxMessage(JSONObject jSONObject) {
        JSONException jSONException2;
        block27: {
            long l2;
            int n3;
            Object object;
            CTInboxMessage cTInboxMessage = this;
            JSONObject jSONObject2 = jSONObject;
            String string2 = "value";
            String string3 = "key";
            String string4 = "custom_kv";
            String string5 = "content";
            String string6 = "bg";
            Object object2 = "type";
            Object object3 = "msg";
            String string7 = "tags";
            String string8 = "isRead";
            Object object4 = "wzrk_ttl";
            String string9 = "date";
            String string10 = "wzrk_id";
            String string11 = "wzrkParams";
            String string12 = "id";
            String string13 = "orientation";
            this.e = object = new JSONObject();
            this.j = object;
            super();
            this.n = object;
            this.f = jSONObject;
            try {
                n3 = jSONObject.has(string12);
                string12 = n3 != 0 ? jSONObject.getString(string12) : "0";
            }
            catch (JSONException jSONException2) {
                break block27;
            }
            cTInboxMessage.l = string12;
            boolean bl2 = jSONObject2.has(string10);
            string12 = bl2 ? jSONObject2.getString(string10) : "0_0";
            cTInboxMessage.d = string12;
            bl2 = jSONObject2.has(string9);
            if (bl2) {
                l2 = jSONObject2.getLong(string9);
            } else {
                l2 = System.currentTimeMillis();
                long l3 = 1000L;
                l2 /= l3;
            }
            cTInboxMessage.g = l2;
            bl2 = jSONObject2.has((String)object4);
            if (bl2) {
                l2 = jSONObject2.getLong((String)object4);
            } else {
                l2 = System.currentTimeMillis();
                long l4 = 86400000L;
                l2 += l4;
            }
            cTInboxMessage.h = l2;
            bl2 = jSONObject2.has(string8);
            n3 = 0;
            object = null;
            if (bl2 && (bl2 = jSONObject2.getBoolean(string8))) {
                bl2 = true;
            } else {
                bl2 = false;
                string12 = null;
            }
            cTInboxMessage.k = bl2;
            bl2 = jSONObject2.has(string7);
            string8 = null;
            if (bl2) {
                string12 = jSONObject2.getJSONArray(string7);
            } else {
                bl2 = false;
                string12 = null;
            }
            if (string12 != null) {
                int n4;
                string7 = null;
                for (int i3 = 0; i3 < (n4 = string12.length()); ++i3) {
                    object4 = cTInboxMessage.n;
                    string9 = string12.getString(i3);
                    ((ArrayList)object4).add(string9);
                }
            }
            if (bl2 = jSONObject2.has((String)object3)) {
                string12 = jSONObject2.getJSONObject((String)object3);
            } else {
                bl2 = false;
                string12 = null;
            }
            if (string12 != null) {
                int n7;
                boolean bl3 = string12.has((String)object2);
                string7 = "";
                if (bl3) {
                    object2 = string12.getString((String)object2);
                    object2 = qi_1.fromString((String)object2);
                } else {
                    object2 = qi_1.fromString(string7);
                }
                cTInboxMessage.p = object2;
                int n8 = string12.has(string6);
                string6 = n8 != 0 ? string12.getString(string6) : string7;
                cTInboxMessage.b = string6;
                int n10 = string12.has(string5);
                if (n10 != 0) {
                    string5 = string12.getJSONArray(string5);
                } else {
                    n7 = 0;
                    string5 = null;
                }
                if (string5 != null) {
                    string6 = null;
                    for (n10 = 0; n10 < (n8 = string5.length()); ++n10) {
                        super();
                        object3 = string5.getJSONObject(n10);
                        ((CTInboxMessageContent)object2).h((JSONObject)object3);
                        object3 = cTInboxMessage.j;
                        ((ArrayList)object3).add(object2);
                    }
                }
                if ((string4 = (n7 = string12.has(string4)) != 0 ? string12.getJSONArray(string4) : null) != null) {
                    while (n3 < (n7 = string4.length())) {
                        string5 = string4.getJSONObject(n3);
                        n10 = (int)(string5.has(string3) ? 1 : 0);
                        if (n10 != 0) {
                            string6 = string5.getString(string3);
                            n8 = (int)(string5.has(string2) ? 1 : 0);
                            if (n8 != 0) {
                                string5 = string5.getJSONObject(string2);
                                object2 = cTInboxMessage.e;
                                object3 = "text";
                                string5 = string5.getString((String)object3);
                                object2.put(string6, (Object)string5);
                            }
                        }
                        ++n3;
                    }
                }
                object = string13;
                boolean bl4 = string12.has(string13);
                if (bl4) {
                    string7 = string12.getString(string13);
                }
                cTInboxMessage.m = string7;
            }
            string12 = string11;
            n3 = jSONObject2.has(string11);
            if (n3 != 0) {
                string8 = jSONObject2.getJSONObject(string11);
            }
            cTInboxMessage.q = string8;
            return;
        }
        jSONException2.getLocalizedMessage();
        com.clevertap.android.sdk.b.j();
    }

    public final String a() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.o;
        parcel.writeString(object);
        object = this.c;
        parcel.writeString(object);
        object = this.i;
        parcel.writeString(object);
        object = this.a;
        parcel.writeString(object);
        long l2 = this.g;
        parcel.writeLong(l2);
        l2 = this.h;
        parcel.writeLong(l2);
        object = this.l;
        parcel.writeString(object);
        object = this.f;
        byte by2 = 1;
        if (object == null) {
            parcel.writeByte((byte)0);
        } else {
            parcel.writeByte(by2);
            object = object.toString();
            parcel.writeString(object);
        }
        object = this.e;
        if (object == null) {
            parcel.writeByte((byte)0);
        } else {
            parcel.writeByte(by2);
            object = object.toString();
            parcel.writeString(object);
        }
        n3 = (byte)(this.k ? 1 : 0);
        parcel.writeByte((byte)n3);
        object = this.p;
        parcel.writeValue(object);
        object = this.n;
        if (object == null) {
            parcel.writeByte((byte)0);
        } else {
            parcel.writeByte(by2);
            parcel.writeList((List)object);
        }
        object = this.b;
        parcel.writeString(object);
        object = this.j;
        if (object == null) {
            parcel.writeByte((byte)0);
        } else {
            parcel.writeByte(by2);
            parcel.writeList((List)object);
        }
        object = this.m;
        parcel.writeString(object);
        object = this.d;
        parcel.writeString(object);
        object = this.q;
        if (object == null) {
            parcel.writeByte((byte)0);
        } else {
            parcel.writeByte(by2);
            object = object.toString();
            parcel.writeString(object);
        }
    }
}

