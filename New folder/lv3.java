/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class lv3
implements Function1 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;

    public /* synthetic */ lv3(LP1 lP1, float f5, long l2) {
        this.a = lP1;
        this.b = f5;
        this.c = l2;
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNullParameter((LP1)object, "$this$conditional");
        object = SP2.a;
        LP1 lP1 = this.a;
        float f5 = this.b;
        long l2 = this.c;
        return gz.a(lP1, f5, l2, (i13)object);
    }
}

