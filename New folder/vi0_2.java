/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.datatransport.Transformer;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;

/*
 * Renamed from vi0
 */
public final class vi0_2
implements Transformer {
    public final Object apply(Object object) {
        return DataTransportCrashlyticsReportSender.a((CrashlyticsReport)object);
    }
}

