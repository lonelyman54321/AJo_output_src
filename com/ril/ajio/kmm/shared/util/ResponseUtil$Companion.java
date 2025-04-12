/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.util;

import com.ril.ajio.kmm.shared.util.CMSResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ResponseUtil$Companion {
    private ResponseUtil$Companion() {
    }

    public /* synthetic */ ResponseUtil$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isValidResponse(CMSResponse cMSResponse) {
        String string2 = "cmsResponse";
        Intrinsics.checkNotNullParameter(cMSResponse, string2);
        boolean bl2 = cMSResponse.isNewData();
        if (bl2) {
            cMSResponse.setNewData(false);
            return true;
        }
        return false;
    }
}

