/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from Dz0
 */
public final class dz0_1
implements bx0_2,
vv1$a {
    public static void a(Encoder encoder, b03_0 b03_02, Object object) {
        Intrinsics.checkNotNullParameter(b03_02, "serializer");
        SerialDescriptor serialDescriptor = b03_02.getDescriptor();
        boolean bl2 = serialDescriptor.b();
        if (bl2) {
            encoder.B(b03_02, object);
            return;
        }
        if (object == null) {
            encoder.u();
        } else {
            encoder.D();
            encoder.B(b03_02, object);
        }
    }

    public Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        String string2 = "BackGround_CartWishListCount";
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, (Throwable)object2, string2, false, null, null, 28, null);
    }

    public void invoke(Object object) {
        ((oe)object).getClass();
    }
}

