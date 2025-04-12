/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from a23
 */
public final class a23_0
implements OnFailureListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ t13_0 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ a23_0(String string2, String string3, t13_0 t13_02) {
        this.a = string2;
        this.b = string3;
        this.c = t13_02;
        this.d = false;
    }

    public final void onFailure(Exception object) {
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$shareUrl");
        t13_0 t13_02 = this.c;
        Intrinsics.checkNotNullParameter(t13_02, "$shareInterface");
        Intrinsics.checkNotNullParameter(object, "exception");
        yn3_0.a.e((Throwable)object);
        boolean bl2 = this.d;
        String string3 = this.a;
        if (bl2) {
            object = "\n\n";
            string2 = n1.a(string3, (String)object, string2);
        }
        t13_02.V1(string2, string3);
    }
}

