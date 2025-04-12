/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import com.ril.ajio.services.data.fleek.seen_components.ShareActionRequestBody;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RC
 */
public final class rc_1
implements Function0 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ SubcomponentsOwner b;
    public final /* synthetic */ Subcomponent c;
    public final /* synthetic */ i90_0 d;
    public final /* synthetic */ yp0_0 e;
    public final /* synthetic */ String f;

    public /* synthetic */ rc_1(dr0_0 dr0_02, SubcomponentsOwner subcomponentsOwner, Subcomponent subcomponent, c80 c802, yp0_0 yp0_02, String string2) {
        this.a = dr0_02;
        this.b = subcomponentsOwner;
        this.c = subcomponent;
        this.d = c802;
        this.e = yp0_02;
        this.f = string2;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$subComponentsOwner");
        Subcomponent subcomponent = this.c;
        Intrinsics.checkNotNullParameter(subcomponent, "$subcomponent");
        i90_0 i90_02 = this.d;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        yp0_0 yp0_02 = this.e;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        object2 = ((SubcomponentsOwner)object2).getName();
        object.getClass();
        object2 = dr0_0.m((String)object2);
        String string2 = subcomponent.getId();
        string2 = kp1_0.c("https://www.ajiogram.ajio.com/post/", string2);
        ShareActionRequestBody shareActionRequestBody = dr0_0.n(subcomponent.getId(), "BRAND_PAGE");
        Object object3 = subcomponent.getPostMedia();
        object3 = object3 != null && (object3 = (Media)CollectionsKt.firstOrNull((List)object3)) != null ? ((Media)object3).getThumbnailUrl() : null;
        ((dr0_0)object).c0((String)object2, string2, shareActionRequestBody, (String)object3);
        object2 = this.f;
        object = new bd_2(yp0_02, (String)object2, subcomponent, null);
        Ae3.d(i90_02, null, null, (Function2)object, 3);
        return Unit.a;
    }
}

