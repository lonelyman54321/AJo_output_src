/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.firebase.messaging;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;

public class RemoteMessage$Builder {
    private final Bundle bundle;
    private final Map data;

    public RemoteMessage$Builder(String string2) {
        Object object;
        this.bundle = object = new Bundle();
        Jp jp = new Jp();
        this.data = jp;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            object.putString("google.to", string2);
            return;
        }
        string2 = kp1_0.c("Invalid to: ", string2);
        super(string2);
        throw object;
    }

    public RemoteMessage$Builder addData(String string2, String string3) {
        this.data.put(string2, string3);
        return this;
    }

    public RemoteMessage build() {
        boolean bl2;
        Bundle bundle = new Bundle();
        Object object = this.data.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = object.next();
            String string2 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            bundle.putString(string2, (String)object2);
        }
        object = this.bundle;
        bundle.putAll(object);
        this.bundle.remove("from");
        object = new RemoteMessage(bundle);
        return object;
    }

    public RemoteMessage$Builder clearData() {
        this.data.clear();
        return this;
    }

    public String getCollapseKey() {
        return this.bundle.getString("collapse_key");
    }

    public Map getData() {
        return this.data;
    }

    public String getMessageId() {
        return this.bundle.getString("google.message_id", "");
    }

    public String getMessageType() {
        return this.bundle.getString("message_type");
    }

    public int getTtl() {
        return Integer.parseInt(this.bundle.getString("google.ttl", "0"));
    }

    public RemoteMessage$Builder setCollapseKey(String string2) {
        this.bundle.putString("collapse_key", string2);
        return this;
    }

    public RemoteMessage$Builder setData(Map map2) {
        this.data.clear();
        this.data.putAll(map2);
        return this;
    }

    public RemoteMessage$Builder setMessageId(String string2) {
        this.bundle.putString("google.message_id", string2);
        return this;
    }

    public RemoteMessage$Builder setMessageType(String string2) {
        this.bundle.putString("message_type", string2);
        return this;
    }

    public RemoteMessage$Builder setRawData(byte[] byArray) {
        this.bundle.putByteArray("rawData", byArray);
        return this;
    }

    public RemoteMessage$Builder setTtl(int n3) {
        Bundle bundle = this.bundle;
        String string2 = String.valueOf(n3);
        bundle.putString("google.ttl", string2);
        return this;
    }
}

