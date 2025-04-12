/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.widget.Toast
 */
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.lifecycle.l;
import com.chuckerteam.chucker.R$string;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zq3
 */
public final class zq3_0
implements w3 {
    public final /* synthetic */ aq3_0 a;

    public /* synthetic */ zq3_0(aq3_0 aq3_02) {
        this.a = aq3_02;
    }

    public final void a(Object object) {
        object = (Uri)object;
        aq3_0 aq3_02 = this.a;
        Intrinsics.checkNotNullParameter(aq3_02, "this$0");
        HttpTransaction httpTransaction = (HttpTransaction)((Hq3)aq3_02.a.getValue()).f.d();
        if (object != null && httpTransaction != null) {
            l l2 = nu1_0.a(aq3_02);
            dq3_0 dq3_02 = new dq3_0(aq3_02, (Uri)object, httpTransaction, null);
            int n3 = 3;
            Ae3.d(l2, null, null, dq3_02, n3);
        } else {
            object = aq3_02.requireContext();
            int n4 = R$string.chucker_save_failed_to_open_document;
            httpTransaction = null;
            object = Toast.makeText((Context)object, (int)n4, (int)0);
            object.show();
        }
    }
}

