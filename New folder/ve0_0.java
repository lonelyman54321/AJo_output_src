/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.media3.exoplayer.source.e;
import com.google.common.base.Supplier;

/*
 * Renamed from VE0
 */
public final class ve0_0
implements Supplier {
    public final /* synthetic */ Context a;

    public /* synthetic */ ve0_0(Context context) {
        this.a = context;
    }

    public final Object get() {
        ll0_0 ll0_02 = new ll0_0();
        Context context = this.a;
        e e2 = new e(context, ll0_02);
        return e2;
    }
}

