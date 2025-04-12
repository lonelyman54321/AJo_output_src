/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.text.TextWatcher
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.gson.Gson;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioCheckBox;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PENonScrollableListView;
import com.ril.ajio.customviews.widgets.PEToggleButton;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PlatformData;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.UPI;
import com.ril.ajio.services.data.Payment.UpiAppData;
import com.ril.ajio.services.data.Payment.UpiAppInfo;
import com.ril.ajio.services.data.Payment.UpiAppsConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from ss2
 */
public final class ss2_2
extends rw_2
implements xt3_0,
PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener {
    public final dv_0 b;
    public final co2_0 c;
    public final op2_2 d;
    public final mu1_1 e;
    public final Context f;
    public final AjioCustomExpandablePanel g;
    public final PEToggleButton h;
    public final EditText i;
    public final LinearLayout j;
    public final TextView k;
    public final AjioCheckBox l;
    public final AjioTextView m;
    public final PENonScrollableListView n;
    public final TextView o;
    public final PesdkLoyaltyCardInfoView p;
    public final NewCustomEventsRevamp q;
    public final int r;
    public PaymentInstrumentType s;
    public UPI t;
    public tt3_0 u;
    public final cu3 v;

    public ss2_2(dv_0 dv_02, mu1_1 mu1_12, co2_0 co2_02, op2_2 op2_22, View view) {
        int n3;
        Object object = view;
        Intrinsics.checkNotNullParameter(view, "v");
        Intrinsics.checkNotNullParameter(co2_02, "paymentInfoProvider");
        super(view);
        this.b = dv_02;
        this.c = co2_02;
        this.d = op2_22;
        this.e = mu1_12;
        Object object2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(object2, "getContext(...)");
        this.f = object2;
        int n4 = R$id.expandable_payment_upi;
        Object object3 = view.findViewById(n4);
        Object object4 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        object3 = (AjioCustomExpandablePanel)((Object)object3);
        this.g = object3;
        n4 = R$id.upi_toggle_expand;
        object3 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        object3 = (PEToggleButton)object3;
        this.h = object3;
        int n7 = R$id.upi_value;
        View view2 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object4);
        view2 = (EditText)view2;
        this.i = view2;
        n7 = R$id.upi_ll;
        view2 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object4);
        view2 = (LinearLayout)view2;
        this.j = view2;
        int n8 = R$id.proceed_btn_tv;
        View view3 = view.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object4);
        view3 = (TextView)view3;
        this.k = view3;
        int n10 = R$id.upi_enroll_check_box;
        Object object5 = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        object5 = (AjioCheckBox)object5;
        this.l = object5;
        n10 = R$id.upi_invalid_error_tv;
        object5 = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        object5 = (AjioTextView)object5;
        this.m = object5;
        n10 = R$id.tv_enter_upiid;
        object5 = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
        object5 = (TextView)object5;
        int n14 = R$id.pf_container;
        View view4 = view.findViewById(n14);
        Intrinsics.checkNotNullExpressionValue(view4, (String)object4);
        view4 = (TextView)view4;
        int n15 = R$id.upi_intent_app;
        Object object6 = view.findViewById(n15);
        Intrinsics.checkNotNullExpressionValue(object6, (String)object4);
        object6 = (PENonScrollableListView)((Object)object6);
        this.n = object6;
        n15 = R$id.tv_how_to_find_upi;
        object6 = view.findViewById(n15);
        Intrinsics.checkNotNullExpressionValue(object6, (String)object4);
        object6 = (TextView)object6;
        this.o = object6;
        int n16 = R$id.layout_loyaltyCardInfo;
        object4 = object = view.findViewById(n16);
        object4 = (PesdkLoyaltyCardInfoView)((Object)object);
        this.p = object4;
        object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.q = object;
        this.r = n3 = -1;
        super((Context)object2);
        this.v = object;
        int n17 = 8;
        view4.setVisibility(n17);
        ai0_2.t(view2);
        n7 = 2;
        super(this, n7);
        view3.setOnClickListener((View.OnClickListener)object2);
        super(this);
        object3.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object2);
        ((PEToggleButton)object3).setSpanText();
        object2 = object4;
        object3 = view3;
        ((cu3)object).d(op2_22, mu1_12, co2_02, dv_02, (PesdkLoyaltyCardInfoView)((Object)object4), (TextView)view3);
        if (object4 != null) {
            ((PesdkLoyaltyCardInfoView)((Object)object4)).setCardClickListener(this);
        }
        object = new rc0_0(this, 1);
        object6.setOnClickListener((View.OnClickListener)object);
        object = hv3_0.K(R$string.pesdk_enter_ur_upiid);
        object5.setText((CharSequence)object);
    }

    public final void a(hj_1 hj_12, UpiAppInfo upiAppInfo) {
        Intrinsics.checkNotNullParameter((Object)hj_12, "requestType");
        this.v.a(hj_12, upiAppInfo);
    }

    public final void c(PriceValidation object) {
        object = cp_1.Companion;
        object.getClass();
        boolean bl2 = cp$a.s();
        if (bl2) {
            object = this.k;
            int n3 = 8;
            object.setVisibility(n3);
            object = this.p;
            if (object != null) {
                object.setVisibility(n3);
            }
        }
        if ((object = this.v.i) != null) {
            Boolean bl3 = Boolean.TRUE;
            object.Ka(null, bl3);
        }
    }

    public final void onLoyaltyDeSelected(LpStoredCardBalance lpStoredCardBalance) {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.onLoyaltyDeSelected(this, lpStoredCardBalance);
    }

    public final void onLoyaltySelected(LpStoredCardBalance lpStoredCardBalance) {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.onLoyaltySelected(this, lpStoredCardBalance);
    }

    public final void onOfferClicked(OfferDetails offerDetails) {
        Intrinsics.checkNotNullParameter(offerDetails, "offerDetail");
        dv_0 dv_02 = this.b;
        if (dv_02 != null) {
            dv_02.b(offerDetails);
        }
    }

    public final void onRegisterMobileClicked(LpStoredCardBalance lpStoredCardBalance) {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.onRegisterMobileClicked(this, lpStoredCardBalance);
    }

    public final void showLoyaltyInfoFragment() {
        PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener$DefaultImpls.showLoyaltyInfoFragment(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void w(PaymentInstrumentType serializable, PaymentInstrumentType paymentInstrumentType, boolean bl2) {
        int n3;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        cu3 cu32;
        Object object7;
        Object object8;
        Object object9;
        int n4;
        Object object10;
        ss2_2 ss2_22;
        block50: {
            UpiAppInfo upiAppInfo;
            int n7;
            int n8;
            Object object11;
            int n10;
            block52: {
                int n14;
                int n15;
                block51: {
                    int n16;
                    ss2_22 = this;
                    object10 = serializable;
                    n4 = 1;
                    this.s = serializable;
                    int n17 = 0;
                    object9 = null;
                    if (serializable != null) {
                        object8 = ((PaymentInstrumentType)serializable).getPaymentInstrumentName();
                    } else {
                        n10 = 0;
                        object8 = null;
                    }
                    object7 = ss2_22.h;
                    object7.setText((CharSequence)object8);
                    if (object10 != null) {
                        object8 = ((PaymentInstrumentType)serializable).getPaymentInstrumentName();
                    } else {
                        n10 = 0;
                        object8 = null;
                    }
                    object7.setTextOn((CharSequence)object8);
                    if (object10 != null) {
                        object8 = ((PaymentInstrumentType)serializable).getPaymentInstrumentName();
                    } else {
                        n10 = 0;
                        object8 = null;
                    }
                    object7.setTextOff((CharSequence)object8);
                    cu32 = ss2_22.v;
                    cu32.b = object10;
                    object10 = cu32.c;
                    ((ArrayList)object10).clear();
                    object8 = "iterator(...)";
                    object7 = cu32.a;
                    if (object7 != null) {
                        int n18;
                        object7 = object7.getPackageManager();
                        object6 = new Intent("android.intent.action.MAIN", null);
                        object6.addCategory("android.intent.category.DEFAULT");
                        object6.addCategory("android.intent.category.BROWSABLE");
                        object6.setAction("android.intent.action.VIEW");
                        object5 = new Uri.Builder();
                        object5 = object5.scheme("upi").authority("pay").build();
                        object6.setData((Uri)object5);
                        object6 = object7.queryIntentActivities((Intent)object6, 0);
                        Intrinsics.checkNotNullExpressionValue(object6, "queryIntentActivities(...)");
                        object5 = new HashMap();
                        object4 = object6;
                        object4 = (Collection)object6;
                        n15 = object4.size();
                        object3 = null;
                        for (n18 = 0; n18 < n15; n18 += n4) {
                            object2 = (ResolveInfo)object6.get(n18);
                            object = ((ResolveInfo)object2).activityInfo.packageName;
                            ((HashMap)object5).put(object, object2);
                        }
                        object6 = cu32.b;
                        if (object6 != null && (object6 = ((PaymentInstrumentType)object6).getPaymentInstrumentsInfo()) != null) {
                            object6 = ((ArrayList)object6).iterator();
                            Intrinsics.checkNotNullExpressionValue(object6, (String)object8);
                            while ((n15 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
                                object4 = (PaymentInstrumentInfo)object6.next();
                                if (object4 != null) {
                                    object3 = ((PaymentInstrumentInfo)object4).getIntent();
                                    object2 = Boolean.TRUE;
                                    n18 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
                                } else {
                                    n18 = 0;
                                    object3 = null;
                                }
                                if (n18 == 0) continue;
                                if (object4 != null) {
                                    object4 = ((PaymentInstrumentInfo)object4).getIntentAppsData();
                                } else {
                                    n15 = 0;
                                    object4 = null;
                                }
                                try {
                                    int n19;
                                    int n20;
                                    object3 = new Gson();
                                    object2 = UpiAppsConfiguration.class;
                                    object4 = object3.fromJson((String)object4, (Class)object2);
                                    object4 = (UpiAppsConfiguration)object4;
                                    object4 = ((UpiAppsConfiguration)object4).getAndroid();
                                    object4 = ((PlatformData)object4).getUpiAppsData();
                                    object4 = (Iterable)object4;
                                    object3 = new Object();
                                    object4 = CollectionsKt.e0((Iterable)object4, (Comparator)object3);
                                    object4 = object4.iterator();
                                    while ((n18 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                                        object3 = object4.next();
                                        n20 = (object3 = (UpiAppData)object3).is_active();
                                        if (n20 != n4 || (n20 = (int)(((HashMap)object5).containsKey(object2 = object3.getPackage_name()) ? 1 : 0)) == 0) continue;
                                        object2 = object3.getPackage_name();
                                        object2 = ((HashMap)object5).get(object2);
                                        if ((object2 = (ResolveInfo)object2) != null) {
                                            object = object2.loadLabel((PackageManager)object7);
                                        } else {
                                            n14 = 0;
                                            object = null;
                                        }
                                        object11 = object2 != null ? object2.loadIcon((PackageManager)object7) : null;
                                        n8 = 0;
                                        n7 = 0;
                                        n19 = 255;
                                        serializable = upiAppInfo;
                                        upiAppInfo = new UpiAppInfo(null, null, null, null, null, null, null, null, n19, null);
                                        object = String.valueOf(object);
                                        upiAppInfo.setName((String)object);
                                        upiAppInfo.setAppDrawabe((Drawable)object11);
                                        if (object2 != null && (object2 = ((ResolveInfo)object2).activityInfo) != null) {
                                            object2 = ((ActivityInfo)object2).packageName;
                                        } else {
                                            n20 = 0;
                                            object2 = null;
                                        }
                                        upiAppInfo.setPackageName((String)object2);
                                        ((ArrayList)object10).add(upiAppInfo);
                                        object3 = object3.getPackage_name();
                                        object2 = TypeIntrinsics.asMutableMap(object5);
                                        object2.remove(object3);
                                    }
                                    object4 = ((HashMap)object5).entrySet();
                                    object4 = object4.iterator();
                                    while ((n18 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                                        object3 = object4.next();
                                        object2 = "next(...)";
                                        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                                        object3 = (Map.Entry)object3;
                                        object2 = object3.getKey();
                                        object = "component1(...)";
                                        Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                                        object2 = (String)object2;
                                        object3 = object3.getValue();
                                        object2 = "component2(...)";
                                        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                                        object3 = object3;
                                        if (object3 != null) {
                                            object2 = object3.loadLabel((PackageManager)object7);
                                        } else {
                                            n20 = 0;
                                            object2 = null;
                                        }
                                        if (object3 != null) {
                                            object = object3.loadIcon((PackageManager)object7);
                                        } else {
                                            n14 = 0;
                                            object = null;
                                        }
                                        n8 = 0;
                                        n7 = 255;
                                        n19 = 0;
                                        object11 = upiAppInfo;
                                        object9 = upiAppInfo;
                                        upiAppInfo = null;
                                        ((UpiAppInfo)object11)(null, null, null, null, null, null, null, null, n7, null);
                                        object2 = String.valueOf(object2);
                                        ((UpiAppInfo)object11).setName((String)object2);
                                        ((UpiAppInfo)object11).setAppDrawabe((Drawable)object);
                                        if (object3 != null && (object3 = object3.activityInfo) != null) {
                                            object3 = object3.packageName;
                                        } else {
                                            n18 = 0;
                                            object3 = null;
                                        }
                                        ((UpiAppInfo)object9).setPackageName((String)object3);
                                        ((ArrayList)object10).add(object9);
                                        n17 = 0;
                                        object9 = null;
                                    }
                                    object9 = cu32.d;
                                    ((ArrayList)object9).clear();
                                    ((ArrayList)object9).addAll(object10);
                                }
                                catch (Exception exception) {
                                    object9 = yn3_0.a;
                                    object4 = "UPI exception in intent flow";
                                    object3 = new Object[]{};
                                    ((yn3$a)object9).a((String)object4, (Object[])object3);
                                    object9 = Unit.a;
                                }
                                n17 = 0;
                                object9 = null;
                            }
                        }
                    }
                    z40_0.Companion.getClass();
                    n17 = z40$a.a((Context)ss2_22.f).a.a("spc_upi_checkbox_flag");
                    object7 = ss2_22.l;
                    object7.setChecked(n17 != 0);
                    object3 = ss2_22.c;
                    object9 = object3.j0();
                    if (object9 != null) {
                        object9 = ((PaymentInstruments)object9).getHowToFindUPISteps();
                    } else {
                        n17 = 0;
                        object9 = null;
                    }
                    object9 = (Collection)object9;
                    if (object9 != null && (n17 = object9.isEmpty()) == 0) {
                        n17 = 0;
                        object9 = null;
                    } else {
                        n17 = 1;
                    }
                    object7 = ss2_22.o;
                    if (n17 != 0) {
                        n17 = 4;
                        object7.setVisibility(n17);
                    } else {
                        object7.setVisibility(0);
                    }
                    object2 = ss2_22.k;
                    object9 = ss2_22.i;
                    if (paymentInstrumentType == null) break block50;
                    object7 = paymentInstrumentType.getPaymentInstrumentsInfo();
                    if (object7 != null) {
                        n16 = ((ArrayList)object7).size();
                    } else {
                        n16 = 0;
                        object7 = null;
                    }
                    if (n16 <= 0) break block50;
                    object7 = cp_1.Companion;
                    object7.getClass();
                    n16 = (int)(cp$a.s() ? 1 : 0);
                    if (n16 == 0) break block51;
                    object7 = paymentInstrumentType.getPaymentInstrumentsInfo();
                    if (object7 == null) break block50;
                    object7 = ((ArrayList)object7).iterator();
                    Intrinsics.checkNotNullExpressionValue(object7, (String)object8);
                    break block52;
                }
                object10 = paymentInstrumentType.getPaymentInstrumentsInfo();
                if (object10 == null) break block50;
                n10 = ((ArrayList)object10).size();
                object7 = new String[n10];
                object6 = object10.iterator();
                int n21 = 0;
                object5 = null;
                while ((n15 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
                    object4 = (PaymentInstrumentInfo)object6.next();
                    if (object4 == null) continue;
                    n14 = n21 + 1;
                    object7[n21] = object4 = ((PaymentInstrumentInfo)object4).getMaskedUPIInfo();
                    n21 = n14;
                }
                object7 = object7[n10 -= n4];
                object9.setText((CharSequence)object7);
                object11 = null;
                upiAppInfo = null;
                n8 = 255;
                n7 = 0;
                object = object7;
                ss2_22.t = object7 = new UPI(null, null, null, null, null, null, null, null, n8, null);
                object6 = (PaymentInstrumentInfo)((ArrayList)object10).get(n10);
                object6 = object6 != null ? ((PaymentInstrumentInfo)object6).getMaskedUPIInfo() : null;
                ((UPI)object7).setVpa((String)object6);
                object7 = ss2_22.t;
                if (object7 != null) {
                    if ((object10 = (PaymentInstrumentInfo)((ArrayList)object10).get(n10)) != null) {
                        object10 = ((PaymentInstrumentInfo)object10).getPaymentInstrumentId();
                    } else {
                        n3 = 0;
                        object10 = null;
                    }
                    ((UPI)object7).setPaymentInstrumentId((String)object10);
                }
                cu32.j = object10 = ss2_22.t;
                object2.setVisibility(0);
                break block50;
            }
            while ((n10 = (int)(object7.hasNext() ? 1 : 0)) != 0) {
                boolean bl3;
                object8 = (PaymentInstrumentInfo)object7.next();
                object11 = null;
                upiAppInfo = null;
                n8 = 255;
                n7 = 0;
                object = object6;
                object6 = new UpiAppInfo(null, null, null, null, null, null, null, null, n8, null);
                if (object8 != null) {
                    object5 = ((PaymentInstrumentInfo)object8).getMaskedUPIInfo();
                } else {
                    bl3 = false;
                    object5 = null;
                }
                ((UpiAppInfo)object6).setName((String)object5);
                if (object8 != null) {
                    object5 = ((PaymentInstrumentInfo)object8).getDisplayUPIInfo();
                } else {
                    bl3 = false;
                    object5 = null;
                }
                ((UpiAppInfo)object6).setDisplayUPIInfo((String)object5);
                if (object8 != null) {
                    object8 = ((PaymentInstrumentInfo)object8).getPaymentInstrumentId();
                } else {
                    n10 = 0;
                    object8 = null;
                }
                ((UpiAppInfo)object6).setPaymentInstrumentId((String)object8);
                ((ArrayList)object10).add(object6);
            }
        }
        object10 = new os2_2(ss2_22);
        object9.setOnTouchListener((View.OnTouchListener)object10);
        object10 = new ss2$a(ss2_22);
        object9.addTextChangedListener((TextWatcher)object10);
        object10 = new ps2_1(ss2_22);
        object9.setOnEditorActionListener((TextView.OnEditorActionListener)object10);
        if (bl2) {
            n3 = R$string.please_enter_valid_upi;
            object10 = hv3_0.K(n3);
            object9 = ss2_22.m;
            object9.setText((CharSequence)object10);
            object9.setVisibility(0);
            ai0_2.a((View)object9);
        }
        object8 = cu32.c;
        object6 = ss2_22.c;
        object9 = ss2_22.f;
        object7 = ss2_22.b;
        object10 = object;
        object5 = this;
        object4 = cu32;
        ss2_22.u = object = new tt3_0((Context)object9, (ArrayList)object8, (dv_0)object7, (co2_0)object6, this, cu32);
        ((tt3_0)object).f = n3 = ss2_22.r;
        cu32.e = object;
        object10 = ss2_22.n;
        object10.setAdapter((ListAdapter)object);
        object10.setVisibility(0);
        object2.setVisibility(0);
        object10 = ss2_22.p;
        if (object10 != null) {
            object10.setVisibility(0);
        }
        object10 = StringCompanionObject.INSTANCE;
        object10 = kq2_1.a(object3.D());
        object9 = new Object[n4];
        object9[0] = object10;
        zn0_1.b((Object[])object9, n4, "PAY \u20b9%s SECURELY", "format(...)", (TextView)object2);
    }
}

