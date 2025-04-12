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
package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia$a;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class CTInAppNotificationMedia
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;
    public String c;
    public String d;

    static {
        CTInAppNotificationMedia$a cTInAppNotificationMedia$a = new Object();
        CREATOR = cTInAppNotificationMedia$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final CTInAppNotificationMedia a(JSONObject object, int n3) {
        boolean bl2;
        block9: {
            JSONException jSONException2;
            block8: {
                CharSequence charSequence;
                String string2;
                String string3 = "key";
                Object object2 = "url";
                String string4 = "content_type";
                this.a = n3;
                try {
                    n3 = (int)(object.has(string4) ? 1 : 0);
                    string2 = "";
                    charSequence = n3 != 0 ? object.getString(string4) : string2;
                }
                catch (JSONException jSONException2) {
                    break block8;
                }
                this.c = charSequence;
                n3 = (int)(object.has((String)object2) ? 1 : 0);
                if (n3 != 0) {
                    string2 = object.getString((String)object2);
                }
                if ((n3 = (int)(string2.isEmpty() ? 1 : 0)) != 0) break block9;
                charSequence = this.c;
                object2 = "image";
                n3 = (int)(((String)charSequence).startsWith((String)object2) ? 1 : 0);
                if (n3 != 0) {
                    this.d = string2;
                    n3 = (int)(object.has(string3) ? 1 : 0);
                    if (n3 != 0) {
                        charSequence = new StringBuilder();
                        object2 = UUID.randomUUID();
                        object2 = ((UUID)object2).toString();
                        ((StringBuilder)charSequence).append((String)object2);
                        object = object.getString(string3);
                        ((StringBuilder)charSequence).append((String)object);
                        this.b = object = ((StringBuilder)charSequence).toString();
                        break block9;
                    } else {
                        object = UUID.randomUUID();
                        this.b = object = ((UUID)object).toString();
                    }
                    break block9;
                } else {
                    this.d = string2;
                }
                break block9;
            }
            jSONException2.getLocalizedMessage();
            com.clevertap.android.sdk.b.j();
        }
        if (bl2 = ((String)(object = this.c)).isEmpty()) {
            return null;
        }
        return this;
    }

    public final boolean b() {
        boolean bl2;
        String string2;
        String string3 = this.c;
        if (string3 != null && (string2 = this.d) != null && (bl2 = string3.startsWith(string2 = "audio"))) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        return bl2;
    }

    public final boolean c() {
        boolean bl2;
        String string2;
        String string3 = this.c;
        if (string3 != null && (string2 = this.d) != null && (bl2 = string3.equals(string2 = "image/gif"))) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        return bl2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        boolean bl2;
        boolean bl3;
        String string2;
        String string3 = this.c;
        if (string3 != null && (string2 = this.d) != null && (bl3 = string3.startsWith(string2 = "image")) && !(bl2 = string3.equals(string2 = "image/gif"))) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        return bl2;
    }

    public final boolean f() {
        boolean bl2;
        String string2;
        String string3 = this.c;
        if (string3 != null && (string2 = this.d) != null && (bl2 = string3.startsWith(string2 = "video"))) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        return bl2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.d;
        parcel.writeString(string2);
        string2 = this.c;
        parcel.writeString(string2);
        string2 = this.b;
        parcel.writeString(string2);
        n3 = this.a;
        parcel.writeInt(n3);
    }
}

