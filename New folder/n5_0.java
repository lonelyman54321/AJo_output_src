/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Login.LoginSignupBenefitsBannerData;
import com.ril.ajio.services.data.SimpleStringData;
import com.ril.ajio.services.data.referral.ReferralConfigCash;
import com.ril.ajio.stl.fragment.ShopTheLookFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from N5
 */
public final class n5_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ n5_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke(Object object) {
        int n3 = 2;
        int n4 = 0;
        Object[] objectArray = null;
        Object object2 = this.b;
        Object object3 = "this$0";
        int n7 = 1;
        int n8 = this.a;
        switch (n8) {
            default: {
                object = (Boolean)object;
                object2 = (ShopTheLookFragment)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                boolean bl2 = (Boolean)object;
                String string2 = "progressBar";
                object3 = "stlCloseIv";
                if (bl2) {
                    object = ((ShopTheLookFragment)object2).b;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        bl2 = false;
                        object = null;
                    }
                    int n10 = 4;
                    object.setVisibility(n10);
                    object = ((ShopTheLookFragment)object2).c;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        objectArray = object;
                    }
                    objectArray.setVisibility(n10);
                } else {
                    object = ((ShopTheLookFragment)object2).b;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        bl2 = false;
                        object = null;
                    }
                    object.setVisibility(0);
                    object = ((ShopTheLookFragment)object2).c;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        objectArray = object;
                    }
                    objectArray.setVisibility(0);
                }
                return Unit.a;
            }
            case 2: {
                object = (DataCallback)object;
                object2 = (az1_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                Intrinsics.checkNotNull(object);
                object2.getClass();
                n3 = ((DataCallback)object).getStatus();
                if (n3 == 0 && (object = (LoginSignupBenefitsBannerData)((DataCallback)object).getData()) != null) {
                    ((az1_2)object2).Ra().getClass();
                    Object object4 = "data";
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    vl0_0.a = n7;
                    vl0_0.b = object;
                    object = ((LoginSignupBenefitsBannerData)object).getAppSignUpBannerUrl();
                    if (object != null) {
                        object4 = ((az1_2)object2).O;
                        object3 = "signUpBenefitBannerIv";
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            n3 = 0;
                            object4 = null;
                        }
                        object4.setVisibility(0);
                        object4 = new da$a();
                        ((da$a)object4).k = n7;
                        ((da$a)object4).g = n7;
                        object2 = ((az1_2)object2).O;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        } else {
                            objectArray = object2;
                        }
                        ((da$a)object4).n = object;
                        ((da$a)object4).u = objectArray;
                        ((da$a)object4).a();
                    }
                }
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                object2 = (px0_1)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object3 = cp_1.Companion;
                boolean bl3 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (bl3) {
                    object3 = "format(...)";
                    if (object != null && (n8 = ((DataCallback)object).getStatus()) == 0) {
                        Object object5 = ((DataCallback)object).getData();
                        if (object5 != null) {
                            int n14;
                            object5 = (SimpleStringData)((DataCallback)object).getData();
                            Object[] objectArray2 = "";
                            if (object5 != null && (n8 = ((SimpleStringData)object5).getStatusCode()) == (n14 = 200)) {
                                object5 = (SimpleStringData)((DataCallback)object).getData();
                                if (object5 != null) {
                                    object5 = ((SimpleStringData)object5).getMessage();
                                } else {
                                    n8 = 0;
                                    object5 = null;
                                }
                                n8 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0);
                                if (n8 == 0) {
                                    if ((object = (SimpleStringData)((DataCallback)object).getData()) != null && (object = ((SimpleStringData)object).getMessage()) != null) {
                                        objectArray2 = object;
                                    }
                                    object = StringCompanionObject.INSTANCE;
                                    int n15 = R$string.acc_alert_message;
                                    object = hv3_0.K(n15);
                                    Object[] objectArray3 = new Object[n7];
                                    objectArray3[0] = objectArray2;
                                    ZK1.e(objectArray3, n7, (String)object, (String)object3, (String)objectArray2);
                                } else {
                                    int n16 = R$string.profile_udpated_successfully;
                                    object = hv3_0.K(n16);
                                    object5 = StringCompanionObject.INSTANCE;
                                    n8 = R$string.acc_alert_message;
                                    object5 = hv3_0.K(n8);
                                    objectArray2 = new Object[n7];
                                    objectArray2[0] = object;
                                    ZK1.e(objectArray2, n7, (String)object5, (String)object3, (String)object);
                                    object = ((px0_1)object2).p;
                                    if (object != null) {
                                        object2 = "Px0";
                                        object.onFragmentInteraction((String)object2, n3, null);
                                    }
                                }
                            } else {
                                Object object6 = (SimpleStringData)((DataCallback)object).getData();
                                if (object6 != null) {
                                    objectArray = object6.getMessage();
                                }
                                if ((n3 = (int)(TextUtils.isEmpty((CharSequence)objectArray) ? 1 : 0)) == 0) {
                                    if ((object = (SimpleStringData)((DataCallback)object).getData()) != null && (object = ((SimpleStringData)object).getMessage()) != null) {
                                        objectArray2 = object;
                                    }
                                    object = StringCompanionObject.INSTANCE;
                                    int n17 = R$string.acc_alert_message;
                                    object = hv3_0.K(n17);
                                    object6 = new Object[n7];
                                    object6[0] = objectArray2;
                                    ZK1.e(object6, n7, (String)object, (String)object3, (String)objectArray2);
                                } else {
                                    int n18 = R$string.profile_not_able_to_update;
                                    object = hv3_0.K(n18);
                                    object6 = StringCompanionObject.INSTANCE;
                                    n3 = R$string.acc_alert_message;
                                    object6 = hv3_0.K(n3);
                                    objectArray = new Object[n7];
                                    objectArray[0] = object;
                                    ZK1.e(objectArray, n7, (String)object6, (String)object3, (String)object);
                                }
                            }
                        }
                    } else {
                        int n19 = ((DataCallback)object).getStatus();
                        if (n19 == n7) {
                            n19 = R$string.profile_not_able_to_update;
                            object = hv3_0.K(n19);
                            Object object7 = StringCompanionObject.INSTANCE;
                            n3 = R$string.acc_alert_message;
                            object7 = hv3_0.K(n3);
                            objectArray = new Object[n7];
                            objectArray[0] = object;
                            ZK1.e(objectArray, n7, (String)object7, (String)object3, (String)object);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object2 = (q5_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        objectArray = cp_1.Companion;
        n4 = nn_2.b((cp$a)objectArray, (DataCallback)object);
        if (n4 != 0) {
            n4 = ((DataCallback)object).getStatus();
            if (n4 == 0) {
                object = (ReferralConfigCash)((DataCallback)object).getData();
                ((q5_0)object2).Ra((ReferralConfigCash)object);
            } else {
                int n20 = -1;
                object = n20;
                ((q5_0)object2).Oa(n3, object);
            }
        }
        return Unit.a;
    }
}

