/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class p33
implements Function1 {
    public final /* synthetic */ String a;

    public /* synthetic */ p33(String string2) {
        this.a = string2;
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (dl2_2)object;
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$screenName");
        Intrinsics.checkNotNullParameter(object2, "checkoutResp");
        object = (JsonObject)((dl2_2)object2).b;
        Object object3 = ((dl2_2)object2).a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object != null) {
            object3 = DataCallback.Companion;
            object = ((DataCallback$Companion)object3).onSuccess(object);
        } else {
            object3 = ApiErrorRepo.INSTANCE;
            String string3 = "CartCheckout";
            boolean bl3 = true;
            String string4 = "Forward";
            object = ((ApiErrorRepo)object3).handleApiError((dl2_2)object2, string3, bl3, string2, string4);
        }
        return object;
    }
}

