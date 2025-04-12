/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.services.data.fleek.explore_brands.ExploreBrandsPageModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from dR0
 */
public final class dr0_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xr0_2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Map f;

    public dr0_1(xr0_2 xr0_22, String string2, String string3, LinkedHashMap linkedHashMap, f80_0 f80_02) {
        this.c = xr0_22;
        this.d = string2;
        this.e = string3;
        this.f = linkedHashMap;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_1 dr0_12;
        String string2 = this.d;
        Object object2 = this.f;
        Map map2 = object2;
        map2 = (LinkedHashMap)object2;
        xr0_2 xr0_22 = this.c;
        String string3 = this.e;
        object2 = dr0_12;
        dr0_12 = new dr0_1(xr0_22, string2, string3, (LinkedHashMap)map2, f80_02);
        dr0_12.b = object;
        return dr0_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (dr0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((dr0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block10: {
            Object object2;
            String string2;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
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
                            object6 = (fs0_2)this.b;
                            vl2_2.b(object);
                            break block11;
                        }
                        object6 = (fs0_2)this.b;
                        vl2_2.b(object);
                        break block12;
                    }
                    vl2_2.b(object);
                    object = (fs0_2)this.b;
                    object6 = new KK2$b();
                    this.b = object;
                    this.a = n3;
                    object6 = object.emit(object6, this);
                    if (object6 == j90_02) {
                        return j90_02;
                    }
                    object6 = object;
                }
                object = this.c;
                object5 = ((xr0_2)object).a;
                this.b = object6;
                this.a = n8;
                object3 = object4 = this.f;
                object3 = (LinkedHashMap)object4;
                object4 = this.d;
                string2 = this.e;
                String string3 = ((xr0_2)object).b;
                object2 = this;
                object = ((cq0_1)object5).c((String)object4, string2, string3, (LinkedHashMap)object3, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object4 = object;
            object4 = (dl2_2)object;
            object = (ExploreBrandsPageModel)((dl2_2)object4).b;
            object5 = ((dl2_2)object4).a;
            boolean bl2 = ((cl2_2)object5).d();
            if (bl2 && (object5 = ((dl2_2)object4).b) != null) {
                KK2$c kK2$c = new kk2_1(object, n8);
                this.b = null;
                this.a = n4;
                object = object6.emit(kK2$c, this);
                if (object == j90_02) {
                    return j90_02;
                }
            } else {
                object5 = ApiErrorRepo.INSTANCE;
                string2 = "exploreBrandsApi";
                boolean bl3 = true;
                object3 = "";
                object2 = "Forward";
                ((ApiErrorRepo)object5).handleApiError((dl2_2)object4, string2, bl3, (String)object3, (String)object2);
                KK2$a kK2$a = new KK2$a(null, object, n3);
                this.b = null;
                this.a = n7;
                object = object6.emit(kK2$a, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

