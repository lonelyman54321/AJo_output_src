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

public final class TG0
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ ExploreBrandsPageModel c;

    public /* synthetic */ TG0(Activity activity, dr0_0 dr0_02, ExploreBrandsPageModel exploreBrandsPageModel) {
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
            pH0 pH02 = new pH0(dr0_02, exploreBrandsPageModel, bl2, (String)object2);
            dr0_02.getClass();
            dr0_0.c(activity, pH02);
        }
        return Unit.a;
    }
}

