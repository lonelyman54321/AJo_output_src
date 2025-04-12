/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.tooling.ComposeViewAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class W20
extends Lambda
implements Function2 {
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Class e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ComposeViewAdapter g;
    public final /* synthetic */ long h;

    public W20(String string2, String string3, Class clazz, int n3, ComposeViewAdapter composeViewAdapter, long l2) {
        this.c = string2;
        this.d = string3;
        this.e = clazz;
        this.f = n3;
        this.g = composeViewAdapter;
        this.h = l2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            Object object3;
            object2 = this.c;
            n4 = (int)(object.J(object2) ? 1 : 0);
            Object object4 = this.d;
            n3 = (int)(object.J(object4) ? 1 : 0);
            n4 |= n3;
            n3 = (int)(object.x(object) ? 1 : 0);
            n4 |= n3;
            object4 = this.e;
            n3 = (int)(object.x(object4) ? 1 : 0);
            n4 |= n3;
            n3 = this.f;
            n3 = (int)(object.c(n3) ? 1 : 0);
            n4 |= n3;
            ComposeViewAdapter composeViewAdapter = this.g;
            n3 = (int)(object.x((Object)composeViewAdapter) ? 1 : 0);
            object4 = object.v();
            b30$a$a b30$a$a = b30$a.a;
            if ((n4 |= n3) != 0 || object4 == b30$a$a) {
                String string2 = this.d;
                Class clazz = this.e;
                object3 = this.c;
                int n7 = this.f;
                ComposeViewAdapter composeViewAdapter2 = this.g;
                object4 = object2;
                object2 = new v20_0((String)object3, string2, (b30_0)object, clazz, n7, composeViewAdapter2);
                object.o(object2);
            }
            object4 = (Function0)object4;
            long l2 = this.h;
            long l3 = 0L;
            long l4 = l2 - l3;
            n4 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
            if (n4 >= 0) {
                object.K(-967718059);
                n4 = (int)(object.x((Object)composeViewAdapter) ? 1 : 0);
                object3 = object.v();
                if (n4 != 0 || object3 == b30$a$a) {
                    object3 = new u20_0(composeViewAdapter);
                    object.o(object3);
                }
                object3 = (Function0)object3;
                object2 = new Sy2((Function0)object3);
                composeViewAdapter.setClock$ui_tooling_release((Sy2)object2);
                object.E();
            } else {
                n4 = -966635973;
                object.K(n4);
                object.E();
            }
            object4.invoke();
        }
        return Unit.a;
    }
}

