/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package com.clevertap.android.sdk.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import org.json.JSONArray;
import org.json.JSONException;

public final class CTInboxMessageContent$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel object) {
        Object object2;
        CTInboxMessageContent cTInboxMessageContent;
        block10: {
            String string2;
            block9: {
                cTInboxMessageContent = new Object();
                object2 = object.readString();
                cTInboxMessageContent.k = object2;
                object2 = object.readString();
                cTInboxMessageContent.l = object2;
                object2 = object.readString();
                cTInboxMessageContent.h = object2;
                object2 = object.readString();
                cTInboxMessageContent.i = object2;
                object2 = object.readString();
                cTInboxMessageContent.g = object2;
                byte by2 = object.readByte();
                boolean bl2 = false;
                string2 = null;
                if (by2 != 0) {
                    by2 = 1;
                } else {
                    by2 = 0;
                    object2 = null;
                }
                cTInboxMessageContent.d = object2 = Boolean.valueOf(by2 != 0);
                by2 = object.readByte();
                if (by2 != 0) {
                    bl2 = true;
                }
                cTInboxMessageContent.c = object2 = Boolean.valueOf(bl2);
                cTInboxMessageContent.a = object2 = object.readString();
                cTInboxMessageContent.e = object2 = object.readString();
                by2 = object.readByte();
                if (by2 != 0) break block9;
                by2 = 0;
                object2 = null;
                break block10;
            }
            string2 = object.readString();
            object2 = new JSONArray(string2);
        }
        try {
            cTInboxMessageContent.f = object2;
        }
        catch (JSONException jSONException) {
            jSONException.getLocalizedMessage();
            b.j();
        }
        cTInboxMessageContent.b = object2 = object.readString();
        object = object.readString();
        cTInboxMessageContent.j = object;
        return cTInboxMessageContent;
    }

    public final Object[] newArray(int n3) {
        return new CTInboxMessageContent[n3];
    }
}

