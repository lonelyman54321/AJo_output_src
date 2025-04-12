/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.PickFromStoreRepo;

/*
 * Renamed from ws2
 */
public final class ws2_2
implements bx0_2 {
    public final /* synthetic */ PickFromStoreRepo a;
    public final /* synthetic */ String b;

    public /* synthetic */ ws2_2(PickFromStoreRepo pickFromStoreRepo, String string2) {
        this.a = pickFromStoreRepo;
        this.b = string2;
    }

    public final Object apply(Object object) {
        object = (Throwable)object;
        PickFromStoreRepo pickFromStoreRepo = this.a;
        String string2 = this.b;
        return PickFromStoreRepo.a(pickFromStoreRepo, string2, (Throwable)object);
    }
}

