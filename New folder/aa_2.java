/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.search.SearchBar;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aa
 */
public final class aa_2
implements o60_0,
Q1 {
    public final /* synthetic */ Object a;

    public /* synthetic */ aa_2(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public void onTouchExplorationStateChanged(boolean bl2) {
        SearchBar.a((SearchBar)this.a, bl2);
    }
}

