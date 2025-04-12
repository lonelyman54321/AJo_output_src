/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
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
 *  android.widget.ImageView
 *  android.widget.RadioGroup
 *  android.widget.RadioGroup$OnCheckedChangeListener
 *  android.widget.TextView
 */
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
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
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.textfield.TextInputLayout;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$integer;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.query.QueryAddress;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.services.utils.ServiceUtil;
import com.ril.ajio.utility.validators.Validator;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from lM
 */
public final class lm_2
extends BottomSheetDialogFragment
implements View.OnClickListener,
pk2_1 {
    public static final lM$a Companion;
    public RadioGroup A;
    public TextInputLayout B;
    public AjioEditText C;
    public int D;
    public final boolean E;
    public View F;
    public final NewEEcommerceEventsRevamp G;
    public final NewCustomEventsRevamp H;
    public final String I;
    public final String J;
    public final String K;
    public final String L;
    public final String M;
    public final String N;
    public final String O;
    public boolean P;
    public TextInputLayout Q;
    public String R;
    public zm_2 S;
    public wx1_1 T;
    public CartDeliveryAddress U;
    public final jo_2 X;
    public String Y;
    public final gm_1 Z;
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
    public final lM$b k0;
    public CheckBox l;
    public boolean m;
    public CartDeliveryAddress n;
    public TextInputLayout o;
    public TextInputLayout p;
    public final hm_2 p0;
    public TextInputLayout q;
    public final lM$c q0;
    public TextInputLayout r;
    public TextInputLayout s;
    public FragmentActivity t;
    public AjioLoaderView u;
    public final boolean[] v;
    public View w;
    public h5_0 x;
    public hy3_0 y;
    public AjioEditText z;

    static {
        lM$a lM$a;
        Companion = lM$a = new Object();
    }

    public lm_2() {
        boolean bl2;
        Object object = new fm_2(this);
        this.b = object = yr1_2.b((Function0)object);
        this.m = true;
        object = new boolean[5];
        this.v = (boolean[])object;
        this.E = bl2 = og1_1.c();
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.G = object2;
        this.H = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        Object object3 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.I = object3;
        this.J = object2 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        this.K = "create address screen - shipping";
        this.L = object = ((NewCustomEventsRevamp)object).getEC_CHECKOUT_INTERACTIONS();
        this.M = "add address form";
        this.N = object = "add";
        this.O = object;
        this.R = object = "";
        AJIOApplication.Companion.getClass();
        object3 = AJIOApplication$a.a();
        this.X = object2 = new jo_2((Context)object3);
        this.Y = object;
        this.Z = object = new gm_1(this);
        this.k0 = object = new lM$b(this);
        this.p0 = object = new hm_2(this);
        this.q0 = object = new lM$c(this);
    }

    public static String Qa(CartDeliveryAddress object) {
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
        CartDeliveryAddress cartDeliveryAddress;
        boolean bl2 = h40_0.Q1();
        if (bl2 && (cartDeliveryAddress = this.U) != null) {
            AddressType addressType;
            Object object = this.X;
            Object object2 = ((jo_2)object).l();
            String string2 = null;
            AddressType addressType2 = object2 != null ? ((CartDeliveryAddress)object2).getAddressType() : null;
            if (addressType2 != (addressType = AddressType.Pincode) && (addressType2 = object2 != null ? ((CartDeliveryAddress)object2).getAddressType() : null) != (addressType = AddressType.Address)) {
                ((jo_2)object).D(false);
            } else {
                boolean bl3;
                if (object2 != null) {
                    string2 = ((CartDeliveryAddress)object2).getPostalCode();
                }
                if (!(bl3 = Intrinsics.areEqual(string2, object2 = cartDeliveryAddress.getPostalCode()))) {
                    bl3 = true;
                    ((jo_2)object).D(bl3);
                } else {
                    ((jo_2)object).D(false);
                }
            }
            object = this.S;
            if (object != null) {
                object.z8(cartDeliveryAddress);
            }
            this.dismissAllowingStateLoss();
        }
    }

    public final void Pa(String string2) {
        Object object = this.u;
        if (object != null) {
            object.startLoader();
        }
        object = p3.a("client_type", "Android");
        AJIOApplication.Companion.getClass();
        Object object2 = p90.a((Context)AJIOApplication$a.a());
        ((HashMap)object).put("client_version", object2);
        object2 = this.Ra();
        Object object3 = "<get-userInformation>(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = ServiceUtil.getToken((UserInformation)object2);
        if (object2 != null && (object3 = this.x) != null) {
            ((h5_0)object3).b((String)object2, string2, (HashMap)object);
        }
    }

    public final UserInformation Ra() {
        return (UserInformation)this.b.getValue();
    }

    public final void Ua(CartDeliveryAddress cartDeliveryAddress) {
        if (cartDeliveryAddress != null) {
            Object object = this.z;
            Intrinsics.checkNotNull(object);
            String string2 = lm_2.Sa(cartDeliveryAddress);
            object.setText((CharSequence)string2);
            object = cartDeliveryAddress.getLine1();
            int n3 = TextUtils.isEmpty((CharSequence)object);
            string2 = "";
            object = n3 == 0 ? cartDeliveryAddress.getLine1() : string2;
            Object object2 = this.f;
            Intrinsics.checkNotNull(object2);
            object2.setText((CharSequence)object);
            object = lm_2.Qa(cartDeliveryAddress);
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
                    this.D = n3 = R$id.faaRbHome;
                    object = this.A;
                    Intrinsics.checkNotNull(object);
                    n4 = R$id.faaRbHome;
                    object.check(n4);
                    object = this.B;
                    if (object != null) {
                        object.setVisibility(n7);
                    }
                } else {
                    string2 = "work";
                    n4 = (int)(kotlin.text.b.i((String)object, string2, bl2) ? 1 : 0);
                    if (n4 != 0) {
                        this.D = n3 = R$id.faaRbWork;
                        object = this.A;
                        Intrinsics.checkNotNull(object);
                        n4 = R$id.faaRbWork;
                        object.check(n4);
                        object = this.B;
                        if (object != null) {
                            object.setVisibility(n7);
                        }
                    } else {
                        string2 = "other";
                        n3 = (int)(kotlin.text.b.i((String)object, string2, bl2) ? 1 : 0);
                        if (n3 != 0) {
                            this.D = n3 = R$id.faaRbOthers;
                            object = this.A;
                            Intrinsics.checkNotNull(object);
                            n4 = R$id.faaRbOthers;
                            object.check(n4);
                            object = this.B;
                            if (object != null) {
                                n4 = 0;
                                string2 = null;
                                object.setVisibility(0);
                            }
                            if ((object = cartDeliveryAddress.getCustomAddressType()) != null && (n3 = ((String)object).length()) != 0 && (object = this.C) != null) {
                                string2 = cartDeliveryAddress.getCustomAddressType();
                                object.setText((CharSequence)string2);
                            }
                        }
                    }
                }
            } else {
                this.D = n3 = R$id.faaRbHome;
                object = this.A;
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
            this.D = n8 = R$id.faaRbHome;
            cartDeliveryAddress = this.A;
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
        AjioEditText ajioEditText = this.z;
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
                    ajioEditText = this.z;
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

    public final void onClick(View objectArray) {
        lm_2 lm_22 = this;
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
            boolean bl3;
            Object object6;
            int n8;
            int n10;
            object = this.a;
            Intrinsics.checkNotNull(object);
            object = ((fv0_2)object).a;
            n3 = (int)(((Validator)object).h() ? 1 : 0);
            object2 = this.B;
            Intrinsics.checkNotNull(object2);
            n4 = object2.getVisibility();
            int n14 = 1;
            int n15 = 32;
            if (n4 == 0) {
                object2 = this.C;
                Intrinsics.checkNotNull(object2);
                object2 = String.valueOf(((AppCompatEditText)object2).getText());
                n10 = ((String)object2).length() - n14;
                n8 = 0;
                object6 = null;
                bl3 = false;
                object5 = null;
                while (n8 <= n10) {
                    n7 = !bl3 ? n8 : n10;
                    if ((n7 = Intrinsics.compare(((String)object2).charAt(n7), n15)) <= 0) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        string2 = null;
                    }
                    if (!bl3) {
                        if (n7 == 0) {
                            bl3 = true;
                            continue;
                        }
                        ++n8;
                        continue;
                    }
                    if (n7 == 0) break;
                    n10 += -1;
                }
                if ((n4 = (int)(TextUtils.isEmpty((CharSequence)(object2 = ((Object)((String)object2).subSequence(n8, n10 += n14)).toString())) ? 1 : 0)) != 0) {
                    object = lm_22.B;
                    Intrinsics.checkNotNull(object);
                    ((TextInputLayout)((Object)object)).setErrorEnabled(n14 != 0);
                    object = lm_22.B;
                    Intrinsics.checkNotNull(object);
                    n4 = R$string.address_type_error_msg;
                    object2 = lm_22.getText(n4);
                    ((TextInputLayout)((Object)object)).setError((CharSequence)object2);
                    n3 = 0;
                    object = null;
                } else {
                    object2 = lm_22.B;
                    Intrinsics.checkNotNull(object2);
                    ((TextInputLayout)((Object)object2)).setErrorEnabled(false);
                }
            }
            if (n3 != 0) {
                object = new QueryAddress();
                object2 = lm_22.d;
                Intrinsics.checkNotNull(object2);
                object2 = String.valueOf(((AppCompatEditText)object2).getText());
                ((QueryAddress)object).setPostCode((String)object2);
                object2 = lm_22.z;
                Intrinsics.checkNotNull(object2);
                object2 = ai0_2.p(String.valueOf(((AppCompatEditText)object2).getText()));
                ((QueryAddress)object).setAddressPOC((String)object2);
                object2 = lm_22.f;
                Intrinsics.checkNotNull(object2);
                object2 = String.valueOf(((AppCompatEditText)object2).getText());
                n10 = ((String)object2).length() - n14;
                n8 = 0;
                object6 = null;
                bl3 = false;
                object5 = null;
                while (n8 <= n10) {
                    n7 = !bl3 ? n8 : n10;
                    if ((n7 = Intrinsics.compare(((String)object2).charAt(n7), n15)) <= 0) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        string2 = null;
                    }
                    if (!bl3) {
                        if (n7 == 0) {
                            bl3 = true;
                            continue;
                        }
                        ++n8;
                        continue;
                    }
                    if (n7 == 0) break;
                    n10 += -1;
                }
                object2 = ((Object)((String)object2).subSequence(n8, n10 += n14)).toString();
                ((QueryAddress)object).setAddressLine1((String)object2);
                object2 = lm_22.k;
                Intrinsics.checkNotNull(object2);
                object2 = String.valueOf(((AppCompatEditText)object2).getText());
                n10 = ((String)object2).length() - n14;
                n8 = 0;
                object6 = null;
                bl3 = false;
                object5 = null;
                while (n8 <= n10) {
                    n7 = !bl3 ? n8 : n10;
                    if ((n7 = Intrinsics.compare(((String)object2).charAt(n7), n15)) <= 0) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        string2 = null;
                    }
                    if (!bl3) {
                        if (n7 == 0) {
                            bl3 = true;
                            continue;
                        }
                        ++n8;
                        continue;
                    }
                    if (n7 == 0) break;
                    n10 += -1;
                }
                object2 = ((Object)((String)object2).subSequence(n8, n10 += n14)).toString();
                ((QueryAddress)object).setAddressLine2((String)object2);
                object2 = lm_22.g;
                Intrinsics.checkNotNull(object2);
                object2 = String.valueOf(((AppCompatEditText)object2).getText());
                n10 = ((String)object2).length() - n14;
                n8 = 0;
                object6 = null;
                bl3 = false;
                object5 = null;
                while (n8 <= n10) {
                    n7 = !bl3 ? n8 : n10;
                    if ((n7 = Intrinsics.compare(((String)object2).charAt(n7), n15)) <= 0) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        string2 = null;
                    }
                    if (!bl3) {
                        if (n7 == 0) {
                            bl3 = true;
                            continue;
                        }
                        ++n8;
                        continue;
                    }
                    if (n7 == 0) break;
                    n10 += -1;
                }
                object2 = ((Object)((String)object2).subSequence(n8, n10 += n14)).toString();
                ((QueryAddress)object).setLandmark((String)object2);
                ((QueryAddress)object).setTown("");
                object2 = lm_22.h;
                Intrinsics.checkNotNull(object2);
                object2 = String.valueOf(((AppCompatEditText)object2).getText());
                n10 = ((String)object2).length() - n14;
                n8 = 0;
                object6 = null;
                bl3 = false;
                object5 = null;
                while (n8 <= n10) {
                    n7 = !bl3 ? n8 : n10;
                    if ((n7 = Intrinsics.compare(((String)object2).charAt(n7), n15)) <= 0) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        string2 = null;
                    }
                    if (!bl3) {
                        if (n7 == 0) {
                            bl3 = true;
                            continue;
                        }
                        ++n8;
                        continue;
                    }
                    if (n7 == 0) break;
                    n10 += -1;
                }
                object2 = ((Object)((String)object2).subSequence(n8, n10 += n14)).toString();
                ((QueryAddress)object).setCity((String)object2);
                object2 = lm_22.c;
                Intrinsics.checkNotNull(object2);
                object2 = String.valueOf(((AppCompatEditText)object2).getText());
                n10 = ((String)object2).length() - n14;
                n8 = 0;
                object6 = null;
                bl3 = false;
                object5 = null;
                while (n8 <= n10) {
                    n7 = !bl3 ? n8 : n10;
                    if ((n7 = Intrinsics.compare(((String)object2).charAt(n7), n15)) <= 0) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        string2 = null;
                    }
                    if (!bl3) {
                        if (n7 == 0) {
                            bl3 = true;
                            continue;
                        }
                        ++n8;
                        continue;
                    }
                    if (n7 == 0) break;
                    n10 += -1;
                }
                object2 = ((Object)((String)object2).subSequence(n8, n10 += n14)).toString();
                ((QueryAddress)object).setState((String)object2);
                object2 = lm_22.e;
                Intrinsics.checkNotNull(object2);
                object2 = ((AppCompatEditText)object2).getText();
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
                n4 = lm_22.D;
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
                        object6 = "OTHER";
                        if (n4 == n10) {
                            ((QueryAddress)object).setSelectedAddressType((String)object6);
                            object2 = lm_22.C;
                            Intrinsics.checkNotNull(object2);
                            object2 = String.valueOf(((AppCompatEditText)object2).getText());
                            n10 = ((String)object2).length() - n14;
                            n8 = 0;
                            object6 = null;
                            bl3 = false;
                            object5 = null;
                            while (n8 <= n10) {
                                n7 = !bl3 ? n8 : n10;
                                if ((n7 = Intrinsics.compare(((String)object2).charAt(n7), n15)) <= 0) {
                                    n7 = 1;
                                } else {
                                    n7 = 0;
                                    string2 = null;
                                }
                                if (!bl3) {
                                    if (n7 == 0) {
                                        bl3 = true;
                                        continue;
                                    }
                                    ++n8;
                                    continue;
                                }
                                if (n7 == 0) break;
                                n10 += -1;
                            }
                            object2 = ((Object)((String)object2).subSequence(n8, n10 += n14)).toString();
                            ((QueryAddress)object).setCustomAddressType((String)object2);
                            object2 = lm_22.C;
                            Intrinsics.checkNotNull(object2);
                            object2 = String.valueOf(((AppCompatEditText)object2).getText());
                            n10 = ((String)object2).length() - n14;
                            n8 = 0;
                            object6 = null;
                            bl3 = false;
                            object5 = null;
                            while (n8 <= n10) {
                                n7 = !bl3 ? n8 : n10;
                                if ((n7 = Intrinsics.compare(((String)object2).charAt(n7), n15)) <= 0) {
                                    n7 = 1;
                                } else {
                                    n7 = 0;
                                    string2 = null;
                                }
                                if (!bl3) {
                                    if (n7 == 0) {
                                        bl3 = true;
                                        continue;
                                    }
                                    ++n8;
                                    continue;
                                }
                                if (n7 == 0) break;
                                n10 += -1;
                            }
                            object2 = com.jio.jioads.adinterfaces.a.a(n10, n14, n8, (String)object2);
                        } else {
                            object2 = object6;
                        }
                    }
                }
                bl2 = h40_0.Q1();
                if (bl2) {
                    ((QueryAddress)object).setIsDefaultAddress(n14 != 0);
                    object4 = lm_22.l;
                    if (object4 != null) {
                        n14 = 8;
                        object4.setVisibility(n14);
                    }
                } else {
                    object4 = lm_22.l;
                    Intrinsics.checkNotNull(object4);
                    bl2 = object4.isChecked();
                    ((QueryAddress)object).setIsDefaultAddress(bl2);
                }
                object4 = lm_22.t;
                hv3_0.S((Activity)object4);
                bl2 = lm_22.m;
                String string3 = lm_22.N;
                String string4 = lm_22.O;
                NewCustomEventsRevamp newCustomEventsRevamp = lm_22.H;
                object6 = "getUserId(...)";
                object5 = "<get-userInformation>(...)";
                string2 = "client_version";
                Object object7 = "Android";
                String string5 = "client_type";
                if (bl2) {
                    object4 = lm_22.u;
                    if (object4 != null) {
                        ((AjioLoaderView)((Object)object4)).startLoader();
                    }
                    object4 = lm_22.x;
                    Intrinsics.checkNotNull(object4);
                    object4.getClass();
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    ((h5_0)object4).q = object;
                    object = lm_2.Ta((QueryAddress)object);
                    object3 = p3.a(string5, (String)object7);
                    AJIOApplication.Companion.getClass();
                    object4 = p90.a((Context)AJIOApplication$a.a());
                    ((HashMap)object3).put(string2, object4);
                    object4 = this.Ra();
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                    object4 = ServiceUtil.getToken((UserInformation)object4);
                    if (object4 != null && (object5 = lm_22.x) != null) {
                        string2 = this.Ra().getUserId();
                        Intrinsics.checkNotNullExpressionValue(string2, (String)object6);
                        ((h5_0)object5).c(string2, (String)object4, (HashMap)object3, (HashMap)object);
                    }
                    object = new Bundle();
                    object3 = newCustomEventsRevamp.getPOSTAL_CODE();
                    object4 = lm_22.d;
                    Intrinsics.checkNotNull(object4);
                    object4 = String.valueOf(((AppCompatEditText)object4).getText());
                    object.putString((String)object3, (String)object4);
                    object3 = newCustomEventsRevamp.getADDRESS_TYPE();
                    object.putString((String)object3, (String)object2);
                    object2 = new StringBuilder();
                    String string6 = h30_0.a((StringBuilder)object2, string4, " new save");
                    String string7 = Ft2.a(string3, "_new_save");
                    string5 = lm_22.L;
                    object2 = lm_22.K;
                    int n16 = 1536;
                    object7 = lm_22.H;
                    object3 = lm_22.I;
                    object4 = lm_22.J;
                    Object object8 = object3;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object7, string5, string6, "add", string7, (String)object2, "address management screen", (String)object3, (Bundle)object, (String)object4, false, null, n16, null);
                    object6 = newCustomEventsRevamp.getEC_FORM();
                    string2 = lm_22.M;
                    string5 = lm_22.K;
                    int n17 = 1536;
                    object5 = "submit";
                    object7 = "form_submit";
                    string6 = "address management screen";
                    String string8 = lm_22.I;
                    string7 = null;
                    object = lm_22.J;
                    object8 = null;
                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object6, (String)object5, string2, (String)object7, string5, string6, string8, null, (String)object, false, null, n17, null);
                } else {
                    String string9;
                    Object object9;
                    object2 = lm_22.n;
                    Intrinsics.checkNotNull(object2);
                    object2 = ((CartDeliveryAddress)object2).getId();
                    ((QueryAddress)object).setAddressId((String)object2);
                    object2 = lm_22.u;
                    if (object2 != null) {
                        ((AjioLoaderView)((Object)object2)).startLoader();
                    }
                    HashMap hashMap = lm_2.Ta((QueryAddress)object);
                    object2 = p3.a(string5, (String)object7);
                    AJIOApplication.Companion.getClass();
                    object3 = p90.a((Context)AJIOApplication$a.a());
                    ((HashMap)object2).put(string2, object3);
                    object3 = this.Ra();
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
                    String string10 = ServiceUtil.getToken((UserInformation)object3);
                    if (string10 != null && (object9 = lm_22.x) != null) {
                        string9 = this.Ra().getUserId();
                        Intrinsics.checkNotNullExpressionValue(string9, (String)object6);
                        object = ((QueryAddress)object).getAddressId();
                        object3 = "getAddressId(...)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                        ((h5_0)object9).f(string9, string10, (String)object, (HashMap)object2, hashMap);
                    }
                    string2 = Ft2.a(string4, " save");
                    string5 = Ft2.a(string3, "_save");
                    object5 = lm_22.L;
                    object9 = lm_22.K;
                    object6 = lm_22.H;
                    string10 = lm_22.I;
                    object = lm_22.J;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, (String)object5, string2, "", string5, (String)object9, "address management screen", string10, null, (String)object, false, null, 1536, null);
                    object6 = newCustomEventsRevamp.getEC_FORM();
                    string2 = lm_22.M;
                    string5 = lm_22.K;
                    int n18 = 1536;
                    object5 = "submit";
                    object7 = "form_submit";
                    object9 = "address management screen";
                    string9 = lm_22.I;
                    string10 = null;
                    object = lm_22.J;
                    hashMap = null;
                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object6, (String)object5, string2, (String)object7, string5, (String)object9, string9, null, (String)object, false, null, n18, null);
                }
            } else {
                object = lm_22.t;
                hv3_0.S((Activity)object);
            }
            object = AnalyticsManager.Companion;
            object2 = "Save Address";
            object3 = "Add Address Button";
            object4 = "New Address Screen";
            tj2_0.e((AnalyticsManager$Companion)object, (String)object2, (String)object3, (String)object4);
        } else {
            n4 = R$id.toolbar_reset;
            if (n3 == n4) {
                object = yn3_0.a;
                object2 = new Object[]{};
                object4 = "reset clicked";
                ((yn3$a)object).a((String)object4, (Object[])object2);
                com.ril.ajio.myaccount.address.fragment.a.Companion.getClass();
                object = new com.ril.ajio.myaccount.address.fragment.a();
                Intrinsics.checkNotNullParameter(this, (String)object3);
                ((com.ril.ajio.myaccount.address.fragment.a)object).a = this;
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
        Object object7 = object6.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object7 != null) {
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object7 = string6.concat((String)object7);
            this.x = object3 = (h5_0)((pD3)object3).a((yn1_2)object6, (String)object7);
            object6 = this.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(object6, "getApplication(...)");
            object3 = new UserRepo((Application)object6);
            object6 = this.requireActivity().getApplication();
            ((kd3_2)object).a = object3;
            ((kd3_2)object).b = object6;
            Intrinsics.checkNotNullParameter(this, (String)object5);
            Intrinsics.checkNotNullParameter(object, (String)object4);
            object3 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object5);
            object6 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object3, string3);
            Intrinsics.checkNotNullParameter(object, (String)object4);
            Intrinsics.checkNotNullParameter(object6, string2);
            object7 = hy3_0.class;
            object = im_1.a((rd3_0)object3, (kd3_2)object, (Wd0)object6, (Class)object7, string4);
            object3 = ef0_0.a((Class)object7, string4, string4, (String)object2);
            object6 = object3.getQualifiedName();
            if (object6 != null) {
                object6 = string6.concat((String)object6);
                this.y = object = (hy3_0)((pD3)object).a((yn1_2)object3, (String)object6);
                Intrinsics.checkNotNullParameter(this, (String)object5);
                object = this.getViewModelStore();
                Intrinsics.checkNotNullParameter(this, (String)object5);
                object3 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(this, (String)object5);
                object5 = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object, string3);
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                Intrinsics.checkNotNullParameter(object5, string2);
                object4 = wx1_1.class;
                object = rl3_0.b((rd3_0)object, (E$b)object3, (Wd0)object5, (Class)object4, string4);
                object5 = ef0_0.a((Class)object4, string4, string4, (String)object2);
                object4 = object5.getQualifiedName();
                if (object4 != null) {
                    object4 = string6.concat((String)object4);
                    this.T = object = (wx1_1)((pD3)object).a((yn1_2)object5, (String)object4);
                    return;
                }
                object5 = string5.toString();
                object = new IllegalArgumentException((String)object5);
                throw object;
            }
            object5 = string5.toString();
            object = new IllegalArgumentException((String)object5);
            throw object;
        }
        object5 = string5.toString();
        object = new IllegalArgumentException((String)object5);
        throw object;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        bm_1 bm_12 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)bm_12);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = this.E;
        if (n3 != 0) {
            n3 = R$layout.cart_add_address_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.cart_add_address_revamp;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final boolean onOptionsItemSelected(MenuItem object) {
        String string2 = "menuItem";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getItemId();
        int n4 = 16908332;
        if (n3 == n4) {
            object = this.t;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                object.finish();
            }
            return false;
        }
        return super.onOptionsItemSelected((MenuItem)object);
    }

    public final void onResume() {
        super.onResume();
        int n3 = this.D;
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
        Object object = this.H;
        String string3 = ((NewCustomEventsRevamp)object).getSV_EP_DEF_ADD();
        Object object2 = this.l;
        Intrinsics.checkNotNull(object2);
        object2 = String.valueOf(object2.isChecked());
        bundle.putString(string3, (String)object2);
        object = ((NewCustomEventsRevamp)object).getADDRESS_TYPE();
        bundle.putString((String)object, string2);
        object = this.G;
        String string4 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string5 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        object2 = this.H;
        String string6 = this.K;
        String string7 = "address management screen";
        ((NewCustomEventsRevamp)object2).newPushCustomScreenView(string6, string7, string4, bundle, string5);
        object = AnalyticsManager.Companion;
        string3 = "new address screen";
        km_1.a((AnalyticsManager$Companion)object, string3);
        object = this.v;
        n4 = ((Object)object).length;
        string2 = null;
        object2 = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            object[i3] = false;
        }
    }

    public final void onStop() {
        super.onStop();
        String string2 = this.K;
        this.G.setPreviousScreenData(string2, "address management screen");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean bl2;
        Object object;
        lm_2 lm_22 = this;
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.t = object = this.getActivity();
        int n3 = R$id.ajio_loader_view;
        object = (AjioLoaderView)view.findViewById(n3);
        this.u = object;
        n3 = R$id.notification_text;
        object = (TextView)view.findViewById(n3);
        this.j = object;
        n3 = R$id.faaTilName;
        object = (TextInputLayout)view.findViewById(n3);
        this.r = object;
        n3 = R$id.mobile_text_input;
        object = (TextInputLayout)view.findViewById(n3);
        this.s = object;
        n3 = R$id.toolbar_reset;
        object = view.findViewById(n3);
        this.F = object;
        String string2 = "resetView";
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        object.setOnClickListener(lm_22);
        object = lm_22.F;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        int n4 = 0;
        string2 = null;
        object.setEnabled(false);
        n3 = R$id.state_text_input;
        object = (TextInputLayout)object2.findViewById(n3);
        lm_22.p = object;
        n3 = R$id.city_text_input;
        object = (TextInputLayout)object2.findViewById(n3);
        lm_22.o = object;
        n3 = R$id.area_locality_text_input;
        object = object2.findViewById(n3);
        Object object4 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object4);
        Object object5 = object;
        object5 = (TextInputLayout)((Object)object);
        n3 = R$id.flat_building_text_input;
        object = object2.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object4);
        object = (TextInputLayout)((Object)object);
        int n7 = R$id.pincode_text_input;
        Object object6 = (TextInputLayout)object2.findViewById(n7);
        lm_22.q = object6;
        n7 = R$id.area_locality_et;
        object6 = (AjioEditText)object2.findViewById(n7);
        lm_22.k = object6;
        n7 = R$id.flat_building_et;
        object6 = (AjioEditText)object2.findViewById(n7);
        lm_22.f = object6;
        n7 = R$id.landmark_et;
        object6 = (AjioEditText)object2.findViewById(n7);
        lm_22.g = object6;
        n7 = R$id.city_et;
        object6 = (AjioEditText)object2.findViewById(n7);
        lm_22.h = object6;
        n7 = R$id.state_et;
        object6 = (AjioEditText)object2.findViewById(n7);
        lm_22.c = object6;
        n7 = R$id.faaEtName;
        object6 = (AjioEditText)object2.findViewById(n7);
        lm_22.z = object6;
        n7 = R$id.mobile_et;
        object6 = (AjioEditText)object2.findViewById(n7);
        lm_22.e = object6;
        n7 = R$id.pincode_et;
        object6 = (AjioEditText)object2.findViewById(n7);
        lm_22.d = object6;
        n7 = R$id.landmark_text_input;
        object6 = (TextInputLayout)object2.findViewById(n7);
        lm_22.Q = object6;
        this.Wa();
        Object object7 = vz3_0.TEXTINPUTLAYOUTVALIDATORREVAMP;
        object6 = new fv0_2((vz3_0)((Object)object7));
        lm_22.a = object6;
        object6 = lm_22.R;
        n7 = ((String)object6).length();
        if (n7 > 0) {
            object6 = lm_22.d;
            if (object6 != null) {
                object7 = lm_22.R;
                object6.setText((CharSequence)object7);
            }
            object6 = lm_22.R;
            lm_22.Pa((String)object6);
        }
        if ((object6 = (ImageView)object2.findViewById(n7 = R$id.iv_back_click)) != null) {
            object7 = new cm_1(lm_22);
            object6.setOnClickListener((View.OnClickListener)object7);
        }
        n7 = R$id.close_dialog;
        object6 = object2.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object6, (String)object4);
        object6 = (ImageView)object6;
        object4 = new dm_2(lm_22);
        object6.setOnClickListener((View.OnClickListener)object4);
        int n8 = R$id.addresscontainer;
        lm_22.i = object4 = (NestedScrollView)object2.findViewById(n8);
        if (object4 != null) {
            object4 = object4.getChildAt(0);
        } else {
            n8 = 0;
            object4 = null;
        }
        lm_22.w = object4;
        object4 = lm_22.z;
        object6 = lm_22.Z;
        if (object4 != null) {
            object4.setOnFocusChangeListener((View.OnFocusChangeListener)object6);
        }
        if ((object4 = lm_22.c) != null) {
            object4.setOnFocusChangeListener((View.OnFocusChangeListener)object6);
        }
        if ((object4 = lm_22.d) != null) {
            object4.setOnFocusChangeListener((View.OnFocusChangeListener)object6);
        }
        if ((object4 = lm_22.e) != null) {
            object4.setOnFocusChangeListener((View.OnFocusChangeListener)object6);
        }
        if ((object4 = lm_22.f) != null) {
            object4.setOnFocusChangeListener((View.OnFocusChangeListener)object6);
        }
        if ((object4 = lm_22.g) != null) {
            object4.setOnFocusChangeListener((View.OnFocusChangeListener)object6);
        }
        if ((object4 = lm_22.k) != null) {
            object4.setOnFocusChangeListener((View.OnFocusChangeListener)object6);
        }
        if ((object4 = lm_22.h) != null) {
            object4.setOnFocusChangeListener((View.OnFocusChangeListener)object6);
        }
        n8 = R$id.checkBox;
        object4 = (CheckBox)object2.findViewById(n8);
        lm_22.l = object4;
        object4 = lm_22.a;
        Intrinsics.checkNotNull(object4);
        object6 = lm_22.z;
        object7 = lm_22.r;
        Object object8 = hv3_0.K(R$string.name_error_msg);
        ((fv0_2)object4).c((EditText)object6, (TextInputLayout)((Object)object7), (String)object8);
        Object object9 = lm_22.a;
        Intrinsics.checkNotNull(object9);
        object4 = fa3_2.REGEX;
        Object object10 = lm_22.z;
        Object object11 = lm_22.r;
        String string3 = hv3_0.K(R$string.name_error_msg);
        Object object12 = object4;
        ((fv0_2)object9).a((fa3_2)((Object)object4), (EditText)object10, (TextInputLayout)((Object)object11), "^[ A-Za-z]+$", string3);
        object6 = lm_22.a;
        Intrinsics.checkNotNull(object6);
        object7 = lm_22.e;
        object8 = lm_22.s;
        object9 = hv3_0.K(R$string.phone_error_msg);
        ((fv0_2)object6).c((EditText)object7, (TextInputLayout)((Object)object8), (String)object9);
        object12 = lm_22.a;
        Intrinsics.checkNotNull(object12);
        object10 = lm_22.d;
        object11 = lm_22.q;
        string3 = hv3_0.K(R$string.pin_code_error_msg);
        int n10 = 6;
        ((fv0_2)object12).e((EditText)object10, (TextInputLayout)((Object)object11), "", string3, false, n10);
        object6 = lm_22.a;
        Intrinsics.checkNotNull(object6);
        object7 = lm_22.h;
        object8 = lm_22.o;
        object9 = hv3_0.K(R$string.city_error_msg);
        ((fv0_2)object6).c((EditText)object7, (TextInputLayout)((Object)object8), (String)object9);
        object6 = lm_22.a;
        Intrinsics.checkNotNull(object6);
        object7 = lm_22.c;
        object8 = lm_22.p;
        int n14 = R$string.state_error_msg;
        object9 = hv3_0.K(n14);
        ((fv0_2)object6).c((EditText)object7, (TextInputLayout)((Object)object8), (String)object9);
        object6 = lm_22.a;
        Intrinsics.checkNotNull(object6);
        object7 = lm_22.k;
        int n15 = R$string.locality_area_error_msg;
        object9 = hv3_0.K(n15);
        boolean bl3 = true;
        ((fv0_2)object6).e((EditText)object7, (TextInputLayout)((Object)object5), "^[\\x00-\\x7F]+$", (String)object9, bl3, 0);
        object8 = lm_22.a;
        Intrinsics.checkNotNull(object8);
        object9 = lm_22.f;
        n7 = R$string.flat_error_msg;
        object11 = hv3_0.K(n7);
        boolean bl4 = true;
        object12 = object;
        ((fv0_2)object8).e((EditText)object9, (TextInputLayout)((Object)object), "^[\\x00-\\x7F]+$", (String)object11, bl4, 0);
        object12 = lm_22.a;
        Intrinsics.checkNotNull(object12);
        object11 = lm_22.g;
        TextInputLayout textInputLayout = lm_22.Q;
        n3 = R$string.landmark_error_msg;
        String string4 = hv3_0.K(n3);
        string3 = "(^[ A-Za-z]+$)|(^$)";
        object10 = object4;
        ((fv0_2)object12).a((fa3_2)((Object)object4), (EditText)object11, textInputLayout, string3, string4);
        object = lm_22.d;
        if (object != null) {
            object4 = lm_22.q0;
            object.addTextChangedListener((TextWatcher)object4);
        }
        n3 = R$id.faaLayoutAddressType;
        object2.findViewById(n3).setVisibility(0);
        n3 = R$id.faaRgAddressType;
        object = (RadioGroup)object2.findViewById(n3);
        lm_22.A = object;
        n3 = R$id.faaTilAddressType;
        object = (TextInputLayout)object2.findViewById(n3);
        lm_22.B = object;
        n4 = 8;
        if (object != null) {
            object.setVisibility(n4);
        }
        n3 = R$id.faaEtAddressType;
        object = (AjioEditText)object2.findViewById(n3);
        lm_22.C = object;
        object = lm_22.A;
        if (object != null) {
            object4 = lm_22.p0;
            object.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener)object4);
        }
        n3 = R$id.add_address_btn_save;
        object2.findViewById(n3).setOnClickListener((View.OnClickListener)lm_22);
        object2 = lm_22.x;
        Intrinsics.checkNotNull(object2);
        object2 = ((h5_0)object2).c;
        object = this.getViewLifecycleOwner();
        object4 = new ul_2(lm_22, 0);
        object6 = new lM$d((Function1)object4);
        ((LiveData)object2).e((mu1_1)object, (F62)object6);
        object2 = lm_22.x;
        Intrinsics.checkNotNull(object2);
        object2 = ((h5_0)object2).i;
        object = this.getViewLifecycleOwner();
        n7 = 0;
        object4 = new vl_2(lm_22, 0);
        object6 = new lM$d((Function1)object4);
        ((LiveData)object2).e((mu1_1)object, (F62)object6);
        object2 = lm_22.x;
        Intrinsics.checkNotNull(object2);
        object2 = ((h5_0)object2).j;
        object = this.getViewLifecycleOwner();
        object4 = new wl_2(lm_22);
        ((LiveData)object2).e((mu1_1)object, (F62)object4);
        object2 = lm_22.T;
        if (object2 == null) {
            object2 = "cartViewModel";
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object3 = object2;
        }
        object2 = ((wx1_1)object3).v;
        object = this.getViewLifecycleOwner();
        object3 = new xl_2(lm_22, 0);
        object4 = new lM$d((Function1)object3);
        ((LiveData)object2).e((mu1_1)object, (F62)object4);
        object2 = lm_22.x;
        Intrinsics.checkNotNull(object2);
        object2 = ((h5_0)object2).k;
        object = this.getViewLifecycleOwner();
        n8 = 0;
        object3 = new yl_2(lm_22, 0);
        object4 = new lM$d((Function1)object3);
        ((LiveData)object2).e((mu1_1)object, (F62)object4);
        object2 = lm_22.y;
        if (object2 != null && (object2 = ((hy3_0)object2).w) != null) {
            object = this.getViewLifecycleOwner();
            n8 = 0;
            object3 = new zl_2(lm_22, 0);
            object4 = new lM$d((Function1)object3);
            ((LiveData)object2).e((mu1_1)object, (F62)object4);
        }
        if ((bl2 = h40_0.Q1()) && (object2 = lm_22.l) != null) {
            object2.setVisibility(n4);
        }
    }

    public final void showNotification(String string2, String string3) {
        Object object;
        int n3;
        if (string2 == null) {
            return;
        }
        Object object2 = this.j;
        if (object2 == null) {
            string3 = this.getLayoutInflater();
            int n4 = R$layout.layout_toast;
            string3 = string3.inflate(n4, null);
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
        int n7 = 0;
        cp_1 cp_12 = null;
        string2 = new TranslateAnimation(0.0f, 0.0f, f5, 0.0f);
        object2 = cp_1.Companion;
        int n8 = km_1.b((cp$a)object2);
        n8 = n8 != 0 ? hv3_0.w(R$integer.notification_anim_delay_accesibility) : hv3_0.w(R$integer.notification_anim_delay);
        cp_12 = cp$a.e();
        cp_12.getClass();
        n7 = cp_1.f();
        n7 = n7 != 0 ? hv3_0.w(R$integer.notification_anim_post_release_delay_accesibility) : hv3_0.w(R$integer.notification_anim_post_release_delay);
        long l2 = n8;
        string2.setDuration(l2);
        object2 = this.j;
        if (object2 != null) {
            n3 = 0;
            object = null;
            object2.setVisibility(0);
        }
        object = Looper.getMainLooper();
        object2 = new Handler(object);
        object = new am_1(this, string3);
        long l3 = 100;
        object2.postDelayed((Runnable)object, l3);
        string3 = this.j;
        if (string3 != null) {
            n3 = 1;
            object2 = new ov_0(this, n3);
            long l4 = n7;
            string3.postDelayed((Runnable)object2, l4);
        }
        if ((string3 = this.j) != null) {
            string3.startAnimation((Animation)string2);
        }
    }

    public final void z9() {
        boolean bl2;
        lm_2 lm_22 = this;
        Object object = new StringBuilder();
        Object object2 = this.O;
        String string2 = h30_0.a((StringBuilder)object, (String)object2, " reset");
        object = new StringBuilder();
        object2 = this.N;
        String string3 = "_reset";
        String string4 = h30_0.a((StringBuilder)object, (String)object2, string3);
        String string5 = this.L;
        String string6 = this.K;
        int n3 = 1536;
        NewCustomEventsRevamp newCustomEventsRevamp = this.H;
        String string7 = "";
        String string8 = "address management screen";
        String string9 = this.I;
        String string10 = this.J;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string5, string2, string7, string4, string6, string8, string9, null, string10, false, null, n3, null);
        this.Y = "";
        object = this.n;
        if (object == null) {
            object = this.a;
            Intrinsics.checkNotNull(object);
            ((fv0_2)object).a.e();
            object = new CartDeliveryAddress();
            this.Ua((CartDeliveryAddress)object);
            this.Wa();
        } else {
            this.Ua((CartDeliveryAddress)object);
        }
        object = lm_22.z;
        Intrinsics.checkNotNull(object);
        object.requestFocus();
        object = lm_22.F;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resetView");
            bl2 = false;
            object = null;
        }
        object2 = null;
        object.setEnabled(false);
        object = this.getActivity();
        if (object != null && !(bl2 = (object = this.requireActivity()).isFinishing())) {
            object = this.requireActivity().getSystemService("input_method");
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            object = (InputMethodManager)object;
            object2 = lm_22.z;
            int n4 = 1;
            object.showSoftInput((View)object2, n4);
        }
        object = new Handler();
        object2 = new em_2(lm_22, 0);
        object.postDelayed((Runnable)object2, 200L);
    }
}

