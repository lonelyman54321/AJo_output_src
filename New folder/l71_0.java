/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.myaccount.order.fragment.b;
import com.ril.ajio.myaccount.order.fragment.b$a;

/*
 * Renamed from L71
 */
public final class l71_0
implements fU1 {
    public final /* synthetic */ i71_0 a;

    public l71_0(i71_0 i71_02) {
        this.a = i71_02;
    }

    public final void a() {
        b.Companion.getClass();
        b b2 = b$a.a();
        FragmentActivity fragmentActivity = this.a.getActivity();
        boolean bl2 = fragmentActivity instanceof AjioHomeActivity;
        fragmentActivity = bl2 ? (AjioHomeActivity)fragmentActivity : null;
        if (fragmentActivity != null) {
            bl2 = true;
            String string2 = b.Z;
            ((AjioHomeActivity)fragmentActivity).L2(b2, string2, bl2);
        }
    }
}

