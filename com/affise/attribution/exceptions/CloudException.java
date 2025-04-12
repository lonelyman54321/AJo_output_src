/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.exceptions;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CloudException
extends Throwable {
    private final int attempts;
    private final boolean retry;
    private final Throwable throwable;
    private final String url;

    public CloudException(String string2, Throwable throwable, int n3, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.url = string2;
        this.throwable = throwable;
        this.attempts = n3;
        this.retry = bl2;
    }

    public /* synthetic */ CloudException(String string2, Throwable throwable, int n3, boolean bl2, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 &= 8) != 0) {
            bl2 = false;
        }
        this(string2, throwable, n3, bl2);
    }

    public static /* synthetic */ CloudException copy$default(CloudException cloudException, String string2, Throwable throwable, int n3, boolean bl2, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = cloudException.url;
        }
        if ((n7 = n4 & 2) != 0) {
            throwable = cloudException.throwable;
        }
        if ((n7 = n4 & 4) != 0) {
            n3 = cloudException.attempts;
        }
        if ((n4 &= 8) != 0) {
            bl2 = cloudException.retry;
        }
        return cloudException.copy(string2, throwable, n3, bl2);
    }

    public final String component1() {
        return this.url;
    }

    public final Throwable component2() {
        return this.throwable;
    }

    public final int component3() {
        return this.attempts;
    }

    public final boolean component4() {
        return this.retry;
    }

    public final CloudException copy(String string2, Throwable throwable, int n3, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        CloudException cloudException = new CloudException(string2, throwable, n3, bl2);
        return cloudException;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof CloudException;
        if (n3 == 0) {
            return false;
        }
        object = (CloudException)object;
        Object object2 = this.url;
        Object object3 = ((CloudException)object).url;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.throwable;
        object3 = ((CloudException)object).throwable;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.attempts;
        int n4 = ((CloudException)object).attempts;
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.retry ? 1 : 0);
        int n7 = ((CloudException)object).retry;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int getAttempts() {
        return this.attempts;
    }

    public final boolean getRetry() {
        return this.retry;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String string2 = this.url;
        int n3 = string2.hashCode() * 31;
        Throwable throwable = this.throwable;
        int n4 = (throwable.hashCode() + n3) * 31;
        n3 = this.attempts;
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.retry ? 1 : 0);
        if (n3 != 0) {
            n3 = 1;
        }
        return n4 + n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CloudException(url=");
        Object object = this.url;
        stringBuilder.append((String)object);
        stringBuilder.append(", throwable=");
        object = this.throwable;
        stringBuilder.append(object);
        stringBuilder.append(", attempts=");
        int bl2 = this.attempts;
        stringBuilder.append(bl2);
        stringBuilder.append(", retry=");
        boolean bl3 = this.retry;
        return AR.a(stringBuilder, bl3, ')');
    }
}

