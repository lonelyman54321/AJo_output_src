/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo$Builder
 *  android.graphics.ColorSpace$Named
 */
import android.app.job.JobInfo;
import android.graphics.ColorSpace;

public final class TY {
    public static /* bridge */ /* synthetic */ ColorSpace.Named a() {
        return ColorSpace.Named.DISPLAY_P3;
    }

    public static /* bridge */ /* synthetic */ void b(JobInfo.Builder builder, boolean bl2) {
        builder.setRequiresBatteryNotLow(bl2);
    }
}

