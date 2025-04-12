/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.Date;

public final class w40
implements Continuation {
    public final /* synthetic */ ConfigFetchHandler a;
    public final /* synthetic */ Date b;

    public /* synthetic */ w40(ConfigFetchHandler configFetchHandler, Date date) {
        this.a = configFetchHandler;
        this.b = date;
    }

    public final Object then(Task task2) {
        ConfigFetchHandler configFetchHandler = this.a;
        Date date = this.b;
        return ConfigFetchHandler.c(configFetchHandler, date, task2);
    }
}

