/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.util.Base64
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.ril.ajio.payment.juspay;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import com.google.gson.GsonBuilder;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.payment.juspay.JuspayActivity$a;
import com.ril.ajio.payment.juspay.JuspayActivity$b;
import com.ril.ajio.services.data.Payment.EmiSdkInformation;
import com.ril.ajio.services.data.Payment.Order;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.Payment.TransactionStatusRequest;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.JsonUtils;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter;
import in.juspay.services.HyperServices;
import java.nio.charset.Charset;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class JuspayActivity
extends FragmentActivity
implements bn1_1 {
    public static final JuspayActivity$a Companion;
    public op2_2 X;
    public PEProgressView Y;
    public float Z;
    public TenantResponse k0;
    public boolean p0;

    static {
        JuspayActivity$a juspayActivity$a;
        Companion = juspayActivity$a = new Object();
    }

    public final void V0() {
        PEProgressView pEProgressView = this.Y;
        if (pEProgressView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            pEProgressView = null;
        }
        pEProgressView.dismiss();
    }

    public final void i0(JSONObject jSONObject) {
        int n3;
        boolean bl2;
        Object object;
        block12: {
            object = "backPressed";
            String string2 = "realtime";
            String string3 = "payload";
            bl2 = false;
            if (jSONObject != null) {
                boolean bl3 = jSONObject.has(string3);
                if (!bl3) break block12;
                jSONObject = jSONObject.getJSONObject(string3);
                boolean bl4 = jSONObject.has(string2);
                if (!bl4) break block12;
                jSONObject = jSONObject.getJSONObject(string2);
                n3 = (int)(jSONObject.has((String)object) ? 1 : 0);
                if (n3 == 0) break block12;
                try {
                    bl2 = jSONObject.getBoolean((String)object);
                }
                catch (Exception exception) {
                    object = yn3_0.a;
                    ((yn3$a)object).e(exception);
                }
            }
        }
        if (bl2) {
            this.p2();
        } else {
            boolean bl5 = this.p0;
            if (bl5) {
                jSONObject = new Handler();
                n3 = 1;
                object = new o71(this, n3);
                long l2 = 500L;
                jSONObject.postDelayed((Runnable)object, l2);
            } else {
                this.s2();
            }
        }
    }

    public final void onBackPressed() {
        boolean bl2;
        HyperServices hyperServices = xn.b;
        if (hyperServices != null) {
            bl2 = hyperServices.onBackPressed();
        } else {
            bl2 = false;
            hyperServices = null;
        }
        if (!bl2) {
            this.p2();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCreate(Bundle object) {
        float f5;
        int n3;
        Object object2;
        int n4;
        super.onCreate((Bundle)object);
        int n7 = R$layout.activity_juspay;
        this.setContentView(n7);
        n7 = R$id.pe_webview_progress_bar;
        object = (PEProgressView)this.findViewById(n7);
        this.Y = object;
        object = xn.b;
        Object object3 = null;
        if (object == null || (n7 = (int)(object.isInitialised() ? 1 : 0)) != (n4 = 1)) {
            object = this.Y;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                n7 = 0;
                object = null;
            }
            object.show();
        }
        AJIOApplication.Companion.getClass();
        object = UserInformation.getInstance((Context)AJIOApplication$a.a()).getCustomerUUID();
        Intrinsics.checkNotNullExpressionValue(object, "getCustomerUUID(...)");
        object = ij2_1.a((String)object);
        String string2 = "fragmentActivity";
        Intrinsics.checkNotNullParameter(this, string2);
        Intrinsics.checkNotNullParameter(object, "initiatePayload");
        Intrinsics.checkNotNullParameter(this, "juspayEventListener");
        Object object4 = xn.b;
        if (object4 == null) {
            xn.b = object4 = new HyperServices(this);
        }
        if ((object4 = xn.c) == null) {
            object4 = new HyperPaymentsCallbackAdapter();
            ((an1_1)object4).a = this;
            xn.c = object4;
        } else {
            ((an1_1)object4).a = this;
        }
        object4 = xn.b;
        Intrinsics.checkNotNull(object4);
        boolean bl2 = ((HyperServices)object4).isInitialised();
        if (!bl2 && (object4 = xn.b) != null) {
            object2 = xn.c;
            ((HyperServices)object4).initiate(this, (JSONObject)object, (HyperPaymentsCallback)object2);
        }
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        object4 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object2 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object4, "store");
        Intrinsics.checkNotNullParameter(object2, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        Object object5 = op2_2.class;
        Object[] objectArray = "modelClass";
        object = rl3_0.b((rd3_0)object4, (E$b)object2, (Wd0)object, object5, (String)objectArray);
        object4 = "<this>";
        object2 = sw0_0.a(object5, (String)object4, object5, (String)objectArray, (String)objectArray);
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        object4 = object2.getQualifiedName();
        if (object4 == null) {
            object3 = "Local and anonymous classes can not be ViewModels".toString();
            object = new IllegalArgumentException((String)object3);
            throw object;
        }
        object5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
        object4 = object5.concat((String)object4);
        this.X = object = (op2_2)object.a((yn1_2)object2, (String)object4);
        if (object != null && (object = object.m) != null) {
            n3 = 0;
            object4 = new zm1_1(this, 0);
            object2 = new JuspayActivity$b((Function1)object4);
            object.e(this, (F62)object2);
        }
        if ((object = this.X) != null && (object = object.o) != null) {
            n3 = 2;
            object4 = new A9(this, n3);
            object2 = new JuspayActivity$b((Function1)object4);
            object.e(this, (F62)object2);
        }
        object = this.getIntent();
        object4 = "html";
        object = object.getStringExtra((String)object4);
        object2 = this.getIntent();
        object5 = "getIntent(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
        int n8 = Build.VERSION.SDK_INT;
        int n10 = 33;
        if (n8 >= n10) {
            object2 = ln.a((Intent)object2);
        } else {
            object5 = "data_emi_json";
            n8 = (object2 = object2.getSerializableExtra((String)object5)) instanceof EmiSdkInformation;
            if (n8 == 0) {
                n3 = 0;
                object2 = null;
            }
            object2 = (EmiSdkInformation)object2;
        }
        object2 = (EmiSdkInformation)object2;
        n8 = (int)(this.getIntent().getBooleanExtra("IS_EMI_FLOW", false) ? 1 : 0);
        this.p0 = n8;
        object5 = this.getIntent();
        objectArray = "NET_PAYABLE";
        float f6 = 0.0f;
        this.Z = f5 = object5.getFloatExtra((String)objectArray, 0.0f);
        try {
            object5 = this.getIntent();
            objectArray = "TENANT_RESPONSE";
            object5 = object5.getStringExtra((String)objectArray);
            objectArray = TenantResponse.class;
            object5 = JsonUtils.fromJson((String)object5, objectArray);
            object5 = (TenantResponse)object5;
        }
        catch (Exception exception) {
            objectArray = yn3_0.a;
            objectArray.e(exception);
            n8 = 0;
            object5 = null;
            f5 = 0.0f;
        }
        this.k0 = object5;
        n10 = (int)(this.p0 ? 1 : 0);
        String string3 = "processPayload";
        if (n10 != 0) {
            object = new GsonBuilder();
            object = object.create().toJson(object2);
            Intrinsics.checkNotNullExpressionValue(object, "toJson(...)");
            object3 = new JSONObject((String)object);
            Intrinsics.checkNotNullParameter(this, string2);
            Intrinsics.checkNotNullParameter(object3, string3);
            object = xn.b;
            if (object == null) return;
            object.process(this, (JSONObject)object3);
            return;
        }
        if (object5 == null) {
            this.r2();
            return;
        }
        object2 = object5.getOrder();
        if (object2 != null) {
            object2 = ((Order)object2).getOrderId();
        } else {
            n3 = 0;
            object2 = null;
        }
        object5 = object5.getOrder();
        if (object5 != null && (object5 = object5.getAmount()) != null) {
            f6 = object5.floatValue();
        }
        object5 = UrlHelper.Companion.getInstance();
        objectArray = new Object[]{};
        object5 = Ft2.a(object5.getApiUrl("payment", "juspay_base_url", objectArray), "/callback/app");
        object5 = new String[]{object5};
        objectArray = new JSONObject();
        JSONObject jSONObject = new JSONObject();
        String string4 = "action";
        String string5 = "startJuspaySafe";
        try {
            jSONObject.put(string4, (Object)string5);
            if (object != null) {
                object3 = Charsets.UTF_8;
                object3 = object.getBytes((Charset)object3);
                object = "getBytes(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object);
            }
            object = Base64.encodeToString((byte[])object3, (int)0);
            jSONObject.put((String)object4, object);
            object = "amount";
            object3 = String.valueOf(f6);
            jSONObject.put((String)object, object3);
            object = "orderId";
            jSONObject.put((String)object, object2);
            object = new JSONArray();
            object3 = object5[0];
            object.put(object3);
            object3 = "endUrls";
            jSONObject.put((String)object3, object);
            object = "payload";
            objectArray.put((String)object, (Object)jSONObject);
            object = "service";
            object3 = "in.juspay.ec";
            objectArray.put((String)object, object3);
            object = "requestId";
            object3 = UUID.randomUUID();
            object3 = ((UUID)object3).toString();
            object4 = "toString(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            objectArray.put((String)object, object3);
        }
        catch (JSONException jSONException) {}
        objectArray.toString();
        Intrinsics.checkNotNullParameter(this, string2);
        Intrinsics.checkNotNullParameter(objectArray, string3);
        object = xn.b;
        if (object == null) return;
        object.process(this, (JSONObject)objectArray);
    }

    public final void p2() {
        Object object = this.Y;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            object = null;
        }
        object.show();
        object = this.X;
        if (object != null) {
            TenantResponse tenantResponse = this.k0;
            float f5 = this.Z;
            String string2 = "UserCancel";
            ((op2_2)object).c(string2, tenantResponse, f5);
        }
    }

    public final void r2() {
        PEProgressView pEProgressView = this.Y;
        if (pEProgressView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            pEProgressView = null;
        }
        pEProgressView.dismiss();
        pEProgressView = new Intent();
        Bundle bundle = new Bundle();
        pEProgressView.putExtras(bundle);
        this.setResult(0, (Intent)pEProgressView);
        this.finish();
    }

    public final void s2() {
        TenantResponse tenantResponse = this.k0;
        if (tenantResponse != null) {
            oo2_0.a.getClass();
            TransactionStatusRequest transactionStatusRequest = oo2_0.s(tenantResponse);
            Object object = this.Y;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                object = null;
            }
            ((PEProgressView)((Object)object)).show();
            object = this.X;
            if (object != null) {
                ((op2_2)object).m(transactionStatusRequest, tenantResponse);
            }
        }
    }
}

