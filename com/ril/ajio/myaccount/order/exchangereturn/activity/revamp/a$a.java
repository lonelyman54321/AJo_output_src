/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.myaccount.order.exchangereturn.activity.revamp;

import android.os.Bundle;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.a;
import java.io.Serializable;

public final class a$a {
    public static a a(boolean bl2, boolean bl3) {
        a a2 = new a();
        Bundle bundle = new Bundle();
        Boolean bl4 = bl2;
        bundle.putSerializable("IS_END_RETURN", (Serializable)bl4);
        bl4 = bl3;
        bundle.putSerializable("IS_DELETE", (Serializable)bl4);
        a2.setArguments(bundle);
        return a2;
    }
}

