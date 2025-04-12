/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.adservices.topics.GetTopicsRequest
 *  android.adservices.topics.GetTopicsRequest$Builder
 */
import android.adservices.topics.GetTopicsRequest;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from To3
 */
public final class to3_0
extends cp3_0 {
    public final GetTopicsRequest Q(mZ0 mZ02) {
        Intrinsics.checkNotNullParameter(mZ02, "request");
        GetTopicsRequest.Builder builder = So3.a();
        String string2 = mZ02.a;
        builder = Po3.a(builder, string2);
        boolean bl2 = mZ02.b;
        mZ02 = Ro3.a(Qo3.a(builder, bl2));
        Intrinsics.checkNotNullExpressionValue(mZ02, "Builder()\n            .s\u2026ion)\n            .build()");
        return mZ02;
    }
}

