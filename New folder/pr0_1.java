/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.ExploreBrandsPageModel;
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PR0
 */
public final class pr0_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public pr0_1(dr0_0 dr0_02, boolean bl2, String string2, f80_0 f80_02) {
        this.a = dr0_02;
        this.b = bl2;
        this.c = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.b;
        String string2 = this.c;
        dr0_0 dr0_02 = this.a;
        object = new pr0_1(dr0_02, bl2, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pr0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pr0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        Object object2;
        Object object3 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object3 = ((dr0_0)object).z.getValue();
        boolean bl3 = object3 instanceof HK0$d;
        String string2 = this.c;
        boolean bl4 = this.b;
        if (bl3) {
            object3 = ((dr0_0)object).z.getValue();
            object2 = "null cannot be cast to non-null type com.ril.ajio.fleek.ui.composable.home.feed.FeedViewState.SUCCESS";
            Intrinsics.checkNotNull(object3, (String)object2);
            object3 = ((HK0$d)object3).a;
            ((dr0_0)object).L((FeedEngineData)object3, bl4, string2);
        }
        if (bl2 = (object2 = ((h83_0)(object3 = ((dr0_0)object).E)).getValue()) instanceof GH0$d) {
            object3 = ((h83_0)object3).getValue();
            object2 = "null cannot be cast to non-null type com.ril.ajio.fleek.ui.composable.home.explorebrands.ExploreBrandsViewState.SUCCESS";
            Intrinsics.checkNotNull(object3, (String)object2);
            object3 = ((GH0$d)object3).a;
            ((dr0_0)object).e0((ExploreBrandsPageModel)object3, bl4, string2);
        }
        return Unit.a;
    }
}

