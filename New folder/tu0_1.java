/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from TU0
 */
public final class tu0_1
extends Lambda
implements Function1 {
    public final /* synthetic */ vu0_1 c;

    public tu0_1(vu0_1 vu0_12) {
        this.c = vu0_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (ut3)object;
        tv0_0 tv0_02 = ((ut3)object).b;
        int n3 = ((ut3)object).d;
        Object object2 = ((ut3)object).e;
        int n4 = ((ut3)object).c;
        ut3 ut32 = new ut3(null, tv0_02, n4, n3, object2);
        return this.c.b(ut32).getValue();
    }
}

