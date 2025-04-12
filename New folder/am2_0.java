/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.util.Log
 */
import android.os.Build;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from am2
 */
public abstract class am2_0 {
    public final gk1 a;

    public am2_0() {
        gk1 gk12;
        am2$c am2$c = am2$c.c;
        this.a = gk12 = new gk1(am2$c);
    }

    public abstract Integer a(cm2 var1);

    public final void b() {
        Object object = this.a;
        boolean bl2 = ((gk1)object).a();
        if (bl2) {
            int n3;
            object = Build.ID;
            if (object != null && (bl2 = Log.isLoggable((String)(object = "Paging"), (int)(n3 = 3)))) {
                bl2 = true;
            } else {
                bl2 = false;
                object = null;
            }
            if (bl2) {
                object = new StringBuilder("Invalidated PagingSource ");
                ((StringBuilder)object).append(this);
                object = ((StringBuilder)object).toString();
                String string2 = "message";
                Intrinsics.checkNotNullParameter(object, string2);
            }
        }
    }

    public abstract Object c(am2$a var1, f80_0 var2);
}

