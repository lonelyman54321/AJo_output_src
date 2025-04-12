/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.EddResult;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.user.GPSLocationData;
import com.ril.ajio.services.data.user.LocationData;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from o12
 */
public final class o12_0
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public final hh3_2 a;
    public RelativeLayout b;
    public TextView c;
    public TextView d;
    public EditText e;
    public String f;
    public int g;
    public EddResult h;
    public yi2_1 i;
    public j3_0 j;
    public final NewCustomEventsRevamp k;
    public final String l;
    public final String m;
    public Bundle n;
    public Product o;
    public String p;
    public ImageView q;
    public wx1_1 r;
    public String s;
    public lz1_1 t;
    public final hh3_2 u;
    public final hh3_2 v;
    public final hh3_2 w;

    public o12_0() {
        Object object = new l12_0(this, 0);
        this.a = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.k = object2;
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.l = object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        this.m = object = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        object = new Bundle();
        this.n = object;
        this.p = object = ld3_2.STORE_AJIO.getStoreId();
        this.s = "";
        int n3 = 1;
        object = new lc0_2(this, n3);
        this.u = object = yr1_2.b((Function0)object);
        object = new mc0_1(this, n3);
        this.v = object = yr1_2.b((Function0)object);
        object = new Y8(this, n3);
        this.w = object = yr1_2.b((Function0)object);
    }

    public final void Oa(String string2) {
        Object object = this.f;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            String string3 = "pdp screen";
            cP.b("Check EDD for pincode-", string2, (GTMEvents)object, "EDD on PDP", string3);
            object = (e12_0)this.v.getValue();
            String string4 = this.f;
            Intrinsics.checkNotNull(string4);
            int n3 = this.g;
            ((e12_0)object).l(n3, string2, string4, false);
        }
    }

    public final void Pa(String string2) {
        Object object = this.f;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            cP.b("Check EDD for pincode-", string2, (GTMEvents)object, "EDD on PDP", "pdp screen");
            Object object2 = object = this.v.getValue();
            object2 = (e12_0)object;
            String string3 = this.f;
            Intrinsics.checkNotNull(string3);
            int n3 = this.g;
            Product product = this.o;
            ((e12_0)object2).m(string2, string3, n3, false, product, false);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Qa(Product serializable, String string2, String string3) {
        block18: {
            Object object;
            Object object2;
            Object object3;
            double d2;
            boolean bl2;
            Object object4;
            block21: {
                double d5;
                block20: {
                    block19: {
                        NumberFormatException numberFormatException2;
                        block14: {
                            int n3;
                            object4 = "storeId";
                            Intrinsics.checkNotNullParameter(string3, (String)object4);
                            this.o = serializable;
                            this.f = string2;
                            this.g = n3 = 1;
                            string2 = new Bundle();
                            if (serializable == null) break block18;
                            bl2 = false;
                            object4 = null;
                            d2 = 0.0;
                            try {
                                object3 = serializable.getPrice();
                                object3 = object3 != null ? ((Price)object3).getValue() : null;
                            }
                            catch (NumberFormatException numberFormatException2) {
                                break block14;
                            }
                            if (object3 == null || (object3 = serializable.getPrice()) == null || (object3 = ((Price)object3).getValue()) == null) break block19;
                            d5 = Double.parseDouble((String)object3);
                            break block20;
                        }
                        object2 = yn3_0.a;
                        ((yn3$a)object2).e(numberFormatException2);
                    }
                    d5 = d2;
                }
                double d7 = d5 == d2 ? 0 : (d5 < d2 ? -1 : 1);
                if (d7 != false) {
                    NumberFormatException numberFormatException3;
                    block17: {
                        block16: {
                            block15: {
                                try {
                                    object = serializable.getWasPriceData();
                                    if (object == null) break block15;
                                    object = ((Price)object).getValue();
                                    break block16;
                                }
                                catch (NumberFormatException numberFormatException3) {
                                    break block17;
                                }
                            }
                            d7 = 0.0;
                            object = null;
                        }
                        if (object != null) {
                            object = serializable.getWasPriceData();
                            if (object != null && (object = ((Price)object).getValue()) != null) {
                                double d9 = Double.parseDouble((String)object);
                                object4 = d9;
                            }
                            Intrinsics.checkNotNull(object4);
                            double d12 = (Double)object4;
                            d2 = d12 - d5;
                        }
                        break block21;
                    }
                    object3 = yn3_0.a;
                    ((yn3$a)object3).e(numberFormatException3);
                }
            }
            bl2 = hv3_0.Y();
            object3 = "";
            object4 = bl2 && (object4 = serializable.getSelectedSizeVariant()) != null ? Y63.c((ProductOptionVariant)object4) : object3;
            object2 = this.k;
            object = ((NewCustomEventsRevamp)object2).getPRODUCT_NAME();
            Object object5 = serializable.getName();
            if (object5 == null) {
                object5 = object3;
            }
            string2.putString((String)object, (String)object5);
            object = ((NewCustomEventsRevamp)object2).getPRODUCT_ID();
            object5 = serializable.getCode();
            if (object5 == null) {
                object5 = object3;
            }
            string2.putString((String)object, (String)object5);
            object = ((NewCustomEventsRevamp)object2).getPRODUCT_BRAND();
            object5 = serializable.getBrandName();
            if (object5 == null) {
                object5 = object3;
            }
            string2.putString((String)object, (String)object5);
            object = ((NewCustomEventsRevamp)object2).getPRODUCT_PRICE();
            object5 = serializable.getPrice();
            if (object5 == null || (object5 = ((Price)object5).getValue()) == null) {
                object5 = object3;
            }
            string2.putString((String)object, (String)object5);
            object = ((NewCustomEventsRevamp)object2).getPRODUCT_COLOR();
            object5 = hv3_0.n(serializable);
            string2.putString((String)object, (String)object5);
            object = ((NewCustomEventsRevamp)object2).getPRODUCT_SIZE();
            string2.putString((String)object, (String)object4);
            object4 = ((NewCustomEventsRevamp)object2).getPRODUCT_DISCOUNT();
            string2.putDouble((String)object4, d2);
            object4 = ((NewCustomEventsRevamp)object2).getPRODUCT_CATEGORY();
            Object object6 = serializable.getBrickCategory();
            if (object6 == null) {
                object6 = object3;
            }
            string2.putString((String)object4, (String)object6);
            object4 = ((NewCustomEventsRevamp)object2).getPRODUCT_BRICK();
            object6 = serializable.getBrickCategory();
            if (object6 == null) {
                object6 = object3;
            }
            string2.putString((String)object4, (String)object6);
            object4 = ((NewCustomEventsRevamp)object2).getPRODUCT_TAG();
            object6 = hv3_0.a;
            ProductFnlColorVariantData productFnlColorVariantData = serializable.getFnlColorVariantData();
            object6.getClass();
            object6 = hv3_0.A(productFnlColorVariantData);
            boolean bl3 = TextUtils.isEmpty((CharSequence)object6);
            if (!bl3) {
                serializable = serializable.getFnlColorVariantData();
                object3 = hv3_0.A((ProductFnlColorVariantData)serializable);
            }
            string2.putString((String)object4, (String)object3);
        }
        this.n = string2;
        this.p = string3;
    }

    public final void onActivityCreated(Bundle object) {
        super.onActivityCreated((Bundle)object);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        Object object4 = wx1_1.class;
        String string2 = "modelClass";
        object = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object, object4, string2);
        object2 = "<this>";
        object3 = sw0_0.a(object4, (String)object2, object4, string2, string2);
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = object3.getQualifiedName();
        if (object2 != null) {
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object2 = ((String)object4).concat((String)object2);
            this.r = object = (wx1_1)((pD3)object).a((yn1_2)object3, (String)object2);
            object = this.v;
            object2 = (e12_0)((hh3_2)object).getValue();
            if (object2 != null) {
                ((e12_0)object2).q = object3 = this.o;
            }
            if ((object = (e12_0)((hh3_2)object).getValue()) != null && (object = ((e12_0)object).Q0) != null) {
                object2 = this.getViewLifecycleOwner();
                object4 = null;
                object3 = new k12_0(this, 0);
                ((LiveData)object).e((mu1_1)object2, (F62)object3);
            }
            if ((object = this.r) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
                object = null;
            }
            object = ((wx1_1)object).v;
            object2 = this.getViewLifecycleOwner();
            object3 = new t8_0(this, 1);
            object4 = new o12$a((Function1)object3);
            ((LiveData)object).e((mu1_1)object2, (F62)object4);
            object = ((hy3_0)this.w.getValue()).w;
            object2 = this.getViewLifecycleOwner();
            object3 = new F61(this, 1);
            object4 = new o12$a((Function1)object3);
            ((LiveData)object).e((mu1_1)object2, (F62)object4);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        Object object2 = this.getParentFragment();
        String string2 = "null cannot be cast to non-null type com.ril.ajio.pdprefresh.callbacks.PDPInfoProvider";
        Intrinsics.checkNotNull(object2, string2);
        this.i = object2 = (yi2_1)object2;
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object2 = object;
            this.j = object2 = (j3_0)object;
        }
        if (bl2 = object instanceof lz1_1) {
            object = (lz1_1)object;
            this.t = object;
            return;
        }
        object = pn_2.b(object, " must implement LoginListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View view) {
        o12_0 o12_02 = this;
        Object object = "view";
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, (String)object);
        int n3 = view.getId();
        int n4 = R$id.close_dialog;
        if (n3 == n4) {
            this.dismissAllowingStateLoss();
        } else {
            n4 = R$id.fragment_pincode_tv_check;
            if (n3 == n4) {
                n3 = (int)(h40_0.Q1() ? 1 : 0);
                n4 = 0;
                object2 = null;
                int n7 = 6;
                Object object3 = null;
                if (n3 != 0) {
                    object = this.e;
                    Intrinsics.checkNotNull(object);
                    object = object.getText().toString();
                    n3 = ((String)object).length();
                    if (n3 < n7) {
                        object = this.c;
                        if (object != null) {
                            object.setVisibility(0);
                        }
                        if ((object = o12_02.c) != null) {
                            ai0_2.a((View)object);
                        }
                        if ((object = o12_02.c) != null) {
                            n4 = R$string.invalid_pincode_refresh_luxe;
                            object2 = hv3_0.K(n4);
                            object.setText((CharSequence)object2);
                        }
                    } else {
                        GPSLocationData gPSLocationData;
                        object = this.e;
                        if (object != null) {
                            object3 = object.getText();
                        }
                        object = String.valueOf(object3);
                        o12_02.s = object;
                        object = (hy3_0)o12_02.w.getValue();
                        String string2 = o12_02.s;
                        object3 = null;
                        Object var11_13 = null;
                        int n8 = 3;
                        Object var13_16 = null;
                        GPSLocationData gPSLocationData2 = gPSLocationData;
                        gPSLocationData = new GPSLocationData(null, null, string2, n8, null);
                        ((hy3_0)object).j(gPSLocationData, false);
                    }
                } else {
                    object = this.e;
                    Intrinsics.checkNotNull(object);
                    object = object.getText().toString();
                    n3 = ((String)object).length();
                    if (n3 < n7) {
                        object = this.c;
                        if (object != null) {
                            object.setVisibility(0);
                        }
                        if ((object = o12_02.c) != null) {
                            ai0_2.a((View)object);
                        }
                        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        object2 = o12_02.e;
                        if (object2 != null) {
                            object3 = object2.getText();
                        }
                        object2 = new StringBuilder("Invalid Pincode entered -");
                        ((StringBuilder)object2).append(object3);
                        object2 = ((StringBuilder)object2).toString();
                        String string3 = "pdp screen";
                        object3 = "EDD on PDP";
                        ((GTMEvents)object).pushButtonTapEvent((String)object3, object2, string3);
                        NewCustomEventsRevamp newCustomEventsRevamp = o12_02.k;
                        String string4 = newCustomEventsRevamp.getEC_PRODUCT_DETAILS_INTERACTIONS();
                        Bundle bundle = o12_02.n;
                        String string5 = o12_02.l;
                        String string6 = o12_02.m;
                        String string7 = "estimate delivery date";
                        String string8 = "error";
                        String string9 = "edd_error";
                        String string10 = "pdp screen";
                        String string11 = "pdp screen";
                        int n10 = 1536;
                        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string4, string7, string8, string9, string10, string11, string5, bundle, string6, false, null, n10, null);
                        object = o12_02.c;
                        if (object != null) {
                            n4 = R$string.invalid_pincode_refresh_luxe;
                            object2 = hv3_0.K(n4);
                            object.setText((CharSequence)object2);
                        }
                    } else {
                        object = this.e;
                        Intrinsics.checkNotNull(object);
                        object = object.getText().toString();
                        object2 = (jo_2)this.a.getValue();
                        ((jo_2)object2).G((String)object);
                        n4 = (int)(mz3_0.B() ? 1 : 0);
                        if (n4 != 0 && (n4 = (int)(((UserInformation)(object2 = UserInformation.getInstance(this.getContext()))).isUserOnline() ? 1 : 0)) != 0) {
                            this.Pa((String)object);
                        } else {
                            o12_02.Oa((String)object);
                        }
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$style.PinCodeBottomSheetFragment;
        this.setStyle(0, n3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = h40_0.Q1();
        Object object2 = null;
        String string2 = "pdpInfoProvider";
        if (n3 != 0) {
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object2 = object;
            }
            n3 = object2.c9();
            if (n3 != 0) {
                n3 = R$layout.new_pdp_pincode_layout_new;
                return layoutInflater.inflate(n3, viewGroup, false);
            }
            n3 = R$layout.new_pdp_pincode_layout_new;
            return layoutInflater.inflate(n3, viewGroup, false);
        }
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = object;
        }
        n3 = object2.c9();
        if (n3 != 0) {
            n3 = R$layout.luxe_new_pdp_pincode_layout;
            return layoutInflater.inflate(n3, viewGroup, false);
        }
        n3 = R$layout.new_pdp_pincode_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        Object object = this.p;
        String string2 = ld3_2.STORE_AJIOGRAM.getStoreId();
        boolean bl2 = Intrinsics.areEqual(object, string2);
        string2 = "onGetLayoutInflater(...)";
        if (bl2) {
            bundle = super.onGetLayoutInflater(bundle);
            Intrinsics.checkNotNullExpressionValue(bundle, string2);
            string2 = this.requireContext();
            int n3 = R$style.FleekTheme;
            object = new d80((Context)string2, n3);
            bundle = bundle.cloneInContext((Context)object);
            Intrinsics.checkNotNullExpressionValue(bundle, "cloneInContext(...)");
            return bundle;
        }
        bundle = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(bundle, string2);
        return bundle;
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n7 = R$id.parent_layout;
        object2 = (RelativeLayout)object.findViewById(n7);
        this.b = object2;
        n7 = R$id.fragment_pincode_et_pincode;
        object2 = (EditText)object.findViewById(n7);
        this.e = object2;
        n7 = R$id.close_dialog;
        object2 = (ImageView)object.findViewById(n7);
        this.q = object2;
        object2 = z40_0.Companion;
        Object object3 = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object3, "getApplication(...)");
        object2.getClass();
        object2 = z40$a.a((Context)object3).a;
        object3 = "pdp_customer_pincode_edd";
        n7 = (int)(((ao0_0)object2).a((String)object3) ? 1 : 0);
        int n8 = 6;
        Object object4 = null;
        if (n7 != 0) {
            tj2_2.Companion.getClass();
            object2 = tj2$a_0.a().a;
            n7 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
            if (n7 == 0) {
                object2 = this.e;
                if (object2 != null) {
                    String string2 = tj2$a_0.a().a;
                    object2.setText((CharSequence)string2);
                }
                if ((object2 = this.e) != null && (object2 = object2.getText()) != null && (object2 = StringsKt.m0((CharSequence)object2)) != null) {
                    n7 = object2.length();
                    object2 = n7;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n7 = (Integer)object2;
                if (n7 <= n8 && (object2 = this.e) != null) {
                    object3 = object2.getText();
                    if (object3 != null && (object3 = StringsKt.m0((CharSequence)object3)) != null) {
                        n8 = object3.length();
                        object3 = n8;
                    } else {
                        n8 = 0;
                        object3 = null;
                    }
                    Intrinsics.checkNotNull(object3);
                    n8 = (Integer)object3;
                    object2.setSelection(n8);
                }
                if ((object2 = this.e) != null) {
                    object2.requestFocus();
                }
            } else {
                AJIOApplication.Companion.getClass();
                Object object5 = AJIOApplication$a.a();
                object2 = new jo_2((Context)object5);
                object2 = ((jo_2)object2).i();
                if (object2 != null && (n4 = TextUtils.isEmpty((CharSequence)(object5 = ((LocationData)object2).getPincode()))) == 0) {
                    object5 = this.e;
                    if (object5 != null) {
                        object2 = ((LocationData)object2).getPincode();
                        object5.setText((CharSequence)object2);
                    }
                    if ((object2 = this.e) != null && (object2 = object2.getText()) != null && (object2 = StringsKt.m0((CharSequence)object2)) != null) {
                        n7 = object2.length();
                        object2 = n7;
                    } else {
                        n7 = 0;
                        object2 = null;
                    }
                    Intrinsics.checkNotNull(object2);
                    n7 = (Integer)object2;
                    if (n7 <= n8 && (object2 = this.e) != null) {
                        object3 = object2.getText();
                        if (object3 != null && (object3 = StringsKt.m0((CharSequence)object3)) != null) {
                            n8 = object3.length();
                            object3 = n8;
                        } else {
                            n8 = 0;
                            object3 = null;
                        }
                        Intrinsics.checkNotNull(object3);
                        n8 = (Integer)object3;
                        object2.setSelection(n8);
                    }
                    if ((object2 = this.e) != null) {
                        object2.requestFocus();
                    }
                }
            }
        } else {
            tj2_2.Companion.getClass();
            object2 = tj2$a_0.a().a;
            n7 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
            if (n7 == 0) {
                object2 = this.e;
                if (object2 != null) {
                    String string3 = tj2$a_0.a().a;
                    object2.setText((CharSequence)string3);
                }
                if ((object2 = this.e) != null && (object2 = object2.getText()) != null && (object2 = StringsKt.m0((CharSequence)object2)) != null) {
                    n7 = object2.length();
                    object2 = n7;
                } else {
                    n7 = 0;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                n7 = (Integer)object2;
                if (n7 <= n8 && (object2 = this.e) != null) {
                    object3 = object2.getText();
                    if (object3 != null) {
                        n8 = object3.length();
                        object3 = n8;
                    } else {
                        n8 = 0;
                        object3 = null;
                    }
                    Intrinsics.checkNotNull(object3);
                    n8 = (Integer)object3;
                    object2.setSelection(n8);
                }
                if ((object2 = this.e) != null) {
                    object2.requestFocus();
                }
            }
        }
        n7 = R$id.fragment_pincode_tv_error;
        object2 = (TextView)object.findViewById(n7);
        this.c = object2;
        if (object2 != null) {
            n8 = 4;
            object2.setVisibility(n8);
        }
        if ((object2 = this.e) != null) {
            object3 = new n12(this);
            object2.addTextChangedListener((TextWatcher)object3);
        }
        n7 = R$id.fragment_pincode_tv_check;
        object = (TextView)object.findViewById(n7);
        this.d = object;
        if (object != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.q) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        object = this.i;
        object2 = "pdpInfoProvider";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        if ((n3 = object.c9()) != 0) {
            object = this.e;
            if (object != null) {
                object.requestFocus();
            }
            if ((object = this.getContext()) != null) {
                object = object.getSystemService("input_method");
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                object = (InputMethodManager)object;
                object3 = this.e;
                n4 = 2;
                object.showSoftInput((View)object3, n4);
            }
        }
        if ((n3 = h40_0.Q1()) != 0) {
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object4 = object;
            }
            n3 = object4.c9();
            if (n3 != 0) {
                object = this.e;
                if (object != null) {
                    object.requestFocus();
                }
                if ((object = this.d) != null) {
                    n7 = 1;
                    object.setAllCaps(n7 != 0);
                }
                if ((object = this.d) != null) {
                    n3 = object.getPaintFlags();
                    object2 = this.d;
                    if (object2 != null) {
                        object2.setPaintFlags(n3 |= 8);
                    }
                }
                if ((object = this.d) != null) {
                    object2 = "#121212";
                    n7 = Color.parseColor((String)object2);
                    object.setTextColor(n7);
                }
            }
        }
        object2 = Looper.getMainLooper();
        object = new Handler((Looper)object2);
        object2 = new CC0(this, 1);
        object.postDelayed((Runnable)object2, 300L);
    }
}

