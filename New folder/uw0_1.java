/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  android.widget.ToggleButton
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEToggleButton;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Uw0
 */
public final class uw0_1 {
    public final dv_0 a;
    public final co2_0 b;
    public final hh3_2 c;
    public List d;
    public final View[] e;
    public int f;
    public PaymentInstrumentInfo g;
    public final AjioTextView h;
    public final ShimmerFrameLayout i;
    public final LinearLayout j;
    public final LinearLayout k;
    public final int l;
    public final AjioTextView m;
    public final PEToggleButton n;
    public final NewCustomEventsRevamp o;
    public boolean p;
    public boolean q;

    public uw0_1(View object, dv_0 object2, View.OnClickListener onClickListener, co2_0 viewArray) {
        Intrinsics.checkNotNullParameter(object, "rootView");
        Intrinsics.checkNotNullParameter(onClickListener, "clickListener");
        Intrinsics.checkNotNullParameter(viewArray, "paymentInfoProvider");
        this.a = object2;
        this.b = viewArray;
        int n3 = 1;
        object2 = new c00(this, n3);
        this.c = object2 = yr1_2.b((Function0)object2);
        int n4 = 4;
        viewArray = new View[n4];
        this.e = viewArray;
        this.f = -1;
        this.l = n4;
        this.o = object2 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        n4 = R$id.emi_bank_one;
        object2 = object.findViewById(n4);
        viewArray[0] = object2;
        n4 = R$id.emi_bank_two;
        object2 = object.findViewById(n4);
        int n7 = 1;
        viewArray[n7] = object2;
        n4 = R$id.emi_bank_three;
        object2 = object.findViewById(n4);
        int n8 = 2;
        viewArray[n8] = object2;
        n4 = R$id.emi_bank_four;
        object2 = object.findViewById(n4);
        int n10 = 3;
        viewArray[n10] = object2;
        object2 = viewArray[0];
        if (object2 != null) {
            object2.setOnClickListener(onClickListener);
        }
        if ((object2 = viewArray[n7]) != null) {
            object2.setOnClickListener(onClickListener);
        }
        if ((object2 = viewArray[n8]) != null) {
            object2.setOnClickListener(onClickListener);
        }
        if ((object2 = viewArray[n10]) != null) {
            object2.setOnClickListener(onClickListener);
        }
        n4 = R$id.view_emi_tv_showMorebank;
        this.h = object2 = (AjioTextView)object.findViewById(n4);
        n4 = R$id.emiShimmerRootView;
        object2 = (ShimmerFrameLayout)object.findViewById(n4);
        this.i = object2;
        n4 = R$id.content_container;
        object2 = (LinearLayout)object.findViewById(n4);
        this.j = object2;
        n4 = R$id.emi_retry_container;
        object2 = (LinearLayout)object.findViewById(n4);
        this.k = object2;
        n4 = R$id.emi_info;
        object2 = (AjioTextView)object.findViewById(n4);
        this.m = object2;
        n4 = R$id.emi_toggle_expand;
        object = (PEToggleButton)object.findViewById(n4);
        this.n = object;
    }

