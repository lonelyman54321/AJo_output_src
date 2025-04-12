/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;

public final class B23$d
implements s13_0 {
    public final /* synthetic */ B23 a;
    public final /* synthetic */ String b;

    public B23$d(B23 b23, String string2) {
        this.a = b23;
        this.b = string2;
    }

    public final void a() {
        this.a.q.sendEmptyMessage(3827);
    }

    public final void b(Uri uri) {
        Object object = yn3_0.a;
        Object[] objectArray = new Object[]{};
        ((yn3$a)object).a("success image uri", objectArray);
        object = this.a;
        objectArray = ((Fragment)object).getContext();
        String string2 = this.b;
        String string3 = "Sharing from AJIO";
        d23_0.f((Context)objectArray, string2, string3, uri, string3);
        ((B23)object).q.sendEmptyMessage(3827);
    }
}

