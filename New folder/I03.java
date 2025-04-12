/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute;
import java.util.Comparator;

public final class I03
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (CrashlyticsReport$CustomAttribute)object;
        object2 = (CrashlyticsReport$CustomAttribute)object2;
        return SessionReportingCoordinator.c((CrashlyticsReport$CustomAttribute)object, (CrashlyticsReport$CustomAttribute)object2);
    }
}

