/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.functions.Function1;

public final class J03
implements Continuation,
bx0_2 {
    public final /* synthetic */ Object a;

    public /* synthetic */ J03(Object object) {
        this.a = object;
    }

    public Object apply(Object object) {
        return UserRepo.s((tz_0)((Function1)this.a), object);
    }

    public Object then(Task task2) {
        return SessionReportingCoordinator.b((SessionReportingCoordinator)this.a, task2);
    }
}

