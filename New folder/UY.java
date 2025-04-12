/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo$Builder
 *  android.graphics.ColorSpace$Named
 */
import android.app.job.JobInfo;
import android.graphics.ColorSpace;

public final class UY {
    public static /* bridge */ /* synthetic */ ColorSpace.Named a() {
        return ColorSpace.Named.EXTENDED_SRGB;
    }

    public static /* bridge */ /* synthetic */ void b(JobInfo.Builder builder, boolean bl2) {
        builder.setRequiresStorageNotLow(bl2);
    }
}

