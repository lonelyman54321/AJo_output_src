/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.network.HttpClientProvider;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Ba1
 */
public final class ba1_1
implements Function1 {
    public final /* synthetic */ x72_0 a;

    public /* synthetic */ ba1_1(x72_0 x72_02) {
        this.a = x72_02;
    }

    public final Object invoke(Object object) {
        x72_0 x72_02 = this.a;
        object = (b72_0)object;
        return HttpClientProvider.a(x72_02, (b72_0)object);
    }
}

