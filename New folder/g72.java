/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class g72
extends Lambda
implements Function1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public g72(float f5, float f6) {
        this.c = f5;
        this.d = f6;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (mi1)object;
        object.getClass();
        float f5 = this.c;
        xs0_0 xs0_02 = new xs0_0(f5);
        object = ((mi1)object).a;
        ((na3_0)object).b(xs0_02, "x");
        f5 = this.d;
        xs0_02 = new xs0_0(f5);
        ((na3_0)object).b(xs0_02, "y");
        return Unit.a;
    }
}

