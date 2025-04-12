/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.Date;
import java.util.Map;

public final class v40
implements Continuation {
    public final /* synthetic */ ConfigFetchHandler a;
    public final /* synthetic */ Task b;
    public final /* synthetic */ Task c;
    public final /* synthetic */ Date d;
    public final /* synthetic */ Map e;

    public /* synthetic */ v40(ConfigFetchHandler configFetchHandler, Task task2, Task task3, Date date, Map map2) {
        this.a = configFetchHandler;
        this.b = task2;
        this.c = task3;
        this.d = date;
        this.e = map2;
    }

    public final Object then(Task task2) {
        Date date = this.d;
        Map map2 = this.e;
        ConfigFetchHandler configFetchHandler = this.a;
        Task task3 = this.b;
        Task task4 = this.c;
        return ConfigFetchHandler.a(configFetchHandler, task3, task4, date, map2, task2);
    }
}

