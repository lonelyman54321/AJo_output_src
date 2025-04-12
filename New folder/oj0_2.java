/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.navigation.o;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel;
import com.ril.ajio.services.data.CustomerCare.CCItemDetailsQAModel$CCItemQALists;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from oj0
 */
public final class oj0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oj0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = "this$0";
        boolean n3 = false;
        float f5 = 0.0f;
        int n4 = 1;
        Object[] objectArray = this.b;
        int n7 = this.a;
        switch (n7) {
            default: {
                Object object3 = object;
                object3 = (Throwable)object;
                objectArray = (hy3_0)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, (String)object2);
                object = objectArray.j;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object3);
                object2 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object3, "UpdateUserProfile", false, null, null, 28, null);
                ((LiveData)object).k(object2);
                return Unit.a;
            }
            case 2: {
                object = (DataCallback)object;
                objectArray = (yn2_2)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, (String)object2);
                object2 = cp_1.Companion;
                int n8 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n8 != 0) {
                    if (object != null && (n8 = ((DataCallback)object).getStatus()) == 0) {
                        if ((object = (CCItemDetailsQAModel)((DataCallback)object).getData()) != null) {
                            n8 = (int)(((CCItemDetailsQAModel)object).isLuxuryOrder() ? 1 : 0);
                            objectArray.Q = n8;
                            if ((object = ((CCItemDetailsQAModel)object).getQuickLinksList()) != null) {
                                object = ((Iterable)object).iterator();
                                while ((n8 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                                    int n10;
                                    object2 = (CCItemDetailsQAModel$CCItemQALists)object.next();
                                    objectArray.R = n10 = ((CCItemDetailsQAModel$CCItemQALists)object2).isChatEnabled();
                                    n10 = ((CCItemDetailsQAModel$CCItemQALists)object2).isChatEnabled();
                                    if (n10 == 0) {
                                        objectArray.S = object2 = ((CCItemDetailsQAModel$CCItemQALists)object2).getChatMessage();
                                    }
                                    if ((n8 = (int)(objectArray.R ? 1 : 0)) == 0) {
                                        object2 = objectArray.w;
                                        if (object2 == null) continue;
                                        n10 = 0x3F000000;
                                        f5 = 0.5f;
                                        object2.setAlpha(f5);
                                        continue;
                                    }
                                    object2 = objectArray.w;
                                    if (object2 == null) continue;
                                    n10 = 1065353216;
                                    f5 = 1.0f;
                                    object2.setAlpha(f5);
                                }
                            }
                        }
                    } else if (object != null && (n8 = ((DataCallback)object).getStatus()) == n4) {
                        if ((object = ((DataCallback)object).getError()) != null) {
                            object2 = ((DataError)object).getErrors();
                        } else {
                            n8 = 0;
                            object2 = null;
                        }
                        if (object2 != null) {
                            object2 = ((DataError)object).getErrors();
                            objectArray = "getErrors(...)";
                            Intrinsics.checkNotNullExpressionValue(object2, (String)objectArray);
                            object2 = (Collection)object2;
                            n8 = object2.isEmpty() ^ n4;
                            if (n8 != 0) {
                                object = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                                object2 = StringCompanionObject.INSTANCE;
                                n8 = R$string.acc_error_message;
                                object2 = hv3_0.K(n8);
                                objectArray = new Object[n4];
                                objectArray[0] = object;
                                object = Arrays.copyOf(objectArray, n4);
                                object = String.format((String)object2, (Object[])object);
                                object2 = "format(...)";
                                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                            }
                        }
                    }
                }
                return Unit.a;
            }
            case 1: {
                ((Boolean)object).booleanValue();
                objectArray = (FragmentActivity)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, "$activity");
                objectArray.onBackPressed();
                return Unit.a;
            }
            case 0: 
        }
        object = (o)object;
        objectArray = (yT1)objectArray;
        Intrinsics.checkNotNullParameter(objectArray, "$bottomNavigationController");
        Intrinsics.checkNotNullParameter(object, "$this$navigate");
        object2 = objectArray.i().n;
        if (object2 != null) {
            objectArray = new sj0_1(0);
            ((o)object).a((String)object2, (Function1)objectArray);
        }
        ((o)object).b = n4;
        ((o)object).c = n4;
        return Unit.a;
    }
}

