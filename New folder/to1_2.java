/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from To1
 */
public final class to1_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ro1_2 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KSerializer e;
    public final /* synthetic */ Charset f;

    public to1_2(ro1_2 ro1_22, Object object, KSerializer kSerializer, Charset charset, f80_0 f80_02) {
        this.c = ro1_22;
        this.d = object;
        this.e = kSerializer;
        this.f = charset;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        KSerializer kSerializer = this.e;
        Charset charset = this.f;
        ro1_2 ro1_22 = this.c;
        Object object2 = this.d;
        to1_2 to1_22 = new to1_2(ro1_22, object2, kSerializer, charset, f80_02);
        to1_22.b = object;
        return to1_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (gf_2)object;
        object2 = (f80_0)object2;
        object = (to1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((to1_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            Object object2 = object = this.b;
            object2 = (gf_2)object;
            Object object3 = this.d;
            Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<*>");
            Object object4 = object3;
            object4 = (es0_2)object3;
            KSerializer kSerializer = this.e;
            Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            this.a = n4;
            ro1_2 ro1_22 = this.c;
            Charset charset = this.f;
            object = ro1_2.c(ro1_22, (es0_2)object4, kSerializer, charset, (gf_2)object2, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

