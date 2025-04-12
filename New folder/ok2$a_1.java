/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ok2$a
 */
public final class ok2$a_1
extends Lambda
implements Function1 {
    public final /* synthetic */ Ns2 c;
    public final /* synthetic */ dl1_1 d;
    public final /* synthetic */ ok2_1 e;

    public ok2$a_1(Ns2 ns2, dl1_1 dl1_12, ok2_1 ok2_12) {
        this.c = ns2;
        this.d = dl1_12;
        this.e = ok2_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        ok2_1 ok2_12 = this.e;
        mk2_0 mk2_02 = ok2_12.n;
        Object object2 = this.d;
        bp1_0 bp1_02 = object2.getLayoutDirection();
        float f5 = mk2_02.calculateLeftPadding-u2uoSUM(bp1_02);
        int n3 = object2.e0(f5);
        float f6 = ok2_12.n.calculateTopPadding-D9Ej5fM();
        int n4 = object2.e0(f6);
        object2 = this.c;
        Ns2$a.d((Ns2$a)object, (Ns2)object2, n3, n4);
        return Unit.a;
    }
}

