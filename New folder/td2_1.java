/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.ReturnRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Td2
 */
public final class td2_1
implements Function2 {
    public final /* synthetic */ ReturnRequest a;
    public final /* synthetic */ int b;

    public /* synthetic */ td2_1(ReturnRequest returnRequest, int n3) {
        this.a = returnRequest;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        int n3 = Me3.b(this.b | 1);
        de2_0.J(this.a, (b30_0)object, n3);
        return Unit.a;
    }
}

