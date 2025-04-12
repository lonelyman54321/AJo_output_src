/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Nu0
 */
public final class nu0_0
extends Lambda
implements Function2 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;

    public nu0_0(boolean bl2, Function0 function0, Function0 function02, long l2, int n3) {
        this.c = bl2;
        this.d = function0;
        this.e = function02;
        this.f = l2;
        this.g = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.g | 1);
        Function0 function0 = this.e;
        long l2 = this.f;
        boolean bl2 = this.c;
        Function0 function02 = this.d;
        Tu0.b(bl2, function02, function0, l2, (b30_0)object3, n3);
        return Unit.a;
    }
}

