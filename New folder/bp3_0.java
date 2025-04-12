/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.adservices.topics.GetTopicsRequest
 *  android.adservices.topics.TopicsManager
 *  android.os.OutcomeReceiver
 */
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

/*
 * Renamed from bp3
 */
public final class bp3_0 {
    public static /* bridge */ /* synthetic */ void a(TopicsManager topicsManager, GetTopicsRequest getTopicsRequest, jl1_0 jl1_02, OutcomeReceiver outcomeReceiver) {
        topicsManager.getTopics(getTopicsRequest, (Executor)jl1_02, outcomeReceiver);
    }
}

