/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wu3
 */
public final class wu3_0
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ wu3_0(LP1 lP1, String string2, String string3, float f5, int n3, int n4) {
        this.a = lP1;
        this.b = string2;
        this.c = string3;
        this.d = f5;
        this.e = n3;
        this.f = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$imageModel");
        int n3 = Me3.b(this.e | 1);
        int n4 = this.f;
        Object object4 = object;
        object4 = (String)object;
        LP1 lP1 = this.a;
        String string2 = this.c;
        float f5 = this.d;
        ov3.i(lP1, (String)object4, string2, f5, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

