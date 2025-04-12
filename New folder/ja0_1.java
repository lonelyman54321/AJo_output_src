/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ja0
 */
public final class ja0_1
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ ja0_1(LP1 lP1, String string2, String string3, int n3, int n4) {
        this.a = lP1;
        this.b = string2;
        this.c = string3;
        this.d = n3;
        this.e = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        LP1 lP1 = this.a;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$step");
        String string3 = this.c;
        Intrinsics.checkNotNullParameter(string3, "$desc");
        int n3 = Me3.b(this.e | 1);
        int n4 = this.d;
        ka0_1.a(lP1, string2, string3, n4, (b30_0)object3, n3);
        return Unit.a;
    }
}

