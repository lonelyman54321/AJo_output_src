/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.entity;

import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SharedWithMe$Companion {
    private SharedWithMe$Companion() {
    }

    public /* synthetic */ SharedWithMe$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String prepareClosetSharingUrl(ArrayList object, long l2, String string2, String string3) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "selectedPositions");
        Intrinsics.checkNotNullParameter(string2, "uuid");
        Intrinsics.checkNotNullParameter(string3, "uname");
        StringBuilder stringBuilder = new StringBuilder();
        String string4 = UrlHelper.Companion.getInstance().getBaseUrl();
        stringBuilder.append(string4);
        stringBuilder.append("/sharedcloset?p=");
        object = ((ArrayList)object).iterator();
        string4 = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(object, string4);
        while (bl2 = object.hasNext()) {
            string4 = (String)object.next();
            stringBuilder.append(string4);
            bl2 = object.hasNext();
            if (!bl2) continue;
            string4 = ",";
            stringBuilder.append(string4);
        }
        fn0_2.b(stringBuilder, "&t=", l2, "&uu=");
        stringBuilder.append(string2);
        stringBuilder.append("&un=");
        stringBuilder.append(string3);
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }
}

