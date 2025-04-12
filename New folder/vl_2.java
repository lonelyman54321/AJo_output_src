/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Address.PostalCheck;
import com.ril.ajio.services.data.Order.orderhistory.OrderHistory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from VL
 */
public final class vl_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vl_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        Object object2 = null;
        int n4 = 0;
        String string2 = null;
        int n7 = 1;
        Object object3 = this.b;
        Object object4 = "this$0";
        int n8 = this.a;
        object = (DataCallback)object;
        switch (n8) {
            default: {
                object3 = (wx1_1)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                ((wx1_1)object3).R.k(object);
                return Unit.a;
            }
            case 1: {
                object3 = (e00)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                object2 = cp_1.Companion;
                n3 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n3 != 0) {
                    Intrinsics.checkNotNull(object);
                    n3 = ((DataCallback)object).getStatus();
                    if (n3 == 0) {
                        object = (OrderHistory)((DataCallback)object).getData();
                        object2 = ((e00)object3).A;
                        if (object2 != null) {
                            ((LiveData)object2).k(object);
                        }
                    } else {
                        int n10 = ((DataCallback)object).getStatus();
                        if (n10 == n7 && (object = ((e00)object3).A) != null) {
                            ((LiveData)object).k(null);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object3 = (lm_2)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        object4 = cp_1.Companion;
        int n14 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n14 != 0) {
            object4 = ((lm_2)object3).u;
            if (object4 != null) {
                ((AjioLoaderView)((Object)object4)).stopLoader();
            }
            Intrinsics.checkNotNull(object);
            n14 = ((DataCallback)object).getStatus();
            if (n14 == 0) {
                AjioEditText ajioEditText;
                TextInputLayout textInputLayout;
                object = (PostalCheck)((DataCallback)object).getData();
                Intrinsics.checkNotNull(object);
                object4 = ((PostalCheck)object).getDistrict();
                object = ((PostalCheck)object).getState();
                n8 = object4 != null && (n8 = ((String)object4).length()) > 0 ? 1 : 0;
                AjioEditText ajioEditText2 = ((lm_2)object3).h;
                if (ajioEditText2 != null && (textInputLayout = ((lm_2)object3).o) != null) {
                    if (n8 != 0) {
                        Intrinsics.checkNotNull(ajioEditText2);
                        ajioEditText2.setText((CharSequence)object4);
                        object4 = ((lm_2)object3).o;
                        Intrinsics.checkNotNull(object4);
                        ((TextInputLayout)((Object)object4)).setError(null);
                    } else {
                        Intrinsics.checkNotNull(ajioEditText2);
                        ajioEditText2.setText((CharSequence)object4);
                    }
                }
                if (object != null && (n14 = ((String)object).length()) > 0) {
                    n3 = 1;
                }
                if ((ajioEditText = ((lm_2)object3).c) != null && (object4 = ((lm_2)object3).p) != null && (object4 = ((lm_2)object3).q) != null) {
                    if (n3 != 0) {
                        Intrinsics.checkNotNull(ajioEditText);
                        ajioEditText.setText((CharSequence)object);
                        object = ((lm_2)object3).p;
                        Intrinsics.checkNotNull(object);
                        ((TextInputLayout)((Object)object)).setError(null);
                    } else {
                        Intrinsics.checkNotNull(ajioEditText);
                        ajioEditText.setText((CharSequence)object);
                    }
                    if (n8 != 0 && n3 != 0) {
                        object = ((lm_2)object3).q;
                        Intrinsics.checkNotNull(object);
                        ((TextInputLayout)((Object)object)).setError(null);
                    } else {
                        object = ((lm_2)object3).q;
                        Intrinsics.checkNotNull(object);
                        n3 = R$string.enter_valid_pincode;
                        object2 = ((Fragment)object3).getString(n3);
                        ((TextInputLayout)((Object)object)).setError((CharSequence)object2);
                    }
                }
            } else {
                int n15 = ((DataCallback)object).getStatus();
                if (n15 == n7) {
                    object = StringCompanionObject.INSTANCE;
                    n15 = R$string.acc_error_message;
                    object = hv3_0.K(n15);
                    n4 = R$string.no_details_for_postalcode;
                    string2 = hv3_0.K(n4);
                    object4 = new Object[n7];
                    object4[0] = string2;
                    object = xh2_0.a((Object[])object4, n7, (String)object, "format(...)");
                    n3 = R$string.no_details_for_postalcode;
                    object2 = hv3_0.K(n3);
                    ((lm_2)object3).showNotification((String)object2, (String)object);
                }
            }
        }
        return Unit.a;
    }
}

