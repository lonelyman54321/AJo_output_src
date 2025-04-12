/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from pR0
 */
public final class pr0_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xr0_2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Map g;

    public pr0_2(int n3, xr0_2 xr0_22, String string2, String string3, LinkedHashMap linkedHashMap, f80_0 f80_02) {
        this.c = n3;
        this.d = xr0_22;
        this.e = string2;
        this.f = string3;
        this.g = linkedHashMap;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        pr0_2 pr0_22;
        String string2 = this.e;
        Object object2 = this.g;
        Map map2 = object2;
        map2 = (LinkedHashMap)object2;
        int n3 = this.c;
        xr0_2 xr0_22 = this.d;
        String string3 = this.f;
        object2 = pr0_22;
        pr0_22 = new pr0_2(n3, xr0_22, string2, string3, (LinkedHashMap)map2, f80_02);
        pr0_22.b = object;
        return pr0_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (pr0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pr0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block11: {
            String string2;
            Object object2;
            Object object3;
            int n3;
            Object object4;
            Object object5;
            int n4;
            int n7;
            int n8;
            int n10;
            j90_0 j90_02;
            block12: {
                block13: {
                    block8: {
                        block9: {
                            block10: {
                                j90_02 = j90_0.COROUTINE_SUSPENDED;
                                int n14 = this.a;
                                n10 = 2;
                                n8 = 4;
                                n7 = 3;
                                n4 = 1;
                                if (n14 == 0) break block8;
                                if (n14 == n4) break block9;
                                if (n14 == n10) break block10;
                                if (n14 != n7 && n14 != n8) {
                                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw object;
                                }
                                vl2_2.b(object);
                                break block11;
                            }
                            object5 = (fs0_2)this.b;
                            vl2_2.b(object);
                            break block12;
                        }
                        object5 = (fs0_2)this.b;
                        vl2_2.b(object);
                        break block13;
                    }
                    vl2_2.b(object);
                    object5 = object = this.b;
                    object5 = (fs0_2)object;
                    int n15 = this.c;
                    if (n15 == 0) {
                        object = new KK2$b();
                        this.b = object5;
                        this.a = n4;
                        if ((object = object5.emit(object, this)) == j90_02) {
                            return j90_02;
                        }
                    }
                }
                object = this.d;
                object4 = ((xr0_2)object).a;
                dr0_0.Companion.getClass();
                n3 = dr0_0.S0;
                this.b = object5;
                this.a = n10;
                int n16 = this.c;
                object2 = object3 = this.g;
                object2 = (LinkedHashMap)object3;
                object3 = this.e;
                string2 = this.f;
                String string3 = ((xr0_2)object).b;
                object = ((cq0_1)object4).i((String)object3, string2, string3, (LinkedHashMap)object2, n16, n3, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object3 = object;
            object3 = (dl2_2)object;
            object = (FeedEngineModel)((dl2_2)object3).b;
            object4 = ((dl2_2)object3).a;
            boolean bl2 = ((cl2_2)object4).d();
            n3 = 0;
            if (bl2 && (object4 = ((dl2_2)object3).b) != null) {
                KK2$c kK2$c = new kk2_1(object, n10);
                this.b = null;
                this.a = n7;
                object = object5.emit(kK2$c, this);
                if (object == j90_02) {
                    return j90_02;
                }
            } else {
                object4 = ApiErrorRepo.INSTANCE;
                string2 = "fleekStoriesApi";
                boolean bl3 = true;
                object2 = "";
                String string4 = "Forward";
                ((ApiErrorRepo)object4).handleApiError((dl2_2)object3, string2, bl3, (String)object2, string4);
                KK2$a kK2$a = new KK2$a(null, object, n4);
                this.b = null;
                this.a = n8;
                object = object5.emit(kK2$a, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

