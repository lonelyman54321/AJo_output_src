/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FM0
 */
public final class fm0_1
implements Function0 {
    public final /* synthetic */ yh0_0 a;
    public final /* synthetic */ tr1_0 b;

    public /* synthetic */ fm0_1(yh0_0 yh0_02, tr1_0 tr1_02) {
        this.a = yh0_02;
        this.b = tr1_02;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$viewModel");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$checkedRevPhotos$delegate");
        Boolean bl2 = (Boolean)object2.getValue();
        Boolean bl3 = Boolean.TRUE;
        bl2 = Intrinsics.areEqual(bl2, bl3) ^ true;
        object2.setValue(bl2);
        boolean bl4 = Intrinsics.areEqual((Boolean)object2.getValue(), bl3);
        object = ((yh0_0)object).k;
        object2 = bl4;
        ((h83_0)object).setValue(object2);
        return Unit.a;
    }
}

