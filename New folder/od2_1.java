/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Od2
 */
public final class od2_1
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ od2_1(String string2, int n3, boolean bl2, String string3, boolean bl3, int n4, int n7) {
        this.a = string2;
        this.b = n3;
        this.c = bl2;
        this.d = string3;
        this.e = bl3;
        this.f = n4;
        this.g = n7;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        String string2 = this.a;
        int n4 = this.b;
        boolean bl2 = this.c;
        String string3 = this.d;
        boolean bl3 = this.e;
        int n7 = this.g;
        de2_0.n(string2, n4, bl2, string3, bl3, (b30_0)object3, n3, n7);
        return Unit.a;
    }
}

