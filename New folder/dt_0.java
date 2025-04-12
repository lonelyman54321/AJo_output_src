/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import com.ril.ajio.payment.view.PaymentActivity;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Login.CustomerType;
import com.ril.ajio.services.data.user.LocationData;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from DT
 */
public final class dt_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ dt_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        int n3;
        int n4 = 0;
        Object object2 = null;
        Object object3 = null;
        Object object4 = "this$0";
        Fragment fragment = this.b;
        int n7 = 1;
        int n8 = this.a;
        object = (DataCallback)object;
        switch (n8) {
            default: {
                fragment = (NewProductDetailsFragment)fragment;
                Intrinsics.checkNotNullParameter(fragment, (String)object4);
                object4 = cp_1.Companion;
                int n10 = nn_2.b((cp$a)object4, (DataCallback)object);
                if (n10 == 0) return Unit.a;
                n10 = ((DataCallback)object).getStatus();
                if (n10 == 0) {
                    if ((object = (CustomerType)((DataCallback)object).getData()) == null) return Unit.a;
                    object4 = ((NewProductDetailsFragment)fragment).Wa();
                    String string2 = ((CustomerType)object).getCustomerType();
                    ((jo_2)object4).q(string2);
                    object4 = ((NewProductDetailsFragment)fragment).k;
                    if (object4 == null) {
                        object4 = "homeListener";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    } else {
                        object2 = object4;
                    }
                    object2.u0(n7 != 0);
                    object2 = z40_0.Companion;
                    object4 = (Application)((NewProductDetailsFragment)fragment).C.getValue();
                    Object object5 = "<get-application>(...)";
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                    object2.getClass();
                    object2 = z40$a.a((Context)object4).a;
                    object4 = "enable_locale";
                    n4 = (int)(((ao0_0)object2).a((String)object4) ? 1 : 0);
                    if (n4 != 0) {
                        object2 = ((CustomerType)object).getPincode();
                        n4 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                        if (n4 == 0) {
                            String string3 = ((CustomerType)object).getCity();
                            String string4 = ((CustomerType)object).getState();
                            String string5 = ((CustomerType)object).getZone();
                            String string6 = ((CustomerType)object).getPincode();
                            n8 = 101;
                            object5 = object2;
                            object2 = new LocationData(n8, string3, string4, string5, string6);
                            ((NewProductDetailsFragment)fragment).Wa().r((LocationData)object2);
                            object = ((LocationData)object2).getPincode();
                            ((NewProductDetailsFragment)fragment).n6((String)object);
                            return Unit.a;
                        } else {
                            ((NewProductDetailsFragment)fragment).p = false;
                        }
                        return Unit.a;
                    } else {
                        ((NewProductDetailsFragment)fragment).p = false;
                    }
                    return Unit.a;
                } else {
                    int n14 = ((DataCallback)object).getStatus();
                    if (n14 != n7) return Unit.a;
                    ((NewProductDetailsFragment)fragment).p = false;
                }
                return Unit.a;
            }
            case 0: 
        }
        fragment = (CheckoutFragment)fragment;
        Intrinsics.checkNotNullParameter(fragment, (String)object4);
        object4 = cp_1.Companion;
        int n15 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n15 == 0) return Unit.a;
        ((CheckoutFragment)fragment).h();
        n15 = ((DataCallback)object).getStatus();
        if (n15 == 0) {
            block24: {
                object3 = ((CheckoutFragment)fragment).Qa();
                object = ((DataCallback)object).getData();
                object = JsonUtils.toJson(object);
                if (object == null) break block24;
                object3.getClass();
                object4 = "\\\\u0026";
                object2 = new Regex((String)object4);
                object4 = "&";
                object2 = ((Regex)object2).replace((CharSequence)object, (String)object4);
            }
            try {
                ((kj2_1)object3).D = object2;
            }
            catch (Exception exception) {
                object2 = yn3_0.a;
                ((yn3$a)object2).e(exception);
            }
            ((CheckoutFragment)fragment).Oa();
            return Unit.a;
        }
        n4 = ((DataCallback)object).getStatus();
        if (n4 != n7) return Unit.a;
        object2 = ((DataCallback)object).getError();
        object4 = "";
        if (object2 != null && (object2 = ((DataError)object2).getErrors()) != null) {
            object2 = ((Iterable)object2).iterator();
            while ((n8 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                String string7;
                boolean bl2;
                Object object6 = (DataError$ErrorMessage)object2.next();
                object4 = Ex0.a((String)object4);
                String string8 = ((DataError$ErrorMessage)object6).getMessage();
                ((StringBuilder)object4).append(string8);
                ((StringBuilder)object4).append(" ");
                object4 = ((StringBuilder)object4).toString();
                string8 = ((DataError$ErrorMessage)object6).getType();
                if (string8 == null || !(bl2 = kotlin.text.b.i(string8 = ((DataError$ErrorMessage)object6).getType(), string7 = "CartError", n7 != 0)) || (string8 = ((DataError$ErrorMessage)object6).getSubjectType()) == null || !(bl2 = kotlin.text.b.i(string8 = ((DataError$ErrorMessage)object6).getSubjectType(), string7 = "cart", n7 != 0)) || (string8 = ((DataError$ErrorMessage)object6).getReason()) == null || (n8 = (int)(kotlin.text.b.i((String)(object6 = ((DataError$ErrorMessage)object6).getReason()), string8 = "notFound", n7 != 0) ? 1 : 0)) == 0) continue;
                object = ((CheckoutFragment)fragment).y;
                if (object == null) return Unit.a;
                boolean bl3 = object.isFinishing();
                if (bl3) return Unit.a;
                object = ((CheckoutFragment)fragment).y;
                if (object != null) {
                    ((PaymentActivity)object).w0 = n7;
                }
                if (object == null) return Unit.a;
                ((PaymentActivity)object).onBackPressed();
                return Unit.a;
            }
        }
        if ((object2 = fragment.getActivity()) == null) return Unit.a;
        n4 = (int)(object2.isFinishing() ? 1 : 0);
        if (n4 != 0) return Unit.a;
        if ((object = ((DataCallback)object).getError()) != null && (n3 = ((DataError)object).isException) == n7 || (n3 = TextUtils.isEmpty((CharSequence)(object = ((Object)StringsKt.m0((CharSequence)object4)).toString()))) != 0) {
            n3 = R$string.something_wrong_msg;
            object4 = hv3_0.K(n3);
        }
        object = StringCompanionObject.INSTANCE;
        n3 = R$string.acc_error_message;
        object = hv3_0.K(n3);
        object2 = new Object[n7];
        object2[0] = object4;
        object3 = "format(...)";
        object = xh2_0.a((Object[])object2, n7, (String)object, (String)object3);
        object2 = (PaymentActivity)fragment.getActivity();
        if (object2 == null) return Unit.a;
        ((PaymentActivity)object2).showNotification((String)object4, (String)object);
        return Unit.a;
    }
}

