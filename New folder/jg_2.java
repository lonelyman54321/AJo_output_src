/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.selectorder.CCSelectOrderFragment;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from JG
 */
public final class jg_2
implements Function1 {
    public final /* synthetic */ CCSelectOrderFragment a;

    public /* synthetic */ jg_2(CCSelectOrderFragment cCSelectOrderFragment) {
        this.a = cCSelectOrderFragment;
    }

    public final Object invoke(Object object) {
        CCSelectOrderFragment cCSelectOrderFragment = this.a;
        object = (DataCallback)object;
        return CCSelectOrderFragment.Pa(cCSelectOrderFragment, (DataCallback)object);
    }
}

