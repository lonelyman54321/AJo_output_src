/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 *  android.widget.TextView
 */
package com.ril.ajio.payment.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.D;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.payment.fragment.d$a;
import com.ril.ajio.payment.fragment.d$b;
import com.ril.ajio.payment.fragment.d$c;
import com.ril.ajio.payment.fragment.d$d;
import com.ril.ajio.payment.fragment.d$e;
import com.ril.ajio.payment.query.QueryLPBalance;
import com.ril.ajio.payment.query.QueryResendOtp;
import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.helper.UrlHelper;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;

public final class d
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public static final d$a Companion;
    public final hh3_2 a;
    public final D b;
    public TextView c;
    public EditText d;
    public EditText e;
    public View f;
    public View g;
    public PEProgressView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public int m;
    public String n;
    public String o;
    public String p;
    public vp1_2 q;
    public up1_2 r;
    public LpStoredCardBalance s;
    public boolean t;

    static {
        d$a d$a;
        Companion = d$a = new Object();
    }

    public d() {
        Object object = new rp0_2(this, 1);
        this.a = object = yr1_2.b((Function0)object);
        object = Reflection.getOrCreateKotlinClass(kj2_1.class);
        d$c d$c = new d$c(this);
        d$d d$d = new d$d(this);
        d$e d$e = new d$e(this);
        this.b = object = LW0.a(this, (yn1_2)object, d$c, d$d, d$e);
    }

    public final op2_2 Oa() {
        return (op2_2)this.a.getValue();
    }

    public final kj2_1 Pa() {
        return (kj2_1)this.b.getValue();
    }

    public final void Qa(boolean bl2) {
        TextView textView = this.c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("submitBtn");
            textView = null;
        }
        textView.setEnabled(bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Ra(EditText editText) {
        Exception exception2;
        block4: {
            String string2;
            Object object;
            block3: {
                boolean bl2;
                block2: {
                    try {
                        object = this.getActivity();
                        if (object == null) return;
                        bl2 = object.isFinishing();
                        if (bl2) return;
                        object = this.getActivity();
                        if (object == null) break block2;
                        string2 = "input_method";
                        object = object.getSystemService(string2);
                        break block3;
                    }
                    catch (Exception exception2) {
                        break block4;
                    }
                }
                bl2 = false;
                object = null;
            }
            string2 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
            Intrinsics.checkNotNull(object, string2);
            object = (InputMethodManager)object;
            editText = editText.getWindowToken();
            string2 = null;
            object.hideSoftInputFromWindow((IBinder)editText, 0);
            return;
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(exception2);
    }

    public final void Sa() {
        int n3 = this.m;
        long l2 = 200L;
        Object object = "titleTv";
        int n4 = 8;
        String string2 = "otpLayout";
        String string3 = "mobileLayout";
        Object object2 = null;
        int n7 = 1;
        if (n3 == n7) {
            Object object3 = this.f;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object3 = null;
            }
            object3.setVisibility(0);
            object3 = this.g;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object3 = null;
            }
            object3.setVisibility(n4);
            object3 = this.j;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n3 = 0;
                object3 = null;
            }
            object = "Registered Phone Number";
            object3.setText((CharSequence)object);
            object3 = this.d;
            if (object3 == null) {
                object3 = "mobileNumberEt";
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                object2 = object3;
            }
            object2.requestFocus();
            object3 = new qp1_2(this, (EditText)object2);
            try {
                object2.postDelayed((Runnable)object3, l2);
            }
            catch (Exception exception) {
                yn3$a yn3$a = yn3_0.a;
                yn3$a.e(exception);
            }
        } else {
            Object object4;
            Object object5 = this.n;
            n3 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0);
            if (n3 == 0) {
                object5 = this.i;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("otpHeaderTv");
                    n3 = 0;
                    object5 = null;
                }
                Object object6 = StringCompanionObject.INSTANCE;
                object6 = this.n;
                Object[] objectArray = new Object[n7];
                objectArray[0] = object6;
                object6 = "To complete the payment enter OTP sent to registered phone number %s";
                String string4 = "format(...)";
                zn0_1.b(objectArray, n7, (String)object6, string4, (TextView)object5);
            }
            if ((object5 = this.g) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object5 = null;
            }
            object5.setVisibility(0);
            object5 = this.f;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object5 = null;
            }
            object5.setVisibility(n4);
            object5 = this.j;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n3 = 0;
                object5 = null;
            }
            object = "Authenticate Payment";
            object5.setText((CharSequence)object);
            object5 = this.e;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("otpEt");
                n3 = 0;
                object5 = null;
            }
            object5.requestFocus();
            object = new qp1_2(this, (EditText)object5);
            try {
                object5.postDelayed((Runnable)object, l2);
            }
            catch (Exception exception) {
                object4 = yn3_0.a;
                ((yn3$a)object4).e(exception);
            }
            object5 = this.k;
            object4 = "timerTv";
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object5 = null;
            }
            String string5 = "60s";
            object5.setText((CharSequence)string5);
            object5 = this.k;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object5 = null;
            }
            object5.setOnClickListener(null);
            object5 = this.l;
            if (object5 == null) {
                object5 = "resendLbl";
                Intrinsics.throwUninitializedPropertyAccessException(object5);
            } else {
                object2 = object5;
            }
            object2.setVisibility(0);
            object5 = new up1_2(this);
            this.r = object5;
            object5.start();
        }
    }

    public final void Ta(String string2) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.getContext());
        int n3 = R$layout.pe_dialog_error;
        layoutInflater = layoutInflater.inflate(n3, null);
        Context context = this.getContext();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView((View)layoutInflater);
        builder = builder.create();
        int n4 = R$id.dialog_error_tv_ok;
        context = (TextView)layoutInflater.findViewById(n4);
        int n7 = R$id.dialog_error_tv_msg;
        layoutInflater = (TextView)layoutInflater.findViewById(n7);
        rp1_2 rp1_22 = new rp1_2(builder, 0);
        context.setOnClickListener((View.OnClickListener)rp1_22);
        n4 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
        if (n4 == 0) {
            layoutInflater.setText((CharSequence)string2);
        }
        builder.show();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        bundle = this.getDialog();
        if (bundle != null && (bundle = bundle.getWindow()) != null) {
            int n3 = R$style.DialogAnimation;
            bundle.setWindowAnimations(n3);
        }
    }

    public final void onClick(View object) {
        Object object2 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.imv_close;
        Object object3 = "mobileNumberEt";
        int n7 = 0;
        Object object4 = null;
        if (n3 == n4) {
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                object4 = object;
            }
            this.Ra((EditText)object4);
            this.dismiss();
        } else {
            n3 = object.getId();
            n4 = R$id.btn_submit;
            int n8 = 1;
            Object object5 = "";
            boolean bl2 = false;
            Object object6 = null;
            if (n3 == n4) {
                boolean bl3;
                object = this.d;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    bl3 = false;
                    object = null;
                }
                this.Ra((EditText)object);
                object = this.q;
                if (object != null) {
                    n3 = this.m;
                    if (n3 == n8) {
                        bl3 = this.t;
                        n3 = 32;
                        Object object7 = "progressView";
                        if (bl3) {
                            object = this.h;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                                bl3 = false;
                                object = null;
                            }
                            object.show();
                            object = new QueryLPBalance();
                            object7 = this.s;
                            if (object7 != null) {
                                object7 = ((LpStoredCardBalance)object7).isLRManaged();
                            } else {
                                n4 = 0;
                                object7 = null;
                            }
                            object.setIsLRManaged((String)object7);
                            object7 = this.s;
                            if (object7 != null) {
                                object7 = ((LpStoredCardBalance)object7).getFullCardNumber();
                            } else {
                                n4 = 0;
                                object7 = null;
                            }
                            object.setCardNumber((String)object7);
                            object7 = this.d;
                            if (object7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            } else {
                                object4 = object7;
                            }
                            object7 = object4.getText().toString();
                            int n10 = ((String)object7).length() - n8;
                            n7 = 0;
                            object4 = null;
                            boolean bl4 = false;
                            object5 = null;
                            while (n7 <= n10) {
                                int n14 = !bl4 ? n7 : n10;
                                if ((n14 = Intrinsics.compare(((String)object7).charAt(n14), n3)) <= 0) {
                                    n14 = 1;
                                } else {
                                    n14 = 0;
                                    Object var17_22 = null;
                                }
                                if (!bl4) {
                                    if (n14 == 0) {
                                        bl4 = true;
                                        continue;
                                    }
                                    ++n7;
                                    continue;
                                }
                                if (n14 == 0) break;
                                n10 += -1;
                            }
                            object2 = ((Object)((String)object7).subSequence(n7, n10 += n8)).toString();
                            object.setMobile((String)object2);
                            object2 = this.Oa();
                            object7 = this.Pa().E;
                            ((op2_2)object2).f((QueryLPBalance)object, (TenantResponse)object7);
                        } else {
                            object = this.s;
                            if (object != null && (object = object.getPayId()) != null) {
                                object5 = object;
                            }
                            if ((object = this.d) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                bl3 = false;
                                object = null;
                            }
                            object = object.getText().toString();
                            int n15 = object.length() - n8;
                            int n16 = 0;
                            Object object8 = null;
                            boolean bl5 = false;
                            Object var19_27 = null;
                            while (n16 <= n15) {
                                int n17 = !bl5 ? n16 : n15;
                                if ((n17 = Intrinsics.compare(object.charAt(n17), n3)) <= 0) {
                                    n17 = 1;
                                } else {
                                    n17 = 0;
                                    Object var21_31 = null;
                                }
                                if (!bl5) {
                                    if (n17 == 0) {
                                        bl5 = true;
                                        continue;
                                    }
                                    ++n16;
                                    continue;
                                }
                                if (n17 == 0) break;
                                n15 += -1;
                            }
                            object = com.jio.jioads.adinterfaces.a.a(n15, n8, n16, (String)object);
                            object2 = this.Pa().h;
                            n3 = ((ArrayList)object2).size();
                            if (n3 > 0) {
                                object2 = new ArrayList();
                                object3 = this.Pa().h.iterator();
                                while ((n8 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                                    Object object9 = (PaymentInstrumentInfo)object3.next();
                                    object6 = new QueryLPBalance();
                                    object8 = ((PaymentInstrumentInfo)object9).isLRManaged();
                                    ((QueryLPBalance)object6).setIsLRManaged((String)object8);
                                    object8 = ((PaymentInstrumentInfo)object9).getPaymentInstrumentId();
                                    n16 = (int)(((String)object5).equalsIgnoreCase((String)object8) ? 1 : 0);
                                    if (n16 != 0 && (n16 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0)) == 0) {
                                        ((QueryLPBalance)object6).setMobile((String)object);
                                    } else {
                                        object8 = ((PaymentInstrumentInfo)object9).getRegisteredMobile();
                                        n16 = (int)(TextUtils.isEmpty((CharSequence)object8) ? 1 : 0);
                                        if (n16 == 0) {
                                            object8 = ((PaymentInstrumentInfo)object9).getRegisteredMobile();
                                            ((QueryLPBalance)object6).setMobile((String)object8);
                                        } else {
                                            object8 = this.Pa().E;
                                            if (object8 != null) {
                                                object8 = ((TenantResponse)object8).getCustomer();
                                            } else {
                                                n16 = 0;
                                                object8 = null;
                                            }
                                            if (object8 != null) {
                                                object8 = this.Pa().E;
                                                if (object8 != null && (object8 = ((TenantResponse)object8).getCustomer()) != null) {
                                                    object8 = ((Customer)object8).getMobile();
                                                } else {
                                                    n16 = 0;
                                                    object8 = null;
                                                }
                                                ((QueryLPBalance)object6).setMobile((String)object8);
                                            }
                                        }
                                    }
                                    object8 = ((PaymentInstrumentInfo)object9).getPaymentInstrumentId();
                                    ((QueryLPBalance)object6).setPayId((String)object8);
                                    object9 = ((PaymentInstrumentInfo)object9).getCardNumber();
                                    ((QueryLPBalance)object6).setCardNumber((String)object9);
                                    ((ArrayList)object2).add(object6);
                                }
                                object = this.h;
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                                } else {
                                    object4 = object;
                                }
                                ((PEProgressView)((Object)object4)).show();
                                object = this.Oa();
                                object7 = this.Pa().E;
                                object.e((ArrayList)object2, (TenantResponse)object7);
                            }
                        }
                    } else {
                        object2 = this.e;
                        if (object2 == null) {
                            object2 = "otpEt";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        } else {
                            object4 = object2;
                        }
                        object2 = object4.getText().toString();
                        object.p9((String)object2);
                        this.dismiss();
                    }
                }
            } else {
                int n18 = object.getId();
                if (n18 == (n3 = R$id.tv_time)) {
                    Object object10;
                    int n19;
                    object = new QueryResendOtp();
                    object2 = this.p;
                    object.setTransactionId((String)object2);
                    object2 = this.Oa();
                    Object object11 = this.Pa().E;
                    object2.getClass();
                    object3 = "queryResendOtp";
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    oo2_1 oo2_12 = ((op2_2)object2).a;
                    oo2_12.getClass();
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    object3 = UrlHelper.Companion.getInstance();
                    object6 = new Object[]{};
                    Object object12 = "payment";
                    Object object13 = "lp_resend_otp";
                    object3 = ((UrlHelper)object3).getApiUrl((String)object12, (String)object13, (Object[])object6);
                    object6 = dm0_0.a;
                    if (object11 != null && (object12 = ((TenantResponse)object11).getTenant()) != null) {
                        object12 = ((Tenant)object12).getCode();
                    } else {
                        n19 = 0;
                        object12 = null;
                    }
                    if (object11 != null && (object13 = ((TenantResponse)object11).getCustomer()) != null) {
                        object13 = ((Customer)object13).getUuid();
                    } else {
                        boolean bl6 = false;
                        object13 = null;
                    }
                    String string2 = object11 != null ? ((TenantResponse)object11).getAccessToken() : null;
                    JsonObject jsonObject = new JsonObject();
                    String string3 = "code";
                    jsonObject.addProperty(string3, (String)object12);
                    object12 = "tncUrl";
                    jsonObject.addProperty((String)object12, (String)object5);
                    if (object11 != null && (object5 = ((TenantResponse)object11).getTenant()) != null) {
                        object5 = ((Tenant)object5).getCallbackUrl();
                    } else {
                        boolean bl7 = false;
                        object5 = null;
                    }
                    object12 = "callbackUrl";
                    jsonObject.addProperty((String)object12, (String)object5);
                    if (object6 != null && (n19 = object6.containsKey(object5 = "card.registeredMobile")) == n8) {
                        object10 = (String)object6.get(object5);
                    } else {
                        n8 = 0;
                        object10 = null;
                    }
                    object5 = new JsonObject();
                    object6 = "uuid";
                    ((JsonObject)object5).addProperty((String)object6, (String)object13);
                    if (object11 != null && (object6 = ((TenantResponse)object11).getCustomer()) != null) {
                        object6 = ((Customer)object6).getEmail();
                    } else {
                        bl2 = false;
                        object6 = null;
                    }
                    object12 = "email";
                    ((JsonObject)object5).addProperty((String)object12, (String)object6);
                    if (object11 != null && (object6 = ((TenantResponse)object11).getCustomer()) != null) {
                        object6 = ((Customer)object6).getFirstName();
                    } else {
                        bl2 = false;
                        object6 = null;
                    }
                    object12 = "firstName";
                    ((JsonObject)object5).addProperty((String)object12, (String)object6);
                    if (object11 != null && (object6 = ((TenantResponse)object11).getCustomer()) != null) {
                        object6 = ((Customer)object6).getLastName();
                    } else {
                        bl2 = false;
                        object6 = null;
                    }
                    ((JsonObject)object5).addProperty("lastName", (String)object6);
                    bl2 = TextUtils.isEmpty((CharSequence)object10);
                    object12 = "mobile";
                    if (!bl2) {
                        ((JsonObject)object5).addProperty((String)object12, (String)object10);
                    } else {
                        if (object11 != null && (object10 = ((TenantResponse)object11).getCustomer()) != null) {
                            object4 = ((Customer)object10).getMobile();
                        }
                        ((JsonObject)object5).addProperty((String)object12, (String)object4);
                    }
                    object4 = new JsonObject();
                    ((JsonObject)object4).addProperty("appType", "ANDROID");
                    object6 = "APP";
                    ((JsonObject)object4).addProperty("paymentChannel", (String)object6);
                    object10 = new JsonObject();
                    if (object11 != null) {
                        object12 = ((TenantResponse)object11).getRequestChecksum();
                        ((JsonObject)object10).addProperty("requestChecksum", (String)object12);
                        object6 = "transactionToken";
                        object11 = ((TenantResponse)object11).getTransactionToken();
                        ((JsonObject)object10).addProperty((String)object6, (String)object11);
                    } else {
                        object11 = "TenantResponse is null";
                        mz3_0.F((String)object11);
                    }
                    ((JsonObject)object10).add("tenant", jsonObject);
                    ((JsonObject)object10).add("customer", (JsonElement)object5);
                    ((JsonObject)object10).add("paymentChannelInformation", (JsonElement)object4);
                    ((JsonObject)object10).addProperty("accessToken", string2);
                    object = object.getTransactionId();
                    ((JsonObject)object10).addProperty("splitUpId", (String)object);
                    object = oo2_12.a.resendLpOtp((String)object3, (JsonObject)object10, "LP_RESEND_OTP");
                    object11 = qt2_2.c;
                    object = object.h((Scheduler)object11);
                    object11 = ti_2.a();
                    object = object.e((Scheduler)object11);
                    object11 = new Object();
                    object3 = new va2_0(1, (Function1)object11);
                    object11 = new s53_0((q63_0)object, (bx0_2)object3);
                    object = new Object();
                    object3 = new u53_0((q63_0)object11, (bx0_2)object);
                    Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
                    n4 = 2;
                    object = new l8_0(object2, n4);
                    object11 = new Q02(object, 1);
                    n7 = 0;
                    object = new ap2_1(object2, 0);
                    object4 = new gp2_1((ap2_1)object);
                    object = ((g53_0)object3).f((o60_0)object11, (o60_0)object4);
                    object2 = ((op2_2)object2).b;
                    ((t30_0)object2).b((yr0_2)object);
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$style.MobileBottomSheetFragment;
        this.setStyle(0, n3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.pesdk_lux_mobile_otp_bottom_sheet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.pesdk_mobile_otp_bottom_sheet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onDetach() {
        super.onDetach();
        up1_2 up1_22 = this.r;
        if (up1_22 != null) {
            up1_22.cancel();
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Object object3;
        int n4;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getArguments();
        Object object4 = null;
        if (object2 != null) {
            this.m = n4 = object2.getInt("viewType");
            object3 = object2.getString("mobileNumber");
            this.n = object3;
            object3 = object2.getString("transactionId");
            this.p = object3;
            object3 = object2.getString("cardNumber");
            this.o = object3;
            n4 = (int)(object2.getBoolean("isFromAddCard") ? 1 : 0);
            this.t = n4;
            object3 = "LpStoredCardBalance";
            int n7 = object2.containsKey((String)object3);
            if (n7 != 0) {
                n7 = Build.VERSION.SDK_INT;
                int n8 = 33;
                if (n7 >= n8) {
                    object2 = op1_2.a(object2);
                } else {
                    n4 = (object2 = object2.getSerializable((String)object3)) instanceof LpStoredCardBalance;
                    if (n4 == 0) {
                        n3 = 0;
                        object2 = null;
                    }
                    object2 = (LpStoredCardBalance)object2;
                }
                object2 = (LpStoredCardBalance)object2;
                this.s = object2;
            }
        }
        n3 = R$id.payment_progress_bar;
        object2 = (PEProgressView)object.findViewById(n3);
        this.h = object2;
        n3 = R$id.tv_cardnumber;
        object2 = (TextView)object.findViewById(n3);
        n4 = R$id.tv_heading_otp;
        object3 = (TextView)object.findViewById(n4);
        this.i = object3;
        n4 = R$id.mobile_otp_title;
        object3 = (TextView)object.findViewById(n4);
        this.j = object3;
        n4 = R$id.mobile_layout;
        object3 = object.findViewById(n4);
        this.f = object3;
        n4 = R$id.otp_layout;
        object3 = object.findViewById(n4);
        this.g = object3;
        n4 = R$id.et_mobile;
        object3 = (EditText)object.findViewById(n4);
        this.d = object3;
        n4 = R$id.et_otp;
        object3 = (EditText)object.findViewById(n4);
        this.e = object3;
        n4 = R$id.tv_time;
        object3 = (TextView)object.findViewById(n4);
        this.k = object3;
        n4 = R$id.lbl_resend;
        object3 = (TextView)object.findViewById(n4);
        this.l = object3;
        n4 = R$id.btn_submit;
        object3 = (TextView)object.findViewById(n4);
        this.c = object3;
        object3 = this.o;
        if (object3 != null) {
            String string2 = "**** **** **** ";
            object3 = string2.concat((String)object3);
            object2.setText((CharSequence)object3);
        }
        n3 = R$id.imv_close;
        object.findViewById(n3).setOnClickListener((View.OnClickListener)this);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("submitBtn");
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        this.Sa();
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mobileNumberEt");
            object = null;
        }
        object2 = new sp1_2(this);
        object.addTextChangedListener((TextWatcher)object2);
        object = this.e;
        if (object == null) {
            object = "otpEt";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object4 = object;
        }
        object = new tp1_2(this);
        object4.addTextChangedListener((TextWatcher)object);
        this.Qa(false);
        object = this.Oa().g;
        object2 = this.getViewLifecycleOwner();
        object4 = new k9_0(this, 3);
        object3 = new d$b((Function1)object4);
        ((LiveData)object).e((mu1_1)object2, (F62)object3);
        object = this.Oa().i;
        object2 = this.getViewLifecycleOwner();
        object4 = new pp1_2(this, 0);
        object3 = new d$b((Function1)object4);
        ((LiveData)object).e((mu1_1)object2, (F62)object3);
        object = this.Oa().h;
        object2 = this.getViewLifecycleOwner();
        object4 = new ue1_1(this, 1);
        object3 = new d$b((Function1)object4);
        ((LiveData)object).e((mu1_1)object2, (F62)object3);
    }
}

