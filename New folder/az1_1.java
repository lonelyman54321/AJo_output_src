/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.referral.ReferralConfigCash;
import com.ril.ajio.services.data.referral.ReferrerCashData;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from AZ1
 */
public final class az1_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ az1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        Object object3 = "this$0";
        int n3 = 1;
        int n4 = this.a;
        object = (DataCallback)object;
        switch (n4) {
            default: {
                object2 = (op2_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                ((op2_2)object2).j.k(object);
                return Unit.a;
            }
            case 0: 
        }
        object2 = (bz1_2)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object, "referralAjioWalletDataCallback");
        object3 = cp_1.Companion;
        int n7 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n7 != 0 && (n7 = ((DataCallback)object).getStatus()) == 0) {
            object = (ReferralConfigCash)((DataCallback)object).getData();
            object2.getClass();
            object3 = "format(...)";
            if (object != null) {
                float f5;
                Object object4 = ((ReferralConfigCash)object).getReferee();
                if (object4 != null) {
                    object4 = ((ReferralConfigCash)object).getReferee();
                    Intrinsics.checkNotNull(object4);
                    object4 = ((ReferrerCashData)object4).getTotalBonus();
                    if (object4 != null) {
                        object4 = ((ReferralConfigCash)object).getReferee();
                        Intrinsics.checkNotNull(object4);
                        object4 = ((ReferrerCashData)object4).getTotalBonus();
                        Intrinsics.checkNotNull(object4);
                        ((bz1_2)object2).B0 = f5 = ((Float)object4).floatValue();
                    }
                }
                if ((object4 = ((ReferralConfigCash)object).getReferrer()) != null) {
                    object4 = ((ReferralConfigCash)object).getReferrer();
                    Intrinsics.checkNotNull(object4);
                    object4 = ((ReferrerCashData)object4).getTotalBonus();
                    if (object4 != null) {
                        object4 = ((ReferralConfigCash)object).getReferrer();
                        Intrinsics.checkNotNull(object4);
                        object4 = ((ReferrerCashData)object4).getTotalBonus();
                        Intrinsics.checkNotNull(object4);
                        ((bz1_2)object2).C0 = f5 = ((Float)object4).floatValue();
                    }
                }
                if ((object4 = ((ReferralConfigCash)object).getReferrer()) != null) {
                    object4 = ((ReferralConfigCash)object).getReferrer();
                    Intrinsics.checkNotNull(object4);
                    object4 = ((ReferrerCashData)object4).getTotalBonus();
                    if (object4 != null) {
                        int n8;
                        object4 = ((ReferralConfigCash)object).getReferrer();
                        Intrinsics.checkNotNull(object4);
                        object4 = ((ReferrerCashData)object4).getTotalBonus();
                        Intrinsics.checkNotNull(object4);
                        f5 = ((Float)object4).floatValue();
                        int n10 = 0;
                        Object object5 = null;
                        float f6 = f5 - 0.0f;
                        n4 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
                        if (n4 > 0 && (n4 = ((bz1_2)object2).z0) > (n10 = -1) && n4 < (n8 = (object5 = ((bz1_2)object2).Q).size())) {
                            n4 = ((bz1_2)object2).z0;
                            object4 = object5.get(n4);
                            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type com.ril.ajio.myaccount.myaccount.OptionItem");
                            object4 = (v92_0)object4;
                            n8 = ((bz1_2)object2).z0;
                            object5.remove(n8);
                            Object[] objectArray = ((bz1_2)object2).u0;
                            if (objectArray != null) {
                                Intrinsics.checkNotNull(objectArray);
                                objectArray.a = object5;
                            }
                            object5 = StringCompanionObject.INSTANCE;
                            object5 = z40_0.Companion;
                            objectArray = ((Fragment)object2).requireActivity();
                            objectArray = objectArray.getApplication();
                            Object[] objectArray2 = "getApplication(...)";
                            Intrinsics.checkNotNullExpressionValue(objectArray, (String)objectArray2);
                            object5.getClass();
                            object5 = z40$a.a((Context)objectArray);
                            object5 = object5.a;
                            objectArray = "referral_widget_message";
                            object5 = object5.b((String)objectArray);
                            objectArray = ((ReferralConfigCash)object).getReferrer();
                            Intrinsics.checkNotNull(objectArray);
                            objectArray = objectArray.getTotalBonus();
                            objectArray = qz2_0.x((Float)objectArray);
                            objectArray2 = new Object[n3];
                            objectArray2[0] = objectArray;
                            objectArray = Arrays.copyOf(objectArray2, n3);
                            object5 = String.format((String)object5, objectArray);
                            try {
                                Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
                            }
                            catch (Exception exception) {
                                objectArray = yn3_0.a;
                                objectArray.e(exception);
                                object5 = StringCompanionObject.INSTANCE;
                                object = ((ReferralConfigCash)object).getReferrer();
                                Intrinsics.checkNotNull(object);
                                object = qz2_0.x(((ReferrerCashData)object).getTotalBonus());
                                object5 = new Object[n3];
                                object5[0] = object;
                                object = "You get %s AJIO Cash for every friend";
                                object5 = xh2_0.a(object5, n3, (String)object, (String)object3);
                            }
                            ((v92_0)object4).d = object5;
                            int n14 = ((bz1_2)object2).z0;
                            ((bz1_2)object2).Ra(n14, (v92_0)object4);
                            object = ((bz1_2)object2).A0;
                            Intrinsics.checkNotNull(object);
                            object.notifyDataSetChanged();
                        }
                    }
                }
            }
        }
        return Unit.a;
    }
}

