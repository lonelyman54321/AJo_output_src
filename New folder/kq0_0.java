/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Parcelable
 */
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kQ0
 */
public final class kq0_0
implements s13_0 {
    public final /* synthetic */ fq0_2 a;
    public final /* synthetic */ String b;

    public kq0_0(fq0_2 fq0_22, String string2) {
        this.a = fq0_22;
        this.b = string2;
    }

    public final void a() {
    }

    public final void b(Uri object) {
        int n3;
        fq0_2 fq0_22 = this.a;
        FragmentActivity fragmentActivity = fq0_22.getActivity();
        int n4 = R$string.pop_n_peek_share_subject;
        String string2 = hv3_0.K(n4);
        int n7 = R$string.share_product;
        String string3 = hv3_0.K(n7);
        String string4 = this.b;
        Intrinsics.checkNotNullParameter(string4, "shareMsg");
        Intrinsics.checkNotNullParameter(string2, "shareSubject");
        String string5 = "header";
        Intrinsics.checkNotNullParameter(string3, string5);
        if (fragmentActivity != null) {
            string5 = new Intent();
            string5.setAction("android.intent.action.SEND");
            String string6 = "android.intent.extra.TEXT";
            string5.putExtra(string6, string4);
            string4 = "android.intent.extra.SUBJECT";
            string5.putExtra(string4, string2);
            if (object != null) {
                string2 = "android.intent.extra.STREAM";
                string5.putExtra(string2, (Parcelable)object);
                n3 = 1;
                string5.addFlags(n3);
                object = "image/*";
                string5.setType((String)object);
            } else {
                object = "text/plain";
                string5.setType((String)object);
            }
            object = Intent.createChooser((Intent)string5, (CharSequence)string3);
            n4 = 1818;
            fragmentActivity.startActivityForResult((Intent)object, n4);
        }
        object = fq0_22.q;
        fq0_22 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fleekViewModel");
            n3 = 0;
            object = null;
        }
        object.p.k(null);
        object.q = null;
    }
}

