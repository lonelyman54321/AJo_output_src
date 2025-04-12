/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.core.view.f;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils$RelativePadding;
import com.google.android.material.search.SearchView;
import com.ril.ajio.data.repo.WishListRepo;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from jW2
 */
public final class jw2_1
implements ViewUtils$OnApplyWindowInsetsListener,
bx0_2 {
    public final /* synthetic */ Object a;

    public /* synthetic */ jw2_1(Object object) {
        this.a = object;
    }

    public Object apply(Object object) {
        return WishListRepo.c((zh3_2)((Function1)this.a), object);
    }

    public f onApplyWindowInsets(View view, f f5, ViewUtils$RelativePadding viewUtils$RelativePadding) {
        return SearchView.g((SearchView)this.a, view, f5, viewUtils$RelativePadding);
    }
}

