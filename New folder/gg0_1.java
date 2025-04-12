/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.login.activity.LoginActivityRevampNew;
import com.ril.ajio.login.activity.LoginBaseActivity;
import com.ril.ajio.services.data.user.User;
import com.ril.ajio.services.query.QueryCustomer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Gg0
 */
public final class gg0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gg0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        Object object2 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object2 = (String)object2;
                object = (dl2_2)object;
                return UserRepo.a0((String)object2, (dl2_2)object);
            }
            case 1: {
                object = (DataCallback)object;
                Object object3 = LoginActivityRevampNew.Companion;
                object2 = (LoginActivityRevampNew)object2;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                object3 = cp_1.Companion;
                n4 = (int)(nn_2.b((cp$a)object3, (DataCallback)object) ? 1 : 0);
                if (n4 != 0) {
                    int n7;
                    object3 = "format(...)";
                    Object[] objectArray = "loginViewModel";
                    Object object4 = null;
                    if (object != null && (n7 = ((DataCallback)object).getStatus()) == 0) {
                        Object object5 = (User)((DataCallback)object).getData();
                        if (object5 != null && (n7 = (int)(((User)object5).isSuspiciousUserAskForLogin() ? 1 : 0)) == n3) {
                            ((LoginActivityRevampNew)object2).startLoader();
                            object = ((LoginActivityRevampNew)object2).r0;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)objectArray);
                                boolean bl2 = false;
                                object = null;
                            }
                            object = ((oa1_1)object).h();
                            Object string4 = ((LoginActivityRevampNew)object2).r0;
                            if (string4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)objectArray);
                            } else {
                                object4 = string4;
                            }
                            string4 = "login/signup screen";
                            ((oa1_1)object4).k((QueryCustomer)object, (String)string4);
                        } else {
                            object5 = ((LoginActivityRevampNew)object2).r0;
                            if (object5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)objectArray);
                            } else {
                                object4 = object5;
                            }
                            objectArray = ((oa1_1)object4).y;
                            object4 = ((LoginActivityRevampNew)object2).A0;
                            LoginBaseActivity.C2((String)objectArray, (String)object4);
                            objectArray = ((DataCallback)object).getData();
                            if (objectArray != null) {
                                bv1_0.g = n3;
                                object = ((DataCallback)object).getData();
                                Intrinsics.checkNotNull(object);
                                object4 = object;
                                object4 = (User)object;
                                String string2 = "";
                                n7 = 0;
                                object5 = null;
                                String string3 = "";
                                objectArray = object2;
                                boolean n8 = ((LoginActivityRevampNew)object2).Q0((User)object4, false, string3, false, string2);
                                if (!n8) {
                                    ((LoginActivityRevampNew)object2).stopLoader();
                                    object = StringCompanionObject.INSTANCE;
                                    int n14 = R$string.acc_error_message;
                                    object = hv3_0.K(n14);
                                    int n15 = R$string.cannot_login;
                                    object2 = hv3_0.K(n15);
                                    objectArray = new Object[n3];
                                    objectArray[0] = object2;
                                    object = xh2_0.a(objectArray, n3, (String)object, (String)object3);
                                    n3 = R$string.cannot_login;
                                    String string5 = hv3_0.K(n3);
                                    hv3_0.o0(0, string5, (String)object);
                                }
                            }
                        }
                    } else {
                        Object object7 = ((DataCallback)object).getError();
                        if (object7 != null) {
                            ((LoginActivityRevampNew)object2).stopLoader();
                            object7 = ((LoginActivityRevampNew)object2).r0;
                            if (object7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)objectArray);
                                n7 = 0;
                                object7 = null;
                            }
                            objectArray = ((oa1_1)object7).y;
                            object7 = ((DataCallback)object).getError();
                            if (object7 != null) {
                                object7 = ((DataError)object7).getErrorMessage();
                            } else {
                                n7 = 0;
                                object7 = null;
                            }
                            object = ((DataCallback)object).getError();
                            if (object != null && (object = ((DataError)object).getErrorMessage()) != null) {
                                object4 = ((DataError$ErrorMessage)object).getMessage();
                            }
                            object = ((LoginActivityRevampNew)object2).A0;
                            LoginBaseActivity.D2((String)objectArray, (DataError$ErrorMessage)object7, (String)object4, (String)object);
                            object = StringCompanionObject.INSTANCE;
                            int n8 = R$string.acc_error_message;
                            object = hv3_0.K(n8);
                            int n10 = R$string.login_failed;
                            object2 = hv3_0.K(n10);
                            objectArray = new Object[n3];
                            objectArray[0] = object2;
                            object = xh2_0.a(objectArray, n3, (String)object, (String)object3);
                            n3 = R$string.login_failed;
                            String string4 = hv3_0.K(n3);
                            hv3_0.o0(0, string4, (String)object);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (Integer)object;
        ((Integer)object).intValue();
        object2 = (hd2_0)object2;
        Intrinsics.checkNotNullParameter(object2, "$rateReviewsClick");
        object2.V2((Integer)object);
        return Unit.a;
    }
}

