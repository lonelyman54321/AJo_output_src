/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.ondemand.customercare.view.dialog.CCContactUsDialog;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from iG
 */
public final class ig_2
implements Function1 {
    public final /* synthetic */ CCContactUsDialog a;

    public /* synthetic */ ig_2(CCContactUsDialog cCContactUsDialog) {
        this.a = cCContactUsDialog;
    }

    public final Object invoke(Object object) {
        CCContactUsDialog cCContactUsDialog = this.a;
        object = (DataCallback)object;
        return CCContactUsDialog.Oa(cCContactUsDialog, (DataCallback)object);
    }
}

