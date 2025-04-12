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
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import com.ril.ajio.services.data.Address.PostalCheck;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from t4
 */
public final class t4_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t4_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        Object object2 = null;
        int n4 = 1;
        Object object3 = this.b;
        Object object4 = "this$0";
        int n7 = this.a;
        switch (n7) {
            default: {
                object = (DataCallback)object;
                object3 = (w23_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                ((w23_0)object3).g.k(object);
                return Unit.a;
            }
            case 1: {
                object = (Throwable)object;
                object3 = (wx1_1)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                object2 = ((wx1_1)object3).B;
                Intrinsics.checkNotNull(object);
                object = ((wx1_1)object3).d.handleApiException((Throwable)object, "ShowWishList");
                ((LiveData)object2).k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object3 = (AddAddressFragment)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        object4 = cp_1.Companion;
        int n8 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n8 != 0) {
            object4 = ((AddAddressFragment)object3).v;
            if (object4 != null) {
                ((AjioLoaderView)((Object)object4)).stopLoader();
            }
            Intrinsics.checkNotNull(object);
            n8 = ((DataCallback)object).getStatus();
            if (n8 == 0) {
                AjioEditText ajioEditText;
                TextInputLayout textInputLayout;
                object = (PostalCheck)((DataCallback)object).getData();
                Intrinsics.checkNotNull(object);
                object4 = ((PostalCheck)object).getDistrict();
                object = ((PostalCheck)object).getState();
                if (object4 != null && (n7 = ((String)object4).length()) > 0) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    Object var9_9 = null;
                }
                AjioEditText ajioEditText2 = ((AddAddressFragment)object3).h;
                if (ajioEditText2 != null && (textInputLayout = ((AddAddressFragment)object3).p) != null) {
                    if (n7 != 0) {
                        Intrinsics.checkNotNull(ajioEditText2);
                        ajioEditText2.setText((CharSequence)object4);
                        object4 = ((AddAddressFragment)object3).p;
                        Intrinsics.checkNotNull(object4);
                        ((TextInputLayout)((Object)object4)).setError(null);
                    } else {
                        Intrinsics.checkNotNull(ajioEditText2);
                        ajioEditText2.setText((CharSequence)object4);
                    }
                }
                if (object != null && (n8 = ((String)object).length()) > 0) {
                    n3 = 1;
                }
                if ((ajioEditText = ((AddAddressFragment)object3).c) != null && (object4 = ((AddAddressFragment)object3).q) != null && (object4 = ((AddAddressFragment)object3).r) != null) {
                    if (n3 != 0) {
                        Intrinsics.checkNotNull(ajioEditText);
                        ajioEditText.setText((CharSequence)object);
                        object = ((AddAddressFragment)object3).q;
                        Intrinsics.checkNotNull(object);
                        ((TextInputLayout)((Object)object)).setError(null);
                    } else {
                        Intrinsics.checkNotNull(ajioEditText);
                        ajioEditText.setText((CharSequence)object);
                    }
                    if (n7 != 0 && n3 != 0) {
                        object = ((AddAddressFragment)object3).r;
                        Intrinsics.checkNotNull(object);
                        ((TextInputLayout)((Object)object)).setError(null);
                    } else {
                        object = ((AddAddressFragment)object3).r;
                        Intrinsics.checkNotNull(object);
                        n3 = R$string.enter_valid_pincode;
                        object2 = ((Fragment)object3).getString(n3);
                        ((TextInputLayout)((Object)object)).setError((CharSequence)object2);
                    }
                }
            } else {
                int n10 = ((DataCallback)object).getStatus();
                if (n10 == n4) {
                    object = StringCompanionObject.INSTANCE;
                    n10 = R$string.acc_error_message;
                    object = hv3_0.K(n10);
                    n8 = R$string.no_details_for_postalcode;
                    object4 = hv3_0.K(n8);
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = object4;
                    object = xh2_0.a(objectArray, n4, (String)object, "format(...)");
                    n3 = R$string.no_details_for_postalcode;
                    object2 = hv3_0.K(n3);
                    ((AddAddressFragment)object3).showNotification((String)object2, (String)object);
                }
            }
        }
        return Unit.a;
    }
}

