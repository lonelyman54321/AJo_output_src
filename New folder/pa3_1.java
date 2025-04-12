/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.analytics.events.ServiceErrorEventTracker;
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Pa3
 */
public final class pa3_1
extends Hj {
    public final SU2 a;
    public final mw0_1 b;
    public final HomeRepo c;
    public final CategoryNavigationRepo d;
    public final ServiceErrorEventTracker e;
    public final hh3_2 f;
    public final zr1_1 g;
    public final zr1_1 h;
    public final zr1_1 i;
    public final zr1_1 j;
    public final zr1_1 k;
    public final zr1_1 l;
    public final t30_0 m;

    public pa3_1(Application object, SU2 object2, mw0_1 mw0_12) {
        Intrinsics.checkNotNullParameter(object, "application");
        Intrinsics.checkNotNullParameter(object2, "searchDBRepository");
        Intrinsics.checkNotNullParameter(mw0_12, "dynamicModulesLoader");
        super((Application)object);
        this.a = object2;
        this.b = mw0_12;
        this.c = object2 = new HomeRepo((Context)object);
        this.d = object2 = new CategoryNavigationRepo((Context)object);
        object = ServiceErrorEventTracker.INSTANCE;
        this.e = object;
        super();
        object = yr1_2.b((Function0)object);
        this.f = object;
        super();
        this.g = object;
        this.h = object;
        super();
        this.i = object;
        this.j = object;
        super();
        this.k = object;
        this.l = object;
        super();
        this.m = object;
    }

    public final UserInformation b() {
        Object object = this.f.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (UserInformation)object;
    }

    public final void c(qu3 qu32) {
        Intrinsics.checkNotNullParameter(qu32, "utmParams");
        String string2 = qu32.d;
        String string3 = "timeout";
        String string4 = null;
        boolean bl2 = StringsKt.F(string2, string3, false);
        string2 = bl2 ? "splash_screen_utm - timeout" : "splash_screen_utm - failure";
        Object object = qu32.d;
        int n3 = StringsKt.F((CharSequence)object, string3, false);
        n3 = n3 != 0 ? 400 : 500;
        string4 = qu32.f;
        object = this.e;
        float f5 = qu32.e;
        ((ServiceErrorEventTracker)object).trackUTMServiceErrorEvent(string2, n3, string4, f5);
    }

    public final void onCleared() {
        super.onCleared();
        this.m.dispose();
        this.c.onViewModelCleared();
    }
}

