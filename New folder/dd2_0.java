/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Dd2
 */
public final class dd2_0
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ dd2_0(int n3, String string2, String string3, boolean bl2) {
        this.a = string2;
        this.b = string3;
        this.c = bl2;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        int n3 = Me3.b(this.d | 1);
        String string2 = this.a;
        String string3 = this.b;
        boolean bl2 = this.c;
        de2_0.o(string2, string3, bl2, (b30_0)object, n3);
        return Unit.a;
    }
}

