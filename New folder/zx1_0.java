/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.login.activity.LoginActivityRevamp;
import com.ril.ajio.login.activity.LoginBaseActivity;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.user.User;
import com.ril.ajio.services.query.QueryCustomer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Zx1
 */
public final class zx1_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zx1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        int n3;
        int n4 = 0;
        Object object2 = null;
        Object object3 = "this$0";
        Object[] objectArray = this.b;
        int n7 = 1;
        int n8 = this.a;
        object = (DataCallback)object;
        switch (n8) {
            default: {
                int n10;
                objectArray = (ex1_0)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, (String)object3);
                object3 = cp_1.Companion;
                boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (!bl2) return Unit.a;
                objectArray.u0 = false;
                object3 = objectArray.t;
                String string2 = "cartViewModel";
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object3 = null;
                }
                if (bl2 = ((wx1_1)object3).e1) {
                    objectArray.Xa();
                }
                object3 = yn3_0.a;
                Object object4 = "showWishListObservable called";
                Object[] objectArray2 = new Object[]{};
                ((yn3$a)object3).a((String)object4, objectArray2);
                if (object != null && (n10 = ((DataCallback)object).getStatus()) == 0) {
                    int n14;
                    Object object5 = objectArray.t;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n7 = 0;
                        object5 = null;
                    }
                    object = (ProductsList)((DataCallback)object).getData();
                    objectArray.Ra((ProductsList)object);
                    if (object == null) {
                        return Unit.a;
                    }
                    ((wx1_1)object5).V0 = object;
                    object = objectArray.x;
                    if (object != null) {
                        object5 = objectArray.t;
                        if (object5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n7 = 0;
                            object5 = null;
                        }
                        ((om_1)object).a = object5 = ((wx1_1)object5).V0;
                    }
                    if ((object = objectArray.u) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("closetViewModel");
                        n14 = 0;
                        object = null;
                    }
                    if ((object5 = objectArray.t) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n7 = 0;
                        object5 = null;
                    }
                    object5 = ((wx1_1)object5).V0;
                    ((ky1_0)object).p((ProductsList)object5, false);
                    object = tr2_2.a;
                    n14 = tr2_2.y(false);
                    if (n14 != 0) {
                        object = objectArray.t;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n14 = 0;
                            object = null;
                        }
                        if ((object = ((wx1_1)object).V0) != null && (object = ((ProductsList)object).getPagination()) != null && (n14 = ((Pagination)object).getCurrentPage()) == 0) {
                            object = objectArray.t;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n14 = 0;
                                object = null;
                            }
                            if ((object = ((wx1_1)object).V0) != null) {
                                object = ((ProductsList)object).getSaleStartTime();
                            } else {
                                n14 = 0;
                                object = null;
                            }
                            if (object != null) {
                                object = objectArray.t;
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    n14 = 0;
                                    object = null;
                                }
                                if ((object = ((wx1_1)object).V0) != null) {
                                    object = ((ProductsList)object).getSaleEndTime();
                                } else {
                                    n14 = 0;
                                    object = null;
                                }
                                if (object != null) {
                                    object = objectArray.t;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n14 = 0;
                                        object = null;
                                    }
                                    if ((object = ((wx1_1)object).V0) != null) {
                                        object = ((ProductsList)object).getSaleStartTime();
                                    } else {
                                        n14 = 0;
                                        object = null;
                                    }
                                    object5 = objectArray.t;
                                    if (object5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n7 = 0;
                                        object5 = null;
                                    }
                                    if ((object5 = ((wx1_1)object5).V0) != null) {
                                        object5 = ((ProductsList)object5).getSaleEndTime();
                                    } else {
                                        n7 = 0;
                                        object5 = null;
                                    }
                                    tr2_2.B((Long)object, (Long)object5);
                                }
                            }
                        }
                    }
                    if ((n14 = objectArray.Nb()) != 0) {
                        object = objectArray.t;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n14 = 0;
                            object = null;
                        }
                        if ((object = ((wx1_1)object).V0) != null && (object = ((ProductsList)object).getProducts()) != null) {
                            object4 = new Object[]{};
                            ((yn3$a)object3).a("wishlist data  set for cart success", (Object[])object4);
                            object5 = objectArray.S;
                            if (object5 != null && (object5 = ((bo_1)object5).m) != null) {
                                object4 = ((op_2)object5).l;
                                ((ArrayList)object4).clear();
                                object5 = ((op_2)object5).m;
                                ((ArrayList)object5).clear();
                            }
                            if ((object5 = objectArray.S) != null) {
                                ((bo_1)object5).i((List)object);
                            }
                            if ((object = objectArray.t) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n14 = 0;
                                object = null;
                            }
                            object = ((wx1_1)object).V0;
                            Intrinsics.checkNotNull(object);
                            kx3_0.b = object;
                            kx3_0.a = false;
                        }
                    }
                    object5 = new Object[]{};
                    ((yn3$a)object3).a("calling refresh adapter for half cart closet", (Object[])object5);
                    object = objectArray.v;
                    if (object != null) {
                        n4 = (int)(objectArray.Nb() ? 1 : 0);
                        object2 = ((ko_2)object).a(n4 != 0);
                    }
                    Intrinsics.checkNotNull(object2);
                    objectArray.Bb((ArrayList)object2);
                    return Unit.a;
                } else {
                    n4 = ((DataCallback)object).getStatus();
                    if (n4 != n7) return Unit.a;
                    boolean bl3 = objectArray.Ua((DataError)(object = ((DataCallback)object).getError()));
                    if (bl3) return Unit.a;
                    objectArray.C0 = n7;
                }
                return Unit.a;
            }
            case 0: 
        }
        Object object6 = LoginActivityRevamp.Companion;
        objectArray = (LoginActivityRevamp)objectArray;
        Intrinsics.checkNotNullParameter(objectArray, (String)object3);
        object3 = cp_1.Companion;
        boolean bl4 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (!bl4) return Unit.a;
        object3 = "format(...)";
        object6 = "loginViewModel";
        if (object != null && (n3 = ((DataCallback)object).getStatus()) == 0) {
            Object object7 = (User)((DataCallback)object).getData();
            if (object7 != null && (n3 = (int)(((User)object7).isSuspiciousUserAskForLogin() ? 1 : 0)) == n7) {
                objectArray.startLoader();
                object = objectArray.q0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    boolean bl5 = false;
                    object = null;
                }
                object = ((oa1_1)object).h();
                object3 = objectArray.q0;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                } else {
                    object2 = object3;
                }
                object3 = "login/signup screen";
                ((oa1_1)object2).k((QueryCustomer)object, (String)object3);
                return Unit.a;
            } else {
                object7 = objectArray.q0;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                } else {
                    object2 = object7;
                }
                object2 = ((oa1_1)object2).y;
                object6 = objectArray.z0;
                LoginBaseActivity.C2((String)object2, (String)object6);
                object2 = ((DataCallback)object).getData();
                if (object2 == null) return Unit.a;
                bv1_0.g = n7;
                object = ((DataCallback)object).getData();
                Intrinsics.checkNotNull(object);
                Object object8 = object;
                object8 = (User)object;
                String string3 = "";
                String string4 = "";
                object7 = objectArray;
                int n15 = objectArray.Q0((User)object8, false, string4, false, string3);
                if (n15 != 0) return Unit.a;
                objectArray.stopLoader();
                object = StringCompanionObject.INSTANCE;
                n15 = R$string.acc_error_message;
                object = hv3_0.K(n15);
                object2 = hv3_0.K(R$string.cannot_login);
                objectArray = new Object[n7];
                objectArray[0] = object2;
                object = xh2_0.a(objectArray, n7, (String)object, (String)object3);
                n4 = R$string.cannot_login;
                object2 = hv3_0.K(n4);
                hv3_0.o0(0, (String)object2, (String)object);
            }
            return Unit.a;
        } else {
            Object object9 = ((DataCallback)object).getError();
            if (object9 == null) return Unit.a;
            objectArray.stopLoader();
            object9 = objectArray.q0;
            if (object9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n3 = 0;
                object9 = null;
            }
            object6 = ((oa1_1)object9).y;
            object9 = ((DataCallback)object).getError();
            if (object9 != null) {
                object9 = ((DataError)object9).getErrorMessage();
            } else {
                n3 = 0;
                object9 = null;
            }
            object = ((DataCallback)object).getError();
            if (object != null && (object = ((DataError)object).getErrorMessage()) != null) {
                object2 = ((DataError$ErrorMessage)object).getMessage();
            }
            object = objectArray.z0;
            LoginBaseActivity.D2((String)object6, (DataError$ErrorMessage)object9, (String)object2, (String)object);
            object = StringCompanionObject.INSTANCE;
            int n16 = R$string.acc_error_message;
            object = hv3_0.K(n16);
            object2 = hv3_0.K(R$string.login_failed);
            objectArray = new Object[n7];
            objectArray[0] = object2;
            object = xh2_0.a(objectArray, n7, (String)object, (String)object3);
            n4 = R$string.login_failed;
            object2 = hv3_0.K(n4);
            hv3_0.o0(0, (String)object2, (String)object);
        }
        return Unit.a;
    }
}

