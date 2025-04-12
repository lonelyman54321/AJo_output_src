/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class cA0
extends Lambda
implements Function1 {
    public final /* synthetic */ ib3_0 c;
    public final /* synthetic */ ib3_0 d;
    public final /* synthetic */ ib3_0 e;

    public cA0(gr3$a$a gr3$a$a, gr3$a$a gr3$a$a2, gr3$a$a gr3$a$a3) {
        this.c = gr3$a$a;
        this.d = gr3$a$a2;
        this.e = gr3$a$a3;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2;
        Object object2;
        float f5;
        float f6;
        object = (a11_0)object;
        float f7 = 1.0f;
        Object object3 = this.c;
        if (object3 != null) {
            object3 = (Number)object3.getValue();
            f6 = ((Number)object3).floatValue();
        } else {
            f6 = 1.0f;
        }
        object.b(f6);
        object3 = this.d;
        if (object3 != null) {
            Number number = (Number)object3.getValue();
            f5 = number.floatValue();
        } else {
            f5 = 1.0f;
        }
        object.d(f5);
        if (object3 != null) {
            object2 = (Number)object3.getValue();
            f7 = ((Number)object2).floatValue();
        }
        object.k(f7);
        object2 = this.e;
        if (object2 != null) {
            object2 = (Oq3)object2.getValue();
            l2 = ((Oq3)object2).a;
        } else {
            l2 = Oq3.b;
        }
        object.f0(l2);
        return Unit.a;
    }
}

