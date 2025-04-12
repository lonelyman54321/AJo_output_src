/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.SerialExecutorImpl;
import java.util.concurrent.Executor;
import kotlinx.coroutines.c;

/*
 * Renamed from qI3
 */
public final class qi3_1
implements Si3 {
    public final SerialExecutorImpl a;
    public final c b;
    public final Handler c;
    public final qI3$a d;

    public qi3_1(Executor object) {
        Object object2;
        Looper looper = Looper.getMainLooper();
        this.c = object2 = new Handler(looper);
        super(this);
        this.d = object2;
        super((Executor)object);
        this.a = object2;
        this.b = object = h83.a((Executor)object2);
    }

    public final qI3$a a() {
        return this.d;
    }

    public final c b() {
        return this.b;
    }

    public final SerialExecutorImpl c() {
        return this.a;
    }

    public final void d(Runnable runnable2) {
        this.a.execute(runnable2);
    }
}

