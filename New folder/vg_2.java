/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.help.CCItemHelpFragment;

/*
 * Renamed from vG
 */
public final class vg_2
implements F62 {
    public final /* synthetic */ CCItemHelpFragment a;

    public /* synthetic */ vg_2(CCItemHelpFragment cCItemHelpFragment) {
        this.a = cCItemHelpFragment;
    }

    public final void onChanged(Object object) {
        CCItemHelpFragment cCItemHelpFragment = this.a;
        object = (DataCallback)object;
        CCItemHelpFragment.Qa(cCItemHelpFragment, (DataCallback)object);
    }
}

