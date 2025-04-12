/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$b;
import com.facebook.appevents.a;
import com.facebook.appevents.f;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from On
 */
public final class on_0
implements GraphRequest$b {
    public final /* synthetic */ a a;
    public final /* synthetic */ GraphRequest b;
    public final /* synthetic */ s03_0 c;
    public final /* synthetic */ it0_1 d;

    public /* synthetic */ on_0(a a2, GraphRequest graphRequest, s03_0 s03_02, it0_1 it0_12) {
        this.a = a2;
        this.b = graphRequest;
        this.c = s03_02;
        this.d = it0_12;
    }

    public final void b(com.facebook.f f5) {
        a a2 = this.a;
        GraphRequest graphRequest = this.b;
        s03_0 s03_02 = this.c;
        it0_1 it0_12 = this.d;
        Class<f> clazz = f.class;
        boolean bl2 = td0.b(clazz);
        if (!bl2) {
            String string2 = "$accessTokenAppId";
            Intrinsics.checkNotNullParameter(a2, string2);
            string2 = "$postRequest";
            Intrinsics.checkNotNullParameter(graphRequest, string2);
            string2 = "$appEvents";
            Intrinsics.checkNotNullParameter(s03_02, string2);
            string2 = "$flushState";
            Intrinsics.checkNotNullParameter(it0_12, string2);
            string2 = "response";
            Intrinsics.checkNotNullParameter(f5, string2);
            try {
                f.e(a2, graphRequest, f5, s03_02, it0_12);
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
    }
}

