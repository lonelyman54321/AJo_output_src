/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QL
 */
public final class ql_2 {
    public static final void a(LP1 lP1, Subcomponent subcomponent, Function1 function1, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        Intrinsics.checkNotNullParameter(subcomponent, "cardDataList");
        Intrinsics.checkNotNullParameter(function1, "onBannerClick");
        object = object.g(-1018710484);
        Object object2 = h40_0.a;
        object2 = h40_0.w();
        Object object3 = new ol_2(function1, subcomponent);
        object3 = x20_0.d(lP1, (Function0)object3);
        QL$a qL$a = new QL$a(subcomponent, (BaseValue)object2);
        int n4 = -435064298;
        u10 u102 = v10.c(n4, qL$a, (b30_0)object);
        qL$a = null;
        int n7 = 3072;
        int n8 = 6;
        OA.a((LP1)object3, null, false, u102, (b30_0)object, n7, n8);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new pl_2(lP1, subcomponent, function1, n3);
        }
    }
}

