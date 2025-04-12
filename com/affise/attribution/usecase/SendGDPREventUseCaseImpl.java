/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.usecase;

import com.affise.attribution.events.GDPREventRepository;
import com.affise.attribution.events.SerializedEvent;
import com.affise.attribution.events.predefined.GDPREvent;
import com.affise.attribution.executors.ExecutorServiceProvider;
import com.affise.attribution.network.CloudConfig;
import com.affise.attribution.network.CloudRepository;
import com.affise.attribution.parameters.factory.PostBackModelFactory;
import com.affise.attribution.usecase.EraseUserDataUseCaseImpl;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

public final class SendGDPREventUseCaseImpl {
    private final CloudRepository cloudRepository;
    private final EraseUserDataUseCaseImpl eraseUserDataUseCase;
    private final PostBackModelFactory postBackModelFactory;
    private final GDPREventRepository repository;
    private final ExecutorServiceProvider serviceProvider;

    public SendGDPREventUseCaseImpl(GDPREventRepository gDPREventRepository, ExecutorServiceProvider executorServiceProvider, CloudRepository cloudRepository2, PostBackModelFactory postBackModelFactory2, EraseUserDataUseCaseImpl eraseUserDataUseCaseImpl) {
        Intrinsics.checkNotNullParameter(gDPREventRepository, "repository");
        Intrinsics.checkNotNullParameter(executorServiceProvider, "serviceProvider");
        Intrinsics.checkNotNullParameter(cloudRepository2, "cloudRepository");
        Intrinsics.checkNotNullParameter(postBackModelFactory2, "postBackModelFactory");
        Intrinsics.checkNotNullParameter(eraseUserDataUseCaseImpl, "eraseUserDataUseCase");
        this.repository = gDPREventRepository;
        this.serviceProvider = executorServiceProvider;
        this.cloudRepository = cloudRepository2;
        this.postBackModelFactory = postBackModelFactory2;
        this.eraseUserDataUseCase = eraseUserDataUseCaseImpl;
    }

    public static /* synthetic */ void a(SendGDPREventUseCaseImpl sendGDPREventUseCaseImpl, String string2) {
        SendGDPREventUseCaseImpl.registerForgetMeEvent$lambda$2(sendGDPREventUseCaseImpl, string2);
    }

    public static /* synthetic */ void b(SendGDPREventUseCaseImpl sendGDPREventUseCaseImpl) {
        SendGDPREventUseCaseImpl.sendForgetMeEvent$lambda$4(sendGDPREventUseCaseImpl);
    }

    private static final void registerForgetMeEvent$lambda$2(SendGDPREventUseCaseImpl sendGDPREventUseCaseImpl, String object) {
        Intrinsics.checkNotNullParameter(sendGDPREventUseCaseImpl, "this$0");
        Intrinsics.checkNotNullParameter(object, "$userData");
        Object object2 = sendGDPREventUseCaseImpl.repository;
        Object object3 = tl2_2.b;
        object3 = new GDPREvent((String)object);
        try {
            ((GDPREventRepository)object2).setEvent((GDPREvent)object3);
            object = Unit.a;
        }
        catch (Throwable throwable) {
            object2 = tl2_2.b;
            object = vl2_2.a(throwable);
        }
        boolean bl2 = object instanceof tL2$b;
        if (bl2) {
            object = null;
        }
        if ((object = (Unit)object) != null) {
            sendGDPREventUseCaseImpl.sendForgetMeEvent();
        }
    }

    private static final void sendForgetMeEvent$lambda$4(SendGDPREventUseCaseImpl object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "this$0");
        SerializedEvent serializedEvent = ((SendGDPREventUseCaseImpl)object).repository.getEvent();
        if (serializedEvent == null) {
            return;
        }
        Iterator iterator = ((Iterable)CloudConfig.INSTANCE.getUrls()).iterator();
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            Object object2 = ((SendGDPREventUseCaseImpl)object).postBackModelFactory;
            Object object3 = a.b(serializedEvent);
            int n3 = 14;
            object2 = PostBackModelFactory.create$default((PostBackModelFactory)object2, (List)object3, null, null, null, n3, null);
            try {
                object3 = ((SendGDPREventUseCaseImpl)object).cloudRepository;
            }
            catch (Throwable throwable) {}
            object2 = a.b(object2);
            object3.send((List)object2, string2);
            bl3 = true;
        }
        if (bl3) {
            object = ((SendGDPREventUseCaseImpl)object).eraseUserDataUseCase;
            ((EraseUserDataUseCaseImpl)object).eraseUserData();
        }
    }

    public final void registerForgetMeEvent(String string2) {
        Intrinsics.checkNotNullParameter(string2, "userData");
        ExecutorService executorService = this.serviceProvider.provideExecutorService();
        hz2_0 hz2_02 = new hz2_0(this, string2);
        executorService.execute(hz2_02);
    }

    public final void sendForgetMeEvent() {
        ExecutorService executorService = this.serviceProvider.provideExecutorService();
        iz2_0 iz2_02 = new iz2_0(this);
        executorService.execute(iz2_02);
    }
}

