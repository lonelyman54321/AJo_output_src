/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;
import com.ril.ajio.R$string;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;

/*
 * Renamed from n22
 */
public final class n22_0
implements s13_0 {
    public final /* synthetic */ NewProductDetailsFragment a;
    public final /* synthetic */ String b;

    public n22_0(NewProductDetailsFragment newProductDetailsFragment, String string2) {
        this.a = newProductDetailsFragment;
        this.b = string2;
    }

    public final void a() {
    }

    public final void b(Uri uri) {
        Object object = yn3_0.a;
        Object[] objectArray = new Object[]{};
        ((yn3$a)object).a("success image uri", objectArray);
        object = this.a;
        objectArray = ((Y51)object).getContext();
        String string2 = hv3_0.K(R$string.pop_n_peek_share_subject);
        String string3 = hv3_0.K(R$string.share_product);
        String string4 = this.b;
        d23_0.f((Context)objectArray, string4, string2, uri, string3);
        ((NewProductDetailsFragment)object).S = false;
    }
}

