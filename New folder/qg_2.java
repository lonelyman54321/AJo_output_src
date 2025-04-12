/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.help.CCItemHelpFragment;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from qG
 */
public final class qg_2
implements Function1 {
    public final /* synthetic */ CCItemHelpFragment a;

    public /* synthetic */ qg_2(CCItemHelpFragment cCItemHelpFragment) {
        this.a = cCItemHelpFragment;
    }

    public final Object invoke(Object object) {
        CCItemHelpFragment cCItemHelpFragment = this.a;
        object = (DataCallback)object;
        return CCItemHelpFragment.Oa(cCItemHelpFragment, (DataCallback)object);
    }
}

