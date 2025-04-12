/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from J13
 */
public final class j13_0
implements Function1 {
    public final /* synthetic */ n13_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ s13_0 d;

    public /* synthetic */ j13_0(n13_0 n13_02, String string2, Context context, s13_0 s13_02) {
        this.a = n13_02;
        this.b = string2;
        this.c = context;
        this.d = s13_02;
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (Unit)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Context context = this.c;
        Intrinsics.checkNotNullParameter(context, "$context");
        s13_0 s13_02 = this.d;
        Intrinsics.checkNotNullParameter(s13_02, "$shareFileListener");
        object2.getClass();
        object = new da$a();
        ((da$a)object).n = object2 = this.b;
        ((da$a)object).A = bl2 = true;
        ((da$a)object).y = object2;
        ((da$a)object).B = bl2;
        ((da$a)object).w = object2 = new r13_0(context, s13_02);
        ((da$a)object).a();
        return Unit.a;
    }
}

