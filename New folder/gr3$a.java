/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function1;

public final class gr3$a {
    public final Vs3 a;
    public final ParcelableSnapshotMutableState b;
    public final /* synthetic */ gr3 c;

    public gr3$a(gr3 object, Ws3 ws3, String string2) {
        this.c = object;
        this.a = ws3;
        this.b = object = J83.g(null);
    }

    public final gr3$a$a a(Function1 object, Function1 function1) {
        pb3_0 pb3_02 = this.b;
        gr3$a$a gr3$a$a = (gr3$a$a)((h83_0)pb3_02).getValue();
        gr3 gr32 = this.c;
        if (gr3$a$a == null) {
            Object object2 = gr32.a.a();
            object2 = function1.invoke(object2);
            Object object3 = gr32.a.a();
            object3 = function1.invoke(object3);
            Vs3 vs3 = this.a;
            Function1 function12 = vs3.a();
            object3 = (Ol)function12.invoke(object3);
            ((Ol)object3).d();
            gr3$d gr3$d = new gr3$d(gr32, object2, (Ol)object3, vs3);
            gr3$a$a = new gr3$a$a(this, gr3$d, (Function1)object, function1);
            ((h83_0)pb3_02).setValue(gr3$a$a);
            pb3_02 = gr32.i;
            ((p83_0)pb3_02).add(gr3$d);
        }
        gr3$a$a.c = function1;
        gr3$a$a.b = object;
        object = gr32.f();
        gr3$a$a.d((gr3$b)object);
        return gr3$a$a;
    }
}

