/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pK0
 */
public final class pk0_1
implements Function0 {
    public final /* synthetic */ dr0_0 a;

    public /* synthetic */ pk0_1(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        object = ((dr0_0)object).z;
        Object object2 = ((h83_0)object).getValue();
        ((h83_0)object).setValue(object2);
        return Unit.a;
    }
}

