/*
 * Decompiled with CFR 0.152.
 */
import androidx.concurrent.futures.AbstractResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;

public final class eK$a {
    public Object a;
    public eK$d b;
    public tk2_0 c;
    public boolean d;

    public eK$a() {
        tk2_0 tk2_02;
        this.c = tk2_02;
    }

    public final void a(Object object) {
        boolean bl2;
        boolean bl3;
        this.d = bl3 = true;
        ListenableFuture listenableFuture = this.b;
        if (listenableFuture != null && (bl2 = ((AbstractResolvableFuture)(listenableFuture = ((eK$d)listenableFuture).b)).set(object))) {
            bl2 = false;
            object = null;
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final void b(Throwable throwable) {
        boolean bl2;
        boolean bl3;
        this.d = bl3 = true;
        ListenableFuture listenableFuture = this.b;
        if (listenableFuture != null && (bl2 = ((AbstractResolvableFuture)(listenableFuture = ((eK$d)listenableFuture).b)).setException(throwable))) {
            bl2 = false;
            throwable = null;
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final void finalize() {
        boolean bl2;
        eK$b eK$b;
        boolean bl3;
        ListenableFuture listenableFuture = this.b;
        if (listenableFuture != null && !(bl3 = ((AbstractResolvableFuture)(listenableFuture = ((eK$d)listenableFuture).b)).isDone())) {
            CharSequence charSequence = new StringBuilder("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            Object object = this.a;
            charSequence.append(object);
            charSequence = charSequence.toString();
            eK$b = new Throwable((String)charSequence);
            ((AbstractResolvableFuture)listenableFuture).setException(eK$b);
        }
        if (!(bl2 = this.d) && (listenableFuture = this.c) != null) {
            bl3 = false;
            eK$b = null;
            ((AbstractResolvableFuture)listenableFuture).set(null);
        }
    }
}

