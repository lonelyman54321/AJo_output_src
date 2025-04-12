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
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Address.PostalCheck;
import com.ril.ajio.services.data.user.LocationData;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from T8
 */
public final class t8_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ t8_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        Object object2 = null;
        int n4 = 1;
        Object object3 = "this$0";
        Fragment fragment = this.b;
        int n7 = this.a;
        object = (DataCallback)object;
        switch (n7) {
            default: {
                fragment = (o12_0)fragment;
                Intrinsics.checkNotNullParameter(fragment, (String)object3);
                object3 = cp_1.Companion;
                int n8 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (n8 != 0) {
                    Intrinsics.checkNotNull(object);
                    n8 = ((DataCallback)object).getStatus();
                    if (n8 == 0) {
                        object = ((o12_0)fragment).e;
                        Intrinsics.checkNotNull(object);
                        object = object.getText().toString();
                        n3 = (int)(mz3_0.B() ? 1 : 0);
                        if (n3 != 0 && (n3 = (int)(((UserInformation)(object2 = UserInformation.getInstance(fragment.getContext()))).isUserOnline() ? 1 : 0)) != 0) {
                            ((o12_0)fragment).Pa((String)object);
                        } else {
                            ((o12_0)fragment).Oa((String)object);
                        }
                    } else {
                        int n10 = ((DataCallback)object).getStatus();
                        if (n10 == n4) {
                            object = StringCompanionObject.INSTANCE;
                            object = hv3_0.K(R$string.acc_error_message);
                            n8 = R$string.addresses_not_able_to_updated;
                            object3 = hv3_0.K(n8);
                            Object[] objectArray = new Object[n4];
                            objectArray[0] = object3;
                            Context context = Arrays.copyOf(objectArray, n4);
                            object = String.format((String)object, (Object[])context);
                            context = "format(...)";
                            Intrinsics.checkNotNullExpressionValue(object, (String)context);
                            n10 = R$string.pincode_is_not_valid;
                            object = hv3_0.K(n10);
                            fragment.getClass();
                            if (object != null && (n4 = ((String)object).length()) != 0 && (context = fragment.getContext()) != null) {
                                context = fragment.requireContext();
                                object = Toast.makeText((Context)context, (CharSequence)object, (int)0);
                                object.show();
                            }
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object2 = q9_0.Companion;
        fragment = (q9_0)fragment;
        Intrinsics.checkNotNullParameter(fragment, (String)object3);
        object2 = cp_1.Companion;
        n3 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n3 != 0) {
            n3 = ((DataCallback)object).getStatus();
            n4 = 103;
            if (n3 == 0 && (object2 = ((DataCallback)object).getData()) != null) {
                if ((object = (PostalCheck)((DataCallback)object).getData()) != null && (n3 = (int)(((PostalCheck)object).getInvalidpostalcode() ? 1 : 0)) == 0) {
                    object2 = ((q9_0)fragment).gb();
                    n4 = 102;
                    ((hy3_0)object2).s(n4);
                    String string2 = ((PostalCheck)object).getCity();
                    String string3 = ((PostalCheck)object).getState();
                    String string4 = ((PostalCheck)object).getZone();
                    int n14 = 102;
                    Object object4 = object2;
                    object2 = new LocationData(n14, string2, string3, string4, null);
                    ((q9_0)fragment).xb((LocationData)object2);
                    object = ((q9_0)fragment).S0;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("appPreferences");
                        boolean bl2 = false;
                        object = null;
                    }
                    ((jo_2)object).r((LocationData)object2);
                } else {
                    object = ((q9_0)fragment).gb();
                    ((hy3_0)object).s(n4);
                }
            } else {
                object = ((q9_0)fragment).gb();
                ((hy3_0)object).s(n4);
            }
        }
        return Unit.a;
    }
}

