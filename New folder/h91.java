/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Bundle
 */
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.data.repo.RtbRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.Home.BottomNavigationData;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class h91
extends Hj {
    public final CategoryNavigationRepo A;
    public final hh3_2 a;
    public final HomeRepo b;
    public final UserRepo c;
    public final so_1 d;
    public final RtbRepo e;
    public final zr1_1 f;
    public final zr1_1 g;
    public final zr1_1 h;
    public final zr1_1 i;
    public final zr1_1 j;
    public final zr1_1 k;
    public final zr1_1 l;
    public final zr1_1 m;
    public BottomNavigationData n;
    public BottomNavigationData o;
    public final zr1_1 p;
    public final zr1_1 q;
    public float r;
    public float s;
    public Bundle t;
    public String u;
    public boolean v;
    public boolean w;
    public final String x;
    public final String y;
    public final t30_0 z;

    public h91(Application application, BaseRepo object) {
        Object object2;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(object, "repo");
        super(application);
        super();
        this.a = object2 = yr1_2.b((Function0)object2);
        object = (HomeRepo)object;
        this.b = object;
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        super((Application)object2);
        this.c = object;
        object2 = this.getApplication();
        this.d = object = new so_1((Application)object2);
        object2 = this.getApplication();
        this.e = object = new RtbRepo((Context)object2);
        this.f = object = new zr1_1();
        this.g = object = new zr1_1();
        this.h = object = new zr1_1();
        this.i = object;
        this.j = object = new zr1_1();
        this.k = object;
        this.l = object = new zr1_1();
        this.m = object;
        this.p = object = new zr1_1();
        this.q = object = new zr1_1();
        new zr1_1();
        this.u = object = "";
        this.x = object;
        this.y = object;
        this.z = object = new t30_0();
        this.A = object = new CategoryNavigationRepo((Context)application);
    }

    public final boolean b() {
        Object object = this.a.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return ((UserInformation)object).isUserOnline();
    }

    public final void c() {
        Object object = this.a.getValue();
        Object object2 = "getValue(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (UserInformation)object;
        boolean bl2 = ((UserInformation)object).isUserOnline();
        if (bl2 || (bl2 = ap_0.c())) {
            object = cp_1.Companion;
            object2 = this.d;
            Object object3 = ((so_1)object2).c;
            Object object4 = "userInformation";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            object.getClass();
            bl2 = cp$a.A((UserInformation)object3);
            if (!bl2) {
                return;
            }
            object = ((so_1)object2).a();
            int n3 = 1;
            object2 = new xb_0(this, n3);
            object3 = new ad0_2(1, (Function1)object2);
            int n4 = 1;
            object2 = new fc_2(n4);
            int n7 = 2;
            object4 = new gc_0(n7, (Function1)object2);
            object = ((g53_0)object).f((o60_0)object3, (o60_0)object4);
            object2 = this.z;
            ((t30_0)object2).b((yr0_2)object);
        }
    }

    public final void onCleared() {
        super.onCleared();
        t30_0 t30_02 = this.z;
        boolean bl2 = t30_02.b;
        if (!bl2) {
            t30_02 = this.z;
            t30_02.dispose();
        }
        this.b.onViewModelCleared();
    }
}

