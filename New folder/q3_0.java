/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.lifecycle.E$b;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Q3
 */
public final class q3_0
implements E$b {
    public final /* synthetic */ Context a;

    public q3_0(Context context) {
        this.a = context;
    }

    public final /* synthetic */ jD3 create(Class clazz) {
        oD3.c(clazz);
        throw null;
    }

    public final jD3 create(Class object, Wd0 object2) {
        object = new Object();
        ((ts2_2)object).a = object2;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "context");
        Class<R3$a> clazz = R3$a.class;
        Intrinsics.checkNotNullParameter(clazz, "entryPoint");
        object2 = Vx2.b(object3.getApplicationContext());
        object2 = ((R3$a)da0_2.a(clazz, object2)).b();
        object2.getClass();
        object2 = ((Sh0)object2).a;
        object3 = new Th0((Wh0)object2);
        object2 = new R3$b((p3_0)object3, (ts2_2)object);
        return object2;
    }

    public final /* synthetic */ jD3 create(yn1_2 yn1_22, Wd0 wd0) {
        wd0 = (or1_2)wd0;
        return oD3.a(this, yn1_22, (or1_2)wd0);
    }
}

