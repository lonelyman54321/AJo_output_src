/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.core.view.f;
import androidx.media3.exoplayer.j$a;
import com.google.android.material.search.SearchView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AF0
 */
public final class af0_0
implements j$a,
o60_0,
T72 {
    public final /* synthetic */ Object a;

    public /* synthetic */ af0_0(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public f onApplyWindowInsets(View view, f f5) {
        return SearchView.h((SearchView)this.a, view, f5);
    }
}

