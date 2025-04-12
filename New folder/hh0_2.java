/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.pdprefresh.fragments.a;
import com.ril.ajio.pdprefresh.fragments.b;
import com.ril.ajio.pdprefresh.fragments.c;
import com.ril.ajio.pdprefresh.fragments.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hh0
 */
public final class hh0_2
implements Function1 {
    public final /* synthetic */ lt1 a;
    public final /* synthetic */ d b;

    public /* synthetic */ hh0_2(lt1 lt12, d d2) {
        this.a = lt12;
        this.b = d2;
    }

    public final Object invoke(Object object) {
        boolean bl2;
        u10 u102;
        int n3;
        int n4;
        Object object2;
        Object object3;
        int n7;
        object = (jr1_0)object;
        Object object4 = this.b;
        Intrinsics.checkNotNullParameter(object4, "this$0");
        Intrinsics.checkNotNullParameter(object, "$this$LazyVerticalGrid");
        Object object5 = this.a;
        boolean bl3 = true;
        if (object5 != null && (n7 = ((wk1_0)(object3 = (wk1_0)((h83_0)(object2 = ((lt1)object5).d)).getValue())).a()) != 0) {
            object2 = (wk1_0)((h83_0)object2).getValue();
            n4 = ((wk1_0)object2).a();
            object3 = new a((lt1)object5, (d)object4);
            n3 = -286349489;
            u102 = new u10(n3, object3, bl3);
            Uo0.f((jr1_0)object, n4, u102);
        }
        n4 = 0;
        object2 = null;
        if (object5 != null && (object3 = (wZ)((lt1)object5).e.getValue()) != null) {
            object3 = ((wZ)object3).a;
        } else {
            n7 = 0;
            object3 = null;
        }
        boolean bl4 = object3 instanceof Ov1$a;
        n3 = 12;
        if (!bl4 && (n7 = object3 instanceof Ov1$b) != 0) {
            object3 = new b((d)object4);
            int n8 = 1184093745;
            u102 = new u10(n8, object3, bl3);
            Uo0.f((jr1_0)object, n3, u102);
        }
        if (object5 != null && (object5 = (wZ)((lt1)object5).e.getValue()) != null) {
            object2 = ((wZ)object5).c;
        }
        if (!(bl2 = object2 instanceof Ov1$a) && (bl2 = object2 instanceof Ov1$b)) {
            object5 = new c((d)object4);
            n4 = -562924046;
            object4 = new u10(n4, object5, bl3);
            Uo0.f((jr1_0)object, n3, (u10)object4);
        }
        return Unit.a;
    }
}

