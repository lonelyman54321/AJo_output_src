/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class CTInboxMessage$a
implements Parcelable.Creator {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object createFromParcel(Parcel object) {
        JSONException jSONException2;
        CTInboxMessage cTInboxMessage;
        block13: {
            byte by2;
            Object object2;
            JSONObject jSONObject;
            byte by4;
            Object object3;
            block12: {
                block11: {
                    cTInboxMessage = new Object();
                    cTInboxMessage.e = object3 = new JSONObject();
                    object3 = new ArrayList();
                    cTInboxMessage.j = object3;
                    object3 = new ArrayList();
                    cTInboxMessage.n = object3;
                    try {
                        long l2;
                        object3 = object.readString();
                        cTInboxMessage.o = object3;
                        object3 = object.readString();
                        cTInboxMessage.c = object3;
                        object3 = object.readString();
                        cTInboxMessage.i = object3;
                        object3 = object.readString();
                        cTInboxMessage.a = object3;
                        cTInboxMessage.g = l2 = object.readLong();
                        cTInboxMessage.h = l2 = object.readLong();
                        object3 = object.readString();
                        cTInboxMessage.l = object3;
                        by4 = object.readByte();
                        jSONObject = null;
                        if (by4 == 0) {
                            by4 = 0;
                            object3 = null;
                        } else {
                            object2 = object.readString();
                            object3 = new JSONObject((String)object2);
                        }
                        cTInboxMessage.f = object3;
                        by4 = object.readByte();
                        if (by4 == 0) {
                            by4 = 0;
                            object3 = null;
                        } else {
                            object2 = object.readString();
                            object3 = new JSONObject((String)object2);
                        }
                        cTInboxMessage.e = object3;
                        by4 = object.readByte();
                        by2 = 1;
                        if (by4 != 0) {
                            by4 = 1;
                        } else {
                            by4 = 0;
                            object3 = null;
                        }
                        cTInboxMessage.k = by4;
                        object3 = qi_1.class;
                        object3 = object3.getClassLoader();
                        object3 = object.readValue((ClassLoader)object3);
                        object3 = (qi_1)((Object)object3);
                        cTInboxMessage.p = object3;
                        by4 = object.readByte();
                        if (by4 != by2) break block11;
                        object3 = new ArrayList();
                        cTInboxMessage.n = object3;
                        Object object4 = String.class;
                        object4 = ((Class)object4).getClassLoader();
                        object.readList((List)object3, (ClassLoader)object4);
                        break block12;
                    }
                    catch (JSONException jSONException2) {
                        break block13;
                    }
                }
                cTInboxMessage.n = null;
            }
            object3 = object.readString();
            cTInboxMessage.b = object3;
            by4 = object.readByte();
            if (by4 == by2) {
                object3 = new ArrayList();
                cTInboxMessage.j = object3;
                object2 = CTInboxMessageContent.class;
                object2 = ((Class)object2).getClassLoader();
                object.readList((List)object3, (ClassLoader)object2);
            } else {
                cTInboxMessage.j = null;
            }
            object3 = object.readString();
            cTInboxMessage.m = object3;
            object3 = object.readString();
            cTInboxMessage.d = object3;
            by4 = object.readByte();
            if (by4 != 0) {
                object = object.readString();
                jSONObject = new JSONObject((String)object);
            }
            cTInboxMessage.q = jSONObject;
            return cTInboxMessage;
        }
        jSONException2.getLocalizedMessage();
        b.j();
        return cTInboxMessage;
    }

    public final Object[] newArray(int n3) {
        return new CTInboxMessage[n3];
    }
}

