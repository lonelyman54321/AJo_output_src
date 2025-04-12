/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Payment.InternalWalletDataHolder;
import java.io.Serializable;

/*
 * Renamed from QQ2
 */
public final class qq2_2 {
    public int a;
    public final String b;
    public final Object c;
    public final Object d;
    public boolean e;
    public boolean f;

    public qq2_2(InternalWalletDataHolder internalWalletDataHolder, int n3) {
        this.c = internalWalletDataHolder;
        this.a = n3;
    }

    public qq2_2(Object object, Serializable serializable, int n3) {
        this.c = object;
        this.d = serializable;
        this.a = n3;
    }

    public qq2_2(String string2, int n3) {
        this.b = string2;
        this.a = n3;
    }

    public qq2_2(String string2, int n3, int n4) {
        this.b = string2;
        this.a = n3;
    }
}

