/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from c23
 */
public final class c23_0
implements OnFailureListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ t13_0 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ c23_0(String string2, String string3, t13_0 t13_02, boolean bl2) {
        this.a = string2;
        this.b = string3;
        this.c = t13_02;
        this.d = bl2;
    }

    public final void onFailure(Exception object) {
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$shareUrl");
        t13_0 t13_02 = this.c;
        Intrinsics.checkNotNullParameter(t13_02, "$shareInterface");
        Intrinsics.checkNotNullParameter(object, "exception");
        yn3_0.a.e((Throwable)object);
        Object object2 = FirebaseCrashlytics.getInstance();
        String string3 = "HANDLED DYNAMIC LINK EXCEPTION";
        Exception exception = new Exception(string3, (Throwable)object);
        ((FirebaseCrashlytics)object2).recordException(exception);
        boolean bl2 = this.d;
        object2 = this.a;
        if (bl2) {
            object = "\n\n";
            string2 = n1.a((String)object2, (String)object, string2);
        }
        t13_02.V1(string2, (String)object2);
    }
}

