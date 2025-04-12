/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 */
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.login.activity.LoginActivityRevamp;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import com.ril.ajio.view.BaseSplitActivity;
import java.util.AbstractCollection;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Yx1
 */
public final class yx1_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yx1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        Object object2 = null;
        Object object3 = "this$0";
        Object object4 = this.b;
        Object object5 = null;
        int n4 = 1;
        int n7 = this.a;
        object = (DataCallback)object;
        switch (n7) {
            default: {
                object4 = (ex1_0)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                object3 = cp_1.Companion;
                int n8 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (n8 != 0) {
                    Intrinsics.checkNotNull(object);
                    n8 = ((DataCallback)object).getStatus();
                    if (n8 == 0) {
                        object = (Cart)((DataCallback)object).getData();
                        object3 = ((ex1_0)object4).t;
                        if (object3 == null) {
                            object3 = "cartViewModel";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        } else {
                            object2 = object3;
                        }
                        ((wx1_1)object2).S0 = object;
                        if (object != null && (object = ((Cart)object).getRestoredProducts()) != null) {
                            ((ex1_0)object4).S0 = object;
                        }
                        ((ex1_0)object4).p0 = n4;
                        ap_0.a.removeCartGuId();
                        ((ex1_0)object4).sb(false);
                        object = ((ex1_0)object4).J;
                        if (object != null) {
                            ai0_2.a((View)object);
                        }
                    } else {
                        n8 = ((DataCallback)object).getStatus();
                        if (n8 == n4) {
                            ((ex1_0)object4).Xa();
                            ((AbstractCollection)((ex1_0)object4).Y).clear();
                            ((AbstractCollection)((ex1_0)object4).X).clear();
                            object3 = ((DataCallback)object).getError();
                            if (object3 != null && (object3 = object3.getErrorMessage()) != null) {
                                object2 = object3.getType();
                            }
                            if ((n3 = Intrinsics.areEqual(object3 = "FraudUserError", object2)) != 0) {
                                ((ex1_0)object4).Ya((DataCallback)object);
                            } else {
                                ((ex1_0)object4).tb();
                                object = ((DataCallback)object).getError();
                                ((ex1_0)object4).Ua((DataError)object);
                            }
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        Object object6 = LoginActivityRevamp.Companion;
        object4 = (LoginActivityRevamp)object4;
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object3 = cp_1.Companion;
        int n10 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n10 != 0) {
            if (object != null && (n10 = ((DataCallback)object).getStatus()) == 0) {
                int n14;
                ((LoginActivityRevamp)object4).E0 = object = (AccountCheckResponse)((DataCallback)object).getData();
                object3 = "loginViewModel";
                if (object != null && (n14 = ((AccountCheckResponse)object).isSuccess()) == n4) {
                    object = ((LoginActivityRevamp)object4).q0;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        n14 = 0;
                        object = null;
                    }
                    object5 = ((LoginActivityRevamp)object4).E0;
                    Object object7 = ((BaseSplitActivity)object4).getAppPreferences();
                    Object object8 = "";
                    object7 = ((sw_0)object7).getPreference("FACEBOOK_PROFILE_ACCESS_TOKEN", (String)object8);
                    object6 = ((BaseSplitActivity)object4).getAppPreferences().g();
                    Object object9 = ((BaseSplitActivity)object4).getAppPreferences();
                    String string2 = "GOOGLE_PROFILE_ACCESS_TOKEN";
                    object8 = ((sw_0)object9).getPreference(string2, (String)object8);
                    object = ((oa1_1)object).d((AccountCheckResponse)object5, (String)object7, (String)object6, (String)object8);
                    object5 = ((xs3_0)object).a;
                    object6 = object5;
                    object6 = (String)object5;
                    object8 = object5 = ((xs3_0)object).b;
                    object8 = (String)object5;
                    object9 = object = ((xs3_0)object).c;
                    object9 = (String)object;
                    Intrinsics.checkNotNullParameter(object8, "loginvia");
                    object = ((LoginActivityRevamp)object4).q0;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        n4 = 0;
                        object7 = null;
                    } else {
                        object7 = object;
                    }
                    string2 = ((BaseSplitActivity)object4).getAppPreferences().h();
                    String string3 = ((BaseSplitActivity)object4).getAppPreferences().a();
                    object = ((oa1_1)object7).g((String)object6, (String)object8, (String)object9, string2, string3);
                    if (object != null) {
                        object4 = ((LoginActivityRevamp)object4).q0;
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        } else {
                            object2 = object4;
                        }
                        object3 = "login/signup screen";
                        ((oa1_1)object2).l((QueryCustomer)object, (String)object3);
                    }
                } else {
                    ((LoginActivityRevamp)object4).stopLoader();
                    object = ((LoginActivityRevamp)object4).q0;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    } else {
                        object2 = object;
                    }
                    object = ((LoginActivityRevamp)object4).y0;
                    object3 = ((BaseSplitActivity)object4).getAppPreferences().g();
                    object2.getClass();
                    object = oa1_1.c((String)object, (String)object3);
                    object2 = ga1_0.Companion;
                    object3 = (String)((Pair)object).a;
                    n14 = (int)(((Boolean)((Pair)object).b).booleanValue() ? 1 : 0);
                    object2.getClass();
                    object2 = "param1";
                    Intrinsics.checkNotNullParameter(object3, (String)object2);
                    object5 = new ga1_0();
                    Bundle bundle = new Bundle();
                    bundle.putString((String)object2, (String)object3);
                    object2 = "param2";
                    bundle.putBoolean((String)object2, n14 != 0);
                    ((Fragment)object5).setArguments(bundle);
                    object = "SocialLoginMobileNumberFragment";
                    ((LoginActivityRevamp)object4).Z0((Fragment)object5, (String)object);
                }
            } else {
                n10 = ((DataCallback)object).getStatus();
                if (n10 == n4) {
                    ((LoginActivityRevamp)object4).stopLoader();
                    object = ((DataCallback)object).getError();
                    if (object != null && (object3 = ((DataError)object).getErrorMessage()) != null) {
                        object3 = object3.getMessage();
                    } else {
                        n10 = 0;
                        object3 = null;
                    }
                    n10 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                    object4 = "format(...)";
                    if (n10 == 0) {
                        if (object != null && (object = ((DataError)object).getErrorMessage()) != null && (object = ((DataError$ErrorMessage)object).getMessage()) != null) {
                            object2 = StringCompanionObject.INSTANCE;
                            n3 = R$string.acc_error_message;
                            object2 = hv3_0.K(n3);
                            object3 = new Object[n4];
                            object3[0] = object;
                            object2 = xh2_0.a(object3, n4, (String)object2, (String)object4);
                            hv3_0.o0(0, (String)object, (String)object2);
                        }
                    } else {
                        if (object != null) {
                            object2 = ((DataError)object).getErrors();
                        }
                        if (object2 != null && (n3 = (object2 = ((DataError)object).getErrors()).size()) > 0) {
                            object2 = StringCompanionObject.INSTANCE;
                            n3 = R$string.acc_error_message;
                            object2 = hv3_0.K(n3);
                            object3 = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                            object6 = new Object[n4];
                            object6[0] = object3;
                            object2 = xh2_0.a(object6, n4, (String)object2, (String)object4);
                            object = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                            object3 = "getMessage(...)";
                            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                            hv3_0.o0(0, (String)object, (String)object2);
                        }
                    }
                }
            }
        }
        return Unit.a;
    }
}

