/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.gestures.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from aU2
 */
public final class au2_1
extends Lambda
implements Function2 {
    public final /* synthetic */ l c;

    public au2_1(l l2) {
        this.c = l2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        float f5 = ((Number)object).floatValue();
        float f6 = ((Number)object2).floatValue();
        l l2 = this.c;
        i90_0 i90_02 = l2.f1();
        zt2_1 zt2_12 = new zt2_1(l2, f5, f6, null);
        Ae3.d(i90_02, null, null, zt2_12, 3);
        return Boolean.TRUE;
    }
}

