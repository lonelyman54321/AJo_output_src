/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.kmm.shared.model.request.HomeReq;
import com.ril.ajio.kmm.shared.repo.HomeRepo;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Tc3
 */
public final class tc3_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ScreenInfo b;
    public final /* synthetic */ String c;
    public final /* synthetic */ HomeReq d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ Map f;
    public final /* synthetic */ uc3_2 g;

    public tc3_2(ScreenInfo screenInfo, String string2, HomeReq homeReq, HashMap hashMap, HashMap hashMap2, uc3_2 uc3_22, f80_0 f80_02) {
        this.b = screenInfo;
        this.c = string2;
        this.d = homeReq;
        this.e = hashMap;
        this.f = hashMap2;
        this.g = uc3_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Object object2 = this.e;
        Map map2 = object2;
        map2 = (HashMap)object2;
        object2 = this.f;
        Map map3 = object2;
        map3 = (HashMap)object2;
        ScreenInfo screenInfo = this.b;
        String string2 = this.c;
        HomeReq homeReq = this.d;
        uc3_2 uc3_22 = this.g;
        object2 = object;
        object = new tc3_2(screenInfo, string2, homeReq, (HashMap)map2, (HashMap)map3, uc3_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (tc3_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((tc3_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            HomeRepo homeRepo = HomeRepo.INSTANCE;
            this.a = n4;
            Map map2 = this.e;
            Map map3 = this.f;
            ScreenInfo screenInfo = this.b;
            String string2 = this.c;
            HomeReq homeReq = this.d;
            object = homeRepo.getHomeData(screenInfo, string2, homeReq, map2, map3, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = (BaseResponse)object;
        this.g.g.setValue(object);
        return Unit.a;
    }
}

