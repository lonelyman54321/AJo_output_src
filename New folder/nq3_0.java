/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from nq3
 */
public final class nq3_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Context c;

    public nq3_0(Context context) {
        this.c = context;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (kq3_0)object;
        Intrinsics.checkNotNullParameter(object, "it");
        Context context = this.c;
        object = D13.c((C13)object, context);
        Intrinsics.checkNotNullExpressionValue(object, "it.toSharableUtf8Content(context)");
        return object;
    }
}

