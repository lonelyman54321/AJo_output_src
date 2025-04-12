/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.os.Bundle
 */
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger$b;
import com.facebook.appevents.f;
import com.facebook.appevents.g;
import com.facebook.appevents.g$a;
import com.facebook.j;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;

public final class v03 {
    public static final v03 a;
    public static final String b;
    public static final long[] c;

    static {
        Object object = new v03();
        a = object;
        b = v03.class.getCanonicalName();
        Object object2 = object = (Object)new long[19];
        object2[0] = 300000L;
        object2[1] = 900000L;
        object2[2] = 1800000L;
        object2[3] = 3600000L;
        object2[4] = 21600000L;
        object2[5] = 43200000L;
        object2[6] = 86400000L;
        object2[7] = 172800000L;
        object2[8] = 259200000L;
        object2[9] = 604800000L;
        object2[10] = 1209600000L;
        object2[11] = 1814400000L;
        object2[12] = 2419200000L;
        object2[13] = 5184000000L;
        object2[14] = 7776000000L;
        object2[15] = 10368000000L;
        object2[16] = 12960000000L;
        object2[17] = 15552000000L;
        object2[18] = 31536000000L;
        c = (long[])object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(Context object, String object2, String object3) {
        AppEventsLogger$b appEventsLogger$b;
        void var2_11;
        String string2 = "activityName";
        Class<v03> clazz = v03.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return;
        }
        Intrinsics.checkNotNullParameter(object2, string2);
        String string3 = "context";
        Intrinsics.checkNotNullParameter(object, string3);
        string3 = "Unclassified";
        Bundle bundle = new Bundle();
        Object object4 = "fb_mobile_launch_source";
        bundle.putString((String)object4, string3);
        string3 = "fb_mobile_pckg_fp";
        object4 = a;
        object4 = ((v03)object4).a((Context)object);
        bundle.putString(string3, (String)object4);
        string3 = "fb_mobile_app_cert_hash";
        object = or_1.a((Context)object);
        bundle.putString(string3, (String)object);
        Intrinsics.checkNotNullParameter(object2, string2);
        Intrinsics.checkNotNullParameter(object2, string2);
        object = new g((String)object2, (String)var2_11);
        String string4 = "loggerImpl";
        Intrinsics.checkNotNullParameter(object, string4);
        FacebookSdk facebookSdk = FacebookSdk.a;
        boolean bl3 = j.c();
        if (bl3) {
            String string5 = "fb_mobile_activate_app";
            ((g)object).e(string5, bundle);
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = g.c;
        AppEventsLogger$b appEventsLogger$b2 = g$a.d();
        if (appEventsLogger$b2 == (appEventsLogger$b = AppEventsLogger$b.EXPLICIT_ONLY)) return;
        {
            block8: {
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                    return;
                }
                {
                    bl3 = td0.b(object);
                    if (!bl3) break block8;
                    return;
                }
            }
            try {
                gt0_0 gt0_02 = gt0_0.EXPLICIT;
                f.c(gt0_02);
                return;
            }
            catch (Throwable throwable) {}
            {
                td0.a(object, throwable);
                return;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public static final void d(String var0, t03 var1_1, String var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 102->107)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String a(Context object) {
        CharSequence charSequence;
        String string2;
        Object object2;
        String string3 = "PCKGCHKSUM;";
        boolean bl2 = td0.b(this);
        CharSequence charSequence2 = null;
        if (bl2) {
            return null;
        }
        try {
            int n3;
            int n4;
            object2 = object.getPackageManager();
            string2 = object.getPackageName();
            string2 = object2.getPackageInfo(string2, 0);
            string2 = ((PackageInfo)string2).versionName;
            charSequence = new StringBuilder(string3);
            ((StringBuilder)charSequence).append(string2);
            string3 = ((StringBuilder)charSequence).toString();
            string2 = "com.facebook.sdk.appEventPreferences";
            string2 = object.getSharedPreferences(string2, 0);
            charSequence = string2.getString(string3, null);
            if (charSequence != null && (n4 = ((String)charSequence).length()) == (n3 = 32)) {
                return charSequence;
            }
        }
        catch (Throwable throwable222) {
        }
        charSequence = t31_0.b(object);
        if (charSequence == null) {
            object = object.getPackageName();
            object = object2.getApplicationInfo((String)object, 0);
            object2 = "pm.getApplicationInfo(context.packageName, 0)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = object.sourceDir;
            charSequence = t31_0.a((String)object);
        }
        object = string2.edit();
        object = object.putString(string3, (String)charSequence);
        object.apply();
        return charSequence;
        catch (Exception exception) {
            return charSequence2;
        }
        td0.a(this, throwable222);
        return charSequence2;
    }

    public final void c() {
        Object object;
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        try {
            object = sx1.d;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return;
        }
        object = Ax1.APP_EVENTS;
        String string2 = b;
        Intrinsics.checkNotNull(string2);
        String string3 = "Clock skew detected";
        sx1$a.a((Ax1)((Object)object), string2, string3);
    }
}

