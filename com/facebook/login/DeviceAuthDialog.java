/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.Html
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.TextView
 *  org.json.JSONObject
 */
package com.facebook.login;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$b;
import com.facebook.GraphRequest$c;
import com.facebook.appevents.g;
import com.facebook.common.R$id;
import com.facebook.common.R$layout;
import com.facebook.common.R$string;
import com.facebook.common.R$style;
import com.facebook.d;
import com.facebook.j;
import com.facebook.login.DeviceAuthDialog$RequestState;
import com.facebook.login.DeviceAuthDialog$b;
import com.facebook.login.DeviceAuthDialog$c;
import com.facebook.login.DeviceAuthMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.facebook.login.LoginClient$Result$a;
import com.facebook.login.LoginMethodHandler;
import com.facebook.login.b;
import com.facebook.login.c;
import com.facebook.login.h;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public class DeviceAuthDialog
extends DialogFragment {
    public View a;
    public TextView b;
    public TextView c;
    public DeviceAuthMethodHandler d;
    public final AtomicBoolean e;
    public volatile d f;
    public volatile ScheduledFuture g;
    public volatile DeviceAuthDialog$RequestState h;
    public boolean i;
    public boolean j;
    public LoginClient$Request k;

    public DeviceAuthDialog() {
        AtomicBoolean atomicBoolean;
        this.e = atomicBoolean = new AtomicBoolean();
    }

    public final void Oa(String string2, DeviceAuthDialog$b deviceAuthDialog$b, String string3, Date date, Date date2) {
        Object object = deviceAuthDialog$b;
        Object object2 = this.d;
        if (object2 != null) {
            AccessToken accessToken;
            String string4 = FacebookSdk.b();
            Object object3 = deviceAuthDialog$b.a;
            Collection collection = object3;
            collection = (Collection)object3;
            object3 = deviceAuthDialog$b.b;
            Collection collection2 = object3;
            collection2 = (Collection)object3;
            Object object4 = object = deviceAuthDialog$b.c;
            object4 = (Collection)object;
            F1 f1 = F1.DEVICE_AUTH;
            Intrinsics.checkNotNullParameter(string3, "accessToken");
            Intrinsics.checkNotNullParameter(string4, "applicationId");
            Intrinsics.checkNotNullParameter(string2, "userId");
            object3 = accessToken;
            Object object5 = date2;
            accessToken = new AccessToken(string3, string4, string2, collection, collection2, (Collection)object4, f1, date, null, date2);
            LoginClient$Request loginClient$Request = ((LoginMethodHandler)object2).e().g;
            Intrinsics.checkNotNullParameter(accessToken, "token");
            object5 = LoginClient$Result$a.SUCCESS;
            object = new LoginClient$Result(loginClient$Request, (LoginClient$Result$a)((Object)object5), accessToken, null, null);
            object2 = ((LoginMethodHandler)object2).e();
            ((LoginClient)object2).e((LoginClient$Result)object);
        }
        if ((object = this.getDialog()) != null) {
            object.dismiss();
        }
    }

    /*
     * WARNING - void declaration
     */
    public final View Pa(boolean bl2) {
        void var1_4;
        Object object = this.requireActivity().getLayoutInflater();
        String string2 = "requireActivity().layoutInflater";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        if (bl2) {
            int n3 = R$layout.com_facebook_smart_device_dialog_fragment;
        } else {
            int n4 = R$layout.com_facebook_device_auth_dialog_fragment;
        }
        string2 = null;
        View view = object.inflate((int)var1_4, null);
        Intrinsics.checkNotNullExpressionValue(view, "inflater.inflate(getLayo\u2026esId(isSmartLogin), null)");
        int n7 = R$id.progress_bar;
        object = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object, "view.findViewById(R.id.progress_bar)");
        this.a = object;
        n7 = R$id.confirmation_code;
        object = view.findViewById(n7);
        String string3 = "null cannot be cast to non-null type android.widget.TextView";
        Intrinsics.checkNotNull(object, string3);
        object = (TextView)object;
        this.b = object;
        n7 = R$id.cancel_button;
        object = view.findViewById(n7);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.widget.Button");
        object = (Button)object;
        int n8 = 1;
        eV eV2 = new eV(this, n8);
        object.setOnClickListener((View.OnClickListener)eV2);
        n7 = R$id.com_facebook_device_auth_instructions;
        object = view.findViewById(n7);
        Intrinsics.checkNotNull(object, string3);
        object = (TextView)object;
        this.c = object;
        if (object == null) {
            object = "instructions";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            string2 = object;
        }
        n7 = R$string.com_facebook_device_auth_instructions;
        object = Html.fromHtml((String)this.getString(n7));
        string2.setText((CharSequence)object);
        return view;
    }

    public final void Qa() {
        Object object = this.e;
        LoginClient$Result loginClient$Result = null;
        boolean bl2 = true;
        boolean bl3 = ((AtomicBoolean)object).compareAndSet(false, bl2);
        if (!bl3) {
            return;
        }
        object = this.h;
        if (object != null) {
            object = ((DeviceAuthDialog$RequestState)object).b;
            Qp0.a((String)object);
        }
        if ((object = this.d) != null) {
            LoginClient$Request loginClient$Request = ((LoginMethodHandler)object).e().g;
            LoginClient$Result$a loginClient$Result$a = LoginClient$Result$a.CANCEL;
            String string2 = "User canceled log in.";
            loginClient$Result = new LoginClient$Result(loginClient$Request, loginClient$Result$a, null, string2, null);
            object = ((LoginMethodHandler)object).e();
            ((LoginClient)object).e(loginClient$Result);
        }
        if ((object = this.getDialog()) != null) {
            object.dismiss();
        }
    }

    public final void Ra(FacebookException object) {
        Object object2 = "ex";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = this.e;
        boolean bl2 = true;
        boolean bl3 = ((AtomicBoolean)object3).compareAndSet(false, bl2);
        if (!bl3) {
            return;
        }
        object3 = this.h;
        if (object3 != null) {
            object3 = ((DeviceAuthDialog$RequestState)object3).b;
            Qp0.a((String)object3);
        }
        if ((object3 = this.d) != null) {
            Intrinsics.checkNotNullParameter(object, (String)object2);
            LoginClient$Request loginClient$Request = ((LoginMethodHandler)object3).e().g;
            object = ((Throwable)object).getMessage();
            object2 = new ArrayList();
            if (object != null) {
                ((ArrayList)object2).add(object);
            }
            String string2 = TextUtils.join((CharSequence)": ", object2);
            LoginClient$Result$a loginClient$Result$a = LoginClient$Result$a.ERROR;
            object = new LoginClient$Result(loginClient$Request, loginClient$Result$a, null, string2, null);
            object2 = ((LoginMethodHandler)object3).e();
            ((LoginClient)object2).e((LoginClient$Result)object);
        }
        if ((object = this.getDialog()) != null) {
            object.dismiss();
        }
    }

    public final void Sa(String string2, long l2, Long l3) {
        Date date;
        long l4;
        Bundle bundle = E1.a("fields", "id,permissions,name");
        Object object = null;
        long l7 = 1000L;
        long l8 = 0L;
        long l12 = l2 - l8;
        Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object2 != false) {
            Date date2 = new Date();
            l4 = date2.getTime();
            long l14 = l2 * l7 + l4;
            date = new Date(l14);
        } else {
            object2 = 0;
            date = null;
        }
        l4 = l3;
        long l15 = l4 == l8 ? 0 : (l4 < l8 ? -1 : 1);
        if (l15 != false) {
            l8 = l3 * l7;
            object = new Date(l8);
        }
        String string3 = FacebookSdk.b();
        Object object3 = new AccessToken(string2, string3, "0", null, null, null, null, date, null, (Date)object);
        Object object4 = GraphRequest.j;
        object4 = new com.facebook.login.d(this, string2, date, (Date)object);
        object = GraphRequest$c.g(object3, "me", (GraphRequest$b)object4);
        object3 = Qa1.GET;
        ((GraphRequest)object).k((Qa1)((Object)object3));
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        ((GraphRequest)object).d = bundle;
        ((GraphRequest)object).d();
    }

    public final void Ta() {
        Object object;
        Object object2 = this.h;
        if (object2 != null) {
            long l2;
            object = new Date();
            ((DeviceAuthDialog$RequestState)object2).e = l2 = ((Date)object).getTime();
        }
        Bundle bundle = new Bundle();
        object2 = this.h;
        object2 = object2 != null ? ((DeviceAuthDialog$RequestState)object2).c : null;
        bundle.putString("code", (String)object2);
        object2 = new StringBuilder();
        object = FacebookSdk.b();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append('|');
        object = FacebookSdk.c();
        ((StringBuilder)object2).append((String)object);
        object2 = ((StringBuilder)object2).toString();
        bundle.putString("access_token", (String)object2);
        object2 = GraphRequest.j;
        b b2 = new b(this);
        Qa1 qa1 = Qa1.POST;
        object2 = new GraphRequest(null, "device/login_status", bundle, qa1, b2, 32);
        object2 = ((GraphRequest)object2).d();
        this.f = object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void Ua() {
        ScheduledFuture<?> scheduledFuture = this.h;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = null;
        if (scheduledFuture != null) {
            long l2 = ((DeviceAuthDialog$RequestState)((Object)scheduledFuture)).d;
            scheduledFuture = l2;
        } else {
            scheduledFuture = null;
        }
        if (scheduledFuture == null) return;
        Object object = DeviceAuthMethodHandler.d;
        // MONITORENTER : object
        Object object2 = DeviceAuthMethodHandler.e;
        if (object2 == null) {
            int n3 = 1;
            DeviceAuthMethodHandler.e = object2 = new ScheduledThreadPoolExecutor(n3);
        }
        object2 = DeviceAuthMethodHandler.e;
        if (object2 == null) {
            object2 = "backgroundExecutor";
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            scheduledThreadPoolExecutor = object2;
        }
        // MONITOREXIT : object
        int n4 = 1;
        object = new kb_0(this, n4);
        long l3 = (Long)((Object)scheduledFuture);
        scheduledFuture = TimeUnit.SECONDS;
        this.g = scheduledFuture = scheduledThreadPoolExecutor.schedule((Runnable)object, l3, (TimeUnit)((Object)scheduledFuture));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Va(DeviceAuthDialog$RequestState var1_1) {
        block30: {
            block28: {
                block27: {
                    block26: {
                        block29: {
                            var2_2 = this;
                            var3_3 = var1_1;
                            var4_4 = 1;
                            this.h = var1_1;
                            var5_5 = this.b;
                            var6_8 = "confirmationCode";
                            if (var5_5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                                var7_9 /* !! */  = 0;
                                var5_5 = null;
                            }
                            var8_10 = var3_3.b;
                            var5_5.setText((CharSequence)var8_10);
                            var9_11 = var3_3.a;
                            var5_5 = Qp0.a;
                            var8_10 = Qp0.class;
                            var7_9 /* !! */  = td0.b(var8_10);
                            var10_12 = 0;
                            if (var7_9 /* !! */  != 0) break block29;
                            try {
                                var5_5 = EncodeHintType.class;
                                var11_14 = new EnumMap<K, V>(var5_5);
                                var5_5 = EncodeHintType.MARGIN;
                                var12_15 = 2;
                                var13_13 = var12_15;
                                var11_14.put(var5_5, var13_13);
                                try {
                                    var13_13 = new MultiFormatWriter();
                                    var14_16 = BarcodeFormat.QR_CODE;
                                    var15_17 = 200;
                                    var16_18 = 200;
                                    var5_5 = var13_13.encode(var9_11, var14_16, var15_17, var16_18, var11_14);
                                    var12_15 = var5_5.getHeight();
                                    var17_19 = var5_5.getWidth();
                                    var18_20 = var12_15 * var17_19;
                                    ** GOTO lbl-1000
                                }
                                catch (WriterException v0) {
                                }
                            }
                            catch (Throwable var5_6) {
                                break block26;
                            }
                        }
lbl42:
                        // 2 sources

                        while (true) {
                            var7_9 /* !! */  = 0;
                            var5_5 = null;
                            break block27;
                            break;
                        }
lbl-1000:
                        // 1 sources

                        {
                            var19_21 = new int[var18_20];
                            var14_16 = null;
                        }
                        for (var18_20 = 0; var18_20 < var12_15; var18_20 += var4_4) {
                            var15_17 = var18_20 * var17_19;
                            for (var16_18 = 0; var16_18 < var17_19; var16_18 += var4_4) {
                                var20_22 = var15_17 + var16_18;
                                {
                                    var21_23 = var5_5.get(var16_18, var18_20);
                                    var21_23 = var21_23 != 0 ? -16777216 : -1;
                                    var19_21[var20_22] = var21_23;
                                    continue;
                                }
                            }
                        }
                        {
                            var5_5 = Bitmap.Config.ARGB_8888;
                            var5_5 = Bitmap.createBitmap((int)var17_19, (int)var12_15, (Bitmap.Config)var5_5);
                        }
                        try {
                            var5_5.setPixels(var19_21, 0, var17_19, 0, 0, var17_19, var12_15);
                        }
                        catch (WriterException v1) {}
                        break block27;
                    }
                    td0.a(var8_10, var5_6);
                    ** while (true)
                }
                var9_11 = this.getResources();
                var13_13 = new BitmapDrawable((Resources)var9_11, (Bitmap)var5_5);
                var5_5 = var2_2.c;
                if (var5_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instructions");
                    var7_9 /* !! */  = 0;
                    var5_5 = null;
                }
                var5_5.setCompoundDrawablesWithIntrinsicBounds(null, (Drawable)var13_13, null, null);
                var5_5 = var2_2.b;
                if (var5_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var6_8);
                    var7_9 /* !! */  = 0;
                    var5_5 = null;
                }
                var5_5.setVisibility(0);
                var5_5 = var2_2.a;
                if (var5_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                    var7_9 /* !! */  = 0;
                    var5_5 = null;
                }
                var22_24 = 8;
                var5_5.setVisibility(var22_24);
                var7_9 /* !! */  = var2_2.j;
                if (var7_9 /* !! */  != 0) break block30;
                var5_5 = var3_3.b;
                var22_24 = (int)td0.b(var8_10);
                if (var22_24 != 0) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        var7_9 /* !! */  = 0;
                        var5_5 = null;
                        break block28;
                        break;
                    }
                }
                try {
                    var22_24 = (int)Qp0.c();
                    if (var22_24 == 0) ** GOTO lbl-1000
                    var6_8 = Qp0.a;
                    var7_9 /* !! */  = var6_8.d((String)var5_5);
                }
                catch (Throwable var5_7) {
                    td0.a(var8_10, var5_7);
                    ** continue;
                }
            }
            if (var7_9 /* !! */  != 0) {
                var5_5 = this.getContext();
                var6_8 = new g((Context)var5_5, null);
                Intrinsics.checkNotNullParameter(var6_8, "loggerImpl");
                var5_5 = FacebookSdk.a;
                var7_9 /* !! */  = com.facebook.j.c();
                if (var7_9 /* !! */  != 0) {
                    var5_5 = "fb_smart_login_service";
                    var6_8.h(null, (String)var5_5);
                }
            }
        }
        if ((var7_9 /* !! */  = (cfr_temp_0 = (var23_25 = var3_3.e) - (var25_26 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != 0) {
            var5_5 = new Date();
            var23_25 = var5_5.getTime();
            var27_27 = var3_3.e;
            var23_25 -= var27_27;
            var27_27 = var3_3.d;
            var29_28 = 1000L;
            cfr_temp_1 = (var23_25 -= (var27_27 *= var29_28)) - var25_26;
            var7_9 /* !! */  = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
            if (var7_9 /* !! */  >= 0) {
                var4_4 = 0;
            }
            var10_12 = var4_4;
        }
        if (var10_12 != 0) {
            this.Ua();
            return;
        }
        this.Ta();
    }

    public final void Wa(LoginClient$Request object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "request");
        this.k = object;
        Bundle bundle = new Bundle();
        Object object3 = ((LoginClient$Request)object).b;
        object3 = TextUtils.join((CharSequence)",", (Iterable)object3);
        bundle.putString("scope", (String)object3);
        Object object4 = ((LoginClient$Request)object).g;
        lz3_0.H(bundle, "redirect_uri", (String)object4);
        object = ((LoginClient$Request)object).i;
        lz3_0.H(bundle, "target_user_id", (String)object);
        object = new StringBuilder();
        int n3 = Xz3.a;
        object3 = FacebookSdk.b();
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append('|');
        object3 = FacebookSdk.c();
        ((StringBuilder)object).append((String)object3);
        object = ((StringBuilder)object).toString();
        object3 = "access_token";
        bundle.putString((String)object3, (String)object);
        object = Qp0.a;
        object = Qp0.class;
        n3 = (int)(td0.b(object) ? 1 : 0);
        object4 = null;
        if (n3 == 0) {
            object3 = new HashMap();
            String string2 = "device";
            String string3 = Build.DEVICE;
            object2 = "DEVICE";
            Intrinsics.checkNotNullExpressionValue(string3, object2);
            ((HashMap)object3).put(string2, string3);
            string2 = "model";
            string3 = Build.MODEL;
            object2 = "MODEL";
            Intrinsics.checkNotNullExpressionValue(string3, object2);
            ((HashMap)object3).put(string2, string3);
            string2 = new JSONObject(object3);
            object3 = string2.toString();
            string2 = "JSONObject(deviceInfo as Map<*, *>).toString()";
            try {
                Intrinsics.checkNotNullExpressionValue(object3, string2);
                object4 = object3;
            }
            catch (Throwable throwable) {
                td0.a(object, throwable);
            }
        }
        bundle.putString("device_info", (String)object4);
        object = GraphRequest.j;
        c c2 = new c(this);
        object2 = Qa1.POST;
        object4 = object;
        object = new GraphRequest(null, "device/login", bundle, (Qa1)((Object)object2), c2, 32);
        ((GraphRequest)object).d();
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = this.requireActivity();
        int n3 = R$style.com_facebook_auth_dialog;
        DeviceAuthDialog$c deviceAuthDialog$c = new DeviceAuthDialog$c(this, (FragmentActivity)object, n3);
        boolean bl2 = Qp0.c();
        if (bl2 && !(bl2 = this.j)) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        object = this.Pa(bl2);
        deviceAuthDialog$c.setContentView((View)object);
        return deviceAuthDialog$c;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        layoutInflater = super.onCreateView(layoutInflater, (ViewGroup)object, bundle);
        object = this.requireActivity();
        String string2 = "null cannot be cast to non-null type com.facebook.FacebookActivity";
        Intrinsics.checkNotNull(object, string2);
        object = (h)((FacebookActivity)object).X;
        object = object != null && (object = ((h)object).Oa()) != null ? ((LoginClient)object).g() : null;
        this.d = object = (DeviceAuthMethodHandler)object;
        if (bundle != null && (object = (DeviceAuthDialog$RequestState)bundle.getParcelable("request_state")) != null) {
            this.Va((DeviceAuthDialog$RequestState)object);
        }
        return layoutInflater;
    }

    public final void onDestroyView() {
        boolean bl2;
        this.i = bl2 = true;
        this.e.set(bl2);
        super.onDestroyView();
        Object object = this.f;
        if (object != null) {
            object.cancel(bl2);
        }
        if ((object = this.g) != null) {
            object.cancel(bl2);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        String string2 = "dialog";
        Intrinsics.checkNotNullParameter(dialogInterface, string2);
        super.onDismiss(dialogInterface);
        boolean bl2 = this.i;
        if (!bl2) {
            this.Qa();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.onSaveInstanceState(bundle);
        Object object = this.h;
        if (object != null) {
            object = "request_state";
            DeviceAuthDialog$RequestState deviceAuthDialog$RequestState = this.h;
            bundle.putParcelable((String)object, (Parcelable)deviceAuthDialog$RequestState);
        }
    }
}

