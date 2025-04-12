/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.Window
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.InAppNotificationActivity$a;
import com.clevertap.android.sdk.InAppNotificationActivity$b;
import com.clevertap.android.sdk.InAppNotificationActivity$c;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.c;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppBaseFullFragment;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialFragment;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialImageFragment;
import com.clevertap.android.sdk.inapp.CTInAppNativeInterstitialImageFragment;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.e;
import com.clevertap.android.sdk.inapp.f;
import com.clevertap.android.sdk.task.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class InAppNotificationActivity
extends FragmentActivity
implements lf1_1,
pq0_0 {
    public static boolean r0 = false;
    public CleverTapInstanceConfig X;
    public CTInAppNotification Y;
    public WeakReference Z;
    public WeakReference k0;
    public c p0;
    public boolean q0 = false;

    public final void N1(CTInAppNotification cTInAppNotification, Bundle bundle) {
        this.r2(bundle);
    }

    public final Bundle O1(CTInAppNotification cTInAppNotification, CTInAppAction cTInAppAction, String string2, Bundle bundle, Context context) {
        lf1_1 lf1_12 = this.u2();
        if (lf1_12 != null) {
            return lf1_12.O1(cTInAppNotification, cTInAppAction, string2, bundle, (Context)this);
        }
        return null;
    }

    public final void a2(boolean bl2) {
        this.w2(bl2);
    }

    public final void finish() {
        super.finish();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 34;
        if (n3 >= n4) {
            mf1_1.a(this);
        } else {
            n3 = 0x10A0000;
            n4 = 0x10A0001;
            this.overridePendingTransition(n3, n4);
        }
    }

    public final Bundle j(CTInAppNotification cTInAppNotification, CTInAppNotificationButton cTInAppNotificationButton, Context object) {
        object = this.u2();
        if (object != null) {
            return object.j(cTInAppNotification, cTInAppNotificationButton, (Context)this);
        }
        return null;
    }

    public final void l0(CTInAppNotification cTInAppNotification) {
        this.t2();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCreate(Bundle object) {
        block11: {
            boolean bl2;
            CTInAppNotification cTInAppNotification;
            Object object2;
            String string2;
            int n3;
            int n4;
            int n7;
            Object object3;
            Object object4;
            Object object5;
            block12: {
                object5 = "inApp";
                super.onCreate((Bundle)object);
                object4 = this.getOnBackPressedDispatcher();
                object3 = new InAppNotificationActivity$a(this);
                ((d82_0)object4).a(this, (W72)object3);
                object4 = this.getResources().getConfiguration();
                n7 = ((Configuration)object4).orientation;
                n4 = 2;
                if (n7 == n4) {
                    Window window = this.getWindow();
                    n3 = 1024;
                    window.addFlags(n3);
                }
                try {
                    CTInAppNotification cTInAppNotification2;
                    Intent intent = this.getIntent();
                    Bundle bundle = intent.getExtras();
                    if (bundle == null) break block11;
                    Parcelable parcelable = bundle.getParcelable((String)object5);
                    this.Y = cTInAppNotification2 = (CTInAppNotification)parcelable;
                    String string3 = "displayHardPermissionDialog";
                    n3 = (int)(bundle.getBoolean(string3, false) ? 1 : 0);
                    Object object6 = "configBundle";
                    object6 = bundle.getBundle((String)object6);
                    string2 = "config";
                    if (object6 != null) {
                        object6 = object6.getParcelable(string2);
                        this.X = object6 = (CleverTapInstanceConfig)object6;
                    }
                    object6 = this.X;
                    object6 = com.clevertap.android.sdk.a.k((Context)this, (CleverTapInstanceConfig)object6);
                    object6 = ((com.clevertap.android.sdk.a)object6).b;
                    object6 = ((H80)object6).k;
                    object2 = new WeakReference(object6);
                    this.Z = object2;
                    object6 = this.X;
                    object6 = com.clevertap.android.sdk.a.k((Context)this, (CleverTapInstanceConfig)object6);
                    object6 = ((com.clevertap.android.sdk.a)object6).b;
                    object6 = ((H80)object6).k;
                    object2 = new WeakReference(object6);
                    this.k0 = object2;
                    object2 = this.X;
                    this.p0 = object6 = new c(this, (CleverTapInstanceConfig)object2);
                    if (n3 != 0) {
                        object = "shouldShowFallbackSettings";
                        boolean bl3 = bundle.getBoolean((String)object, false);
                        this.w2(bl3);
                        return;
                    }
                    cTInAppNotification = this.Y;
                    if (cTInAppNotification != null) break block12;
                    this.finish();
                    return;
                }
                catch (Throwable throwable) {}
            }
            n3 = (int)(cTInAppNotification.s ? 1 : 0);
            int n8 = 1;
            object2 = null;
            if (n3 != 0 && !(bl2 = cTInAppNotification.r)) {
                if (n7 == n4) {
                    b.c();
                    this.finish();
                    this.s2(null, n8 != 0);
                    return;
                }
                b.c();
            }
            object3 = this.Y;
            bl2 = ((CTInAppNotification)object3).s;
            if (!bl2 && (n4 = (int)(((CTInAppNotification)object3).r ? 1 : 0)) != 0) {
                if (n7 == n8) {
                    b.c();
                    this.finish();
                    this.s2(null, n8 != 0);
                    return;
                }
                b.c();
            }
            if (object == null) {
                object = this.p2();
                if (object == null) return;
                object4 = new Bundle();
                object3 = this.Y;
                object4.putParcelable((String)object5, (Parcelable)object3);
                object5 = this.X;
                object4.putParcelable(string2, (Parcelable)object5);
                ((Fragment)object).setArguments((Bundle)object4);
                object5 = this.getSupportFragmentManager();
                object5.getClass();
                object4 = new androidx.fragment.app.a((FragmentManager)object5);
                int n10 = 0x10B0000;
                ((k)object4).k(n10, 0x10B0001, 0, 0);
                object5 = new StringBuilder();
                object3 = this.X.a;
                String string4 = ":CT_INAPP_CONTENT_FRAGMENT";
                object5 = h30_0.a((StringBuilder)object5, (String)object3, string4);
                n4 = 0x1020002;
                ((androidx.fragment.app.a)object4).h(n4, (Fragment)object, (String)object5, n8);
                ((androidx.fragment.app.a)object4).p();
                return;
            }
            boolean bl4 = r0;
            if (!bl4) return;
            this.p2();
            return;
        }
        object = new IllegalArgumentException();
        throw object;
        b.l();
        this.finish();
    }

    public final void onDestroy() {
        super.onDestroy();
        boolean bl2 = this.isChangingConfigurations();
        if (!bl2) {
            bl2 = false;
            this.s2(null, false);
        }
    }

    public final void onRequestPermissionsResult(int n3, String[] object, int[] nArray) {
        super.onRequestPermissionsResult(n3, (String[])object, nArray);
        object = this.X;
        yi_1.a((Context)this, (CleverTapInstanceConfig)object);
        object = null;
        yi_1.c = false;
        Object object2 = this.X;
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(object2, "config");
        object2 = jh_1.a((CleverTapInstanceConfig)object2).a();
        xi_2 xi_22 = new xi_2((Context)this);
        String string2 = "updateCacheToDisk";
        ((a)object2).c(string2, xi_22);
        int n4 = 102;
        if (n3 == n4) {
            n3 = nArray.length;
            if (n3 > 0 && (n3 = nArray[0]) == 0) {
                InAppNotificationActivity$c inAppNotificationActivity$c = (InAppNotificationActivity$c)this.k0.get();
                inAppNotificationActivity$c.a();
            } else {
                InAppNotificationActivity$c inAppNotificationActivity$c = (InAppNotificationActivity$c)this.k0.get();
                inAppNotificationActivity$c.b();
            }
            n3 = 1;
            object = null;
            this.s2(null, n3 != 0);
        }
    }

    public final void onResume() {
        boolean bl2;
        super.onResume();
        Object object = this.p0;
        boolean bl3 = ((c)object).d;
        if (bl3 && (bl3 = Build.VERSION.SDK_INT) >= (bl2 = 33 != 0)) {
            object = "android.permission.POST_NOTIFICATIONS";
            bl3 = t70.checkSelfPermission((Context)this, (String)object);
            if (!bl3) {
                object = (InAppNotificationActivity$c)this.k0.get();
                object.a();
            } else {
                object = (InAppNotificationActivity$c)this.k0.get();
                object.b();
            }
            bl3 = true;
            bl2 = false;
            this.s2(null, bl3);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final CTInAppBaseFullFragment p2() {
        Object object = this.Y.q;
        Object object2 = InAppNotificationActivity$b.a;
        int n3 = ((Enum)object).ordinal();
        int n4 = object2[n3];
        switch (n4) {
            default: {
                object2 = this.X.b();
                ((ei_1)((Object)object)).toString();
                ((b)object2).a();
                return null;
            }
            case 10: {
                object = this.Y.e;
                n4 = (int)(((ArrayList)object).isEmpty() ? 1 : 0);
                if (n4 != 0) {
                    object = this.X.b();
                    object.getClass();
                    b.e();
                    return null;
                } else {
                    n4 = 0;
                    Object object3 = (CTInAppNotificationButton)((ArrayList)object).get(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder((Context)this, 16974394);
                    object2 = builder.setCancelable(false);
                    String string2 = this.Y.E;
                    object2 = object2.setTitle((CharSequence)string2);
                    String string3 = this.Y.z;
                    object2 = object2.setMessage((CharSequence)string3);
                    String string4 = ((CTInAppNotificationButton)object3).f;
                    nf1_1 nf1_12 = new nf1_1(this, (CTInAppNotificationButton)object3);
                    object2 = object2.setPositiveButton((CharSequence)string4, (DialogInterface.OnClickListener)nf1_12).create();
                    object3 = this.Y.e;
                    n3 = ((ArrayList)object3).size();
                    int n7 = 1;
                    int n8 = 2;
                    if (n3 == n8) {
                        object3 = (CTInAppNotificationButton)((ArrayList)object).get(n7);
                        String string5 = ((CTInAppNotificationButton)object3).f;
                        of1_1 of1_12 = new of1_1(this, (CTInAppNotificationButton)object3);
                        n3 = -2;
                        object2.setButton(n3, (CharSequence)string5, (DialogInterface.OnClickListener)of1_12);
                    }
                    if ((n3 = ((ArrayList)object).size()) > n8) {
                        object = (CTInAppNotificationButton)((ArrayList)object).get(n8);
                        object3 = ((CTInAppNotificationButton)object).f;
                        pf1_1 pf1_12 = new pf1_1(this, (CTInAppNotificationButton)object);
                        int n10 = -3;
                        object2.setButton(n10, (CharSequence)object3, (DialogInterface.OnClickListener)pf1_12);
                    }
                    object2.show();
                    r0 = n7;
                    this.t2();
                }
                return null;
            }
            case 9: {
                return new CTInAppNativeHalfInterstitialImageFragment();
            }
            case 8: {
                return new CTInAppNativeInterstitialImageFragment();
            }
            case 7: {
                return new e();
            }
            case 6: {
                return new CTInAppNativeHalfInterstitialFragment();
            }
            case 5: {
                return new f();
            }
            case 4: {
                return new ai_1();
            }
            case 3: {
                return new xh_0();
            }
            case 2: {
                return new zh_1();
            }
            case 1: 
        }
        return new vh_1();
    }

    public final void r2(Bundle bundle) {
        this.s2(bundle, true);
    }

    public final void s2(Bundle bundle, boolean bl2) {
        lf1_1 lf1_12;
        boolean bl3 = r0;
        if (bl3) {
            bl3 = false;
            lf1_12 = null;
            r0 = false;
        }
        if (!(bl3 = this.q0)) {
            boolean bl4;
            CTInAppNotification cTInAppNotification;
            lf1_12 = this.u2();
            if (lf1_12 != null && (cTInAppNotification = this.Y) != null) {
                lf1_12.N1(cTInAppNotification, bundle);
            }
            this.q0 = bl4 = true;
        }
        if (bl2) {
            this.finish();
        }
    }

    public final void setTheme(int n3) {
        super.setTheme(0x1030010);
    }

    public final void t2() {
        lf1_1 lf1_12 = this.u2();
        if (lf1_12 != null) {
            CTInAppNotification cTInAppNotification = this.Y;
            lf1_12.l0(cTInAppNotification);
        }
    }

    public final lf1_1 u2() {
        Object object = this.Z;
        object = ((Reference)object).get();
        try {
            object = (lf1_1)object;
        }
        catch (Throwable throwable) {
            object = null;
        }
        if (object == null) {
            b b2 = this.X.b();
            String string2 = this.X.a;
            CharSequence charSequence = new StringBuilder("InAppActivityListener is null for notification: ");
            JSONObject jSONObject = this.Y.v;
            charSequence.append(jSONObject);
            charSequence = charSequence.toString();
            b2.b(string2, (String)charSequence);
        }
        return object;
    }

    public final void v2(CTInAppNotificationButton object, boolean bl2) {
        Object object2;
        Object object3;
        lf1_1 lf1_12 = this.u2();
        if (lf1_12 != null) {
            object3 = this.Y;
            lf1_12 = lf1_12.j((CTInAppNotification)object3, (CTInAppNotificationButton)object, (Context)this);
        } else {
            lf1_12 = null;
        }
        if (bl2) {
            object2 = this.Y;
            boolean bl3 = object2.M;
            if (bl3) {
                boolean bl4 = object2.N;
                this.w2(bl4);
                return;
            }
        }
        if ((object = object.h) != null && (object2 = xf1_1.REQUEST_FOR_PERMISSIONS) == (object3 = ((CTInAppAction)object).a)) {
            boolean bl5 = ((CTInAppAction)object).e;
            this.w2(bl5);
            return;
        }
        this.s2((Bundle)lf1_12, true);
    }

    public final void w2(boolean bl2) {
        c c2 = this.p0;
        InAppNotificationActivity$c inAppNotificationActivity$c = (InAppNotificationActivity$c)this.k0.get();
        c2.a(bl2, inAppNotificationActivity$c);
    }
}

