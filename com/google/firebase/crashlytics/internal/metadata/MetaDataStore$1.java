/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.firebase.crashlytics.internal.metadata;

import org.json.JSONObject;

class MetaDataStore$1
extends JSONObject {
    final /* synthetic */ String val$userId;

    public MetaDataStore$1(String string2) {
        this.val$userId = string2;
        this.put("userId", string2);
    }
}

