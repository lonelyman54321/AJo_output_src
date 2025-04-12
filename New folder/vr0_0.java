/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Product.Product;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from vr0
 */
public final class vr0_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        int n4;
        String string2;
        float f5;
        int n7;
        Object object3;
        int n8;
        Object object4;
        qz1_2 qz1_23 = qz1_22;
        SelectedOrderItem selectedOrderItem2 = selectedOrderItem;
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n10 = -451022834;
        Object object5 = b30_02;
        Object object6 = b30_02.g(n10);
        qz1_22.getClass();
        if (selectedOrderItem != null) {
            object4 = selectedOrderItem.getConsignment();
        } else {
            n8 = 0;
            object4 = null;
        }
        if (selectedOrderItem2 != null && (object3 = selectedOrderItem.getCartEntry()) != null && (object3 = ((CartEntry)object3).getProduct()) != null) {
            object3 = ((Product)object3).getCode();
        } else {
            n7 = 0;
            f5 = 0.0f;
            object3 = null;
        }
        int n14 = 1;
        float f6 = Float.MIN_VALUE;
        if (object4 == null || (object4 = ((Consignment)object4).getReturnRequests()) == null) {
            string2 = null;
        } else {
            object4 = object4.iterator();
            string2 = null;
            while ((n4 = object4.hasNext()) != 0) {
                ReturnRequest returnRequest = (ReturnRequest)object4.next();
                object2 = returnRequest.getReturnStatus();
                int n15 = b.i((String)object2, (String)(object = "DELIVERED"), n14 != 0);
                if (n15 == 0 && (n15 = b.i((String)(object2 = returnRequest.getReturnStatus()), (String)(object = "RETURN CANCELLED"), n14 != 0)) == 0) continue;
                object2 = returnRequest.getReturnCancelledEntries();
                if (object2 != null && (object2 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)object2)) != null && (object2 = ((OrderDetailLineItem)object2).getEntry()) != null && (object2 = ((CartEntry)object2).getProduct()) != null) {
                    object2 = ((Product)object2).getCode();
                } else {
                    n15 = 0;
                    object2 = null;
                }
                if (object3 == null || (n15 = ((String)object3).equals(object2)) != n14 || (object2 = returnRequest.getExchangeCancelMessage()) == null) continue;
                string2 = returnRequest.getExchangeCancelMessage();
            }
        }
        if (string2 != null && (n8 = string2.length()) != 0) {
            Object object7;
            object4 = LP1$a.b;
            n7 = 16;
            f5 = n7;
            n4 = 8;
            float f7 = n4;
            object3 = h.h((LP1)object4, f5, f7, f5, f7);
            object2 = Nc$a.a;
            boolean bl2 = false;
            object = null;
            Object object8 = HA.e((Nc)object2, false);
            int n16 = ((j30_0)object6).P;
            Object object9 = ((j30_0)object6).P();
            object3 = a30_0.c((b30_0)object6, (LP1)object3);
            N20.W.getClass();
            Xp1$a xp1$a = N20$a.b;
            mp mp2 = ((j30_0)object6).a;
            boolean bl3 = mp2 instanceof mp;
            if (!bl3) {
                s20.a();
                throw null;
            }
            ((j30_0)object6).A();
            bl3 = ((j30_0)object6).O;
            if (bl3) {
                ((j30_0)object6).C(xp1$a);
            } else {
                ((j30_0)object6).n();
            }
            object5 = N20$a.e;
            Ow3.a((b30_0)object6, object8, (Function2)object5);
            object8 = N20$a.d;
            Ow3.a((b30_0)object6, object9, (Function2)object8);
            object9 = N20$a.f;
            bl2 = ((j30_0)object6).O;
            if (bl2 || !(bl2 = Intrinsics.areEqual(object = ((j30_0)object6).v(), object7 = Integer.valueOf(n16)))) {
                rk_0.a(n16, (j30_0)object6, n16, (N20$a$a)object9);
            }
            object = N20$a.c;
            Ow3.a((b30_0)object6, object3, (Function2)object);
            n7 = 1065353216;
            f5 = 1.0f;
            object3 = j.c((LP1)object4, f5);
            float f8 = 1.0f;
            Object object10 = object8;
            object7 = oz_0.a(xx_1.O, f8);
            int n17 = 4;
            float f11 = n17;
            object8 = SP2.a(f11);
            Object object11 = ((nz)object7).b;
            f6 = ((nz)object7).a;
            object3 = gz.b((LP1)object3, f6, (ZD)object11, (i13)object8);
            long l2 = xx_1.N;
            object11 = fg2_1.a;
            object3 = a.b((LP1)object3, l2, (i13)object11);
            f6 = 0.0f;
            object7 = null;
            object2 = HA.e((Nc)object2, false);
            n14 = ((j30_0)object6).P;
            object8 = ((j30_0)object6).P();
            object3 = a30_0.c((b30_0)object6, (LP1)object3);
            n16 = mp2 instanceof mp;
            if (n16 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object6).A();
            n16 = (int)(((j30_0)object6).O ? 1 : 0);
            if (n16 != 0) {
                ((j30_0)object6).C(xp1$a);
            } else {
                ((j30_0)object6).n();
            }
            Ow3.a((b30_0)object6, object2, (Function2)object5);
            object5 = object10;
            Ow3.a((b30_0)object6, object8, (Function2)object10);
            bl3 = ((j30_0)object6).O;
            if (bl3 || !(bl3 = Intrinsics.areEqual(object5 = ((j30_0)object6).v(), object2 = Integer.valueOf(n14)))) {
                rk_0.a(n14, (j30_0)object6, n14, (N20$a$a)object9);
            }
            Ow3.a((b30_0)object6, object3, (Function2)object);
            object4 = h.e((LP1)object4, f7);
            long l3 = Em3.f(12);
            object7 = tv0_0.m;
            long l4 = xx_1.e;
            int n18 = 200112;
            bl2 = false;
            object = null;
            n17 = 0;
            f11 = 0.0f;
            object8 = null;
            long l7 = 0L;
            xp1$a = null;
            mp2 = null;
            long l8 = 0L;
            int n19 = 131024;
            object5 = string2;
            Ll3.b(string2, (LP1)object4, l4, l3, null, (tv0_0)object7, null, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object6, n18, 0, n19);
            bl3 = true;
            ((j30_0)object6).T(bl3);
            ((j30_0)object6).T(bl3);
        }
        if ((object6 = ((j30_0)object6).X()) != null) {
            n8 = n3;
            ((CF2)object6).d = object5 = new ur0_0(qz1_23, selectedOrderItem2, n3);
        }
    }
}

