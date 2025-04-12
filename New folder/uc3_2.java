/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import com.ril.ajio.data.repo.StoreLPRepo;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.ResponseStatusType;
import com.ril.ajio.kmm.shared.util.CommonFlow;
import com.ril.ajio.kmm.shared.util.CommonFlowKt;
import com.ril.ajio.services.data.sis.StoreInfo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Uc3
 */
public final class uc3_2
extends Hj {
    public final StoreLPRepo a;
    public String b;
    public String c;
    public StoreInfo d;
    public final String e;
    public final t30_0 f;
    public final kb3_2 g;
    public final CommonFlow h;
    public final CategoryNavigationRepo i;
    public final zr1_1 j;
    public final zr1_1 k;
    public final zr1_1 l;

    public uc3_2(Application object) {
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        Object object2 = new StoreLPRepo();
        this.a = object2;
        this.e = "";
        this.f = object2 = new t30_0();
        ResponseStatusType responseStatusType = ResponseStatusType.API_LOADING;
        object2 = new BaseResponse(responseStatusType, null, null, null, null, null, 62, null);
        this.g = object2 = lb3_2.a(object2);
        this.h = object2 = CommonFlowKt.asCommonFlow((es0_2)object2);
        this.i = object2 = new CategoryNavigationRepo((Context)object);
        super();
        this.j = object;
        super();
        this.k = object;
        super();
        this.l = object;
    }

    public final void onCleared() {
        super.onCleared();
        t30_0 t30_02 = this.f;
        boolean bl2 = t30_02.b;
        if (!bl2) {
            t30_02 = this.f;
            t30_02.d();
        }
    }
}

