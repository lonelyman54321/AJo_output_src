/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.ReturnOrderTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from yt0
 */
public final class yt0_0
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ ReturnOrderTracker b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Boolean d;
    public final /* synthetic */ int e;

    public /* synthetic */ yt0_0(String string2, ReturnOrderTracker returnOrderTracker, String string3, Boolean bl2, int n3) {
        this.a = string2;
        this.b = returnOrderTracker;
        this.c = string3;
        this.d = bl2;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        int n3 = Me3.b(this.e | 1);
        String string2 = this.c;
        Boolean bl2 = this.d;
        String string3 = this.a;
        ReturnOrderTracker returnOrderTracker = this.b;
        ht0_1.d(string3, returnOrderTracker, string2, bl2, (b30_0)object3, n3);
        return Unit.a;
    }
}

