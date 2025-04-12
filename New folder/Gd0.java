/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FilenameFilter;

public final class Gd0
implements FilenameFilter {
    public final boolean accept(File file, String string2) {
        return CrashlyticsReportPersistence.a(file, string2);
    }
}

