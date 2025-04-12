/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.converter;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.referrer.AffiseReferrerData;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class StringToAffiseReferrerDataConverter
implements Converter {
    private final LogsManager logsManager;

    public StringToAffiseReferrerDataConverter(LogsManager logsManager2) {
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        this.logsManager = logsManager2;
    }

    public AffiseReferrerData convert(String object) {
        Object object2 = "from";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = new JSONObject((String)object);
        Object object3 = "installReferrer";
        String string2 = object2.getString((String)object3);
        object3 = "j.getString(AffiseReferr\u2026ata.KEYS.installReferrer)";
        Intrinsics.checkNotNullExpressionValue(string2, (String)object3);
        object3 = "referrerClickTimestampSeconds";
        long l2 = object2.getLong((String)object3);
        object3 = "installBeginTimestampSeconds";
        long l3 = object2.getLong((String)object3);
        object3 = "referrerClickTimestampServerSeconds";
        long l4 = object2.getLong((String)object3);
        object3 = "installBeginTimestampServerSeconds";
        long l7 = object2.getLong((String)object3);
        object3 = "installVersion";
        String string3 = object2.getString((String)object3);
        object3 = "j.getString(AffiseReferr\u2026Data.KEYS.installVersion)";
        Intrinsics.checkNotNullExpressionValue(string3, (String)object3);
        object3 = "googlePlayInstantParam";
        boolean bl2 = object2.getBoolean((String)object3);
        object3 = object;
        try {
            object = new AffiseReferrerData(string2, l2, l3, l4, l7, string3, bl2);
        }
        catch (Exception exception) {
            object2 = this.logsManager;
            object2.addSdkError(exception);
            object = null;
        }
        return object;
    }
}

