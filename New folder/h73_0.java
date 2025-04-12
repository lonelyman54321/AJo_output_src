/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from H73
 */
public final class h73_0
extends Lambda
implements Function1 {
    public final /* synthetic */ D73 c;

    public h73_0(D73 d73) {
        this.c = d73;
        super(1);
    }

    public final Object invoke(Object object) {
        object = ((PI0)object).a;
        D73 d73 = this.c;
        return Intrinsics.areEqual(object, d73);
    }
}

