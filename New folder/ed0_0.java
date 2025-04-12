/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.services.data.Cart.CartEntry;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ED0
 */
public final class ed0_0
implements View.OnClickListener {
    public final /* synthetic */ CartEntry a;
    public final /* synthetic */ FragmentManager b;

    public /* synthetic */ ed0_0(CartEntry cartEntry, FragmentManager fragmentManager) {
        this.a = cartEntry;
        this.b = fragmentManager;
    }

    public final void onClick(View object) {
        FragmentManager fragmentManager = this.b;
        Intrinsics.checkNotNullParameter(fragmentManager, "$supportFragmentManager");
        object = new sa2_2();
        Bundle bundle = new Bundle();
        CartEntry cartEntry = this.a;
        bundle.putSerializable("PRODUCT_DETAIL_BREAKUP", (Serializable)cartEntry);
        ((Fragment)object).setArguments(bundle);
        ((DialogFragment)object).show(fragmentManager, "Product View Breakup Fragment");
    }
}

