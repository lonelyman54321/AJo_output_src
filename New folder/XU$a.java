/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

public final class XU$a
implements Function0 {
    public final /* synthetic */ xu_1 a;
    public final /* synthetic */ yn1_2 b;

    public XU$a(xu_1 xu_12, yn1_2 yn1_22) {
        this.a = xu_12;
        this.b = yn1_22;
    }

    public final Object invoke() {
        Object object = this.a.a;
        yn1_2 yn1_22 = this.b;
        object = (KSerializer)object.invoke(yn1_22);
        yi_2 yi_22 = new yi_2((KSerializer)object);
        return yi_22;
    }
}

