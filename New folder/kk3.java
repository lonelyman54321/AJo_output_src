/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class kk3
extends Lambda
implements Function1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ tr1_0 d;

    public kk3(tr1_0 tr1_02, float f5) {
        this.c = f5;
        this.d = tr1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        block3: {
            long l2;
            tr1_0 tr1_02;
            float f5;
            float f6;
            block2: {
                object = (C63)object;
                long l3 = ((C63)object).a;
                f6 = C63.d(l3);
                float f7 = this.c;
                f6 *= f7;
                f5 = C63.b(l3) * f7;
                tr1_02 = this.d;
                C63 c63 = (C63)tr1_02.getValue();
                l2 = c63.a;
                f7 = C63.d(l2);
                float f8 = f7 - f6;
                Object object2 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                if (object2 != false) break block2;
                c63 = (C63)tr1_02.getValue();
                l2 = c63.a;
                f7 = C63.b(l2);
                float f11 = f7 - f5;
                object2 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                if (object2 == false) break block3;
            }
            l2 = bo1_1.a(f6, f5);
            object = new C63(l2);
            tr1_02.setValue(object);
        }
        return Unit.a;
    }
}

