/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from kx
 */
public final class kx_0
extends Lambda
implements Function0 {
    public final /* synthetic */ Yl3 c;
    public final /* synthetic */ Sl d;

    public kx_0(Yl3 yl3, Sl sl) {
        this.c = yl3;
        this.d = sl;
        super(0);
    }

    public final Object invoke() {
        Object object;
        block7: {
            block6: {
                Yl3 yl3 = this.c;
                if (yl3 == null) break block6;
                object = yl3.d;
                boolean bl2 = ((p83_0)object).isEmpty();
                if (bl2) {
                    object = yl3.c;
                } else {
                    Sl$a sl$a = new Sl$a();
                    Object object2 = yl3.a;
                    sl$a.b((Sl)object2);
                    object2 = new Gj3(sl$a);
                    int n3 = ((p83_0)object).size();
                    for (int i3 = 0; i3 < n3; ++i3) {
                        Function1 function1 = (Function1)((p83_0)object).get(i3);
                        function1.invoke(object2);
                    }
                    object = sl$a.h();
                }
                yl3.c = object;
                if (object != null) break block7;
            }
            object = this.d;
        }
        return object;
    }
}

