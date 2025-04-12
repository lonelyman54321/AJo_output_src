/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import com.facebook.FacebookSdk;
import com.facebook.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONArray;

public final class sC0 {
    public static boolean a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(Throwable object) {
        boolean bl2 = a;
        if (!bl2) return;
        if (object == null) {
            return;
        }
        Object object2 = new HashSet();
        object = ((Throwable)object).getStackTrace();
        Object object3 = "e.stackTrace";
        Intrinsics.checkNotNullExpressionValue(object, object3);
        int n3 = ((StackTraceElement[])object).length;
        String string2 = null;
        int n4 = 0;
        while (true) {
            kJ0$b kJ0$b;
            Object object4;
            if (n4 >= n3) {
                object = FacebookSdk.a;
                boolean bl3 = j.c();
                if (!bl3) return;
                bl3 = ((HashSet)object2).isEmpty() ^ true;
                if (!bl3) return;
                object = new JSONArray(object2);
                Intrinsics.checkNotNullParameter(object, "features");
                object2 = new Object();
                object3 = Di1$b.Analysis;
                ((Di1)object2).b = object3;
                long l2 = System.currentTimeMillis();
                n4 = 1000;
                long l3 = n4;
                object3 = l2 /= l3;
                ((Di1)object2).g = object3;
                ((Di1)object2).c = object;
                string2 = "analysis_log_";
                object = new StringBuffer(string2);
                object3 = String.valueOf(object3);
                ((StringBuffer)object).append((String)object3);
                ((StringBuffer)object).append(".json");
                object = ((StringBuffer)object).toString();
                object3 = "StringBuffer()\n         \u2026)\n            .toString()";
                Intrinsics.checkNotNullExpressionValue(object, object3);
                ((Di1)object2).a = object;
                ((Di1)object2).b();
                return;
            }
            Object object5 = object[n4].getClassName();
            Intrinsics.checkNotNullExpressionValue(object5, "it.className");
            Object object6 = kj0_0.a;
            Intrinsics.checkNotNullParameter(object5, "className");
            object6 = kj0_0.a;
            synchronized (object6) {
                object4 = kj0_0.b;
                boolean bl4 = ((HashMap)object4).isEmpty();
                if (!bl4) {
                } else {
                    kJ0$b = kJ0$b.AAM;
                    Object object7 = "com.facebook.appevents.aam.";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.CodelessEvents;
                    object7 = "com.facebook.appevents.codeless.";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.CloudBridge;
                    object7 = "com.facebook.appevents.cloudbridge.";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.ErrorReport;
                    object7 = "com.facebook.internal.instrument.errorreport.";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.AnrReport;
                    object7 = "com.facebook.internal.instrument.anrreport.";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.PrivacyProtection;
                    object7 = "com.facebook.appevents.ml.";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.SuggestedEvents;
                    object7 = "com.facebook.appevents.suggestedevents.";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.RestrictiveDataFiltering;
                    object7 = "com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.IntelligentIntegrity;
                    object7 = "com.facebook.appevents.integrity.IntegrityManager";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.ProtectedMode;
                    object7 = "com.facebook.appevents.integrity.ProtectedModeManager";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.MACARuleMatching;
                    object7 = "com.facebook.appevents.integrity.MACARuleMatchingManager";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.BlocklistEvents;
                    object7 = "com.facebook.appevents.integrity.BlocklistEventsManager";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.FilterRedactedEvents;
                    object7 = "com.facebook.appevents.integrity.RedactedEventsManager";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.FilterSensitiveParams;
                    object7 = "com.facebook.appevents.integrity.SensitiveParamsManager";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.EventDeactivation;
                    object7 = "com.facebook.appevents.eventdeactivation.";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.OnDeviceEventProcessing;
                    object7 = "com.facebook.appevents.ondeviceprocessing.";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.IapLogging;
                    object7 = "com.facebook.appevents.iap.";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.Monitoring;
                    object7 = "com.facebook.internal.logging.monitor";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.GPSARATriggers;
                    object7 = "com.facebook.appevents.gps.ara.GpsARAManager";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                    kJ0$b = kJ0$b.GPSPACAProcessing;
                    object7 = "com.facebook.appevents.gps.pa.PACustomAudienceClient";
                    object7 = new String[]{object7};
                    ((HashMap)object4).put(kJ0$b, object7);
                }
            }
            object6 = ((HashMap)object4).entrySet().iterator();
            block5: while (true) {
                boolean bl5;
                if (!(bl5 = object6.hasNext())) {
                    kJ0$b = kJ0$b.Unknown;
                    break;
                }
                object4 = (Map.Entry)object6.next();
                kJ0$b = (kJ0$b)((Object)object4.getKey());
                object4 = (String[])object4.getValue();
                int n7 = ((String[])object4).length;
                int n8 = 0;
                while (true) {
                    if (n8 >= n7) continue block5;
                    String string3 = object4[n8];
                    boolean bl6 = b.s(object5, string3, false);
                    if (bl6) break block5;
                    ++n8;
                }
                break;
            }
            object5 = kJ0$b.Unknown;
            if (kJ0$b != object5) {
                Intrinsics.checkNotNullParameter((Object)kJ0$b, "feature");
                object5 = FacebookSdk.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit();
                object6 = kJ0$b.toKey();
                object4 = "18.0.2";
                object5.putString((String)object6, (String)object4).apply();
                object5 = kJ0$b.toString();
                ((HashSet)object2).add(object5);
            }
            ++n4;
        }
    }
}

