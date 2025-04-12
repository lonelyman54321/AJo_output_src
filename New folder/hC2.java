/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.app.Notification
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.sqlite.SQLiteException
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Process
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.R$string;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.pushnotification.work.CTFlushPushImpressionsWork;
import com.clevertap.android.sdk.task.a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class hC2
implements di_1 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final we d;
    public final Nh0 e;
    public final CleverTapInstanceConfig f;
    public final Context g;
    public final mi_1 h;
    public ec1_1 i;
    public final ea3_1 j;
    public final Object k;
    public final Object l;

    public hC2(Context object, CleverTapInstanceConfig object2, Nh0 nh0, ea3_1 ea3_12, we we2, mi_1 mi_12) {
        Object object3 = new ArrayList();
        this.a = object3;
        new ArrayList();
        object3 = new ArrayList();
        this.b = object3;
        object3 = new ArrayList();
        this.c = object3;
        this.i = object3 = new Object();
        this.k = object3 = new Object();
        this.l = object3 = new Object();
        this.g = object;
        this.f = object2;
        this.e = nh0;
        this.j = ea3_12;
        this.d = we2;
        this.h = mi_12;
        object = jh_1.a((CleverTapInstanceConfig)object2).b();
        object2 = new fC2(this);
        ((a)object).c("createOrResetWorker", (Callable)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(hC2 hC22, boolean bl2) {
        Object object = hC22;
        Object object2 = "Pushamp - Finished scheduling periodic work request - ";
        int n3 = Build.VERSION.SDK_INT;
        Object object3 = hC22.f;
        int n4 = 26;
        if (n3 < n4) {
            ((CleverTapInstanceConfig)object3).b().getClass();
            object = "Pushamp feature is not supported below Oreo";
            com.clevertap.android.sdk.b.f((String)object);
            return;
        }
        Context context = hC22.g;
        String string2 = "pfworkid";
        String string3 = "";
        String string4 = gc3_0.g(context, string2, string3);
        String string5 = "pf";
        int n7 = gc3_0.b(context, 240, string5);
        boolean bl3 = string4.equals(string3);
        if (bl3 && n7 <= 0) {
            ((CleverTapInstanceConfig)object3).b().getClass();
            object = "Pushamp - There is no running work and nothing to create";
            com.clevertap.android.sdk.b.f((String)object);
            return;
        }
        if (n7 <= 0) {
            ((CleverTapInstanceConfig)object3).b().getClass();
            object2 = "Pushamp - Cancelling worker as pingFrequency <=0 ";
            com.clevertap.android.sdk.b.f((String)object2);
            hC22.h();
            return;
        }
        object = "context";
        try {
            Intrinsics.checkNotNullParameter(context, (String)object);
            object = ni3_1.i(context);
            Object object4 = "getInstance(context)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object4);
            bl3 = string4.equals(string3);
            if (!bl3) {
                if (!bl2) return;
            }
            object4 = lV1.NOT_REQUIRED;
            object4 = new LinkedHashSet();
            Enum enum_ = lV1.CONNECTED;
            Object object5 = "networkType";
            Intrinsics.checkNotNullParameter(enum_, (String)object5);
            int n8 = 0;
            object5 = null;
            dv1_0 dv1_02 = new dv1_0(null);
            n8 = 24;
            Set set = n3 >= n8 ? CollectionsKt.o0((Iterable)object4) : vz0_2.a;
            Set set2 = set;
            long l2 = -1;
            boolean bl4 = true;
            object5 = set;
            set = new b60(dv1_02, (lV1)enum_, false, false, bl4, false, l2, l2, set2);
            long l3 = n7;
            enum_ = TimeUnit.MINUTES;
            object4 = new Hq2$a(l3, (TimeUnit)enum_, (TimeUnit)enum_);
            set = ((CI3$a)object4).d((b60)((Object)set));
            set = (Hq2$a)((Object)set);
            set = ((CI3$a)((Object)set)).a();
            set = (hq2_0)((Object)set);
            boolean bl5 = string4.equals(string3);
            if (bl5) {
                string4 = ((CleverTapInstanceConfig)object3).a;
            }
            CE0 cE0 = CE0.REPLACE;
            ((ni3_1)object).g(string4, cE0, (hq2_0)((Object)set));
            gc3_0.k(context, string2, string4);
            object = ((CleverTapInstanceConfig)object3).b();
            set = new StringBuilder((String)object2);
            ((StringBuilder)((Object)set)).append(string4);
            object2 = " with repeatInterval- ";
            ((StringBuilder)((Object)set)).append((String)object2);
            ((StringBuilder)((Object)set)).append(n7);
            object2 = " minutes";
            ((StringBuilder)((Object)set)).append((String)object2);
            object2 = ((StringBuilder)((Object)set)).toString();
            object.getClass();
            com.clevertap.android.sdk.b.f((String)object2);
            return;
        }
        catch (Exception exception) {
            object2 = ((CleverTapInstanceConfig)object3).b();
            object3 = "Pushamp - Failed scheduling/cancelling periodic work request";
            StringBuilder stringBuilder = new StringBuilder((String)object3);
            stringBuilder.append(exception);
            String string6 = stringBuilder.toString();
            object2.getClass();
            com.clevertap.android.sdk.b.f(string6);
        }
    }

    public final void a(String string2, XB2$a xB2$a) {
        int n3 = TextUtils.isEmpty((CharSequence)string2);
        if (n3 == 0 && (n3 = TextUtils.isEmpty((CharSequence)string2)) == 0 && xB2$a != null) {
            int[] nArray = hC2$a.a;
            int n4 = xB2$a.ordinal();
            n3 = 1;
            if ((n4 = nArray[n4]) == n3) {
                xB2$a = XB2$a.FCM;
                this.e(string2, xB2$a);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b(Context var1_1, Bundle var2_2, int var3_3) {
        var4_4 = "wzrk_pid";
        var5_5 = "";
        var6_6 = "Handling notification: ";
        var7_7 = var2_2 /* !! */ .get("wzrk_pn");
        if (var7_7 == null) {
            return;
        }
        var7_7 = this.f;
        var8_8 = var7_7.h;
        if (var8_8) {
            var7_7.b().getClass();
            com.clevertap.android.sdk.b.f("Instance is set for Analytics only, cannot create notification");
            return;
        }
        var9_9 = "wzrk_pn_s";
        var9_9 = var2_2 /* !! */ .getString((String)var9_9, var5_5);
        var10_10 = "true";
        var8_8 = var9_9.equalsIgnoreCase((String)var10_10);
        if (var8_8) {
            var1_1 = this.d;
            var1_1.c0(var2_2 /* !! */ );
            return;
        }
        var9_9 = "extras_from";
        if ((var9_9 = var2_2 /* !! */ .getString((String)var9_9)) != null && (var8_8 = var9_9.equals(var10_10 = "PTReceiver"))) ** GOTO lbl70
        var9_9 = var7_7.b();
        var10_10 = new StringBuilder((String)var6_6);
        var10_10.append(var2_2 /* !! */ );
        var6_6 = var10_10.toString();
        var9_9.getClass();
        com.clevertap.android.sdk.b.f((String)var6_6);
        var6_6 = var2_2 /* !! */ .getString((String)var4_4);
        var9_9 = this.e;
        if (var6_6 == null) ** GOTO lbl-1000
        var6_6 = var9_9.c((Context)var1_1);
        var4_4 = var2_2 /* !! */ .getString((String)var4_4);
        // MONITORENTER : var6_6
        var10_10 = "id";
        Intrinsics.checkNotNullParameter(var4_4, (String)var10_10);
        var10_10 = var6_6.g((String)var4_4);
        var11_11 = Intrinsics.areEqual(var4_4, var10_10);
        try {
            // MONITOREXIT : var6_6
            if (!var11_11) ** GOTO lbl-1000
            var1_1 = var7_7.b();
            var2_2 /* !! */  = "Push Notification already rendered, not showing again";
            var1_1.getClass();
            com.clevertap.android.sdk.b.f((String)var2_2 /* !! */ );
            return;
        }
        catch (Throwable v0) {
            var1_1 = var7_7.b();
            var1_1.getClass();
            com.clevertap.android.sdk.b.g();
        }
lbl-1000:
        // 2 sources

        {
            var4_4 = this.i;
            if ((var4_4 = var4_4.f(var2_2 /* !! */ )) == null) {
                var4_4 = var5_5;
            }
            var11_11 = var4_4.isEmpty();
            if (var11_11) {
                var12_12 = var7_7.b();
                var4_4 = var7_7.a;
                var6_6 = "Push notification message is empty, not rendering";
                var12_12.b((String)var4_4, (String)var6_6);
                var12_12 = var9_9.c((Context)var1_1);
                var12_12.l();
                var12_12 = "pf";
                var2_2 /* !! */  = var2_2 /* !! */ .getString((String)var12_12, var5_5);
                var3_3 = (int)TextUtils.isEmpty((CharSequence)var2_2 /* !! */ );
                if (var3_3 != 0) return;
                var13_13 = Integer.parseInt((String)var2_2 /* !! */ );
                this.j(var13_13, (Context)var1_1);
                return;
            }
lbl70:
            // 3 sources

            var4_4 = this.i;
            var11_11 = (var4_4 = var4_4.a((Context)var1_1, var2_2 /* !! */ )).isEmpty();
            if (var11_11) {
                var4_4 = var1_1.getApplicationInfo();
                var4_4 = var4_4.name;
            }
            this.i((Context)var1_1, var2_2 /* !! */ , var3_3);
            return;
        }
    }

    public final String d(XB2$a object) {
        CharSequence charSequence;
        boolean bl2;
        String string2 = "PushProvider";
        String string3 = null;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f;
        if (object != null && !(bl2 = TextUtils.isEmpty((CharSequence)(charSequence = object.getTokenPrefKey())))) {
            string3 = gc3_0.h(this.g, cleverTapInstanceConfig, (String)charSequence, null);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(object);
            ((StringBuilder)charSequence).append("getting Cached Token - ");
            ((StringBuilder)charSequence).append(string3);
            object = ((StringBuilder)charSequence).toString();
            cleverTapInstanceConfig.e(string2, (String)object);
            return string3;
        }
        if (object != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(object);
            ((StringBuilder)charSequence).append(" Unable to find cached Token for type ");
            object = ((StringBuilder)charSequence).toString();
            cleverTapInstanceConfig.e(string2, (String)object);
        }
        return null;
    }

    public final void e(String string2, XB2$a xB2$a) {
        boolean bl2 = true;
        this.f(string2, bl2, xB2$a);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f;
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl3 && xB2$a != null) {
            Object object = jh_1.a(cleverTapInstanceConfig);
            object = ((kh_1)object).a();
            String string3 = "PushProviders#cacheToken";
            dC2 dC22 = new dC2(this, string2, xB2$a);
            try {
                ((a)object).c(string3, dC22);
            }
            catch (Throwable throwable) {
                xB2$a.toString();
                cleverTapInstanceConfig.c();
            }
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(String object, boolean bl2, XB2$a xB2$a) {
        if (xB2$a == null) {
            return;
        }
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (bl3) {
            object = this.d(xB2$a);
        }
        bl3 = TextUtils.isEmpty((CharSequence)object);
        if (bl3) {
            return;
        }
        Object object2 = this.k;
        synchronized (object2) {
            Throwable throwable2;
            JSONObject jSONObject = new JSONObject();
            Object object3 = new JSONObject();
            Object object4 = bl2 ? "register" : "unregister";
            Object object5 = "action";
            {
                catch (Throwable throwable2) {}
            }
            try {
                object3.put((String)object5, object4);
                object5 = "id";
                object3.put((String)object5, object);
                object5 = "type";
                CharSequence charSequence = xB2$a.getType();
                object3.put((String)object5, (Object)charSequence);
                object5 = "data";
                jSONObject.put((String)object5, object3);
                object3 = this.f;
                object3 = ((CleverTapInstanceConfig)object3).b();
                object5 = this.f;
                object5 = ((CleverTapInstanceConfig)object5).a;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((Object)xB2$a);
                ((StringBuilder)charSequence).append((String)object4);
                object4 = " device token ";
                ((StringBuilder)charSequence).append((String)object4);
                ((StringBuilder)charSequence).append((String)object);
                object = ((StringBuilder)charSequence).toString();
                ((b)object3).b((String)object5, (String)object);
                object = this.d;
                object4 = ((we)object).f;
                object = ((we)object).c;
                int n3 = 5;
                ((k0_0)object).Y((Context)object4, jSONObject, n3);
            }
            catch (Throwable throwable3) {
                object = this.f;
                object = ((CleverTapInstanceConfig)object).b();
                object4 = this.f;
                object4 = ((CleverTapInstanceConfig)object4).a;
                xB2$a.toString();
                object.getClass();
                com.clevertap.android.sdk.b.m();
            }
            return;
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    public final void g(Context var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 14[TRYBLOCK] [19, 18 : 539->546)] java.lang.Throwable
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

    public final void h() {
        Object object = this.f;
        Object object2 = this.g;
        String string2 = "pfworkid";
        String string3 = "";
        String string4 = gc3_0.g((Context)object2, string2, string3);
        boolean bl2 = string4.equals(string3);
        if (!bl2) {
            Object object3 = "context";
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object3 = ni3_1.i((Context)object2);
            String string5 = "getInstance(context)";
            Intrinsics.checkNotNullExpressionValue(object3, string5);
            ((ni3_1)object3).f(string4);
            gc3_0.k((Context)object2, string2, string3);
            object2 = ((CleverTapInstanceConfig)object).b();
            string2 = "Pushamp - Successfully cancelled work";
            try {
                object2.getClass();
                com.clevertap.android.sdk.b.f(string2);
            }
            catch (Exception exception) {
                ((CleverTapInstanceConfig)object).b().getClass();
                object = "Pushamp - Failure while cancelling work";
                com.clevertap.android.sdk.b.f((String)object);
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(Context var1_1, Bundle var2_2, int var3_3) {
        block73: {
            block71: {
                block78: {
                    block77: {
                        block66: {
                            block67: {
                                block68: {
                                    var4_4 = this;
                                    var5_5 = var1_1;
                                    var6_7 = var2_2;
                                    var7_8 = var3_3;
                                    var8_9 = "Creating the notification id: ";
                                    var9_10 = "Converting collapse_key: ";
                                    var10_11 = "Converting collapse_key: ";
                                    var11_12 /* !! */  = var1_1.getSystemService("notification");
                                    var12_13 = var11_12 /* !! */ ;
                                    var12_13 = (NotificationManager)var11_12 /* !! */ ;
                                    if (var12_13 == null) {
                                        var13_14 = this.f.b();
                                        var8_9 = this.f.a;
                                        var13_14.getClass();
                                        com.clevertap.android.sdk.b.f("Unable to render notification, Notification Manager is null.");
                                        return;
                                    }
                                    var14_18 = "";
                                    var11_12 /* !! */  = var2_2.getString("wzrk_cid", var14_18);
                                    var15_19 = Build.VERSION.SDK_INT;
                                    var16_20 = 26;
                                    if (var15_19 >= var16_20) {
                                        var15_19 = 1;
                                    } else {
                                        var15_19 = 0;
                                        var14_18 = null;
                                    }
                                    var17_21 = 512;
                                    if (var15_19 == 0) break block77;
                                    var18_22 = "";
                                    var19_23 = var11_12 /* !! */ .isEmpty();
                                    var20_24 = -1;
                                    if (var19_23 != 0) {
                                        var18_22 = var2_2.toString();
                                        var19_23 = 8;
                                        var21_25 = 8;
                                    } else {
                                        var22_26 = v42_0.a((NotificationManager)var12_13, (String)var11_12 /* !! */ );
                                        if (var22_26 == null) {
                                            var19_23 = 9;
                                            var18_22 = var11_12 /* !! */ ;
                                            var21_25 = 9;
                                        } else {
                                            var21_25 = -1;
                                        }
                                    }
                                    if (var21_25 != var20_24) {
                                        var23_27 = zB1.a(new String[]{var18_22}, var17_21, var21_25);
                                        var24_28 = var4_4.f.b();
                                        var18_22 = var4_4.f.a;
                                        var18_22 = var23_27.b;
                                        var24_28.getClass();
                                        com.clevertap.android.sdk.b.f((String)var18_22);
                                        var24_28 = var4_4.j;
                                        var24_28.b((da3_1)var23_27);
                                    }
                                    var23_27 = "fcm_fallback_notification_channel";
                                    Intrinsics.checkNotNullParameter(var12_13, "<this>");
                                    var24_28 = "context";
                                    Intrinsics.checkNotNullParameter(var5_5, (String)var24_28);
                                    try {
                                        var20_24 = var11_12 /* !! */ .length();
                                        if (var20_24 != 0 && (var24_28 = v42_0.a((NotificationManager)var12_13, (String)var11_12 /* !! */ )) != null) break block66;
                                        var11_12 /* !! */  = hg1_1.b(var1_1);
                                        var11_12 /* !! */  = var11_12 /* !! */ .l;
                                        if (var11_12 /* !! */  != null && (var20_24 = var11_12 /* !! */ .length()) != 0 && (var24_28 = v42_0.a((NotificationManager)var12_13, (String)var11_12 /* !! */ )) != null) {
                                            break block66;
                                        }
                                    }
                                    catch (Exception v0) {
                                        break block67;
                                    }
                                    {
                                        if (var11_12 /* !! */  != null && (var25_29 = var11_12 /* !! */ .length()) != 0) {
                                            com.clevertap.android.sdk.b.d();
                                        } else {
                                            com.clevertap.android.sdk.b.d();
                                        }
                                        var11_12 /* !! */  = oi_0.a((NotificationManager)var12_13);
                                        if (var11_12 /* !! */  != null) break block68;
                                    }
                                    try {
                                        var25_29 = R$string.ct_fcm_fallback_notification_channel_label;
                                        var11_12 /* !! */  = var5_5.getString(var25_29);
                                    }
                                    catch (Exception v1) {
                                        var11_12 /* !! */  = "Misc";
                                    }
                                    var24_28 = "try {\n                  \u2026HANNEL_NAME\n            }";
                                    {
                                        Intrinsics.checkNotNullExpressionValue(var11_12 /* !! */ , (String)var24_28);
                                        k52.a();
                                        var11_12 /* !! */  = ni_1.a((String)var11_12 /* !! */ );
                                        var11_12 /* !! */ .toString();
                                        com.clevertap.android.sdk.b.d();
                                        x31.a((NotificationManager)var12_13, (NotificationChannel)var11_12 /* !! */ );
                                    }
                                }
                                var11_12 /* !! */  = var23_27;
                                break block66;
                            }
                            var25_29 = 0;
                            var11_12 /* !! */  = null;
                        }
                        if (var11_12 /* !! */  != null && (var21_25 = (int)(var23_27 = var11_12 /* !! */ .trim()).isEmpty()) == 0) {
                            block70: {
                                Intrinsics.checkNotNullParameter(var5_5, "<this>");
                                var23_27 = "channelId";
                                Intrinsics.checkNotNullParameter(var11_12 /* !! */ , (String)var23_27);
                                var21_25 = Build.VERSION.SDK_INT;
                                if (var21_25 >= var16_20) {
                                    block69: {
                                        var21_25 = (int)qi_2.a(var1_1);
                                        if (var21_25 != 0) {
                                            var23_27 = "notification";
                                            try {
                                                var23_27 = var5_5.getSystemService((String)var23_27);
                                                var24_28 = "null cannot be cast to non-null type android.app.NotificationManager";
                                                Intrinsics.checkNotNull(var23_27, (String)var24_28);
                                                var23_27 = (NotificationManager)var23_27;
                                                var23_27 = v42_0.a((NotificationManager)var23_27, (String)var11_12 /* !! */ );
                                                var21_25 = w42_0.a((NotificationChannel)var23_27);
                                                if (var21_25 == 0) break block69;
                                                var21_25 = 1;
                                                break block70;
                                            }
                                            catch (Exception v2) {
                                                var23_27 = "Unable to find notification channel with id = ";
                                                var23_27.concat((String)var11_12 /* !! */ );
                                                com.clevertap.android.sdk.b.c();
                                            }
                                        }
                                    }
                                    var21_25 = 0;
                                    var23_27 = null;
                                } else {
                                    var21_25 = (int)qi_2.a(var1_1);
                                }
                            }
                            if (var21_25 == 0) {
                                var5_5 = var4_4.f.b();
                                var13_15 = var4_4.f.a;
                                var8_9 = new StringBuilder("Not rendering push notification as channel = ");
                                var8_9.append((String)var11_12 /* !! */ );
                                var8_9.append(" is blocked by user");
                                var8_9 = var8_9.toString();
                                var5_5.b(var13_15, (String)var8_9);
                                return;
                            }
                            var23_27 = var4_4.f.b();
                            var24_28 = var4_4.f.a;
                            var24_28 = "Rendering Push on channel = ".concat((String)var11_12 /* !! */ );
                            var23_27.getClass();
                            com.clevertap.android.sdk.b.f((String)var24_28);
                            break block78;
                        } else {
                            var5_5 = var4_4.f.b();
                            var13_16 = var4_4.f.a;
                            var5_5.getClass();
                            com.clevertap.android.sdk.b.f("Not rendering Push since channel id is null or blank.");
                            return;
                        }
                    }
                    var25_29 = 0;
                    var11_12 /* !! */  = null;
                }
                try {
                    var23_27 = hg1_1.b(var1_1);
                    var23_27 = var23_27.c;
                    if (var23_27 == null) {
                        var26_31 = new IllegalArgumentException();
                        throw var26_31;
                    }
                    var24_28 = var1_1.getResources();
                    var16_20 = var24_28.getIdentifier((String)var23_27, (String)(var18_22 = "drawable"), (String)(var26_30 = var1_1.getPackageName()));
                    if (var16_20 != 0) break block71;
                    var26_30 = new IllegalArgumentException();
                    throw var26_30;
                }
                catch (Throwable v9) {}
            }
lbl165:
            // 2 sources

            while (true) {
                block72: {
                    block79: {
                        var23_27 = var4_4.i;
                        var23_27.b(var16_20, (Context)var5_5);
                        var26_30 = var6_7.getString("pr");
                        if (var26_30 != null) {
                            var23_27 = "high";
                            var21_25 = (int)var26_30.equals(var23_27);
                            var24_28 = "max";
                            var16_20 = (int)var26_30.equals(var24_28);
                            if (var16_20 != 0) {
                                var21_25 = 2;
                            }
                        } else {
                            var21_25 = 0;
                            var23_27 = null;
                        }
                        if (var7_8 != (var16_20 = -1000)) break block79;
                        var24_28 = var4_4.i;
                        var24_28 = var24_28.c(var6_7);
                        if (var24_28 == null) break block72;
                        {
                            block80: {
                                catch (NumberFormatException v3) {
                                }
                                var27_32 = var24_28 instanceof Number;
                                if (!var27_32) break block80;
                                var9_10 = var24_28;
                                {
                                    var9_10 = (Number)var24_28;
                                    var7_8 = var9_10.intValue();
                                    ** GOTO lbl231
                                }
                            }
                            var27_32 = var24_28 instanceof String;
                            if (!var27_32) ** GOTO lbl231
                            try {
                                var18_22 = var24_28.toString();
                                var7_8 = Integer.parseInt((String)var18_22);
                                var18_22 = var4_4.f;
                                var18_22 = var18_22.b();
                                var28_33 = var4_4.f;
                                var28_33 = var28_33.a;
                                var29_34 = new StringBuilder((String)var10_11);
                                var29_34.append(var24_28);
                                var10_11 = " to notificationId int: ";
                                var29_34.append((String)var10_11);
                                var29_34.append(var7_8);
                                var10_11 = var29_34.toString();
                                var18_22.b((String)var28_33, (String)var10_11);
                                ** GOTO lbl231
                            }
                            catch (NumberFormatException v4) {}
                            {
                                var10_11 = var24_28.toString();
                                var7_8 = var10_11.hashCode();
                                var10_11 = var4_4.f;
                                var10_11 = var10_11.b();
                                var29_34 = var4_4.f;
                                var29_34 = var29_34.a;
                                var28_33 = new StringBuilder((String)var9_10);
                                var28_33.append(var24_28);
                                var9_10 = " to notificationId int: ";
                                var28_33.append((String)var9_10);
                                var28_33.append(var7_8);
                                var9_10 = var28_33.toString();
                                var10_11.b((String)var29_34, (String)var9_10);
lbl231:
                                // 4 sources

                                var7_8 = Math.abs(var7_8);
                                var9_10 = var4_4.f;
                                var9_10 = var9_10.b();
                                var10_11 = var4_4.f;
                                var10_11 = var10_11.a;
                                var10_11 = new StringBuilder((String)var8_9);
                                var10_11.append(var7_8);
                                var8_9 = " from collapse_key: ";
                                var10_11.append((String)var8_9);
                                var10_11.append(var24_28);
                                var8_9 = var10_11.toString();
                                var9_10.getClass();
                                com.clevertap.android.sdk.b.f((String)var8_9);
                            }
                            break block72;
                        }
                    }
                    var8_9 = var4_4.f.b();
                    var9_10 = var4_4.f.a;
                    var9_10 = new StringBuilder("Have user provided notificationId: ");
                    var9_10.append(var7_8);
                    var10_11 = " won't use collapse_key (if any) as basis for notificationId";
                    var9_10.append((String)var10_11);
                    var9_10 = var9_10.toString();
                    var8_9.getClass();
                    com.clevertap.android.sdk.b.f((String)var9_10);
                }
                if (var7_8 == var16_20) {
                    var30_35 = Math.random();
                    var32_36 = 4636737291354636288L;
                    var34_37 = 100.0;
                    var7_8 = (int)(var30_35 *= var34_37);
                    var8_9 = var4_4.f.b();
                    var9_10 = var4_4.f.a;
                    var10_11 = "Setting random notificationId: ";
                    var9_10 = new StringBuilder((String)var10_11);
                    var9_10.append(var7_8);
                    var9_10 = var9_10.toString();
                    var8_9.getClass();
                    com.clevertap.android.sdk.b.f((String)var9_10);
                }
                var16_20 = var7_8;
                if (var15_19 == 0) break block73;
                var13_17 = new J42((Context)var5_5, (String)var11_12 /* !! */ );
                var36_38 = false;
                var9_10 = null;
                var8_9 = var6_7.getString("wzrk_bi", null);
                if (var8_9 != null) {
                    try {
                        var37_39 = Integer.parseInt((String)var8_9);
                        if (var37_39 >= 0) {
                            var13_17.J = var37_39;
                        }
                    }
                    catch (Throwable v5) {}
                }
                var36_38 = false;
                var9_10 = null;
                var8_9 = var6_7.getString("wzrk_bc", null);
                if (var8_9 != null) {
                    var37_39 = Integer.parseInt((String)var8_9);
                    if (var37_39 < 0) ** GOTO lbl299
                    var13_17.k = var37_39;
                }
lbl299:
                // 5 sources

                while (true) {
                    block81: {
                        block76: {
                            block74: {
                                var13_17.l = var21_25;
                                var8_9 = var4_4.i;
                                var36_38 = var8_9 instanceof ar_1;
                                if (var36_38) {
                                    var8_9 = (ar_1)var8_9;
                                    var9_10 = var4_4.f;
                                    var13_17 = var8_9.e((Context)var5_5, var6_7, (J42)var13_17, (CleverTapInstanceConfig)var9_10);
                                }
                                var10_11 = var13_17;
                                var13_17 = var4_4.i;
                                var11_12 /* !! */  = var4_4.f;
                                var8_9 = var2_2;
                                var9_10 = var1_1;
                                var15_19 = var16_20;
                                if ((var13_17 = var13_17.d(var2_2, var1_1, (J42)var10_11, (CleverTapInstanceConfig)var11_12 /* !! */ , var16_20)) == null) {
                                    return;
                                }
                                var13_17 = var13_17.a();
                                var12_13.notify(var16_20, (Notification)var13_17);
                                var8_9 = var4_4.f.b();
                                var9_10 = var4_4.f.a;
                                var10_11 = "Rendered notification: ";
                                var9_10 = new StringBuilder((String)var10_11);
                                var13_17 = var13_17.toString();
                                var9_10.append((String)var13_17);
                                var13_17 = var9_10.toString();
                                var8_9.getClass();
                                com.clevertap.android.sdk.b.f((String)var13_17);
                                var13_17 = var6_7.getString("extras_from");
                                if (var13_17 != null && (var7_8 = (int)var13_17.equals(var8_9 = "PTReceiver")) != 0) break block81;
                                var8_9 = new StringBuilder();
                                var32_36 = System.currentTimeMillis();
                                var38_40 = 345600000L;
                                var32_36 = (var32_36 + var38_40) / 1000L;
                                var8_9.append(var32_36);
                                var8_9.append("");
                                var8_9 = var8_9.toString();
                                var13_17 = var6_7.getString("wzrk_ttl", (String)var8_9);
                                var40_41 = Long.parseLong((String)var13_17);
                                var9_10 = var6_7.getString("wzrk_pid");
                                var10_11 = var4_4.e.c((Context)var5_5);
                                var5_5 = var4_4.f.b();
                                var5_5.a();
                                synchronized (var10_11) {
                                    block82: {
                                        var42_42 = 0L;
                                        if (var9_10 != null) break block82;
                                        break block74;
                                    }
                                    var5_5 = var10_11.c;
                                    var44_43 /* !! */  = var5_5.a();
                                    if (var44_43 /* !! */  == 0) {
                                        var5_5 = var10_11.b;
                                        var5_5.a();
                                        break block74;
                                    }
                                    ** GOTO lbl360
                                    {
                                        catch (Throwable var5_6) {
                                            ** break block83
                                        }
lbl360:
                                        // 1 sources

                                        var5_5 = ci3_1.PUSH_NOTIFICATIONS;
                                        var5_5 = var5_5.getTableName();
                                        var21_25 = (int)(var40_41 == var42_42 ? 0 : (var40_41 < var42_42 ? -1 : 1));
                                        if (var21_25 <= 0) {
                                            var40_41 = System.currentTimeMillis() + var38_40;
                                        }
                                        var11_12 /* !! */  = new Class<CTFlushPushImpressionsWork>();
                                        var14_18 = "data";
                                        var11_12 /* !! */ .put(var14_18, (String)var9_10);
                                        var9_10 = "created_at";
                                        var13_17 = var40_41;
                                        var11_12 /* !! */ .put((String)var9_10, (Long)var13_17);
                                        var13_17 = "isRead";
                                        var37_39 = 0;
                                        var8_9 = null;
                                        var8_9 = 0;
                                        var11_12 /* !! */ .put((String)var13_17, (Integer)var8_9);
                                        try {
                                            var13_17 = var10_11.c;
                                            var13_17 = var13_17.getWritableDatabase();
                                            var37_39 = 0;
                                            var8_9 = null;
                                            var13_17.insert((String)var5_5, null, (ContentValues)var11_12 /* !! */ );
                                            var44_43 /* !! */  = 1;
                                            var10_11.d = var44_43 /* !! */ ;
                                            var5_5 = var10_11.b;
                                            var5_5.a();
                                            break block74;
                                        }
                                        catch (SQLiteException v6) {}
                                        {
                                            var5_5 = var10_11.b;
                                            var5_5.a();
                                            var10_11.e();
                                        }
                                    }
                                }
                            }
                            var5_5 = "true";
                            var8_9 = "";
                            var13_17 = var6_7.getString("wzrk_rnv", (String)var8_9);
                            var44_43 /* !! */  = var5_5.equals(var13_17);
                            if (var44_43 /* !! */  == 0) {
                                var5_5 = var2_2.toString();
                                var5_5 = zB1.a(new String[]{var5_5}, 512, 10);
                                var4_4.f.b().getClass();
                                com.clevertap.android.sdk.b.e();
                                var4_4.j.b((da3_1)var5_5);
                                return;
                            }
                            var5_5 = "omr_invoke_time_in_millis";
                            var30_35 = 0.0 / 0.0;
                            var40_41 = var6_7.getLong((String)var5_5, (long)-1);
                            cfr_temp_0 = var40_41 - var42_42;
                            var44_43 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var44_43 /* !! */  >= 0) {
                                System.currentTimeMillis();
                                var5_5 = var4_4.f.b();
                                var5_5.a();
                            }
                            var5_5 = var4_4.h;
                            var13_17 = var5_5.a;
                            var37_39 = (int)qi_2.f(26, (Context)var13_17);
                            if (var37_39 != 0) {
                                var8_9 = var13_17.getPackageName();
                                var9_10 = yz3_0.a;
                                var9_10 = "activity";
                                try {
                                    var9_10 = var13_17.getSystemService((String)var9_10);
                                    var9_10 = (ActivityManager)var9_10;
                                    var9_10 = var9_10.getRunningAppProcesses();
                                    var45_44 = Process.myPid();
                                    var9_10 = var9_10.iterator();
                                    while ((var25_29 = (int)var9_10.hasNext()) != 0) {
                                        var11_12 /* !! */  = var9_10.next();
                                        var11_12 /* !! */  = (ActivityManager.RunningAppProcessInfo)var11_12 /* !! */ ;
                                        var15_19 = var11_12 /* !! */ .pid;
                                        if (var15_19 != var45_44 || (var25_29 = (int)var8_9.equals(var11_12 /* !! */  = var11_12 /* !! */ .processName)) == 0) break block75;
                                        var8_9 = var5_5.c;
                                        var5_5 = var5_5.b;
                                        var9_10 = "scheduling one time work request to flush push impressions...";
                                        var8_9.b((String)var5_5, (String)var9_10);
                                    }
                                    break block76;
                                }
                                catch (Exception v8) {}
                                {
                                    block75: {
                                        try {
                                            var9_10 = lV1.NOT_REQUIRED;
                                            var9_10 = new LinkedHashSet();
                                            var10_11 = lV1.CONNECTED;
                                            var11_12 /* !! */  = "networkType";
                                            Intrinsics.checkNotNullParameter(var10_11, (String)var11_12 /* !! */ );
                                            var15_19 = 0;
                                            var14_18 = null;
                                            var11_12 /* !! */  = new Class<CTFlushPushImpressionsWork>(null);
                                            var15_19 = Build.VERSION.SDK_INT;
                                            var46_45 = 24;
                                            var9_10 = var15_19 >= var46_45 ? CollectionsKt.o0((Iterable)var9_10) : vz0_2.a;
                                            var47_46 = var9_10;
                                            var48_47 = true;
                                            var49_48 = -1;
                                            var9_10 = new b60((dv1_0)var11_12 /* !! */ , (lV1)var10_11, var48_47, false, false, false, var49_48, var49_48, (Set)var47_46);
                                            var10_11 = "Builder()\n              \u2026\n                .build()";
                                            Intrinsics.checkNotNullExpressionValue(var9_10, (String)var10_11);
                                            var11_12 /* !! */  = CTFlushPushImpressionsWork.class;
                                            var14_18 = "workerClass";
                                            Intrinsics.checkNotNullParameter(var11_12 /* !! */ , var14_18);
                                            var10_11 = new CI3$a(var11_12 /* !! */ );
                                            var9_10 = var10_11.d((b60)var9_10);
                                            var9_10 = (y92$a)var9_10;
                                            var9_10 = var9_10.a();
                                            var10_11 = "Builder(CTFlushPushImpre\u2026\n                .build()";
                                            Intrinsics.checkNotNullExpressionValue(var9_10, (String)var10_11);
                                            var9_10 = (y92)var9_10;
                                            var10_11 = "context";
                                            Intrinsics.checkNotNullParameter(var13_17, (String)var10_11);
                                            var13_17 = ni3_1.i((Context)var13_17);
                                            var10_11 = "getInstance(context)";
                                            Intrinsics.checkNotNullExpressionValue(var13_17, (String)var10_11);
                                            var10_11 = "CTFlushPushImpressionsOneTime";
                                            var11_12 /* !! */  = DE0.KEEP;
                                            var13_17.d((String)var10_11, (DE0)var11_12 /* !! */ , (y92)var9_10);
                                            var13_17 = "Finished scheduling one time work request to flush push impressions...";
                                            var8_9.b((String)var5_5, (String)var13_17);
                                        }
                                        catch (Throwable v7) {
                                            com.clevertap.android.sdk.b.m();
                                        }
                                        break block76;
                                    }
                                    var15_19 = 0;
                                    var14_18 = null;
                                    continue;
                                    break;
                                }
                            }
                        }
                        var5_5 = var4_4.d;
                        var5_5.c0(var6_7);
                    }
                    return;
lbl-1000:
                    // 1 sources

                    {
                        throw var5_6;
                    }
                    break;
                }
                break;
            }
            var26_30 = var1_1.getApplicationInfo();
            var16_20 = var26_30.icon;
            ** while (true)
            catch (Throwable v10) {}
            ** GOTO lbl299
        }
        var37_39 = 0;
        var8_9 = null;
        var13_17 = new J42((Context)var5_5, null);
        ** while (true)
    }

    public final void j(int n3, Context object) {
        Object object2 = this.f;
        ((CleverTapInstanceConfig)object2).b().a();
        b b2 = ((CleverTapInstanceConfig)object2).b();
        String string2 = "pf";
        int n4 = 240;
        gc3_0.b(object, n4, string2);
        b2.a();
        b2 = gc3_0.e(object);
        int n7 = b2.getInt(string2, n4);
        if (n3 != n7) {
            gc3_0.j(object, n3, string2);
            n3 = (int)(((CleverTapInstanceConfig)object2).i ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(((CleverTapInstanceConfig)object2).h ? 1 : 0)) == 0) {
                a a2 = jh_1.a((CleverTapInstanceConfig)object2).b();
                object = new eC2(this);
                object2 = "createOrResetWorker";
                a2.c((String)object2, (Callable)object);
            }
        }
    }
}

