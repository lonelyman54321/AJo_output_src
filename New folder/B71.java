/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i;
import com.chuckerteam.chucker.R$string;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

public final class B71
extends i {
    public final WeakReference j;

    public B71(Context context, FragmentManager weakReference) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(weakReference, "fragmentManager");
        super((FragmentManager)((Object)weakReference), 1);
        this.j = weakReference = new WeakReference<Context>(context);
    }

    public final int c() {
        return 2;
    }

    public final CharSequence e(int n3) {
        String string2;
        Context context = (Context)this.j.get();
        if (context == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = n3 == 0 ? R$string.chucker_tab_network : R$string.chucker_tab_errors;
            string2 = context.getString(n3);
        }
        return string2;
    }

    public final Fragment n(int n3) {
        Fragment fragment = n3 == 0 ? new rq3() : new nn3();
        return fragment;
    }
}

