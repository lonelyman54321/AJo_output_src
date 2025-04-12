/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.WishListRepo;

/*
 * Renamed from yH3
 */
public final class yh3_1
implements bx0_2 {
    public final /* synthetic */ WishListRepo a;
    public final /* synthetic */ String b;

    public /* synthetic */ yh3_1(WishListRepo wishListRepo, String string2) {
        this.a = wishListRepo;
        this.b = string2;
    }

    public final Object apply(Object object) {
        object = (Throwable)object;
        WishListRepo wishListRepo = this.a;
        String string2 = this.b;
        return WishListRepo.b(wishListRepo, string2, (Throwable)object);
    }
}

