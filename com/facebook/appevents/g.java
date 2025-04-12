/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger$b;
import com.facebook.appevents.a;
import com.facebook.appevents.f;
import com.facebook.appevents.g$a;
import com.facebook.appevents.i;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;

public final class g {
    public static ScheduledThreadPoolExecutor c;
    public static final AppEventsLogger$b d;
    public static final Object e;
    public static String f;
    public static boolean g;
    public final String a;
    public final a b;

    static {
        Object object;
        d = AppEventsLogger$b.AUTO;
        e = object = new Object();
    }

    public g(Context object, String string2) {
        object = lz3_0.m(object);
        this((String)object, string2);
    }

    public g(String object, String object2) {
        Date date;
        boolean bl2;
        Object object3 = "activityName";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Xz3.h();
        this.a = object;
        object = AccessToken.l;
        object = AccessToken$b.b();
        if (object != null && !(bl2 = ((Date)(object3 = new Date())).after(date = ((AccessToken)object).a)) && (object2 == null || (bl2 = Intrinsics.areEqual(object2, object3 = ((AccessToken)object).h)))) {
            Intrinsics.checkNotNullParameter(object, "accessToken");
            object3 = FacebookSdk.b();
            object = ((AccessToken)object).e;
            this.b = object2 = new a((String)object, (String)object3);
        } else {
            if (object2 == null) {
                object = FacebookSdk.a();
                object2 = lz3_0.a;
                Xz3.f(object, "context");
                object2 = FacebookSdk.b();
            }
            bl2 = false;
            object3 = null;
            this.b = object = new a(null, (String)object2);
        }
        g$a.f();
    }

    public static final /* synthetic */ String a() {
        Class<g> clazz = g.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return null;
        }
        try {
            return f;
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        Class<g> clazz = g.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return null;
        }
        try {
            return c;
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return null;
        }
    }

    public static final /* synthetic */ Object c() {
        Class<g> clazz = g.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return null;
        }
        try {
            return e;
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return null;
        }
    }

    public static /* synthetic */ void g(g g3, String string2, Double d2, Bundle bundle, boolean bl2, UUID uUID) {
        Class<g> clazz = g.class;
        boolean bl3 = td0.b(clazz);
        if (bl3) {
            return;
        }
        try {
            g3.f(string2, d2, bundle, bl2, uUID, null);
            return;
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return;
        }
    }

    public final void d(String string2, double d2, Bundle bundle) {
        Double d5;
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        try {
            d5 = d2;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return;
        }
        UUID uUID = v3.b();
        com.facebook.appevents.g.g(this, string2, d5, bundle, false, uUID);
    }

    public final void e(String string2, Bundle bundle) {
        UUID uUID;
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        try {
            uUID = v3.b();
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return;
        }
        com.facebook.appevents.g.g(this, string2, null, bundle, false, uUID);
    }

    /*
     * Exception decompiling
     */
    public final void f(String var1_1, Double var2_2, Bundle var3_3, boolean var4_4, UUID var5_5, i var6_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 120->123)] java.lang.Throwable
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

    public final void h(Bundle bundle, String string2) {
        boolean bl2;
        UUID uUID;
        boolean bl3 = td0.b(this);
        if (bl3) {
            return;
        }
        try {
            uUID = v3.b();
            bl2 = true;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return;
        }
        com.facebook.appevents.g.g(this, string2, null, bundle, bl2, uUID);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(BigDecimal object, Currency object2, Bundle object3, boolean bl2, i i3) {
        Throwable throwable2;
        boolean bl3 = td0.b(this);
        if (bl3) {
            return;
        }
        Object object4 = "AppEvents";
        if (object == null) {
            object = "purchaseAmount cannot be null";
            try {
                object2 = sx1.d;
                object2 = Ax1.DEVELOPER_ERRORS;
                sx1$a.a((Ax1)((Object)object2), (String)object4, (String)object);
                return;
            }
            catch (Throwable throwable2) {}
        } else {
            if (object2 == null) {
                object = "currency cannot be null";
                object2 = sx1.d;
                object2 = Ax1.DEVELOPER_ERRORS;
                sx1$a.a((Ax1)((Object)object2), (String)object4, (String)object);
                return;
            }
            if (object3 == null) {
                object3 = new Bundle();
            }
            Bundle bundle = object3;
            object3 = "fb_currency";
            object2 = ((Currency)object2).getCurrencyCode();
            bundle.putString((String)object3, (String)object2);
            String string2 = "fb_mobile_purchase";
            double d2 = ((BigDecimal)object).doubleValue();
            Double d5 = d2;
            UUID uUID = v3.b();
            object4 = this;
            this.f(string2, d5, bundle, bl2, uUID, i3);
            object = g$a.d();
            object2 = AppEventsLogger$b.EXPLICIT_ONLY;
            if (object != object2) {
                object = gt0_0.EAGER_FLUSHING_EVENT;
                com.facebook.appevents.f.c((gt0_0)((Object)object));
            }
            return;
        }
        td0.a(this, throwable2);
    }
}

