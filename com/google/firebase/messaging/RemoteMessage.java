/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.messaging.Constants$MessagePayloadKeys;
import com.google.firebase.messaging.NotificationParams;
import com.google.firebase.messaging.RemoteMessage$Notification;
import com.google.firebase.messaging.RemoteMessageCreator;
import java.util.Map;
import java.util.Objects;

public final class RemoteMessage
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN;
    Bundle bundle;
    private Map data;
    private RemoteMessage$Notification notification;

    static {
        RemoteMessageCreator remoteMessageCreator = new RemoteMessageCreator();
        CREATOR = remoteMessageCreator;
    }

    public RemoteMessage(Bundle bundle) {
        this.bundle = bundle;
    }

    private int getMessagePriority(String string2) {
        String string3 = "high";
        boolean bl2 = string3.equals(string2);
        if (bl2) {
            return 1;
        }
        string3 = "normal";
        boolean bl3 = string3.equals(string2);
        if (bl3) {
            return 2;
        }
        return 0;
    }

    public String getCollapseKey() {
        return this.bundle.getString("collapse_key");
    }

    public Map getData() {
        Map map2 = this.data;
        if (map2 == null) {
            this.data = map2 = Constants$MessagePayloadKeys.extractDeveloperDefinedPayload(this.bundle);
        }
        return this.data;
    }

    public String getFrom() {
        return this.bundle.getString("from");
    }

    public String getMessageId() {
        Object object = this.bundle;
        String string2 = "google.message_id";
        if ((object = object.getString(string2)) == null) {
            object = this.bundle;
            string2 = "message_id";
            object = object.getString(string2);
        }
        return object;
    }

    public String getMessageType() {
        return this.bundle.getString("message_type");
    }

    public RemoteMessage$Notification getNotification() {
        boolean bl2;
        RemoteMessage$Notification remoteMessage$Notification = this.notification;
        if (remoteMessage$Notification == null && (bl2 = NotificationParams.isNotification((Bundle)(remoteMessage$Notification = this.bundle)))) {
            Bundle bundle = this.bundle;
            NotificationParams notificationParams = new NotificationParams(bundle);
            bundle = null;
            this.notification = remoteMessage$Notification = new RemoteMessage$Notification(notificationParams, null);
        }
        return this.notification;
    }

    public int getOriginalPriority() {
        Object object = this.bundle;
        String string2 = "google.original_priority";
        if ((object = object.getString(string2)) == null) {
            object = this.bundle;
            string2 = "google.priority";
            object = object.getString(string2);
        }
        return this.getMessagePriority((String)object);
    }

    public int getPriority() {
        Object object = this.bundle;
        String string2 = "google.delivered_priority";
        if ((object = object.getString(string2)) == null) {
            string2 = "1";
            object = this.bundle.getString("google.priority_reduced");
            boolean bl2 = string2.equals(object);
            if (bl2) {
                return 2;
            }
            object = this.bundle;
            string2 = "google.priority";
            object = object.getString(string2);
        }
        return this.getMessagePriority((String)object);
    }

    public byte[] getRawData() {
        return this.bundle.getByteArray("rawData");
    }

    public String getSenderId() {
        return this.bundle.getString("google.c.sender.id");
    }

    public long getSentTime() {
        Object object = this.bundle;
        String string2 = "google.sent_time";
        boolean bl2 = (object = object.get(string2)) instanceof Long;
        if (bl2) {
            return (Long)object;
        }
        bl2 = object instanceof String;
        if (bl2) {
            string2 = object;
            string2 = (String)object;
            try {
                return Long.parseLong(string2);
            }
            catch (NumberFormatException numberFormatException) {
                Objects.toString(object);
            }
        }
        return 0L;
    }

    public String getTo() {
        return this.bundle.getString("google.to");
    }

    public int getTtl() {
        Object object = this.bundle;
        String string2 = "google.ttl";
        boolean bl2 = (object = object.get(string2)) instanceof Integer;
        if (bl2) {
            return (Integer)object;
        }
        bl2 = object instanceof String;
        if (bl2) {
            string2 = object;
            string2 = (String)object;
            try {
                return Integer.parseInt(string2);
            }
            catch (NumberFormatException numberFormatException) {
                Objects.toString(object);
            }
        }
        return 0;
    }

    public void populateSendMessageIntent(Intent intent) {
        Bundle bundle = this.bundle;
        intent.putExtras(bundle);
    }

    public Intent toIntent() {
        Intent intent = new Intent();
        Bundle bundle = this.bundle;
        intent.putExtras(bundle);
        return intent;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        RemoteMessageCreator.writeToParcel(this, parcel, n3);
    }
}

