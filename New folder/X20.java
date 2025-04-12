/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.tooling.ComposeViewAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class X20
extends Lambda
implements Function2 {
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ ComposeViewAdapter d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Class g;
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;

    public X20(Function0 function0, ComposeViewAdapter composeViewAdapter, String string2, String string3, Class clazz, int n3, long l2) {
        this.c = function0;
        this.d = composeViewAdapter;
        this.e = string2;
        this.f = string3;
        this.g = clazz;
        this.h = n3;
        this.i = l2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = ly0_0.a;
            object2 = this.c;
            object.q((Function0)object2);
            long l2 = this.i;
            String string2 = this.e;
            String string3 = this.f;
            Class clazz = this.g;
            int n7 = this.h;
            ComposeViewAdapter composeViewAdapter = this.d;
            object2 = new W20(string2, string3, clazz, n7, composeViewAdapter, l2);
            object2 = v10.c(320194433, (fx0_2)object2, (b30_0)object);
            n3 = 6;
            ComposeViewAdapter.a(composeViewAdapter, (u10)object2, (b30_0)object, n3);
        }
        return Unit.a;
    }
}

