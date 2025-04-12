/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FM
 */
public final class fm_1 {
    public static String a(CartApiRepo object, String string2) {
        object = CartApiRepo.access$getUserInformation$p((CartApiRepo)object);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        return ServiceUtil.getToken((UserInformation)object);
    }
}

