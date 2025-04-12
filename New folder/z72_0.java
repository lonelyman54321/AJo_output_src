/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.network.OkHttpClientProvider;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/*
 * Renamed from z72
 */
public final class z72_0
implements HostnameVerifier {
    public final /* synthetic */ OkHttpClientProvider a;

    public /* synthetic */ z72_0(OkHttpClientProvider okHttpClientProvider) {
        this.a = okHttpClientProvider;
    }

    public final boolean verify(String string2, SSLSession sSLSession) {
        return OkHttpClientProvider.a(this.a, string2, sSLSession);
    }
}

