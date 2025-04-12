/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Login.CustomerType;
import com.ril.ajio.services.data.user.LocationData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Q8
 */
public final class q8_0
implements Function1 {
    public final /* synthetic */ q9_0 a;

    public /* synthetic */ q8_0(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        Object object2 = q9_0.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n3 != 0) {
            Intrinsics.checkNotNull(object);
            n3 = ((DataCallback)object).getStatus();
            String string2 = "enable_locale";
            boolean bl2 = true;
            String string3 = "homeListener";
            Object object4 = null;
            if (n3 == 0 && (object3 = ((DataCallback)object).getData()) != null) {
                boolean bl3;
                object = (CustomerType)((DataCallback)object).getData();
                object3 = ((q9_0)object2).S0;
                String string4 = "appPreferences";
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n3 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object);
                Object object5 = ((CustomerType)object).getCustomerType();
                ((jo_2)object3).q((String)object5);
                object3 = ((q9_0)object2).k;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object3 = null;
                }
                object3.u0(bl2);
                object3 = z40_0.Companion;
                AJIOApplication$a aJIOApplication$a = AJIOApplication.Companion;
                object3 = Q.a((AJIOApplication$a)aJIOApplication$a, (z40$a)object3).a;
                n3 = (int)(((ao0_0)object3).a(string2) ? 1 : 0);
                if (n3 != 0) {
                    object3 = ((CustomerType)object).getPincode();
                    n3 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                    if (n3 == 0) {
                        String string5 = ((CustomerType)object).getCity();
                        String string6 = ((CustomerType)object).getState();
                        String string7 = ((CustomerType)object).getZone();
                        String string8 = ((CustomerType)object).getPincode();
                        int n4 = 101;
                        object5 = object3;
                        object3 = new LocationData(n4, string5, string6, string7, string8);
                        ((q9_0)object2).xb((LocationData)object3);
                        object = ((q9_0)object2).S0;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                            bl3 = false;
                            object = null;
                        }
                        ((jo_2)object).r((LocationData)object3);
                    } else {
                        ((q9_0)object2).Xa();
                    }
                }
                if ((object = ((q9_0)object2).k) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    object4 = object;
                }
                bl3 = object4.E0();
                if (!bl3) {
                    ((q9_0)object2).lb(false);
                }
            } else {
                object = z40_0.Companion;
                object3 = AJIOApplication.Companion;
                object = Q.a((AJIOApplication$a)object3, (z40$a)object).a;
                boolean bl4 = ((ao0_0)object).a(string2);
                if (bl4) {
                    object = ((q9_0)object2).k;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        bl4 = false;
                        object = null;
                    }
                    if (!(bl4 = object.E0())) {
                        object = ((q9_0)object2).k;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                        } else {
                            object4 = object;
                        }
                        object4.x(bl2);
                        ((q9_0)object2).Xa();
                        ((q9_0)object2).lb(false);
                    }
                }
            }
        }
        return Unit.a;
    }
}

