/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ud2
 */
public final class ud2_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ qz1_2 i;
    public final /* synthetic */ Product j;
    public final /* synthetic */ CartEntry k;
    public final /* synthetic */ CartOrder l;
    public final /* synthetic */ SelectedOrderItem m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ ud2_2(String string2, String string3, String string4, String string5, String string6, float f5, boolean bl2, boolean bl3, qz1_2 qz1_22, Product product, CartEntry cartEntry, CartOrder cartOrder, SelectedOrderItem selectedOrderItem, boolean bl4, int n3, int n4) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = string6;
        this.f = f5;
        this.g = bl2;
        this.h = bl3;
        this.i = qz1_22;
        this.j = product;
        this.k = cartEntry;
        this.l = cartOrder;
        this.m = selectedOrderItem;
        this.n = bl4;
        this.o = n3;
        this.p = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        ((Integer)object2).getClass();
        Object object5 = object4 = this.e;
        Intrinsics.checkNotNullParameter(object4, "$price");
        Object object6 = object4 = this.i;
        Intrinsics.checkNotNullParameter(object4, "$viewModel");
        int n3 = Me3.b(this.o | 1);
        int n4 = Me3.b(this.p);
        SelectedOrderItem selectedOrderItem = this.m;
        boolean bl2 = this.n;
        object4 = this.a;
        String string2 = this.b;
        String string3 = this.c;
        String string4 = this.d;
        float f5 = this.f;
        boolean bl3 = this.g;
        boolean bl4 = this.h;
        Product product = this.j;
        CartEntry cartEntry = this.k;
        CartOrder cartOrder = this.l;
        de2_0.w((String)object4, string2, string3, string4, (String)object5, f5, bl3, bl4, (qz1_2)object6, product, cartEntry, cartOrder, selectedOrderItem, bl2, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

