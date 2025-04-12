/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

/*
 * Renamed from vd0
 */
public final class vd0_0
implements BreadcrumbHandler {
    public final /* synthetic */ CrashlyticsCore a;

    public /* synthetic */ vd0_0(CrashlyticsCore crashlyticsCore) {
        this.a = crashlyticsCore;
    }

    public final void handleBreadcrumb(String string2) {
        this.a.log(string2);
    }
}

