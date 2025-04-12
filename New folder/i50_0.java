/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from I50
 */
public final class i50_0
implements H50,
ti2_0 {
    public final C50 a;
    public Handler b;
    public final S83 c;
    public boolean d;
    public final I50$c e;
    public final ArrayList f;

    public i50_0(C50 arrayList) {
        this.a = arrayList;
        I50$b i50$b = new I50$b(this);
        arrayList = new ArrayList(i50$b);
        this.c = arrayList;
        this.d = true;
        arrayList = new ArrayList(this);
        this.e = arrayList;
        this.f = arrayList = new ArrayList();
    }

    public final boolean a(List list) {
        ArrayList arrayList;
        int n3;
        int n4 = this.d;
        boolean bl2 = true;
        if (n4 == 0 && (n4 = list.size()) == (n3 = (arrayList = this.f).size())) {
            n4 = list.size();
            n3 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                boolean bl3;
                Object object = ((xk1_0)list.get(i3)).B();
                boolean bl4 = object instanceof B50;
                if (bl4) {
                    object = (B50)object;
                } else {
                    bl3 = false;
                    object = null;
                }
                Object e2 = arrayList.get(i3);
                bl3 = Intrinsics.areEqual(object, e2);
                if (bl3) continue;
                return bl2;
            }
            return false;
        }
        return bl2;
    }

    public final void b(eb3_2 object, List object2) {
        this.f.clear();
        Unit unit = Unit.a;
        i50$a_0 i50$a_0 = new i50$a_0((List)object2, this, (eb3_2)object);
        object = this.c;
        object2 = this.e;
        ((S83)object).d(unit, (Function1)object2, i50$a_0);
        this.d = false;
    }

    public final void onAbandoned() {
    }

    public final void onForgotten() {
        S83 s83 = this.c;
        oq_2 oq_22 = s83.g;
        if (oq_22 != null) {
            oq_22.a();
        }
        s83.b();
    }

    public final void onRemembered() {
        this.c.e();
    }
}

