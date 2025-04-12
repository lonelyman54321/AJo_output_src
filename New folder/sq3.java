/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Menu
 */
import android.view.Menu;
import com.chuckerteam.chucker.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class sq3
implements F62 {
    public final /* synthetic */ Menu a;

    public /* synthetic */ sq3(Menu menu2) {
        this.a = menu2;
    }

    public final void onChanged(Object object) {
        object = (Boolean)object;
        Menu menu2 = this.a;
        Intrinsics.checkNotNullParameter(menu2, "$menu");
        int n3 = R$id.encode_url;
        menu2 = menu2.findItem(n3);
        Intrinsics.checkNotNullExpressionValue(object, "it");
        boolean bl2 = (Boolean)object;
        menu2.setVisible(bl2);
    }
}

