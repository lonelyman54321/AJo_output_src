/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.services.data.fleek.seen_components.SeenApiModel;
import com.ril.ajio.services.data.fleek.seen_components.SesActionApiRequestBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from tR0
 */
public final class tr0_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xr0_2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ SesActionApiRequestBody f;

    public tr0_1(xr0_2 xr0_22, String string2, String string3, SesActionApiRequestBody sesActionApiRequestBody, f80_0 f80_02) {
        this.c = xr0_22;
        this.d = string2;
        this.e = string3;
        this.f = sesActionApiRequestBody;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.e;
        SesActionApiRequestBody sesActionApiRequestBody = this.f;
        xr0_2 xr0_22 = this.c;
        String string3 = this.d;
        tr0_1 tr0_12 = new tr0_1(xr0_22, string3, string2, sesActionApiRequestBody, f80_02);
        tr0_12.b = object;
        return tr0_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (tr0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((tr0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block10: {
            Object object2;
            Object object3;
            Object object4;
            String string2;
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
                string2 = this.e;
                object4 = this.f;
                object3 = this.d;
                String string3 = ((xr0_2)object).b;
                object2 = this;
                object = ((cq0_1)object5).k((String)object3, string2, string3, (SesActionApiRequestBody)object4, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object3 = object;
            object3 = (dl2_2)object;
            object = (SeenApiModel)((dl2_2)object3).b;
            object5 = ((dl2_2)object3).a;
            boolean bl2 = ((cl2_2)object5).d();
            if (bl2 && (object5 = ((dl2_2)object3).b) != null) {
                KK2$c kK2$c = new kk2_1(object, n8);
                this.b = null;
                this.a = n4;
                object = object6.emit(kK2$c, this);
                if (object == j90_02) {
                    return j90_02;
                }
            } else {
                object5 = ApiErrorRepo.INSTANCE;
                string2 = "sesActionApi";
                boolean bl3 = true;
                object4 = "";
                object2 = "Forward";
                ((ApiErrorRepo)object5).handleApiError((dl2_2)object3, string2, bl3, (String)object4, (String)object2);
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

