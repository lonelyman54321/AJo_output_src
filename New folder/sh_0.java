/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.tooling.ComposeViewAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from sh
 */
public final class sh_0
extends Lambda
implements Function2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sh_0(Object object, u10 u102, int n3, int n4) {
        this.c = n4;
        this.f = object;
        this.d = u102;
        this.e = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = this.c;
        object = (b30_0)object;
        object2 = (Number)object2;
        ((Number)object2).intValue();
        switch (n3) {
            default: {
                int n4 = Me3.b(this.e | 1);
                u10 u102 = (u10)this.d;
                ComposeViewAdapter.a((ComposeViewAdapter)((Object)this.f), u102, (b30_0)object, n4);
                return Unit.a;
            }
            case 0: 
        }
        int n7 = Me3.b(this.e | 1);
        u10 u103 = (u10)this.d;
        th.b((LP1)this.f, u103, (b30_0)object, n7);
        return Unit.a;
    }
}

