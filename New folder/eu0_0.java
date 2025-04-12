/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Eu0
 */
public final class eu0_0
extends Lambda
implements Function0 {
    public final /* synthetic */ float c;
    public final /* synthetic */ yu0_0 d;

    public eu0_0(float f5, yu0_0 yu0_02) {
        this.c = f5;
        this.d = yu0_02;
        super(0);
    }

    public final Object invoke() {
        Re re = this.d.a;
        float f5 = re.e();
        float f6 = Tu0.a;
        f6 = this.c;
        f5 -= f6;
        float f7 = 0.0f;
        float f8 = (f5 /= (f6 = 0.0f - f6)) - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object >= 0) {
            f7 = f5;
        }
        f5 = 1.0f;
        object = f7 == f5 ? 0 : (f7 > f5 ? 1 : -1);
        if (object > 0) {
            f7 = 1.0f;
        }
        return Float.valueOf(f7);
    }
}

