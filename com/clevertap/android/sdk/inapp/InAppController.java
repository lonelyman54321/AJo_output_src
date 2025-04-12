/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences$Editor
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Looper
 *  android.os.Parcelable
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.InAppNotificationActivity$c;
import com.clevertap.android.sdk.a$a;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.InAppController$2;
import com.clevertap.android.sdk.inapp.InAppController$4;
import com.clevertap.android.sdk.inapp.InAppController$7;
import com.clevertap.android.sdk.inapp.InAppController$a;
import com.clevertap.android.sdk.inapp.InAppController$b;
import com.clevertap.android.sdk.inapp.InAppController$c;
import com.clevertap.android.sdk.inapp.InAppController$d;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class InAppController
implements lf1_1,
InAppNotificationActivity$c {
    public static CTInAppNotification q;
    public static final List r;
    public final we a;
    public final tf_0 b;
    public final CleverTapInstanceConfig c;
    public final Context d;
    public final l80_0 e;
    public final mp0_0 f;
    public final yB0 g;
    public final kd3_0 h;
    public final xj3_0 i;
    public final InAppController$d j;
    public HashSet k = null;
    public final b l;
    public final ol0_1 m;
    public final cg1_0 n;
    public final og1_0 o;
    public final cf1_0 p;

    static {
        ArrayList arrayList = new ArrayList();
        r = Collections.synchronizedList(arrayList);
    }

    public InAppController(Context object, CleverTapInstanceConfig cleverTapInstanceConfig, cg1_0 cg1_02, l80_0 l80_02, ck_1 ck_12, we we2, E80 e80, mp0_0 mp0_02, og1_0 og1_02, yB0 yB02, ol0_1 ol0_12, xj3_0 xj3_02, kd3_0 kd3_02) {
        this.d = object;
        this.c = cleverTapInstanceConfig;
        object = cleverTapInstanceConfig.b();
        this.l = object;
        this.n = cg1_02;
        this.e = l80_02;
        this.b = ck_12;
        this.a = we2;
        object = InAppController$d.RESUMED;
        this.j = object;
        this.f = mp0_02;
        this.m = ol0_12;
        this.o = og1_02;
        this.g = yB02;
        this.i = xj3_02;
        this.h = kd3_02;
        super(this, mp0_02, yB02, e80);
        this.p = object;
    }

    public static void c(InAppController object, CTInAppNotification object2, eg0 object3) {
        Object object4;
        Object object5 = Looper.myLooper();
        if (object5 != (object4 = Looper.getMainLooper())) {
            object5 = new InAppController$2((InAppController)object, (CTInAppNotification)object2, (eg0)object3);
            object = ((InAppController)object).n;
            object.post((Runnable)object5);
        } else {
            object5 = ((CTInAppNotification)object2).j;
            object4 = ((InAppController)object).c;
            b b2 = ((InAppController)object).l;
            if (object5 != null) {
                object = object4.a;
                object3 = "Unable to process inapp notification ";
                object = new StringBuilder((String)object3);
                object2 = ((CTInAppNotification)object2).j;
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
                b2.getClass();
                com.clevertap.android.sdk.b.f((String)object);
            } else {
                object5 = object4.a;
                object5 = new StringBuilder("Notification ready: ");
                object4 = ((CTInAppNotification)object2).v;
                ((StringBuilder)object5).append(object4);
                object5 = ((StringBuilder)object5).toString();
                b2.getClass();
                com.clevertap.android.sdk.b.f((String)object5);
                if (object3 != null) {
                    ((InAppController)object).n((CTInAppNotification)object2);
                } else {
                    ((InAppController)object).h((CTInAppNotification)object2);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void d(InAppController var0) {
        var0.getClass();
        var1_1 = var0.f();
        if (var1_1) ** GOTO lbl9
        com.clevertap.android.sdk.b.j();
        ** GOTO lbl92
lbl9:
        // 1 sources

        var2_2 = var0.j;
        var3_3 /* !! */  = InAppController$d.SUSPENDED;
        if (var2_2 != var3_3 /* !! */ ) ** GOTO lbl25
        var2_2 = var0.l;
        var3_3 /* !! */  = var0.c;
        var3_3 /* !! */  = var3_3 /* !! */ .a;
        var3_3 /* !! */  = "InApp Notifications are set to be suspended, not showing the InApp Notification";
        var2_2.getClass();
        com.clevertap.android.sdk.b.f((String)var3_3 /* !! */ );
        ** GOTO lbl92
lbl25:
        // 1 sources

        var2_2 = var0.d;
        var3_3 /* !! */  = var0.c;
        InAppController.g((Context)var2_2, (CleverTapInstanceConfig)var3_3 /* !! */ , (InAppController)var0);
        var2_2 = var0.o;
        ** synchronized (var2_2)
lbl-1000:
        // 1 sources

        {
            block31: {
                block33: {
                    block32: {
                        block30: {
                            try {
                                var3_3 /* !! */  = var2_2.b();
                            }
                            catch (Throwable var3_4) {}
                            var4_5 = var3_3 /* !! */ .length();
                            var5_6 = null;
                            if (var4_5 != 0) break block30;
                            break block31;
                        }
                        var4_5 = 0;
                        var6_7 = null;
                        var6_7 = var3_3 /* !! */ .remove(0);
                        var7_8 = var2_2.b;
                        var7_8 = var7_8.a;
                        if (var7_8 == null) break block32;
                        var7_8.b((JSONArray)var3_3 /* !! */ );
                        var3_3 /* !! */  = Unit.a;
                    }
                    if (!(var8_9 = var6_7 instanceof JSONObject)) break block33;
                    var5_6 = var6_7;
                    var5_6 = (JSONObject)var6_7;
                    ** finally { 
                }
                ** try [egrp 18[TRYBLOCK] [23 : 182->184)] { 
            }
            if (var5_6 == null) ** GOTO lbl92
        }
        var2_2 = var0.j;
        var3_3 /* !! */  = InAppController$d.DISCARDED;
        if (var2_2 == var3_3 /* !! */ ) ** GOTO lbl73
        var0.m((JSONObject)var5_6);
        ** GOTO lbl92
lbl73:
        // 1 sources

        var2_2 = var0.l;
        var3_3 /* !! */  = var0.c;
        var3_3 /* !! */  = var3_3 /* !! */ .a;
        var3_3 /* !! */  = "InApp Notifications are set to be discarded, dropping the InApp Notification";
        var2_2.getClass();
        com.clevertap.android.sdk.b.f((String)var3_3 /* !! */ );
        ** GOTO lbl92
lbl-1000:
        // 18 sources

        {
            catch (Throwable v0) {
                ** continue;
            }
lbl86:
            // 1 sources

            while (true) {
                var2_2 = var0.l;
                var0 = var0.c.a;
                var2_2.getClass();
                com.clevertap.android.sdk.b.m();
lbl92:
                // 6 sources

                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void g(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, InAppController inAppController) {
        String string2 = cleverTapInstanceConfig.a;
        com.clevertap.android.sdk.b.k();
        List list = r;
        if (list == null) return;
        boolean bl2 = list.isEmpty();
        if (bl2) return;
        bl2 = false;
        InAppController$7 inAppController$7 = null;
        try {
            Object e2 = list.get(0);
            CTInAppNotification cTInAppNotification = (CTInAppNotification)e2;
            list.remove(0);
            cg1_0 cg1_02 = new cg1_0();
            inAppController$7 = new InAppController$7(context, cTInAppNotification, cleverTapInstanceConfig, inAppController);
            cg1_02.post(inAppController$7);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void o(Context object, CTInAppNotification object2, CleverTapInstanceConfig object3, InAppController object4) {
        boolean bl2;
        boolean bl3;
        long l2;
        Object object5 = "calling InAppActivity for notification: ";
        Object object6 = ((CleverTapInstanceConfig)object3).a;
        com.clevertap.android.sdk.b.k();
        boolean bl4 = E80.u;
        String string2 = ((CleverTapInstanceConfig)object3).a;
        Object object7 = r;
        if (!bl4) {
            object7.add(object2);
            com.clevertap.android.sdk.b.k();
            return;
        }
        object6 = q;
        if (object6 != null) {
            object7.add(object2);
            com.clevertap.android.sdk.b.k();
            return;
        }
        boolean bl5 = ((InAppController)object4).f();
        if (!bl5) {
            object7.add(object2);
            com.clevertap.android.sdk.b.k();
            return;
        }
        long l3 = System.currentTimeMillis() / 1000L;
        long l4 = l3 - (l2 = ((CTInAppNotification)object2).D);
        Object object8 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object8 > 0) {
            com.clevertap.android.sdk.b.c();
            return;
        }
        object6 = ((CTInAppNotification)object2).I;
        if (object6 != null && (bl3 = ((String)object6).equals(object7 = "custom-html")) && !(bl2 = tu1_1.h((Context)object))) {
            com.clevertap.android.sdk.b.d();
            object = ((InAppController)object4).c;
            boolean bl6 = ((CleverTapInstanceConfig)object).h;
            if (bl6) return;
            object = jh_1.a((CleverTapInstanceConfig)object).c("TAG_FEATURE_IN_APPS");
            object2 = new ef1_0((InAppController)object4);
            object3 = "InAppController#showInAppNotificationIfAny";
            ((com.clevertap.android.sdk.task.a)object).c((String)object3, (Callable)object2);
            return;
        }
        q = object2;
        object6 = ((CTInAppNotification)object2).q;
        object7 = InAppController$c.b;
        int n3 = ((Enum)object6).ordinal();
        Object object9 = object7[n3];
        String string3 = "config";
        String string4 = "inApp";
        switch (object9) {
            default: {
                ((ei_1)((Object)object6)).toString();
                com.clevertap.android.sdk.b.d();
                q = null;
                return;
            }
            case 15: {
                ((InAppController)object4).n((CTInAppNotification)object2);
                return;
            }
            case 14: {
                object = new ci_1();
                break;
            }
            case 13: {
                object = new bi_1();
                break;
            }
            case 12: {
                object = new yh_1();
                break;
            }
            case 11: {
                object = new wh_1();
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                object4 = new Intent((Context)object, InAppNotificationActivity.class);
                object4.putExtra(string4, (Parcelable)object2);
                object = new Bundle();
                object.putParcelable(string3, (Parcelable)object3);
                object6 = "configBundle";
                object4.putExtra((String)object6, (Bundle)object);
                try {
                    object = E80.e();
                    if (object == null) {
                        object4 = "Current activity reference not found";
                        object = new IllegalStateException((String)object4);
                        throw object;
                    }
                    object6 = ((CleverTapInstanceConfig)object3).b();
                    object7 = new StringBuilder((String)object5);
                    object5 = ((CTInAppNotification)object2).v;
                    ((StringBuilder)object7).append(object5);
                    object5 = ((StringBuilder)object7).toString();
                    ((b)object6).b(string2, (String)object5);
                    object.startActivity((Intent)object4);
                    object = ((CTInAppNotification)object2).v;
                    Objects.toString(object);
                    com.clevertap.android.sdk.b.c();
                }
                catch (Throwable throwable) {}
                com.clevertap.android.sdk.b.l();
                object = null;
            }
        }
        if (object == null) return;
        object4 = ((CTInAppNotification)object2).v;
        Objects.toString(object4);
        com.clevertap.android.sdk.b.c();
        try {
            object4 = E80.e();
            object4 = (FragmentActivity)object4;
            object4 = ((FragmentActivity)object4).getSupportFragmentManager();
            object4.getClass();
            object5 = new a((FragmentManager)object4);
            object4 = new Bundle();
            object4.putParcelable(string4, (Parcelable)object2);
            object4.putParcelable(string3, (Parcelable)object3);
            ((Fragment)object).setArguments((Bundle)object4);
            int n4 = 0x10B0000;
            int n7 = 0x10B0001;
            boolean bl7 = false;
            object6 = null;
            ((k)object5).k(n4, n7, 0, 0);
            object2 = ((CTInAppNotification)object2).I;
            n4 = 1;
            n7 = 0x1020002;
            ((a)object5).h(n7, (Fragment)object, (String)object2, n4);
            com.clevertap.android.sdk.b.k();
            ((a)object5).p();
            return;
        }
        catch (ClassCastException classCastException) {
        }
        catch (Throwable throwable) {
            object = a$a.DEBUG;
            ((a$a)((Object)object)).intValue();
            q = null;
            return;
        }
        classCastException.getMessage();
        com.clevertap.android.sdk.b.k();
        q = null;
    }

    public final void N1(CTInAppNotification cTInAppNotification, Bundle object) {
        cTInAppNotification.getClass();
        object = this.e.a;
        Object object2 = this.l;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.c;
        if (object != null) {
            object = cTInAppNotification.O;
            object = object != null ? ((CustomTemplateInAppData)object).a : "";
            String string2 = cleverTapInstanceConfig.a;
            StringBuilder stringBuilder = new StringBuilder("InApp Dismissed: ");
            String string3 = cTInAppNotification.f;
            String string4 = "  ";
            object = BW0.b(stringBuilder, string3, string4, (String)object);
            ((b)object2).b(string2, (String)object);
        } else {
            object = cleverTapInstanceConfig.a;
            CharSequence charSequence = new StringBuilder("Not calling InApp Dismissed: ");
            String string5 = cTInAppNotification.f;
            charSequence.append(string5);
            string5 = " because InAppFCManager is null";
            charSequence.append(string5);
            charSequence = charSequence.toString();
            ((b)object2).b((String)object, (String)charSequence);
        }
        object = this.b;
        try {
            object.getClass();
        }
        catch (Throwable throwable) {
            object = cleverTapInstanceConfig.a;
            object2.getClass();
            com.clevertap.android.sdk.b.m();
        }
        object = jh_1.a(cleverTapInstanceConfig).c("TAG_FEATURE_IN_APPS");
        object2 = new InAppController$a(this, cTInAppNotification);
        ((com.clevertap.android.sdk.task.a)object).c("InappController#inAppNotificationDidDismiss", (Callable)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bundle O1(CTInAppNotification object, CTInAppAction object2, String object3, Bundle object4, Context object5) {
        Bundle bundle = object4 != null ? new Bundle(object4) : new Bundle();
        object4 = ((CTInAppNotification)object).f;
        String string2 = "wzrk_id";
        bundle.putString(string2, (String)object4);
        object4 = "wzrk_c2a";
        bundle.putString((String)object4, (String)object3);
        object3 = this.a;
        int n3 = 1;
        ((we)object3).Y(n3 != 0, (CTInAppNotification)object, bundle);
        object3 = object2.a;
        b b2 = this.l;
        if (object3 == null) {
            b2.getClass();
            com.clevertap.android.sdk.b.e();
            return bundle;
        }
        Object object6 = InAppController$c.a;
        int n4 = ((Enum)object3).ordinal();
        n4 = object6[n4];
        object6 = null;
        xj3_0 xj3_02 = this.i;
        if (n4 != n3) {
            n3 = 2;
            if (n4 != n3) {
                int n7 = 3;
                if (n4 != n7) {
                    n7 = 4;
                    if (n4 != n7) {
                        return bundle;
                    }
                    object = object2.c;
                    if (object == null) return bundle;
                    n7 = (int)(((HashMap)object).isEmpty() ? 1 : 0);
                    if (n7 != 0) return bundle;
                    object3 = object = this.b;
                    object3 = (ck_1)object;
                    object4 = ((ck_1)object3).a;
                    if (object4 != null && (object4 = object4.get()) != null) {
                        object3 = (qf1_1)((ck_1)object3).a.get();
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                    if (object3 == null) return bundle;
                    object = (ck_1)object;
                    object3 = ((ck_1)object).a;
                    if (object3 != null && (object3 = ((Reference)object3).get()) != null) {
                        object6 = object = ((ck_1)object).a.get();
                        object6 = (qf1_1)object;
                    }
                    object = object2.c;
                    object6.C1((HashMap)object);
                    return bundle;
                }
                object = object2.b;
                if (object == null) {
                    b2.getClass();
                    com.clevertap.android.sdk.b.e();
                    return bundle;
                }
                object2 = "";
                object3 = "\n";
                try {
                    boolean bl2;
                    object3 = ((String)object).replace((CharSequence)object3, (CharSequence)object2);
                    object4 = "\r";
                    object2 = ((String)object3).replace((CharSequence)object4, (CharSequence)object2);
                    object2 = Uri.parse((String)object2);
                    object3 = object2.getQueryParameterNames();
                    object4 = new Bundle();
                    if (object3 != null && !(bl2 = object3.isEmpty())) {
                        object3 = object3.iterator();
                        while (bl2 = object3.hasNext()) {
                            string2 = object3.next();
                            object6 = object2.getQueryParameter(string2);
                            object4.putString(string2, (String)object6);
                        }
                    }
                    string2 = "android.intent.action.VIEW";
                    object3 = new Intent(string2, (Uri)object2);
                    int n8 = object4.isEmpty();
                    if (n8 == 0) {
                        object3.putExtras(object4);
                    }
                    if (object5 == null) {
                        object5 = this.d;
                        n8 = 0x10000000;
                        object3.setFlags(n8);
                    }
                    yz3_0.k((Context)object5, (Intent)object3);
                    object5.startActivity((Intent)object3);
                    return bundle;
                }
                catch (Exception exception) {}
                object2 = "wzrk://";
                boolean bl3 = ((String)object).startsWith((String)object2);
                if (bl3) {
                    return bundle;
                }
                object2 = "No activity found to open url: ";
                ((String)object2).concat((String)object);
                b2.getClass();
                com.clevertap.android.sdk.b.e();
                return bundle;
            }
            object2 = ei_1.CTInAppTypeCustomCodeTemplate;
            object3 = ((CTInAppNotification)object).q;
            if (object2 != object3) return bundle;
            xj3_02.getClass();
            object2 = "notification";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object = ((CTInAppNotification)object).O;
            if (object != null) {
                object6 = ((CustomTemplateInAppData)object).a;
            }
            object = xj3_02.a;
            if (object6 == null) {
                object.getClass();
                object = "Cannot close custom template from notification without template name";
                com.clevertap.android.sdk.b.f((String)object);
                return bundle;
            }
            object2 = (gg0)xj3_02.c.get(object6);
            if (object2 == null) {
                object.getClass();
                object = "Cannot close custom template without active context";
                com.clevertap.android.sdk.b.f((String)object);
                return bundle;
            }
            object2 = (eg0)xj3_02.b.get(object6);
            if (object2 != null) return bundle;
            object2 = "Cannot find template with name ";
            ((String)object2).concat((String)object6);
            object.getClass();
            com.clevertap.android.sdk.b.i();
            return bundle;
        }
        object2 = object2.d;
        if (object2 != null && (object3 = ((CustomTemplateInAppData)object2).a) != null) {
            boolean bl4;
            xj3_02.getClass();
            Intrinsics.checkNotNullParameter(object3, "templateName");
            object5 = xj3_02.b;
            object3 = (eg0)((LinkedHashMap)object5).get(object3);
            if (object3 == null) {
                b2.getClass();
                com.clevertap.android.sdk.b.e();
                return bundle;
            }
            object3 = new CustomTemplateInAppData(null);
            ((CustomTemplateInAppData)object3).a = object5 = ((CustomTemplateInAppData)object2).a;
            ((CustomTemplateInAppData)object3).b = bl4 = ((CustomTemplateInAppData)object2).b;
            ((CustomTemplateInAppData)object3).c = object5 = ((CustomTemplateInAppData)object2).c;
            ((CustomTemplateInAppData)object3).d = object5 = ((CustomTemplateInAppData)object2).d;
            object2 = ((CustomTemplateInAppData)object2).e;
            if (object2 != null) {
                object5 = new JSONObject();
                qi_2.c((JSONObject)object5, (JSONObject)object2);
                ((CustomTemplateInAppData)object3).e = object5;
            }
            ((CustomTemplateInAppData)object3).b = n3;
            object2 = "wzrk_cgId";
            object5 = "wzrk_pivot";
            try {
                xj3_02 = new JSONObject();
                Object object7 = "ti";
                String string3 = ((CTInAppNotification)object).p;
                xj3_02.put((String)object7, string3);
                object7 = ((CTInAppNotification)object).f;
                xj3_02.put(string2, object7);
                string2 = "type";
                object7 = xf1_1.CUSTOM_CODE;
                object7 = ((xf1_1)((Object)object7)).toString();
                xj3_02.put(string2, object7);
                string2 = "efc";
                xj3_02.put(string2, n3);
                string2 = "excludeGlobalFCaps";
                xj3_02.put(string2, n3);
                object4 = "wzrk_ttl";
                long l2 = ((CTInAppNotification)object).D;
                xj3_02.put((String)object4, l2);
                object4 = ((CTInAppNotification)object).v;
                n3 = (int)(object4.has((String)object5) ? 1 : 0);
                if (n3 != 0) {
                    object4 = ((CTInAppNotification)object).v;
                    object4 = object4.optString((String)object5);
                    xj3_02.put((String)object5, object4);
                }
                if ((n3 = (int)((object4 = ((CTInAppNotification)object).v).has((String)object2) ? 1 : 0)) != 0) {
                    object4 = ((CTInAppNotification)object).v;
                    object4 = object4.optString((String)object2);
                    xj3_02.put((String)object2, object4);
                }
                object2 = new CTInAppNotification();
                boolean bl5 = ((CTInAppNotification)object).J;
                ((CTInAppNotification)object2).e((JSONObject)xj3_02, bl5);
                ((CTInAppNotification)object2).h((CustomTemplateInAppData)object3);
                object6 = object2;
            }
            catch (JSONException jSONException) {}
            if (object6 == null) {
                b2.getClass();
                com.clevertap.android.sdk.b.e();
                return bundle;
            }
            object = ((CTInAppNotification)object6).v;
            this.m((JSONObject)object);
            return bundle;
        }
        b2.getClass();
        com.clevertap.android.sdk.b.e();
        return bundle;
    }

    public final void a() {
        this.i(true);
    }

    public final void b() {
        this.i(false);
    }

    public final void e(JSONArray object) {
        block19: {
            Object object2 = this.c;
            String string2 = null;
            Object object3 = new bf1_0(this, 0);
            string2 = "<this>";
            Intrinsics.checkNotNullParameter(object, string2);
            string2 = "predicate";
            Intrinsics.checkNotNullParameter(object3, string2);
            string2 = new JSONArray();
            int n3 = object.length();
            for (int i3 = 0; i3 < n3; ++i3) {
                JSONObject jSONObject = object.optJSONObject(i3);
                if (jSONObject == null) continue;
                Object object4 = ((bf1_0)object3).invoke(jSONObject);
                object4 = (Boolean)object4;
                boolean bl2 = (Boolean)object4;
                if (!bl2) continue;
                string2.put((Object)jSONObject);
            }
            object = this.o;
            ((og1_0)object).a((JSONArray)string2);
            boolean bl3 = ((CleverTapInstanceConfig)object2).h;
            if (bl3) break block19;
            object = jh_1.a((CleverTapInstanceConfig)object2);
            object3 = "TAG_FEATURE_IN_APPS";
            object = ((kh_1)object).c((String)object3);
            object3 = new df1_0(this);
            string2 = "InappController#showNotificationIfAvailable";
            try {
                ((com.clevertap.android.sdk.task.a)object).c(string2, (Callable)object3);
            }
            catch (Exception exception) {
                object2 = ((CleverTapInstanceConfig)object2).a;
                object3 = "InAppController: : InApp notification handling error: ";
                object2 = new StringBuilder((String)object3);
                String string3 = exception.getMessage();
                ((StringBuilder)object2).append(string3);
                string3 = ((StringBuilder)object2).toString();
                object2 = this.l;
                object2.getClass();
                com.clevertap.android.sdk.b.f(string3);
            }
        }
    }

    public final boolean f() {
        int n3;
        Object object;
        int n4;
        Object object2;
        Object object3 = this.k;
        if (object3 == null) {
            block15: {
                object3 = new HashSet();
                this.k = object3;
                object3 = this.d;
                object3 = hg1_1.b((Context)object3);
                object3 = object3.d;
                if (object3 == null) break block15;
                object2 = ",";
                object3 = object3.split((String)object2);
                n4 = ((String[])object3).length;
                object = null;
                for (n3 = 0; n3 < n4; ++n3) {
                    String string2;
                    try {
                        string2 = object3[n3];
                    }
                    catch (Throwable throwable) {}
                    HashSet hashSet = this.k;
                    string2 = string2.trim();
                    hashSet.add(string2);
                    continue;
                    break;
                }
            }
            object3 = this.c.a;
            object3 = new StringBuilder("In-app notifications will not be shown on ");
            object2 = Arrays.toString(this.k.toArray());
            object3.append((String)object2);
            object3 = object3.toString();
            object2 = this.l;
            object2.getClass();
            com.clevertap.android.sdk.b.f((String)object3);
        }
        object3 = this.k.iterator();
        while ((n4 = object3.hasNext()) != 0) {
            object2 = (String)object3.next();
            object = E80.e();
            if (object != null) {
                object = object.getLocalClassName();
            } else {
                n3 = 0;
                object = null;
            }
            if (object == null || (n4 = ((String)object).contains((CharSequence)object2)) == 0) continue;
            return false;
        }
        return true;
    }

    public final void h(CTInAppNotification object) {
        b b2;
        Object object2;
        Object object3;
        block45: {
            Object object4;
            Object object5;
            block39: {
                int n3;
                block38: {
                    String string2;
                    int n4;
                    Object object6;
                    int n7;
                    block44: {
                        block40: {
                            block43: {
                                block42: {
                                    block41: {
                                        object3 = Looper.myLooper();
                                        if (object3 != (object2 = Looper.getMainLooper())) {
                                            object3 = new InAppController$4(this, (CTInAppNotification)object);
                                            this.n.post((Runnable)object3);
                                            return;
                                        }
                                        object3 = this.e.a;
                                        object2 = this.c;
                                        b2 = this.l;
                                        if (object3 == null) break block45;
                                        object5 = new Af1(this);
                                        try {
                                            object4 = Gf1.b((CTInAppNotification)object);
                                            n3 = 1;
                                            if (object4 == null) break block38;
                                        }
                                        catch (Exception | Throwable throwable) {}
                                        JSONObject jSONObject = ((CTInAppNotification)object).v;
                                        object5 = ((Af1)object5).invoke(jSONObject, object4);
                                        object5 = (Boolean)object5;
                                        boolean n8 = (Boolean)object5;
                                        if (n8) break block39;
                                        boolean bl2 = ((CTInAppNotification)object).k;
                                        if (bl2) break block38;
                                        object5 = object3.e;
                                        object4 = Gf1.b((CTInAppNotification)object);
                                        jSONObject = null;
                                        if (object4 == null) break block40;
                                        n7 = ((CTInAppNotification)object).x;
                                        if (n7 >= 0) break block41;
                                        n7 = 1000;
                                    }
                                    object5.getClass();
                                    object6 = "campaignId";
                                    Intrinsics.checkNotNullParameter(object4, (String)object6);
                                    object6 = ((df1_1)object5).d;
                                    object4 = ((LinkedHashMap)object6).get(object4);
                                    object4 = (List)object4;
                                    if (object4 == null) break block42;
                                    n4 = object4.size();
                                    break block43;
                                }
                                n4 = 0;
                                object4 = null;
                            }
                            if (n4 >= n7) break block39;
                            object4 = "imc";
                            string2 = object3.d;
                            object4 = Gf1.e((String)object4, string2);
                            n4 = object3.d(n3, (String)object4);
                            int n8 = ((df1_1)object5).e;
                            if (n8 >= n4) break block39;
                        }
                        object5 = Gf1.b((CTInAppNotification)object);
                        n4 = -1;
                        if (object5 == null) break block44;
                        n7 = ((CTInAppNotification)object).H;
                        if (n7 == n4) break block44;
                        object5 = object3.a((String)object5);
                        Object object7 = object5[n3];
                        n7 = ((CTInAppNotification)object).H;
                        if (object7 >= n7) break block39;
                    }
                    object5 = Gf1.b((CTInAppNotification)object);
                    if (object5 == null) break block38;
                    string2 = "istc_inapp";
                    object6 = object3.d;
                    string2 = Gf1.e(string2, (String)object6);
                    n7 = object3.d(0, string2);
                    object6 = "istmcd_inapp";
                    String string3 = object3.d;
                    object6 = Gf1.e((String)object6, string3);
                    int n10 = object3.d(n3, (String)object6);
                    if (n7 >= n10) break block39;
                    n7 = ((CTInAppNotification)object).G;
                    if (n7 == n4) break block38;
                    object3 = object3.a((String)object5);
                    Looper looper = object3[0];
                    if (looper >= n7) break block39;
                }
                this.b.getClass();
                object3 = this.d;
                InAppController.o((Context)object3, (CTInAppNotification)object, (CleverTapInstanceConfig)object2, this);
                boolean bl3 = ((CTInAppNotification)object).M;
                if (bl3) {
                    int n14;
                    object = this.f.e();
                    ((mp0$a_0)object).p = n14 = ((mp0$a_0)object).p + n3;
                    object = jh_1.a((CleverTapInstanceConfig)object2).a();
                    object2 = new ff1_0(this, (Context)object3);
                    object3 = "InAppController#incrementLocalInAppCountInPersistentStore";
                    ((com.clevertap.android.sdk.task.a)object).c((String)object3, (Callable)object2);
                }
                return;
            }
            object3 = ((CleverTapInstanceConfig)object2).a;
            object4 = "InApp has been rejected by FC, not showing ";
            object5 = new StringBuilder((String)object4);
            object = ((CTInAppNotification)object).f;
            ((StringBuilder)object5).append((String)object);
            object = ((StringBuilder)object5).toString();
            b2.b((String)object3, (String)object);
            boolean bl4 = ((CleverTapInstanceConfig)object2).h;
            if (!bl4) {
                object = jh_1.a((CleverTapInstanceConfig)object2).c("TAG_FEATURE_IN_APPS");
                object3 = new ef1_0(this);
                object2 = "InAppController#showInAppNotificationIfAny";
                ((com.clevertap.android.sdk.task.a)object).c((String)object2, (Callable)object3);
            }
            return;
        }
        object3 = ((CleverTapInstanceConfig)object2).a;
        object2 = new StringBuilder("getCoreState().getInAppFCManager() is NULL, not showing ");
        object = ((CTInAppNotification)object).f;
        ((StringBuilder)object2).append((String)object);
        object = ((StringBuilder)object2).toString();
        b2.b((String)object3, (String)object);
    }

    public final void i(boolean bl2) {
        boolean bl3;
        Iterator iterator = ((ck_1)this.b).b.iterator();
        while (bl3 = iterator.hasNext()) {
            bC2 bC22 = (bC2)iterator.next();
            if (bC22 == null) continue;
            bC22.a();
        }
    }

    public final Bundle j(CTInAppNotification cTInAppNotification, CTInAppNotificationButton cTInAppNotificationButton, Context context) {
        CTInAppAction cTInAppAction = cTInAppNotificationButton.h;
        if (cTInAppAction == null) {
            return null;
        }
        String string2 = cTInAppNotificationButton.f;
        return this.O1(cTInAppNotification, cTInAppAction, string2, null, context);
    }

    public final void k(JSONArray object) {
        int n3;
        block6: {
            bb0_0 bb0_02;
            Object object2;
            int n4;
            int n7;
            n3 = 1;
            Serializable serializable = wm1_1.c(this.f.d());
            Object object3 = yz3_0.a;
            object3 = new ArrayList();
            boolean bl2 = false;
            Object object4 = null;
            for (n7 = 0; n7 < (n4 = object.length()); n7 += n3) {
                object2 = object.getJSONObject(n7);
                ((ArrayList)object3).add(object2);
            }
            object = this.g;
            object.getClass();
            Intrinsics.checkNotNullParameter(object3, "appLaunchedNotifs");
            Intrinsics.checkNotNullParameter(serializable, "eventProperties");
            int n8 = 20;
            object4 = bb0_02;
            bb0_02 = new bb0_0("App Launched", (HashMap)serializable, null, null, n8);
            object3 = yB0.c((yB0)object, bb0_02, (ArrayList)object3);
            Intrinsics.checkNotNullParameter(object3, "inApps");
            object2 = xB0.c;
            object4 = new vB0((Function1)object2);
            serializable = al_2.e;
            object2 = new wB0((vB0)object4, (Function1)((Object)serializable));
            object3 = ((Iterable)CollectionsKt.e0((Iterable)object3, (Comparator)object2)).iterator();
            while ((n7 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object4 = (JSONObject)object3.next();
                n4 = (int)(object4.optBoolean((String)(object2 = "suppressed")) ? 1 : 0);
                if (n4 == 0) {
                    if (bl2) {
                        ((yB0)object).i();
                    }
                    object = new JSONArray();
                    object.put(object4);
                    break block6;
                }
                object2 = QB0.RAISED;
                ((yB0)object).j((JSONObject)object4, (QB0)((Object)object2));
                bl2 = true;
            }
            if (bl2) {
                ((yB0)object).i();
            }
            object = new JSONArray();
        }
        n3 = object.length();
        if (n3 > 0) {
            this.e((JSONArray)object);
        }
    }

    public final void l(String object, HashMap object2) {
        HashMap hashMap = wm1_1.c(this.f.d());
        hashMap.putAll(object2);
        object2 = this.g;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, "eventName");
        Intrinsics.checkNotNullParameter(hashMap, "eventProperties");
        int n3 = 20;
        bb0_0 bb0_02 = new bb0_0((String)object, hashMap, null, null, n3);
        object = kotlin.collections.a.b(bb0_02);
        ((yB0)object2).e((List)object);
        object = ((yB0)object2).d((List)object);
        int n4 = object.length();
        if (n4 > 0) {
            this.e((JSONArray)object);
        }
    }

    public final void l0(CTInAppNotification cTInAppNotification) {
        int n3;
        Object object;
        InAppController inAppController = this;
        Object object2 = this.e.a;
        object2.getClass();
        String string2 = Gf1.b(cTInAppNotification);
        if (string2 != null) {
            reference var15_15;
            reference var15_14;
            object = ((Gf1)object2).e;
            object.getClass();
            Object object3 = "campaignId";
            Intrinsics.checkNotNullParameter(string2, (String)object3);
            int n4 = ((df1_1)object).e;
            int n7 = 1;
            ((df1_1)object).e = n4 += n7;
            long l2 = ((df1_1)object).b.a();
            Object object4 = ((df1_1)object).d;
            Object object5 = ((LinkedHashMap)object4).get(string2);
            if (object5 == null) {
                object5 = new ArrayList();
                object4.put(string2, object5);
            }
            object5 = (List)object5;
            object4 = l2;
            object5.add((LinkedHashMap)object4);
            object = ((df1_1)object).a.b;
            if (object != null) {
                Intrinsics.checkNotNullParameter(string2, (String)object3);
                object5 = CollectionsKt.m0(((ef1_1)object).b(string2));
                object3 = l2;
                ((ArrayList)object5).add(object3);
                object3 = "__impressions_".concat(string2);
                String string3 = ",";
                int n8 = 62;
                object4 = CollectionsKt.R((Iterable)object5, string3, null, null, null, n8);
                object = ((ef1_1)object).a;
                ((vi_2)object).h((String)object3, (String)object4);
            }
            object = ((Gf1)object2).a(string2);
            object[0] = var15_14 = object[0] + n7;
            object[n7] = var15_15 = object[n7] + n7;
            object4 = ((Gf1)object2).d;
            object3 = Gf1.e("counts_per_inapp", (String)object4);
            object3 = ((Gf1)object2).j((String)object3);
            object3 = gc3_0.f(((Gf1)object2).c, (String)object3).edit();
            object4 = new StringBuilder();
            Object object6 = object[0];
            ((StringBuilder)object4).append((int)object6);
            String string3 = ",";
            ((StringBuilder)object4).append(string3);
            Object object7 = object[n7];
            ((StringBuilder)object4).append((int)object7);
            object = ((StringBuilder)object4).toString();
            object3.putString(string2, (String)object);
            gc3_0.i((SharedPreferences.Editor)object3);
            string2 = ((Gf1)object2).d;
            object = "istc_inapp";
            string2 = Gf1.e((String)object, string2);
            n3 = ((Gf1)object2).d(0, string2);
            object3 = ((Gf1)object2).d;
            object = Gf1.e((String)object, (String)object3);
            object2 = ((Gf1)object2).j((String)object);
            object = inAppController.d;
            gc3_0.j((Context)object, n3 += n7, (String)object2);
        }
        object2 = inAppController.a;
        n3 = 0;
        string2 = null;
        object = cTInAppNotification;
        ((we)object2).Y(false, cTInAppNotification, null);
        object2 = inAppController.b;
        try {
            object2.getClass();
        }
        catch (Throwable throwable) {
            object2 = inAppController.c.a;
            object2 = a$a.DEBUG;
            ((a$a)((Object)object2)).intValue();
        }
    }

    public final void m(JSONObject jSONObject) {
        Object object = this.c;
        Object object2 = ((CleverTapInstanceConfig)object).a;
        object2 = new StringBuilder("Preparing In-App for display: ");
        String string2 = jSONObject.toString();
        ((StringBuilder)object2).append(string2);
        object2 = ((StringBuilder)object2).toString();
        this.l.getClass();
        com.clevertap.android.sdk.b.f((String)object2);
        object = jh_1.a((CleverTapInstanceConfig)object).c("TAG_FEATURE_IN_APPS");
        object2 = new InAppController$b(this, jSONObject);
        ((com.clevertap.android.sdk.task.a)object).c("InappController#prepareNotificationForDisplay", (Callable)object2);
    }

    public final void n(CTInAppNotification object) {
        b b2;
        String string2;
        ol0_1 ol0_12;
        String string3;
        String string4;
        Object object2;
        block4: {
            block3: {
                Object object3;
                block2: {
                    object2 = this.i;
                    object2.getClass();
                    string4 = "notification";
                    Intrinsics.checkNotNullParameter(object, string4);
                    string3 = "inAppListener";
                    Intrinsics.checkNotNullParameter(this, string3);
                    ol0_12 = this.m;
                    string2 = "resourceProvider";
                    Intrinsics.checkNotNullParameter(ol0_12, string2);
                    object3 = ((CTInAppNotification)object).O;
                    object3 = object3 != null ? ((CustomTemplateInAppData)object3).a : null;
                    b2 = ((xj3_0)object2).a;
                    if (object3 != null) break block2;
                    b2.getClass();
                    object = "Cannot create TemplateContext from notification without template name";
                    com.clevertap.android.sdk.b.f((String)object);
                    break block3;
                }
                object2 = (eg0)((xj3_0)object2).b.get(object3);
                if (object2 != null) break block4;
                object = "Cannot create TemplateContext for non-registered template: ".concat((String)object3);
                b2.getClass();
                com.clevertap.android.sdk.b.f((String)object);
            }
            return;
        }
        Intrinsics.checkNotNullParameter(object2, "template");
        Intrinsics.checkNotNullParameter(object, string4);
        Intrinsics.checkNotNullParameter(this, string3);
        Intrinsics.checkNotNullParameter(ol0_12, string2);
        Intrinsics.checkNotNullParameter(b2, "logger");
        object = fg0.$EnumSwitchMapping$0;
        throw null;
    }

    public final void p(JSONObject jSONObject) {
        String string2 = "isHardPermissionRequest";
        boolean bl2 = false;
        Intent intent = null;
        boolean bl3 = jSONObject.optBoolean(string2, false);
        if (bl3) {
            string2 = E80.e();
            Objects.requireNonNull(string2);
            boolean bl4 = jSONObject.optBoolean("fallbackToNotificationSettings", false);
            intent = string2.getClass();
            Object object = InAppNotificationActivity.class;
            bl2 = intent.equals(object);
            if (!bl2) {
                intent = new Intent((Context)string2, object);
                object = new Bundle();
                CleverTapInstanceConfig cleverTapInstanceConfig = this.c;
                object.putParcelable("config", (Parcelable)cleverTapInstanceConfig);
                intent.putExtra("configBundle", object);
                CTInAppNotification cTInAppNotification = q;
                intent.putExtra("inApp", (Parcelable)cTInAppNotification);
                boolean bl5 = true;
                intent.putExtra("displayHardPermissionDialog", bl5);
                object = "shouldShowFallbackSettings";
                intent.putExtra((String)object, bl4);
                string2.startActivity(intent);
            }
        } else {
            this.m(jSONObject);
        }
    }
}

