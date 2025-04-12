/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.common.base.Supplier;

/*
 * Renamed from OE0
 */
public final class oe0_0
implements Supplier {
    public final /* synthetic */ Context a;

    public /* synthetic */ oe0_0(Context context) {
        this.a = context;
    }

    public final Object get() {
        Context context = this.a;
        Nm0 nm0 = new Nm0(context);
        return nm0;
    }
}

