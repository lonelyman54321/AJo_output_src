/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.Iterator;

public final class Constants$MessagePayloadKeys {
    public static final String COLLAPSE_KEY = "collapse_key";
    public static final String DELIVERED_PRIORITY = "google.delivered_priority";
    public static final String FROM = "from";
    public static final String MESSAGE_TYPE = "message_type";
    public static final String MSGID = "google.message_id";
    public static final String MSGID_SERVER = "message_id";
    public static final String ORIGINAL_PRIORITY = "google.original_priority";
    public static final String PRIORITY_REDUCED_V19 = "google.priority_reduced";
    public static final String PRIORITY_V19 = "google.priority";
    public static final String PRODUCT_ID = "google.product_id";
    public static final String RAW_DATA = "rawData";
    public static final String RESERVED_CLIENT_LIB_PREFIX = "google.c.";
    public static final String RESERVED_PREFIX = "google.";
    public static final String SENDER_ID = "google.c.sender.id";
    public static final String SENT_TIME = "google.sent_time";
    public static final String TO = "google.to";
    public static final String TTL = "google.ttl";

    private Constants$MessagePayloadKeys() {
    }

    public static Jp extractDeveloperDefinedPayload(Bundle bundle) {
        boolean bl2;
        Jp jp = new Jp();
        Iterator iterator = bundle.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            Object object = bundle.get(string2);
            boolean bl3 = object instanceof String;
            if (!bl3) continue;
            object = (String)object;
            String string3 = RESERVED_PREFIX;
            bl3 = string2.startsWith(string3);
            if (bl3 || (bl3 = string2.startsWith(string3 = "gcm.")) || (bl3 = string2.equals(string3 = FROM)) || (bl3 = string2.equals(string3 = MESSAGE_TYPE)) || (bl3 = string2.equals(string3 = COLLAPSE_KEY))) continue;
            jp.put(string2, object);
        }
        return jp;
    }
}

