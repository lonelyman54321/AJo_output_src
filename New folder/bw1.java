/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.LocalDataStore;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

public final class bw1
implements Function1 {
    public final /* synthetic */ LocalDataStore a;

    public /* synthetic */ bw1(LocalDataStore localDataStore) {
        this.a = localDataStore;
    }

    public final Object invoke(Object object) {
        object = (String)object;
        String string2 = this.a.c((String)object);
        Pair pair = new Pair(object, string2);
        return pair;
    }
}

