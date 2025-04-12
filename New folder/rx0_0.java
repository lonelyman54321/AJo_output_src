/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 */
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.SimpleStringData;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Rx0
 */
public final class rx0_0
implements F62 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ rx0_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onChanged(Object object) {
        Object object2 = "format(...)";
        Object object3 = "";
        Object object4 = null;
        Object object5 = "this$0";
        Fragment fragment = this.b;
        int n3 = 1;
        int n4 = this.a;
        object = (DataCallback)object;
        switch (n4) {
            default: {
                int n7;
                fragment = (lz1_2)fragment;
                Intrinsics.checkNotNullParameter(fragment, (String)object5);
                object5 = ((lz1_2)fragment).i;
                if (object5 != null) {
                    object5.stopLoader();
                }
                if ((n7 = nn_2.b((cp$a)(object5 = cp_1.Companion), (DataCallback)object)) != 0 && object != null && (n7 = ((DataCallback)object).getStatus()) == 0) {
                    ((lz1_2)fragment).g = object = (AccountCheckResponse)((DataCallback)object).getData();
                    if (object != null) {
                        Intrinsics.checkNotNull(object);
                        boolean bl2 = ((AccountCheckResponse)object).isSuccess();
                        if (!bl2) {
                            object = ((lz1_2)fragment).F;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("referralCodeETV");
                                bl2 = false;
                                object = null;
                            }
                            if ((object = ((AppCompatEditText)object).getText()) != null) {
                                object4 = object.toString();
                            }
                            bv1_0.a = object4;
                            object = ((lz1_2)fragment).Qa();
                            object2 = new Bundle();
                            object2.putBoolean("ISFROMSOCIALLOGIN", false);
                            object2.putBoolean("ISMANUALSIGNUP", n3 != 0);
                            object2.putBoolean("ISEXISTINGUSER", false);
                            object4 = ((lz1_2)fragment).g;
                            object2.putSerializable("ACCOUNTCHECK_RESPONSE", (Serializable)object4);
                            object2.putParcelable("QUERYCUSTOMER_DATA", (Parcelable)object);
                            boolean bl3 = ((lz1_2)fragment).h;
                            object2.putBoolean("ISINPUTMOBILENUMBER", bl3);
                            da1_1.Companion.getClass();
                            object = da1$a_0.a((Bundle)object2);
                            object2 = ((lz1_2)fragment).i;
                            Intrinsics.checkNotNull(object2);
                            object3 = "SignInOTPFragment";
                            object2.Z0((Fragment)object, (String)object3);
                        } else {
                            object = ((lz1_2)fragment).g;
                            Intrinsics.checkNotNull(object);
                            bl2 = ((AccountCheckResponse)object).isSocialLogin();
                            if (bl2) {
                                object = ((lz1_2)fragment).i;
                                if (object != null) {
                                    object.startLoader();
                                }
                                object = new QueryCustomer();
                                boolean bl4 = ((lz1_2)fragment).h;
                                if (bl4) {
                                    object2 = ((lz1_2)fragment).v;
                                    if (object2 != null) {
                                        object2 = ((String)object2).toLowerCase();
                                        object4 = "toLowerCase(...)";
                                        Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                                        if (object2 != null) {
                                            object3 = object2;
                                        }
                                    }
                                    ((QueryCustomer)object).setEmail((String)object3);
                                    ((QueryCustomer)object).setMobileNumberEnterered(false);
                                } else {
                                    object2 = ((lz1_2)fragment).u;
                                    ((QueryCustomer)object).setMobileNumber((String)object2);
                                    ((QueryCustomer)object).setMobileNumberEnterered(n3 != 0);
                                }
                                object2 = ((lz1_2)fragment).C;
                                Intrinsics.checkNotNull(object2);
                                object2.getClass();
                                Intrinsics.checkNotNullParameter(object, "<set-?>");
                                ((oa1_1)object2).C = object;
                                object2 = ((lz1_2)fragment).C;
                                Intrinsics.checkNotNull(object2);
                                object3 = "signup screen";
                                ((oa1_1)object2).k((QueryCustomer)object, (String)object3);
                            } else {
                                object = h40_0.a;
                                object = h40_0.R().getAccount_check_api_error_msg();
                                uy1_0.d((String)object);
                                object3 = StringCompanionObject.INSTANCE;
                                int n8 = R$string.acc_error_message;
                                object3 = hv3_0.K(n8);
                                object4 = new Object[n3];
                                object4[0] = object;
                                object2 = xh2_0.a(object4, n3, (String)object3, (String)object2);
                                hv3_0.o0(0, (String)object, (String)object2);
                            }
                        }
                    }
                }
                return;
            }
            case 0: 
        }
        fragment = (sx0_1)fragment;
        Intrinsics.checkNotNullParameter(fragment, (String)object5);
        object5 = cp_1.Companion;
        int n10 = nn_2.b((cp$a)object5, (DataCallback)object);
        if (n10 != 0) {
            n10 = ((DataCallback)object).getStatus();
            if (n10 == 0) {
                if ((object = (SimpleStringData)((DataCallback)object).getData()) != null) {
                    n10 = ((SimpleStringData)object).getStatusCode();
                    fragment.getClass();
                    n4 = 200;
                    if (n10 == n4) {
                        ((BottomSheetDialogFragment)fragment).dismiss();
                        object = new Bundle();
                        object5 = "signout";
                        object.putString("page_name", (String)object5);
                        object.putString("page_url", (String)object5);
                        v31.a();
                        object2 = ((sx0_1)fragment).m;
                        if (object2 != null) {
                            object5 = "BZ1";
                            n4 = 11;
                            object2.onFragmentInteraction((String)object5, n4, (Bundle)object);
                        }
                        object = ((sx0_1)fragment).h;
                        ((hy3_0)((D)object).getValue()).q();
                        kx3_0.a = n3;
                        kx3_0.b = null;
                        kx3_0.c = n3;
                        tj2_2.Companion.getClass();
                        object2 = tj2$a_0.a();
                        object2.getClass();
                        Intrinsics.checkNotNullParameter(object3, "pincode");
                        ((tj2_2)object2).a = object3;
                        object2 = ((sx0_1)fragment).g;
                        ((jo_2)((hh3_2)object2).getValue()).putPreference("LOCATION_DATA", (String)object3);
                        ((hy3_0)((D)object).getValue()).g();
                        object5 = (jo_2)((hh3_2)object2).getValue();
                        String string2 = "closet_card_in_home";
                        ((sw_0)object5).removePreference(string2);
                        ((b52_0)((sx0_1)fragment).i.getValue()).b();
                        object5 = (hy3_0)((D)object).getValue();
                        ((hy3_0)object5).e();
                        ((hy3_0)((D)object).getValue()).d();
                        ((jo_2)((hh3_2)object2).getValue()).B();
                        ((jo_2)((hh3_2)object2).getValue()).q((String)object3);
                        object = ((sx0_1)fragment).j;
                        if (object != null) {
                            object.u0(false);
                        }
                        if ((object = ((sx0_1)fragment).j) != null) {
                            object.x(false);
                        }
                        vl0_0.a = false;
                        vl0_0.b = null;
                        bv1_0.a = null;
                        bv1_0.b = null;
                        bv1_0.c = null;
                        bv1_0.d = false;
                        bv1_0.h = false;
                        bv1_0.e = null;
                        bv1_0.f = null;
                        bv1_0.g = false;
                        object = ((sx0_1)fragment).l;
                        if (object != null) {
                            object.G();
                        }
                        ((BottomSheetDialogFragment)fragment).dismiss();
                        object = fragment.getActivity();
                        if (object != null) {
                            ((ComponentActivity)object).onBackPressed();
                        }
                    } else {
                        object3 = ((SimpleStringData)object).getMessage();
                        int n14 = TextUtils.isEmpty((CharSequence)object3);
                        if (n14 == 0) {
                            object3 = StringCompanionObject.INSTANCE;
                            n14 = R$string.acc_alert_message;
                            object3 = hv3_0.K(n14);
                            object4 = ((SimpleStringData)object).getMessage();
                            object5 = new Object[n3];
                            object5[0] = object4;
                            object2 = xh2_0.a((Object[])object5, n3, (String)object3, (String)object2);
                            object = ((SimpleStringData)object).getMessage();
                            object3 = "getMessage(...)";
                            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                            mq0_2.d((String)object, (String)object2);
                        } else {
                            object = StringCompanionObject.INSTANCE;
                            int n15 = R$string.acc_error_message;
                            object = hv3_0.K(n15);
                            n14 = R$string.pwd_not_able_to_update;
                            object3 = hv3_0.K(n14);
                            object4 = new Object[n3];
                            object4[0] = object3;
                            object = xh2_0.a(object4, n3, (String)object, (String)object2);
                            int n16 = R$string.pwd_not_able_to_update;
                            sx0_1.Oa(n16, (String)object);
                        }
                    }
                } else {
                    object = StringCompanionObject.INSTANCE;
                    int n17 = R$string.acc_error_message;
                    object = hv3_0.K(n17);
                    int n18 = R$string.pwd_not_able_to_update;
                    object3 = hv3_0.K(n18);
                    object4 = new Object[n3];
                    object4[0] = object3;
                    object = xh2_0.a(object4, n3, (String)object, (String)object2);
                    int n19 = R$string.pwd_not_able_to_update;
                    fragment.getClass();
                    sx0_1.Oa(n19, (String)object);
                }
            } else {
                int n20 = ((DataCallback)object).getStatus();
                if (n20 == n3) {
                    object = StringCompanionObject.INSTANCE;
                    n20 = R$string.acc_error_message;
                    object = hv3_0.K(n20);
                    int n21 = R$string.pwd_not_able_to_update;
                    object3 = hv3_0.K(n21);
                    object4 = new Object[n3];
                    object4[0] = object3;
                    object = xh2_0.a(object4, n3, (String)object, (String)object2);
                    int n22 = R$string.pwd_not_able_to_update;
                    fragment.getClass();
                    sx0_1.Oa(n22, (String)object);
                }
            }
        }
    }
}

