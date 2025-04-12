/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.Destination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.send.ReportQueue;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.nio.charset.Charset;

public class DataTransportCrashlyticsReportSender {
    private static final String CRASHLYTICS_API_KEY;
    private static final String CRASHLYTICS_ENDPOINT;
    private static final String CRASHLYTICS_TRANSPORT_NAME = "FIREBASE_CRASHLYTICS_REPORT";
    private static final Transformer DEFAULT_TRANSFORM;
    private static final CrashlyticsReportJsonTransform TRANSFORM;
    private final ReportQueue reportQueue;
    private final Transformer transportTransform;

    static {
        Object object = new CrashlyticsReportJsonTransform();
        TRANSFORM = object;
        CRASHLYTICS_ENDPOINT = DataTransportCrashlyticsReportSender.mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
        CRASHLYTICS_API_KEY = DataTransportCrashlyticsReportSender.mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
        DEFAULT_TRANSFORM = object = new Object();
    }

    public DataTransportCrashlyticsReportSender(ReportQueue reportQueue, Transformer transformer) {
        this.reportQueue = reportQueue;
        this.transportTransform = transformer;
    }

    public static /* synthetic */ byte[] a(CrashlyticsReport crashlyticsReport) {
        return DataTransportCrashlyticsReportSender.lambda$static$0(crashlyticsReport);
    }

    public static DataTransportCrashlyticsReportSender create(Context object, SettingsProvider object2, OnDemandCounter onDemandCounter) {
        TransportRuntime.initialize((Context)object);
        object = TransportRuntime.getInstance();
        Object object3 = CRASHLYTICS_ENDPOINT;
        String string2 = CRASHLYTICS_API_KEY;
        Object object4 = new CCTDestination((String)object3, string2);
        object = ((TransportRuntime)object).newFactory((Destination)object4);
        object4 = Encoding.of("json");
        object3 = DEFAULT_TRANSFORM;
        object = object.getTransport(CRASHLYTICS_TRANSPORT_NAME, CrashlyticsReport.class, (Encoding)object4, (Transformer)object3);
        object2 = object2.getSettingsSync();
        object4 = new ReportQueue((Transport)object, (Settings)object2, onDemandCounter);
        object = new DataTransportCrashlyticsReportSender((ReportQueue)object4, (Transformer)object3);
        return object;
    }

    private static /* synthetic */ byte[] lambda$static$0(CrashlyticsReport object) {
        object = TRANSFORM.reportToJson((CrashlyticsReport)object);
        Charset charset = Charset.forName("UTF-8");
        return ((String)object).getBytes(charset);
    }

    private static String mergeStrings(String object, String string2) {
        int n3 = ((String)object).length();
        int n4 = string2.length();
        if ((n3 -= n4) >= 0 && n3 <= (n4 = 1)) {
            char c2;
            n4 = ((String)object).length();
            int c22 = string2.length() + n4;
            StringBuilder stringBuilder = new StringBuilder(c22);
            for (n4 = 0; n4 < (c2 = ((String)object).length()); ++n4) {
                c2 = ((String)object).charAt(n4);
                stringBuilder.append(c2);
                c2 = string2.length();
                if (c2 <= n4) continue;
                c2 = string2.charAt(n4);
                stringBuilder.append(c2);
            }
            return stringBuilder.toString();
        }
        object = new IllegalArgumentException("Invalid input received");
        throw object;
    }

    public Task enqueueReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean bl2) {
        return this.reportQueue.enqueueReport(crashlyticsReportWithSessionId, bl2).getTask();
    }
}

