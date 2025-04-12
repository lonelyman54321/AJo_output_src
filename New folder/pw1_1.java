/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.data.repo.CartRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from pW1
 */
public final class pw1_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pw1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        int n3;
        void var12_19;
        DataError$ErrorMessage dataError$ErrorMessage;
        int n4 = 0;
        Object[] objectArray = null;
        boolean bl2 = true;
        int n7 = 0;
        Object object2 = null;
        Object object3 = this.b;
        Object object4 = "this$0";
        int n8 = this.a;
        switch (n8) {
            default: {
                object = (DataCallback)object;
                object3 = (bv2_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                objectArray = ((bv2_0)object3).i;
                objectArray.k(object);
                object = (ProductsList)((DataCallback)object).getData();
                if (object != null) {
                    object2 = ((ProductsList)object).getProductListsOffset();
                }
                ke0_0.a = object2;
                return Unit.a;
            }
            case 1: {
                object = (Boolean)object;
                object3 = (zi2_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                boolean bl3 = (Boolean)object;
                if (bl3) {
                    object = ((zi2_2)object3).h;
                    objectArray = ((zi2_2)object3).i;
                    hv3_0.r0((ShimmerFrameLayout)((Object)object), (View)objectArray);
                    object = ((zi2_2)object3).g;
                    if (object == null) return Unit.a;
                    ai0_2.i((View)object);
                    return Unit.a;
                }
                object = ((zi2_2)object3).h;
                objectArray = ((zi2_2)object3).i;
                hv3_0.t0((ShimmerFrameLayout)((Object)object), (View)objectArray);
                object = ((zi2_2)object3).g;
                if (object == null) return Unit.a;
                ai0_2.B((View)object);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object3 = (ex1_0)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        object4 = cp_1.Companion;
        int n10 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (n10 == 0) return Unit.a;
        kx3_0.a = bl2;
        ((ex1_0)object3).Xa();
        Intrinsics.checkNotNull(object);
        n10 = ((DataCallback)object).getStatus();
        if (n10 == 0) {
            void var13_26;
            wx1_1 wx1_12;
            Object object5;
            void var13_22;
            int n14;
            wx1_1 wx1_13;
            object = yn3_0.a;
            Object[] objectArray2 = new Object[]{};
            ((yn3$a)object).a("ITEM Deleted", objectArray2);
            ((ex1_0)object3).Xa();
            object4 = ((ex1_0)object3).t;
            String string2 = "cartViewModel";
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n10 = 0;
                object4 = null;
            }
            if ((wx1_13 = ((ex1_0)object3).t) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n14 = 0;
                Object var13_21 = null;
            }
            String string3 = var13_22.b1.getProduct().getCode();
            object4.getClass();
            if (string3 != null) {
                object4 = md3_0.c((jD3)object4);
                object5 = new xx1_1(string3, null);
                n14 = 3;
                Ae3.d((i90_0)object4, null, null, (Function2)object5, n14);
            }
            if ((object4 = ((ex1_0)object3).t) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n10 = 0;
                object4 = null;
            }
            if ((wx1_12 = ((ex1_0)object3).t) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n14 = 0;
                Object var13_25 = null;
            }
            CartEntry cartEntry = var13_26.b1;
            object4.getClass();
            CartRepo.INSTANCE.sendCartItemRemovedEvent(cartEntry);
            Object[] objectArray3 = new Object[]{};
            ((yn3$a)object).a("CartItemRemovedEvent GA sent", objectArray3);
            object4 = ((ex1_0)object3).t;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n10 = 0;
                object4 = null;
            }
            if ((object4 = ((wx1_1)object4).S0) != null) {
                void var13_31;
                object4 = FirebaseEvents.Companion.getInstance();
                wx1_1 wx1_14 = ((ex1_0)object3).t;
                if (wx1_14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n14 = 0;
                    Object var13_30 = null;
                }
                CartEntry cartEntry2 = var13_31.b1;
                object5 = ((ex1_0)object3).t;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    object5 = null;
                }
                object5 = (object5 = ((wx1_1)object5).S0) != null ? ((Cart)object5).getAppliedVouchers() : null;
                Object object6 = ((ex1_0)object3).t;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    object6 = null;
                }
                object6 = (object6 = ((wx1_1)object6).S0) != null ? ((Cart)object6).getAppliedProductPromotions() : null;
                String string4 = "item_delete";
                ((FirebaseEvents)object4).pushCartEvent(string4, cartEntry2, (List)object5, (ArrayList)object6);
                object4 = "CartItemRemovedEvent FirebaseEvents sent";
                objectArray = new Object[]{};
                ((yn3$a)object).a((String)object4, objectArray);
            }
            ((ex1_0)object3).Lb();
            ((ex1_0)object3).u0 = bl2;
            object = ((ex1_0)object3).t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl4 = false;
                object = null;
            }
            if ((objectArray = ((ex1_0)object3).x) != null) {
                object2 = objectArray.a;
            }
            ((wx1_1)object).b((ProductsList)object2, bl2);
            return Unit.a;
        }
        n10 = ((DataCallback)object).getStatus();
        if (n10 != bl2) return Unit.a;
        object4 = ((DataCallback)object).getError();
        n8 = (int)(ex1_0.Ta((DataError)object4) ? 1 : 0);
        if (n8 != 0) {
            ((ex1_0)object3).eb();
            return Unit.a;
        }
        if (object4 != null && (dataError$ErrorMessage = ((DataError)object4).getErrorMessage()) != null) {
            String string5 = dataError$ErrorMessage.getSubjectType();
        } else {
            n8 = 0;
            Object var12_18 = null;
        }
        String string6 = "entry";
        n8 = (int)(kotlin.text.b.i((String)var12_19, string6, bl2) ? 1 : 0);
        if (n8 != 0) {
            if (object4 != null && (object4 = ((DataError)object4).getErrorMessage()) != null) {
                object2 = ((DataError$ErrorMessage)object4).getReason();
            }
            if ((n7 = kotlin.text.b.i((String)object2, (String)(object4 = "notFound"), bl2)) != 0) {
                ((ex1_0)object3).sb(false);
                return Unit.a;
            }
        }
        if ((n3 = ((ex1_0)object3).Ua((DataError)(object = ((DataCallback)object).getError()))) != 0) return Unit.a;
        object = StringCompanionObject.INSTANCE;
        n3 = R$string.acc_error_message;
        object = hv3_0.K(n3);
        n7 = R$string.cart_delete_alert;
        object2 = hv3_0.K(n7);
        object4 = new Object[bl2];
        object4[0] = object2;
        object = xh2_0.a((Object[])object4, (int)(bl2 ? 1 : 0), (String)object, "format(...)");
        n4 = R$string.cart_delete_alert;
        objectArray = hv3_0.K(n4);
        ((ex1_0)object3).kb((String)objectArray, (String)object);
        return Unit.a;
    }
}

