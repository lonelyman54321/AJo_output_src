/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Er3
 */
public final class er3_0
extends Lambda
implements Function1 {
    public final /* synthetic */ gr3 c;
    public final /* synthetic */ gr3$d d;

    public er3_0(gr3 gr32, gr3$d gr3$d) {
        this.c = gr32;
        this.d = gr3$d;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        object = this.c;
        Object object2 = ((gr3)object).i;
        gr3$d gr3$d = this.d;
        ((p83_0)object2).add(gr3$d);
        object2 = new dr3_0((gr3)object, gr3$d);
        return object2;
    }
}

