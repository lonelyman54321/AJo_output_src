/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 */
import android.os.Message;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment$c;
import kotlin.jvm.internal.Intrinsics;

public final class X12
implements F62 {
    public final /* synthetic */ NewProductDetailsFragment a;

    public /* synthetic */ X12(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "cartIdDetailsDataCallback");
        Object object3 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (bl2) {
            object3 = ((NewProductDetailsFragment)object2).cb();
            bl2 = ((e12_0)object3).k0;
            int n3 = ((DataCallback)object).getStatus();
            if (n3 == 0) {
                object = ((NewProductDetailsFragment)object2).cb().p0;
                object2 = ((NewProductDetailsFragment)object2).O1;
                ((NewProductDetailsFragment$c)((Object)object2)).handleMessage((Message)object);
            }
        }
    }
}

