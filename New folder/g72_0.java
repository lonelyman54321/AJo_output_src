/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from G72
 */
public final class g72_0
implements Function0 {
    public final /* synthetic */ CoroutineContext a;
    public final /* synthetic */ bg2_2 b;

    public /* synthetic */ g72_0(bg2_2 bg2_22, CoroutineContext coroutineContext) {
        this.a = coroutineContext;
        this.b = bg2_22;
    }

    public final Object invoke() {
        e01_0 e01_02 = e01_0.a;
        Object object = this.b;
        H72$a h72$a = new H72$a((bg2_2)object, null);
        object = this.a;
        return kf_1.e((i90_0)e01_02, (CoroutineContext)object, (Function2)h72$a, (int)2).a;
    }
}

