/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Bc2
 */
public final class bc2_0
implements gx0_2 {
    public final /* synthetic */ CartEntry a;
    public final /* synthetic */ Ref$ObjectRef b;

    public bc2_0(CartEntry cartEntry, Ref$ObjectRef ref$ObjectRef) {
        this.a = cartEntry;
        this.b = ref$ObjectRef;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (PA)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        int n3 = ((Number)object3).intValue();
        object3 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
        } else {
            object = this.a;
            object2 = ((CartEntry)object).getOrderEntry();
            if (object2 != null) {
                object = ((CartEntry)object).getOrderEntry();
            }
            object = ((CartEntry)object).getProduct();
            object2 = hv3_0.a;
            object2.getClass();
            object = hv3_0.j((Product)object);
            object4.u(1998134191);
            n3 = 8;
            pq_0 pq_02 = u63.a(object, (b30_0)object4, n3);
            object4.I();
            i70$a$e i70$a$e = i70$a.b;
            Object object5 = object = this.b.element;
            object5 = (LP1)object;
            int n7 = 24624;
            int n8 = 104;
            String string2 = "";
            Pd1.a(pq_02, string2, (LP1)object5, null, i70$a$e, 0.0f, null, (b30_0)object4, n7, n8);
        }
        return Unit.a;
    }
}

