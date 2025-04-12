/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from qe0
 */
public final class qe0_1
extends Lambda
implements Function1 {
    public final /* synthetic */ gr3 c;

    public qe0_1(gr3 gr32) {
        this.c = gr32;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = this.c.d.getValue();
        return Intrinsics.areEqual(object, object2) ^ true;
    }
}

