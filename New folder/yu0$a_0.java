/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Yu0$a
 */
public final class yu0$a_0
extends Lambda
implements Function1 {
    public final /* synthetic */ yu0_0 c;

    public yu0$a_0(yu0_0 yu0_02) {
        this.c = yu0_02;
        super(1);
    }

    public final Object invoke(Object object) {
        ((Number)object).floatValue();
        object = yu0_0.a(this.c);
        float f5 = Tu0.b;
        return Float.valueOf(object.J0(f5));
    }
}

