/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class FB1$a
extends Lambda
implements Function0 {
    public final /* synthetic */ fb1_0 c;

    public FB1$a(fb1_0 fb1_02) {
        this.c = fb1_02;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        QB1 qB1 = ((fb1_0)object).p();
        float f5 = 0.0f;
        if (qB1 != null) {
            float f6 = ((fb1_0)object).j();
            float f7 = f6 - 0.0f;
            Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (object2 < 0) {
                if ((object = ((fb1_0)object).r()) != null) {
                    f5 = ((PB1)object).b();
                }
            } else {
                f5 = (object = ((fb1_0)object).r()) != null ? ((PB1)object).a() : 1.0f;
            }
        }
        return Float.valueOf(f5);
    }
}

