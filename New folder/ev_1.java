/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Ev
 */
public final class ev_1
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ev_1(int n3, int n4, int n7) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        int n3 = Me3.b(this.c | 1);
        int n4 = this.a;
        int n7 = this.b;
        jv_1.a(n4, n7, (b30_0)object, n3);
        return Unit.a;
    }
}

