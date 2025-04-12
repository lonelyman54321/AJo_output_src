/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from eU2
 */
public final class eu2_1
extends Lambda
implements Function1 {
    public final /* synthetic */ ib3_0 c;

    public eu2_1(tr1_0 tr1_02) {
        this.c = tr1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        float f5 = ((Number)object).floatValue();
        Function1 function1 = (Function1)this.c.getValue();
        object = Float.valueOf(f5);
        return (Float)function1.invoke(object);
    }
}

