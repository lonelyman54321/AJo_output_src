/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import androidx.navigation.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/*
 * Renamed from XS1
 */
public final class xs1_1
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$BooleanRef c;
    public final /* synthetic */ Ref$BooleanRef d;
    public final /* synthetic */ e e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ fp_2 g;

    public xs1_1(Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, e e2, boolean bl2, fp_2 fp_22) {
        this.c = ref$BooleanRef;
        this.d = ref$BooleanRef2;
        this.e = e2;
        this.f = bl2;
        this.g = fp_22;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (d)object;
        Intrinsics.checkNotNullParameter(object, "entry");
        Ref$BooleanRef ref$BooleanRef = this.c;
        ref$BooleanRef.element = bl2 = true;
        this.d.element = bl2;
        boolean bl3 = this.f;
        fp_2 fp_22 = this.g;
        this.e.t((d)object, bl3, fp_22);
        return Unit.a;
    }
}

