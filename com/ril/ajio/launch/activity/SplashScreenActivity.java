/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 */
package com.ril.ajio.launch.activity;

import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallRequest$Builder;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.launch.activity.SplashScreenActivity$a;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.view.BaseSplitActivity;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class SplashScreenActivity
extends BaseSplitActivity
implements xo_0,
ta3_2 {
    public static final SplashScreenActivity$a Companion;
    public final wi1_2 X;
    public final hh3_2 Y;
    public final NewCustomEventsRevamp Z;
    public final NewEEcommerceEventsRevamp k0;
    public Bundle p0;
    public boolean q0;
    public final hh3_2 r0;

    static {
        SplashScreenActivity$a splashScreenActivity$a;
        Companion = splashScreenActivity$a = new Object();
    }

    public SplashScreenActivity() {
        NewCustomEventsRevamp newCustomEventsRevamp;
        Object object = new wi1_2();
        this.X = object;
        object = new ca3_1(this);
        this.Y = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        this.Z = newCustomEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.k0 = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        object = new da3_2(this);
        this.r0 = object = yr1_2.b((Function0)object);
    }

    public final void A2() {
        boolean bl2;
        int n3 = 1;
        Object object = this.getAppPreferences();
        int n4 = 0;
        Object object2 = null;
        og1_1.g(((sw_0)object).getPreference("LUXE_FLOW", false), false);
        object = z40_0.Companion;
        Object object3 = this.getApplication();
        Object object4 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        object.getClass();
        object = z40$a.a((Context)object3).a;
        boolean bl3 = ((ao0_0)object).a("app_revamp");
        object3 = "APP_REVAMP_FLOW";
        if (bl3) {
            object = this.getAppPreferences();
            ((sw_0)object).putPreference((String)object3, n3 != 0);
        } else {
            object = this.getAppPreferences();
            ((sw_0)object).putPreference((String)object3, false);
        }
        object = this.z2().b;
        object.getClass();
        object3 = lw0_1.Companion;
        AJIOApplication.Companion.getClass();
        object4 = AJIOApplication$a.a();
        object3 = ((Lw0$a)object3).a((ContextWrapper)object4);
        object = ((mw0_1)object).a;
        object3.getClass();
        Intrinsics.checkNotNullParameter(object, "moduleNames");
        object3 = SplitInstallManagerFactory.create(((lw0_1)object3).a);
        object4 = "create(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        Object object5 = SplitInstallRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(object5, "newBuilder(...)");
        object = ((ArrayList)object).iterator();
        Object object6 = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object6);
        while (bl2 = object.hasNext()) {
            object6 = object.next();
            Object object7 = "next(...)";
            Intrinsics.checkNotNullExpressionValue(object6, (String)object7);
            int n7 = ((String)object6).length();
            if (n7 <= 0 || (n7 = (int)((object7 = object3.getInstalledModules()).contains(object6) ? 1 : 0)) != 0) continue;
            ((SplitInstallRequest$Builder)object5).addModule((String)object6);
        }
        object = ((SplitInstallRequest$Builder)object5).build();
        object5 = "build(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object5);
        object3.startInstall((SplitInstallRequest)object);
        object = this.z2();
        object3 = ((pa3_1)object).b().getClientId();
        boolean bl4 = TextUtils.isEmpty((CharSequence)object3);
        if (bl4) {
            object = ((pa3_1)object).b();
            object3 = new Pa3$a((UserInformation)object);
            object = new String[]{};
            object3.execute((Object[])object);
        }
        if (bl4 = TextUtils.isEmpty((CharSequence)(object3 = ((pa3_1)(object = this.z2())).b().getNewClientId()))) {
            object3 = new Object();
            object2 = new o53_0((Callable)object3);
            object3 = qt2_2.c;
            object3 = ((g53_0)object2).h((Scheduler)object3);
            object2 = ti_2.a();
            object3 = ((g53_0)object3).e((Scheduler)object2);
            int n8 = 2;
            object2 = new d71_0(object, n8);
            object5 = new ns_0(n3, (Function1)object2);
            object2 = new e71_0(n3);
            object6 = new m9_0(object2);
            object3 = ((g53_0)object3).f((o60_0)object5, (o60_0)object6);
            object = ((pa3_1)object).m;
            ((t30_0)object).b((yr0_2)object3);
        }
        AJIOApplication.Companion.getClass();
        object3 = AJIOApplication$a.a();
        object = new jo_2((Context)object3);
        bl3 = ((sw_0)object).getPreference("navigation_revamp_master_flag", n3 != 0);
        object3 = h40_0.a;
        bl4 = h40_0.b1();
        if (bl3 && (bl3 = hu1_2.f((Boolean)(object = Boolean.TRUE)))) {
            object = this.z2();
            object3 = ((pa3_1)object).d.getStoreInfo(bl4);
            object2 = new n12_0(object, n3);
            object4 = new md0_2(object2);
            object2 = new ve2_1(object, n3);
            Object object8 = new oa3_1((ve2_1)object2);
            object8 = ((g53_0)object3).f((o60_0)object4, (o60_0)object8);
            object = ((pa3_1)object).m;
            ((t30_0)object).b((yr0_2)object8);
        } else {
            Object object9 = this.z2();
            object9.getClass();
            object = md3_0.c((jD3)object9);
            object2 = null;
            object3 = new qa3_2((pa3_1)object9, null);
            n3 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)object3, n3);
            object9 = new wo(this, this);
            object = z40_0.Companion;
            object3 = AJIOApplication$a.a();
            object.getClass();
            object = z40$a.a((Context)object3).a;
            object3 = "min_versioncode";
            long l2 = ((ao0_0)object).h((String)object3);
            long l3 = 3444L;
            n4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (n4 < 0) {
                object = AppUpdateManagerFactory.create((Context)this);
                Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                object3 = object.getAppUpdateInfo();
                Intrinsics.checkNotNullExpressionValue(object3, "getAppUpdateInfo(...)");
                object2 = new uo_1((wo)object9, (AppUpdateManager)object);
                object9 = new vo_2(object2);
                object9 = ((Task)object3).addOnSuccessListener((OnSuccessListener)object9);
                Intrinsics.checkNotNull(object9);
            } else {
                this.Z();
            }
        }
    }

    public final void C2(Intent object) {
        boolean bl2 = this.q0;
        if (bl2) {
            Object object2 = ye_1.a;
            object2 = "APP_LOAD_TIME";
            Intrinsics.checkNotNullParameter(object2, "id");
            Object object3 = ye_1.a;
            ((HashMap)object3).remove(object2);
            if (object != null && (object2 = object.getData()) != null) {
                int n3;
                na_1.Companion.getClass();
                AJIOApplication.Companion.getClass();
                object2 = AJIOApplication$a.a();
                object3 = "notification";
                object2 = (NotificationManager)object2.getSystemService((String)object3);
                if (object2 != null) {
                    n3 = 899809;
                    object2.cancel(n3);
                }
                if (object2 != null) {
                    n3 = 999810;
                    object2.cancel(n3);
                }
                this.y2((Intent)object);
                boolean bl3 = og1_1.c();
                if (bl3) {
                    object = this.z2();
                    object2 = ((pa3_1)object).i;
                    object = ((pa3_1)object).c;
                    ((HomeRepo)object).getLuxeBottomTabsData((zr1_1)object2);
                } else {
                    object = this.z2();
                    object2 = ((pa3_1)object).g;
                    object = ((pa3_1)object).c;
                    ((HomeRepo)object).getBottomTabsData((zr1_1)object2);
                }
            }
        } else {
            at2_1.d((Context)this);
            this.finish();
        }
    }

    public final void D2() {
        Bundle bundle = this.p0;
        if (bundle != null) {
            int n3;
            String string2;
            Object object;
            Parcelable parcelable;
            int n4 = Build.VERSION.SDK_INT;
            int n7 = 33;
            Uri uri = null;
            if (n4 >= n7) {
                parcelable = (Parcelable)z7.a(bundle);
            } else {
                parcelable = bundle.getParcelable("deeplinkData");
                n7 = parcelable instanceof Intent;
                if (n7 == 0) {
                    n4 = 0;
                    parcelable = null;
                }
                parcelable = (Intent)parcelable;
            }
            parcelable = (Intent)parcelable;
            if (parcelable != null) {
                object = parcelable.getData();
            } else {
                n7 = 0;
                object = null;
            }
            if (object != null && (object = object.toString()) != null && (n7 = (int)(StringsKt.F((CharSequence)object, string2 = "onelink", (n3 = 1) != 0) ? 1 : 0)) == n3 && parcelable != null) {
                tp_0.Companion.getClass();
                object = (String)((tp_0)tp_0.c.getValue()).b.getValue();
                if (object != null) {
                    uri = Uri.parse((String)object);
                }
                parcelable.setData(uri);
            }
            at2_1.f((Context)this, bundle);
        } else {
            at2_1.e((Context)this);
        }
        this.finish();
    }

    public final void E2(String object, String object2) {
        CharSequence charSequence;
        Object object3 = new Bundle();
        if (object != null) {
            charSequence = "tvc_source";
            object3.putString((String)charSequence, (String)object);
        }
        if (object2 != null) {
            object = "tvc_medium";
            object3.putString((String)object, (String)object2);
        }
        object = this.getAppPreferences().a();
        object3.putString("advertising_id", (String)object);
        object = Build.MANUFACTURER;
        object2 = Build.MODEL;
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(" ");
        ((StringBuilder)charSequence).append((String)object2);
        object = ((StringBuilder)charSequence).toString();
        object3.putString("device_model_details", (String)object);
        object = yn3_0.a;
        object2 = this.getAppPreferences().a();
        object2 = kp1_0.c("advertising_id & device_id : ", (String)object2);
        charSequence = new Object[]{};
        ((yn3$a)object).a((String)object2, (Object[])charSequence);
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object2 = new AnalyticsData$Builder();
        object2 = ((AnalyticsData$Builder)object2).bundle((Bundle)object3).build();
        String string2 = "splash screen";
        ((GTMEvents)object).pushAppLaunched("Application_Launched", "", string2, (AnalyticsData)object2);
        object = new Bundle();
        object3 = "app_user_permissions";
        object.putString("event_category", (String)object3);
        object.putString("event_action", "notification status");
        hv3_0.a.getClass();
        object2 = "android.permission.POST_NOTIFICATIONS";
        boolean bl2 = hv3_0.R((String)object2);
        charSequence = "event_label";
        if (bl2) {
            object2 = "allowed";
            object.putString((String)charSequence, (String)object2);
        } else {
            object2 = "not allowed";
            object.putString((String)charSequence, (String)object2);
        }
        object.putString("screen_name", string2);
        object.putString("screenname", string2);
        GAEcommerceEvents.INSTANCE.pushGAEventBundle((String)object3, (Bundle)object);
    }

    public final void J0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "storeId");
        at2_1.d((Context)this);
        this.finish();
    }

    public final void Z() {
        Intent intent = this.getIntent();
        this.C2(intent);
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        int n7 = 51;
        if (n7 == n3 && n4 != (n7 = -1)) {
            Object object = yn3_0.a;
            String string2 = hj0_0.a(n4, "installed status forceUpdate cancelled with resultCode: ");
            Object object2 = new Object[]{};
            ((yn3$a)object).a(string2, object2);
            if (n4 == 0) {
                object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                object2 = "splash screen";
                String string3 = "link click";
                ((GTMEvents)object).pushUpdateAppEvent(string3, "cancel", (String)object2);
                Bundle bundle = new Bundle();
                int n8 = 3444;
                bundle.putInt("current app version", n8);
                n7 = qo_0.a;
                string2 = "proposed app version";
                bundle.putInt(string2, n7);
                NewCustomEventsRevamp newCustomEventsRevamp = this.Z;
                String string4 = newCustomEventsRevamp.getEC_USER_INTERACTION();
                object = this.k0;
                String string5 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
                String string6 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
                int n10 = 1536;
                String string7 = "update widget clicked";
                String string8 = "cancel";
                String string9 = "update_widget_link_click";
                String string10 = "splash screen";
                String string11 = "splash screen";
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string4, string7, string8, string9, string10, string11, string5, bundle, string6, false, null, n10, null);
            }
            this.finish();
        }
        super.onActivityResult(n3, n4, intent);
    }

    public final void onBackPressed() {
        super.onBackPressed();
        boolean bl2 = this.isFinishing();
        if (!bl2) {
            this.finish();
        }
    }

    /*
     * Exception decompiling
     */
    public final void onCreate(Bundle var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [10 : 333->336)] java.lang.Throwable
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

    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        this.C2(intent);
    }

    public final void onStop() {
        super.onStop();
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
        String string2 = "splash screen";
        newEEcommerceEventsRevamp.setPreviousScreenData(string2, string2);
    }

    public final void y2(Intent intent) {
        Object object;
        Object object2;
        this.p0 = object2 = new Bundle();
        if (intent != null && (object2 = intent.getData()) != null) {
            object = tj2_2.Companion;
            object2 = object2.toString();
            Intrinsics.checkNotNullExpressionValue(object2, "toString(...)");
            String string2 = "/p/";
            boolean bl2 = StringsKt.F((CharSequence)object2, string2, false);
            object.getClass();
            tj2_2.e = bl2;
        }
        if ((object2 = this.p0) != null) {
            object = "deeplinkData";
            object2.putParcelable((String)object, (Parcelable)intent);
        }
    }

    public final pa3_1 z2() {
        return (pa3_1)this.r0.getValue();
    }
}

