/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.data.repo.NewPDPRepo;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.ResponseStatusType;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IE0
 */
public final class ie0_1
extends Hj {
    public final hh3_2 a;
    public final hh3_2 b;
    public final zr1_1 c;
    public final zr1_1 d;
    public final LinkedHashMap e;
    public String f;

    public ie0_1(Application object) {
        BaseResponse baseResponse;
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        Object object2 = new bo0_1(this, 1);
        this.a = object2 = yr1_2.b((Function0)object2);
        object2 = new Object();
        this.b = object2 = yr1_2.b((Function0)object2);
        new t30_0();
        new NewPDPRepo((Context)object);
        new zr1_1();
        ResponseStatusType responseStatusType = ResponseStatusType.API_LOADING;
        object2 = baseResponse;
        baseResponse = new BaseResponse(responseStatusType, null, null, null, null, null, 62, null);
        super(baseResponse);
        this.c = object;
        this.d = object;
        super();
        this.e = object;
        this.f = "";
    }
}

