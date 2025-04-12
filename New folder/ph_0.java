/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ph
 */
public final class ph_0
extends Lambda
implements Function2 {
    public final /* synthetic */ ib3_0 c;

    public ph_0(tr1_0 tr1_02) {
        this.c = tr1_02;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            n3 = 0;
            Object object3 = nh_0.c;
            object2 = new AppendedSemanticsElement((Function1)object3, false);
            object3 = (tr1_0)this.c;
            Function2 function2 = new oh_0((tr1_0)object3);
            function2 = v10.c(-533674951, function2, (b30_0)object);
            int n7 = 48;
            th.b((LP1)object2, (u10)function2, (b30_0)object, n7);
        }
        return Unit.a;
    }
}

