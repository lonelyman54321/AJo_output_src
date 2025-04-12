/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ul$b
 */
public final class ul$b_0
extends Lambda
implements Function2 {
    public final /* synthetic */ Sl c;
    public final /* synthetic */ List d;
    public final /* synthetic */ int e;

    public ul$b_0(Sl sl, List list, int n3) {
        this.c = sl;
        this.d = list;
        this.e = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.e | 1);
        Sl sl = this.c;
        List list = this.d;
        Ul.a(sl, list, (b30_0)object, n3);
        return Unit.a;
    }
}

