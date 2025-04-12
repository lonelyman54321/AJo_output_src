/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from dk3
 */
public final class dk3_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Gx0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Ref$ObjectRef e;

    public dk3_0(Gx0 gx0, Vt1$b vt1$b, Ref$ObjectRef ref$ObjectRef) {
        this.c = gx0;
        this.d = vt1$b;
        this.e = ref$ObjectRef;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (List)object;
        Il3 il3 = (Il3)this.e.element;
        Gx0 gx0 = this.c;
        object = gx0.a((List)object);
        if (il3 != null) {
            gx0 = null;
            il3.a(null, (ql3_0)object);
        }
        this.d.invoke(object);
        return Unit.a;
    }
}

