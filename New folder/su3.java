/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartItem;
import com.ril.ajio.services.data.Payment.InternalWalletDataHolder;

public final class su3
implements CartItem {
    public final String a;
    public final int b;
    public final InternalWalletDataHolder c;

    public su3(int n3, String string2, InternalWalletDataHolder internalWalletDataHolder) {
        this.b = n3;
        this.a = string2;
        this.c = internalWalletDataHolder;
    }
}

