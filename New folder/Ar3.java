/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Ar3
extends Lambda
implements Function1 {
    public final /* synthetic */ gr3 c;
    public final /* synthetic */ gr3 d;

    public Ar3(gr3 gr32, gr3 gr33) {
        this.c = gr32;
        this.d = gr33;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        object = this.c;
        Object object2 = ((gr3)object).j;
        gr3 gr32 = this.d;
        ((p83_0)object2).add(gr32);
        object2 = new zr3_0((gr3)object, gr32);
        return object2;
    }
}

