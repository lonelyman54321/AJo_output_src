/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ZC2
extends jD3 {
    public final bD2 a;
    public final t30_0 b;
    public String c;
    public final ArrayList d;
    public final zr1_1 e;
    public final zr1_1 f;
    public final zr1_1 g;
    public final zr1_1 h;

    public ZC2(bD2 object) {
        Intrinsics.checkNotNullParameter(object, "repo");
        this.a = object;
        this.b = object = new t30_0();
        this.c = "";
        object = new ArrayList();
        this.d = object;
        this.e = object = new zr1_1();
        this.f = object = new zr1_1();
        this.g = object = new zr1_1();
        this.h = object;
    }

    public final void b(int n3) {
        RecentlyViewedDaoHelper.INSTANCE.setStoreId(n3);
        aW aW2 = md3_0.c(this);
        ZC2$a zC2$a = new ZC2$a(this, null);
        Ae3.d(aW2, null, null, zC2$a, 3);
    }
}

