/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.IFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cN0
 */
public final class cn0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cn0_2(Object object, int n3, Object object2, Object object3) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (String)object;
                tr1_0 tr1_02 = (tr1_0)this.c;
                Intrinsics.checkNotNullParameter(tr1_02, "$state");
                Function1 function1 = (Function1)this.d;
                Intrinsics.checkNotNullParameter(function1, "$onShowFocus");
                Intrinsics.checkNotNullParameter(object, "it");
                Object object2 = tr1_02.getValue();
                object = (String)((Function2)this.b).invoke(object2, object);
                object2 = tr1_02.getValue();
                String string2 = "";
                n3 = (int)(Intrinsics.areEqual(object2, string2) ? 1 : 0);
                if (n3 == 0 || (n3 = (int)(Intrinsics.areEqual(object, string2) ? 1 : 0)) == 0) {
                    function1.invoke(object);
                }
                tr1_02.setValue(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (dt1_0)object;
        Object object3 = (p83_0)this.b;
        Intrinsics.checkNotNullParameter(object3, "$filters");
        ob0_1 ob0_12 = (ob0_1)this.d;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        Intrinsics.checkNotNullParameter(object, "$this$LazyColumn");
        int n4 = ((p83_0)object3).size();
        IFilter iFilter = (IFilter)this.c;
        gN0$c gN0$c = new gN0$c(ob0_12, (p83_0)object3, iFilter);
        object3 = new u10(-1473817431, gN0$c, true);
        bt1.b((dt1_0)object, n4, null, (u10)object3, 6);
        return Unit.a;
    }
}

