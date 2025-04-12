/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event;

public final class H03
implements Runnable {
    public final /* synthetic */ SessionReportingCoordinator a;
    public final /* synthetic */ CrashlyticsReport.Session.Event b;
    public final /* synthetic */ EventMetadata c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ H03(SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsReport.Session.Event event, EventMetadata eventMetadata, boolean bl2) {
        this.a = sessionReportingCoordinator;
        this.b = event;
        this.c = eventMetadata;
        this.d = bl2;
    }

    public final void run() {
        EventMetadata eventMetadata = this.c;
        boolean bl2 = this.d;
        SessionReportingCoordinator sessionReportingCoordinator = this.a;
        CrashlyticsReport.Session.Event event = this.b;
        SessionReportingCoordinator.a(sessionReportingCoordinator, event, eventMetadata, bl2);
    }
}

