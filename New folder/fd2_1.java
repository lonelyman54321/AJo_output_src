/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fd2
 */
public final class fd2_1
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ SelectedOrderItem d;
    public final /* synthetic */ int e;

    public /* synthetic */ fd2_1(String string2, String string3, String string4, SelectedOrderItem selectedOrderItem, int n3) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = selectedOrderItem;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$address");
        String string3 = this.c;
        Intrinsics.checkNotNullParameter(string3, "$phone");
        int n3 = Me3.b(this.e | 1);
        String string4 = this.a;
        SelectedOrderItem selectedOrderItem = this.d;
        de2_0.v(string4, string2, string3, selectedOrderItem, (b30_0)object3, n3);
        return Unit.a;
    }
}

