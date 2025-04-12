/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Striped;

/*
 * Renamed from Ne3
 */
public final class ne3_1
implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ ne3_1(int n3) {
        this.a = n3;
    }

    public final Object get() {
        return Striped.a(this.a);
    }
}

