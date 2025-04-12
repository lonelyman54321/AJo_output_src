/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jK0
 */
public final class jk0_2
implements Function0 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ FeedEngineData b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ jk0_2(dr0_0 dr0_02, FeedEngineData feedEngineData, boolean bl2, String string2, String string3) {
        this.a = dr0_02;
        this.b = feedEngineData;
        this.c = bl2;
        this.d = string2;
        this.e = string3;
    }

    public final Object invoke() {
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        boolean bl2 = this.c ^ true;
        Object object = dr0_0.Companion;
        object = this.b;
        String string2 = this.d;
        String string3 = this.e;
        dr0_02.R((FeedEngineData)object, bl2, string2, string3, true);
        return Unit.a;
    }
}

