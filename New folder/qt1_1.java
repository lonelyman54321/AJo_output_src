/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from qT1
 */
public final class qt1_1
extends Lambda
implements Function1 {
    public final /* synthetic */ gt1_0 c;

    public qt1_1(gt1_0 gt1_02) {
        this.c = gt1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "key");
        return this.c.c().contains(object) ^ true;
    }
}

