/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.referral.RefereeEarnCash;
import com.ril.ajio.services.data.referral.ReferralConfigCash;
import com.ril.ajio.services.data.referral.ReferrerCashData;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from EA1
 */
public final class ea1_1
implements F62 {
    public final /* synthetic */ ga1_0 a;

    public /* synthetic */ ea1_1(ga1_0 ga1_02) {
        this.a = ga1_02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onChanged(Object object) {
        block8: {
            Object object2;
            block9: {
                Exception exception2;
                Object[] objectArray;
                float f5;
                Object object3;
                int n3;
                String string2;
                block7: {
                    float f6;
                    Object[] objectArray2;
                    Object[] objectArray3;
                    block6: {
                        block5: {
                            float f7;
                            Object object4;
                            string2 = null;
                            n3 = 1;
                            object = (DataCallback)object;
                            object2 = this.a;
                            Intrinsics.checkNotNullParameter(object2, "this$0");
                            object3 = cp_1.Companion;
                            int n4 = nn_2.b((cp$a)object3, (DataCallback)object);
                            if (n4 == 0 || (n4 = ((DataCallback)object).getStatus()) != 0) break block8;
                            object = (ReferralConfigCash)((DataCallback)object).getData();
                            object2.getClass();
                            object3 = "format(...)";
                            if (object != null && (object = ((ReferralConfigCash)object).getReferee()) != null) {
                                object = ((ReferrerCashData)object).getRefereeUserRegistration();
                            } else {
                                object4 = 0;
                                f7 = 0.0f;
                                object = null;
                            }
                            bv1_0.c = object;
                            if (object == null) break block8;
                            f7 = ((RefereeEarnCash)object).getAmount();
                            f5 = 0.0f;
                            objectArray = null;
                            float f8 = f7 - 0.0f;
                            object4 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                            if (object4 <= 0) return;
                            object = ((ga1_0)object2).o;
                            if (object == null) break block8;
                            try {
                                objectArray3 = StringCompanionObject.INSTANCE;
                                objectArray3 = z40_0.Companion;
                                object2 = ((Fragment)object2).requireActivity();
                                object2 = object2.getApplication();
                                objectArray2 = "getApplication(...)";
                                Intrinsics.checkNotNullExpressionValue(object2, (String)objectArray2);
                                objectArray3.getClass();
                                object2 = z40$a.a((Context)object2);
                                object2 = ((z40_0)object2).a;
                                objectArray3 = "referral_signup_msg";
                                object2 = ((ao0_0)object2).b((String)objectArray3);
                                objectArray3 = bv1_0.c;
                                if (objectArray3 == null) break block5;
                                f6 = objectArray3.getAmount();
                                break block6;
                            }
                            catch (Exception exception2) {
                                break block7;
                            }
                        }
                        f6 = 0.0f;
                        objectArray3 = null;
                    }
                    objectArray3 = Float.valueOf(f6);
                    objectArray3 = qz2_0.x((Float)objectArray3);
                    objectArray2 = new Object[n3];
                    objectArray2[0] = objectArray3;
                    objectArray3 = Arrays.copyOf(objectArray2, n3);
                    object2 = String.format((String)object2, objectArray3);
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                    break block9;
                }
                yn3$a yn3$a = yn3_0.a;
                yn3$a.e(exception2);
                object2 = StringCompanionObject.INSTANCE;
                object2 = bv1_0.c;
                if (object2 != null) {
                    f5 = ((RefereeEarnCash)object2).getAmount();
                }
                object2 = qz2_0.x(Float.valueOf(f5));
                objectArray = new Object[n3];
                objectArray[0] = object2;
                string2 = "Signup to get %s AJIO Cash";
                object2 = xh2_0.a(objectArray, n3, string2, (String)object3);
            }
            object.setText((CharSequence)object2);
        }
    }
}

