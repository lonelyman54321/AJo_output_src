/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnCreateContextMenuListener
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ArrayAdapter
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.EditText
 *  android.widget.ListAdapter
 *  android.widget.ListView
 */
package com.ril.ajio.devsettings;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.f$a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$array;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.devsettings.DevSettingsActivity$a;
import com.ril.ajio.remoteconfig.devsettings.view.ConfigEditActivity;
import com.ril.ajio.services.helper.UrlHelper;
import io.reactivex.Scheduler;
import io.reactivex.internal.functions.Functions;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class DevSettingsActivity
extends AppCompatActivity
implements View.OnClickListener,
np_1,
CompoundButton.OnCheckedChangeListener {
    public static final DevSettingsActivity$a Companion;
    public hy3_0 X;
    public final hh3_2 Y;
    public final Ko Z;
    public EditText k0;
    public CheckBox p0;

    static {
        DevSettingsActivity$a devSettingsActivity$a;
        Companion = devSettingsActivity$a = new Object();
    }

    public DevSettingsActivity() {
        Object object = new up0_2(this, 0);
        this.Y = object = yr1_2.b((Function0)object);
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        this.Z = object = new Ko((Context)aJIOApplication);
    }

    public final boolean P1(String string2) {
        if (string2 != null) {
            return Intrinsics.areEqual(string2, "CMS Preview");
        }
        return false;
    }

    public final void c0() {
        Object object = StringCompanionObject.INSTANCE;
        object = hv3_0.K(R$string.acc_alert_message);
        Object object2 = "Restarting...";
        int n3 = 1;
        Object object3 = new Object[n3];
        object3[0] = object2;
        String string2 = "format(...)";
        ZK1.e((Object[])object3, n3, (String)object, string2, (String)object2);
        object2 = "";
        object3 = this.Z;
        object = ((sw_0)object3).getPreference("base_url", (String)object2);
        int n4 = this.P1((String)object);
        if (n4 != 0) {
            object = ch_2.l;
            if (object != null && (n4 = ((String)object).equalsIgnoreCase((String)(object2 = "LUXE"))) == n3) {
                og1_1.g(n3 != 0, n3 != 0);
            } else {
                og1_1.g(false, n3 != 0);
            }
            object = nu1_0.a(this);
            object3 = null;
            object2 = new qg3_2(2, null);
            n3 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
        }
        object = new yp0_1(this);
        object2 = new o53_0((Callable)object);
        object = ti_2.a();
        object = ((g53_0)object2).e((Scheduler)object);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = new zp0_1(this, 0);
        ap0_0 ap0_02 = new ap0_0(object2, 0);
        object2 = Functions.d;
        ((g53_0)object).f(ap0_02, (o60_0)object2);
    }

    public final void onCheckedChanged(CompoundButton object, boolean bl2) {
        int n3;
        int n4;
        if (object != null && (n4 = object.getId()) == (n3 = R$id.ssl_pinning)) {
            object = "ssl_pinning";
            Ko ko = this.Z;
            if (bl2) {
                bl2 = true;
                ko.putPreference((String)object, bl2);
            } else {
                bl2 = false;
                ko.putPreference((String)object, false);
            }
        }
    }

    public void onClick(View object) {
        int n3;
        int n4;
        int n7 = 0;
        Object object2 = null;
        int n8 = 1;
        Object object3 = "Request time out set ";
        int n10 = 0;
        Object object4 = null;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n14 = R$id.btn_haptik_settings;
        Object object5 = "";
        if (object != null && (n3 = ((Integer)object).intValue()) == n14) {
            object = new f$a((Context)this);
            ((f$a)object).setTitle("Haptik");
            object4 = "HAPTIK_STAGING";
            object3 = new View[]{object4, "HAPTIK_PRODUCTION"};
            Ko ko = this.Z;
            String string2 = ko.getPreference("haptik_env", (String)object5);
            object5 = new Ref$IntRef();
            if (!(string2 != null && (n3 = (int)(b.k(string2) ? 1 : 0)) == 0 ? (n10 = Intrinsics.areEqual(object4, string2)) != 0 : (object4 = "prod") == (string2 = "qaregression"))) {
                n7 = 1;
            }
            ((Ref$IntRef)object5).element = n7;
            Object object6 = object3;
            object6 = (CharSequence[])object3;
            object4 = new vp0_0((Ref$IntRef)object5);
            ((f$a)object).setSingleChoiceItems((CharSequence[])object6, n7, (DialogInterface.OnClickListener)object4);
            object2 = new wp0_0(this, (String[])object3, (Ref$IntRef)object5);
            ((f$a)object).setPositiveButton("OK", (DialogInterface.OnClickListener)object2);
            object2 = new Object();
            object6 = "Cancel";
            ((f$a)object).setNegativeButton((CharSequence)object6, (DialogInterface.OnClickListener)object2);
            object = ((f$a)object).create();
            object2 = "create(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object.show();
        } else {
            int n15;
            n14 = R$id.backend_url_settings;
            String string3 = "context";
            if (object != null && (n15 = ((Integer)object).intValue()) == n14) {
                v03_0 v03_02 = new v03_0(this);
                Intrinsics.checkNotNullParameter(this, string3);
                object = LayoutInflater.from((Context)this);
                n7 = R$layout.dialog_app_settings;
                object = object.inflate(n7, null);
                object2 = hv3_0.C();
                int n16 = R$array.ajio_base_urls;
                Object[] objectArray = object2.getStringArray(n16);
                Intrinsics.checkNotNullExpressionValue(objectArray, "getStringArray(...)");
                object2 = new Dialog((Context)this);
                object2.requestWindowFeature(n8);
                object2.setContentView((View)object);
                object2.show();
                object2.setCancelable(n8 != 0);
                n16 = R$id.setting_list;
                object3 = object.findViewById(n16);
                View view = object3;
                view = (ListView)object3;
                n10 = 17367055;
                object3 = new ArrayAdapter((Context)this, n10, objectArray);
                view.setAdapter((ListAdapter)object3);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                object4 = v03_02.b;
                ref$ObjectRef.element = object3 = ((sw_0)object4).getPreference("base_url", (String)object5);
                n16 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                if (n16 != 0) {
                    ref$ObjectRef.element = object3 = UrlHelper.Companion.getInstance().getBaseUrl();
                }
                n16 = objectArray.length;
                object3 = xx_2.i(Arrays.copyOf(objectArray, n16));
                object4 = ref$ObjectRef.element;
                n16 = object3.indexOf(object4);
                view.setItemChecked(n16, n8 != 0);
                Object object7 = new t03_0((String[])objectArray, v03_02, (Context)this);
                view.setOnItemClickListener((AdapterView.OnItemClickListener)object7);
                n8 = R$id.close_button;
                object7 = (AjioImageView)object.findViewById(n8);
                n10 = 2;
                object3 = new vk_2((View.OnCreateContextMenuListener)object2, n10);
                object7.setOnClickListener((View.OnClickListener)object3);
                n8 = R$id.settings_apply;
                object = (AjioButton)object.findViewById(n8);
                object7 = new u03_0((ListView)view, (String[])objectArray, v03_02, ref$ObjectRef, (Dialog)object2);
                object.setOnClickListener((View.OnClickListener)object7);
                object = object2.getWindow();
                if (object != null) {
                    n8 = 16;
                    object.setSoftInputMode(n8);
                }
                hv3_0.e0((Dialog)object2);
            } else {
                n14 = R$id.remote_config_settings;
                if (object != null && (n15 = ((Integer)object).intValue()) == n14) {
                    ConfigEditActivity.Companion.getClass();
                    Intrinsics.checkNotNullParameter(this, string3);
                    object2 = ConfigEditActivity.class;
                    object = new Intent((Context)this, (Class)object2);
                    this.startActivity((Intent)object);
                } else {
                    n14 = R$id.button_timeout;
                    if (object != null && (n4 = ((Integer)object).intValue()) == n14) {
                        block39: {
                            String string4;
                            block38: {
                                block37: {
                                    object = this.k0;
                                    string4 = "edtTxtTimeout";
                                    if (object != null) break block37;
                                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                                    n4 = 0;
                                    object = null;
                                }
                                object = object.getText();
                                object = object.toString();
                                object = StringsKt.m0((CharSequence)object);
                                object = object.toString();
                                n4 = Integer.parseInt((String)object);
                                hv3_0.S(this);
                                string3 = this.k0;
                                if (string3 == null) break block38;
                                object4 = string3;
                                break block39;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                        }
                        object4.setText((CharSequence)object5);
                        object4 = TimeUnit.MILLISECONDS;
                        long l2 = n4;
                        long l3 = ((TimeUnit)((Object)object4)).toSeconds(l2);
                        object = new StringBuilder((String)object3);
                        ((StringBuilder)object).append(l3);
                        object3 = " Second";
                        ((StringBuilder)object).append((String)object3);
                        object = ((StringBuilder)object).toString();
                        object3 = StringCompanionObject.INSTANCE;
                        int n17 = R$string.acc_error_message;
                        object3 = hv3_0.K(n17);
                        object4 = new Object[n8];
                        object4[0] = object;
                        object2 = Arrays.copyOf(object4, n8);
                        object2 = String.format((String)object3, object2);
                        String string5 = "format(...)";
                        Intrinsics.checkNotNullExpressionValue(object2, string5);
                        try {
                            mq0_2.b((String)object, (String)object2);
                        }
                        catch (Exception exception) {
                            object2 = yn3_0.a;
                            object2.e(exception);
                        }
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = R$layout.activity_dev_settings;
        this.setContentView(n3);
        n3 = R$id.btn_haptik_settings;
        object = this.findViewById(n3);
        Object object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (Button)object;
        int n4 = R$id.backend_url_settings;
        Object object3 = this.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = (Button)object3;
        int n7 = R$id.remote_config_settings;
        Object object4 = this.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
        object4 = (Button)object4;
        int n8 = R$id.button_timeout;
        Object object5 = this.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object2);
        object5 = (Button)object5;
        int n10 = R$id.edittext_timeout;
        object2 = (EditText)this.findViewById(n10);
        String string2 = "<set-?>";
        Intrinsics.checkNotNullParameter(object2, string2);
        this.k0 = object2;
        n10 = R$id.ssl_pinning;
        object2 = (CheckBox)this.findViewById(n10);
        Intrinsics.checkNotNullParameter(object2, string2);
        this.p0 = object2;
        object2 = "ssl_pinning";
        n10 = (int)(this.Z.getPreference((String)object2, false) ? 1 : 0);
        string2 = null;
        String string3 = "sslPinning";
        if (n10 != 0) {
            object2 = this.p0;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n10 = 0;
                object2 = null;
            }
            boolean bl2 = true;
            object2.setChecked(bl2);
        }
        if ((object2 = this.p0) != null) {
            string2 = object2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
        }
        string2.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
        object3.setOnClickListener((View.OnClickListener)this);
        object4.setOnClickListener((View.OnClickListener)this);
        object5.setOnClickListener((View.OnClickListener)this);
        object.setOnClickListener((View.OnClickListener)this);
        object = kd3_2.a();
        object3 = this.getApplication();
        Intrinsics.checkNotNullExpressionValue(object3, "getApplication(...)");
        object2 = new UserRepo((Application)object3);
        object3 = this.getApplication();
        ((kd3_2)object).a = object2;
        ((kd3_2)object).b = object3;
        Intrinsics.checkNotNull(object);
        object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object3 = "factory";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object4 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object2 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object4, "store");
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "defaultCreationExtras");
        object3 = hy3_0.class;
        object5 = "modelClass";
        object = im_1.a((rd3_0)object4, (kd3_2)object, (Wd0)object2, (Class)object3, (String)object5);
        object2 = "<this>";
        object3 = sw0_0.a((Class)object3, (String)object2, (Class)object3, (String)object5, (String)object5);
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = object3.getQualifiedName();
        if (object2 != null) {
            object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object2);
            this.X = object = (hy3_0)((pD3)object).a((yn1_2)object3, (String)object2);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

