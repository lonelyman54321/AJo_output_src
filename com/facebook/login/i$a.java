/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.facebook.login;

import android.os.Bundle;
import com.facebook.login.i;
import java.util.concurrent.ScheduledExecutorService;

public final class i$a {
    public static final Bundle a(String string2) {
        ScheduledExecutorService scheduledExecutorService = i.d;
        scheduledExecutorService = new Bundle();
        long l2 = System.currentTimeMillis();
        scheduledExecutorService.putLong("1_timestamp_ms", l2);
        scheduledExecutorService.putString("0_auth_logger_id", string2);
        String string3 = "";
        scheduledExecutorService.putString("3_method", string3);
        scheduledExecutorService.putString("2_result", string3);
        scheduledExecutorService.putString("5_error_message", string3);
        scheduledExecutorService.putString("4_error_code", string3);
        scheduledExecutorService.putString("6_extras", string3);
        return scheduledExecutorService;
    }
}

