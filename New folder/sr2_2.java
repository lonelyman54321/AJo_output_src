/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.earlyaccess.entity.EarlyAccessBannerData;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from SR2
 */
public final class sr2_2
implements Function0 {
    public final Object invoke() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("early_access_config");
        return (EarlyAccessBannerData)Z90.a(EarlyAccessBannerData.class, (String)object);
    }
}

