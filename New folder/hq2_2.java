/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Payment.BannerInfo;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from hq2
 */
public final class hq2_2
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (BannerInfo)object;
        object2 = (BannerInfo)object2;
        int n4 = 0;
        if (object != null && (object = ((BannerInfo)object).getPriority()) != null) {
            n3 = (Integer)object;
        } else {
            n3 = 0;
            object = null;
        }
        if (object2 != null && (object2 = ((BannerInfo)object2).getPriority()) != null) {
            n4 = (Integer)object2;
        }
        return n3 - n4;
    }
}

