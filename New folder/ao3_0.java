/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Home.NativeCategoryNavigationListDetail;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ao3
 */
public final class ao3_0
implements View.OnClickListener {
    public final /* synthetic */ C32 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ NativeCategoryNavigationListDetail c;

    public /* synthetic */ ao3_0(C32 c32, int n3, NativeCategoryNavigationListDetail nativeCategoryNavigationListDetail) {
        this.a = c32;
        this.b = n3;
        this.c = nativeCategoryNavigationListDetail;
    }

    public final void onClick(View object) {
        C32 c32 = this.a;
        Intrinsics.checkNotNullParameter(c32, "$listener");
        object = this.c;
        object = object != null ? ((NativeCategoryNavigationListDetail)object).getNativeCategoryPageId() : null;
        boolean bl2 = true;
        int n3 = this.b;
        c32.J4((String)object, n3, bl2, bl2);
    }
}

