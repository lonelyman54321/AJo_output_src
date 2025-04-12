/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler$FetchResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from g7
 */
public final class g7_0
implements o60_0,
SuccessContinuation {
    public final /* synthetic */ Object a;

    public /* synthetic */ g7_0(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Task then(Object object) {
        ConfigFetchHandler$FetchResponse configFetchHandler$FetchResponse = (ConfigFetchHandler$FetchResponse)this.a;
        object = (ConfigContainer)object;
        return ConfigFetchHandler.b(configFetchHandler$FetchResponse, (ConfigContainer)object);
    }
}

