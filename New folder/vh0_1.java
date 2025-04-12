/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.explore_brands.ExploreBrandsPageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vH0
 */
public final class vh0_1
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ ExploreBrandsPageModel c;

    public /* synthetic */ vh0_1(Activity activity, dr0_0 dr0_02, ExploreBrandsPageModel exploreBrandsPageModel) {
        this.a = activity;
        this.b = dr0_02;
        this.c = exploreBrandsPageModel;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        object2 = (String)object2;
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Activity activity = this.a;
        if (activity != null) {
            ExploreBrandsPageModel exploreBrandsPageModel = this.c;
            jh0_2 jh0_22 = new jh0_2(dr0_02, exploreBrandsPageModel, bl2, (String)object2);
            dr0_02.getClass();
            dr0_0.c(activity, jh0_22);
        }
        return Unit.a;
    }
}

