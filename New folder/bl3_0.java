/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from bl3
 */
public final class bl3_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Vo0 c;
    public final /* synthetic */ tr1_0 d;

    public bl3_0(Vo0 vo0, tr1_0 tr1_02) {
        this.c = vo0;
        this.d = tr1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((bs0_0)object).a;
        float f5 = bs0_0.b(l2);
        Vo0 vo0 = this.c;
        int n3 = vo0.e0(f5);
        float f6 = bs0_0.a(l2);
        int n4 = vo0.e0(f6);
        l2 = dj1.a(n3, n4);
        object = new bj1(l2);
        this.d.setValue(object);
        return Unit.a;
    }
}

