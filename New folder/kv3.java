/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class kv3
implements ix0_2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;

    public kv3(LP1 lP1, float f5, boolean bl2, float f6, long l2, boolean bl3, String string2) {
        this.a = lP1;
        this.b = f5;
        this.c = bl2;
        this.d = f6;
        this.e = l2;
        this.f = bl3;
        this.g = string2;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4, Object object5) {
        object = (KA)object;
        object2 = (WW$d)object2;
        Object object6 = object3;
        object6 = (im2)object3;
        Object object7 = object4;
        object7 = (b30_0)object4;
        ((Number)object5).intValue();
        object3 = "$this$CoilImage";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "$unused$var$");
        Intrinsics.checkNotNullParameter(object6, "painter");
        float f5 = this.b;
        object2 = this.a;
        object = j.h((LP1)object2, f5);
        object7.K(1058530151);
        boolean bl2 = object7.J(object2);
        float f6 = this.d;
        boolean bl3 = object7.b(f6);
        bl2 |= bl3;
        long l2 = this.e;
        bl3 = object7.d(l2);
        object5 = object7.v();
        if ((bl2 |= bl3) || object5 == (object3 = b30$a.a)) {
            object5 = new jv3_0((LP1)object2, f6, l2);
            object7.o(object5);
        }
        object5 = (Function1)object5;
        object7.E();
        boolean bl4 = this.c;
        object = x20_0.a((LP1)object, bl4, (Function1)object5, null);
        float f7 = uq0_0.c;
        object = h.e((LP1)object, f7);
        object2 = new X81(1);
        boolean bl5 = this.f;
        LP1 lP1 = x20_0.a((LP1)object, bl5, (Function1)object2, null);
        String string2 = this.g;
        Pd1.a((im2)object6, string2, lP1, null, null, 0.0f, null, (b30_0)object7, 8, 120);
        return Unit.a;
    }
}

