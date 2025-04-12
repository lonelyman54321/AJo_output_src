/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.lifecycle.x;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uS2
 */
public final class us2_1
implements xS2$b {
    public final xs2_1 a;
    public boolean b;
    public Bundle c;
    public final hh3_2 d;

    public us2_1(xs2_1 object, sD3 sD32) {
        Intrinsics.checkNotNullParameter(object, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(sD32, "viewModelStoreOwner");
        this.a = object;
        object = new uS2$a(sD32);
        this.d = object = yr1_2.b((Function0)object);
    }

    public final Bundle a() {
        boolean bl2;
        Bundle bundle = new Bundle();
        Object object = this.c;
        if (object != null) {
            bundle.putAll((Bundle)object);
        }
        object = ((vs2_1)this.d.getValue()).a.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Bundle bundle2;
            Map.Entry entry = (Map.Entry)object.next();
            String string2 = (String)entry.getKey();
            entry = ((x)entry.getValue()).e.a();
            boolean bl3 = Intrinsics.areEqual(entry, bundle2 = Bundle.EMPTY);
            if (bl3) continue;
            bundle.putBundle(string2, (Bundle)entry);
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        boolean bl2 = this.b;
        if (!bl2) {
            Object object = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (object != null) {
                bundle.putAll(object);
            }
            this.c = bundle;
            this.b = bl2 = true;
            object = (vs2_1)this.d.getValue();
        }
    }
}

