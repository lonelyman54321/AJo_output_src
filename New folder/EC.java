/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class EC
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ i90_0 b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ Component e;
    public final /* synthetic */ yp0_0 f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ EC(Activity activity, c80 c802, dr0_0 dr0_02, Ref$ObjectRef ref$ObjectRef, Component component, yp0_0 yp0_02, boolean bl2) {
        this.a = activity;
        this.b = c802;
        this.c = dr0_02;
        this.d = ref$ObjectRef;
        this.e = component;
        this.f = yp0_02;
        this.g = bl2;
    }

    public final Object invoke() {
        i90_0 i90_02 = this.b;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Serializable serializable = this.d;
        Intrinsics.checkNotNullParameter(serializable, "$brandsPageData");
        yp0_0 yp0_02 = this.f;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        Object object = this.a;
        Component component = this.e;
        if (object != null) {
            nc_1 nc_12 = new nc_1(serializable, 0, component, dr0_02);
            dr0_02.getClass();
            dr0_0.c(object, nc_12);
        }
        boolean bl2 = this.g;
        object = serializable;
        serializable = new ad_2(yp0_02, dr0_02, bl2, component, null);
        Ae3.d(i90_02, null, null, (Function2)((Object)serializable), 3);
        return Unit.a;
    }
}

