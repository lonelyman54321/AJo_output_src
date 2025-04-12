/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from ov2
 */
public final class ov2_1
implements s13_0 {
    public final /* synthetic */ nv2_2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Ref$ObjectRef c;

    public ov2_1(nv2_2 nv2_22, String string2, Ref$ObjectRef ref$ObjectRef) {
        this.a = nv2_22;
        this.b = string2;
        this.c = ref$ObjectRef;
    }

    public final void a() {
        this.a.dismissAllowingStateLoss();
    }

    public final void b(Uri uri) {
        Object object = yn3_0.a;
        Object[] objectArray = new Object[]{};
        Object object2 = "success image uri";
        ((yn3$a)object).a((String)object2, objectArray);
        object = this.a;
        objectArray = ((Fragment)object).getContext();
        if (objectArray != null) {
            objectArray = ((Fragment)object).getContext();
            object2 = this.c.element;
            CharSequence charSequence = new StringBuilder();
            String string2 = this.b;
            charSequence.append(string2);
            charSequence.append(object2);
            object2 = charSequence.toString();
            int n3 = R$string.pop_n_peek_share_subject;
            charSequence = ((Fragment)object).getString(n3);
            Intrinsics.checkNotNullExpressionValue(charSequence, "getString(...)");
            int n4 = R$string.share_product;
            string2 = hv3_0.K(n4);
            d23_0.f((Context)objectArray, (String)object2, (String)charSequence, uri, string2);
            ((DialogFragment)object).dismissAllowingStateLoss();
        }
    }
}

