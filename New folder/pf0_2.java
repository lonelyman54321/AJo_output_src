/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from PF0
 */
public final class pf0_2
implements Function0 {
    public final /* synthetic */ Ref$IntRef a;
    public final /* synthetic */ p83_0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ tr1_0 d;

    public /* synthetic */ pf0_2(Ref$IntRef ref$IntRef, p83_0 p83_02, ch0_2 ch0_22, tr1_0 tr1_02) {
        this.a = ref$IntRef;
        this.b = p83_02;
        this.c = ch0_22;
        this.d = tr1_02;
    }

    public final Object invoke() {
        Serializable serializable = this.a;
        Intrinsics.checkNotNullParameter(serializable, "$subComponentsSize");
        Function1 function1 = this.c;
        Intrinsics.checkNotNullParameter(function1, "$onViewAllClicked");
        tr1_0 tr1_02 = this.d;
        Intrinsics.checkNotNullParameter(tr1_02, "$viewAllClicked$delegate");
        int n3 = (Boolean)tr1_02.getValue() ^ 1;
        Object object = n3 != 0;
        tr1_02.setValue(object);
        object = this.b;
        if (object != null) {
            n3 = ((p83_0)object).size();
        } else {
            n3 = 0;
            object = null;
        }
        ((Ref$IntRef)serializable).element = n3;
        serializable = (Boolean)tr1_02.getValue();
        serializable.getClass();
        function1.invoke(serializable);
        return Unit.a;
    }
}

