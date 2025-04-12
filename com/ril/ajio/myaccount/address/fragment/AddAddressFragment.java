/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.TranslateAnimation
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.CheckBox
 *  android.widget.EditText
 *  android.widget.ImageButton
 *  android.widget.RadioGroup
 *  android.widget.RadioGroup$OnCheckedChangeListener
 *  android.widget.TextView
 */
package com.ril.ajio.myaccount.address.fragment;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsRequest$Builder;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$integer;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.LuxeUnderLineTextView;
import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment$a;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment$b;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment$c;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment$d;
import com.ril.ajio.myaccount.address.fragment.a;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.query.QueryAddress;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.services.utils.ServiceUtil;
import com.ril.ajio.utility.validators.Validator;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class AddAddressFragment
extends Fragment
implements View.OnClickListener,
pk2_1 {
    public static final AddAddressFragment$a Companion;
    public B4 A;
    public LocationRequest B;
    public AjioEditText C;
    public RadioGroup D;
    public TextInputLayout E;
    public AjioEditText F;
    public int G;
    public final boolean H;
    public View I;
    public final NewEEcommerceEventsRevamp J;
    public final NewCustomEventsRevamp K;
    public final String L;
    public final String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public boolean S;
    public TextInputLayout T;
    public AppBarLayout U;
    public final jo_2 X;
    public String Y;
    public final y4 Z;
    public fv0_2 a;
    public final hh3_2 b;
    public AjioEditText c;
    public AjioEditText d;
    public AjioEditText e;
    public AjioEditText f;
    public AjioEditText g;
    public AjioEditText h;
    public NestedScrollView i;
    public TextView j;
    public AjioEditText k;
    public final AddAddressFragment$b k0;
    public CheckBox l;
    public boolean m;
    public CartDeliveryAddress n;
    public FusedLocationProviderClient o;
    public TextInputLayout p;
    public final z4 p0;
    public TextInputLayout q;
    public final AddAddressFragment$c q0;
    public TextInputLayout r;
    public TextInputLayout s;
    public TextInputLayout t;
    public Activity u;
    public AjioLoaderView v;
    public boolean w;
    public final boolean[] x;
    public View y;
    public h5_0 z;

    static {
        AddAddressFragment$a addAddressFragment$a;
        Companion = addAddressFragment$a = new Object();
    }

    public AddAddressFragment() {
        boolean bl2;
        Object object = new x4(this);
        this.b = object = yr1_2.b((Function0)object);
        this.m = true;
        object = new boolean[5];
        this.x = (boolean[])object;
        this.H = bl2 = og1_1.c();
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.J = object2;
        this.K = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        Object object3 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.L = object3;
        this.M = object2 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        this.N = "address screen - my account";
        this.O = object = ((NewCustomEventsRevamp)object).getEC_ADD_INTERACTION();
        this.P = object = "";
        this.Q = object;
        this.R = object;
        AJIOApplication.Companion.getClass();
        object3 = AJIOApplication$a.a();
        this.X = object2 = new jo_2((Context)object3);
        this.Y = object;
        this.Z = object = new y4(this);
        this.k0 = object = new AddAddressFragment$b(this);
        this.p0 = object = new z4(this);
        this.q0 = object = new AddAddressFragment$c(this);
    }

    public static String Pa(CartDeliveryAddress object) {
        String string2 = "";
        if (object != null) {
            String string3 = ((CartDeliveryAddress)object).getLine2();
            boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
            string3 = !bl2 ? ((CartDeliveryAddress)object).getLine2() : string2;
            String string4 = ((CartDeliveryAddress)object).getTown();
            boolean bl3 = TextUtils.isEmpty((CharSequence)string4);
            if (!bl3) {
                object = ((CartDeliveryAddress)object).getTown();
                string2 = kp1_0.c(" ", (String)object);
            }
            return Ft2.a(string3, string2);
        }
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String Sa(CartDeliveryAddress object) {
        if (object == null) return "";
        CharSequence charSequence = ((CartDeliveryAddress)object).getAddressPOC();
        boolean bl2 = TextUtils.isEmpty((CharSequence)charSequence);
        if (bl2) {
            int n3;
            charSequence = new StringBuilder();
            String string2 = ((CartDeliveryAddress)object).getFirstName();
            int n4 = TextUtils.isEmpty((CharSequence)string2);
            String string3 = "getFirstName(...)";
            if (n4 == 0) {
                string2 = ((CartDeliveryAddress)object).getFirstName();
                Intrinsics.checkNotNullExpressionValue(string2, string3);
                string2 = ((Object)StringsKt.m0(string2)).toString();
                ((StringBuilder)charSequence).append(string2);
            }
            string2 = ((CartDeliveryAddress)object).getLastName();
            n4 = TextUtils.isEmpty((CharSequence)string2);
            String string4 = "getLastName(...)";
            if (n4 == 0) {
                n4 = ((StringBuilder)charSequence).length();
                if (n4 > 0) {
                    string2 = " ";
                    ((StringBuilder)charSequence).append(string2);
                }
                string2 = ((CartDeliveryAddress)object).getLastName();
                Intrinsics.checkNotNullExpressionValue(string2, string4);
                string2 = ((Object)StringsKt.m0(string2)).toString();
                ((StringBuilder)charSequence).append(string2);
            }
            if ((n4 = ((StringBuilder)charSequence).length()) >= (n3 = 64)) {
                charSequence = ((CartDeliveryAddress)object).getFirstName();
                bl2 = TextUtils.isEmpty((CharSequence)charSequence);
                if (!bl2) {
                    object = ((CartDeliveryAddress)object).getFirstName();
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                    return ((Object)StringsKt.m0((CharSequence)object)).toString();
                }
                charSequence = ((CartDeliveryAddress)object).getLastName();
                bl2 = TextUtils.isEmpty((CharSequence)charSequence);
                if (bl2) return "";
                object = ((CartDeliveryAddress)object).getLastName();
                Intrinsics.checkNotNullExpressionValue(object, string4);
                return ((Object)StringsKt.m0((CharSequence)object)).toString();
            }
            object = ((StringBuilder)charSequence).toString();
            Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
            return object;
        }
        object = ((CartDeliveryAddress)object).getAddressPOC();
        Intrinsics.checkNotNullExpressionValue(object, "getAddressPOC(...)");
        return ((Object)StringsKt.m0((CharSequence)object)).toString();
    }

    public static HashMap Ta(QueryAddress object) {
        boolean bl2;
        String string2;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        String string3 = ((QueryAddress)object).getAddressId();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl3) {
            string3 = "id";
            string2 = ((QueryAddress)object).getAddressId();
            hashMap.put(string3, string2);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(string3 = ((QueryAddress)object).getAddressPOC())))) {
            string3 = "addressPoc";
            string2 = ((QueryAddress)object).getAddressPOC();
            hashMap.put(string3, string2);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(string3 = ((QueryAddress)object).getAddressLine1())))) {
            string3 = "line1";
            string2 = ((QueryAddress)object).getAddressLine1();
            hashMap.put(string3, string2);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(string3 = ((QueryAddress)object).getAddressLine2())))) {
            string3 = "line2";
            string2 = ((QueryAddress)object).getAddressLine2();
            hashMap.put(string3, string2);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(string3 = ((QueryAddress)object).getTown())))) {
            string3 = "town";
            string2 = ((QueryAddress)object).getTown();
            hashMap.put(string3, string2);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(string3 = ((QueryAddress)object).getPostCode())))) {
            string3 = "postalCode";
            string2 = ((QueryAddress)object).getPostCode();
            hashMap.put(string3, string2);
        }
        string3 = ((QueryAddress)object).getCity();
        bl3 = TextUtils.isEmpty((CharSequence)string3);
        string2 = "district";
        if (!bl3) {
            string3 = ((QueryAddress)object).getCity();
            hashMap.put(string2, string3);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(string3 = ((QueryAddress)object).getCity())))) {
            string3 = ((QueryAddress)object).getCity();
            hashMap.put(string2, string3);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(string3 = ((QueryAddress)object).getState())))) {
            string3 = "state";
            string2 = ((QueryAddress)object).getState();
            hashMap.put(string3, string2);
        }
        string3 = ((QueryAddress)object).getLandmark();
        bl3 = TextUtils.isEmpty((CharSequence)string3);
        string2 = "landmark";
        if (!bl3) {
            string3 = ((QueryAddress)object).getLandmark();
            hashMap.put(string2, string3);
        } else {
            string3 = "";
            hashMap.put(string2, string3);
        }
        string3 = ((QueryAddress)object).getPhone();
        bl3 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl3) {
            string3 = "phone";
            string2 = ((QueryAddress)object).getPhone();
            hashMap.put(string3, string2);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(string3 = ((QueryAddress)object).getCountryISOCode())))) {
            string3 = "country.isocode";
            string2 = ((QueryAddress)object).getCountryISOCode();
            hashMap.put(string3, string2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(string3 = ((QueryAddress)object).getSelectedAddressType())))) {
            string2 = "selectedAddressType";
            hashMap.put(string2, string3);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(string3 = ((QueryAddress)object).getCustomAddressType())))) {
            string2 = "customAddressType";
            hashMap.put(string2, string3);
        }
        object = String.valueOf(((QueryAddress)object).isDefaultAddress());
        hashMap.put("defaultAddress", object);
        return hashMap;
    }

    public final void Oa() {
        LocationRequest locationRequest = this.B;
        if (locationRequest == null) {
            this.B = locationRequest = new LocationRequest();
            Intrinsics.checkNotNull(locationRequest);
            locationRequest.setInterval(10000L);
            locationRequest = this.B;
            Intrinsics.checkNotNull(locationRequest);
            long l2 = 5000L;
            locationRequest.setFastestInterval(l2);
            locationRequest = this.B;
            Intrinsics.checkNotNull(locationRequest);
            int n3 = 100;
            locationRequest.setPriority(n3);
        }
    }

    public final void Qa() {
        Object object;
        block20: {
            object = this.u;
            Intrinsics.checkNotNull(object);
            Object object2 = "android.permission.ACCESS_FINE_LOCATION";
            int n3 = t70.checkSelfPermission((Context)object, (String)object2);
            if (n3 != 0) break block20;
            this.Oa();
            object = new LocationSettingsRequest$Builder();
            object2 = this.B;
            Intrinsics.checkNotNull(object2);
            object = ((LocationSettingsRequest$Builder)object).addLocationRequest((LocationRequest)object2);
            object2 = "addLocationRequest(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object2 = this.u;
            Intrinsics.checkNotNull(object2);
            object2 = LocationServices.getSettingsClient((Activity)object2);
            Object object3 = "getSettingsClient(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            object = ((LocationSettingsRequest$Builder)object).build();
            object = object2.checkLocationSettings((LocationSettingsRequest)object);
            object2 = "checkLocationSettings(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object2 = this.u;
            Intrinsics.checkNotNull(object2);
            m4_0 m4_02 = null;
            object3 = new l4_0(this, 0);
            m4_02 = new m4_0((Function1)object3);
            ((Task)object).addOnSuccessListener((Activity)object2, (OnSuccessListener)m4_02);
            object2 = this.u;
            Intrinsics.checkNotNull(object2);
            object3 = new n4_0(this);
            try {
                ((Task)object).addOnFailureListener((Activity)object2, (OnFailureListener)object3);
            }
            catch (Exception exception) {
                object2 = yn3_0.a;
                ((yn3$a)object2).e(exception);
            }
        }
        object = Unit.a;
    }

    public final UserInformation Ra() {
        return (UserInformation)this.b.getValue();
    }

    public final void Ua(CartDeliveryAddress cartDeliveryAddress) {
        if (cartDeliveryAddress != null) {
            Object object = this.C;
            Intrinsics.checkNotNull(object);
            String string2 = AddAddressFragment.Sa(cartDeliveryAddress);
            object.setText((CharSequence)string2);
            object = cartDeliveryAddress.getLine1();
            int n3 = TextUtils.isEmpty((CharSequence)object);
            string2 = "";
            object = n3 == 0 ? cartDeliveryAddress.getLine1() : string2;
            Object object2 = this.f;
            Intrinsics.checkNotNull(object2);
            object2.setText((CharSequence)object);
            object = AddAddressFragment.Pa(cartDeliveryAddress);
            object2 = this.k;
            Intrinsics.checkNotNull(object2);
            object2.setText((CharSequence)object);
            object = this.g;
            Intrinsics.checkNotNull(object);
            object2 = cartDeliveryAddress.getLandmark();
            boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
            object2 = !bl2 ? cartDeliveryAddress.getLandmark() : string2;
            object.setText((CharSequence)object2);
            object = this.h;
            Intrinsics.checkNotNull(object);
            object2 = cartDeliveryAddress.getDistrict();
            bl2 = TextUtils.isEmpty((CharSequence)object2);
            object2 = !bl2 ? cartDeliveryAddress.getDistrict() : string2;
            object.setText((CharSequence)object2);
            object = this.c;
            Intrinsics.checkNotNull(object);
            object2 = cartDeliveryAddress.getState();
            bl2 = TextUtils.isEmpty((CharSequence)object2);
            object2 = !bl2 ? cartDeliveryAddress.getState() : string2;
            object.setText((CharSequence)object2);
            object = this.d;
            Intrinsics.checkNotNull(object);
            object2 = cartDeliveryAddress.getPostalCode();
            bl2 = TextUtils.isEmpty((CharSequence)object2);
            object2 = !bl2 ? cartDeliveryAddress.getPostalCode() : string2;
            object.setText((CharSequence)object2);
            object = this.e;
            Intrinsics.checkNotNull(object);
            object2 = cartDeliveryAddress.getPhone();
            bl2 = TextUtils.isEmpty((CharSequence)object2);
            if (!bl2) {
                string2 = cartDeliveryAddress.getPhone();
            }
            object.setText((CharSequence)string2);
            object = cartDeliveryAddress.getSelectedAddressType();
            int n4 = TextUtils.isEmpty((CharSequence)object);
            if (n4 == 0) {
                string2 = "home";
                bl2 = true;
                n4 = kotlin.text.b.i((String)object, string2, bl2);
                int n7 = 8;
                if (n4 != 0) {
                    this.G = n3 = R$id.faaRbHome;
                    object = this.D;
                    Intrinsics.checkNotNull(object);
                    n4 = R$id.faaRbHome;
                    object.check(n4);
                    object = this.E;
                    if (object != null) {
                        object.setVisibility(n7);
                    }
                } else {
                    string2 = "work";
                    n4 = (int)(kotlin.text.b.i((String)object, string2, bl2) ? 1 : 0);
                    if (n4 != 0) {
                        this.G = n3 = R$id.faaRbWork;
                        object = this.D;
                        Intrinsics.checkNotNull(object);
                        n4 = R$id.faaRbWork;
                        object.check(n4);
                        object = this.E;
                        if (object != null) {
                            object.setVisibility(n7);
                        }
                    } else {
                        string2 = "other";
                        n3 = (int)(kotlin.text.b.i((String)object, string2, bl2) ? 1 : 0);
                        if (n3 != 0) {
                            this.G = n3 = R$id.faaRbOthers;
                            object = this.D;
                            Intrinsics.checkNotNull(object);
                            n4 = R$id.faaRbOthers;
                            object.check(n4);
                            object = this.E;
                            if (object != null) {
                                n4 = 0;
                                string2 = null;
                                object.setVisibility(0);
                            }
                            if ((object = cartDeliveryAddress.getCustomAddressType()) != null && (n3 = ((String)object).length()) != 0 && (object = this.F) != null) {
                                string2 = cartDeliveryAddress.getCustomAddressType();
                                object.setText((CharSequence)string2);
                            }
                        }
                    }
                }
            } else {
                this.G = n3 = R$id.faaRbHome;
                object = this.D;
                Intrinsics.checkNotNull(object);
                n4 = R$id.faaRbHome;
                object.check(n4);
            }
            object = this.l;
            Intrinsics.checkNotNull(object);
            boolean bl3 = cartDeliveryAddress.isDefaultAddress();
            object.setChecked(bl3);
        } else {
            int n8;
            this.G = n8 = R$id.faaRbHome;
            cartDeliveryAddress = this.D;
            Intrinsics.checkNotNull(cartDeliveryAddress);
            int n10 = R$id.faaRbHome;
            cartDeliveryAddress.check(n10);
        }
    }

    public final void Va(DataError iterator) {
        int n3 = 1;
        if (iterator != null && (iterator = ((DataError)((Object)iterator)).getErrors()) != null) {
            int n4;
            iterator = ((Iterable)((Object)iterator)).iterator();
            while ((n4 = iterator.hasNext()) != 0) {
                boolean bl2;
                Object[] objectArray;
                Object object = (DataError$ErrorMessage)iterator.next();
                int n7 = 0;
                Object object2 = null;
                if (object != null) {
                    objectArray = ((DataError$ErrorMessage)object).getSubject();
                } else {
                    bl2 = false;
                    objectArray = null;
                }
                String string2 = "phone";
                bl2 = kotlin.text.b.i((String)objectArray, string2, n3 != 0);
                if (bl2) {
                    object2 = this.a;
                    if (object2 == null) continue;
                    objectArray = this.e;
                    object = ((DataError$ErrorMessage)object).getMessage();
                    ((fv0_2)object2).g((EditText)objectArray, (String)object);
                    continue;
                }
                if (object != null) {
                    object2 = ((DataError$ErrorMessage)object).getSubject();
                }
                if ((n7 = kotlin.text.b.i((String)object2, (String)(objectArray = "postalCode"), n3 != 0)) != 0) {
                    object2 = this.a;
                    if (object2 == null) continue;
                    objectArray = this.d;
                    object = ((DataError$ErrorMessage)object).getMessage();
                    ((fv0_2)object2).g((EditText)objectArray, (String)object);
                    continue;
                }
                object = StringCompanionObject.INSTANCE;
                n4 = R$string.acc_error_message;
                object = hv3_0.K(n4);
                object2 = hv3_0.K(R$string.address_update_alert);
                objectArray = new Object[n3];
                string2 = null;
                objectArray[0] = object2;
                object = xh2_0.a(objectArray, n3, (String)object, "format(...)");
                n7 = R$string.address_update_alert;
                object2 = hv3_0.K(n7);
                this.showNotification((String)object2, (String)object);
            }
        }
    }

    public final void Wa() {
        Object object = this.Ra().getUserName();
        String string2 = this.Ra().getUserPhoneNumber();
        AjioEditText ajioEditText = this.C;
        Intrinsics.checkNotNull(ajioEditText);
        ajioEditText = ajioEditText.getText();
        boolean bl2 = TextUtils.isEmpty((CharSequence)((Object)ajioEditText));
        if (bl2) {
            ajioEditText = this.e;
            Intrinsics.checkNotNull(ajioEditText);
            ajioEditText = ajioEditText.getText();
            bl2 = TextUtils.isEmpty((CharSequence)((Object)ajioEditText));
            if (bl2) {
                if (object != null) {
                    ajioEditText = this.C;
                    Intrinsics.checkNotNull(ajioEditText);
                    object = ((Object)StringsKt.m0((CharSequence)object)).toString();
                    ajioEditText.setText((CharSequence)object);
                }
                if (string2 != null) {
                    object = this.e;
                    Intrinsics.checkNotNull(object);
                    object.setText((CharSequence)string2);
                }
            }
        }
    }

    public final void onActivityCreated(Bundle object) {
        super.onActivityCreated((Bundle)object);
        object = this.z;
        Intrinsics.checkNotNull(object);
        object = ((h5_0)object).c;
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        Object object2 = new s4(this, 0);
        AddAddressFragment$d addAddressFragment$d = new AddAddressFragment$d((Function1)object2);
        ((LiveData)object).e(mu1_12, addAddressFragment$d);
        object = this.z;
        Intrinsics.checkNotNull(object);
        object = ((h5_0)object).i;
        mu1_12 = this.getViewLifecycleOwner();
        object2 = new t4_0(this, 0);
        addAddressFragment$d = new AddAddressFragment$d((Function1)object2);
        ((LiveData)object).e(mu1_12, addAddressFragment$d);
        object = this.z;
        Intrinsics.checkNotNull(object);
        object = ((h5_0)object).j;
        mu1_12 = this.getViewLifecycleOwner();
        object2 = new u4_0(this);
        ((LiveData)object).e(mu1_12, (F62)object2);
        object = this.z;
        Intrinsics.checkNotNull(object);
        object = ((h5_0)object).k;
        mu1_12 = this.getViewLifecycleOwner();
        object2 = new v4_0(this, 0);
        addAddressFragment$d = new AddAddressFragment$d((Function1)object2);
        ((LiveData)object).e(mu1_12, addAddressFragment$d);
        object = this.z;
        if (object != null && (object = ((h5_0)object).l) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            object2 = new w4_0(this, 0);
            addAddressFragment$d = new AddAddressFragment$d((Function1)object2);
            ((LiveData)object).e(mu1_12, addAddressFragment$d);
        }
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        super.onActivityResult(n3, n4, intent);
        int n7 = -1;
        if (n4 == n7 && n3 == (n4 = 1234)) {
            this.Qa();
        }
    }

    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        context = (Activity)context;
        this.u = context;
    }

    public final void onClick(View objectArray) {
        AddAddressFragment addAddressFragment = this;
        Object object = "view";
        Object object2 = objectArray;
        Intrinsics.checkNotNullParameter(objectArray, (String)object);
        int n3 = objectArray.getId();
        int n4 = R$id.add_address_btn_save;
        Object object3 = "<set-?>";
        boolean bl2 = false;
        Object object4 = null;
        if (n3 == n4) {
            String string2;
            int n7;
            Object object5;
            int n8;
            NewCustomEventsRevamp newCustomEventsRevamp;
            int n10;
            int n14;
            object = this.a;
            Intrinsics.checkNotNull(object);
            object = ((fv0_2)object).a;
            n3 = (int)(((Validator)object).h() ? 1 : 0);
            object2 = this.E;
            Intrinsics.checkNotNull(object2);
            n4 = object2.getVisibility();
            int n15 = 1;
            int n16 = 32;
            if (n4 == 0) {
                object2 = this.F;
                Intrinsics.checkNotNull(object2);
                object2 = String.valueOf(((AppCompatEditText)object2).getText());
                n14 = ((String)object2).length() - n15;
                n10 = 0;
                newCustomEventsRevamp = null;
                n8 = 0;
                object5 = null;
                while (n10 <= n14) {
                    n7 = n8 == 0 ? n10 : n14;
                    if ((n7 = Intrinsics.compare(((String)object2).charAt(n7), n16)) <= 0) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        string2 = null;
                    }
                    if (n8 == 0) {
                        if (n7 == 0) {
                            n8 = 1;
                            continue;
                        }
                        ++n10;
                        continue;
                    }
                    if (n7 == 0) break;
                    n14 += -1;
                }
                if ((n4 = (int)(TextUtils.isEmpty((CharSequence)(object2 = ((Object)((String)object2).subSequence(n10, n14 += n15)).toString())) ? 1 : 0)) != 0) {
                    object = addAddressFragment.E;
                    Intrinsics.checkNotNull(object);
                    ((TextInputLayout)((Object)object)).setErrorEnabled(n15 != 0);
                    object = addAddressFragment.E;
                    Intrinsics.checkNotNull(object);
                    n4 = R$string.address_type_error_msg;
                    object2 = addAddressFragment.getText(n4);
                    ((TextInputLayout)((Object)object)).setError((CharSequence)object2);
                    n3 = 0;
                    object = null;
                } else {
                    object2 = addAddressFragment.E;
                    Intrinsics.checkNotNull(object2);
                    ((TextInputLayout)((Object)object2)).setErrorEnabled(false);
                }
            }
            if (n3 != 0) {
                String string3;
                object = new QueryAddress();
                object2 = addAddressFragment.d;
                Intrinsics.checkNotNull(object2);
                object2 = String.valueOf(((AppCompatEditText)object2).getText());
                ((QueryAddress)object).setPostCode((String)object2);
                object2 = addAddressFragment.C;
                Intrinsics.checkNotNull(object2);
                object2 = ai0_2.p(String.valueOf(((AppCompatEditText)object2).getText()));
                ((QueryAddress)object).setAddressPOC((String)object2);
                object2 = addAddressFragment.f;
                Intrinsics.checkNotNull(object2);
                object2 = String.valueOf(((AppCompatEditText)object2).getText());
                n14 = ((String)object2).length() - n15;
                n10 = 0;
                newCustomEventsRevamp = null;
                n8 = 0;
                object5 = null;
                while (n10 <= n14) {
                    n7 = n8 == 0 ? n10 : n14;
                    if ((n7 = Intrinsics.compare(((String)object2).charAt(n7), n16)) <= 0) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        string2 = null;
                    }
                    if (n8 == 0) {
                        if (n7 == 0) {
                            n8 = 1;
                            continue;
                        }
                        ++n10;
                        continue;
                    }
                    if (n7 == 0) break;
                    n14 += -1;
                }
                object2 = ((Object)((String)object2).subSequence(n10, n14 += n15)).toString();
                ((QueryAddress)object).setAddressLine1((String)object2);
                object2 = addAddressFragment.k;
                Intrinsics.checkNotNull(object2);
                object2 = String.valueOf(((AppCompatEditText)object2).getText());
                n14 = ((String)object2).length() - n15;
                n10 = 0;
                newCustomEventsRevamp = null;
                n8 = 0;
                object5 = null;
                while (n10 <= n14) {
                    n7 = n8 == 0 ? n10 : n14;
                    if ((n7 = Intrinsics.compare(((String)object2).charAt(n7), n16)) <= 0) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        string2 = null;
                    }
                    if (n8 == 0) {
                        if (n7 == 0) {
                            n8 = 1;
                            continue;
                        }
                        ++n10;
                        continue;
                    }
                    if (n7 == 0) break;
                    n14 += -1;
                }
                object2 = ((Object)((String)object2).subSequence(n10, n14 += n15)).toString();
                ((QueryAddress)object).setAddressLine2((String)object2);
                object2 = addAddressFragment.g;
                Intrinsics.checkNotNull(object2);
                object2 = String.valueOf(((AppCompatEditText)object2).getText());
                n14 = ((String)object2).length() - n15;
                n10 = 0;
                newCustomEventsRevamp = null;
                n8 = 0;
                object5 = null;
                while (n10 <= n14) {
                    n7 = n8 == 0 ? n10 : n14;
                    if ((n7 = Intrinsics.compare(((String)object2).charAt(n7), n16)) <= 0) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        string2 = null;
                    }
                    if (n8 == 0) {
                        if (n7 == 0) {
                            n8 = 1;
                            continue;
                        }
                        ++n10;
                        continue;
                    }
                    if (n7 == 0) break;
                    n14 += -1;
                }
                object2 = ((Object)((String)object2).subSequence(n10, n14 += n15)).toString();
                ((QueryAddress)object).setLandmark((String)object2);
                ((QueryAddress)object).setTown("");
                object2 = addAddressFragment.h;
                Intrinsics.checkNotNull(object2);
                object2 = String.valueOf(((AppCompatEditText)object2).getText());
                n14 = ((String)object2).length() - n15;
                n10 = 0;
                newCustomEventsRevamp = null;
                n8 = 0;
                object5 = null;
                while (n10 <= n14) {
                    n7 = n8 == 0 ? n10 : n14;
                    if ((n7 = Intrinsics.compare(((String)object2).charAt(n7), n16)) <= 0) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        string2 = null;
                    }
                    if (n8 == 0) {
                        if (n7 == 0) {
                            n8 = 1;
                            continue;
                        }
                        ++n10;
                        continue;
                    }
                    if (n7 == 0) break;
                    n14 += -1;
                }
                object2 = ((Object)((String)object2).subSequence(n10, n14 += n15)).toString();
                ((QueryAddress)object).setCity((String)object2);
                object2 = addAddressFragment.c;
                Intrinsics.checkNotNull(object2);
                object2 = String.valueOf(((AppCompatEditText)object2).getText());
                n14 = ((String)object2).length() - n15;
                n10 = 0;
                newCustomEventsRevamp = null;
                n8 = 0;
                object5 = null;
                while (n10 <= n14) {
                    n7 = n8 == 0 ? n10 : n14;
                    if ((n7 = Intrinsics.compare(((String)object2).charAt(n7), n16)) <= 0) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        string2 = null;
                    }
                    if (n8 == 0) {
                        if (n7 == 0) {
                            n8 = 1;
                            continue;
                        }
                        ++n10;
                        continue;
                    }
                    if (n7 == 0) break;
                    n14 += -1;
                }
                object2 = ((Object)((String)object2).subSequence(n10, n14 += n15)).toString();
                ((QueryAddress)object).setState((String)object2);
                object2 = addAddressFragment.e;
                Intrinsics.checkNotNull(object2);
                object2 = ((AppCompatEditText)object2).getText();
                n14 = 0;
                String string4 = null;
                if (object2 != null) {
                    object2 = StringsKt.m0((CharSequence)object2);
                } else {
                    n4 = 0;
                    object2 = null;
                }
                object2 = String.valueOf(object2);
                ((QueryAddress)object).setPhone((String)object2);
                object2 = "IN";
                ((QueryAddress)object).setCountryISOCode((String)object2);
                n4 = addAddressFragment.G;
                n10 = R$id.faaRbHome;
                if (n4 == n10) {
                    object2 = "HOME";
                    ((QueryAddress)object).setSelectedAddressType((String)object2);
                } else {
                    n10 = R$id.faaRbWork;
                    if (n4 == n10) {
                        object2 = "WORK";
                        ((QueryAddress)object).setSelectedAddressType((String)object2);
                    } else {
                        n10 = R$id.faaRbOthers;
                        object5 = "OTHER";
                        if (n4 == n10) {
                            int n17;
                            ((QueryAddress)object).setSelectedAddressType((String)object5);
                            object2 = addAddressFragment.F;
                            Intrinsics.checkNotNull(object2);
                            object2 = String.valueOf(((AppCompatEditText)object2).getText());
                            n10 = ((String)object2).length() - n15;
                            n8 = 0;
                            object5 = null;
                            n7 = 0;
                            string2 = null;
                            while (n8 <= n10) {
                                n17 = n7 == 0 ? n8 : n10;
                                if ((n17 = Intrinsics.compare(((String)object2).charAt(n17), n16)) <= 0) {
                                    n17 = 1;
                                } else {
                                    n17 = 0;
                                    string3 = null;
                                }
                                if (n7 == 0) {
                                    if (n17 == 0) {
                                        n7 = 1;
                                        continue;
                                    }
                                    ++n8;
                                    continue;
                                }
                                if (n17 == 0) break;
                                n10 += -1;
                            }
                            object2 = ((Object)((String)object2).subSequence(n8, n10 += n15)).toString();
                            ((QueryAddress)object).setCustomAddressType((String)object2);
                            object2 = addAddressFragment.F;
                            Intrinsics.checkNotNull(object2);
                            object2 = String.valueOf(((AppCompatEditText)object2).getText());
                            n10 = ((String)object2).length() - n15;
                            n8 = 0;
                            object5 = null;
                            n7 = 0;
                            string2 = null;
                            while (n8 <= n10) {
                                n17 = n7 == 0 ? n8 : n10;
                                if ((n17 = Intrinsics.compare(((String)object2).charAt(n17), n16)) <= 0) {
                                    n17 = 1;
                                } else {
                                    n17 = 0;
                                    string3 = null;
                                }
                                if (n7 == 0) {
                                    if (n17 == 0) {
                                        n7 = 1;
                                        continue;
                                    }
                                    ++n8;
                                    continue;
                                }
                                if (n17 == 0) break;
                                n10 += -1;
                            }
                            object2 = com.jio.jioads.adinterfaces.a.a(n10, n15, n8, (String)object2);
                        } else {
                            object2 = object5;
                        }
                    }
                }
                object4 = addAddressFragment.l;
                Intrinsics.checkNotNull(object4);
                bl2 = object4.isChecked();
                ((QueryAddress)object).setIsDefaultAddress(bl2);
                object4 = addAddressFragment.u;
                hv3_0.S((Activity)object4);
                bl2 = addAddressFragment.m;
                newCustomEventsRevamp = addAddressFragment.K;
                Object object6 = "getUserId(...)";
                Object object7 = "<get-userInformation>(...)";
                object5 = "client_version";
                string2 = "Android";
                string3 = "client_type";
                if (bl2) {
                    object4 = addAddressFragment.v;
                    if (object4 != null) {
                        ((AjioLoaderView)((Object)object4)).startLoader();
                    }
                    object4 = addAddressFragment.z;
                    Intrinsics.checkNotNull(object4);
                    object4.getClass();
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    ((h5_0)object4).q = object;
                    object = AddAddressFragment.Ta((QueryAddress)object);
                    object3 = p3.a(string3, string2);
                    AJIOApplication.Companion.getClass();
                    object4 = p90.a((Context)AJIOApplication$a.a());
                    ((HashMap)object3).put(object5, object4);
                    object4 = this.Ra();
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object7);
                    object4 = ServiceUtil.getToken((UserInformation)object4);
                    if (object4 != null && (object7 = addAddressFragment.z) != null) {
                        string4 = this.Ra().getUserId();
                        Intrinsics.checkNotNullExpressionValue(string4, (String)object6);
                        ((h5_0)object7).c(string4, (String)object4, (HashMap)object3, (HashMap)object);
                    }
                    object = new Bundle();
                    object3 = newCustomEventsRevamp.getPOSTAL_CODE();
                    object4 = addAddressFragment.d;
                    Intrinsics.checkNotNull(object4);
                    object4 = String.valueOf(((AppCompatEditText)object4).getText());
                    object.putString((String)object3, object4);
                    object3 = newCustomEventsRevamp.getADDRESS_TYPE();
                    object.putString((String)object3, (String)object2);
                    string2 = addAddressFragment.O;
                    string3 = Ft2.a(addAddressFragment.R, " new save");
                    String string5 = Ft2.a(addAddressFragment.Q, "_new_save");
                    String string6 = addAddressFragment.N;
                    Object var26_28 = null;
                    object5 = addAddressFragment.K;
                    object2 = addAddressFragment.L;
                    object3 = addAddressFragment.M;
                    Object var27_30 = null;
                    Object object8 = object3;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, string2, string3, "add", string5, string6, "address management screen", (String)object2, (Bundle)object, (String)object3, false, null, 1536, null);
                    object5 = newCustomEventsRevamp.getEC_FORM();
                    string3 = addAddressFragment.P;
                    string5 = addAddressFragment.N;
                    int n18 = 1536;
                    string2 = "submit";
                    String string7 = "form_submit";
                    string6 = "address management screen";
                    String string8 = addAddressFragment.L;
                    object = addAddressFragment.M;
                    object8 = null;
                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object5, string2, string3, string7, string5, string6, string8, null, (String)object, false, null, n18, null);
                } else {
                    Object object9;
                    Object object10;
                    String string9;
                    Object object11;
                    String string10;
                    object2 = addAddressFragment.n;
                    Intrinsics.checkNotNull(object2);
                    object2 = ((CartDeliveryAddress)object2).getId();
                    ((QueryAddress)object).setAddressId((String)object2);
                    object2 = addAddressFragment.v;
                    if (object2 != null) {
                        ((AjioLoaderView)((Object)object2)).startLoader();
                    }
                    object2 = AddAddressFragment.Ta((QueryAddress)object);
                    object3 = p3.a(string3, string2);
                    AJIOApplication.Companion.getClass();
                    object4 = p90.a((Context)AJIOApplication$a.a());
                    ((HashMap)object3).put(object5, object4);
                    bl2 = h40_0.Q1();
                    object5 = "getAddressId(...)";
                    if (bl2) {
                        object4 = this.Ra();
                        Intrinsics.checkNotNullExpressionValue(object4, (String)object7);
                        string10 = ServiceUtil.getToken((UserInformation)object4);
                        if (string10 != null && (object11 = addAddressFragment.z) != null) {
                            string9 = this.Ra().getUserId();
                            Intrinsics.checkNotNullExpressionValue(string9, (String)object6);
                            object = ((QueryAddress)object).getAddressId();
                            Intrinsics.checkNotNullExpressionValue(object, (String)object5);
                            Intrinsics.checkNotNullParameter(string9, "userId");
                            Intrinsics.checkNotNullParameter("UpdateAddress", "requestID");
                            Intrinsics.checkNotNullParameter(string10, "accessToken");
                            Intrinsics.checkNotNullParameter(object, "addressID");
                            Intrinsics.checkNotNullParameter(object3, "query");
                            Intrinsics.checkNotNullParameter(object2, "postBody");
                            object4 = md3_0.c((jD3)object11);
                            object10 = object6;
                            object9 = object2;
                            object6 = new g5_0((h5_0)object11, string9, string10, (String)object, (HashMap)object3, (HashMap)object2, null);
                            n3 = 3;
                            Ae3.d((i90_0)object4, null, null, (Function2)object6, n3);
                        }
                    } else {
                        object4 = this.Ra();
                        Intrinsics.checkNotNullExpressionValue(object4, (String)object7);
                        string9 = ServiceUtil.getToken((UserInformation)object4);
                        if (string9 != null && (object10 = addAddressFragment.z) != null) {
                            object4 = this.Ra();
                            object11 = ((UserInformation)object4).getUserId();
                            Intrinsics.checkNotNullExpressionValue(object11, (String)object6);
                            string10 = ((QueryAddress)object).getAddressId();
                            Intrinsics.checkNotNullExpressionValue(string10, (String)object5);
                            ((h5_0)object10).f((String)object11, string9, string10, (HashMap)object3, (HashMap)object2);
                        }
                    }
                    object = addAddressFragment.O;
                    object9 = Ft2.a(addAddressFragment.R, " save");
                    String string11 = Ft2.a(addAddressFragment.Q, "_save");
                    object2 = addAddressFragment.N;
                    int n19 = 1536;
                    object3 = addAddressFragment.K;
                    String string12 = "address management screen";
                    object4 = addAddressFragment.L;
                    object6 = addAddressFragment.M;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object, (String)object9, "", string11, (String)object2, string12, object4, null, (String)object6, false, null, n19, null);
                    object5 = newCustomEventsRevamp.getEC_FORM();
                    string3 = addAddressFragment.P;
                    object11 = addAddressFragment.N;
                    int n20 = 1536;
                    string2 = "submit";
                    object10 = "form_submit";
                    string9 = "address management screen";
                    string10 = addAddressFragment.L;
                    object = addAddressFragment.M;
                    object9 = null;
                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object5, string2, string3, (String)object10, (String)object11, string9, string10, null, (String)object, false, null, n20, null);
                }
            } else {
                object = addAddressFragment.u;
                hv3_0.S((Activity)object);
            }
            object = AnalyticsManager.Companion;
            object2 = "Save Address";
            object3 = "Add Address Button";
            object4 = "New Address Screen";
            tj2_0.e((AnalyticsManager$Companion)object, (String)object2, (String)object3, object4);
        } else {
            n4 = R$id.toolbar_reset;
            if (n3 == n4) {
                object = yn3_0.a;
                object2 = new Object[]{};
                object4 = "reset clicked";
                ((yn3$a)object).a((String)object4, (Object[])object2);
                com.ril.ajio.myaccount.address.fragment.a.Companion.getClass();
                object = new a();
                Intrinsics.checkNotNullParameter(this, (String)object3);
                ((a)object).a = this;
                object2 = this.requireActivity().getSupportFragmentManager();
                object3 = "ResetAddressConfirmationBSDialog";
                ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
            } else {
                n4 = R$id.address_back;
                if (n3 == n4) {
                    object = this.requireActivity();
                    ((ComponentActivity)object).onBackPressed();
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        String string2;
        String string3;
        Object object2;
        Object object3;
        Object object4;
        super.onCreate((Bundle)object);
        int n3 = 1;
        this.setHasOptionsMenu(n3 != 0);
        Object object5 = this.getArguments();
        if (object5 != null) {
            object5 = this.requireArguments();
            object4 = "add_json";
            if ((object5 = object5.getString((String)object4)) != null) {
                int n4 = object5.length() - n3;
                object3 = null;
                int n7 = 0;
                object2 = null;
                boolean bl2 = false;
                string3 = null;
                while (n7 <= n4) {
                    int n8 = !bl2 ? n7 : n4;
                    n8 = object5.charAt(n8);
                    int n10 = 32;
                    if ((n8 = Intrinsics.compare(n8, n10)) <= 0) {
                        n8 = 1;
                    } else {
                        n8 = 0;
                        string2 = null;
                    }
                    if (!bl2) {
                        if (n8 == 0) {
                            bl2 = true;
                            continue;
                        }
                        ++n7;
                        continue;
                    }
                    if (n8 == 0) break;
                    n4 += -1;
                }
                if ((n3 = (object = ((Object)object5.subSequence(n7, n4 += n3)).toString()).length()) > 0) {
                    this.n = object = (CartDeliveryAddress)JsonUtils.fromJson((String)object5, CartDeliveryAddress.class);
                    if (object != null) {
                        this.m = false;
                    }
                }
            }
            if ((n3 = (int)((object = this.requireArguments()).containsKey((String)(object5 = "isGoogleLocationEnable")) ? 1 : 0)) != 0) {
                object = this.requireArguments();
                object.getBoolean((String)object5);
            }
            object = this.requireArguments();
            object5 = "isAddressNeeded";
            n3 = (int)(object.getBoolean((String)object5) ? 1 : 0);
            this.w = n3;
        }
        object = kd3_2.a();
        object5 = new AddressRepo();
        object4 = this.requireActivity().getApplication();
        ((kd3_2)object).a = object5;
        ((kd3_2)object).b = object4;
        Intrinsics.checkNotNull(object);
        object5 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object5);
        object4 = "factory";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        object3 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object5);
        object2 = this.getDefaultViewModelCreationExtras();
        string3 = "store";
        Intrinsics.checkNotNullParameter(object3, string3);
        Intrinsics.checkNotNullParameter(object, (String)object4);
        string2 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object2, string2);
        Object object6 = h5_0.class;
        String string4 = "modelClass";
        object3 = im_1.a((rd3_0)object3, (kd3_2)object, (Wd0)object2, object6, string4);
        object2 = "<this>";
        object6 = ef0_0.a(object6, string4, string4, (String)object2);
        String string5 = object6.getQualifiedName();
        String string6 = "Local and anonymous classes can not be ViewModels";
        if (string5 != null) {
            String string7 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            string5 = string7.concat(string5);
            this.z = object3 = (h5_0)((pD3)object3).a((yn1_2)object6, string5);
            object6 = this.requireActivity().getApplication();
            string5 = "getApplication(...)";
            Intrinsics.checkNotNullExpressionValue(object6, string5);
            object3 = new UserRepo((Application)object6);
            object6 = this.requireActivity().getApplication();
            ((kd3_2)object).a = object3;
            ((kd3_2)object).b = object6;
            Intrinsics.checkNotNullParameter(this, (String)object5);
            Intrinsics.checkNotNullParameter(object, (String)object4);
            object3 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object5);
            object5 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object3, string3);
            Intrinsics.checkNotNullParameter(object, (String)object4);
            Intrinsics.checkNotNullParameter(object5, string2);
            object4 = hy3_0.class;
            object = im_1.a((rd3_0)object3, (kd3_2)object, (Wd0)object5, (Class)object4, string4);
            object5 = ef0_0.a((Class)object4, string4, string4, (String)object2);
            object4 = object5.getQualifiedName();
            if (object4 != null) {
                object4 = string7.concat((String)object4);
                object = (hy3_0)((pD3)object).a((yn1_2)object5, (String)object4);
                return;
            }
            object5 = string6.toString();
            object = new IllegalArgumentException((String)object5);
            throw object;
        }
        object5 = string6.toString();
        object = new IllegalArgumentException((String)object5);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = this.H;
        if (n3 != 0) {
            n3 = R$layout.fragment_add_address_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.fragment_add_address_revamp;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String string2 = "menuItem";
        Intrinsics.checkNotNullParameter(menuItem, string2);
        int n3 = menuItem.getItemId();
        int n4 = 16908332;
        if (n3 == n4) {
            menuItem = this.u;
            if (menuItem != null) {
                Intrinsics.checkNotNull(menuItem);
                menuItem.finish();
            }
            return false;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onPause() {
        FusedLocationProviderClient fusedLocationProviderClient;
        super.onPause();
        B4 b4 = this.A;
        if (b4 != null && (fusedLocationProviderClient = this.o) != null) {
            fusedLocationProviderClient.removeLocationUpdates(b4);
        }
    }

    public final void onRequestPermissionsResult(int n3, String[] object, int[] nArray) {
        String string2 = "permissions";
        Intrinsics.checkNotNullParameter(object, string2);
        object = "grantResults";
        Intrinsics.checkNotNullParameter(nArray, (String)object);
        int n4 = 123;
        if (n3 == n4 && (n3 = nArray.length) == (n4 = 1) && (n3 = nArray[0]) == 0) {
            this.Qa();
        }
    }

    public final void onResume() {
        super.onResume();
        int n3 = this.G;
        int n4 = R$id.faaRbHome;
        String string2 = "home";
        if (n3 != n4) {
            n4 = R$id.faaRbWork;
            if (n3 == n4) {
                string2 = "office";
            } else {
                n4 = R$id.faaRbOthers;
                if (n3 == n4) {
                    string2 = "other";
                }
            }
        }
        Bundle bundle = new Bundle();
        Object object = this.K;
        String string3 = ((NewCustomEventsRevamp)object).getSV_EP_DEF_ADD();
        Object object2 = this.l;
        Intrinsics.checkNotNull(object2);
        object2 = String.valueOf(object2.isChecked());
        bundle.putString(string3, (String)object2);
        object = ((NewCustomEventsRevamp)object).getADDRESS_TYPE();
        bundle.putString((String)object, string2);
        String string4 = this.N;
        object = this.J;
        String string5 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string6 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        object2 = this.K;
        String string7 = "address management screen";
        ((NewCustomEventsRevamp)object2).newPushCustomScreenView(string4, string7, string5, bundle, string6);
        object = AnalyticsManager.Companion;
        string3 = "new address screen";
        km_1.a((AnalyticsManager$Companion)object, string3);
        object = this.x;
        n4 = ((Object)object).length;
        string2 = null;
        object2 = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            object[i3] = false;
        }
    }

    public final void onStop() {
        super.onStop();
        String string2 = this.N;
        this.J.setPreviousScreenData(string2, "address management screen");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int n3;
        int n4;
        Object object;
        int n7;
        Object object2;
        AddAddressFragment addAddressFragment = this;
        View view2 = view;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        int n8 = R$id.app_bar_layout;
        this.U = object2 = (AppBarLayout)view.findViewById(n8);
        n8 = (int)(this.H ? 1 : 0);
        Object object3 = " Title";
        Object object4 = "Edit Address";
        Object object5 = "Add Address";
        Object object6 = "findViewById(...)";
        if (n8 != 0) {
            n8 = R$id.address_title_tv;
            object2 = (TextView)view.findViewById(n8);
            n7 = R$id.address_back;
            ((ImageButton)view.findViewById(n7)).setOnClickListener((View.OnClickListener)this);
            n7 = R$id.toolbar_reset;
            object = view.findViewById(n7);
            Intrinsics.checkNotNullExpressionValue(object, object6);
            object = (LuxeUnderLineTextView)object;
            object.setOnClickListener((View.OnClickListener)this);
            object.setEnabled(false);
            this.I = object;
            object = this.n;
            if (object == null) {
                if (object2 != null) {
                    object2.setText(object5);
                }
                if ((object2 = addAddressFragment.U) != null) {
                    n4 = R$string.acc_page_header_add_address;
                    object3 = hv3_0.K(n4);
                    object2.setContentDescription((CharSequence)object3);
                }
            } else {
                if (object2 != null) {
                    object2.setText((CharSequence)object4);
                }
                if ((object2 = addAddressFragment.U) != null) {
                    n3 = R$string.acc_page_header_edit_address;
                    object4 = hv3_0.K(n3);
                    object5 = new StringBuilder();
                    ((StringBuilder)object5).append((String)object4);
                    ((StringBuilder)object5).append((String)object3);
                    object3 = ((StringBuilder)object5).toString();
                    object2.setContentDescription((CharSequence)object3);
                }
            }
        } else {
            n8 = R$id.faarCtl;
            object2 = view.findViewById(n8);
            Intrinsics.checkNotNullExpressionValue(object2, object6);
            object2 = (CollapsingToolbarLayout)((Object)object2);
            n7 = R$style.collapsed_toolbar_title;
            ((CollapsingToolbarLayout)((Object)object2)).setCollapsedTitleTextAppearance(n7);
            n7 = R$style.expanded_toolbar_title;
            ((CollapsingToolbarLayout)((Object)object2)).setExpandedTitleTextAppearance(n7);
            n7 = mz3_0.d(16);
            int n10 = ((CollapsingToolbarLayout)((Object)object2)).getExpandedTitleMarginTop();
            int n14 = ((CollapsingToolbarLayout)((Object)object2)).getExpandedTitleMarginEnd();
            int n15 = ((CollapsingToolbarLayout)((Object)object2)).getExpandedTitleMarginBottom();
            ((CollapsingToolbarLayout)((Object)object2)).setExpandedTitleMargin(n7, n10, n14, n15);
            n8 = R$id.faarToolbar;
            object2 = view.findViewById(n8);
            Intrinsics.checkNotNullExpressionValue(object2, object6);
            object2 = (Toolbar)object2;
            n7 = (int)(this.w ? 1 : 0);
            object = n7 != 0 ? "address screen - shipping" : "address screen - my account";
            addAddressFragment.N = object;
            object = addAddressFragment.n;
            if (object == null) {
                ((Toolbar)object2).setTitle((CharSequence)object5);
                object3 = addAddressFragment.U;
                if (object3 != null) {
                    n3 = R$string.acc_page_header_add_address;
                    object4 = hv3_0.K(n3);
                    object3.setContentDescription((CharSequence)object4);
                }
                addAddressFragment.P = object3 = "add address form";
                n4 = (int)(addAddressFragment.w ? 1 : 0);
                object4 = "add";
                object3 = n4 != 0 ? object4 : "ma_add";
                addAddressFragment.Q = object3;
                addAddressFragment.R = object4;
                object3 = addAddressFragment.N;
                object4 = "create ";
                addAddressFragment.N = object3 = kp1_0.c((String)object4, (String)object3);
            } else {
                ((Toolbar)object2).setTitle((CharSequence)object4);
                object4 = addAddressFragment.U;
                if (object4 != null) {
                    int n16 = R$string.acc_page_header_edit_address;
                    object5 = hv3_0.K(n16);
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)object5);
                    ((StringBuilder)object).append((String)object3);
                    object3 = ((StringBuilder)object).toString();
                    object4.setContentDescription((CharSequence)object3);
                }
                addAddressFragment.P = object3 = "edit address form";
                n4 = (int)(addAddressFragment.w ? 1 : 0);
                object4 = "edit";
                object3 = n4 != 0 ? object4 : "ma_edit";
                addAddressFragment.Q = object3;
                addAddressFragment.R = object4;
                object3 = addAddressFragment.N;
                object4 = "update ";
                addAddressFragment.N = object3 = kp1_0.c((String)object4, (String)object3);
            }
            n4 = (int)(addAddressFragment.w ? 1 : 0);
            object4 = addAddressFragment.K;
            addAddressFragment.O = n4 != 0 ? (object3 = ((NewCustomEventsRevamp)object4).getEC_CHECKOUT_INTERACTIONS()) : (object3 = ((NewCustomEventsRevamp)object4).getEC_ADD_INTERACTION());
            n4 = R$drawable.nav_back;
            ((Toolbar)object2).setNavigationIcon(n4);
            n4 = R$string.back_button_text;
            ((Toolbar)object2).setNavigationContentDescription(n4);
            n3 = 0;
            object4 = null;
            object3 = new k4_0(0, addAddressFragment);
            ((Toolbar)object2).setNavigationOnClickListener((View.OnClickListener)object3);
            n8 = R$id.toolbar_reset;
            object2 = view2.findViewById(n8);
            object2.setOnClickListener(addAddressFragment);
            object2.setEnabled(false);
            addAddressFragment.I = object2;
        }
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        n3 = 0;
        object3 = new r4(addAddressFragment, 0);
        long l2 = 300L;
        object2.postDelayed((Runnable)object3, l2);
        n8 = R$id.addaddress_progressview;
        object2 = (AjioProgressView)view2.findViewById(n8);
        n8 = R$id.ajio_loader_view;
        object2 = (AjioLoaderView)view2.findViewById(n8);
        addAddressFragment.v = object2;
        n8 = R$id.notification_text;
        object2 = (TextView)view2.findViewById(n8);
        addAddressFragment.j = object2;
        n8 = R$id.faaTilName;
        object2 = (TextInputLayout)view2.findViewById(n8);
        addAddressFragment.s = object2;
        n8 = R$id.mobile_text_input;
        object2 = (TextInputLayout)view2.findViewById(n8);
        addAddressFragment.t = object2;
        n8 = R$id.state_text_input;
        object2 = (TextInputLayout)view2.findViewById(n8);
        addAddressFragment.q = object2;
        n8 = R$id.city_text_input;
        object2 = (TextInputLayout)view2.findViewById(n8);
        addAddressFragment.p = object2;
        n8 = R$id.area_locality_text_input;
        object2 = view2.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object2, object6);
        Object object7 = object2;
        object7 = (TextInputLayout)((Object)object2);
        n8 = R$id.flat_building_text_input;
        object2 = view2.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object2, object6);
        object2 = (TextInputLayout)((Object)object2);
        n4 = R$id.pincode_text_input;
        object3 = (TextInputLayout)view2.findViewById(n4);
        addAddressFragment.r = object3;
        n4 = R$id.area_locality_et;
        object3 = (AjioEditText)view2.findViewById(n4);
        addAddressFragment.k = object3;
        n4 = R$id.flat_building_et;
        object3 = (AjioEditText)view2.findViewById(n4);
        addAddressFragment.f = object3;
        n4 = R$id.landmark_et;
        object3 = (AjioEditText)view2.findViewById(n4);
        addAddressFragment.g = object3;
        n4 = R$id.city_et;
        object3 = (AjioEditText)view2.findViewById(n4);
        addAddressFragment.h = object3;
        n4 = R$id.state_et;
        object3 = (AjioEditText)view2.findViewById(n4);
        addAddressFragment.c = object3;
        n4 = R$id.faaEtName;
        object3 = (AjioEditText)view2.findViewById(n4);
        addAddressFragment.C = object3;
        n4 = R$id.mobile_et;
        object3 = (AjioEditText)view2.findViewById(n4);
        addAddressFragment.e = object3;
        n4 = R$id.pincode_et;
        object3 = (AjioEditText)view2.findViewById(n4);
        addAddressFragment.d = object3;
        n4 = R$id.landmark_text_input;
        object3 = (TextInputLayout)view2.findViewById(n4);
        addAddressFragment.T = object3;
        this.Wa();
        object4 = vz3_0.TEXTINPUTLAYOUTVALIDATORREVAMP;
        object3 = new fv0_2((vz3_0)((Object)object4));
        addAddressFragment.a = object3;
        n4 = R$id.addresscontainer;
        object3 = (NestedScrollView)view2.findViewById(n4);
        addAddressFragment.i = object3;
        if (object3 != null) {
            object3 = object3.getChildAt(0);
        } else {
            n4 = 0;
            object3 = null;
        }
        addAddressFragment.y = object3;
        object3 = addAddressFragment.C;
        object4 = addAddressFragment.Z;
        if (object3 != null) {
            object3.setOnFocusChangeListener((View.OnFocusChangeListener)object4);
        }
        if ((object3 = addAddressFragment.c) != null) {
            object3.setOnFocusChangeListener((View.OnFocusChangeListener)object4);
        }
        if ((object3 = addAddressFragment.d) != null) {
            object3.setOnFocusChangeListener((View.OnFocusChangeListener)object4);
        }
        if ((object3 = addAddressFragment.e) != null) {
            object3.setOnFocusChangeListener((View.OnFocusChangeListener)object4);
        }
        if ((object3 = addAddressFragment.f) != null) {
            object3.setOnFocusChangeListener((View.OnFocusChangeListener)object4);
        }
        if ((object3 = addAddressFragment.g) != null) {
            object3.setOnFocusChangeListener((View.OnFocusChangeListener)object4);
        }
        if ((object3 = addAddressFragment.k) != null) {
            object3.setOnFocusChangeListener((View.OnFocusChangeListener)object4);
        }
        if ((object3 = addAddressFragment.h) != null) {
            object3.setOnFocusChangeListener((View.OnFocusChangeListener)object4);
        }
        n4 = R$id.checkBox;
        object3 = (CheckBox)view2.findViewById(n4);
        addAddressFragment.l = object3;
        object3 = addAddressFragment.a;
        Intrinsics.checkNotNull(object3);
        object4 = addAddressFragment.C;
        object5 = addAddressFragment.s;
        int n17 = R$string.name_error_msg;
        object6 = hv3_0.K(n17);
        ((fv0_2)object3).c((EditText)object4, (TextInputLayout)((Object)object5), (String)object6);
        fv0_2 fv0_22 = addAddressFragment.a;
        Intrinsics.checkNotNull(fv0_22);
        object3 = fa3_2.REGEX;
        Object object8 = addAddressFragment.C;
        Object object9 = addAddressFragment.s;
        String string2 = hv3_0.K(R$string.name_error_msg);
        Object object10 = object3;
        fv0_22.a((fa3_2)((Object)object3), (EditText)object8, (TextInputLayout)((Object)object9), "^[ A-Za-z]+$", string2);
        object4 = addAddressFragment.a;
        Intrinsics.checkNotNull(object4);
        object5 = addAddressFragment.e;
        object6 = addAddressFragment.t;
        object = hv3_0.K(R$string.phone_error_msg);
        ((fv0_2)object4).c((EditText)object5, (TextInputLayout)((Object)object6), (String)object);
        fv0_22 = addAddressFragment.a;
        Intrinsics.checkNotNull(fv0_22);
        object10 = addAddressFragment.d;
        object8 = addAddressFragment.r;
        Object object11 = hv3_0.K(R$string.pin_code_error_msg);
        fv0_22.e((EditText)object10, (TextInputLayout)((Object)object8), "", (String)object11, false, 6);
        object4 = addAddressFragment.a;
        Intrinsics.checkNotNull(object4);
        object5 = addAddressFragment.h;
        object6 = addAddressFragment.p;
        object = hv3_0.K(R$string.city_error_msg);
        ((fv0_2)object4).c((EditText)object5, (TextInputLayout)((Object)object6), (String)object);
        object4 = addAddressFragment.a;
        Intrinsics.checkNotNull(object4);
        object5 = addAddressFragment.c;
        object6 = addAddressFragment.q;
        n7 = R$string.state_error_msg;
        object = hv3_0.K(n7);
        ((fv0_2)object4).c((EditText)object5, (TextInputLayout)((Object)object6), (String)object);
        object = addAddressFragment.a;
        Intrinsics.checkNotNull(object);
        AjioEditText ajioEditText = addAddressFragment.k;
        object10 = hv3_0.K(R$string.locality_area_error_msg);
        boolean bl2 = true;
        ((fv0_2)object).e(ajioEditText, (TextInputLayout)((Object)object7), "^[\\x00-\\x7F]+$", (String)object10, bl2, 0);
        fv0_22 = addAddressFragment.a;
        Intrinsics.checkNotNull(fv0_22);
        object10 = addAddressFragment.f;
        n3 = R$string.flat_error_msg;
        object11 = hv3_0.K(n3);
        boolean bl3 = true;
        object8 = object2;
        fv0_22.e((EditText)object10, (TextInputLayout)((Object)object2), "^[\\x00-\\x7F]+$", (String)object11, bl3, 0);
        object10 = addAddressFragment.a;
        Intrinsics.checkNotNull(object10);
        object9 = addAddressFragment.g;
        object11 = addAddressFragment.T;
        n8 = R$string.landmark_error_msg;
        String string3 = hv3_0.K(n8);
        string2 = "(^[ A-Za-z]+$)|(^$)";
        object8 = object3;
        ((fv0_2)object10).a((fa3_2)((Object)object3), (EditText)object9, (TextInputLayout)((Object)object11), string2, string3);
        object2 = addAddressFragment.d;
        if (object2 != null) {
            object3 = addAddressFragment.q0;
            object2.addTextChangedListener((TextWatcher)object3);
        }
        n8 = R$id.faaLayoutAddressType;
        view2.findViewById(n8).setVisibility(0);
        n8 = R$id.faaRgAddressType;
        object2 = (RadioGroup)view2.findViewById(n8);
        addAddressFragment.D = object2;
        n8 = R$id.faaTilAddressType;
        object2 = (TextInputLayout)view2.findViewById(n8);
        addAddressFragment.E = object2;
        if (object2 != null) {
            n4 = 8;
            object2.setVisibility(n4);
        }
        n8 = R$id.faaEtAddressType;
        object2 = (AjioEditText)view2.findViewById(n8);
        addAddressFragment.F = object2;
        object2 = addAddressFragment.n;
        addAddressFragment.Ua((CartDeliveryAddress)object2);
        object2 = addAddressFragment.D;
        if (object2 != null) {
            object3 = addAddressFragment.p0;
            object2.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener)object3);
        }
        n8 = R$id.add_address_btn_save;
        view2.findViewById(n8).setOnClickListener((View.OnClickListener)addAddressFragment);
    }

    public final void showNotification(String string2, String string3) {
        Object object;
        if (string2 == null) {
            return;
        }
        Object object2 = this.j;
        if (object2 == null) {
            string3 = this.getLayoutInflater();
            int n3 = R$layout.layout_toast;
            string3 = string3.inflate(n3, null);
            object2 = cp_1.Companion;
            Context context = this.requireContext();
            Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
            Intrinsics.checkNotNull(string3);
            object2.getClass();
            cp$a.E(context, string2, (View)string3);
            return;
        }
        object2.setText((CharSequence)string2);
        float f5 = -100.0f;
        int n4 = 0;
        cp_1 cp_12 = null;
        string2 = new TranslateAnimation(0.0f, 0.0f, f5, 0.0f);
        object2 = cp_1.Companion;
        int n7 = km_1.b((cp$a)object2);
        n7 = n7 != 0 ? hv3_0.w(R$integer.notification_anim_delay_accesibility) : hv3_0.w(R$integer.notification_anim_delay);
        cp_12 = cp$a.e();
        cp_12.getClass();
        n4 = cp_1.f();
        n4 = n4 != 0 ? hv3_0.w(R$integer.notification_anim_post_release_delay_accesibility) : hv3_0.w(R$integer.notification_anim_post_release_delay);
        long l2 = n7;
        string2.setDuration(l2);
        object2 = this.j;
        if (object2 != null) {
            object = null;
            object2.setVisibility(0);
        }
        object = Looper.getMainLooper();
        object2 = new Handler(object);
        object = new o4(this, string3);
        long l3 = 100;
        object2.postDelayed((Runnable)object, l3);
        string3 = this.j;
        if (string3 != null) {
            object2 = new p4(this);
            long l4 = n4;
            string3.postDelayed((Runnable)object2, l4);
        }
        if ((string3 = this.j) != null) {
            string3.startAnimation((Animation)string2);
        }
    }

    public final void z9() {
        boolean bl2;
        Object object = this.O;
        String string2 = Ft2.a(this.R, " reset");
        String string3 = Ft2.a(this.Q, "_reset");
        String string4 = this.N;
        int n3 = 1536;
        Object object2 = this.K;
        String string5 = "";
        String string6 = "address management screen";
        String string7 = this.L;
        String string8 = this.M;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, (String)object, string2, string5, string3, string4, string6, string7, null, string8, false, null, n3, null);
        this.Y = "";
        object2 = this.n;
        if (object2 == null) {
            object2 = this.a;
            Intrinsics.checkNotNull(object2);
            ((fv0_2)object2).a.e();
            object2 = new CartDeliveryAddress();
            this.Ua((CartDeliveryAddress)object2);
            this.Wa();
        } else {
            this.Ua((CartDeliveryAddress)object2);
        }
        object2 = this.C;
        Intrinsics.checkNotNull(object2);
        object2.requestFocus();
        object2 = this.I;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resetView");
            bl2 = false;
            object2 = null;
        }
        object = null;
        object2.setEnabled(false);
        object2 = this.getActivity();
        if (object2 != null && !(bl2 = (object2 = this.requireActivity()).isFinishing())) {
            object2 = this.requireActivity().getSystemService("input_method");
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            object2 = (InputMethodManager)object2;
            object = this.C;
            int n4 = 1;
            object2.showSoftInput((View)object, n4);
        }
        object2 = new Handler();
        object = new q4(this);
        object2.postDelayed((Runnable)object, 200L);
    }
}

