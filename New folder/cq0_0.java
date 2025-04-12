/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from cq0
 */
public final class cq0_0
extends Lambda
implements Function1 {
    public final /* synthetic */ d c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ List e;

    public cq0_0(p83_0 p83_02, d d2, boolean bl2) {
        this.c = d2;
        this.d = bl2;
        this.e = p83_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        Object object2 = (p83_0)this.e;
        boolean bl2 = this.d;
        d d2 = this.c;
        object = new aq0_0((p83_0)object2, d2, bl2);
        d2.h.a((lu1)object);
        object2 = new bq0_0(d2, (aq0_0)object);
        return object2;
    }
}

