/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Rc1$a
 */
public final class rc1$a_0
extends Lambda
implements Function2 {
    public final /* synthetic */ im2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ LP1 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public rc1$a_0(im2 im22, String string2, LP1 lP1, long l2, int n3, int n4) {
        this.c = im22;
        this.d = string2;
        this.e = lP1;
        this.f = l2;
        this.g = n3;
        this.h = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.g | 1);
        LP1 lP1 = this.e;
        long l2 = this.f;
        im2 im22 = this.c;
        String string2 = this.d;
        int n4 = this.h;
        rc1_0.b(im22, string2, lP1, l2, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

