/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from ke
 */
public final class ke_1
implements BreadcrumbSource,
bx0_2 {
    public final /* synthetic */ Object a;

    public /* synthetic */ ke_1(Object object) {
        this.a = object;
    }

    public Object apply(Object object) {
        return UserRepo.o((Jx3)((Function1)this.a), object);
    }

    public void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        AnalyticsDeferredProxy.c((AnalyticsDeferredProxy)this.a, breadcrumbHandler);
    }
}

