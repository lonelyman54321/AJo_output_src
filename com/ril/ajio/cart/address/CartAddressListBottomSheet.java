/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.location.LocationManager
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.cart.address;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.b;
import androidx.lifecycle.E$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.cart.address.CartAddressListBottomSheet$a;
import com.ril.ajio.cart.address.CartAddressListBottomSheet$b;
import com.ril.ajio.cart.address.CartAddressListBottomSheet$locationModeReceiver$1;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.user.GPSLocationData;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.query.QueryAddress;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class CartAddressListBottomSheet
extends BottomSheetDialogFragment
implements View.OnClickListener,
s72_0 {
    public static final CartAddressListBottomSheet$a Companion;
    public final String A;
    public final String B;
    public FusedLocationProviderClient C;
    public wx1_1 D;
    public String E;
    public String F;
    public double G;
    public boolean H;
    public final hh3_2 I;
    public final CartAddressListBottomSheet$locationModeReceiver$1 J;
    public bn_1 a;
    public AjioProgressView b;
    public h5_0 c;
    public RecyclerView d;
    public CartDeliveryAddress e;
    public final ArrayList f;
    public AjioLoaderView g;
    public View h;
    public View i;
    public View j;
    public View k;
    public View l;
    public View m;
    public AjioTextView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public ConstraintLayout r;
    public ConstraintLayout s;
    public ConstraintLayout t;
    public zm_2 u;
    public Button v;
    public Button w;
    public final hh3_2 x;
    public final NewEEcommerceEventsRevamp y;
    public final NewCustomEventsRevamp z;

    static {
        CartAddressListBottomSheet$a cartAddressListBottomSheet$a;
        Companion = cartAddressListBottomSheet$a = new Object();
    }

    public CartAddressListBottomSheet() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = new ArrayList();
        this.f = object;
        object = new qm_2(this);
        this.x = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        this.y = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.z = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.A = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.B = object = newEEcommerceEventsRevamp.getPrevScreenType();
        this.E = object = "";
        this.F = object;
        object = new rm_2(this, 0);
        this.I = object = yr1_2.b((Function0)object);
        object = new CartAddressListBottomSheet$locationModeReceiver$1(this);
        this.J = object;
    }

    public static void Qa(String string2, String string3, String string4) {
        NewCustomEventsRevamp.newPushCustomEvent$default(AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp(), string3, string4, "", string2, "Enable location screen", null, null, null, "", false, null, 1760, null);
    }

    public final void Oa() {
        boolean bl2 = h40_0.Q1();
        if (bl2) {
            boolean bl3;
            Object object = new QueryAddress();
            Object object2 = this.e;
            boolean bl4 = false;
            Object object3 = null;
            if (object2 != null) {
                object2 = ((CartDeliveryAddress)object2).getId();
            } else {
                bl3 = false;
                object2 = null;
            }
            ((QueryAddress)object).setAddressId((String)object2);
            object2 = this.e;
            if (object2 != null) {
                object2 = ((CartDeliveryAddress)object2).getPostalCode();
            } else {
                bl3 = false;
                object2 = null;
            }
            object2 = String.valueOf(object2);
            ((QueryAddress)object).setPostCode((String)object2);
            object2 = this.e;
            if (object2 != null) {
                object2 = ((CartDeliveryAddress)object2).getFirstName();
            } else {
                bl3 = false;
                object2 = null;
            }
            ((QueryAddress)object).setAddressPOC((String)object2);
            object2 = this.e;
            if (object2 != null) {
                object2 = ((CartDeliveryAddress)object2).getLine1();
            } else {
                bl3 = false;
                object2 = null;
            }
            ((QueryAddress)object).setAddressLine1((String)object2);
            object2 = this.e;
            if (object2 != null) {
                object2 = ((CartDeliveryAddress)object2).getLine2();
            } else {
                bl3 = false;
                object2 = null;
            }
            ((QueryAddress)object).setAddressLine2((String)object2);
            object2 = this.e;
            if (object2 != null) {
                object2 = ((CartDeliveryAddress)object2).getLandmark();
            } else {
                bl3 = false;
                object2 = null;
            }
            ((QueryAddress)object).setLandmark((String)object2);
            object2 = "";
            ((QueryAddress)object).setTown((String)object2);
            Object object4 = this.e;
            object4 = object4 != null ? ((CartDeliveryAddress)object4).getDistrict() : null;
            ((QueryAddress)object).setCity((String)object4);
            object4 = this.e;
            object4 = object4 != null ? ((CartDeliveryAddress)object4).getState() : null;
            ((QueryAddress)object).setState((String)object4);
            object4 = this.e;
            if (object4 != null) {
                object3 = ((CartDeliveryAddress)object4).getPhone();
            }
            ((QueryAddress)object).setPhone((String)object3);
            ((QueryAddress)object).setCountryISOCode("IN");
            ((QueryAddress)object).setIsDefaultAddress(true);
            HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
            object3 = ((QueryAddress)object).getAddressId();
            bl4 = TextUtils.isEmpty((CharSequence)object3);
            if (!bl4) {
                object3 = "id";
                object4 = ((QueryAddress)object).getAddressId();
                hashMap.put(object3, object4);
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)(object3 = ((QueryAddress)object).getAddressPOC())))) {
                object3 = "addressPoc";
                object4 = ((QueryAddress)object).getAddressPOC();
                hashMap.put(object3, object4);
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)(object3 = ((QueryAddress)object).getAddressLine1())))) {
                object3 = "line1";
                object4 = ((QueryAddress)object).getAddressLine1();
                hashMap.put(object3, object4);
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)(object3 = ((QueryAddress)object).getAddressLine2())))) {
                object3 = "line2";
                object4 = ((QueryAddress)object).getAddressLine2();
                hashMap.put(object3, object4);
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)(object3 = ((QueryAddress)object).getTown())))) {
                object3 = "town";
                object4 = ((QueryAddress)object).getTown();
                hashMap.put(object3, object4);
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)(object3 = ((QueryAddress)object).getPostCode())))) {
                object3 = "postalCode";
                object4 = ((QueryAddress)object).getPostCode();
                hashMap.put(object3, object4);
            }
            object3 = ((QueryAddress)object).getCity();
            bl4 = TextUtils.isEmpty((CharSequence)object3);
            object4 = "district";
            if (!bl4) {
                object3 = ((QueryAddress)object).getCity();
                hashMap.put(object4, object3);
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)(object3 = ((QueryAddress)object).getCity())))) {
                object3 = ((QueryAddress)object).getCity();
                hashMap.put(object4, object3);
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)(object3 = ((QueryAddress)object).getState())))) {
                object3 = "state";
                object4 = ((QueryAddress)object).getState();
                hashMap.put(object3, object4);
            }
            object3 = ((QueryAddress)object).getLandmark();
            bl4 = TextUtils.isEmpty((CharSequence)object3);
            object4 = "landmark";
            if (!bl4) {
                object2 = ((QueryAddress)object).getLandmark();
                hashMap.put(object4, object2);
            } else {
                hashMap.put(object4, object2);
            }
            object2 = ((QueryAddress)object).getPhone();
            bl3 = TextUtils.isEmpty((CharSequence)object2);
            if (!bl3) {
                object2 = "phone";
                object3 = ((QueryAddress)object).getPhone();
                hashMap.put(object2, object3);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(object2 = ((QueryAddress)object).getCountryISOCode())))) {
                object2 = "country.isocode";
                object3 = ((QueryAddress)object).getCountryISOCode();
                hashMap.put(object2, object3);
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)(object2 = ((QueryAddress)object).getSelectedAddressType())))) {
                object3 = "selectedAddressType";
                hashMap.put(object3, object2);
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)(object2 = ((QueryAddress)object).getCustomAddressType())))) {
                object3 = "customAddressType";
                hashMap.put(object3, object2);
            }
            bl3 = ((QueryAddress)object).isDefaultAddress();
            object2 = String.valueOf(bl3);
            hashMap.put("defaultAddress", object2);
            HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
            hashMap2.put("client_type", "Android");
            AJIOApplication.Companion.getClass();
            object2 = p90.a((Context)AJIOApplication$a.a());
            hashMap2.put("client_version", object2);
            object2 = this.x;
            object3 = (UserInformation)((hh3_2)object2).getValue();
            object4 = "<get-userInformation>(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            String string2 = ServiceUtil.getToken((UserInformation)object3);
            if (string2 != null && (object4 = this.c) != null) {
                String string3 = ((UserInformation)((hh3_2)object2).getValue()).getUserId();
                object2 = "getUserId(...)";
                Intrinsics.checkNotNullExpressionValue(string3, (String)object2);
                String string4 = ((QueryAddress)object).getAddressId();
                object = "getAddressId(...)";
                Intrinsics.checkNotNullExpressionValue(string4, (String)object);
                ((h5_0)object4).f(string3, string2, string4, hashMap2, hashMap);
            }
        }
    }

    public final void Pa(boolean bl2) {
        String string2 = null;
        int n3 = 8;
        if (bl2) {
            ConstraintLayout constraintLayout = this.r;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(n3);
            }
            if ((constraintLayout = this.s) != null) {
                constraintLayout.setVisibility(n3);
            }
            if ((constraintLayout = this.t) != null) {
                constraintLayout.setVisibility(0);
            }
            if ((constraintLayout = this.j) != null) {
                constraintLayout.setVisibility(0);
            }
        } else {
            this.H = bl2 = true;
            Object object = this.t;
            if (object != null) {
                object.setVisibility(n3);
            }
            if ((object = this.r) != null) {
                object.setVisibility(n3);
            }
            if ((object = this.s) != null) {
                object.setVisibility(0);
            }
            if ((object = this.j) != null) {
                object.setVisibility(0);
            }
            if ((object = this.w) != null) {
                object.setOnClickListener(this);
            }
            if ((object = this.w) != null) {
                object.setOnClickListener(this);
            }
            object = "screen_view";
            string2 = "";
            CartAddressListBottomSheet.Qa((String)object, string2, string2);
        }
    }

    public final void Ra() {
        String string2;
        Object object = this.requireContext();
        int n3 = t70.checkSelfPermission(object, string2 = "android.permission.ACCESS_FINE_LOCATION");
        if (!n3) {
            n3 = (int)(this.Ta() ? 1 : 0);
            if (n3) {
                n3 = 1;
                this.Pa(n3 != 0);
            } else {
                object = this.r;
                if (object != null) {
                    object.setVisibility(0);
                }
                if ((object = this.t) != null) {
                    int n4 = 8;
                    object.setVisibility(n4);
                }
                if ((object = this.j) != null) {
                    object.setVisibility(0);
                }
            }
        } else {
            object = this.requireActivity();
            n3 = (int)(androidx.core.app.b.b((Activity)object, string2) ? 1 : 0);
            if (n3) {
                this.Pa(false);
            } else {
                this.Pa(false);
            }
        }
    }

    public final void Sa() {
        Object object = this.b;
        if (object != null) {
            object.show();
        }
        if ((object = this.g) != null) {
            object.startLoader();
        }
        object = p3.a("client_type", "Android");
        AJIOApplication.Companion.getClass();
        Object object2 = p90.a((Context)AJIOApplication$a.a());
        object.put("client_version", object2);
        object2 = this.x;
        Object object3 = (UserInformation)((hh3_2)object2).getValue();
        Object object4 = "<get-userInformation>(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        object3 = ServiceUtil.getToken((UserInformation)object3);
        if (object3 != null && (object4 = this.c) != null) {
            object2 = ((UserInformation)((hh3_2)object2).getValue()).getUserId();
            String string2 = "getUserId(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            ((h5_0)object4).d((String)object3, (String)object2, (HashMap)object);
        }
    }

    public final boolean Ta() {
        Object object = this.requireContext().getSystemService("location");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.location.LocationManager");
        object = (LocationManager)object;
        String string2 = "gps";
        boolean bl2 = object.isProviderEnabled(string2);
        String string3 = "network";
        boolean bl3 = object.isProviderEnabled(string3);
        if (!bl2 && !bl3) {
            bl3 = false;
            object = null;
        } else {
            bl3 = true;
        }
        return bl3;
    }

    public final void Ua(int n3) {
        GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
        Bundle bundle = dk0.a(n3, "no_of_addresses");
        String string2 = this.E;
        bundle.putString("pincode", string2);
        string2 = this.F;
        bundle.putString("event_priority_delivery_fee", string2);
        gTMEvents.pushOpenScreenEvent("Check out Address delivery", bundle);
    }

    public final void Va() {
        Object object = this.e;
        Object object2 = this.f;
        if (object != null && (object = ((CartDeliveryAddress)object).getId()) != null) {
            boolean bl2;
            object = ((ArrayList)object2).iterator();
            object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            while (bl2 = object.hasNext()) {
                String string2;
                boolean bl3;
                object2 = object.next();
                Intrinsics.checkNotNullExpressionValue(object2, "next(...)");
                object2 = (CartDeliveryAddress)object2;
                Object object3 = this.e;
                if (object3 != null) {
                    object3 = ((CartDeliveryAddress)object3).getId();
                } else {
                    bl3 = false;
                    object3 = null;
                }
                if (!(bl3 = kotlin.text.b.i((String)object3, string2 = ((CartDeliveryAddress)object2).getId(), false))) continue;
                this.e = object2;
                break;
            }
        } else {
            int n3;
            int n4;
            object = this.e;
            if (object == null && (n4 = ((ArrayList)object2).size()) == (n3 = 1)) {
                this.e = object = (CartDeliveryAddress)((ArrayList)object2).get(0);
            }
        }
    }

    public final void W0(CartDeliveryAddress cartDeliveryAddress) {
        Object object = cartDeliveryAddress;
        Object object2 = "address";
        Intrinsics.checkNotNullParameter(cartDeliveryAddress, (String)object2);
        boolean bl2 = h40_0.Q1();
        if (bl2) {
            GPSLocationData gPSLocationData;
            this.e = cartDeliveryAddress;
            object2 = (hy3_0)this.I.getValue();
            object = cartDeliveryAddress.getPostalCode();
            if (object == null) {
                object = "";
            }
            Object object3 = object;
            Object var7_9 = null;
            Object var8_11 = null;
            int n3 = 3;
            Object var10_14 = null;
            GPSLocationData gPSLocationData2 = gPSLocationData;
            gPSLocationData = new GPSLocationData(null, null, (String)object, n3, null);
            object = null;
            ((hy3_0)object2).j(gPSLocationData, false);
        } else {
            object2 = AnalyticsManager.Companion;
            NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
            Object object4 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
            String string2 = ((NewCustomEventsRevamp)object4).getEC_CHECKOUT_INTERACTIONS();
            String string3 = bv_0.a((AnalyticsManager$Companion)object2);
            String string4 = cv_0.a((AnalyticsManager$Companion)object2);
            String string5 = "change address";
            String string6 = "";
            String string7 = "change_address";
            String string8 = "shipping screen";
            String string9 = "shipping screen";
            int n4 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string5, string6, string7, string8, string9, string3, null, string4, false, null, n4, null);
            this.e = cartDeliveryAddress;
            object2 = this.u;
            if (object2 != null) {
                object = cartDeliveryAddress.getId();
                object4 = "getId(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                object2.M9((String)object);
            }
            this.dismissAllowingStateLoss();
        }
    }

    public final void onClick(View view) {
        CartAddressListBottomSheet cartAddressListBottomSheet = this;
        Object object = "view";
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, (String)object);
        int n3 = view.getId();
        int n4 = R$id.tv_enter_new_pincode;
        Object object3 = "buttonTap";
        if (n3 == n4) {
            n3 = (int)(this.H ? 1 : 0);
            if (n3) {
                object = "enter pincode";
                CartAddressListBottomSheet.Qa((String)object3, (String)object3, (String)object);
            } else {
                Object var8_8 = null;
                NewCustomEventsRevamp newCustomEventsRevamp = this.z;
                String string2 = "address interaction";
                String string3 = "use your current location";
                String string4 = "";
                String string5 = "address_interaction";
                String string6 = "Check out Address delivery";
                String string7 = "Check out Address delivery";
                String string8 = this.A;
                Object var17_35 = null;
                String string9 = this.B;
                int n7 = 1536;
                boolean bl2 = false;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, string5, string6, string7, string8, null, string9, false, null, n7, null);
            }
            object = cartAddressListBottomSheet.u;
            if (object != null) {
                object.T2();
            }
        } else {
            n4 = R$id.tv_cart_use_current_location;
            Object[] objectArray = null;
            if (n3 == n4) {
                boolean bl3 = false;
                NewCustomEventsRevamp newCustomEventsRevamp = this.z;
                String string10 = "address interaction";
                String string11 = "use your current location";
                String string12 = "";
                String string13 = "address_interaction";
                String string14 = "Check out Address delivery";
                String string15 = "Check out Address delivery";
                String string16 = this.A;
                Object var18_39 = null;
                String string17 = this.B;
                int n8 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string10, string11, string12, string13, string14, string15, string16, null, string17, false, null, n8, null);
                object = this.requireContext();
                object2 = "android.permission.ACCESS_FINE_LOCATION";
                n3 = t70.checkSelfPermission((Context)object, (String)object2);
                if (!n3) {
                    n3 = (int)(this.Ta() ? 1 : 0);
                    if (n3) {
                        n3 = 1;
                        this.Pa(n3 != 0);
                        object = this.C;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("fusedLocationClient");
                            n3 = 0;
                            object = null;
                        }
                        object = object.getLastLocation();
                        object2 = new ym_2(cartAddressListBottomSheet, 0);
                        object3 = new nm_2((ym_2)object2);
                        object = object.addOnSuccessListener((OnSuccessListener)object3);
                        object2 = new om_2(cartAddressListBottomSheet);
                        object.addOnFailureListener((OnFailureListener)object2);
                    } else {
                        object = this.r;
                        if (object != null) {
                            object.setVisibility(0);
                        }
                        if ((object = cartAddressListBottomSheet.t) != null) {
                            n4 = 8;
                            object.setVisibility(n4);
                        }
                        if ((object = cartAddressListBottomSheet.j) != null) {
                            object.setVisibility(0);
                        }
                    }
                } else {
                    this.Pa(false);
                    object = new String[]{object2};
                    n4 = 1001;
                    this.requestPermissions((String[])object, n4);
                }
            } else {
                n4 = R$id.tv_add_new_address;
                if (n3 == n4) {
                    n3 = (int)(this.H ? 1 : 0);
                    if (n3) {
                        object = "add new address";
                        CartAddressListBottomSheet.Qa((String)object3, (String)object3, (String)object);
                    } else {
                        Object var8_10 = null;
                        objectArray = this.z;
                        String string18 = "bag interactions";
                        String string19 = "add address";
                        String string20 = "";
                        String string21 = "bag_interaction";
                        String string22 = "Check out Address delivery";
                        String string23 = "Check out Address delivery";
                        String string24 = this.A;
                        Object var17_37 = null;
                        String string25 = this.B;
                        int n10 = 1536;
                        boolean bl4 = false;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)objectArray, string18, string19, string20, string21, string22, string23, string24, null, string25, false, null, n10, null);
                    }
                    object = cartAddressListBottomSheet.u;
                    if (object != null) {
                        object.N7();
                    }
                } else {
                    n4 = R$id.bt_enable_location;
                    String string26 = "enable location";
                    if (n3 == n4) {
                        object2 = "android.settings.LOCATION_SOURCE_SETTINGS";
                        object = new Intent((String)object2);
                        this.startActivity((Intent)object);
                        CartAddressListBottomSheet.Qa((String)object3, (String)object3, string26);
                    } else {
                        n4 = R$id.bt_enable_app_location;
                        if (n3 == n4) {
                            object = yn3_0.a;
                            objectArray = new Object[]{};
                            object.a("enableAppLocation button clicked.", objectArray);
                            object = this.requireActivity();
                            objectArray = null;
                            object2 = new mm_1(this, 0);
                            object.runOnUiThread((Runnable)object2);
                            CartAddressListBottomSheet.Qa((String)object3, (String)object3, string26);
                        }
                    }
                }
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        sm_1 sm_12 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)sm_12);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = LocationServices.getFusedLocationProviderClient(this.requireContext());
        this.C = object;
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.fragment_cart_address_lux;
            return layoutInflater.inflate(n3, viewGroup, false);
        }
        n3 = R$layout.fragment_cart_address_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onRequestPermissionsResult(int n3, String[] object, int[] nArray) {
        Intrinsics.checkNotNullParameter(object, "permissions");
        String string2 = "grantResults";
        Intrinsics.checkNotNullParameter(nArray, string2);
        super.onRequestPermissionsResult(n3, (String[])object, nArray);
        int n4 = 1001;
        if (n3 == n4) {
            Object object2;
            n3 = nArray.length;
            n4 = 1;
            string2 = null;
            if (n3 == 0) {
                n3 = 1;
            } else {
                n3 = 0;
                object2 = null;
            }
            if ((n3 ^= n4) != 0 && (n3 = nArray[0]) == 0) {
                object2 = this.r;
                if (object2 != null) {
                    n4 = 8;
                    object2.setVisibility(n4);
                }
                this.H = false;
            } else {
                object2 = "screen_view";
                object = "";
                CartAddressListBottomSheet.Qa(object2, (String)object, (String)object);
            }
        }
    }

    public final void onResume() {
        super.onResume();
        boolean bl2 = h40_0.Q1();
        if (bl2) {
            bl2 = this.Ta();
            if (bl2) {
                this.Ra();
            } else {
                int n3;
                ConstraintLayout constraintLayout = this.t;
                if (constraintLayout != null) {
                    n3 = 8;
                    constraintLayout.setVisibility(n3);
                }
                constraintLayout = this.j;
                n3 = 0;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                if ((constraintLayout = this.r) != null) {
                    constraintLayout.setVisibility(0);
                }
                if ((constraintLayout = this.s) != null) {
                    int n4 = 4;
                    constraintLayout.setVisibility(n4);
                }
                if ((constraintLayout = this.j) != null) {
                    constraintLayout.setVisibility(0);
                }
                this.H = bl2 = true;
            }
        }
    }

    public final void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
        Context context = this.requireContext();
        CartAddressListBottomSheet$locationModeReceiver$1 cartAddressListBottomSheet$locationModeReceiver$1 = this.J;
        context.registerReceiver((BroadcastReceiver)cartAddressListBottomSheet$locationModeReceiver$1, intentFilter);
    }

    public final void onStop() {
        super.onStop();
        Context context = this.requireContext();
        CartAddressListBottomSheet$locationModeReceiver$1 cartAddressListBottomSheet$locationModeReceiver$1 = this.J;
        context.unregisterReceiver((BroadcastReceiver)cartAddressListBottomSheet$locationModeReceiver$1);
        this.y.setPreviousScreenData("address list screen - shipping", "address management screen");
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        Object object4 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.checkout_address_loader;
        object2 = (AjioLoaderView)object.findViewById(n3);
        this.g = object2;
        n3 = R$id.cart_address_rv;
        object2 = (RecyclerView)object.findViewById(n3);
        this.d = object2;
        if (object2 != null) {
            object3 = this.getActivity();
            object4 = new LinearLayoutManager((Context)object3);
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object4);
        }
        n3 = R$id.checkout_progress_bar;
        object2 = (AjioProgressView)object.findViewById(n3);
        this.b = object2;
        object4 = this.f;
        this.a = object2 = new bn_1((ArrayList)object4, this);
        ((bn_1)object2).b = object4 = this.e;
        object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object4 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object5 = this.getDefaultViewModelCreationExtras();
        Object object6 = "store";
        Intrinsics.checkNotNullParameter(object4, (String)object6);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object3, string2);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object5, string3);
        Object object7 = wx1_1.class;
        String string4 = "modelClass";
        object4 = rl3_0.b((rd3_0)object4, (E$b)object3, (Wd0)object5, object7, string4);
        object3 = "<this>";
        object5 = sw0_0.a(object7, (String)object3, object7, string4, string4);
        Intrinsics.checkNotNullParameter(object5, (String)object3);
        object7 = object5.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object7 != null) {
            TextView textView;
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object7 = string6.concat((String)object7);
            this.D = object4 = (wx1_1)((pD3)object4).a((yn1_2)object5, (String)object7);
            int n4 = R$id.divider_choose_delivery_address;
            object4 = object.findViewById(n4);
            this.l = object4;
            n4 = R$id.divider_add_delivery_address;
            object4 = object.findViewById(n4);
            this.m = object4;
            n4 = R$id.view_bg2;
            object4 = object.findViewById(n4);
            this.h = object4;
            n4 = R$id.view_bg3;
            object4 = object.findViewById(n4);
            this.i = object4;
            n4 = R$id.tv_add_new_address;
            object4 = (TextView)object.findViewById(n4);
            this.o = object4;
            n4 = R$id.tv_enter_new_pincode;
            object4 = (TextView)object.findViewById(n4);
            this.p = object4;
            n4 = R$id.cart_address_tv_name;
            object4 = object.findViewById(n4);
            int n7 = object4 instanceof AjioTextView;
            object7 = null;
            if (n7 != 0) {
                object4 = (AjioTextView)object4;
            } else {
                n4 = 0;
                object4 = null;
            }
            this.n = object4;
            n4 = R$id.tv_cart_use_current_location;
            object4 = (TextView)object.findViewById(n4);
            this.q = object4;
            n4 = R$id.cl_location_permission_off;
            object4 = (ConstraintLayout)object.findViewById(n4);
            this.r = object4;
            n4 = R$id.cl_app_permission_off;
            object4 = (ConstraintLayout)object.findViewById(n4);
            this.s = object4;
            n4 = R$id.current_location_container;
            object4 = (ConstraintLayout)object.findViewById(n4);
            this.t = object4;
            n4 = R$id.line_separator1;
            object4 = object.findViewById(n4);
            this.j = object4;
            n4 = R$id.labVSep;
            object4 = object.findViewById(n4);
            this.k = object4;
            n4 = R$id.bt_enable_location;
            object4 = (Button)object.findViewById(n4);
            this.v = object4;
            n4 = R$id.bt_enable_app_location;
            object4 = (Button)object.findViewById(n4);
            this.w = object4;
            n4 = (int)(og1_1.b() ? 1 : 0);
            n7 = 8;
            if (n4 != 0) {
                object4 = this.o;
                if (object4 != null) {
                    n4 = object4.getPaintFlags();
                    textView = this.o;
                    if (textView != null) {
                        textView.setPaintFlags(n4 |= n7);
                    }
                }
                if ((object4 = this.p) != null) {
                    n4 = object4.getPaintFlags();
                    textView = this.p;
                    if (textView != null) {
                        textView.setPaintFlags(n4 |= n7);
                    }
                }
                if ((object4 = this.q) != null) {
                    n4 = object4.getPaintFlags();
                    textView = this.q;
                    if (textView != null) {
                        textView.setPaintFlags(n4 |= n7);
                    }
                }
            }
            if ((object4 = this.o) != null) {
                object4.setOnClickListener((View.OnClickListener)this);
            }
            if ((object4 = this.p) != null) {
                object4.setOnClickListener((View.OnClickListener)this);
            }
            if ((object4 = this.q) != null) {
                object4.setOnClickListener((View.OnClickListener)this);
            }
            if ((object4 = this.v) != null) {
                object4.setOnClickListener((View.OnClickListener)this);
            }
            if ((object4 = this.w) != null) {
                object4.setOnClickListener((View.OnClickListener)this);
            }
            n4 = R$id.close_dialog;
            object = object.findViewById(n4);
            Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
            object = (ImageView)object;
            object4 = new tm_1(this, 0);
            object.setOnClickListener((View.OnClickListener)object4);
            object = kd3_2.a();
            object4 = new AddressRepo();
            textView = this.requireActivity().getApplication();
            object.a = object4;
            object.b = textView;
            Intrinsics.checkNotNull(object);
            Intrinsics.checkNotNullParameter(this, (String)object2);
            Intrinsics.checkNotNullParameter(object, string2);
            object4 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object2 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object4, (String)object6);
            Intrinsics.checkNotNullParameter(object, string2);
            Intrinsics.checkNotNullParameter(object2, string3);
            object6 = h5_0.class;
            object = im_1.a((rd3_0)object4, (kd3_2)object, (Wd0)object2, (Class)object6, string4);
            object2 = sw0_0.a((Class)object6, (String)object3, (Class)object6, string4, string4);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object4 = object2.getQualifiedName();
            if (object4 != null) {
                boolean bl2;
                object4 = string6.concat((String)object4);
                object = (h5_0)object.a((yn1_2)object2, (String)object4);
                this.c = object;
                if (object != null && (object = object.f) != null) {
                    object2 = this.getViewLifecycleOwner();
                    object4 = new um_2(this);
                    object.e((mu1_1)object2, (F62)object4);
                }
                if ((object = this.D) == null) {
                    object = "cartViewModel";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object7 = object;
                }
                object = ((wx1_1)object7).v;
                object2 = this.getViewLifecycleOwner();
                object4 = new vm_2(this, 0);
                object3 = new CartAddressListBottomSheet$b((Function1)object4);
                object.e((mu1_1)object2, (F62)object3);
                object = this.c;
                if (object != null && (object = object.k) != null) {
                    object2 = this.getViewLifecycleOwner();
                    object4 = new wm_2(this, 0);
                    object3 = new CartAddressListBottomSheet$b((Function1)object4);
                    object.e((mu1_1)object2, (F62)object3);
                }
                object = ((hy3_0)this.I.getValue()).w;
                object2 = this.getViewLifecycleOwner();
                object4 = new xm_2(this, 0);
                object3 = new CartAddressListBottomSheet$b((Function1)object4);
                object.e((mu1_1)object2, (F62)object3);
                object = this.d;
                if (object != null) {
                    object2 = this.a;
                    object.setAdapter((RecyclerView$f)object2);
                }
                if (bl2 = h40_0.Q1()) {
                    object = this.b;
                    if (object != null) {
                        object.dismiss();
                    }
                    if ((object = this.g) != null) {
                        object.stopLoader();
                    }
                    if (bl2 = (object = (UserInformation)this.x.getValue()).isUserOnline()) {
                        this.Sa();
                        object = od3_2.a();
                        object2 = ld3_2.STORE_LUXE.getStoreId();
                        bl2 = Intrinsics.areEqual(object, object2);
                        n3 = 0;
                        object2 = null;
                        if (bl2) {
                            object = this.t;
                            if (object != null) {
                                object.setVisibility(0);
                            }
                        } else {
                            object = this.o;
                            if (object != null) {
                                object.setVisibility(0);
                            }
                            if ((object = this.n) != null) {
                                object.setVisibility(0);
                            }
                            if ((object = this.k) != null) {
                                object.setVisibility(0);
                            }
                        }
                    } else {
                        object = od3_2.a();
                        bl2 = Intrinsics.areEqual(object, object2 = ld3_2.STORE_LUXE.getStoreId());
                        if (bl2) {
                            object = this.h;
                            if (object != null) {
                                object.setVisibility(n7);
                            }
                            if ((object = this.i) != null) {
                                object.setVisibility(n7);
                            }
                            if ((object = this.n) != null) {
                                object.setVisibility(n7);
                            }
                            if ((object = this.j) != null) {
                                object.setVisibility(n7);
                            }
                            if ((object = this.o) != null) {
                                object.setVisibility(n7);
                            }
                            if ((object = this.k) != null) {
                                object.setVisibility(n7);
                            }
                            if ((object = this.d) != null) {
                                object.setVisibility(n7);
                            }
                            if ((object = this.l) != null) {
                                object.setVisibility(n7);
                            }
                            if ((object = this.m) != null) {
                                object.setVisibility(n7);
                            }
                        } else {
                            object = this.d;
                            if (object != null) {
                                object.setVisibility(n7);
                            }
                            if ((object = this.n) != null) {
                                object.setVisibility(n7);
                            }
                            if ((object = this.j) != null) {
                                object.setVisibility(n7);
                            }
                            if ((object = this.o) != null) {
                                object.setVisibility(n7);
                            }
                            if ((object = this.k) != null) {
                                object.setVisibility(n7);
                            }
                        }
                    }
                } else {
                    this.Sa();
                }
                return;
            }
            object2 = string5.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string5.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void y5(CartDeliveryAddress cartDeliveryAddress) {
        Intrinsics.checkNotNullParameter(cartDeliveryAddress, "address");
    }
}

