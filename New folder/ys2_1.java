/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.PickFromStoreRepo;
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ys2
 */
public final class ys2_1
extends jD3 {
    public final t30_0 a;
    public final PickFromStoreRepo b;
    public final zr1_1 c;
    public final zr1_1 d;

    public ys2_1(BaseRepo object) {
        t30_0 t30_02;
        Intrinsics.checkNotNullParameter(object, "repo");
        this.a = t30_02 = new t30_0();
        new CartEntry();
        object = (PickFromStoreRepo)object;
        this.b = object;
        this.c = object = new zr1_1();
        this.d = object = new zr1_1();
    }

    public final void onCleared() {
        super.onCleared();
        this.a.d();
    }
}

