/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import androidx.fragment.app.b$g;
import androidx.fragment.app.n$c;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bn0
 */
public final class bn0_0
implements Runnable {
    public final /* synthetic */ n$c a;
    public final /* synthetic */ b$g b;

    public /* synthetic */ bn0_0(n$c n$c, b$g g3) {
        this.a = n$c;
        this.b = g3;
    }

    public final void run() {
        n$c n$c = this.a;
        Intrinsics.checkNotNullParameter(n$c, "$operation");
        b$g b$g = this.b;
        Intrinsics.checkNotNullParameter(b$g, "this$0");
        String string2 = "FragmentManager";
        int n3 = 2;
        boolean bl2 = Log.isLoggable((String)string2, (int)n3);
        if (bl2) {
            Objects.toString(n$c);
        }
        n$c.c(b$g);
    }
}

