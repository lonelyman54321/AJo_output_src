/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vK0
 */
public final class vk0_2
implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ yT1 c;
    public final /* synthetic */ yp0_0 d;

    public /* synthetic */ vk0_2(String string2, dr0_0 dr0_02, yT1 yT12, yp0_0 yp0_02) {
        this.a = string2;
        this.b = dr0_02;
        this.c = yT12;
        this.d = yp0_02;
    }

    public final Object invoke(Object object) {
        object = (ResourceOwner)object;
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        yT1 yT12 = this.c;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        yp0_0 yp0_02 = this.d;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        Intrinsics.checkNotNullParameter(object, "it");
        String string2 = ((ResourceOwner)object).getId();
        object = ((ResourceOwner)object).getCode();
        String string3 = this.a;
        kk0_2 kk0_22 = new kk0_2(string3, dr0_02, yT12, yp0_02);
        ai0_2.r(kk0_22, string2, object);
        return Unit.a;
    }
}

