/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.b;
import kotlin.jvm.internal.Intrinsics;

public final class z42
implements ic1_1 {
    public final ic1_1 a;

    public z42(px_0 px_02) {
        Intrinsics.checkNotNullParameter(px_02, "iBitmapDownloadRequestHandler");
        this.a = px_02;
    }

    public final rs0_1 a(ox_0 object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "bitmapDownloadRequest");
        b.j();
        String string2 = ((ox_0)object).a;
        boolean bl3 = ((ox_0)object).b;
        Context context = ((ox_0)object).c;
        if (string2 != null && !(bl2 = kotlin.text.b.k(string2))) {
            object = this.a.a((ox_0)object);
            object = yz3_0.f(bl3, context, (rs0_1)object);
            Intrinsics.checkNotNullExpressionValue(object, "getDownloadedBitmapPostF\u2026ontext, downloadedBitmap)");
            return object;
        }
        rs0$a_0 rs0$a_0 = rs0$a_0.NO_IMAGE;
        Intrinsics.checkNotNullParameter((Object)rs0$a_0, "status");
        object = new rs0_1(null, rs0$a_0, -1, null);
        object = yz3_0.f(bl3, context, (rs0_1)object);
        Intrinsics.checkNotNullExpressionValue(object, "getDownloadedBitmapPostF\u2026s(NO_IMAGE)\n            )");
        return object;
    }
}

