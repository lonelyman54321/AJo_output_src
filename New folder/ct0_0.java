/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.ReturnOrderTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Ct0
 */
public final class ct0_0
implements Function2 {
    public final /* synthetic */ ReturnOrderTracker a;
    public final /* synthetic */ ReturnOrderTracker b;
    public final /* synthetic */ CartEntry c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ ct0_0(ReturnOrderTracker returnOrderTracker, ReturnOrderTracker returnOrderTracker2, CartEntry cartEntry, String string2, int n3) {
        this.a = returnOrderTracker;
        this.b = returnOrderTracker2;
        this.c = cartEntry;
        this.d = string2;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        int n3 = Me3.b(this.e | 1);
        CartEntry cartEntry = this.c;
        String string2 = this.d;
        ReturnOrderTracker returnOrderTracker = this.a;
        ReturnOrderTracker returnOrderTracker2 = this.b;
        ht0_1.c(returnOrderTracker, returnOrderTracker2, cartEntry, string2, (b30_0)object3, n3);
        return Unit.a;
    }
}

