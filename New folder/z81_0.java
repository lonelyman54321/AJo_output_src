/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
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
 * Renamed from Z81
 */
public final class z81_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z81_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        boolean bl2 = false;
        Object object2 = null;
        int n3 = 1;
        Object object3 = "this$0";
        Object[] objectArray = this.b;
        int n4 = this.a;
        object = (DataCallback)object;
        switch (n4) {
            default: {
                objectArray = (bg2_1)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, (String)object3);
                object3 = cp_1.Companion;
                int n7 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (n7 != 0) {
                    if (object != null && (n7 = ((DataCallback)object).getStatus()) == 0) {
                        if ((object = (CCItemDetailsQAModel)((DataCallback)object).getData()) != null) {
                            objectArray.w = bl2 = ((CCItemDetailsQAModel)object).isLuxuryOrder();
                            object2 = object = ((CCItemDetailsQAModel)object).getQuickLinksList();
                            object2 = (Collection)object;
                            if (object2 != null && !(bl2 = object2.isEmpty())) {
                                object = ((Iterable)object).iterator();
                                while (bl2 = object.hasNext()) {
                                    object2 = (CCItemDetailsQAModel$CCItemQALists)object.next();
                                    Object object4 = objectArray.Pa().v0;
                                    n7 = (int)(((CCItemDetailsQAModel$CCItemQALists)object2).isChatEnabled() ? 1 : 0);
                                    object3 = n7 != 0;
                                    ((h83_0)object4).setValue(object3);
                                    boolean bl3 = ((CCItemDetailsQAModel$CCItemQALists)object2).isChatEnabled();
                                    if (bl3) continue;
                                    object4 = objectArray.Pa();
                                    object2 = ((CCItemDetailsQAModel$CCItemQALists)object2).getChatMessage();
                                    object4.getClass();
                                    object3 = "<set-?>";
                                    Intrinsics.checkNotNullParameter(object2, (String)object3);
                                    ((qz1_2)object4).w0 = object2;
                                }
                            }
                        }
                    } else if (object != null && (n7 = ((DataCallback)object).getStatus()) == n3) {
                        if ((object = ((DataCallback)object).getError()) != null) {
                            object3 = ((DataError)object).getErrors();
                        } else {
                            n7 = 0;
                            object3 = null;
                        }
                        if (object3 != null) {
                            object3 = ((DataError)object).getErrors();
                            objectArray = "getErrors(...)";
                            Intrinsics.checkNotNullExpressionValue(object3, (String)objectArray);
                            object3 = (Collection)object3;
                            n7 = object3.isEmpty() ^ n3;
                            if (n7 != 0) {
                                object = ((DataError$ErrorMessage)((DataError)object).getErrors().get(0)).getMessage();
                                object3 = StringCompanionObject.INSTANCE;
                                n7 = R$string.acc_error_message;
                                object3 = hv3_0.K(n7);
                                objectArray = new Object[n3];
                                objectArray[0] = object;
                                object = Arrays.copyOf(objectArray, n3);
                                object = String.format((String)object3, (Object[])object);
                                object2 = "format(...)";
                                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                            }
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        objectArray = (h91)objectArray;
        Intrinsics.checkNotNullParameter(objectArray, (String)object3);
        objectArray.q.k(object);
        return Unit.a;
    }
}

