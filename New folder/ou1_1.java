/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.network.OkHttpClientProvider;
import java.io.File;

/*
 * Renamed from OU1
 */
public final class ou1_1
implements jn_0 {
    public final void a() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "burst_network_cache";
        boolean bl2 = ((ao0_0)object).a((String)object2);
        if (bl2) {
            object = OkHttpClientProvider.Companion.getInstance();
            object2 = AJIOApplication$a.a().getCacheDir();
            ((OkHttpClientProvider)object).burstCache((File)object2);
        }
    }
}

