/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.user.GPSResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XQ0
 */
public final class xq0_2
implements Function1 {
    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (dl2_2)object;
        String string2 = "BackGround_GET_GPS_DATA";
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "response");
        object = (GPSResponse)((dl2_2)object2).b;
        Object object3 = ((dl2_2)object2).a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object != null) {
            object3 = DataCallback.Companion;
            object = ((DataCallback$Companion)object3).onSuccess(object);
        } else {
            object3 = ApiErrorRepo.INSTANCE;
            int n3 = 28;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object3, (dl2_2)object2, string2, false, null, null, n3, null);
        }
        return object;
    }
}

