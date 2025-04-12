/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.app.Application
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.text.InputFilter
 *  android.text.InputFilter$AllCaps
 *  android.text.InputFilter$LengthFilter
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.text.method.PasswordTransformationMethod
 *  android.text.method.TransformationMethod
 *  android.text.style.ForegroundColorSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.myaccount.order.imps;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.myaccount.ajiocash.datasource.AjioWalletToBankTransferConfig;
import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import com.ril.ajio.myaccount.order.imps.b;
import com.ril.ajio.myaccount.order.imps.c;
import com.ril.ajio.myaccount.order.imps.d$a;
import com.ril.ajio.myaccount.order.imps.d$b;
import com.ril.ajio.myaccount.order.imps.d$c;
import com.ril.ajio.myaccount.order.imps.d$d;
import com.ril.ajio.services.data.Order.IfscResponse;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

public final class d
extends D51
implements View.OnClickListener {
    public static final d$a Companion;
    public static final String S;
    public IfscResponse A;
    public float B;
    public float C;
    public AjioTextView D;
    public View E;
    public hy3_0 F;
    public boolean G;
    public boolean H;
    public final hh3_2 I;
    public View J;
    public TextView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public boolean O;
    public boolean P;
    public final d$b Q;
    public final d$d R;
    public final String f;
    public final Regex g;
    public final Regex h;
    public final Regex i;
    public dj2_0 j;
    public View k;
    public TextInputLayout l;
    public AjioEditText m;
    public TextInputLayout n;
    public AjioEditText o;
    public TextInputLayout p;
    public AjioEditText q;
    public AjioTextView r;
    public AjioTextView s;
    public AjioTextView t;
    public AjioTextView u;
    public AjioTextView v;
    public n_0 w;
    public wf1_2 x;
    public AjioLoaderView y;
    public View z;

    static {
        Object object = new Object();
        Companion = object;
        object = d.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(object, "getSimpleName(...)");
        S = object;
    }

    public d() {
        Object object = d.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(object, "getSimpleName(...)");
        this.f = object;
        this.g = object = new Regex("^[A-Z0-9]*$");
        this.h = object = new Regex("^[A-Z]{4}");
        this.i = object = new Regex("^[A-Z]{4}[A-Z0-9]{7}$");
        object = new jf1_2(this);
        this.I = object = yr1_2.b((Function0)object);
        this.Q = object = new d$b(this);
        this.R = object = new d$d(this);
    }

    public static SpannableStringBuilder Sa(int n3, String string2, String string3) {
        String string4 = "text";
        Intrinsics.checkNotNullParameter(string3, string4);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        String string5 = "";
        string4 = bl2 ? string5 : kp1_0.c(" ", string2);
        string4 = Ft2.a(string3, string4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)string4);
        int n4 = TextUtils.isEmpty((CharSequence)string4);
        if (n4 == 0) {
            Object object = FontsManager.getInstance();
            AJIOApplication.Companion.getClass();
            Object object2 = AJIOApplication$a.a();
            object = object.getTypefaceWithFont((Context)object2, 7);
            object2 = FontsManager.getInstance();
            Object object3 = AJIOApplication$a.a();
            object2 = ((FontsManager)object2).getTypefaceWithFont((Context)object3, 5);
            boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
            int n7 = 6;
            int n8 = 33;
            if (!bl3) {
                object3 = new AjioCustomTypefaceSpan(string5, (Typeface)object);
                Intrinsics.checkNotNull(string2);
                n4 = StringsKt.O(string4, string2, 0, false, n7);
                int n10 = string4.length();
                spannableStringBuilder.setSpan(object3, n4, n10, n8);
            }
            object = new AjioCustomTypefaceSpan(string5, (Typeface)object2);
            int n14 = string3.length();
            spannableStringBuilder.setSpan(object, 0, n14, n8);
            n14 = -1;
            if (n3 != n14 && (n14 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0)) == 0) {
                string3 = new ForegroundColorSpan(n3);
                Intrinsics.checkNotNull(string2);
                n3 = StringsKt.O(string4, string2, 0, false, n7);
                int n15 = string4.length();
                spannableStringBuilder.setSpan((Object)string3, n3, n15, n8);
            }
        }
        return spannableStringBuilder;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean Pa(boolean var1_1) {
        block26: {
            block27: {
                block23: {
                    block25: {
                        block24: {
                            var2_2 = this.q;
                            Intrinsics.checkNotNull(var2_2);
                            var2_2 = StringsKt.m0(String.valueOf(var2_2.getText())).toString();
                            var3_3 = var2_2.length();
                            var4_4 = 11;
                            var5_5 = 1;
                            var6_6 = "";
                            if (var3_3 < var4_4) {
                                var2_2 = this.M;
                                if (var2_2 != null) {
                                    ai0_2.B((View)var2_2);
                                }
                                var2_2 = this.M;
                                var7_7 = "IFSC code should be 11 characters long";
                                if (var2_2 != null) {
                                    var2_2.setText((CharSequence)var7_7);
                                }
lbl16:
                                // 6 sources

                                while (true) {
                                    var8_8 = false;
                                    var2_2 = null;
                                    break block23;
                                    break;
                                }
                            }
                            var9_9 = this.h;
                            var7_7 = var2_2.subSequence(0, 4);
                            var3_3 = (int)var9_9.c((CharSequence)var7_7);
                            if (var3_3 != 0) break block24;
                            var2_2 = this.M;
                            if (var2_2 != null) {
                                ai0_2.B((View)var2_2);
                            }
                            if ((var2_2 = this.M) != null) {
                                var7_7 = "First 4 characters should have only alphabets";
                                var2_2.setText((CharSequence)var7_7);
                            }
                            var7_7 = "first 4 characters should have only alphabets";
                            ** GOTO lbl16
                        }
                        var7_7 = this.g;
                        var3_3 = (int)var7_7.c((CharSequence)var2_2);
                        if (var3_3 != 0) break block25;
                        var2_2 = this.M;
                        if (var2_2 != null) {
                            ai0_2.B((View)var2_2);
                        }
                        if ((var2_2 = this.M) != null) {
                            var7_7 = "Allowed characters are A-Z,0-9";
                            var2_2.setText((CharSequence)var7_7);
                        }
                        var7_7 = "allowed characters are A-Z,0-9";
                        ** GOTO lbl16
                    }
                    var7_7 = this.i;
                    var8_8 = var7_7.c((CharSequence)var2_2);
                    if (!var8_8) {
                        var2_2 = this.M;
                        if (var2_2 != null) {
                            ai0_2.B((View)var2_2);
                        }
                        if ((var2_2 = this.M) != null) {
                            var7_7 = "Please enter a valid format IFSC code";
                            var2_2.setText((CharSequence)var7_7);
                        }
                        var7_7 = "please enter a valid format IFSC code";
                        ** continue;
                    }
                    var2_2 = this.M;
                    if (var2_2 != null) {
                        ai0_2.i((View)var2_2);
                    }
                    if ((var2_2 = this.M) != null) {
                        var2_2.setText((CharSequence)var6_6);
                    }
                    var7_7 = var6_6;
                    var8_8 = true;
                }
                var4_4 = kotlin.text.b.k((CharSequence)var7_7) ^ var5_5;
                if (var4_4 != 0) {
                    var9_9 = this.q;
                    var10_10 = var9_9 != null && (var9_9 = var9_9.getText()) != null && (var9_9 = var9_9.toString()) != null && (var9_9 = StringsKt.m0((CharSequence)var9_9).toString()) != null ? var9_9 : var6_6;
                    var9_9 = "IFSC Code : ";
                    var11_11 = var9_9.concat((String)var7_7);
                    var12_12 = this.Ra();
                    var13_13 = "bank form";
                    var14_14 = "IMPS";
                    var15_15 = "formErrorEvent";
                    var16_16 = "formErrorEvent";
                    GAEcommerceEvents.pushIfscEvent(var11_11, var13_13, var14_14, var12_12, var15_15, var16_16, (String)var10_10);
                }
                if (!var8_8) {
                    var7_7 = this.v;
                    var4_4 = 8;
                    if (var7_7 != null) {
                        var7_7.setVisibility(var4_4);
                    }
                    if ((var7_7 = this.E) != null) {
                        var7_7.setVisibility(var4_4);
                    }
                    if ((var7_7 = this.D) != null) {
                        var7_7.setVisibility(0);
                    }
                    var3_3 = 0;
                    var7_7 = null;
                    this.A = null;
                }
                if (var1_1 == 0) break block26;
                var17_17 = this.m;
                var1_1 = fd0_0.c((AjioEditText)var17_17);
                if (var1_1 <= 0 || (var1_1 = fd0_0.c((AjioEditText)(var17_17 = this.o))) <= 0) break block27;
                var17_17 = this.m;
                Intrinsics.checkNotNull(var17_17);
                var17_17 = String.valueOf(var17_17.getText());
                var7_7 = this.o;
                Intrinsics.checkNotNull(var7_7);
                var7_7 = String.valueOf(var7_7.getText());
                var1_1 = (int)var17_17.equals(var7_7);
                if (var1_1 == 0) break block26;
            }
            if (!var8_8 && (var17_17 = this.M) != null) {
                ai0_2.a((View)var17_17);
            }
        }
        return var8_8;
    }

    public final void Qa(float f5, boolean bl2) {
        Object object = hv3_0.a;
        TextInputLayout textInputLayout = this.l;
        Intrinsics.checkNotNull((Object)textInputLayout);
        object.getClass();
        hv3_0.c(bl2, f5, (View)textInputLayout);
        object = this.m;
        Intrinsics.checkNotNull(object);
        hv3_0.c(bl2, f5, (View)object);
        object = this.n;
        Intrinsics.checkNotNull(object);
        hv3_0.c(bl2, f5, (View)object);
        object = this.o;
        Intrinsics.checkNotNull(object);
        hv3_0.c(bl2, f5, (View)object);
        object = this.p;
        Intrinsics.checkNotNull(object);
        hv3_0.c(bl2, f5, (View)object);
        object = this.q;
        Intrinsics.checkNotNull(object);
        hv3_0.c(bl2, f5, (View)object);
    }

    public final String Ra() {
        boolean bl2;
        Object object = this.F;
        String string2 = null;
        if (object != null) {
            object = ((hy3_0)object).k();
        } else {
            bl2 = false;
            object = null;
        }
        bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            object = this.F;
            if (object != null) {
                string2 = ((hy3_0)object).k();
            }
        } else {
            string2 = "";
        }
        return string2;
    }

    public final void Ta(String string2) {
        Object object = this.getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)object);
        int n3 = R$string.imps_failed_msg;
        object = this.getString(n3);
        builder.setTitle((CharSequence)object);
        builder.setMessage((CharSequence)string2);
        builder.setPositiveButton((CharSequence)"OK", null);
        builder.show();
    }

    /*
     * Unable to fully structure code
     */
    public final void Ua() {
        block27: {
            block26: {
                block25: {
                    var1_1 = this.m;
                    var2_2 = fd0_0.c((AjioEditText)var1_1);
                    var3_3 = 1;
                    var4_4 = null;
                    var5_5 = "";
                    if (var2_2 > 0 && (var2_2 = fd0_0.c((AjioEditText)(var1_1 = this.o))) > 0) {
                        var1_1 = this.m;
                        Intrinsics.checkNotNull(var1_1);
                        var1_1 = String.valueOf(var1_1.getText());
                        var6_6 = this.o;
                        Intrinsics.checkNotNull(var6_6);
                        var6_6 = String.valueOf(var6_6.getText());
                        var2_2 = (int)var1_1.equals(var6_6);
                        if (var2_2 == 0) {
                            var1_1 = this.N;
                            if (var1_1 != null) {
                                ai0_2.B((View)var1_1);
                            }
                            if ((var1_1 = this.N) != null) {
                                var6_6 = "Account numbers don't match";
                                var1_1.setText((CharSequence)var6_6);
                            }
                            if ((var1_1 = this.N) != null) {
                                ai0_2.a((View)var1_1);
                            }
                            var7_7 = (var1_1 = this.q) != null && (var1_1 = var1_1.getText()) != null && (var1_1 = var1_1.toString()) != null && (var1_1 = StringsKt.m0((CharSequence)var1_1).toString()) != null ? var1_1 : var5_5;
                            var8_8 = this.Ra();
                            var9_9 = "formErrorEvent";
                            var10_10 = "formErrorEvent";
                            var6_6 = "mismatch : account numbers don't match";
                            var11_11 = "bank form";
                            var12_12 = "IMPS";
                            GAEcommerceEvents.pushIfscEvent((String)var6_6, var11_11, var12_12, var8_8, var9_9, var10_10, (String)var7_7);
lbl31:
                            // 3 sources

                            while (true) {
                                var2_2 = 0;
                                var1_1 = null;
                                break block25;
                                break;
                            }
                        }
                        var1_1 = this.N;
                        if (var1_1 != null) {
                            ai0_2.i((View)var1_1);
                        }
                        if ((var1_1 = this.N) != null) {
                            var1_1.setText((CharSequence)var5_5);
                        }
lbl40:
                        // 4 sources

                        while (true) {
                            var2_2 = 1;
                            break block25;
                            break;
                        }
                    }
                    ** while ((var2_2 = (int)km_1.b((cp$a)(var1_1 = cp_1.Companion))) == 0)
lbl44:
                    // 1 sources

                    var1_1 = this.N;
                    if (var1_1 != null) {
                        ai0_2.B((View)var1_1);
                    }
                    if ((var1_1 = this.M) != null) {
                        var13_13 = R$string.ajiobank_message;
                        var6_6 = hv3_0.K(var13_13);
                        var1_1.setText((CharSequence)var6_6);
                    }
                    if ((var1_1 = this.N) != null) {
                        var13_13 = R$string.ajiobank_message;
                        var6_6 = hv3_0.K(var13_13);
                        var1_1.setText((CharSequence)var6_6);
                    }
                    if ((var1_1 = this.N) == null) ** GOTO lbl31
                    ai0_2.a((View)var1_1);
                    ** while (true)
                }
                var6_6 = cp_1.Companion;
                var13_13 = km_1.b((cp$a)var6_6);
                if (var13_13 != 0 && var2_2 == 0) {
                    return;
                }
                var3_3 = this.Pa((boolean)var3_3);
                if (var2_2 == 0 || var3_3 == 0) break block26;
                var1_1 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                var14_14 = this.j;
                var13_13 = 0;
                var6_6 = null;
                if (var14_14 != null) {
                    var14_14 = var14_14.I();
                } else {
                    var3_3 = 0;
                    var14_14 = null;
                }
                var11_11 = "IMPS_Clicked_Process_Request_";
                var12_12 = "IMPS";
                var8_8 = "Clicked on Proceed IMPS Request";
                cP.b(var11_11, (String)var14_14, (GTMEvents)var1_1, var8_8, var12_12);
                var2_2 = (int)this.H;
                if (var2_2 == 0 || (var2_2 = (int)this.G) == 0) ** GOTO lbl107
                var1_1 = this.A;
                if (var1_1 == null) ** GOTO lbl-1000
                Intrinsics.checkNotNull(var1_1);
                var1_1 = var1_1.getImps();
                var2_2 = (int)var1_1.booleanValue();
                if (var2_2 != 0) {
                    this.submitRequest();
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = this.v;
                    var3_3 = 8;
                    if (var1_1 != null) {
                        var1_1.setVisibility(var3_3);
                    }
                    if ((var1_1 = this.E) != null) {
                        var1_1.setVisibility(var3_3);
                    }
                    if ((var1_1 = this.D) != null) {
                        var1_1.setVisibility(0);
                    }
                    if ((var1_1 = this.M) != null) {
                        var14_14 = "Please enter valid IFSC code";
                        var1_1.setText((CharSequence)var14_14);
                    }
                    if ((var1_1 = this.M) != null) {
                        ai0_2.B((View)var1_1);
                    }
                    if ((var1_1 = this.M) != null) {
                        ai0_2.a((View)var1_1);
                    }
                    var7_7 = (var1_1 = this.q) != null && (var1_1 = var1_1.getText()) != null && (var1_1 = var1_1.toString()) != null && (var1_1 = StringsKt.m0((CharSequence)var1_1).toString()) != null ? var1_1 : var5_5;
                    var8_8 = this.Ra();
                    GAEcommerceEvents.pushIfscEvent("IFSC Code : Please enter valid IFSC code", "bank form", "IMPS", var8_8, "formErrorEvent", "formErrorEvent", (String)var7_7);
                    return;
lbl107:
                    // 1 sources

                    var1_1 = com.ril.ajio.myaccount.order.imps.c.Companion;
                    var14_14 = this.q;
                    if (var14_14 != null) {
                        var6_6 = var14_14.getText();
                    }
                    var14_14 = String.valueOf(var6_6);
                    var1_1.getClass();
                    var1_1 = "ifscCode";
                    Intrinsics.checkNotNullParameter(var14_14, (String)var1_1);
                    var1_1 = E1.a((String)var1_1, (String)var14_14);
                    var14_14 = new c();
                    var14_14.setArguments((Bundle)var1_1);
                    var2_2 = 123;
                    var14_14.setTargetFragment(this, var2_2);
                    var1_1 = this.requireFragmentManager();
                    var4_4 = "IFSCConfirmBottomSheetFragment";
                    var14_14.show((FragmentManager)var1_1, var4_4);
                }
                break block27;
            }
            if (var2_2 != 0 && var3_3 != 0) {
                var1_1 = this.q;
                var7_7 = var1_1 != null && (var1_1 = var1_1.getText()) != null && (var1_1 = var1_1.toString()) != null && (var1_1 = StringsKt.m0((CharSequence)var1_1).toString()) != null ? var1_1 : var5_5;
                var8_8 = this.Ra();
                var11_11 = "bank form";
                var12_12 = "IMPS";
                var6_6 = "IFSC Code : incorrect IFSC code";
                var9_9 = "formErrorEvent";
                var10_10 = "formErrorEvent";
                GAEcommerceEvents.pushIfscEvent((String)var6_6, var11_11, var12_12, var8_8, var9_9, var10_10, (String)var7_7);
            }
        }
    }

    public final void onActivityCreated(Bundle object) {
        int n3;
        int n4;
        Object[] objectArray;
        int n7;
        Object object2;
        Object object3;
        float f5;
        boolean bl2;
        Object object4;
        int n74 = 1;
        int n8 = 0;
        String string2 = null;
        super.onActivityCreated((Bundle)object);
        object = this.q;
        if (object != null) {
            object4 = this.Q;
            object.addTextChangedListener((TextWatcher)object4);
        }
        object = this.requireActivity();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.imps.ReturnImpsActivity");
        ((ReturnImpsActivity)object).y2(false);
        object = h40_0.a;
        boolean n10 = h40_0.B0();
        object4 = "format(...)";
        Object object5 = "getString(...)";
        if (n10 && (bl2 = this.O)) {
            object = this.J;
            if (object != null) {
                object.setVisibility(0);
            }
            f5 = this.C;
            object = qz2_0.x(Float.valueOf(f5));
            object3 = this.K;
            if (object3 != null) {
                object2 = StringCompanionObject.INSTANCE;
                n7 = R$string.refund_balance_imps;
                object2 = this.getString(n7);
                Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
                objectArray = new Object[n74];
                objectArray[0] = object;
                zn0_1.b(objectArray, n74, (String)object2, (String)object4, (TextView)object3);
            }
            if ((object = this.L) != null) {
                n4 = R$string.refund_amount_imps_desc;
                object3 = this.getString(n4);
                object.setText((CharSequence)object3);
            }
        }
        if ((object = this.j) != null && (n3 = object.n1()) == n74) {
            object = this.z;
            n4 = 8;
            if (object != null) {
                object.setVisibility(n4);
            }
            if ((object = this.t) != null) {
                object.setVisibility(n4);
            }
            if ((object = this.J) != null) {
                object.setVisibility(0);
            }
            f5 = this.C;
            object = qz2_0.x(Float.valueOf(f5));
            object3 = h40_0.e();
            n7 = 0;
            object2 = null;
            if (object3 != null) {
                object3 = object3.b();
            } else {
                n4 = 0;
                object3 = null;
            }
            if (object3 != null) {
                object5 = this.K;
                if (object5 != null) {
                    objectArray = StringCompanionObject.INSTANCE;
                    objectArray = new Object[n74];
                    objectArray[0] = object;
                    zn0_1.b(objectArray, n74, (String)object3, (String)object4, (TextView)object5);
                }
            } else {
                object3 = this.K;
                if (object3 != null) {
                    objectArray = StringCompanionObject.INSTANCE;
                    int n14 = R$string.ajio_cash_balance;
                    objectArray = this.getString(n14);
                    Intrinsics.checkNotNullExpressionValue(objectArray, (String)object5);
                    object5 = new Object[n74];
                    object5[0] = object;
                    zn0_1.b((Object[])object5, n74, (String)objectArray, (String)object4, (TextView)object3);
                }
            }
            if ((object5 = h40_0.e()) != null) {
                object2 = ((AjioWalletToBankTransferConfig)object5).a();
            }
            if (object2 != null) {
                object5 = this.L;
                if (object5 != null) {
                    object3 = StringCompanionObject.INSTANCE;
                    object3 = new Object[n74];
                    object3[0] = object;
                    zn0_1.b(object3, n74, (String)object2, (String)object4, (TextView)object5);
                }
            } else {
                object = this.L;
                if (object != null) {
                    n8 = R$string.ajio_cash_transfer_amount_time;
                    string2 = this.getString(n8);
                    object.setText((CharSequence)string2);
                }
            }
            int n15 = 1065353216;
            f5 = 1.0f;
            this.Qa(f5, n74 != 0);
        } else {
            object = this.w;
            if (object != null) {
                object4 = "IMPS";
                object5 = "screenName";
                Intrinsics.checkNotNullParameter(object4, (String)object5);
                object3 = g6.a;
                Intrinsics.checkNotNullParameter(object4, (String)object5);
                object4 = UrlHelper.Companion.getInstance();
                object5 = g6.b;
                object3 = ((UserInformation)object5).getUserId();
                Object object6 = new Object[n74];
                object6[0] = object3;
                object2 = "cash_bonus";
                object6 = ((UrlHelper)object4).getApiUrl("ajio_cash", (String)object2, (Object[])object6);
                Intrinsics.checkNotNullExpressionValue(object5, "userInformation");
                object4 = ServiceUtil.getToken((UserInformation)object5);
                object4 = kp1_0.c("Bearer ", (String)object4);
                object6 = g6.a.getWalletDetails((String)object6, (String)object4, "AJIOCashBonus");
                object4 = qt2_2.c;
                object6 = ((g53_0)object6).h((Scheduler)object4);
                object4 = ti_2.a();
                object6 = ((g53_0)object6).e((Scheduler)object4);
                object4 = new Z5();
                object5 = new a6(0, (Function1)object4);
                object4 = new s53_0((q63_0)object6, (bx0_2)object5);
                object6 = new b6();
                object5 = new u53_0((q63_0)object4, (bx0_2)object6);
                Intrinsics.checkNotNullExpressionValue(object5, "onErrorReturn(...)");
                object6 = new j_0((n_0)object);
                object4 = new K((j_0)object6);
                object6 = new L(object, 0);
                object3 = new m_0(0, (Function1)object6);
                object6 = ((g53_0)object5).f((o60_0)object4, (o60_0)object3);
                object = ((n_0)object).a;
                ((t30_0)object).b((yr0_2)object6);
            }
        }
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = this.getActivity();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.imps.ReplaceFragmentCallback");
        object = (dj2_0)object;
        this.j = object;
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        int n7 = 0;
        Object object2 = null;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n8 = R$id.what_is_ifsc;
        if (object != null && (n3 = ((Integer)object).intValue()) == n8) {
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            Object object3 = this.j;
            if (object3 != null) {
                object2 = object3.I();
            }
            object3 = "IMPS_Clicked_What_is_IFSC_";
            String string2 = "IMPS - Clicked on What is IFSC";
            String string3 = "IMPS";
            cP.b((String)object3, (String)object2, (GTMEvents)object, string2, string3);
            object = this.F;
            Intrinsics.checkNotNull(object);
            object = ((hy3_0)object).k();
            n4 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n4 == 0) {
                object = this.F;
                Intrinsics.checkNotNull(object);
                object = ((hy3_0)object).k();
                Intrinsics.checkNotNull(object);
            } else {
                object = "";
            }
            GAEcommerceEvents.pushIFSCBottomSheetEvent((String)object, string3);
            com.ril.ajio.myaccount.order.imps.b.Companion.getClass();
            object = new b();
            n7 = 12;
            ((Fragment)object).setTargetFragment(this, n7);
            object2 = this.requireFragmentManager();
            object3 = this.f;
            ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
        } else {
            n7 = R$id.submit_button;
            if (object != null && (n8 = ((Integer)object).intValue()) == n7) {
                this.Ua();
            } else {
                n7 = R$id.go_to_wallet;
                if (object != null && (n4 = ((Integer)object).intValue()) == n7 && (object = this.j) != null) {
                    object.K0();
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCreate(Bundle object) {
        float f5;
        Object object2;
        String string2;
        String string3;
        String string4;
        Object object3;
        String string5;
        String string6;
        Object object4;
        Object object5;
        Object object6;
        boolean bl2;
        Object object7;
        block10: {
            super.onCreate((Bundle)object);
            object = this.getArguments();
            if (object != null) {
                object7 = "IS_FROM_RCS_FLOW";
                boolean bl3 = object.containsKey((String)object7);
                if (bl3) {
                    boolean bl4;
                    this.O = bl4 = object.getBoolean((String)object7);
                }
                if (bl3 = object.containsKey((String)(object7 = "IS_FROM_RCS_CC_REFUND_FLOW"))) {
                    this.P = bl2 = object.getBoolean((String)object7);
                }
            }
            object = "owner";
            Intrinsics.checkNotNullParameter(this, (String)object);
            object7 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object);
            object6 = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(this, (String)object);
            object5 = this.getDefaultViewModelCreationExtras();
            object4 = "store";
            Intrinsics.checkNotNullParameter(object7, (String)object4);
            string6 = "factory";
            Intrinsics.checkNotNullParameter(object6, string6);
            string5 = "defaultCreationExtras";
            Intrinsics.checkNotNullParameter(object5, string5);
            object3 = n_0.class;
            string4 = "modelClass";
            object7 = rl3_0.b((rd3_0)object7, (E$b)object6, (Wd0)object5, object3, string4);
            object6 = "<this>";
            object5 = sw0_0.a(object3, (String)object6, object3, string4, string4);
            Intrinsics.checkNotNullParameter(object5, (String)object6);
            object3 = object5.getQualifiedName();
            string3 = "Local and anonymous classes can not be ViewModels";
            if (object3 == null) {
                object7 = string3.toString();
                object = new IllegalArgumentException((String)object7);
                throw object;
            }
            string2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object3 = string2.concat((String)object3);
            this.w = object7 = (n_0)((pD3)object7).a((yn1_2)object5, (String)object3);
            try {
                object7 = this.requireActivity();
                object5 = "requireActivity(...)";
                Intrinsics.checkNotNullExpressionValue(object7, (String)object5);
                Intrinsics.checkNotNullParameter(object7, (String)object);
                object5 = object7.getViewModelStore();
                Intrinsics.checkNotNullParameter(object7, (String)object);
                object3 = object7.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(object7, (String)object);
                object7 = object7.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                Intrinsics.checkNotNullParameter(object3, string6);
                Intrinsics.checkNotNullParameter(object7, string5);
                object2 = new pD3((rd3_0)object5, (E$b)object3, (Wd0)object7);
                object7 = wf1_2.class;
                Intrinsics.checkNotNullParameter(object7, string4);
                Intrinsics.checkNotNullParameter(object7, (String)object6);
                object7 = Reflection.getOrCreateKotlinClass(object7);
                Intrinsics.checkNotNullParameter(object7, string4);
                Intrinsics.checkNotNullParameter(object7, string4);
                Intrinsics.checkNotNullParameter(object7, (String)object6);
                object5 = object7.getQualifiedName();
                if (object5 == null) {
                    object5 = string3.toString();
                    object7 = new IllegalArgumentException((String)object5);
                    throw object7;
                }
                object5 = string2.concat((String)object5);
                object7 = ((pD3)object2).a((yn1_2)object7, (String)object5);
                this.x = object7 = (wf1_2)object7;
                break block10;
            }
            catch (IllegalStateException illegalStateException) {}
            object5 = yn3_0.a;
            ((yn3$a)object5).e(illegalStateException);
        }
        object7 = kd3_2.a();
        object3 = this.requireActivity().getApplication();
        object2 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object5 = new UserRepo((Application)object3);
        object3 = this.requireActivity().getApplication();
        ((kd3_2)object7).a = object5;
        ((kd3_2)object7).b = object3;
        Intrinsics.checkNotNull(object7);
        Intrinsics.checkNotNullParameter(this, (String)object);
        Intrinsics.checkNotNullParameter(object7, string6);
        object5 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        Intrinsics.checkNotNullParameter(object7, string6);
        Intrinsics.checkNotNullParameter(object, string5);
        object4 = hy3_0.class;
        object = im_1.a((rd3_0)object5, (kd3_2)object7, (Wd0)object, (Class)object4, string4);
        object7 = sw0_0.a((Class)object4, (String)object6, (Class)object4, string4, string4);
        Intrinsics.checkNotNullParameter(object7, (String)object6);
        object6 = object7.getQualifiedName();
        if (object6 == null) {
            object7 = string3.toString();
            object = new IllegalArgumentException((String)object7);
            throw object;
        }
        object6 = string2.concat((String)object6);
        this.F = object = (hy3_0)((pD3)object).a((yn1_2)object7, (String)object6);
        object = this.j;
        if (object != null) {
            f5 = object.s1();
            object = Float.valueOf(f5);
        } else {
            bl2 = false;
            f5 = 0.0f;
            object = null;
        }
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Float");
        this.C = f5 = ((Float)object).floatValue();
        object = z40_0.Companion;
        this.G = bl2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.a("block_unverified_ifsc");
        this.H = bl2 = z40$a.a((Context)AJIOApplication$a.a()).a.a("enableIfscValidation");
    }

    public final View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle object2) {
        int n3;
        InputFilter[] inputFilterArray;
        int n4;
        int n7;
        object2 = "inflater";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n8 = R$layout.imps_account_details_revamp;
        object = object.inflate(n8, viewGroup, false);
        this.k = object;
        if (object != null) {
            n7 = R$id.submit_button;
            object = (AjioTextView)object.findViewById(n7);
        }
        object = this.k;
        n7 = 0;
        viewGroup = null;
        if (object != null) {
            n8 = R$id.account_number_text_input;
            object = (TextInputLayout)object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.l = object;
        object = this.k;
        if (object != null) {
            n8 = R$id.account_number_et;
            object = (AjioEditText)object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.m = object;
        object = this.k;
        if (object != null) {
            n8 = R$id.ifsc_et;
            object = (AjioEditText)object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.q = object;
        object = this.k;
        if (object != null) {
            n8 = R$id.progressview;
            object = (AjioLoaderView)object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.y = object;
        object = this.k;
        if (object != null) {
            n8 = R$id.imps_not_possible;
            object = object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.z = object;
        object = this.k;
        if (object != null) {
            n8 = R$id.ifsc_text_input;
            object = (TextInputLayout)object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.p = object;
        object = this.k;
        if (object != null) {
            n8 = R$id.tv_ifsc_info;
            object = (AjioTextView)object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.v = object;
        object = this.k;
        if (object != null) {
            n8 = R$id.ajio_cash_avlbl_tv;
            object = (AjioTextView)object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.r = object;
        object = this.k;
        if (object != null) {
            n8 = R$id.ajio_cash_to_be_transfer_tv;
            object = (AjioTextView)object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.s = object;
        object = this.k;
        if (object != null) {
            n8 = R$id.transfer_amount_value;
            object = (AjioTextView)object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.t = object;
        object = this.k;
        if (object != null) {
            n8 = R$id.go_to_wallet;
            object = (AjioTextView)object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.u = object;
        object = this.m;
        object2 = this.R;
        if (object != null) {
            object.addTextChangedListener((TextWatcher)object2);
        }
        if ((object = this.m) != null) {
            inputFilterArray = PasswordTransformationMethod.getInstance();
            object.setTransformationMethod((TransformationMethod)inputFilterArray);
        }
        if ((object = this.k) != null) {
            n3 = R$id.confirm_account_number_text_input;
            object = (TextInputLayout)object.findViewById(n3);
        } else {
            n4 = 0;
            object = null;
        }
        this.n = object;
        object = this.k;
        if (object != null) {
            n3 = R$id.confirm_account_number_et;
            object = (AjioEditText)object.findViewById(n3);
        } else {
            n4 = 0;
            object = null;
        }
        this.o = object;
        if (object != null) {
            object.addTextChangedListener((TextWatcher)object2);
        }
        object = new InputFilter.AllCaps();
        object2 = new InputFilter.LengthFilter(11);
        n3 = 2;
        inputFilterArray = new InputFilter[n3];
        inputFilterArray[0] = object;
        n4 = 1;
        inputFilterArray[n4] = object2;
        object = this.q;
        if (object != null) {
            object.setFilters(inputFilterArray);
        }
        if ((object = this.k) != null) {
            n8 = R$id.what_is_ifsc;
            object = (AjioTextView)object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.D = object;
        object = this.k;
        if (object != null) {
            n8 = R$id.layout_ifsc_verified;
            object = object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.E = object;
        object = this.k;
        if (object != null) {
            n8 = R$id.ajio_cash_balance_view;
            object = object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.J = object;
        object = this.k;
        if (object != null) {
            n8 = R$id.aw_cash_balance_tv;
            object = (TextView)object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.K = object;
        object = this.k;
        if (object != null) {
            n8 = R$id.aw_transferable_cash_time;
            object = (TextView)object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.L = object;
        object = this.k;
        if (object != null) {
            n8 = R$id.tv_ifsccode_blank_error;
            object = (TextView)object.findViewById(n8);
        } else {
            n4 = 0;
            object = null;
        }
        this.M = object;
        object = this.k;
        if (object != null) {
            n7 = R$id.tv_confirmaccountnumber_error;
            object = object.findViewById(n7);
            viewGroup = object;
            viewGroup = (TextView)object;
        }
        this.N = viewGroup;
        object = this.D;
        if (object != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.u) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        return this.k;
    }

    public final void onViewCreated(View object, Bundle object2) {
        d$c d$c;
        int n3;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.requireActivity();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.imps.ReturnImpsActivity");
        object = (ReturnImpsActivity)object;
        object2 = S;
        ((ReturnImpsActivity)object).z2((String)object2);
        object = this.x;
        if (object != null && (object = ((wf1_2)object).e) != null) {
            object2 = this.getViewLifecycleOwner();
            n3 = 1;
            object3 = new p4_0(this, n3);
            ((LiveData)object).e((mu1_1)object2, (F62)object3);
        }
        if ((object = this.x) != null && (object = ((wf1_2)object).g) != null) {
            object2 = this.getViewLifecycleOwner();
            n3 = 0;
            object3 = new gf1_2(this, 0);
            d$c = new d$c((Function1)object3);
            ((LiveData)object).e((mu1_1)object2, d$c);
        }
        if ((object = this.x) != null && (object = ((wf1_2)object).h) != null) {
            object2 = this.getViewLifecycleOwner();
            object3 = new hf1_2(this);
            d$c = new d$c((Function1)object3);
            ((LiveData)object).e((mu1_1)object2, d$c);
        }
        if ((object = this.w) != null && (object = ((n_0)object).b) != null) {
            object2 = this.getViewLifecycleOwner();
            n3 = 0;
            object3 = new if1_2(this, 0);
            d$c = new d$c((Function1)object3);
            ((LiveData)object).e((mu1_1)object2, d$c);
        }
    }

    public final void submitRequest() {
        hw3_0 hw3_02 = new hw3_0();
        hw3_02.setCancelable(false);
        Object object = new Bundle();
        Context context = this.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        Object object2 = new jo_2(context);
        object2 = ((sw_0)object2).getPreference("INPUT_MOBILE_NUMBER", "");
        object.putString("INTENT_USER_PHONE_NUMBER", (String)object2);
        object2 = ((UserInformation)this.I.getValue()).getUserEmailId();
        object.putString("INTENT_USER_EMAIL_ID", (String)object2);
        object.putBoolean("IS_IMPS", true);
        hw3_02.setArguments((Bundle)object);
        object = this.requireActivity().getSupportFragmentManager();
        hw3_02.show((FragmentManager)object, "UpdateProfileOtpBottomSheetFragment");
    }
}

