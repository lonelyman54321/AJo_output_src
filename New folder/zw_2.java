/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.lifecycle.i;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from ZW
 */
public final class zw_2
implements Function0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ mu1_1 d;

    public /* synthetic */ zw_2(Context context, Function0 function0, Function0 function02, mu1_1 mu1_12) {
        this.a = context;
        this.b = function0;
        this.c = function02;
        this.d = mu1_12;
    }

    public final Object invoke() {
        Object object = this.a;
        pe1$a_0 pe1$a_0 = new pe1$a_0((Context)object);
        pe1$a_0.c = object = this.b.invoke();
        object = this.c;
        i i3 = null;
        object = object != null ? (pe1$b)object.invoke() : null;
        pe1$a_0.e = object;
        object = this.d;
        if (object != null) {
            i3 = object.getLifecycle();
        }
        pe1$a_0.J = i3;
        return pe1$a_0.a();
    }
}

