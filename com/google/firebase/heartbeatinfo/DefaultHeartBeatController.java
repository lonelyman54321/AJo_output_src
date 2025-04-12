/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Base64OutputStream
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.HeartBeatConsumer;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.heartbeatinfo.HeartBeatInfo$HeartBeat;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.google.firebase.heartbeatinfo.HeartBeatResult;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public class DefaultHeartBeatController
implements HeartBeatController,
HeartBeatInfo {
    private final Context applicationContext;
    private final Executor backgroundExecutor;
    private final Set consumers;
    private final Provider storageProvider;
    private final Provider userAgentProvider;

    private DefaultHeartBeatController(Context context, String string2, Set set, Provider provider, Executor executor) {
        tl0_1 tl0_12 = new tl0_1(context, string2);
        this(tl0_12, set, executor, provider, context);
    }

    public DefaultHeartBeatController(Provider provider, Set set, Executor executor, Provider provider2, Context context) {
        this.storageProvider = provider;
        this.consumers = set;
        this.backgroundExecutor = executor;
        this.userAgentProvider = provider2;
        this.applicationContext = context;
    }

    public static /* synthetic */ String a(DefaultHeartBeatController defaultHeartBeatController) {
        return defaultHeartBeatController.lambda$getHeartBeatsHeader$1();
    }

    public static /* synthetic */ HeartBeatInfoStorage b(Context context, String string2) {
        return heartBeatInfoStorage = new HeartBeatInfoStorage(context, string2);
    }

    public static /* synthetic */ DefaultHeartBeatController c(Qualified qualified, ComponentContainer componentContainer) {
        return DefaultHeartBeatController.lambda$component$3(qualified, componentContainer);
    }

    public static Component component() {
        Qualified qualified = Qualified.qualified(Background.class, Executor.class);
        Object object = new Class[]{HeartBeatController.class, HeartBeatInfo.class};
        object = Component.builder(DefaultHeartBeatController.class, (Class[])object);
        Object object2 = Dependency.required(Context.class);
        object = ((Component$Builder)object).add((Dependency)object2);
        object2 = Dependency.required(FirebaseApp.class);
        object = ((Component$Builder)object).add((Dependency)object2);
        object2 = Dependency.setOf(HeartBeatConsumer.class);
        object = ((Component$Builder)object).add((Dependency)object2);
        object2 = Dependency.requiredProvider(UserAgentPublisher.class);
        object = ((Component$Builder)object).add((Dependency)object2);
        object2 = Dependency.required(qualified);
        object = ((Component$Builder)object).add((Dependency)object2);
        object2 = new vl0_1(qualified);
        return ((Component$Builder)object).factory((ComponentFactory)object2).build();
    }

    public static /* synthetic */ Void d(DefaultHeartBeatController defaultHeartBeatController) {
        return defaultHeartBeatController.lambda$registerHeartBeat$0();
    }

    private static /* synthetic */ DefaultHeartBeatController lambda$component$3(Qualified object, ComponentContainer componentContainer) {
        DefaultHeartBeatController defaultHeartBeatController;
        Object object2;
        Object object3 = object2 = componentContainer.get(Context.class);
        object3 = (Context)object2;
        String string2 = ((FirebaseApp)componentContainer.get(FirebaseApp.class)).getPersistenceKey();
        Set set = componentContainer.setOf(HeartBeatConsumer.class);
        Provider provider = componentContainer.getProvider(UserAgentPublisher.class);
        Object object4 = object = componentContainer.get((Qualified)object);
        object4 = (Executor)object;
        object2 = defaultHeartBeatController;
        defaultHeartBeatController = new DefaultHeartBeatController((Context)object3, string2, set, provider, (Executor)object4);
        return defaultHeartBeatController;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ String lambda$getHeartBeatsHeader$1() {
        synchronized (this) {
            Throwable throwable522222;
            Throwable throwable22222;
            Object object;
            int n3;
            Object object2;
            Object object3 = this.storageProvider;
            object3 = object3.get();
            object3 = (HeartBeatInfoStorage)object3;
            Object object4 = ((HeartBeatInfoStorage)object3).getAllHeartBeats();
            ((HeartBeatInfoStorage)object3).deleteAllHeartBeats();
            object3 = new JSONArray();
            String string2 = null;
            for (int n4 = 0; n4 < (n3 = object4.size()); object2 = ((HeartBeatResult)object2).getUsedDates(), ++n4) {
                object2 = object4.get(n4);
                object2 = (HeartBeatResult)object2;
                object = new JSONObject();
                String string3 = "agent";
                String string4 = ((HeartBeatResult)object2).getUserAgent();
                object.put(string3, (Object)string4);
                string3 = "dates";
                string4 = new JSONArray((Collection)object2);
                object.put(string3, (Object)string4);
                object3.put(object);
            }
            object4 = new JSONObject();
            string2 = "heartbeats";
            object4.put(string2, object3);
            object3 = "version";
            string2 = "2";
            object4.put((String)object3, (Object)string2);
            object3 = new ByteArrayOutputStream();
            n3 = 11;
            string2 = new Base64OutputStream((OutputStream)object3, n3);
            {
                catch (Throwable throwable22222) {}
            }
            object2 = new GZIPOutputStream((OutputStream)((Object)string2));
            object4 = object4.toString();
            object = "UTF-8";
            object4 = ((String)object4).getBytes((String)object);
            ((OutputStream)object2).write((byte[])object4);
            ((OutputStream)object2).close();
            string2.close();
            object4 = "UTF-8";
            return ((ByteArrayOutputStream)object3).toString((String)object4);
            catch (Throwable throwable3) {
                try {
                    ((OutputStream)object2).close();
                    throw throwable3;
                }
                catch (Throwable throwable4) {
                    try {
                        throwable3.addSuppressed(throwable4);
                        throw throwable3;
                    }
                    catch (Throwable throwable522222) {}
                }
            }
            try {
                string2.close();
                throw throwable522222;
            }
            catch (Throwable throwable6) {
                throwable522222.addSuppressed(throwable6);
                throw throwable522222;
            }
            throw throwable22222;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Void lambda$registerHeartBeat$0() {
        synchronized (this) {
            Object object = this.storageProvider;
            object = object.get();
            object = (HeartBeatInfoStorage)object;
            long l2 = System.currentTimeMillis();
            Object object2 = this.userAgentProvider;
            object2 = object2.get();
            object2 = (UserAgentPublisher)object2;
            object2 = object2.getUserAgent();
            ((HeartBeatInfoStorage)object).storeHeartBeat(l2, (String)object2);
            return null;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public HeartBeatInfo$HeartBeat getHeartBeatCode(String object) {
        synchronized (this) {
            try {
                long l2 = System.currentTimeMillis();
                object = this.storageProvider;
                object = object.get();
                object = (HeartBeatInfoStorage)object;
                boolean bl2 = ((HeartBeatInfoStorage)object).shouldSendGlobalHeartBeat(l2);
                if (!bl2) return HeartBeatInfo$HeartBeat.NONE;
                ((HeartBeatInfoStorage)object).postHeartBeatCleanUp();
                return HeartBeatInfo$HeartBeat.GLOBAL;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Task getHeartBeatsHeader() {
        Object object = this.applicationContext;
        boolean bl2 = Bx3.a(object) ^ true;
        if (bl2) {
            return Tasks.forResult("");
        }
        object = this.backgroundExecutor;
        ul0_0 ul0_02 = new ul0_0(this, 0);
        return Tasks.call((Executor)object, ul0_02);
    }

    public Task registerHeartBeat() {
        Object object = this.consumers;
        int n3 = object.size();
        wl0_2 wl0_22 = null;
        if (n3 <= 0) {
            return Tasks.forResult(null);
        }
        object = this.applicationContext;
        n3 = Bx3.a((Context)object) ^ 1;
        if (n3 != 0) {
            return Tasks.forResult(null);
        }
        object = this.backgroundExecutor;
        wl0_22 = new wl0_2(this, 0);
        return Tasks.call((Executor)object, wl0_22);
    }
}

