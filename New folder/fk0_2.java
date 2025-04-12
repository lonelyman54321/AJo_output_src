/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fK0
 */
public final class fk0_2
implements Function0 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ FeedEngineData b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    public /* synthetic */ fk0_2(dr0_0 dr0_02, FeedEngineData feedEngineData, boolean bl2, String string2) {
        this.a = dr0_02;
        this.b = feedEngineData;
        this.c = bl2;
        this.d = string2;
    }

    public final Object invoke() {
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        boolean bl2 = this.c ^ true;
        FeedEngineData feedEngineData = this.b;
        String string2 = this.d;
        dr0_02.P(feedEngineData, bl2, string2);
        return Unit.a;
    }
}

