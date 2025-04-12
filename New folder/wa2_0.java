/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WA2
 */
public final class wa2_0
implements Function1 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;

    public /* synthetic */ wa2_0(dr0_0 dr0_02, Activity activity) {
        this.a = activity;
        this.b = dr0_02;
    }

    public final Object invoke(Object object) {
        object = (Resource)object;
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        UA2 uA2 = new UA2(dr0_02);
        dr0_02 = this.a;
        ai0_2.r(uA2, dr0_02, object);
        return Unit.a;
    }
}

