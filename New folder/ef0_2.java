/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.Toast
 */
import android.content.Context;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.Status;
import com.ril.ajio.services.data.user.GPSResponse;
import com.ril.ajio.services.data.user.LocationResponse;
import java.util.AbstractCollection;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ef0
 */
public final class ef0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ ef0_2(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        object = (DataCallback)object;
        switch (n3) {
            default: {
                ex1_0 ex1_02 = (ex1_0)this.b;
                Intrinsics.checkNotNullParameter(ex1_02, "this$0");
                Object object2 = cp_1.Companion;
                boolean bl2 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (bl2 && (object2 = ((DataCallback)object).getData()) != null) {
                    ((AbstractCollection)ex1_02.Y).clear();
                    object2 = ex1_02.X;
                    ((AbstractCollection)object2).clear();
                    object = ((DataCallback)object).getData();
                    Intrinsics.checkNotNull(object);
                    object = (Collection)object;
                    ((AbstractCollection)object2).addAll(object);
                    ex1_02.Va();
                }
                return Unit.a;
            }
            case 0: 
        }
        Object object3 = (ff0_2)this.b;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Object object4 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n4 != 0 && (n4 = ((DataCallback)object).getStatus()) == 0 && (object4 = ((DataCallback)object).getData()) != null) {
            int n7;
            Object object5;
            object4 = (LocationResponse)((DataCallback)object).getData();
            ff0_2 ff0_22 = null;
            if (object4 != null) {
                object5 = ((LocationResponse)object4).getData();
            } else {
                n7 = 0;
                object5 = null;
            }
            Object object6 = "Pincode not found";
            String string2 = null;
            if (object5 != null) {
                int n8;
                object = ((LocationResponse)object4).getData().getPostalCode();
                if (object != null && (n8 = ((String)object).length()) != 0) {
                    object = ((LocationResponse)object4).getData();
                    object4 = ((ff0_2)object3).b;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("fetchingLocationLayout");
                        n4 = 0;
                        object4 = null;
                    }
                    n7 = 8;
                    object4.setVisibility(n7);
                    object4 = ((ff0_2)object3).c;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("locationDetailsLayout");
                        n4 = 0;
                        object4 = null;
                    }
                    object4.setVisibility(0);
                    object4 = ((ff0_2)object3).f;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvPinCode");
                        n4 = 0;
                        object4 = null;
                    }
                    object5 = ((GPSResponse)object).getPostalCode();
                    object4.setText((CharSequence)object5);
                    object4 = new StringBuilder();
                    object5 = ((GPSResponse)object).getCity();
                    ((StringBuilder)object4).append((String)object5);
                    object5 = ((GPSResponse)object).getZone();
                    if (object5 != null && (n7 = ((String)object5).length()) != 0) {
                        object5 = ((GPSResponse)object).getZone();
                        string2 = " (";
                        object6 = new StringBuilder(string2);
                        ((StringBuilder)object6).append((String)object5);
                        ((StringBuilder)object6).append(")");
                        object5 = ((StringBuilder)object6).toString();
                        ((StringBuilder)object4).append((String)object5);
                    }
                    object = ((GPSResponse)object).getState();
                    object6 = " ";
                    object5 = new StringBuilder((String)object6);
                    ((StringBuilder)object5).append((String)object);
                    object = ((StringBuilder)object5).toString();
                    ((StringBuilder)object4).append((String)object);
                    object = ((StringBuilder)object4).toString();
                    object4 = "toString(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                    object3 = ((ff0_2)object3).g;
                    if (object3 == null) {
                        object3 = "tvAddress";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    } else {
                        ff0_22 = object3;
                    }
                    ff0_22.setText((CharSequence)object);
                } else {
                    ((BottomSheetDialogFragment)object3).dismissAllowingStateLoss();
                    object = Toast.makeText((Context)((Fragment)object3).requireContext(), (CharSequence)object6, (int)0);
                    object.show();
                }
            } else {
                ((BottomSheetDialogFragment)object3).dismissAllowingStateLoss();
                object3 = ((Fragment)object3).requireContext();
                object = (LocationResponse)((DataCallback)object).getData();
                if (object != null && (object = ((LocationResponse)object).getStatus()) != null && (object = ((Status)object).getMessageDescription()) != null) {
                    object6 = object;
                }
                object = Toast.makeText((Context)object3, (CharSequence)object6, (int)0);
                object.show();
            }
        }
        return Unit.a;
    }
}

