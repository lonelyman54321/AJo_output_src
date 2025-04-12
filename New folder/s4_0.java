/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.address.activity.NewAddressActivity;
import com.ril.ajio.myaccount.address.activity.NewAddressActivity$a;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Address.CartDeliveryAddressInfo;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.query.QueryAddress;
import com.ril.ajio.services.utils.ServiceUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from S4
 */
public final class s4_0
extends Fragment
implements T4,
fo0_1 {
    public static final S4$a Companion;
    public final hh3_2 a;
    public wo2_1 b;
    public j3_0 c;
    public final boolean d;
    public final UserInformation e;
    public final NewEEcommerceEventsRevamp f;
    public final NewCustomEventsRevamp g;
    public final String h;
    public final String i;
    public ImageButton j;
    public CollapsingToolbarLayout k;
    public Toolbar l;
    public TextView m;
    public AjioLoaderView n;
    public RecyclerView o;
    public ShimmerFrameLayout p;
    public jo_2 q;
    public os1_2 r;

    static {
        S4$a s4$a;
        Companion = s4$a = new Object();
    }

    public s4_0() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        boolean bl2;
        Object object = new q4_0(this, 0);
        this.a = object = yr1_2.b((Function0)object);
        this.d = bl2 = og1_1.c();
        this.e = object = VX0.a(AJIOApplication.Companion);
        object = AnalyticsManager.Companion;
        this.f = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.g = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.h = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.i = object = newEEcommerceEventsRevamp.getPrevScreenType();
    }

    public final void O(CartDeliveryAddress cartDeliveryAddress) {
        Object object = cartDeliveryAddress;
        Intrinsics.checkNotNullParameter(cartDeliveryAddress, "address");
        NewCustomEventsRevamp newCustomEventsRevamp = this.g;
        String string2 = newCustomEventsRevamp.getEC_ADD_INTERACTION();
        String string3 = this.h;
        String string4 = this.i;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, "edit address", "", "ma_edit_address", "address list screen - my account", "address management screen", string3, null, string4, false, null, 1536, null);
        Gson gson = new Gson();
        object = gson.toJson(cartDeliveryAddress);
        this.Ra((String)object);
    }

    public final void Oa() {
        Object object = this.o;
        if (object != null) {
            ai0_2.i((View)object);
        }
        if ((object = this.p) != null) {
            ai0_2.B((View)object);
        }
        object = p3.a("client_type", "Android");
        AJIOApplication.Companion.getClass();
        Object object2 = p90.a((Context)AJIOApplication$a.a());
        ((HashMap)object).put("client_version", object2);
        object2 = this.e;
        Intrinsics.checkNotNullExpressionValue(object2, "userInformation");
        String string2 = ServiceUtil.getToken((UserInformation)object2);
        if (string2 != null) {
            h5_0 h5_02 = this.Pa();
            object2 = ((UserInformation)object2).getUserId();
            String string3 = "getUserId(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            h5_02.d(string2, (String)object2, (HashMap)object);
        }
    }

    public final h5_0 Pa() {
        return (h5_0)this.a.getValue();
    }

    public final void Qa(DataCallback object) {
        Object object2 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n3 != 0) {
            int n4;
            String string2;
            Object object3;
            Intrinsics.checkNotNull(object);
            n3 = ((DataCallback)object).getStatus();
            Object object4 = "NoAddressDialog";
            int n7 = 133;
            Integer n8 = null;
            if (n3 == 0) {
                if ((object = (CartDeliveryAddressInfo)((DataCallback)object).getData()) != null) {
                    object2 = ((CartDeliveryAddressInfo)object).getAddresses();
                    object3 = "appPreferences";
                    if (object2 != null && (n3 = ((ArrayList)(object2 = ((CartDeliveryAddressInfo)object).getAddresses())).size()) != 0) {
                        block26: {
                            ArrayList arrayList;
                            object2 = this.b;
                            object4 = "getAddresses(...)";
                            if (object2 == null) {
                                arrayList = ((CartDeliveryAddressInfo)object).getAddresses();
                                Intrinsics.checkNotNullExpressionValue(arrayList, (String)object4);
                                this.b = object2 = new wo2_1(arrayList, this);
                            } else {
                                Intrinsics.checkNotNull(object2);
                                arrayList = ((CartDeliveryAddressInfo)object).getAddresses();
                                Intrinsics.checkNotNullExpressionValue(arrayList, (String)object4);
                                string2 = "addresses";
                                Intrinsics.checkNotNullParameter(arrayList, string2);
                                ((wo2_1)object2).a = arrayList;
                            }
                            object = ((CartDeliveryAddressInfo)object).getAddresses();
                            Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                            object = object.iterator();
                            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                                object4 = object2 = object.next();
                                object4 = (CartDeliveryAddress)object2;
                                boolean bl2 = ((CartDeliveryAddress)object4).isDefaultAddress();
                                if (!bl2) continue;
                                break block26;
                            }
                            n3 = 0;
                            object2 = null;
                        }
                        object2 = (CartDeliveryAddress)object2;
                        if (object2 != null) {
                            object = AddressType.Address;
                            ((CartDeliveryAddress)object2).setAddressType((AddressType)((Object)object));
                            object = ((CartDeliveryAddress)object2).getFormattedAddress();
                            ((CartDeliveryAddress)object2).setFormattedAddress((String)object);
                            object = this.q;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                n4 = 0;
                                object = null;
                            }
                            ((jo_2)object).F((CartDeliveryAddress)object2);
                        }
                        if ((object = this.p) != null) {
                            ai0_2.i(object);
                        }
                        if ((object = this.o) != null) {
                            object2 = this.b;
                            ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
                        }
                        if ((object = this.o) != null) {
                            ai0_2.B((View)object);
                        }
                    } else {
                        object = this.getParentFragment();
                        if (object != null) {
                            object2 = this.p;
                            if (object2 != null) {
                                ai0_2.i((View)object2);
                            }
                            if ((object2 = this.o) != null) {
                                ai0_2.i((View)object2);
                            }
                            object2 = J32$a.a(j32_0.Companion);
                            ((Fragment)object2).setTargetFragment(this, n7);
                            object = ((Fragment)object).getChildFragmentManager();
                            ((DialogFragment)object2).show((FragmentManager)object, (String)object4);
                            object = new CartDeliveryAddress();
                            object2 = AddressType.PinCodeEmpty;
                            ((CartDeliveryAddress)object).setAddressType((AddressType)((Object)object2));
                            object2 = this.q;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                n3 = 0;
                                object2 = null;
                            }
                            ((jo_2)object2).F((CartDeliveryAddress)object);
                        }
                    }
                }
            } else {
                n4 = ((DataCallback)object).getStatus();
                if (n4 == (n3 = 1) && (object = this.getActivity()) != null && (object = this.getParentFragment()) != null) {
                    object2 = this.p;
                    if (object2 != null) {
                        ai0_2.i((View)object2);
                    }
                    if ((object2 = this.o) != null) {
                        ai0_2.i((View)object2);
                    }
                    object2 = J32$a.a(j32_0.Companion);
                    ((Fragment)object2).setTargetFragment(this, n7);
                    object = ((Fragment)object).getChildFragmentManager();
                    ((DialogFragment)object2).show((FragmentManager)object, (String)object4);
                }
            }
            Bundle bundle = new Bundle();
            object = this.b;
            if (object != null) {
                n4 = ((wo2_1)object).a.size();
                object = n4;
            } else {
                n4 = 0;
                object = null;
            }
            object2 = this.g;
            if (object != null) {
                object = ((NewCustomEventsRevamp)object2).getNO_OF_ADDRESS();
                object2 = this.b;
                if (object2 != null) {
                    object2 = ((wo2_1)object2).a;
                    n3 = ((ArrayList)object2).size();
                    n8 = n3;
                }
                Intrinsics.checkNotNull(n8);
                n3 = n8;
                bundle.putInt((String)object, n3);
            } else {
                object = ((NewCustomEventsRevamp)object2).getNO_OF_ADDRESS();
                n3 = 0;
                object2 = null;
                bundle.putInt((String)object, 0);
            }
            object = this.f;
            String string3 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
            String string4 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
            String string5 = "address management screen";
            object3 = this.g;
            string2 = "address list screen - my account";
            ((NewCustomEventsRevamp)object3).newPushCustomScreenView(string2, string5, string3, bundle, string4);
        }
    }

    public final void Ra(String object) {
        Object object2;
        Bundle bundle = new Bundle();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            object2 = "add_json";
            bundle.putString((String)object2, (String)object);
            object = "shipping_update";
            bl2 = true;
            bundle.putBoolean((String)object, bl2);
        }
        bundle.putBoolean("isGoogleLocationEnable", false);
        object = NewAddressActivity.Companion;
        object2 = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(object2, "requireActivity(...)");
        object.getClass();
        NewAddressActivity$a.a((Context)object2, this, bundle);
    }

    public final void Sa() {
        zr1_1 zr1_12 = this.Pa().f;
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        F62 f62 = new M4(this);
        zr1_12.e(mu1_12, f62);
        zr1_12 = this.Pa().h;
        mu1_12 = this.getViewLifecycleOwner();
        f62 = new N4(this);
        zr1_12.e(mu1_12, f62);
        zr1_12 = this.Pa().e;
        mu1_12 = this.getViewLifecycleOwner();
        f62 = new o4_0(this);
        zr1_12.e(mu1_12, f62);
        zr1_12 = this.Pa().d;
        mu1_12 = this.getViewLifecycleOwner();
        f62 = new p4_0(this, 0);
        zr1_12.e(mu1_12, f62);
    }

    public final void b6(CartDeliveryAddress object, int n3) {
        Intrinsics.checkNotNullParameter(object, "address");
        Object object2 = this.getParentFragment();
        if (object2 != null) {
            os1_2 os1_22 = this.r;
            if (os1_22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myAccountSharedViewModel");
                os1_22 = null;
            }
            os1_22.a.k(object);
            eo0_2.Companion.getClass();
            object = new eo0_2();
            os1_22 = new Bundle();
            String string2 = "position";
            os1_22.putInt(string2, n3);
            ((Fragment)object).setArguments((Bundle)os1_22);
            Intrinsics.checkNotNullParameter(this, "<set-?>");
            ((eo0_2)object).a = this;
            FragmentManager fragmentManager = ((Fragment)object2).getChildFragmentManager();
            object2 = "DeleteAddressBSDialog";
            ((DialogFragment)object).show(fragmentManager, (String)object2);
        }
    }

    public final void k8(CartDeliveryAddress object) {
        Intrinsics.checkNotNullParameter(object, "address");
        Serializable serializable = new QueryAddress();
        Object object2 = ((CartDeliveryAddress)object).getPostalCode();
        serializable.setPostCode((String)object2);
        object2 = ((CartDeliveryAddress)object).getFirstName();
        serializable.setFirstName((String)object2);
        object2 = ((CartDeliveryAddress)object).getLastName();
        serializable.setLastName((String)object2);
        object2 = ((CartDeliveryAddress)object).getLine1();
        serializable.setAddressLine1((String)object2);
        object2 = ((CartDeliveryAddress)object).getLine2();
        serializable.setAddressLine2((String)object2);
        object2 = ((CartDeliveryAddress)object).getLandmark();
        serializable.setLandmark((String)object2);
        object2 = ((CartDeliveryAddress)object).getTown();
        serializable.setTown((String)object2);
        object2 = ((CartDeliveryAddress)object).getDistrict();
        serializable.setCity((String)object2);
        object2 = ((CartDeliveryAddress)object).getState();
        serializable.setState((String)object2);
        object2 = ((CartDeliveryAddress)object).getPhone();
        serializable.setPhone((String)object2);
        object2 = "IN";
        serializable.setCountryISOCode((String)object2);
        int n3 = 1;
        serializable.setIsDefaultAddress(n3 != 0);
        object = ((CartDeliveryAddress)object).getId();
        serializable.setAddressId((String)object);
        object = this.n;
        if (object != null) {
            ((AjioLoaderView)((Object)object)).startLoader();
        }
        object = this.Pa();
        object.getClass();
        object2 = "<set-?>";
        Intrinsics.checkNotNullParameter(serializable, (String)object2);
        ((h5_0)object).q = serializable;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        object = serializable.getAddressId();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            object = "id";
            object2 = serializable.getAddressId();
            hashMap.put(object, object2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(object = serializable.getAddressPOC())))) {
            object = "addressPoc";
            object2 = serializable.getAddressPOC();
            hashMap.put(object, object2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(object = serializable.getAddressLine1())))) {
            object = "line1";
            object2 = serializable.getAddressLine1();
            hashMap.put(object, object2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(object = serializable.getAddressLine2())))) {
            object = "line2";
            object2 = serializable.getAddressLine2();
            hashMap.put(object, object2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(object = serializable.getTown())))) {
            object = "town";
            object2 = serializable.getTown();
            hashMap.put(object, object2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(object = serializable.getPostCode())))) {
            object = "postalCode";
            object2 = serializable.getPostCode();
            hashMap.put(object, object2);
        }
        object = serializable.getCity();
        bl2 = TextUtils.isEmpty((CharSequence)object);
        object2 = "district";
        if (!bl2) {
            object = serializable.getCity();
            hashMap.put(object2, object);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(object = serializable.getCity())))) {
            object = serializable.getCity();
            hashMap.put(object2, object);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(object = serializable.getState())))) {
            object = "state";
            object2 = serializable.getState();
            hashMap.put(object, object2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(object = serializable.getLandmark())))) {
            object = "landmark";
            object2 = serializable.getLandmark();
            hashMap.put(object, object2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(object = serializable.getPhone())))) {
            object = "phone";
            object2 = serializable.getPhone();
            hashMap.put(object, object2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)(object = serializable.getCountryISOCode())))) {
            object = "country.isocode";
            object2 = serializable.getCountryISOCode();
            hashMap.put(object, object2);
        }
        if ((n3 = TextUtils.isEmpty((CharSequence)(object = serializable.getSelectedAddressType()))) == 0) {
            object2 = "selectedAddressType";
            hashMap.put(object2, object);
        }
        if ((n3 = TextUtils.isEmpty((CharSequence)(object = serializable.getCustomAddressType()))) == 0) {
            object2 = "customAddressType";
            hashMap.put(object2, object);
        }
        bl2 = serializable.isDefaultAddress();
        object = String.valueOf(bl2);
        hashMap.put("defaultAddress", object);
        HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
        hashMap2.put("client_type", "Android");
        AJIOApplication.Companion.getClass();
        object = p90.a((Context)AJIOApplication$a.a());
        hashMap2.put("client_version", object);
        object = "userInformation";
        object2 = this.e;
        Intrinsics.checkNotNullExpressionValue(object2, (String)object);
        String string2 = ServiceUtil.getToken((UserInformation)object2);
        if (string2 != null) {
            h5_0 h5_02 = this.Pa();
            String string3 = ((UserInformation)object2).getUserId();
            Intrinsics.checkNotNullExpressionValue(string3, "getUserId(...)");
            String string4 = serializable.getAddressId();
            Intrinsics.checkNotNullExpressionValue(string4, "getAddressId(...)");
            h5_02.getClass();
            Intrinsics.checkNotNullParameter(string3, "userId");
            Intrinsics.checkNotNullParameter("UpdateAddress", "requestID");
            Intrinsics.checkNotNullParameter(string2, "accessToken");
            Intrinsics.checkNotNullParameter(string4, "addressID");
            Intrinsics.checkNotNullParameter(hashMap2, "query");
            Intrinsics.checkNotNullParameter(hashMap, "postBody");
            object = md3_0.c(h5_02);
            serializable = new e5_0(h5_02, string3, string2, string4, hashMap2, hashMap, null);
            n3 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)((Object)serializable), n3);
        }
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        boolean bl2;
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null && !(bl2 = (fragmentActivity = this.requireActivity()).isFinishing()) && !(bl2 = this.isDetached())) {
            super.onActivityResult(n3, n4, intent);
            int n7 = 26;
            bl2 = false;
            fragmentActivity = null;
            if (n3 != n7) {
                n4 = 133;
                if (n3 == n4) {
                    this.Ra(null);
                }
            } else {
                n3 = -1;
                if (n4 == n3) {
                    Object object = this.getView();
                    if (object != null) {
                        this.Sa();
                    }
                    HashMap hashMap = p3.a("client_type", "Android");
                    AJIOApplication.Companion.getClass();
                    object = p90.a((Context)AJIOApplication$a.a());
                    hashMap.put("client_version", object);
                    object = "userInformation";
                    Object object2 = this.e;
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                    String string2 = ServiceUtil.getToken((UserInformation)object2);
                    if (string2 != null) {
                        h5_0 h5_02 = this.Pa();
                        String string3 = ((UserInformation)object2).getUserId();
                        Intrinsics.checkNotNullExpressionValue(string3, "getUserId(...)");
                        h5_02.getClass();
                        Intrinsics.checkNotNullParameter("GetAddresses", "requestID");
                        Intrinsics.checkNotNullParameter(string2, "accessToken");
                        Intrinsics.checkNotNullParameter(hashMap, "queryParam");
                        Intrinsics.checkNotNullParameter(string3, "userId");
                        object = md3_0.c(h5_02);
                        object2 = new d5_0(h5_02, string2, hashMap, string3, null);
                        n7 = 3;
                        Ae3.d((i90_0)object, null, null, (Function2)object2, n7);
                    }
                }
            }
        }
    }

    public final void onAttach(Context object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            bundle = this.requireArguments();
            String string2 = "argument_data";
            bundle.getString(string2);
        }
        if (bl2 = object instanceof j3_0) {
            object = (j3_0)object;
            this.c = object;
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = object.getViewModelStore();
        object2 = cX1.a((FragmentActivity)object, (String)object2, (FragmentActivity)object, (String)object2);
        String string2 = "factory";
        object = dX1.a((FragmentActivity)object, (rd3_0)object3, "store", (E$b)object2, string2);
        String string3 = "defaultCreationExtras";
        object = li_2.a((Wd0)object, string3, (rd3_0)object3, (E$b)object2, (Wd0)object);
        object2 = Reflection.getOrCreateKotlinClass(os1_2.class);
        object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            object = (os1_2)((pD3)object).a((yn1_2)object2, (String)object3);
            Intrinsics.checkNotNullParameter(object, "<set-?>");
            this.r = object;
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = this.d;
        if (n3 != 0) {
            n3 = R$layout.fragment_address_list_luxe;
            return layoutInflater.inflate(n3, viewGroup, false);
        }
        n3 = R$layout.fragment_address_list_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onStop() {
        super.onStop();
        this.f.setPreviousScreenData("address list screen - my account", "address management screen");
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.address_back;
        object2 = (ImageButton)object.findViewById(n3);
        this.j = object2;
        n3 = R$id.alfCtl;
        object2 = (CollapsingToolbarLayout)object.findViewById(n3);
        this.k = object2;
        n3 = R$id.alfToolbar;
        object2 = (Toolbar)object.findViewById(n3);
        this.l = object2;
        n3 = R$id.alfTvAddAddress;
        object2 = (TextView)object.findViewById(n3);
        this.m = object2;
        n3 = R$id.falrPbLoading;
        object2 = (AjioLoaderView)object.findViewById(n3);
        this.n = object2;
        n3 = R$id.falrRvAddress;
        object2 = (RecyclerView)object.findViewById(n3);
        this.o = object2;
        n3 = R$id.falrShimmer;
        object2 = (ShimmerFrameLayout)object.findViewById(n3);
        this.p = object2;
        Object object3 = this.requireActivity().getApplicationContext();
        String string2 = "getApplicationContext(...)";
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        object2 = new jo_2((Context)object3);
        this.q = object2;
        n3 = R$id.app_bar_layout;
        object = (AppBarLayout)object.findViewById(n3);
        if (object != null) {
            n3 = R$string.acc_page_header_address;
            object2 = this.getString(n3);
            object3 = new StringBuilder();
            ((StringBuilder)object3).append((String)object2);
            ((StringBuilder)object3).append(" Title ");
            object2 = ((StringBuilder)object3).toString();
            object.setContentDescription((CharSequence)object2);
        }
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        int n4 = 0;
        string2 = null;
        object3 = new i4_0(object, 0);
        long l2 = 500L;
        object2.postDelayed((Runnable)object3, l2);
        boolean bl2 = this.d;
        if (bl2) {
            object = this.j;
            if (object != null) {
                boolean bl3 = false;
                object3 = null;
                object2 = new j4_0(this, 0);
                object.setOnClickListener((View.OnClickListener)object2);
            }
        } else {
            int n7;
            object = this.k;
            if (object != null) {
                n3 = R$style.collapsed_toolbar_title;
                object.setCollapsedTitleTextAppearance(n3);
                n3 = R$style.expanded_toolbar_title;
                object.setExpandedTitleTextAppearance(n3);
                n3 = mz3_0.d(16);
                n7 = object.getExpandedTitleMarginTop();
                n4 = object.getExpandedTitleMarginEnd();
                int n8 = object.getExpandedTitleMarginBottom();
                object.setExpandedTitleMargin(n3, n7, n4, n8);
            }
            if ((object = this.l) != null) {
                n3 = R$string.addresses;
                object2 = this.getString(n3);
                object.setTitle((CharSequence)object2);
            }
            if ((object = this.l) != null) {
                n3 = R$drawable.nav_back;
                object.setNavigationIcon(n3);
            }
            if ((object = this.l) != null) {
                n3 = R$string.back_button_text;
                object2 = this.getString(n3);
                object.setNavigationContentDescription((CharSequence)object2);
            }
            if ((object = this.l) != null) {
                n7 = 0;
                object3 = null;
                object2 = new K4(this, 0);
                object.setNavigationOnClickListener((View.OnClickListener)object2);
            }
        }
        if ((object = this.m) != null) {
            object2 = new L4(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        this.Sa();
        this.Oa();
    }

    public final void u1(CartDeliveryAddress cartDeliveryAddress, int n3) {
        Object object;
        String string2;
        Object object2;
        Object object3;
        s4_0 s4_02 = this;
        Object object4 = cartDeliveryAddress;
        Intrinsics.checkNotNullParameter(cartDeliveryAddress, "address");
        Object object5 = this.b;
        if (object5 != null) {
            object3 = ((wo2_1)object5).a;
            ((ArrayList)object3).remove(n3);
            ((RecyclerView$f)object5).notifyDataSetChanged();
        }
        String string3 = cartDeliveryAddress.getId();
        Intrinsics.checkNotNullExpressionValue(string3, "getId(...)");
        object5 = s4_02.n;
        if (object5 != null) {
            ((AjioLoaderView)((Object)object5)).startLoader();
        }
        HashMap hashMap = p3.a("client_type", "Android");
        AJIOApplication.Companion.getClass();
        object5 = p90.a((Context)AJIOApplication$a.a());
        hashMap.put("client_version", object5);
        object5 = "userInformation";
        object4 = s4_02.e;
        Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
        String string4 = ServiceUtil.getToken((UserInformation)object4);
        if (string4 != null) {
            object2 = this.Pa();
            String string5 = ((UserInformation)object4).getUserId();
            Intrinsics.checkNotNullExpressionValue(string5, "getUserId(...)");
            object2.getClass();
            Intrinsics.checkNotNullParameter(string3, "id");
            Intrinsics.checkNotNullParameter("DeleteAddress", "requestID");
            Intrinsics.checkNotNullParameter(string4, "accessToken");
            Intrinsics.checkNotNullParameter(hashMap, "query");
            Intrinsics.checkNotNullParameter(string5, "userId");
            object5 = md3_0.c((jD3)object2);
            string2 = null;
            object = object4;
            object4 = new z4_0((h5_0)object2, null, string3, string4, string5, hashMap);
            int n4 = 3;
            object = null;
            Ae3.d((i90_0)object5, null, null, (Function2)object4, n4);
        }
        object5 = s4_02.c;
        object4 = "Remove Address Button";
        object3 = "Remove Address";
        if (object5 != null) {
            object5 = AnalyticsManager.Companion;
            object = "shipping screen";
            tj2_0.e((AnalyticsManager$Companion)object5, (String)object3, (String)object4, (String)object);
        } else {
            object5 = AnalyticsManager.Companion;
            object = "addressbook screen";
            tj2_0.e((AnalyticsManager$Companion)object5, (String)object3, (String)object4, (String)object);
        }
        object2 = s4_02.g;
        string2 = ((NewCustomEventsRevamp)object2).getEC_ADD_INTERACTION();
        String string6 = s4_02.h;
        String string7 = s4_02.i;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string2, "delete address", "", "ma_delete_address", "address list screen - my account", "address management screen", string6, null, string7, false, null, 1536, null);
    }
}

