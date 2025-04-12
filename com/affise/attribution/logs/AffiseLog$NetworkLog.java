/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.logs;

import com.affise.attribution.logs.AffiseLog;
import com.affise.attribution.logs.AffiseLogType;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class AffiseLog$NetworkLog
extends AffiseLog {
    private final JSONObject jsonObject;

    public AffiseLog$NetworkLog(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        AffiseLogType affiseLogType = AffiseLogType.NETWORK;
        String string2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.toString()");
        super(affiseLogType, string2, null);
        this.jsonObject = jSONObject;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }
}

