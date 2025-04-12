/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.services.data.fleek.seen_components.SeenApiModel;
import com.ril.ajio.services.data.fleek.seen_components.ShareActionRequestBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from vR0
 */
public final class vr0_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xr0_2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Ref$ObjectRef e;
    public final /* synthetic */ ShareActionRequestBody f;

    public vr0_1(xr0_2 xr0_22, String string2, Ref$ObjectRef ref$ObjectRef, ShareActionRequestBody shareActionRequestBody, f80_0 f80_02) {
        this.c = xr0_22;
        this.d = string2;
        this.e = ref$ObjectRef;
        this.f = shareActionRequestBody;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.e;
        ShareActionRequestBody shareActionRequestBody = this.f;
        xr0_2 xr0_22 = this.c;
        String string2 = this.d;
        vr0_1 vr0_12 = new vr0_1(xr0_22, string2, ref$ObjectRef, shareActionRequestBody, f80_02);
        vr0_12.b = object;
        return vr0_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (vr0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vr0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block10: {
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
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
                            object7 = (fs0_2)this.b;
                            vl2_2.b(object);
                            break block11;
                        }
                        object7 = (fs0_2)this.b;
                        vl2_2.b(object);
                        break block12;
                    }
                    vl2_2.b(object);
                    object = (fs0_2)this.b;
                    object7 = new KK2$b();
                    this.b = object;
                    this.a = n3;
                    object7 = object.emit(object7, this);
                    if (object7 == j90_02) {
                        return j90_02;
                    }
                    object7 = object;
                }
                object = this.c;
                object6 = ((xr0_2)object).a;
                object4 = object5 = this.e.element;
                object4 = (String)object5;
                this.b = object7;
                this.a = n8;
                object5 = this.d;
                object3 = this.f;
                String string2 = ((xr0_2)object).b;
                object2 = this;
                object = ((cq0_1)object6).l((String)object5, (String)object4, string2, (ShareActionRequestBody)object3, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object5 = object;
            object5 = (dl2_2)object;
            object = (SeenApiModel)((dl2_2)object5).b;
            object6 = ((dl2_2)object5).a;
            boolean bl2 = ((cl2_2)object6).d();
            if (bl2 && (object6 = ((dl2_2)object5).b) != null) {
                KK2$c kK2$c = new kk2_1(object, n8);
                this.b = null;
                this.a = n4;
                object = object7.emit(kK2$c, this);
                if (object == j90_02) {
                    return j90_02;
                }
            } else {
                object6 = ApiErrorRepo.INSTANCE;
                object4 = "sesShareActionApi";
                boolean bl3 = true;
                object3 = "";
                object2 = "Forward";
                ((ApiErrorRepo)object6).handleApiError((dl2_2)object5, (String)object4, bl3, (String)object3, (String)object2);
                KK2$a kK2$a = new KK2$a(null, object, n3);
                this.b = null;
                this.a = n7;
                object = object7.emit(kK2$a, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

