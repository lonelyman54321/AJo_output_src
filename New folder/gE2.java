/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class gE2
extends jD3 {
    public final R53 a;
    public final R53 b;
    public final t30_0 c;
    public final zr1_1 d;
    public final zr1_1 e;
    public final zr1_1 f;
    public final zr1_1 g;
    public final zr1_1 h;

    public gE2() {
        Object object = new R53();
        this.a = object;
        object = new R53();
        this.b = object;
        this.c = object = new t30_0();
        this.d = object = new zr1_1();
        this.e = object = new zr1_1();
        this.f = object = new zr1_1();
        this.g = object = new zr1_1();
        this.h = object = new zr1_1();
    }

    public final void b(String string2, ArrayList arrayList) {
        int n3 = 1;
        Object object = "reviewId";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Intrinsics.checkNotNullParameter(arrayList, "imageIds");
        Object object2 = sE2.a;
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Intrinsics.checkNotNullParameter(arrayList, "imageIdsList");
        object = sE2.a;
        object2 = ((UserInformation)object).getCustomerUUID();
        Object object3 = UrlHelper.Companion.getInstance();
        Object object4 = new Object[n3];
        object4[0] = object2;
        object2 = ((UrlHelper)object3).getApiUrl("ratings", "delete_review_images", object4);
        Intrinsics.checkNotNullExpressionValue(object, "userInformation");
        object3 = ServiceUtil.getToken((UserInformation)object);
        object4 = kp1_0.c("Bearer ", (String)object3);
        String string3 = ((UserInformation)object).getUserEmailId();
        Intrinsics.checkNotNullExpressionValue(string3, "getUserEmailId(...)");
        object = sE2.b;
        object3 = sE2.e;
        String string4 = sE2.c;
        String string5 = sE2.d;
        object = object.deleteReviewImage((String)object2, (String)object3, (String)object4, string4, string5, "deleteReviewImage", string2, arrayList, string3);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = new Object();
        object3 = new l9_0(n3, (Function1)object2);
        object2 = new s53_0((q63_0)object, (bx0_2)object3);
        object = new Object();
        object3 = new u53_0((q63_0)object2, (bx0_2)object);
        Intrinsics.checkNotNullExpressionValue(object3, "onErrorReturn(...)");
        object = new Object();
        object2 = new xo0_0(object);
        object = new m61_0(n3);
        object4 = new TD2((m61_0)object);
        object = ((g53_0)object3).f((o60_0)object2, (o60_0)object4);
        this.c.b((yr0_2)object);
    }

    public final void onCleared() {
        super.onCleared();
        t30_0 t30_02 = this.c;
        boolean bl2 = t30_02.b;
        if (!bl2) {
            t30_02 = this.c;
            t30_02.d();
        }
    }
}

