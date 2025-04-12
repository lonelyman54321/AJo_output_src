/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.Clock;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class Utils {
    private static final Pattern API_KEY_FORMAT;
    private static final String APP_ID_IDENTIFICATION_SUBSTRING = ":";
    public static final long AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS;
    private static Utils singleton;
    private final Clock clock;

    static {
        AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = TimeUnit.HOURS.toSeconds(1L);
        API_KEY_FORMAT = Pattern.compile("\\AA[\\w-]{38}\\z");
    }

    private Utils(Clock clock) {
        this.clock = clock;
    }

    public static Utils getInstance() {
        return Utils.getInstance(SystemClock.getInstance());
    }

    public static Utils getInstance(Clock clock) {
        Utils utils = singleton;
        if (utils == null) {
            singleton = utils = new Utils(clock);
        }
        return singleton;
    }

    public static boolean isValidApiKeyFormat(String string2) {
        return API_KEY_FORMAT.matcher(string2).matches();
    }

    public static boolean isValidAppIdFormat(String string2) {
        return string2.contains(APP_ID_IDENTIFICATION_SUBSTRING);
    }

    public long currentTimeInMillis() {
        return this.clock.currentTimeMillis();
    }

    public long currentTimeInSecs() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long l2 = this.currentTimeInMillis();
        return timeUnit.toSeconds(l2);
    }

    public long getRandomDelayForSyncPrevention() {
        return (long)(Math.random() * 1000.0);
    }

    public boolean isAuthTokenExpired(PersistedInstallationEntry persistedInstallationEntry) {
        String string2 = persistedInstallationEntry.getAuthToken();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        boolean bl3 = true;
        if (bl2) {
            return bl3;
        }
        long l2 = persistedInstallationEntry.getTokenCreationEpochInSecs();
        long l3 = persistedInstallationEntry.getExpiresInSecs() + l2;
        l2 = this.currentTimeInSecs();
        long l4 = AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS;
        long l7 = l3 - (l2 += l4);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            return bl3;
        }
        return false;
    }
}

