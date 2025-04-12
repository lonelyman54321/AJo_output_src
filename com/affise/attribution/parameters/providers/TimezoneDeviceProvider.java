/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters.providers;

import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.StringPropertyProvider;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.text.StringsKt;

public final class TimezoneDeviceProvider
extends StringPropertyProvider {
    private final ProviderType key;
    private final float order;

    public TimezoneDeviceProvider() {
        ProviderType providerType;
        this.order = 51.0f;
        this.key = providerType = ProviderType.TIMEZONE_DEV;
    }

    private final String format(long l2) {
        String string2 = String.valueOf(Math.abs(l2));
        return StringsKt.T(2, string2);
    }

    private final String toOffsetStr(int n3) {
        long l2;
        Object object = TimeUnit.MILLISECONDS;
        long l3 = n3;
        long l4 = object.toMinutes(l3);
        long l7 = l4 - (l2 = 0L);
        String string2 = (n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1))) < 0 ? "-" : "+";
        l2 = 60;
        long l8 = l4 / l2;
        String string3 = this.format(l8);
        object = this.format(l4 %= l2);
        return UX.c("UTC", string2, string3, (String)object);
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public String provide() {
        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = calendar.getTimeZone();
        long l2 = calendar.getTimeInMillis();
        int n3 = timeZone.getOffset(l2);
        return this.toOffsetStr(n3);
    }
}

