/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.os.Bundle
 *  android.widget.RemoteViews
 */
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.clevertap.android.pushtemplates.R$layout;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ax
 */
public final class ax_0
extends ze3_0 {
    public final uj3_1 b;

    public ax_0(uj3_1 uj3_12) {
        Intrinsics.checkNotNullParameter(uj3_12, "renderer");
        super(uj3_12);
        this.b = uj3_12;
    }

    public final RemoteViews b(Context context, uj3_1 uj3_12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uj3_12, "renderer");
        int n3 = R$layout.image_only_big;
        ix_0 ix_02 = new ix_0(n3, uj3_12, context);
        return ix_02.c;
    }

    public final PendingIntent c(Context context, Bundle bundle, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        return null;
    }

    public final PendingIntent d(Context context, Bundle bundle, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        uj3_1 uj3_12 = this.b;
        return sq2_1.b(context, n3, bundle, true, 1, uj3_12);
    }

    public final RemoteViews e(Context context, uj3_1 uj3_12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uj3_12, "renderer");
        r73_0 r73_02 = new r73_0(context, uj3_12);
        return r73_02.c;
    }
}

