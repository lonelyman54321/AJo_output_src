/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  org.json.JSONArray
 */
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.FacebookSdk;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONArray;

public final class Di1$a {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Di1 a(String object, String charSequence) {
        Di1$b di1$b;
        Di1 di1 = new Object();
        di1.b = di1$b = Di1$b.AnrReport;
        lz3_0 lz3_02 = lz3_0.a;
        Context context = FacebookSdk.a();
        String string2 = null;
        if (context != null) {
            String string3 = context.getPackageName();
            try {
                PackageManager packageManager = context.getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo(string3, 0);
                if (packageInfo != null) {
                    string2 = packageInfo.versionName;
                }
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        }
        di1.d = string2;
        di1.e = object;
        di1.f = charSequence;
        long l2 = System.currentTimeMillis();
        long l3 = 1000;
        di1.g = object = Long.valueOf(l2 / l3);
        charSequence = new StringBuffer("anr_log_");
        object = String.valueOf(object);
        ((StringBuffer)charSequence).append((String)object);
        ((StringBuffer)charSequence).append(".json");
        object = ((StringBuffer)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(object, "StringBuffer()\n         \u2026)\n            .toString()");
        di1.a = object;
        return di1;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Di1 b(Throwable object, Di1$b object2) {
        void var4_10;
        String string2;
        Object object3;
        Di1 di1;
        block6: {
            Intrinsics.checkNotNullParameter(object2, "t");
            di1 = new Object();
            di1.b = object2;
            object3 = lz3_0.a;
            object3 = FacebookSdk.a();
            Object var4_5 = null;
            if (object3 != null) {
                string2 = object3.getPackageName();
                try {
                    object3 = object3.getPackageManager();
                    object3 = object3.getPackageInfo(string2, 0);
                    if (object3 == null) break block6;
                    object3 = ((PackageInfo)object3).versionName;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            }
        }
        object3 = null;
        di1.d = object3;
        object3 = object == null ? null : ((object3 = ((Throwable)object).getCause()) == null ? ((Throwable)object).toString() : String.valueOf(((Throwable)object).getCause()));
        di1.e = object3;
        if (object != null) {
            void var4_6;
            object3 = new JSONArray();
            while (object != null && object != var4_6) {
                StackTraceElement[] stackTraceElementArray = ((Throwable)object).getStackTrace();
                string2 = "t.stackTrace";
                Intrinsics.checkNotNullExpressionValue(stackTraceElementArray, string2);
                int n3 = stackTraceElementArray.length;
                for (int i3 = 0; i3 < n3; ++i3) {
                    String string3 = stackTraceElementArray[i3].toString();
                    object3.put((Object)string3);
                }
                Throwable throwable = ((Throwable)object).getCause();
                Object object4 = object;
                object = throwable;
            }
            String string4 = object3.toString();
        }
        di1.f = var4_10;
        long l2 = System.currentTimeMillis();
        long l3 = 1000;
        di1.g = object = Long.valueOf(l2 / l3);
        object3 = new StringBuffer();
        String string5 = ((Di1$b)((Object)object2)).getLogPrefix();
        ((StringBuffer)object3).append(string5);
        object = String.valueOf(object);
        ((StringBuffer)object3).append((String)object);
        ((StringBuffer)object3).append(".json");
        object = ((StringBuffer)object3).toString();
        Intrinsics.checkNotNullExpressionValue(object, "StringBuffer().append(t.\u2026ppend(\".json\").toString()");
        di1.a = object;
        return di1;
    }

    public static final Di1 c(File object) {
        Intrinsics.checkNotNullParameter(object, "file");
        Di1 di1 = new Object();
        object = ((File)object).getName();
        Intrinsics.checkNotNullExpressionValue(object, "file.name");
        di1.a = object;
        Object object2 = "crash_log_";
        boolean bl2 = b.s((String)object, object2, false);
        object2 = bl2 ? Di1$b.CrashReport : ((bl2 = b.s((String)object, object2 = "shield_log_", false)) ? Di1$b.CrashShield : ((bl2 = b.s((String)object, object2 = "thread_check_log_", false)) ? Di1$b.ThreadCheck : ((bl2 = b.s((String)object, object2 = "analysis_log_", false)) ? Di1$b.Analysis : ((bl2 = b.s((String)object, object2 = "anr_log_", false)) ? Di1$b.AnrReport : Di1$b.Unknown))));
        di1.b = object2;
        object = ii1_0.e((String)object);
        if (object != null) {
            long l2 = 0L;
            long l3 = object.optLong("timestamp", l2);
            object2 = l3;
            di1.g = object2;
            di1.d = object2 = object.optString("app_version", null);
            di1.e = object2 = object.optString("reason", null);
            di1.f = object2 = object.optString("callstack", null);
            object2 = "feature_names";
            object = object.optJSONArray(object2);
            di1.c = object;
        }
        return di1;
    }
}

