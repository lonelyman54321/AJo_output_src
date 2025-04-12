/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Qd2
 */
public final class qd2_1
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ qd2_1(boolean bl2, String string2, int n3) {
        this.a = bl2;
        this.b = string2;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        int n3 = Me3.b(this.c | 1);
        boolean bl2 = this.a;
        String string2 = this.b;
        de2_0.L(bl2, string2, (b30_0)object, n3);
        return Unit.a;
    }
}

