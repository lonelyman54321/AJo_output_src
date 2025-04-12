/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.Comparator;

public final class Id0
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (File)object;
        object2 = (File)object2;
        return CrashlyticsReportPersistence.c((File)object, (File)object2);
    }
}

