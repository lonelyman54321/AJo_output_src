/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.ratings.ReviewsResponse;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from qE2
 */
public final class qe2_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ UserInformation d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ Ref$ObjectRef f;

    public qe2_0(String string2, UserInformation userInformation, LinkedHashMap linkedHashMap, Ref$ObjectRef ref$ObjectRef, f80_0 f80_02) {
        this.c = string2;
        this.d = userInformation;
        this.e = linkedHashMap;
        this.f = ref$ObjectRef;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qe2_0 qe2_02;
        UserInformation userInformation = this.d;
        Object object2 = this.e;
        Map map2 = object2;
        map2 = (LinkedHashMap)object2;
        String string2 = this.c;
        Ref$ObjectRef ref$ObjectRef = this.f;
        object2 = qe2_02;
        qe2_02 = new qe2_0(string2, userInformation, (LinkedHashMap)map2, ref$ObjectRef, f80_02);
        qe2_02.b = object;
        return qe2_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (qe2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((qe2_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block8: {
            Map map2;
            Object object2;
            Object object3;
            String string2;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            int n3;
            int n4;
            int n7;
            j90_0 j90_02;
            qe2_0 qe2_02;
            block9: {
                block6: {
                    block7: {
                        qe2_02 = this;
                        j90_02 = j90_0.COROUTINE_SUSPENDED;
                        int n8 = this.a;
                        n7 = 3;
                        n4 = 2;
                        n3 = 1;
                        if (n8 == 0) break block6;
                        if (n8 == n3) break block7;
                        if (n8 != n4 && n8 != n7) {
                            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw illegalStateException;
                        }
                        vl2_2.b(object);
                        break block8;
                    }
                    object7 = (fs0_2)this.b;
                    vl2_2.b(object);
                    object6 = object7;
                    object7 = object;
                    break block9;
                }
                vl2_2.b(object);
                object6 = object7 = this.b;
                object6 = (fs0_2)object7;
                object7 = sE2.b;
                object5 = sE2.e;
                object4 = this.d;
                Intrinsics.checkNotNull(object4);
                object4 = ServiceUtil.getToken((UserInformation)object4);
                object4 = kp1_0.c("Bearer ", (String)object4);
                String string3 = sE2.c;
                Intrinsics.checkNotNullExpressionValue(string3, "access$getClientType$p(...)");
                string2 = sE2.d;
                Object object8 = object3 = this.f.element;
                object8 = (cr1$c_0)object3;
                String string4 = sE2.a.getUserEmailId();
                Intrinsics.checkNotNullExpressionValue(string4, "getUserEmailId(...)");
                this.b = object6;
                this.a = n3;
                object2 = this.c;
                object3 = "uploadReviewsImages";
                map2 = this.e;
                object7 = object7.uploadReviewImages((String)object2, (String)object5, (String)object4, string3, string2, (String)object3, map2, (cr1$c_0)object8, string4, this);
                if (object7 == j90_02) {
                    return j90_02;
                }
            }
            object5 = object7;
            object5 = (dl2_2)object7;
            object7 = (ReviewsResponse)((dl2_2)object5).b;
            object2 = ((dl2_2)object5).a;
            n3 = (int)(((cl2_2)object2).d() ? 1 : 0);
            map2 = null;
            if (n3 != 0 && object7 != null) {
                object2 = DataCallback.Companion;
                object7 = ((DataCallback$Companion)object2).onSuccess(object7);
                qe2_02.b = null;
                qe2_02.a = n4;
                if ((object7 = object6.emit(object7, qe2_02)) == j90_02) {
                    return j90_02;
                }
            } else {
                object2 = ApiErrorRepo.INSTANCE;
                string2 = "";
                object3 = "Forward";
                object4 = "uploadReviewsImages";
                boolean bl2 = true;
                object7 = ((ApiErrorRepo)object2).handleApiError((dl2_2)object5, (String)object4, bl2, string2, (String)object3);
                qe2_02.b = null;
                qe2_02.a = n7;
                if ((object7 = object6.emit(object7, qe2_02)) == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