    public final void a(op2_2 op2_22) {
        ai0_2.i((View)this.j);
        ai0_2.i((View)this.k);
        Object object = this.i;
        ai0_2.B((View)object);
        ((ShimmerFrameLayout)((Object)object)).startShimmer();
        if (op2_22 != null) {
            object = this.b;
            TenantResponse tenantResponse = object.n8();
            float f5 = object.D();
            Float f6 = Float.valueOf(f5);
            object = md3_0.c(op2_22);
            kp2_2 kp2_22 = new kp2_2(op2_22, tenantResponse, null, f6, null);
            int n3 = 3;
            Ae3.d((i90_0)object, null, null, kp2_22, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(ToggleButton object, TenantResponse object2, op2_2 op2_22) {
        boolean bl2;
        float f5;
        Intrinsics.checkNotNullParameter(object, "toggleBtn");
        Object object3 = oo2_0.a;
        Object object4 = this.b;
        PaymentInstruments paymentInstruments = object4.j0();
        object3.getClass();
        object3 = oo2_0.c("EMI", paymentInstruments);
        float f6 = object4.D();
        object4 = object4.H();
        int n3 = oo2_0.l(36, (TenantResponse)object2, f6, (HashSet)object4);
        object4 = this.m;
        boolean bl3 = true;
        f6 = Float.MIN_VALUE;
        boolean bl4 = false;
        String string2 = null;
        if (n3 == 0) {
            if (object3 != null) {
                object2 = ((PaymentInstrumentType)object3).getPaymentInstrumentDisabled();
                object3 = Boolean.TRUE;
                n3 = Intrinsics.areEqual(object2, object3);
            } else {
                n3 = 0;
                f5 = 0.0f;
                object2 = null;
            }
            if (n3 == 0) {
                ai0_2.i((View)object4);
                n3 = og1_1.b();
                if (n3 != 0) {
                    n3 = R$drawable.pesdk_lux_expand_col_btn;
                    object.setCompoundDrawablesWithIntrinsicBounds(0, 0, n3, 0);
                } else {
                    n3 = R$drawable.pesdk_expand_col_btn;
                    object.setCompoundDrawablesWithIntrinsicBounds(0, 0, n3, 0);
                }
                object.setClickable(bl3);
                object.setEnabled(bl3);
                n3 = 1065353216;
                f5 = 1.0f;
                object.setAlpha(f5);
                return;
            }
        }
        object.setClickable(false);
        object.setEnabled(false);
        f5 = 0.5f;
        object.setAlpha(f5);
        object.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        n3 = (int)(object.isChecked() ? 1 : 0);
        if (n3 != 0) {
            object.toggle();
        }
        ai0_2.B((View)object4);
        if (op2_22 != null && !(bl2 = op2_22.f)) {
            bl4 = true;
        }
        if (!bl4) return;
        object = this.a;
        if (object != null) {
            object2 = this.o.getEC_CHECKOUT_INTERACTIONS();
            object3 = "";
            object4 = "checkout_interactions";
            string2 = "EMI disable";
            object.x1((String)object2, string2, (String)object3, (String)object4);
        }
        op2_22.f = bl3;
    }

    public final void c() {
        Object object = this.d;
        if (object != null) {
            boolean bl2;
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                PaymentInstrumentInfo paymentInstrumentInfo = (PaymentInstrumentInfo)object.next();
                if (paymentInstrumentInfo == null) continue;
                paymentInstrumentInfo.setPriceValidation(null);
                paymentInstrumentInfo.setOfferDetails(null);
            }
        }
        this.g = null;
        object = this.d;
        this.d((List)object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void d(List var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = 1;
        var5_5 = oo2_0.a;
        var6_6 = this.b;
        var7_7 = var6_6.j0();
        var5_5.getClass();
        var5_5 = oo2_0.c("EMI", var7_7);
        var7_7 = null;
        if (var5_5 != null) {
            var5_5 = var5_5.getEmiDataSent();
            var8_8 /* !! */  = Boolean.FALSE;
            var9_9 = Intrinsics.areEqual(var5_5, var8_8 /* !! */ );
        } else {
            var9_9 = 0;
            var10_10 = 0.0f;
            var5_5 = null;
        }
        if (var9_9 != 0) {
            return;
        }
        var9_9 = var2_2.p;
        var11_11 = 0;
        var8_8 /* !! */  = null;
        if (var9_9 == 0) {
            var5_5 = "";
            if (var3_3 != null) {
                var12_12 = var3_3;
                var12_12 = ((Iterable)var3_3).iterator();
                var13_13 = 0;
                var14_14 = null;
                while ((var15_15 = var12_12.hasNext()) != 0) {
                    var16_16 = var12_12.next();
                    var17_17 = var13_13 + 1;
                    if (var13_13 >= 0) {
                        if ((var16_16 = (PaymentInstrumentInfo)var16_16) != null) {
                            var14_14 = var16_16.getNo_cost_emi_enabled();
                            var18_18 = Boolean.TRUE;
                            var13_13 = (int)Intrinsics.areEqual(var14_14, var18_18);
                        } else {
                            var13_13 = 0;
                            var14_14 = null;
                        }
                        if (var13_13 != 0) {
                            if (var16_16 != null) {
                                var14_14 = var16_16.getName();
                            } else {
                                var13_13 = 0;
                                var14_14 = null;
                            }
                            var16_16 = ",";
                            var5_5 = nb0_0.a((String)var5_5, (String)var14_14, (String)var16_16);
                        }
                        var13_13 = var17_17;
                        continue;
                    }
                    xx_2.n();
                    throw null;
                }
            }
            if ((var19_19 = var5_5.length()) > 0) {
                var19_19 = 1;
            } else {
                var19_19 = 0;
                var12_12 = null;
            }
            if (var19_19 != 0 && (var19_19 = (int)le3_2.D((CharSequence)var5_5)) == (var13_13 = 44)) {
                var5_5 = le3_2.C((String)var5_5);
            }
            if ((var12_12 = var2_2.a) != null) {
                var14_14 = var2_2.o.getEC_CHECKOUT_INTERACTIONS();
                var16_16 = "No cost EMI impression-spc";
                var20_20 = "checkout_interactions";
                var12_12.x1((String)var14_14, (String)var16_16, (String)var5_5, var20_20);
            }
            var2_2.p = var4_4;
        }
        var2_2.d = var3_3;
        var21_21 = var2_2.q;
        var5_5 = var2_2.h;
        if (var21_21 != 0) {
            var5_5.setVisibility(0);
        } else {
            var21_21 = 8;
            var5_5.setVisibility(var21_21);
        }
        var3_3 = null;
        for (var21_21 = 0; var21_21 < (var9_9 = var2_2.l); var21_21 += var4_4) {
            block72: {
                var5_5 = var2_2.d;
                if (var5_5 != null) {
                    var9_9 = var5_5.size();
                } else {
                    var9_9 = 0;
                    var10_10 = 0.0f;
                    var5_5 = null;
                }
                if (var21_21 >= var9_9) break;
                var5_5 = var2_2.e[var21_21];
                if (var5_5 != null) {
                    var5_5.setVisibility(0);
                }
                if ((var12_12 = var2_2.d) != null) {
                    var12_12 = (PaymentInstrumentInfo)CollectionsKt.N(var21_21, (List)var12_12);
                } else {
                    var19_19 = 0;
                    var12_12 = null;
                }
                if (var5_5 != null) {
                    var13_13 = R$id.emi_text_row;
                    var14_14 = (RelativeLayout)var5_5.findViewById(var13_13);
                } else {
                    var13_13 = 0;
                    var14_14 = null;
                }
                if (var5_5 != null) {
                    var15_15 = R$id.item_bank_name;
                    var16_16 = (AjioTextView)var5_5.findViewById(var15_15);
                } else {
                    var15_15 = 0;
                    var16_16 = null;
                }
                if (var5_5 != null) {
                    var17_17 = R$id.item_bank_img;
                    var20_20 = (ImageView)var5_5.findViewById(var17_17);
                } else {
                    var17_17 = 0;
                    var20_20 = null;
                }
                if (var5_5 != null) {
                    var22_22 = R$id.emi_not_available;
                    var18_18 = (AjioTextView)var5_5.findViewById(var22_22);
                } else {
                    var22_22 = 0;
                    var18_18 = null;
                }
                if (var5_5 != null) {
                    var23_23 = R$id.emi_message;
                    var24_24 = (AjioTextView)var5_5.findViewById(var23_23);
                } else {
                    var23_23 = 0;
                    var24_24 = null;
                }
                if (var5_5 != null) {
                    var25_25 = R$id.emi_proceed_button_tv;
                    var26_26 /* !! */  = (TextView)var5_5.findViewById(var25_25);
                } else {
                    var25_25 = 0;
                    var26_26 /* !! */  = null;
                }
                if (var26_26 /* !! */  != null) {
                    var27_27 = StringCompanionObject.INSTANCE;
                    AJIOApplication.Companion.getClass();
                    var27_27 = AJIOApplication$a.a();
                    var28_28 = R$string.proceed_btn_text;
                    var27_27 = var27_27.getString(var28_28);
                    Intrinsics.checkNotNullExpressionValue(var27_27, "getString(...)");
                    var29_29 = var6_6.D();
                    var30_30 = kq2_1.a(var29_29);
                    var8_8 /* !! */  = new Object[var4_4];
                    var8_8 /* !! */ [0] = var30_30;
                    var8_8 /* !! */  = Arrays.copyOf(var8_8 /* !! */ , var4_4);
                    var8_8 /* !! */  = String.format((String)var27_27, var8_8 /* !! */ );
                    var27_27 = "format(...)";
                    Intrinsics.checkNotNullExpressionValue(var8_8 /* !! */ , (String)var27_27);
                    var26_26 /* !! */ .setText((CharSequence)var8_8 /* !! */ );
                    var8_8 /* !! */  = new rw0_1(var2_2);
                    var26_26 /* !! */ .setOnClickListener((View.OnClickListener)var8_8 /* !! */ );
                }
                if (var20_20 != null) {
                    var8_8 /* !! */  = new da$a();
                    var8_8 /* !! */ .k = var4_4;
                    var8_8 /* !! */ .g = var4_4;
                    if (var12_12 != null) {
                        var26_26 /* !! */  = var12_12.getIconURL();
                    } else {
                        var25_25 = 0;
                        var26_26 /* !! */  = null;
                    }
                    var8_8 /* !! */ .n = var26_26 /* !! */ ;
                    var8_8 /* !! */ .u = var20_20;
                    var8_8 /* !! */ .a();
                }
                if (var16_16 != null) {
                    if (var12_12 != null) {
                        var8_8 /* !! */  = var12_12.getName();
                    } else {
                        var11_11 = 0;
                        var8_8 /* !! */  = null;
                    }
                    var16_16.setText((CharSequence)var8_8 /* !! */ );
                }
                if (var12_12 != null) {
                    var8_8 /* !! */  = var12_12.getDisabled();
                    var16_16 = Boolean.TRUE;
                    var11_11 = Intrinsics.areEqual(var8_8 /* !! */ , var16_16);
                } else {
                    var11_11 = 0;
                    var8_8 /* !! */  = null;
                }
                if (var11_11 != 0) {
                    if (var5_5 != null) {
                        var5_5.setClickable(false);
                    }
                    if (var5_5 != null) {
                        var5_5.setEnabled(false);
                    }
                    if (var14_14 != null) {
                        var9_9 = 0x3F000000;
                        var10_10 = 0.5f;
                        var14_14.setAlpha(var10_10);
                    }
                    if (var18_18 != null) {
                        AJIOApplication.Companion.getClass();
                        var5_5 = AJIOApplication$a.a();
                        var11_11 = R$string.emi_not_available;
                        var5_5 = var5_5.getString(var11_11);
                        var18_18.setText((CharSequence)var5_5);
                    }
                    if (var18_18 != null) {
                        ai0_2.B((View)var18_18);
                    }
                } else {
                    if (var5_5 != null) {
                        var5_5.setClickable((boolean)var4_4);
                    }
                    if (var5_5 != null) {
                        var5_5.setEnabled((boolean)var4_4);
                    }
                    if (var14_14 != null) {
                        var9_9 = 1065353216;
                        var10_10 = 1.0f;
                        var14_14.setAlpha(var10_10);
                    }
                    if (var18_18 != null) {
                        ai0_2.i((View)var18_18);
                    }
                }
                if (var12_12 != null) {
                    var5_5 = var12_12.getNo_cost_emi_enabled();
                    var8_8 /* !! */  = Boolean.TRUE;
                    var9_9 = (int)Intrinsics.areEqual(var5_5, var8_8 /* !! */ );
                } else {
                    var9_9 = 0;
                    var10_10 = 0.0f;
                    var5_5 = null;
                }
                if (var9_9 != 0) {
                    if (var24_24 != null) {
                        AJIOApplication.Companion.getClass();
                        var5_5 = AJIOApplication$a.a();
                        var11_11 = R$string.emi_available;
                        var5_5 = var5_5.getString(var11_11);
                        var24_24.setText((CharSequence)var5_5);
                    }
                    if (var24_24 != null) {
                        ai0_2.B((View)var24_24);
                    }
                } else if (var24_24 != null) {
                    ai0_2.i((View)var24_24);
                }
                if ((var9_9 = (int)og1_1.c()) == 0) break block72;
                if (var24_24 == null) ** GOTO lbl-1000
                var9_9 = var24_24.getVisibility();
                if (var9_9 == 0) {
                    var9_9 = 1;
                    var10_10 = 1.4E-45f;
                } else {
                    var9_9 = 0;
                    var10_10 = 0.0f;
                    var5_5 = null;
                }
                if (var9_9 == var4_4) {
                    var9_9 = 1;
                    var10_10 = 1.4E-45f;
                } else lbl-1000:
                // 2 sources

                {
                    var9_9 = 0;
                    var10_10 = 0.0f;
                    var5_5 = null;
                }
                if (var9_9 == 0) break block72;
                if (var18_18 == null) ** GOTO lbl-1000
                var9_9 = var18_18.getVisibility();
                if (var9_9 == 0) {
                    var9_9 = 1;
                    var10_10 = 1.4E-45f;
                } else {
                    var9_9 = 0;
                    var10_10 = 0.0f;
                    var5_5 = null;
                }
                if (var9_9 == var4_4) {
                    var9_9 = 1;
                    var10_10 = 1.4E-45f;
                } else lbl-1000:
                // 2 sources

                {
                    var9_9 = 0;
                    var10_10 = 0.0f;
                    var5_5 = null;
                }
                if (var9_9 != 0) {
                    var9_9 = var24_24.getPaddingLeft();
                    var11_11 = var24_24.getPaddingRight();
                    var19_19 = var24_24.getPaddingBottom();
                    var24_24.setPadding(var9_9, 0, var11_11, var19_19);
                }
            }
            var11_11 = 0;
            var8_8 /* !! */  = null;
        }
    }
}

