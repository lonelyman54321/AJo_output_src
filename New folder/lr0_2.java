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
 * Renamed from lR0
 */
public final class lr0_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xr0_2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ int f;

    public lr0_2(xr0_2 xr0_22, String string2, LinkedHashMap linkedHashMap, int n3, f80_0 f80_02) {
        this.c = xr0_22;
        this.d = string2;
        this.e = linkedHashMap;
        this.f = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        lr0_2 lr0_22;
        String string2 = this.d;
        Object object2 = this.e;
        Map map2 = object2;
        map2 = (LinkedHashMap)object2;
        xr0_2 xr0_22 = this.c;
        int n3 = this.f;
        object2 = lr0_22;
        lr0_22 = new lr0_2(xr0_22, string2, (LinkedHashMap)map2, n3, f80_02);
        lr0_22.b = object;
        return lr0_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (lr0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((lr0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block10: {
            Object object2;
            String string2;
            Object object3;
            Object object4;
            Object object5;
            int n3;
            int n4;
            int n7;
            int n8;
            j90_0 j90_02;
            block11: {
                block12: {
                    block7: {
                        block8: {
                            block9: {
                                j90_02 = j90_0.COROUTINE_SUSPENDED;
                                int n10 = this.a;
                                n8 = 2;
                                n7 = 4;
                                n4 = 3;
                                n3 = 1;
                                if (n10 == 0) break block7;
                                if (n10 == n3) break block8;
                                if (n10 == n8) break block9;
                                if (n10 != n4 && n10 != n7) {
                                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw object;
                                }
                                vl2_2.b(object);
                                break block10;
                            }
                            object5 = (fs0_2)this.b;
                            vl2_2.b(object);
                            break block11;
                        }
                        object5 = (fs0_2)this.b;
                        vl2_2.b(object);
                        break block12;
                    }
                    vl2_2.b(object);
                    object = (fs0_2)this.b;
                    object5 = new KK2$b();
                    this.b = object;
                    this.a = n3;
                    object5 = object.emit(object5, this);
                    if (object5 == j90_02) {
                        return j90_02;
                    }
                    object5 = object;
                }
                object = this.c;
                object4 = ((xr0_2)object).a;
                object3 = ServiceUtil.getToken(((xr0_2)object).a());
                string2 = kp1_0.c("Bearer ", (String)object3);
                this.b = object5;
                this.a = n8;
                int n14 = this.f;
                object2 = object3 = this.e;
                object2 = (LinkedHashMap)object3;
                object3 = this.d;
                String string3 = ((xr0_2)object).b;
                object = ((cq0_1)object4).g((String)object3, string2, string3, (LinkedHashMap)object2, n14, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object3 = object;
            object3 = (dl2_2)object;
            object = (BrandPageModel)((dl2_2)object3).b;
            object4 = ((dl2_2)object3).a;
            boolean bl2 = ((cl2_2)object4).d();
            if (bl2 && (object4 = ((dl2_2)object3).b) != null) {
                KK2$c kK2$c = new kk2_1(object, n8);
                this.b = null;
                this.a = n4;
                object = object5.emit(kK2$c, this);
                if (object == j90_02) {
                    return j90_02;
                }
            } else {
                object4 = ApiErrorRepo.INSTANCE;
                string2 = "recentPostApi";
                boolean bl3 = true;
                object2 = "";
                String string4 = "Forward";
                ((ApiErrorRepo)object4).handleApiError((dl2_2)object3, string2, bl3, (String)object2, string4);
                KK2$a kK2$a = new KK2$a(null, object, n3);
                this.b = null;
                this.a = n7;
                object = object5.emit(kK2$a, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

