/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.property;

import com.affise.attribution.events.EventName;
import com.affise.attribution.events.property.AffiseProperty;
import com.affise.attribution.utils.ToSnakeCaseKt;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseEventUtilsKt {
    private static final String PROPERTY_PREFIX = "affise_event";

    public static final String toAffiseEventProperty(EventName object, AffiseProperty object2) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object2, "property");
        object = object.getEventName();
        object2 = object2.getType();
        return AffiseEventUtilsKt.toAffiseEventProperty((String)object, (String)object2);
    }

    public static final String toAffiseEventProperty(String string2, String string3) {
        if (string2 == null || (string2 = ToSnakeCaseKt.toSnakeCase(string2)) == null) {
            string2 = "NAME";
        }
        String string4 = "affise_event_";
        if (string3 != null) {
            StringBuilder stringBuilder = new StringBuilder(string4);
            stringBuilder.append(string2);
            stringBuilder.append('_');
            stringBuilder.append(string3);
            return stringBuilder.toString();
        }
        return string4.concat(string2);
    }

    public static /* synthetic */ String toAffiseEventProperty$default(String string2, String string3, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string3 = null;
        }
        return AffiseEventUtilsKt.toAffiseEventProperty(string2, string3);
    }
}

