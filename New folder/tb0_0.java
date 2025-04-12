/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tb0
 */
public final class tb0_0
implements Function0 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ i90_0 c;

    public /* synthetic */ tb0_0(ob0_1 ob0_12, Context context, c80 c802) {
        this.a = ob0_12;
        this.b = context;
        this.c = c802;
    }

    public final Object invoke() {
        ob0_1 ob0_12 = this.a;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "$context");
        i90_0 i90_02 = this.c;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        ob0_12.getClass();
        Intrinsics.checkNotNullParameter(object, "context");
        at2_1.d(object);
        object = new vb0$a(ob0_12, null);
        Ae3.d(i90_02, null, null, (Function2)object, 3);
        return Unit.a;
    }
}

