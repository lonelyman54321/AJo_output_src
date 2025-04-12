/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lU
 */
public final class lu_0
implements bx0_2 {
    public static String a(RecyclerView object, StringBuilder stringBuilder) {
        object = ((RecyclerView)object).exceptionLabel();
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    public Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        String string2 = "BackGround_GET_GPS_DATA";
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "t");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, (Throwable)object2, string2, false, null, null, 28, null);
    }
}

