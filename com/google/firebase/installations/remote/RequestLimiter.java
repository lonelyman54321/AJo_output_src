/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations.remote;

import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;

class RequestLimiter {
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS = TimeUnit.HOURS.toMillis(24);
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS = TimeUnit.MINUTES.toMillis(30);
    private int attemptCount;
    private long nextRequestTime;
    private final Utils utils;

    public RequestLimiter() {
        Utils utils;
        this.utils = utils = Utils.getInstance();
    }

    public RequestLimiter(Utils utils) {
        this.utils = utils;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private long getBackoffDuration(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                try {
                    n3 = (int)(RequestLimiter.isRetryableError(n3) ? 1 : 0);
                    if (n3 == 0) {
                        return MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                {
                    n3 = this.attemptCount;
                }
                double d2 = n3;
                long l2 = 0x4000000000000000L;
                double d5 = 2.0;
                {
                    d2 = Math.pow(d5, d2);
                    Utils utils = this.utils;
                    l2 = utils.getRandomDelayForSyncPrevention();
                }
                d5 = l2;
                d2 += d5;
                {
                    l2 = MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS;
                    d5 = l2;
                    return (long)Math.min(d2, d5);
                }
            }
            throw throwable2;
        }
    }

    private static boolean isRetryableError(int n3) {
        int n4 = 429;
        n3 = n3 != n4 && (n3 < (n4 = 500) || n3 >= (n4 = 600)) ? 0 : 1;
        return n3 != 0;
    }

    private static boolean isSuccessfulOrRequiresNewFidCreation(int n3) {
        int n4 = 200;
        n3 = (n3 < n4 || n3 >= (n4 = 300)) && n3 != (n4 = 401) && n3 != (n4 = 404) ? 0 : 1;
        return n3 != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void resetBackoffStrategy() {
        synchronized (this) {
            Object var1_1 = null;
            this.attemptCount = 0;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isRequestAllowed() {
        synchronized (this) {
            try {
                long l2;
                boolean bl2 = this.attemptCount;
                if (!bl2) return true;
                Utils utils = this.utils;
                long l3 = utils.currentTimeInMillis();
                long l4 = l3 - (l2 = this.nextRequestTime);
                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object <= 0) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setNextRequestTime(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                long l2;
                int n4;
                try {
                    n4 = RequestLimiter.isSuccessfulOrRequiresNewFidCreation(n3);
                    if (n4 != 0) {
                        this.resetBackoffStrategy();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                this.attemptCount = n4 = this.attemptCount + 1;
                long l3 = this.getBackoffDuration(n3);
                Utils utils = this.utils;
                this.nextRequestTime = l2 = utils.currentTimeInMillis() + l3;
                return;
            }
            throw throwable2;
        }
    }
}

