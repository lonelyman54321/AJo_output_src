/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from EB1
 */
public final class eb1_1
extends Lambda
implements Function1 {
    public final /* synthetic */ fb1_0 c;
    public final /* synthetic */ int d;

    public eb1_1(fb1_0 fb1_02, int n3) {
        this.c = fb1_02;
        this.d = n3;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((Number)object).longValue();
        object = this.c;
        int n3 = this.d;
        return fb1_0.d((fb1_0)object, n3, l2);
    }
}

