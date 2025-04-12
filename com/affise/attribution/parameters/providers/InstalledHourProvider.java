/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.affise.attribution.parameters.providers;

import android.content.Context;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.parameters.base.LongPropertyProvider;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

public final class InstalledHourProvider
extends LongPropertyProvider {
    private final Context context;
    private final ProviderType key;
    private final float order;

    public InstalledHourProvider(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        this.context = object;
        this.order = 8.0f;
        object = ProviderType.INSTALLED_HOUR;
        this.key = object;
    }

    private final long stripTimestampToHours(long l2) {
        Calendar calendar = Calendar.getInstance();
        Date date = new Date(l2);
        calendar.setTime(date);
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        return calendar.getTimeInMillis();
    }

    public ProviderType getKey() {
        return this.key;
    }

    public float getOrder() {
        return this.order;
    }

    public Long provide() {
        Object object = this.context.getPackageManager();
        String string2 = this.context.getPackageName();
        if ((object = object.getPackageInfo(string2, 0)) != null) {
            long l2 = object.firstInstallTime;
            l2 = this.stripTimestampToHours(l2);
            object = l2;
        } else {
            object = null;
        }
        return object;
    }
}

