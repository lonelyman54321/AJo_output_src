/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.services.data.fleek.brand_page.BrandPageModel;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ZQ0
 */
public final class zq0_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xr0_2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Map e;

    public zq0_1(xr0_2 xr0_22, String string2, LinkedHashMap linkedHashMap, f80_0 f80_02) {
        this.c = xr0_22;
        this.d = string2;
        this.e = linkedHashMap;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        xr0_2 xr0_22 = this.c;
        LinkedHashMap linkedHashMap = (LinkedHashMap)this.e;
        String string2 = this.d;
        zq0_1 zq0_12 = new zq0_1(xr0_22, string2, linkedHashMap, f80_02);
        zq0_12.b = object;
        return zq0_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (zq0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zq0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block8: {
            Object object2;
            Object object3;
            String string2;
            Object object4;
            Object object5;
            Object object6;
            int n3;
            int n4;
            int n7;
            j90_0 j90_02;
            block9: {
                block6: {
                    block7: {
                        j90_02 = j90_0.COROUTINE_SUSPENDED;
                        int n8 = this.a;
                        n7 = 2;
                        n4 = 3;
                        n3 = 1;
                        if (n8 == 0) break block6;
                        if (n8 == n3) break block7;
                        if (n8 != n7 && n8 != n4) {
                            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw object;
                        }
                        vl2_2.b(object);
                        break block8;
                    }
                    object6 = (fs0_2)this.b;
                    vl2_2.b(object);
                    break block9;
                }
                vl2_2.b(object);
                object6 = object = this.b;
                object6 = (fs0_2)object;
                object = this.c;
                object5 = ((xr0_2)object).a;
                object4 = ServiceUtil.getToken(((xr0_2)object).a());
                string2 = kp1_0.c("Bearer ", (String)object4);
                this.b = object6;
                this.a = n3;
                object3 = object4 = this.e;
                object3 = (LinkedHashMap)object4;
                object4 = this.d;
                String string3 = ((xr0_2)object).b;
                object2 = this;
                object = ((cq0_1)object5).b((String)object4, string2, string3, (LinkedHashMap)object3, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object4 = object;
            object4 = (dl2_2)object;
            object = (BrandPageModel)((dl2_2)object4).b;
            object5 = ((dl2_2)object4).a;
            boolean bl2 = ((cl2_2)object5).d();
            if (bl2 && (object5 = ((dl2_2)object4).b) != null) {
                KK2$c kK2$c = new kk2_1(object, n7);
                this.b = null;
                this.a = n7;
                object = object6.emit(kK2$c, this);
                if (object == j90_02) {
                    return j90_02;
                }
            } else {
                object5 = ApiErrorRepo.INSTANCE;
                string2 = "brandPageApi";
                boolean bl3 = true;
                object3 = "";
                object2 = "Forward";
                ((ApiErrorRepo)object5).handleApiError((dl2_2)object4, string2, bl3, (String)object3, (String)object2);
                KK2$a kK2$a = new KK2$a(null, object, n3);
                this.b = null;
                this.a = n4;
                object = object6.emit(kK2$a, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

