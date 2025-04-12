/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from mx
 */
public final class mx_0
extends Lambda
implements Function2 {
    public final /* synthetic */ ry2_0 c;

    public mx_0(ry2_0 ry2_02) {
        this.c = ry2_02;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (ES2)object;
        ry2_0 ry2_02 = this.c;
        long l2 = ((Number)(object2 = (Number)object2)).longValue();
        boolean bl2 = sy2_0.a(ry2_02, l2);
        object = bl2 ? Long.valueOf(l2) : null;
        return object;
    }
}

