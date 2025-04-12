/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from fd3
 */
public final class fd3_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fd3_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (dl2_2)object;
                return WishListRepo.d((WishListRepo)this.b, (dl2_2)object);
            }
            case 0: 
        }
        object = (BaseResponse)object;
        ed3_2 ed3_22 = (ed3_2)this.b;
        ed3_22.y = object;
        Object object2 = ed3_22.x;
        if (object2 != null) {
            cp_1.Companion.getClass();
            object2 = cp$a.e();
            object2.getClass();
            boolean bl2 = cp_1.I((BaseResponse)object);
            if (bl2) {
                ed3_22.Pa((BaseResponse)object);
            }
        }
        return Unit.a;
    }
}

