/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.ReturnOrderTracker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from xt0
 */
public final class xt0_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ ReturnOrderTracker g;
    public final /* synthetic */ Boolean h;
    public final /* synthetic */ Boolean i;
    public final /* synthetic */ Boolean j;
    public final /* synthetic */ ReturnOrderTracker k;
    public final /* synthetic */ CartEntry l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public /* synthetic */ xt0_2(String string2, String string3, ArrayList arrayList, boolean bl2, String string4, String string5, ReturnOrderTracker returnOrderTracker, Boolean bl3, Boolean bl4, Boolean bl5, ReturnOrderTracker returnOrderTracker2, CartEntry cartEntry, int n3, int n4) {
        this.a = string2;
        this.b = string3;
        this.c = arrayList;
        this.d = bl2;
        this.e = string4;
        this.f = string5;
        this.g = returnOrderTracker;
        this.h = bl3;
        this.i = bl4;
        this.j = bl5;
        this.k = returnOrderTracker2;
        this.l = cartEntry;
        this.m = n3;
        this.n = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        ((Integer)object2).getClass();
        int n3 = Me3.b(this.m | 1);
        int n4 = Me3.b(this.n);
        ReturnOrderTracker returnOrderTracker = this.k;
        CartEntry cartEntry = this.l;
        object4 = this.a;
        String string2 = this.b;
        ArrayList arrayList = this.c;
        boolean bl2 = this.d;
        String string3 = this.e;
        String string4 = this.f;
        ReturnOrderTracker returnOrderTracker2 = this.g;
        Boolean bl3 = this.h;
        Boolean bl4 = this.i;
        Boolean bl5 = this.j;
        ht0_1.f((String)object4, string2, arrayList, bl2, string3, string4, returnOrderTracker2, bl3, bl4, bl5, returnOrderTracker, cartEntry, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

