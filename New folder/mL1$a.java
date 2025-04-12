/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.view.InputEvent
 */
import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class mL1$a
extends ml1_0 {
    public final kl1_0 a;

    public mL1$a(kL1$a kL1$a) {
        Intrinsics.checkNotNullParameter(kL1$a, "mMeasurementManager");
        this.a = kL1$a;
    }

    public ListenableFuture b() {
        c80 c802 = d.a(ir0_2.a);
        mL1$a$b mL1$a$b = new mL1$a$b(this, null);
        return w90.a(Ae3.a(c802, null, mL1$a$b, 3));
    }

    public ListenableFuture c(Uri uri, InputEvent inputEvent) {
        Intrinsics.checkNotNullParameter(uri, "attributionSource");
        c80 c802 = d.a(ir0_2.a);
        mL1$a$c mL1$a$c = new mL1$a$c(this, uri, inputEvent, null);
        return w90.a(Ae3.a(c802, null, mL1$a$c, 3));
    }

    public ListenableFuture d(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "trigger");
        c80 c802 = d.a(ir0_2.a);
        mL1$a$d mL1$a$d = new mL1$a$d(this, uri, null);
        return w90.a(Ae3.a(c802, null, mL1$a$d, 3));
    }

    public ListenableFuture e(Mo0 object) {
        Intrinsics.checkNotNullParameter(object, "deletionRequest");
        object = d.a(ir0_2.a);
        mL1$a$a mL1$a$a = new mL1$a$a(this, null);
        return w90.a(Ae3.a((i90_0)object, null, mL1$a$a, 3));
    }

    public ListenableFuture f(yf3_0 object) {
        Intrinsics.checkNotNullParameter(object, "request");
        object = d.a(ir0_2.a);
        mL1$a$e mL1$a$e = new mL1$a$e(this, null);
        return w90.a(Ae3.a((i90_0)object, null, mL1$a$e, 3));
    }

    public ListenableFuture g(zf3_1 object) {
        Intrinsics.checkNotNullParameter(object, "request");
        object = d.a(ir0_2.a);
        mL1$a$f mL1$a$f = new mL1$a$f(this, null);
        return w90.a(Ae3.a((i90_0)object, null, mL1$a$f, 3));
    }
}

