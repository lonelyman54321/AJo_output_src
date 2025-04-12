/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnCreateContextMenuListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup
 *  android.view.WindowManager$LayoutParams
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ArrayAdapter
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.payment.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputLayout$AccessibilityDelegate;
import com.google.gson.Gson;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.GoogleAnalyticsEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.AddCardLoyaltyView$AddCardLoyaltyClickListener;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.customviews.widgets.PesdkAddCardLoyaltyView;
import com.ril.ajio.customviews.widgets.PesdkAddCardLoyaltyView$AddCardLoyaltyClickListener;
import com.ril.ajio.customviews.widgets.PesdkToolbarHandler;
import com.ril.ajio.payment.activity.PeWebViewActivity;
import com.ril.ajio.payment.fragment.d;
import com.ril.ajio.payment.fragment.d$a;
import com.ril.ajio.payment.fragment.h$a;
import com.ril.ajio.payment.fragment.h$b;
import com.ril.ajio.payment.fragment.h$c;
import com.ril.ajio.payment.fragment.h$d;
import com.ril.ajio.payment.fragment.h$e;
import com.ril.ajio.payment.fragment.h$f;
import com.ril.ajio.payment.fragment.h$g;
import com.ril.ajio.payment.fragment.h$h;
import com.ril.ajio.payment.juspay.JuspayActivity;
import com.ril.ajio.payment.offer.OfferBottomSheetFragment;
import com.ril.ajio.payment.query.QueryLPOtp;
import com.ril.ajio.services.data.Payment.BinResponse;
import com.ril.ajio.services.data.Payment.Card;
import com.ril.ajio.services.data.Payment.Customer;
import com.ril.ajio.services.data.Payment.Loyalty;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.OrderSummary;
import com.ril.ajio.services.data.Payment.PayNowRequest;
import com.ril.ajio.services.data.Payment.PayNowResponse;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.HashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class h
extends fw_2
implements View.OnClickListener,
vp1_2,
AddCardLoyaltyView$AddCardLoyaltyClickListener,
dn2_1,
PesdkAddCardLoyaltyView$AddCardLoyaltyClickListener {
    public static final h$a Companion;
    public OrderSummary A;
    public BinResponse B;
    public String C;
    public LpStoredCardBalance D;
    public PayNowResponse E;
    public PriceValidation F;
    public OnNavigationClickListener G;
    public boolean H;
    public boolean I;
    public String J;
    public String K;
    public Float L;
    public final String[] a;
    public final D b;
    public final hh3_2 c;
    public RelativeLayout d;
    public PEProgressView e;
    public CheckBox f;
    public ImageView g;
    public TextView h;
    public LinearLayout i;
    public PesdkAddCardLoyaltyView j;
    public TextView k;
    public CheckBox l;
    public EditText m;
    public EditText n;
    public EditText o;
    public EditText p;
    public EditText q;
    public TextView r;
    public View s;
    public TextInputLayout t;
    public TextInputLayout u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;

    static {
        h$a h$a;
        Companion = h$a = new Object();
    }

    public h() {
        Object object = new String[]{"JAN(01)", "FEB(02)", "MAR(03)", "APR(04)", "MAY(05)", "JUN(06)", "JUL(07)", "AUG(08)", "SEP(09)", "OCT(10)", "NOV(11)", "DEC(12)"};
        this.a = object;
        object = Reflection.getOrCreateKotlinClass(kj2_1.class);
        h$f h$f = new h$f(this);
        h$g h$g = new h$g(this);
        h$h h$h = new h$h(this);
        this.b = object = LW0.a(this, (yn1_2)object, h$f, h$g, h$h);
        super(this);
        this.c = object = yr1_2.b((Function0)object);
        this.J = object = "";
        this.K = object;
        this.L = object = Float.valueOf(0.0f);
    }

    public static String Ra(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return string2;
        }
        return oo1_1.a("\\s", string2, "");
    }

    public final void Oa(String object) {
        kj2_1 kj2_12 = this.Qa();
        int n3 = 13;
        hj2_0 hj2_02 = new hj2_0((String)object, n3, false, false);
        kj2_12.c(hj2_02);
        object = this.G;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationClickListener");
            object = null;
        }
        object.onNavigationClick();
    }

    public final op2_2 Pa() {
        return (op2_2)this.c.getValue();
    }

    public final kj2_1 Qa() {
        return (kj2_1)this.b.getValue();
    }

    public final void Sa(String object, String string2) {
        qn1$a qn1$a = qn1_2.Companion;
        qn1$a.getClass();
        boolean bl2 = qn1$a.a();
        int n3 = 1004;
        String string3 = "TENANT_RESPONSE";
        String string4 = "NET_PAYABLE";
        String string5 = "html";
        if (bl2) {
            FragmentActivity fragmentActivity = this.getActivity();
            Class<JuspayActivity> clazz = JuspayActivity.class;
            qn1$a = new Intent((Context)fragmentActivity, clazz);
            qn1$a.putExtra(string5, (String)object);
            object = this.Qa();
            float f5 = ((kj2_1)object).o;
            qn1$a.putExtra(string4, f5);
            qn1$a.putExtra(string3, string2);
            this.startActivityForResult((Intent)qn1$a, n3);
        } else {
            FragmentActivity fragmentActivity = this.getActivity();
            Class<PeWebViewActivity> clazz = PeWebViewActivity.class;
            qn1$a = new Intent((Context)fragmentActivity, clazz);
            qn1$a.putExtra(string5, (String)object);
            object = this.Qa();
            float f6 = ((kj2_1)object).o;
            qn1$a.putExtra(string4, f6);
            qn1$a.putExtra(string3, string2);
            this.startActivityForResult((Intent)qn1$a, n3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Ta(boolean var1_1) {
        block69: {
            var2_2 = this;
            var3_3 = this.Ya();
            if (!var3_3 || (var4_4 = this.Qa().E) == null) break block69;
            var5_5 /* !! */  = this.F;
            var6_6 = 0;
            var7_7 = null;
            var5_5 /* !! */  = var5_5 /* !! */  != null && (var5_5 /* !! */  = var5_5 /* !! */ .getPriceSplitup()) != null && (var5_5 /* !! */  = this.F) != null && (var5_5 /* !! */  = var5_5 /* !! */ .getPriceSplitup()) != null ? var5_5 /* !! */ .getLoyalty() : null;
            var8_8 = null;
            if (var5_5 /* !! */  != null && (var9_9 = var2_2.D) != null) {
                if ((var9_9 = var9_9.getLoyaltyPoints()) != null) {
                    var10_10 = var9_9.floatValue();
                } else {
                    var11_11 = 0;
                    var10_10 = 0.0f;
                    var9_9 = null;
                }
                var11_11 = (cfr_temp_0 = var10_10 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                if (var11_11 > 0) {
                    var9_9 = var2_2.D;
                    if (var9_9 != null) {
                        var9_9 = var9_9.getMobileNumberRegistered();
                        var12_12 = Boolean.TRUE;
                        var11_11 = (int)Intrinsics.areEqual(var9_9, var12_12);
                    } else {
                        var11_11 = 0;
                        var10_10 = 0.0f;
                        var9_9 = null;
                    }
                    if (var11_11 == 0) {
                        this.Wa();
                        return;
                    }
                }
            }
            var13_13 = null;
            var14_14 = false;
            var15_15 = 0.0f;
            var16_16 = null;
            var17_17 = false;
            var18_18 = null;
            var19_19 = null;
            var20_20 = null;
            var21_21 = null;
            var22_22 = null;
            var23_23 = 1023;
            var12_12 = var9_9;
            var9_9 = new Card(null, null, null, null, null, null, null, null, null, false, var23_23, null);
            var24_24 = var1_1;
            var9_9.setTokenizationRequired(var1_1);
            var12_12 = this.Qa().s;
            var25_25 = var2_2.p;
            if (var25_25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expiremonthEt");
                var25_25 = null;
            }
            if ((var14_14 = (var25_25 = var25_25.getText().toString()).length()) == (var17_17 = true)) {
                var16_16 = "0";
                var25_25 = var16_16.concat((String)var25_25);
            }
            if (var12_12 != null && (var16_16 = var12_12.getEncryptionData()) != null) {
                var16_16 = var16_16.getPublicKey();
            } else {
                var14_14 = false;
                var16_16 = null;
                var15_15 = 0.0f;
            }
            if (var16_16 != null && (var14_14 = var16_16.length())) {
                var14_14 = false;
                var15_15 = 0.0f;
                var16_16 = null;
            } else {
                var14_14 = true;
                var15_15 = 1.4E-45f;
            }
            var18_18 = "expireyearEt";
            var19_19 = "nameEt";
            var20_20 = "cvvEt";
            var21_21 = "numberEt";
            if (var14_14) ** GOTO lbl-1000
            if (var12_12 != null && (var16_16 = var12_12.getEncryptionData()) != null) {
                var16_16 = var16_16.getVersion();
            } else {
                var14_14 = false;
                var16_16 = null;
                var15_15 = 0.0f;
            }
            if (var16_16 != null && (var14_14 = var16_16.length())) {
                var14_14 = false;
                var15_15 = 0.0f;
                var16_16 = null;
            } else {
                var14_14 = true;
                var15_15 = 1.4E-45f;
            }
            if (!var14_14) {
                var22_22 = "";
                var26_26 = var12_12 != null && (var13_13 = var12_12.getEncryptionData()) != null && (var13_13 = var13_13.getPublicKey()) != null ? var13_13 : var22_22;
                if (var12_12 != null && (var12_12 = var12_12.getEncryptionData()) != null && (var12_12 = var12_12.getVersion()) != null) {
                    var22_22 = var12_12;
                }
                var16_16 = new gq2_2((String)var26_26, (String)var22_22);
                var26_26 = var2_2.m;
                if (var26_26 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                    var27_27 = 0;
                    var26_26 = null;
                    var28_28 = 0.0f;
                }
                var26_26 = com.ril.ajio.payment.fragment.h.Ra(var26_26.getText().toString());
                var12_12 = var2_2.q;
                if (var12_12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var20_20);
                    var24_24 = false;
                    var12_12 = null;
                }
                var12_12 = var12_12.getText();
                var20_20 = var2_2.n;
                if (var20_20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                    var20_20 = null;
                }
                var19_19 = var20_20.getText();
                var20_20 = var2_2.o;
                if (var20_20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                    var20_20 = null;
                }
                var18_18 = var20_20.getText();
                var22_22 = "CI1=";
                var20_20 = new StringBuilder((String)var22_22);
                var20_20.append((String)var26_26);
                var20_20.append("|CI2=");
                var20_20.append(var12_12);
                var20_20.append("|CI3=");
                var20_20.append((Object)var19_19);
                var20_20.append("|CI4=");
                var20_20.append((Object)var18_18);
                var20_20.append("|CI5=");
                var20_20.append((String)var25_25);
                var26_26 = var20_20.toString();
                var26_26 = var16_16.a((String)var26_26);
            } else lbl-1000:
            // 2 sources

            {
                if ((var26_26 = var2_2.n) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var19_19);
                    var27_27 = 0;
                    var26_26 = null;
                    var28_28 = 0.0f;
                }
                var26_26 = var26_26.getText().toString();
                var9_9.setNameOnCard((String)var26_26);
                var26_26 = var2_2.m;
                if (var26_26 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                    var27_27 = 0;
                    var26_26 = null;
                    var28_28 = 0.0f;
                }
                var26_26 = com.ril.ajio.payment.fragment.h.Ra(var26_26.getText().toString());
                var9_9.setCardNumber((String)var26_26);
                var9_9.setExpiryMonth((String)var25_25);
                var26_26 = var2_2.o;
                if (var26_26 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                    var27_27 = 0;
                    var26_26 = null;
                    var28_28 = 0.0f;
                }
                var26_26 = var26_26.getText().toString();
                var9_9.setExpiryYear((String)var26_26);
                var26_26 = var2_2.q;
                if (var26_26 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var20_20);
                    var27_27 = 0;
                    var26_26 = null;
                    var28_28 = 0.0f;
                }
                var26_26 = var26_26.getText().toString();
                var9_9.setCvv((String)var26_26);
                var27_27 = 0;
                var26_26 = null;
                var28_28 = 0.0f;
            }
            var12_12 = var2_2.i;
            if (var12_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("saveCardLayout");
                var24_24 = false;
                var12_12 = null;
            }
            if (!(var24_24 = var12_12.getVisibility())) {
                var12_12 = var2_2.f;
                if (var12_12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("checkBox");
                    var24_24 = false;
                    var12_12 = null;
                }
                var24_24 = var12_12.isChecked();
                var12_12 = var24_24;
                var9_9.setSaveCard((Boolean)var12_12);
            } else {
                var12_12 = Boolean.FALSE;
                var9_9.setSaveCard((Boolean)var12_12);
            }
            var12_12 = oo2_0.a;
            var25_25 = var2_2.F;
            var16_16 = this.Qa();
            var15_15 = var16_16.o;
            var12_12.getClass();
            var4_4 = oo2_0.n((Card)var9_9, (PriceValidation)var25_25, (TenantResponse)var4_4, var15_15);
            if (var26_26 != null && (var11_11 = var26_26.length()) != 0) {
                var11_11 = 0;
                var10_10 = 0.0f;
                var9_9 = null;
            } else {
                var11_11 = 1;
                var10_10 = 1.4E-45f;
            }
            if (var11_11 == 0) {
                var4_4.setEncryptedCardInfo((String)var26_26);
                var4_4.setEncryptedPaymentInstrumentPresent(var17_17);
            }
            if ((var26_26 = var2_2.F) != null && (var26_26 = var26_26.getPriceSplitup()) != null) {
                var26_26 = var2_2.F;
                if (var26_26 != null && (var26_26 = var26_26.getPriceSplitup()) != null && (var26_26 = var26_26.getNetPayableAmount()) != null) {
                    var28_28 = var26_26.floatValue();
                } else {
                    var27_27 = 0;
                    var28_28 = 0.0f;
                    var26_26 = null;
                }
                var26_26 = Float.valueOf(var28_28);
                var4_4.setNetPayableAmount((Float)var26_26);
                var26_26 = var2_2.F;
                if (var26_26 != null && (var26_26 = var26_26.getPriceSplitup()) != null) {
                    var26_26 = var26_26.getOnepTotalPrice();
                } else {
                    var27_27 = 0;
                    var26_26 = null;
                    var28_28 = 0.0f;
                }
                var4_4.setOnepTotalPrice((String)var26_26);
                var26_26 = var2_2.F;
                if (var26_26 != null && (var26_26 = var26_26.getPriceSplitup()) != null) {
                    var26_26 = var26_26.getThreepTotalPrice();
                } else {
                    var27_27 = 0;
                    var26_26 = null;
                    var28_28 = 0.0f;
                }
                var4_4.setThreepTotalPrice((String)var26_26);
            } else {
                var28_28 = this.Qa().o;
                var26_26 = Float.valueOf(var28_28);
                var4_4.setNetPayableAmount((Float)var26_26);
            }
            if (var5_5 /* !! */  != null) {
                var26_26 = var2_2.D;
                if (var26_26 != null && (var26_26 = var26_26.getLoyaltyPoints()) != null) {
                    var28_28 = var26_26.floatValue();
                } else {
                    var27_27 = 0;
                    var28_28 = 0.0f;
                    var26_26 = null;
                }
                var27_27 = (cfr_temp_1 = var28_28 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                if (var27_27 > 0 && (var27_27 = (int)TextUtils.isEmpty((CharSequence)(var26_26 = var2_2.C))) == 0) {
                    var26_26 = this.Qa().E;
                    if (var26_26 != null) {
                        var26_26 = var26_26.getCustomer();
                    } else {
                        var27_27 = 0;
                        var26_26 = null;
                        var28_28 = 0.0f;
                    }
                    var4_4.setCustomer((Customer)var26_26);
                    var26_26 = var2_2.D;
                    if (var26_26 != null) {
                        var26_26 = var26_26.isLRManaged();
                    } else {
                        var27_27 = 0;
                        var26_26 = null;
                        var28_28 = 0.0f;
                    }
                    var8_8 = "NA";
                    var27_27 = (int)var8_8.equalsIgnoreCase((String)var26_26);
                    if (var27_27 != 0) {
                        var26_26 = "YES";
                    } else {
                        var26_26 = var2_2.D;
                        if (var26_26 != null) {
                            var26_26 = var26_26.isLRManaged();
                        } else {
                            var27_27 = 0;
                            var26_26 = null;
                            var28_28 = 0.0f;
                        }
                    }
                    var4_4.setLRManaged((String)var26_26);
                    var26_26 = var2_2.D;
                    if (var26_26 != null) {
                        var26_26 = var26_26.getStatus();
                    } else {
                        var27_27 = 0;
                        var26_26 = null;
                        var28_28 = 0.0f;
                    }
                    var5_5 /* !! */ .setStatus((String)var26_26);
                    var26_26 = var2_2.D;
                    if (var26_26 != null) {
                        var26_26 = var26_26.getMobile();
                    } else {
                        var27_27 = 0;
                        var26_26 = null;
                        var28_28 = 0.0f;
                    }
                    var27_27 = (int)TextUtils.isEmpty((CharSequence)var26_26);
                    if (var27_27 == 0) {
                        var26_26 = var2_2.D;
                        if (var26_26 != null) {
                            var26_26 = var26_26.getMobile();
                        } else {
                            var27_27 = 0;
                            var26_26 = null;
                            var28_28 = 0.0f;
                        }
                        var4_4.setRegisteredMobile((String)var26_26);
                    } else {
                        var26_26 = var2_2.C;
                        var4_4.setRegisteredMobile((String)var26_26);
                    }
                    var4_4.setLoyalty((Loyalty)var5_5 /* !! */ );
                }
            }
            var2_2.E = null;
            var2_2.H = var17_17;
            var5_5 /* !! */  = var2_2.F;
            if (var5_5 /* !! */  != null) {
                var5_5 /* !! */  = var2_2.e;
                if (var5_5 /* !! */  == null) {
                    var5_5 /* !! */  = "progressView";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5 /* !! */ );
                } else {
                    var7_7 = var5_5 /* !! */ ;
                }
                var7_7.show();
                var5_5 /* !! */  = this.Qa();
                var6_6 = 6;
                var26_26 = "Credit/Debit Card";
                kj2_1.e((kj2_1)var5_5 /* !! */ , (String)var26_26, 0, (String)var26_26, var6_6);
                var5_5 /* !! */  = this.Pa();
                var7_7 = this.Qa().s;
                var26_26 = this.Qa().E;
                var8_8 = this.Qa().w;
                var5_5 /* !! */ .h((PayNowRequest)var4_4, (PaymentInstruments)var7_7, (TenantResponse)var26_26, (HashSet)var8_8);
            } else {
                var4_4 = var2_2.m;
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var21_21);
                } else {
                    var7_7 = var4_4;
                }
                var4_4 = com.ril.ajio.payment.fragment.h.Ra(var7_7.getText().toString());
                var2_2.Za((String)var4_4);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Ua(PriceValidation object) {
        block33: {
            Object object2;
            Float f5;
            String string2;
            String string3;
            String string4;
            int n3;
            String string5;
            Object object3;
            block31: {
                float f6;
                float f7;
                Object object4;
                int n4;
                block32: {
                    object3 = this.A;
                    n4 = 0;
                    object4 = null;
                    string5 = "format(...)";
                    n3 = 1;
                    string4 = "Pay \u20b9%s Securely";
                    string3 = "saveCardLayout";
                    string2 = "proceedTv";
                    f7 = 0.0f;
                    f5 = Float.valueOf(0.0f);
                    object2 = null;
                    if (object3 == null || object == null || (object3 = ((PriceValidation)object).getPriceSplitup()) == null) break block31;
                    object3 = ((PriceValidation)object).getPriceSplitup();
                    if (object3 != null) {
                        object3 = ((PriceSplitUp)object3).getOfferDetails();
                    } else {
                        boolean bl2 = false;
                        object3 = null;
                        f6 = 0.0f;
                    }
                    if (object3 != null) break block32;
                    object3 = ((PriceValidation)object).getPriceSplitup();
                    if (object3 != null) {
                        object3 = ((PriceSplitUp)object3).getLoyalty();
                    } else {
                        boolean bl3 = false;
                        object3 = null;
                        f6 = 0.0f;
                    }
                    if (object3 == null) break block31;
                }
                if ((object3 = this.h) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl4 = false;
                    object3 = null;
                    f6 = 0.0f;
                }
                Object object5 = StringCompanionObject.INSTANCE;
                object5 = ((PriceValidation)object).getPriceSplitup();
                object5 = object5 != null ? ((PriceSplitUp)object5).getNetPayableAmount() : null;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object5;
                zn0_1.b(objectArray, n3, string4, string5, (TextView)object3);
                object3 = ((PriceValidation)object).getPriceSplitup();
                if (object3 != null) {
                    object3 = ((PriceSplitUp)object3).getNetPayableAmount();
                } else {
                    boolean bl5 = false;
                    object3 = null;
                    f6 = 0.0f;
                }
                this.L = object3;
                object3 = ((PriceValidation)object).getPriceSplitup();
                if (object3 != null) {
                    object3 = ((PriceSplitUp)object3).getLoyalty();
                } else {
                    boolean bl6 = false;
                    object3 = null;
                    f6 = 0.0f;
                }
                if (object3 != null) {
                    object3 = ((PriceValidation)object).getPriceSplitup();
                    if (object3 != null && (object3 = ((PriceSplitUp)object3).getLoyalty()) != null && (object3 = ((Loyalty)object3).getLoyaltyPoints()) != null) {
                        f7 = ((Float)object3).floatValue();
                    }
                    if ((object3 = this.A) != null) {
                        object4 = Float.valueOf(f7);
                        ((OrderSummary)object3).setLoyaltyPoint((Float)object4);
                    }
                    object3 = this.Qa();
                    f6 = ((kj2_1)object3).o;
                    float f8 = f7 - f6;
                    Object object6 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                    if (object6 >= 0) {
                        object3 = this.h;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            boolean bl7 = false;
                            object3 = null;
                            f6 = 0.0f;
                        }
                        object4 = "Pay Using LOYLTY REWARDZ Points";
                        object3.setText((CharSequence)object4);
                        object3 = this.i;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            boolean bl8 = false;
                            object3 = null;
                            f6 = 0.0f;
                        }
                        n4 = 8;
                        object3.setVisibility(n4);
                    }
                } else {
                    object3 = this.i;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        boolean bl9 = false;
                        object3 = null;
                        f6 = 0.0f;
                    }
                    object3.setVisibility(0);
                    object3 = this.A;
                    if (object3 != null) {
                        ((OrderSummary)object3).setLoyaltyPoint(f5);
                    }
                }
                if ((object3 = ((PriceValidation)object).getPriceSplitup()) != null) {
                    object3 = ((PriceSplitUp)object3).getOfferDetails();
                } else {
                    boolean bl10 = false;
                    object3 = null;
                    f6 = 0.0f;
                }
                if (object3 != null) {
                    object3 = AnalyticsManager.Companion.getInstance().getGa();
                    object4 = "Bankoffer_communicated";
                    string5 = "Instant bank offers communication after user enters card number";
                    ((GoogleAnalyticsEvents)object3).trackBannerImpressionEvent((String)object4, string5);
                    object3 = this.A;
                    if (object3 != null) {
                        if ((object = ((PriceValidation)object).getPriceSplitup()) != null && (object = ((PriceSplitUp)object).getOfferDetails()) != null) {
                            object2 = ((OfferDetails)object).getOfferAmountApplied();
                        }
                        ((OrderSummary)object3).setBankOfferAmt((Float)object2);
                    }
                    break block33;
                } else {
                    object = this.A;
                    if (object != null) {
                        ((OrderSummary)object).setBankOfferAmt(f5);
                    }
                }
                break block33;
            }
            float f11 = this.Qa().o;
            this.L = object = Float.valueOf(f11);
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                object = null;
                f11 = 0.0f;
            }
            object.setVisibility(0);
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            object = StringCompanionObject.INSTANCE;
            f11 = this.Qa().o;
            object = kq2_1.a(f11);
            object3 = new Object[n3];
            object3[0] = object;
            zn0_1.b((Object[])object3, n3, string4, string5, (TextView)object2);
            object = this.A;
            if (object != null) {
                if (object != null) {
                    ((OrderSummary)object).setBankOfferAmt(f5);
                }
                if ((object = this.A) != null) {
                    ((OrderSummary)object).setLoyaltyPoint(f5);
                }
            }
        }
        this.Va();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Va() {
        var1_1 /* !! */  = null;
        var2_2 = 1;
        var3_3 = this.F;
        var4_4 = null;
        if (var3_3 == null) ** GOTO lbl-1000
        var3_3 = var3_3 != null ? var3_3.getPriceSplitup() : null;
        if (var3_3 != null && (var3_3 = this.F) != null && (var3_3 = var3_3.getPriceSplitup()) != null) {
            var3_3 = var3_3.getOfferDetails();
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = null;
        }
        var5_5 = this.D;
        var6_6 = 8;
        var7_7 = "addCardLoyaltyView";
        if (var5_5 == null && var3_3 == null) {
            var1_1 /* !! */  = this.j;
            if (var1_1 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var7_7);
            } else {
                var4_4 = var1_1 /* !! */ ;
            }
            var4_4.setVisibility(var6_6);
            return;
        }
        if (var3_3 != null && (var5_5 = this.F) != null) {
            if (var5_5 != null) {
                var5_5 = var5_5.getInstantDiscountMsg();
            } else {
                var8_8 = 0;
                var5_5 = null;
                var9_9 = 0.0f;
            }
            var8_8 = TextUtils.isEmpty((CharSequence)var5_5);
            if (var8_8 == 0) {
                var5_5 = this.F;
                if (var5_5 != null) {
                    var5_5 = var5_5.getInstantDiscountMsg();
                } else {
                    var8_8 = 0;
                    var5_5 = null;
                    var9_9 = 0.0f;
                }
                var3_3.setInstantDiscountMsg((String)var5_5);
            }
        }
        if ((var5_5 = this.F) == null) ** GOTO lbl-1000
        if (var5_5 != null) {
            var5_5 = var5_5.getPriceSplitup();
        } else {
            var8_8 = 0;
            var5_5 = null;
            var9_9 = 0.0f;
        }
        if (var5_5 != null && (var5_5 = this.F) != null && (var5_5 = var5_5.getPriceSplitup()) != null) {
            var5_5 = var5_5.getLoyalty();
        } else lbl-1000:
        // 2 sources

        {
            var8_8 = 0;
            var5_5 = null;
            var9_9 = 0.0f;
        }
        var10_10 = 0.0f;
        var11_11 = null;
        if (var5_5 != null && (var12_12 = this.D) != null) {
            if (var12_12 != null) {
                var13_13 = var5_5.getRemainingPoints();
                var12_12.setRemainingPoints((Float)var13_13);
            }
            if ((var12_12 = this.D) != null) {
                var5_5 = var5_5.getLoyaltyPoints();
                var12_12.setUsablePoints((Float)var5_5);
            }
        } else {
            var5_5 = this.D;
            if (var5_5 != null) {
                if (var5_5 != null) {
                    var12_12 = Float.valueOf(0.0f);
                    var5_5.setRemainingPoints((Float)var12_12);
                }
                if ((var5_5 = this.D) != null) {
                    var12_12 = Float.valueOf(0.0f);
                    var5_5.setUsablePoints((Float)var12_12);
                }
            }
        }
        var5_5 = this.D;
        var12_12 = "loyaltyLayout";
        if (var5_5 == null) ** GOTO lbl-1000
        var13_13 = var5_5.getLoyaltyPoints();
        if (var13_13 != null) {
            var14_14 = var13_13.floatValue();
        } else {
            var15_15 = false;
            var14_14 = 0.0f;
            var13_13 = null;
        }
        var15_15 = (cfr_temp_0 = var14_14 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
        if (var15_15 > false || (var8_8 = Intrinsics.areEqual(var5_5 = var5_5.getMobileNumberRegistered(), var13_13 = Boolean.TRUE)) == 0) {
            var5_5 = this.l;
            if (var5_5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loyaltyCb");
                var8_8 = 0;
                var5_5 = null;
                var9_9 = 0.0f;
            }
            if ((var13_13 = this.D) != null) {
                var13_13 = var13_13.isSelected();
                var16_16 = Boolean.TRUE;
                var15_15 = Intrinsics.areEqual(var13_13, var16_16);
            } else {
                var15_15 = false;
                var14_14 = 0.0f;
                var13_13 = null;
            }
            var5_5.setChecked(var15_15);
            var5_5 = this.d;
            if (var5_5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                var8_8 = 0;
                var5_5 = null;
                var9_9 = 0.0f;
            }
            var5_5.setVisibility(0);
            var5_5 = this.D;
            if (var5_5 != null && (var5_5 = var5_5.getRemainingPoints()) != null) {
                var9_9 = var5_5.floatValue();
            } else {
                var8_8 = 0;
                var9_9 = 0.0f;
                var5_5 = null;
            }
            var12_12 = "loyaltyBalanceTv";
            cfr_temp_1 = var9_9 - 0.0f;
            var8_8 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
            if (var8_8 > 0) {
                var5_5 = this.k;
                if (var5_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                    var8_8 = 0;
                    var5_5 = null;
                    var9_9 = 0.0f;
                }
                var5_5.setVisibility(0);
                var5_5 = this.k;
                if (var5_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                    var8_8 = 0;
                    var5_5 = null;
                    var9_9 = 0.0f;
                }
                var17_17 = StringCompanionObject.INSTANCE;
                var17_17 = this.D;
                if (var17_17 != null && (var17_17 = var17_17.getRemainingPoints()) != null) {
                    var10_10 = var17_17.floatValue();
                }
                var17_17 = hv3_0.v(var10_10);
                var11_11 = new Object[var2_2];
                var11_11[0] = var17_17;
                var17_17 = "Remaining balance after purchase %s";
                var12_12 = "format(...)";
                zn0_1.b(var11_11, var2_2, (String)var17_17, (String)var12_12, (TextView)var5_5);
            } else {
                var5_5 = this.k;
                if (var5_5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                    var8_8 = 0;
                    var5_5 = null;
                    var9_9 = 0.0f;
                }
                var5_5.setVisibility(var6_6);
            }
        } else lbl-1000:
        // 2 sources

        {
            if ((var5_5 = this.d) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var12_12);
                var8_8 = 0;
                var5_5 = null;
                var9_9 = 0.0f;
            }
            var5_5.setVisibility(var6_6);
        }
        var5_5 = this.j;
        if (var5_5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var7_7);
            var8_8 = 0;
            var5_5 = null;
            var9_9 = 0.0f;
        }
        var5_5.setVisibility(0);
        var1_1 /* !! */  = this.j;
        if (var1_1 /* !! */  == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var7_7);
        } else {
            var4_4 = var1_1 /* !! */ ;
        }
        var1_1 /* !! */  = this.D;
        var4_4.setData((LpStoredCardBalance)var1_1 /* !! */ , (OfferDetails)var3_3, var2_2, "credit/debitcard-newcard");
    }

    public final void W9(ka0_0 object) {
        object = this.J;
        String string2 = this.K;
        this.Sa((String)object, string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Wa() {
        Object object = this.m;
        int n3 = 0;
        Object object2 = null;
        String string2 = "numberEt";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        object = com.ril.ajio.payment.fragment.h.Ra(object.getText().toString());
        Object object3 = this.D;
        if (object3 != null) {
            ((LpStoredCardBalance)object3).setFullCardNumber((String)object);
        }
        object = AnalyticsManager.Companion;
        object3 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        String string3 = "LoyaltyRewards_MobileUnmatch";
        Object object4 = " RegisteredPhoneNumberEnteredNewCard";
        ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object3, string3, (String)object4);
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = object;
        }
        object = object2.getText().toString();
        n3 = ((String)object).length();
        int n4 = 4;
        if (n3 > n4) {
            n3 = ((String)object).length() - n4;
            object = ((String)object).substring(n3);
            object2 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        } else {
            object = "";
        }
        object4 = object;
        object = com.ril.ajio.payment.fragment.d.Companion;
        LpStoredCardBalance lpStoredCardBalance = this.D;
        object.getClass();
        object2 = this;
        object = d$a.a(this, 1, "", "", (String)object4, true, lpStoredCardBalance);
        object2 = this.getChildFragmentManager();
        ((DialogFragment)object).show((FragmentManager)object2, "MobileOtpBottomSheetFragment");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Xa(String string2) {
        double d2;
        Object object;
        Object[] objectArray;
        Object object2 = this.getActivity();
        if (object2 == null) return;
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.getActivity());
        int n3 = R$layout.dialog_date_picker;
        View view = layoutInflater.inflate(n3, null);
        n3 = R$id.title;
        Object[] objectArray2 = (Object[])view.findViewById(n3);
        Object object3 = "month";
        int n4 = string2.equalsIgnoreCase((String)object3);
        int n7 = 1;
        if (n4 != 0) {
            object3 = "Select Month";
            objectArray2.setText((CharSequence)object3);
            objectArray = objectArray2 = this.a;
        } else {
            object3 = Calendar.getInstance();
            n4 = ((Calendar)object3).get(n7);
            int n8 = 30;
            Object[] objectArray3 = new String[n8];
            for (int i3 = 0; i3 < n8; ++i3) {
                int n10 = n4 + i3;
                object = String.valueOf(n10);
                objectArray3[i3] = object;
            }
            object3 = "Select Year";
            objectArray2.setText((CharSequence)object3);
            objectArray = objectArray3;
        }
        objectArray2 = new Dialog((Context)object2);
        objectArray2.requestWindowFeature(n7);
        objectArray2.setContentView(view);
        objectArray2.show();
        objectArray2.setCancelable(false);
        n4 = R$id.setting_list;
        object = object3 = view.findViewById(n4);
        object = (ListView)object3;
        object3 = new ArrayAdapter((Context)object2, 17367055, objectArray);
        object.setAdapter((ListAdapter)object3);
        object2 = new tr2_1((Dialog)objectArray2, string2, this, (String[])objectArray);
        object.setOnItemClickListener((AdapterView.OnItemClickListener)object2);
        int n14 = R$id.close_button;
        object2 = (Button)view.findViewById(n14);
        n7 = 3;
        object3 = new Ea((View.OnCreateContextMenuListener)objectArray2, n7);
        object2.setOnClickListener((View.OnClickListener)object3);
        n14 = R$id.settings_apply;
        object2 = (Button)view.findViewById(n14);
        ur2_0 ur2_02 = new ur2_0((ListView)object, (Dialog)objectArray2, string2, this, (String[])objectArray);
        object2.setOnClickListener((View.OnClickListener)ur2_02);
        string2 = objectArray2.getWindow();
        if (string2 != null) {
            n14 = 16;
            string2.setSoftInputMode(n14);
        }
        try {
            string2 = new WindowManager.LayoutParams();
            object2 = objectArray2.getWindow();
            if (object2 == null) return;
            object2 = objectArray2.getWindow();
            object2 = object2.getAttributes();
            string2.copyFrom((WindowManager.LayoutParams)object2);
            double d5 = kq2_1.c();
            d2 = 0.8;
        }
        catch (Exception exception) {
            return;
        }
        n14 = (int)(d5 *= d2);
        {
            ((WindowManager.LayoutParams)string2).width = n14;
            ((WindowManager.LayoutParams)string2).height = n14 = -2;
            object2 = objectArray2.getWindow();
            object2.setAttributes((WindowManager.LayoutParams)string2);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean Ya() {
        block62: {
            block61: {
                block55: {
                    block60: {
                        block59: {
                            block58: {
                                block57: {
                                    block56: {
                                        var1_1 = this.v;
                                        var2_2 = "txtInvalidCardNumber";
                                        var3_3 = null;
                                        if (var1_1 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                                            var4_4 = false;
                                            var1_1 = null;
                                        }
                                        ai0_2.i((View)var1_1);
                                        var1_1 = this.w;
                                        var5_5 = "txtInvalidCardName";
                                        if (var1_1 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                                            var4_4 = false;
                                            var1_1 = null;
                                        }
                                        ai0_2.i((View)var1_1);
                                        var1_1 = this.z;
                                        var6_6 = "txtCvvError";
                                        if (var1_1 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var6_6);
                                            var4_4 = false;
                                            var1_1 = null;
                                        }
                                        ai0_2.i((View)var1_1);
                                        var1_1 = this.x;
                                        var7_7 = "txtExpiryMonthError";
                                        if (var1_1 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                                            var4_4 = false;
                                            var1_1 = null;
                                        }
                                        ai0_2.i((View)var1_1);
                                        var1_1 = this.y;
                                        var8_8 = "txtExpiryYearError";
                                        if (var1_1 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var8_8);
                                            var4_4 = false;
                                            var1_1 = null;
                                        }
                                        ai0_2.i((View)var1_1);
                                        var1_1 = this.m;
                                        var9_9 = "numberEt";
                                        if (var1_1 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                            var4_4 = false;
                                            var1_1 = null;
                                        }
                                        var1_1 = var1_1.getText();
                                        var10_10 = "getText(...)";
                                        var11_11 = 1;
                                        if (var1_1 == null) ** GOTO lbl-1000
                                        var1_1 = this.m;
                                        if (var1_1 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                            var4_4 = false;
                                            var1_1 = null;
                                        }
                                        var1_1 = var1_1.getText();
                                        Intrinsics.checkNotNullExpressionValue(var1_1, var10_10);
                                        var4_4 = var1_1.length();
                                        if (!var4_4) ** GOTO lbl-1000
                                        var1_1 = oo2_0.a;
                                        var12_12 = this.m;
                                        if (var12_12 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                            var12_12 = null;
                                        }
                                        var9_9 = com.ril.ajio.payment.fragment.h.Ra(var12_12.getText().toString());
                                        var1_1.getClass();
                                        var4_4 = oo2_0.a(var9_9);
                                        if (var4_4) {
                                            var4_4 = true;
                                        } else lbl-1000:
                                        // 3 sources

                                        {
                                            if ((var1_1 = this.v) == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                                                var4_4 = false;
                                                var1_1 = null;
                                            }
                                            ai0_2.B((View)var1_1);
                                            var4_4 = this.I;
                                            if (!var4_4) {
                                                var1_1 = this.v;
                                                if (var1_1 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
                                                    var4_4 = false;
                                                    var1_1 = null;
                                                }
                                                ai0_2.a((View)var1_1);
                                                this.I = var11_11;
                                            }
                                            var4_4 = false;
                                            var1_1 = null;
                                        }
                                        var2_2 = this.n;
                                        var9_9 = "nameEt";
                                        if (var2_2 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                            var13_13 = 0;
                                            var2_2 = null;
                                        }
                                        if ((var2_2 = var2_2.getText()) == null) break block56;
                                        var2_2 = this.n;
                                        if (var2_2 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                                            var13_13 = 0;
                                            var2_2 = null;
                                        }
                                        var2_2 = var2_2.getText();
                                        Intrinsics.checkNotNullExpressionValue(var2_2, var10_10);
                                        var13_13 = var2_2.length();
                                        if (var13_13 != 0) break block57;
                                    }
                                    if ((var1_1 = this.w) == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                                        var4_4 = false;
                                        var1_1 = null;
                                    }
                                    ai0_2.B((View)var1_1);
                                    var4_4 = this.I;
                                    if (!var4_4) {
                                        var1_1 = this.w;
                                        if (var1_1 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                                            var4_4 = false;
                                            var1_1 = null;
                                        }
                                        ai0_2.a((View)var1_1);
                                        this.I = var11_11;
                                    }
                                    var4_4 = false;
                                    var1_1 = null;
                                }
                                var2_2 = this.o;
                                var5_5 = "expireyearEt";
                                if (var2_2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                                    var13_13 = 0;
                                    var2_2 = null;
                                }
                                if ((var2_2 = var2_2.getText()) == null) break block58;
                                var2_2 = this.o;
                                if (var2_2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                                    var13_13 = 0;
                                    var2_2 = null;
                                }
                                var2_2 = var2_2.getText();
                                Intrinsics.checkNotNullExpressionValue(var2_2, var10_10);
                                var13_13 = var2_2.length();
                                if (var13_13 == 0) break block58;
                                var2_2 = this.o;
                                if (var2_2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                                    var13_13 = 0;
                                    var2_2 = null;
                                }
                                if ((var13_13 = (var2_2 = var2_2.getText()).length()) >= (var14_14 = 4)) break block59;
                            }
                            if ((var1_1 = this.x) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                                var4_4 = false;
                                var1_1 = null;
                            }
                            ai0_2.B((View)var1_1);
                            var4_4 = this.I;
                            if (!var4_4) {
                                var1_1 = this.x;
                                if (var1_1 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                                    var4_4 = false;
                                    var1_1 = null;
                                }
                                ai0_2.a((View)var1_1);
                                this.I = var11_11;
                            }
                            var4_4 = false;
                            var1_1 = null;
                        }
                        var2_2 = this.p;
                        var9_9 = "expiremonthEt";
                        if (var2_2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                            var13_13 = 0;
                            var2_2 = null;
                        }
                        if ((var2_2 = var2_2.getText()) == null) break block60;
                        var2_2 = this.p;
                        if (var2_2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                            var13_13 = 0;
                            var2_2 = null;
                        }
                        var2_2 = var2_2.getText();
                        Intrinsics.checkNotNullExpressionValue(var2_2, var10_10);
                        var13_13 = var2_2.length();
                        if (var13_13 == 0) break block60;
                        var2_2 = this.p;
                        if (var2_2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var9_9);
                            var13_13 = 0;
                            var2_2 = null;
                        }
                        if ((var15_15 = (var2_2 = Integer.valueOf(var2_2.getText().toString())).intValue()) > (var14_14 = 12)) {
                            var1_1 = this.x;
                            if (var1_1 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                                var4_4 = false;
                                var1_1 = null;
                            }
                            ai0_2.B((View)var1_1);
                            var4_4 = this.I;
                            if (!var4_4) {
                                var1_1 = this.x;
                                if (var1_1 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                                    var4_4 = false;
                                    var1_1 = null;
                                }
                                ai0_2.a((View)var1_1);
                                this.I = var11_11;
                            }
lbl195:
                            // 7 sources

                            while (true) {
                                var4_4 = false;
                                var1_1 = null;
                                break block55;
                                break;
                            }
                        }
                        var15_15 = Calendar.getInstance().get(var11_11);
                        var8_8 = StringsKt.m0(String.valueOf(var15_15)).toString();
                        var9_9 = this.o;
                        if (var9_9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                            var14_14 = 0;
                            var9_9 = null;
                        }
                        if ((var16_16 = Intrinsics.areEqual(var8_8, var5_5 = StringsKt.m0(var9_9.getText().toString()).toString())) == 0) break block55;
                        var5_5 = Calendar.getInstance();
                        var15_15 = 2;
                        var16_16 = var5_5.get(var15_15);
                        var13_13 = var2_2.intValue();
                        if (var13_13 >= var16_16) break block55;
                        var1_1 = this.x;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                            var4_4 = false;
                            var1_1 = null;
                        }
                        ai0_2.B((View)var1_1);
                        var4_4 = this.I;
                        if (var4_4) ** GOTO lbl195
                        var1_1 = this.x;
                        if (var1_1 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                            var4_4 = false;
                            var1_1 = null;
                        }
                        ai0_2.a((View)var1_1);
                        this.I = var11_11;
                        ** GOTO lbl195
                    }
                    if ((var1_1 = this.y) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var8_8);
                        var4_4 = false;
                        var1_1 = null;
                    }
                    ai0_2.B((View)var1_1);
                    var4_4 = this.I;
                    if (var4_4) ** GOTO lbl195
                    var1_1 = this.y;
                    if (var1_1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var8_8);
                        var4_4 = false;
                        var1_1 = null;
                    }
                    ai0_2.a((View)var1_1);
                    this.I = var11_11;
                    ** while (true)
                }
                var2_2 = this.q;
                var5_5 = "cvvEt";
                if (var2_2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                    var13_13 = 0;
                    var2_2 = null;
                }
                if ((var2_2 = var2_2.getText()) == null) break block61;
                var2_2 = this.q;
                if (var2_2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var5_5);
                    var13_13 = 0;
                    var2_2 = null;
                }
                var2_2 = var2_2.getText();
                Intrinsics.checkNotNullExpressionValue(var2_2, var10_10);
                var13_13 = var2_2.length();
                if (var13_13 != 0) break block62;
            }
            if ((var1_1 = this.z) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var6_6);
                var4_4 = false;
                var1_1 = null;
            }
            ai0_2.B((View)var1_1);
            var4_4 = this.I;
            if (!var4_4) {
                var1_1 = this.z;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var6_6);
                } else {
                    var3_3 = var1_1;
                }
                ai0_2.a((View)var3_3);
                this.I = var11_11;
            }
            var4_4 = false;
            var1_1 = null;
        }
        this.I = false;
        return var4_4;
    }

    public final void Z0(LpStoredCardBalance object, String string2) {
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
        String string3 = "LoyaltyRewards_OTPEntered";
        String string4 = "MobileNoenteredNewcard";
        ak0_0.a(analyticsManager$Companion, gTMEvents, string3, string4);
        this.C = string2;
        this.D = object;
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("numberEt");
            object = null;
        }
        object = com.ril.ajio.payment.fragment.h.Ra(object.getText().toString());
        this.Za((String)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean Za(String string2) {
        TextView textView;
        int n3;
        h h3 = this;
        String string3 = string2;
        int n4 = TextUtils.isEmpty((CharSequence)string2);
        boolean bl2 = false;
        Object object = null;
        Object object2 = null;
        if (n4 == 0 && (n4 = string2.length()) >= (n3 = 12) && (n4 = string2.length()) <= (n3 = 19)) {
            Object object3 = oo2_0.a;
            object3.getClass();
            n4 = (int)(oo2_0.a(string2) ? 1 : 0);
            if (n4 != 0) {
                Object object4 = object3;
                PaymentInstruments paymentInstruments = null;
                TenantResponse tenantResponse = null;
                hj_1 hj_12 = null;
                HashSet hashSet = null;
                int n7 = 0;
                int n8 = 0;
                int n10 = 1048575;
                object3 = new PriceRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n10, null);
                int n14 = 1023;
                object4 = new Card(null, null, null, null, null, null, null, null, null, false, n14, null);
                ((Card)object4).setCardNumber(string2);
                ((PriceRequest)object3).setCardNumber(string2);
                LpStoredCardBalance lpStoredCardBalance = this.D;
                if (lpStoredCardBalance != null) {
                    Boolean bl3 = lpStoredCardBalance.isSelected();
                    object = Boolean.TRUE;
                    bl2 = Intrinsics.areEqual(bl3, object);
                }
                if (bl2) {
                    Customer customer;
                    n7 = 0;
                    paymentInstruments = null;
                    tenantResponse = null;
                    hj_12 = null;
                    hashSet = null;
                    n8 = 127;
                    object4 = customer;
                    customer = new Customer(null, null, null, null, null, null, null, n8, null);
                    object = "";
                    customer.setFirstName((String)object);
                    customer.setLastName((String)object);
                    customer.setName((String)object);
                    customer.setEmail((String)object);
                    object = this.Qa().E;
                    if (object != null && (object = ((TenantResponse)object).getCustomer()) != null) {
                        object = ((Customer)object).getMobile();
                    } else {
                        bl2 = false;
                        object = null;
                    }
                    customer.setMobile((String)object);
                    hj_12 = null;
                    hashSet = null;
                    paymentInstruments = null;
                    tenantResponse = null;
                    n7 = 31;
                    object4 = object;
                    object = new Loyalty(null, null, null, null, null, n7, null);
                    object4 = h3.D;
                    Intrinsics.checkNotNull(object4);
                    object4 = ((LpStoredCardBalance)object4).getLoyaltyPoints();
                    ((Loyalty)object).setLoyaltyPoints((Float)object4);
                    ((PriceRequest)object3).setLoyalty((Loyalty)object);
                    ((PriceRequest)object3).setCustomer(customer);
                    LpStoredCardBalance lpStoredCardBalance2 = h3.D;
                    Intrinsics.checkNotNull(lpStoredCardBalance2);
                    String string4 = lpStoredCardBalance2.isLRManaged();
                    ((PriceRequest)object3).setLRManaged(string4);
                }
                h3.F = null;
                PEProgressView pEProgressView = h3.e;
                if (pEProgressView == null) {
                    String string5 = "progressView";
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                } else {
                    object2 = pEProgressView;
                }
                ((PEProgressView)((Object)object2)).show();
                object4 = this.Pa();
                paymentInstruments = this.Qa().s;
                tenantResponse = this.Qa().E;
                hj_12 = hj_1.ADD_CARD;
                hashSet = this.Qa().w;
                ((op2_2)object4).k((PriceRequest)object3, paymentInstruments, tenantResponse, hj_12, hashSet);
                AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                object3 = analyticsManager$Companion.getInstance().getGtmEvents();
                object = "Cardnumber_entered";
                object2 = "Card Number entered";
                ak0_0.a(analyticsManager$Companion, (GTMEvents)object3, (String)object, (String)object2);
                return true;
            }
        }
        if ((textView = h3.v) == null) {
            String string6 = "txtInvalidCardNumber";
            Intrinsics.throwUninitializedPropertyAccessException(string6);
        } else {
            object2 = textView;
        }
        ai0_2.B((View)object2);
        return bl2;
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        int n7 = -1;
        if (n4 == n7 && n3 == (n7 = 1004)) {
            Object object;
            if (intent != null && (object = intent.getExtras()) != null) {
                kj2_1 kj2_12 = this.Qa();
                String string2 = "transactionresponse";
                object = object.getString(string2);
                int n8 = 13;
                hj2_0 hj2_02 = new hj2_0((String)object, n8, false, false);
                kj2_12.c(hj2_02);
            }
            if ((object = this.G) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navigationClickListener");
                n7 = 0;
                object = null;
            }
            object.onNavigationClick();
        }
        super.onActivityResult(n3, n4, intent);
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof OnNavigationClickListener;
        if (bl2) {
            object = (OnNavigationClickListener)object;
            this.G = object;
            return;
        }
        object = pn_2.b(object, " Must implement OnNavigationClickListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCreate(Bundle object) {
        Exception exception2;
        Object object2;
        block6: {
            super.onCreate((Bundle)object);
            AnalyticsManager.Companion.getInstance().getGtmEvents().pushOpenScreenEvent("single page checkout credit / debit card page");
            object = this.Qa().E;
            object2 = null;
            object = object != null ? ((TenantResponse)object).getOrderSummary() : null;
            Object object3 = OrderSummary.class;
            Object object4 = "collectionType";
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            {
                block7: {
                    catch (Exception exception2) {
                        break block6;
                    }
                    try {
                        object4 = new Gson();
                        object = ((Gson)object4).toJson(object);
                        object4 = new Gson();
                        object2 = ((Gson)object4).fromJson((String)object, (Type)object3);
                        break block7;
                    }
                    catch (Exception exception3) {}
                    object3 = yn3_0.a;
                    ((yn3$a)object3).e(exception3);
                }
                this.A = object2 = (OrderSummary)object2;
                object = null;
                if (object2 != null) {
                    object3 = Float.valueOf(0.0f);
                    ((OrderSummary)object2).setBankOfferAmt((Float)object3);
                }
                if ((object2 = this.A) == null) return;
                object = Float.valueOf(0.0f);
                ((OrderSummary)object2).setLoyaltyPoint((Float)object);
                return;
            }
        }
        object2 = yn3_0.a;
        ((yn3$a)object2).e(exception2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.pesdk_lux_fragment_add_card;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.pesdk_fragment_add_card;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDestroyView() {
        Object object;
        block7: {
            Exception exception2;
            block6: {
                Object object2;
                View view;
                block5: {
                    block4: {
                        try {
                            object = this.getActivity();
                            view = null;
                            if (object == null) break block4;
                            object2 = "input_method";
                            object = object.getSystemService((String)object2);
                            break block5;
                        }
                        catch (Exception exception2) {
                            break block6;
                        }
                    }
                    object = null;
                }
                object2 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
                Intrinsics.checkNotNull(object, (String)object2);
                object = (InputMethodManager)object;
                object2 = this.getActivity();
                if (object2 != null) {
                    view = object2.getCurrentFocus();
                }
                if (view != null) {
                    view = view.getWindowToken();
                    int n3 = 2;
                    object.hideSoftInputFromWindow((IBinder)view, n3);
                }
                break block7;
            }
            yn3$a yn3$a = yn3_0.a;
            yn3$a.e(exception2);
        }
        this.K = object = "";
        this.J = object;
        super.onDestroyView();
    }

    public final void onLoyaltyDeSelected() {
        Object object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        String string2 = "LoyaltyRewards_LRUnclicked";
        String string3 = "New Card";
        ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object2, string2, string3);
        object = this.D;
        if (object != null) {
            object2 = Boolean.FALSE;
            ((LpStoredCardBalance)object).setSelected((Boolean)object2);
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("numberEt");
                object = null;
            }
            object = com.ril.ajio.payment.fragment.h.Ra(object.getText().toString());
            this.Za((String)object);
            this.Va();
        }
    }

    public final void onLoyaltySelected() {
        Object object = this.D;
        if (object != null) {
            Boolean bl2 = Boolean.TRUE;
            ((LpStoredCardBalance)object).setSelected(bl2);
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("numberEt");
                object = null;
            }
            object = com.ril.ajio.payment.fragment.h.Ra(object.getText().toString());
            this.Za((String)object);
            this.Va();
        }
    }

    public final void onOfferClicked(OfferDetails object) {
        if (object != null) {
            Object object2 = this.L;
            object = OfferBottomSheetFragment.Oa((OfferDetails)object, (Float)object2);
            object2 = this.getChildFragmentManager();
            String string2 = "OfferBottomSheetFragment";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
        }
    }

    public final void onRegisterMobileClicked() {
        this.Wa();
    }

    public final void onResume() {
        super.onResume();
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        NewCustomEventsRevamp newCustomEventsRevamp = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        String string2 = bv_0.a(analyticsManager$Companion);
        String string3 = cv_0.a(analyticsManager$Companion);
        newCustomEventsRevamp.newPushCustomScreenView("add new card screen", "payment instrument", string2, null, string3);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        Object object4;
        int n3;
        Object object5;
        Object object6;
        int n4;
        Object object7 = null;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n7 = og1_1.b();
        Object object8 = "findViewById(...)";
        int n8 = 1;
        if (n7 != 0) {
            n7 = R$id.pesdk_toolbar;
            object2 = object.findViewById(n7);
            Intrinsics.checkNotNullExpressionValue(object2, (String)object8);
            object2 = (Toolbar)object2;
            n4 = R$id.pesdk_toolbar_title_tv;
            object6 = (TextView)object.findViewById(n4);
            object5 = object6.getContext();
            int n10 = R$string.acc_add_new_card;
            object5 = object5.getString(n10);
            object6.setText((CharSequence)object5);
            object5 = object6.getContext();
            n10 = R$string.acc_add_new_card;
            object5 = object5.getString(n10);
            object6.setContentDescription((CharSequence)object5);
            object6.setImportantForAccessibility(n8);
            n4 = R$drawable.ic_back_arrow_lux;
            ((Toolbar)object2).setNavigationIcon(n4);
            n4 = R$string.acc_back_from_add_new_card;
            object6 = this.getString(n4);
            ((Toolbar)object2).setNavigationContentDescription((CharSequence)object6);
            object6 = this.getActivity();
            n4 = object6 instanceof AppCompatActivity;
            if (n4 != 0) {
                object6 = this.getActivity();
                object5 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity";
                Intrinsics.checkNotNull(object6, (String)object5);
                ((AppCompatActivity)object6).setSupportActionBar((Toolbar)object2);
                object6 = (AppCompatActivity)this.getActivity();
                kq2_1.d((Toolbar)object2, (AppCompatActivity)object6);
            }
        } else {
            n7 = R$id.pesdk_layout_coordinator;
            object2 = object.findViewById(n7);
            Intrinsics.checkNotNull(object2);
            object6 = new PesdkToolbarHandler((View)object2);
            object2 = object.getContext();
            n3 = R$string.acc_add_new_card;
            object2 = object2.getString(n3);
            object5 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
            ((PesdkToolbarHandler)object6).setTitleText((String)object2);
            ((PesdkToolbarHandler)object6).setNavigationClick();
            object2 = this.getActivity();
            n7 = object2 instanceof AppCompatActivity;
            if (n7 != 0 && (object2 = (AppCompatActivity)this.getActivity()) != null) {
                object5 = ((PesdkToolbarHandler)object6).getToolbar();
                ((AppCompatActivity)object2).setSupportActionBar((Toolbar)object5);
            }
            if ((object2 = ((PesdkToolbarHandler)object6).getToolbar()) != null) {
                object2.invalidate();
            }
        }
        n7 = R$id.card_number_et;
        object2 = (EditText)object.findViewById(n7);
        this.m = object2;
        n7 = R$id.expiry_month_et;
        object2 = (EditText)object.findViewById(n7);
        this.p = object2;
        n7 = R$id.expiry_year_et;
        object2 = (EditText)object.findViewById(n7);
        this.o = object2;
        n7 = R$id.card_name_et;
        object2 = (EditText)object.findViewById(n7);
        this.n = object2;
        n7 = R$id.card_cvv_et;
        object2 = (EditText)object.findViewById(n7);
        this.q = object2;
        n7 = R$id.txt_invalid_card_error;
        object2 = (TextView)object.findViewById(n7);
        this.v = object2;
        n7 = R$id.txt_card_name_error;
        object2 = (TextView)object.findViewById(n7);
        this.w = object2;
        n7 = R$id.txt_expiry_month_error;
        object2 = (TextView)object.findViewById(n7);
        this.x = object2;
        n7 = R$id.txt_expiry_year_error;
        object2 = (TextView)object.findViewById(n7);
        this.y = object2;
        n7 = R$id.txt_cvv_error;
        object2 = (TextView)object.findViewById(n7);
        this.z = object2;
        n7 = R$id.expiry_year_input;
        object2 = (TextInputLayout)object.findViewById(n7);
        this.t = object2;
        n7 = R$id.expiry_month_input;
        object2 = (TextInputLayout)object.findViewById(n7);
        this.u = object2;
        object2 = cp_1.Companion;
        n7 = (int)(km_1.b((cp$a)object2) ? 1 : 0);
        n4 = 0;
        object6 = null;
        if (n7 != 0) {
            object2 = this.t;
            object5 = "yearInputLayout";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n7 = 0;
                object2 = null;
            }
            if ((object4 = this.t) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                object4 = null;
            }
            object3 = new h$b((TextInputLayout)((Object)object4), "Year");
            ((TextInputLayout)((Object)object2)).setTextInputAccessibilityDelegate((TextInputLayout$AccessibilityDelegate)object3);
            object2 = this.u;
            object5 = "monthInputLayout";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n7 = 0;
                object2 = null;
            }
            if ((object4 = this.u) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                object4 = null;
            }
            object5 = "Month";
            object3 = new h$b((TextInputLayout)((Object)object4), (String)object5);
            ((TextInputLayout)((Object)object2)).setTextInputAccessibilityDelegate((TextInputLayout$AccessibilityDelegate)object3);
        }
        n7 = R$id.add_card_save_layout;
        object2 = (LinearLayout)object.findViewById(n7);
        this.i = object2;
        n7 = R$id.add_card_loyalty_offer_layout;
        object2 = (PesdkAddCardLoyaltyView)object.findViewById(n7);
        this.j = object2;
        n7 = R$id.cvv_detail;
        object2 = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object8);
        object2 = (AjioTextView)object2;
        int n14 = R$id.card_lr_layout;
        object8 = (RelativeLayout)object.findViewById(n14);
        this.d = object8;
        n14 = R$id.tv_lr_balance;
        object8 = (TextView)object.findViewById(n14);
        this.k = object8;
        n14 = R$id.lr_check_box;
        object8 = (CheckBox)object.findViewById(n14);
        this.l = object8;
        n14 = R$id.enroll_check_box;
        object8 = (CheckBox)object.findViewById(n14);
        this.f = object8;
        n14 = R$id.proceed_btn_tv;
        object8 = (TextView)object.findViewById(n14);
        this.h = object8;
        n14 = R$id.card_number_img;
        object8 = (ImageView)object.findViewById(n14);
        this.g = object8;
        n14 = R$id.pf_container;
        object8 = (TextView)object.findViewById(n14);
        this.r = object8;
        n14 = R$id.fragment_payment_list_layout_button;
        object8 = object.findViewById(n14);
        this.s = object8;
        object8 = this.r;
        if (object8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pfContainer");
            n14 = 0;
            object8 = null;
        }
        n3 = 8;
        object8.setVisibility(n3);
        n14 = (int)(og1_1.b() ? 1 : 0);
        if (n14 != 0) {
            ((AjioTextView)object2).underlineText();
        }
        n14 = R$id.payment_progress_bar;
        object = (PEProgressView)object.findViewById(n14);
        this.e = object;
        object = this.j;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addCardLoyaltyView");
            object = null;
        }
        object.setCardClickListener(this);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBox");
            object = null;
        }
        object.setChecked(n8 != 0);
        object = this.h;
        object8 = "proceedTv";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            object = null;
        }
        object3 = StringCompanionObject.INSTANCE;
        float f5 = this.Qa().o;
        object3 = kq2_1.a(f5);
        object4 = new Object[n8];
        object4[0] = object3;
        Object object9 = "format(...)";
        zn0_1.b(object4, n8, "Pay \u20b9%s Securely", (String)object9, (TextView)object);
        object = this.m;
        object3 = "numberEt";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object4 = new vr2_1(this);
        object.setOnFocusChangeListener((View.OnFocusChangeListener)object4);
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object3 = new er2_1(this);
        object.addTextChangedListener((TextWatcher)object3);
        object = this.n;
        object3 = "nameEt";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object4 = new h$c(this);
        object.addTextChangedListener((TextWatcher)object4);
        object = this.q;
        object4 = "cvvEt";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object = null;
        }
        object9 = new h$d(this);
        object.addTextChangedListener((TextWatcher)object9);
        object = this.d;
        object9 = "loyaltyLayout";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object9);
            object = null;
        }
        object.setVisibility(n3);
        object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loyaltyCb");
            object = null;
        }
        object5 = new xa_0(this, n8);
        object.setOnClickListener((View.OnClickListener)object5);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object9);
            object = null;
        }
        object5 = new xr2(this);
        object.setOnClickListener((View.OnClickListener)object5);
        object = this.p;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expiremonthEt");
            object = null;
        }
        object5 = new po0_1(this, n8);
        object.setOnClickListener((View.OnClickListener)object5);
        object = this.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object5 = new Object();
        object.setOnClickListener((View.OnClickListener)object5);
        object = this.q;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object = null;
        }
        object5 = new Object();
        object.setOnClickListener((View.OnClickListener)object5);
        object = new BF1(this, n8);
        object2.setOnClickListener((View.OnClickListener)object);
        object = this.o;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("expireyearEt");
            object = null;
        }
        object2 = new br2_0(this, 0);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
        } else {
            object6 = object;
        }
        object = new KF1(this, n8);
        object6.setOnClickListener((View.OnClickListener)object);
        object = this.Pa().i;
        object2 = this.getViewLifecycleOwner();
        object8 = new dr2_1(this, 0);
        object7 = new h$e((Function1)object8);
        object.e((mu1_1)object2, (F62)object7);
        object = this.Pa().l;
        object2 = this.getViewLifecycleOwner();
        object7 = new ya_0(this, 2);
        object8 = new h$e((Function1)object7);
        object.e((mu1_1)object2, (F62)object8);
        object = this.Pa().s;
        object2 = this.getViewLifecycleOwner();
        object7 = new ze1_1(this, n8);
        object8 = new h$e((Function1)object7);
        object.e((mu1_1)object2, (F62)object8);
        object = this.Pa().v;
        object2 = this.getViewLifecycleOwner();
        object7 = new b22_0(this, n8);
        object8 = new h$e((Function1)object7);
        object.e((mu1_1)object2, (F62)object8);
        object = this.Pa().j;
        object2 = this.getViewLifecycleOwner();
        object7 = new Ba(this, n8);
        object8 = new h$e((Function1)object7);
        object.e((mu1_1)object2, (F62)object8);
        object = this.Pa().G;
        object2 = this.getViewLifecycleOwner();
        object7 = new sr2_1(this);
        object8 = new h$e((Function1)object7);
        object.e((mu1_1)object2, (F62)object8);
    }

    public final void p9(String object) {
        Object object2;
        if (object != null && (object2 = this.E) != null) {
            object2 = new QueryLPOtp();
            Object object3 = this.E;
            Object object4 = null;
            object3 = object3 != null ? ((PayNowResponse)object3).getDisplay_message() : null;
            ((QueryLPOtp)object2).setDisplayMessage((String)object3);
            object3 = this.E;
            object3 = object3 != null ? ((PayNowResponse)object3).getMD() : null;
            ((QueryLPOtp)object2).setMD((String)object3);
            object3 = this.E;
            object3 = object3 != null ? ((PayNowResponse)object3).getTransactionId() : null;
            ((QueryLPOtp)object2).setTransactionId((String)object3);
            ((QueryLPOtp)object2).setOtpdata((String)object);
            object = this.e;
            if (object == null) {
                object = "progressView";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object4 = object;
            }
            ((PEProgressView)((Object)object4)).show();
            object = this.Pa();
            ((op2_2)object).g((QueryLPOtp)object2);
        }
    }

    public final void showLoyaltyInfoFragment() {
        ap1_2 ap1_22 = new ap1_2();
        FragmentManager fragmentManager = this.getChildFragmentManager();
        ap1_22.show(fragmentManager, "LPInfoBottomSheetFragment");
    }
}

